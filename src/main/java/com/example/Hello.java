package com.example;

import io.vertx.core.Vertx;

import java.util.Arrays;

public class Hello {

    // Convenience method so you can run it in your IDE
    public static void main(String[] args) {
        Vertx.vertx().createHttpServer().requestHandler(req -> {
              req.response().end(html.simple.render("Zella", Arrays.asList("One", "Two", "Three")).body());
          }
        ).listen(8080);
        System.out.println("Running http server on 8080...");
    }


}