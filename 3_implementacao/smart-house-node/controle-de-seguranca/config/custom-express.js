var express = require('express');
var consign = require('consign');
var bodyParser = require('body-parser');

module.exports = function(){
  var app = express();

  // configura o body-parser no app
  app.use(bodyParser.json());

  // set the view engine to ejs
  app.set('view engine', 'ejs');
  app.set('views', './app/views');

  consign()
   .include('./app/controllers')
  //  .then('./app/persistencia')
   .into(app);

  return app;
}
