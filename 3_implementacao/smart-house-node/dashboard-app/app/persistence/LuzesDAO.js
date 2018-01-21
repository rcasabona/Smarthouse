function LuzesDAO(db) {
    this._db = db;
}

LuzesDAO.prototype.estadoPorPorta = function (id,cb) {
    _db.query('SELECT estado FROM luz WHERE porta = $1', [parseInt(id, 10)], (err, results) => {
        if(err) {
            winston.error('Error when selecting user on session deserialize', err)
            return cb(err)
        }

        cb(null, results.rows[0])
    })
}

LuzesDAO.prototype.listGrupos = function (idAmbiente,cb) {
    _db.query('SELECT nome FROM ambiente WHERE id = $1', [parseInt(idAmbiente, 10)], (err, results) => {
        if(err) {
            winston.error('Error when selecting user on session deserialize', err)
            return cb(err)
        }

        cb(null, results.rows[0])
    })
}

LuzesDAO.prototype.listLuzes = function (idAmbiente,cb) {
    _db.query('SELECT * FROM luz WHERE id = $1', [parseInt(id, 10)], (err, results) => {
        if(err) {
            winston.error('Error when selecting user on session deserialize', err)
            return cb(err)
        }

        cb(null, results.rows[0])
    })
}