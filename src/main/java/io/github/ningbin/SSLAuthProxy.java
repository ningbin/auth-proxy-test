package io.github.ningbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by ningbin on 2021/08/08.
 */
@EnableZuulProxy
@SpringBootApplication
public class SSLAuthProxy {

    public static void main(String[] args) {
        SpringApplication.run(SSLAuthProxy.class, args);
    }
}
