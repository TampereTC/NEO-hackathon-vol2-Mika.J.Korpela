package com.nokia.hackathon;

import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

/**
 * JavaSeHello.
 * 
 * @author mjukorpe
 */
public class JavaSeHello
{
    /**
     * Main
     * 
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException
    {
        // initialize http server.
        HttpServer server = HttpServer.create(new InetSocketAddress(8083), 0);
        
        // create context.
        server.createContext("/", new Handler());
        
        // start http server.
        server.start();
    }
}