/*
var pg = require('pg');
var PGUSER = 'postgres';
var PGPASS = 'mapua549';
var PGDATABASE = 'controleDeSeguranca';
var config = {
  user: PGUSER, // name of the user account
  password: PGPASS, // password
  database: PGDATABASE, // name of the database
  max: 10, // max number of clients in the pool
  idleTimeoutMillis: 30000
}

var pool = new pg.Pool(config);

module.exports = function(){
  return pool;
};
*/


const pg = require('pg')
const config = require('../config')

const dbConfig = {
	user: 'postgres',
	password: 'mapua549',
	database: 'controleDeSeguranca',
	host: 'localhost',
	port: 5432,
	max: 50,
	idleTimeoutMillis: 30000,
}

const pool = new pg.Pool(dbConfig)
// pool.on('error', function (err) {
// 	winston.error('idle client error', err.message, err.stack)
// })

module.exports = {
	pool,
	query: (text, params, callback) => {
		return pool.query(text, params, callback)
	}
}