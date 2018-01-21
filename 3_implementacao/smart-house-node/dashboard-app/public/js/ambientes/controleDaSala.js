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

$(document).ready(function(){
    $('.controle-btn').click(function () {
      var porta = $(this).attr("data-porta");
      ligaDesliga(porta);
    });    
  });