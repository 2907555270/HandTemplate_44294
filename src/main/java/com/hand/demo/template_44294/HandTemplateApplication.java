package com.hand.demo.template_44294;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.hand.demo.template_44294")
@MapperScan(basePackages = "com.hand.demo.template_44294.infra.mapper")
public class HandTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(HandTemplateApplication.class, args);
    }
}
