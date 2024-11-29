package com.ecommerce.productservicenovember2024.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// This class will now be hosting a set of HTTP API's
//Get Request, Put Request, delete, Post
@RestController
@RequestMapping("/say") // productController -> /product
public class SampleController {
    // localhost:8080/say/hello
    @GetMapping("/hello/{name}/{time}")
    public String SayHello(@PathVariable("name") String name,
                           @PathVariable("time") int count){
        return "Hello World " + name + count ;
    }
    // localhost:8080/say/bye

    @GetMapping("/bye")
    public String SayBy(){
        return "Bye Everyone";
    }
    @GetMapping("/multipl/{name}/{times}")
    public String multipal(@PathVariable("name") String name,
                           @PathVariable("times") int count){
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < count; i++){

        output.append("Hello " + name);}
    return output.toString() ;

}

}
/*
localhost -> 127.0.0.1
port number as a entry where someone is listening for your request.
http://localhost:2345/say/hello

* www.scaler.com/instructor/meeting/i/rest-api-https-27/
* india/ banglore/ tech-pack/ scaler/door-33

* The domain name map  to same ip address : 123.12.13.122
* */