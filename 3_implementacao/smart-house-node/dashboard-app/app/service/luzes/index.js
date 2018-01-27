var http = require('http');

var configuracoes = {
    hostname: 'localhost',
    port:9090,
    path:'/controle-de-luzes/luzes',
    headers: {
        'Accept':'application/json'
    }
}

http.get(configuracoes, function(res){
    res.on('data', function(body){
        console.log('Corpo: ' + body);
    });
});