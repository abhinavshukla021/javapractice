package com.httplclienthandson;


import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class App {

    public static void main(String args[]) throws IOException, InterruptedException, ExecutionException
    {



        /*
        HttpClient httpClient = HttpClient.newHttpClient();
        // HttpClient httpClient1 = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).followRedirects(HttpClient.Redirect.NORMAL).build();
        HttpRequest httpRequest1 = HttpRequest.newBuilder(URI.create("http://httpstat.us/500?sleep=10000")).GET().build();
        HttpRequest httpRequest2 = HttpRequest.newBuilder(URI.create("http://httpstat.us/500?sleep=20000")).GET().build();
        */

        /* A simple Sync call Blocking code Will take 30 sec to complete
        HttpResponse<String> httpResponse1 = httpClient.send(httpRequest1, HttpResponse.BodyHandlers.ofString());
        System.out.println("Now completed Sync Call1");
        System.out.println(httpResponse1);
        System.out.println("Beginning Sync Call2");
        HttpResponse<String> httpResponse2 = httpClient.send(httpRequest2, HttpResponse.BodyHandlers.ofString());
        System.out.println("Now completed Sync Call1");
        System.out.println(httpResponse2);
        // HttpResponse<Void> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.discarding());
        */

        /*
        CompletableFuture<HttpResponse<String>> completableFuture1 = httpClient.sendAsync(httpRequest1, HttpResponse.BodyHandlers.ofString());
        System.out.println("Sync call 1 is running");
        CompletableFuture<HttpResponse<Void>> completableFuture2 = httpClient.sendAsync(httpRequest2, HttpResponse.BodyHandlers.discarding());
        System.out.println("Sync call 2 is running");

        // A simple async call Will take 20 sec to complete
        // System.out.println(completableFuture1.get());
        // System.out.println(completableFuture2.get());

        System.out.println(completableFuture1.thenApply(HttpResponse::body).get());
        System.out.println(completableFuture2.thenApply(HttpResponse::headers).get());

        */

        /* Using Cookies

        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("http://www.google.com")).GET().build();
        CookieManager cookieManager = new CookieManager(null, CookiePolicy.ACCEPT_ALL);
        HttpClient httpClient = HttpClient.newBuilder().cookieHandler(cookieManager).build();
        httpClient.send(httpRequest, HttpResponse.BodyHandlers.discarding());
        System.out.println(cookieManager.getCookieStore().getCookies());

        */



    }

}
