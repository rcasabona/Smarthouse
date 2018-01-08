var express = require('express');
var consign = require('consign');

module.exports = function(){
  var app = express();

  // set the view engine to ejs
  app.set('view engine', 'ejs');

  consign()
   .include('controllers')
   .into(app);

  return app;
}
