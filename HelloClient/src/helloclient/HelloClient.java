package helloclient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * HelloClient.
 * 
 * @author mjukorpe
 */
public class HelloClient {

    /**
     * Main.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        // variables.
        String endPointAddress;
        long iterations;
        Double before;
        Double after;
        Double delta;
        Double milliSecondPerRequest;
        
        // get comnd line arguments.
        endPointAddress = args[0];
        iterations = Long.valueOf(args[1]);
        
        // get timestamp before.
        before = Double.valueOf(System.currentTimeMillis());

        // execute required number of iterations.
        for (int i = 0; i < iterations; i++)
        {
            //System.out.println("Request: " + i + "/" + iterations);
            sendRequest(endPointAddress);
        }
        
        // get timestamp after.
        after = Double.valueOf(System.currentTimeMillis());
        
        // caluculate delta.
        delta = after- before;
        
        // calculate time per request; in milli seconds.
        milliSecondPerRequest = delta/iterations;
        
        Double oneThousand = Double.valueOf(1000);
        Double requestPerSecond = 1000/milliSecondPerRequest;

        System.out.println("delta (ms): " + delta);
        System.out.println("ms/request: " + milliSecondPerRequest);
        System.out.println("request/s: " + requestPerSecond);
    }
    
    public static void sendRequest(String endPointAddress) throws Exception
    {
        // variables.
        URL helloServiceUrl;
        URLConnection helloServiceConnection;
        BufferedReader response;
        String line;
        
        // set url.
        helloServiceUrl = new URL(endPointAddress);
        
        // open connection.
        helloServiceConnection = helloServiceUrl.openConnection();
        
        // get response.
        response = new BufferedReader(new InputStreamReader(helloServiceConnection.getInputStream()));

        // RESPONSE IS NOT PROCESSED IN THIS TEST.
        
        // close response.
        response.close();
    }
}
