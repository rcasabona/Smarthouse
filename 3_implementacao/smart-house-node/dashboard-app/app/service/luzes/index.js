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
                'Accept': 'application/json',
                'Content-type': 'application/json'
            }
        };

        var client = http.get(configuracoes, function (res) {
            console.log(res.statusCode);
            res.on('data', function (body) {
                console.log('Corpo: ' + body);
            });
        });

        var retorno = {
            status: 200,
            retorno: "DESLIGAR"
        }

        // client.end(JSON.stringify(retorno));
        // res.render();
        res.send(retorno);
    },

    listarLuzes: (req, res) => {
        // configurações da requisição
        var AMBIENTE = 1;
        var configuracoes = {
            hostname: 'localhost',
            port: 9090,
            path: '/controle-de-luzes/luzes/' + AMBIENTE + '/',
            headers: {
                'Accept': 'application/json',
                'Content-type': 'application/json'
            }
        };

        var client = http.get(configuracoes, function (restRes) {
            var output = '';


            // // console.log(res.statusCode);
            // res.on('data', function (body) {
            //     // retorno = body;
            //     console.log('Corpo: ' + body);
            //     console.log('Corpo: ' + body[0]);
            //     // retorno == body
            // });


            //the following lines send the response 
            res.render('home', { "title": "Test" }); // This code works. 

            restRes.on('data', function (jsonResult) {
                //you have already send the response above, hence the error
                res.render('home', { "title": "Test" }); // This code (after removing the line above) does not work.
                console.log('BODY: ' + jsonResult);
            });




            restRes.on('data', function (chunk) {
                output += chunk;
            });

    
            restRes.on('end', function() {
                var json_body = JSON.parse(output);
                console.log(json_body);
                res.render('home', { "title": "Test" }); // This code (after removing the line above) does not work.
                // onResult(res.statusCode, obj);
            });
        });

        client.end(JSON.stringify(retorno));

        // res.send(json_body);

        // var retorno = {
        //     status: 200,
        //     retorno: "DESLIGAR"
        // }

        // // client.end(JSON.stringify(retorno));
        // // res.render();
        // res.send(retorno);
        
    },

    statusDaLuz: (req, res) => {
    }

}