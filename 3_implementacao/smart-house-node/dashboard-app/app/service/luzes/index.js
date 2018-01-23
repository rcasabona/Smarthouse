var http = require('http');

module.exports = {
    // responsável em apagar e acender as luzes
    acenderApagar: (req, res) => {
        // configurações da requisição
        var configuracoes = {
            hostname: 'localhost',
            port: 3000,
            path: '/produtos/json',
            headers: {
                'Accept': 'application/json'
            }
        };

        http.get(configuracoes, function (res) {
            console.log(res.statusCode);
            res.on('data', function (body) {
                console.log('Corpo: ' + body);
            });
        });
    },

    statusDaLuz: (req, res) => {
    }

}