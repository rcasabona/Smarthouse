var http = require('http');

module.exports = {
    // responsável em apagar e acender as luzes
    acenderApagar: (req, res) => {
        // configurações da requisição
        var configuracoes = {
            hostname: 'localhost',
            port: 9090,
            path: '/controle-de-luzes/luzes/',
            headers: {
                'Accept': 'application/json'
            }
        };

        var client = http.get(configuracoes, function(res) {
            console.log(res.statusCode);
            res.on('data', function(body) {
                console.log('Corpo: ' + body);
            });
        });

        var retorno = {
            status : 200,
            retorno : "DESLIGAR"
        }

        client.end(JSON.stringify(retorno));
    },

    statusDaLuz: (req, res) => {
    }

}