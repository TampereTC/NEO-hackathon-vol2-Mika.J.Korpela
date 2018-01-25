/* http server variables. */
var express = require('express');
var app = express();
var path = require('path');
var host = "0.0.0.0";
var port = "8081";

/* configure. */
app.all('*', function(req, res, next)
{
     var origin = req.get('origin'); 
     res.header("Access-Control-Allow-Origin", origin);
     res.header("Access-Control-Allow-Headers", "X-Requested-With");
     res.header("Access-Control-Allow-Headers", "Content-Type");
     res.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
     next();
});

/*
 * Get.
 * 
 * @param req
 * @param res
 */
app.get('/',function(req, res)
{
    // return hello world.
    res.writeHead(200);
    res.end("Hello World!");   
});

/* start server. */
var server = app.listen(port, host, function ()
{
    console.log('%s: Node server started on %s:%d ...', Date(Date.now() ), host, port);
});