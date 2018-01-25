/*
 * controleDaSala.js
 *
 */

"use strict";

/*
 * liga e desliga a porta
 * 
 */
function ligaDesliga(porta) {
  console.log("liga / desliga: lustre da sala de estar, porta: " + porta);
}

function retornaHttpJson() {
  var urlApiJson = "http://localhost:9090/controle-de-luzes/luzes/";
  $.getJSON(urlApiJson, function (json) {
    console.log(json);
    // console.log("JSON Data: " + json.users[0].name);
  });
}

$(document).ready(function () {
  $('.controle-btn').click(function () {
    var porta = $(this).attr("data-porta");
    ligaDesliga(porta);
  });
});