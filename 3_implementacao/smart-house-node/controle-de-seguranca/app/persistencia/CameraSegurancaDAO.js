/*
const express = require('express');
const router = express.Router();
const format = require('pg-format');
const pool = require('../path/to/database.js');

router.get(function(req, res, next) {
  pool.connect(function (err, client, done) {
    if (err) throw new Error(err);
    var ageQuery = format('SELECT * from push_table WHERE seq_id = 1')
    myClient.query(ageQuery, function (err, result) {
      if (err) throw new Error(err);
      res.json(result.rows[0]); 
    })
  }); 
});

module.exports = router;
*/

function CameraSegurancaDAO(pool) {
    this._pool = pool;
}

CameraSegurancaDAO.prototype.salva = function(pagamento,callback) {
    this._pool.query('INSERT INTO camera SET ?', pagamento, callback);
}

CameraSegurancaDAO.prototype.buscaPorId = function (id,callback) {
    this._pool.query("select * from pagamentos where id = ?",[id],callback);
}

module.exports = function(){
    return CameraSegurancaDAO;
};