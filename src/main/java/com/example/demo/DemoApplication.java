package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        GameRunner runner = context.getBean(GameRunner.class);
        GamingConsole game = new PacmanGame();
        runner.playGame();
    }

    @GetMapping
    public String health() {
        return "Application is Up !!!";
    }

    @GetMapping("health")
    public String objectList() {
        return "Application is Up !!!";
    }

    @RequestMapping("check")
    public String checkWebClient(){
        WebClient webClient = WebClient.create();
        String apiUrl = "https://www.javatpoint.com/";
      String result =  webClient.get()
                .uri(apiUrl)
                .retrieve()
                .bodyToMono(String.class).toString();
        System.out.println(result);
      return result;

    }


}
