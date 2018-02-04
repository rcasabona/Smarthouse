var http = require('http');

module.exports = {
    renderSetLuzes: (req, res) => {
        // configurações da requisição
        var configuracoes = {
            hostname: 'localhost',
            port: 9090,
            path: '/controle-de-luzes/setLuzes/',
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
                res.render('setluzes', {
                    setLuzes: json_body
                });
            });
        });
    },
}