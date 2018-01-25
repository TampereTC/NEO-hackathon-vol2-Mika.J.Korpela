package com.nokia.hackathon;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Handler.
 * 
 * @author mjukorpe
 */
public class Handler implements HttpHandler
{
    @Override
    public void handle(HttpExchange httpExchange) throws IOException
    {
        // variables.
        String response = "Hello World! - java-se-hello";
        
        // initialize response header.
        httpExchange.sendResponseHeaders(200, response.length());
        
        // get response body.
        OutputStream responseBody = httpExchange.getResponseBody();
        
        // write response to response body.
        responseBody.write(response.getBytes());
        
        // cose respons body.
        responseBody.close();
    }
}