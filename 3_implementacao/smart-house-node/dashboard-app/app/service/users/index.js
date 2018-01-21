module.exports = {
	login: (req, res) => {
		const { user } = req

		res.json(user)
	},

	logout: (req, res, next) => {
		req.session.destroy((err) => {
			if(err) return next(err)

			req.logout()

			res.redirect('/admin/login')
			// res.sendStatus(200)
		})
	},

	ping: function(req, res) {
		res.sendStatus(200)
	}
}

