module.exports = function(app){
    app.get('/cameras', function(req, res){
        var camera = new Object();
        camera.nome =  "camera";
        camera.descricao = "camera de seguranca";

        res.send(camera);
    });
}