package com.example;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HttpClient.get("https://elianrenteria.me/api/wordle");
    }
}
