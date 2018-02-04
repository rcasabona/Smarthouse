const winston = require('winston')
const { requiresLogin, requiresAdmin } = require('./middlewares/authorization')
const admin = require('../app/service/admin')
const users = require('../app/service/users')
const monitoring = require('../app/service/monitoring')
const luzes = require('../app/service/luzes')
const ambientes = require('../app/service/ambientes')
const setLuzes = require('../app/service/setluzes')

module.exports = (app, passport, db) => {
	app.post('/api/login', passport.authenticate('local'), users.login)
	app.get('/api/logout', users.logout)
	app.get('/api/ping', requiresLogin, users.ping)

	app.get('/admin/login', admin.renderLogin)
	app.post('/admin/login', passport.authenticate('local', { failureRedirect: '/admin/login' }), admin.login)
	app.get('/admin/panel', requiresAdmin, admin.renderPanel)
	// Ambientes
	app.get('/admin/ambientes', requiresAdmin, ambientes.renderAmbientes)
	app.get('/admin/ambientes/ambiente/:idAmbiente', requiresAdmin, ambientes.renderAmbiente)
	app.get('/admin/setluzes', requiresAdmin, setLuzes.renderSetLuzes)
	// Reports
	app.get('/admin/reports', requiresAdmin, admin.renderReports)

	// Luzes
	app.get('/luz/acenderApagar', requiresAdmin, luzes.acenderApagar);
	// app.get('/luzes/', requiresAdmin, luzes.listarLuzes);


	app.get('/health', monitoring.health(db))

	app.use(function (err, req, res, next) {
		if (err.message && (~err.message.indexOf('not found'))) {
			return next()
		}

		winston.error(err.stack)

		return res.status(500).json({error: 'Error on backend occurred.'})
	})

	app.use(function (req, res) {
		const payload = {
			url: req.originalUrl,
			error: 'Not found'
		}
		if (req.accepts('json')) return res.status(404).json(payload)

		res.status(404).render('404', payload)
	})
}

