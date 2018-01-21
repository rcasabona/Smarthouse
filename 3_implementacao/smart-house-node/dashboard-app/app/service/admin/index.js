module.exports = {
	renderLogin: (req, res) => {
		res.render('login')
	},

	login: (req, res) => {
		if(req.user.type === 'admin') {
			res.redirect('/admin/panel')
		} else {
			res.redirect('/admin/login')
		}
	},

	renderPanel: (req, res) => {
		res.render('admin-panel')
	},

	renderAmbiente: (req, res) => {
		res.render('ambientes')
	},

	renderReports: (req, res) => {
		res.render('reports')
	},

	renderAmbienteControleSala: (req, res) => {
		res.render('controle-sala')
	}
}
