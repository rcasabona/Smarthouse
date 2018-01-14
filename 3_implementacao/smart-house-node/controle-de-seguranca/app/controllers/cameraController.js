module.exports = function(app){
    app.get('/cameras', function(req, res){
        var camera = new Object();
        camera.nome =  "camera";
        camera.descricao = "camera de seguranca";

        /* TESTE */
        var pool = app.persistencia.pool;
        var cameraDAO = new app.persistencia.CameraDAO(pool);
        
        cameraDAO.salva(camera, function(exception, result) {
            console.log('persistido:' + result);
        });
        



        res.send(camera);
    });

    app.post('/cameras/camera', function(req, res) {
        var pool = app.persistencia.pool;
        var cameraDAO = new app.persistencia.CameraDAO(pool);
        
        cameraDAO.salva(camera, function(exception, result) {
            console.log('persistido:' + result);
        });

        /*
        var connection = app.persistencia.connectionFactory();
        var pagamentoDao = new app.persistencia.PagamentoDao(connection);
    
        pagamento.status = "CRIADO";
        pagamento.data = new Date;
    
        pagamentoDao.salva(pagamento, function(exception, result){
          console.log('pagamento criado: ' + result);
          res.json(pagamento);
        });
        */


    });
}