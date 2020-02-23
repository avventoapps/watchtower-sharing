package org.avventoapps.watchtower.sharing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WatchtowerSharingApplication {

  public static void main(String[] args) {
    SpringApplication.run(WatchtowerSharingApplication.class, args);
  }

}