package com.jzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jianzhiqiang
 * @date 2021/2/25 22:32
 */
@SpringBootApplication(scanBasePackages = "com.jzq")
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
