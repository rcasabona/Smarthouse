var http = require('http');

module.exports = {
    renderAmbientes: (req, res) => {
        // configurações da requisição
        var configuracoes = {
            hostname: 'localhost',
            port: 9090,
            path: '/controle-de-luzes/ambientes/',
            headers: {
                'Accept': 'application/json',
                'Content-type': 'application/json'
            }
        };

        http.get(configuracoes, function (restRes) {
            var output = '';

            restRes.on('data', function (chunk) {
                output += chunk;
            });

            restRes.on('end', function () {
                var json_body = JSON.parse(output);
                res.render('ambientes', {
                    ambientes: json_body
                });
            });
        });
    },
    
    renderAmbiente: (req, res) => {
        var idAmbiente = req.params.idAmbiente;

        // configurações da requisição do Ambiente
        // var configuracoes = {
        //     hostname: 'localhost',
        //     port: 9090,
        //     path: '/controle-de-luzes/ambientes/' + idAmbiente + '/',
        //     headers: {
        //         'Accept': 'application/json',
        //         'Content-type': 'application/json'
        //     }
        // };

        // configurações da requisição dos Sub-Ambientes

        var configuracoes = {
            hostname: 'localhost',
            port: 9090,
            path: '/controle-de-luzes/ambientes/' + idAmbiente + '/',
            headers: {
                'Accept': 'application/json',
                'Content-type': 'application/json'
            }
        };

        http.get(configuracoes, function (restRes) {
            var output = '';

            restRes.on('data', function (chunk) {
                output += chunk;
            });

            restRes.on('end', function () {
                var json_body = JSON.parse(output);
                res.render('ambiente', {
                    ambiente: json_body
                });
            });
        });

    },
}