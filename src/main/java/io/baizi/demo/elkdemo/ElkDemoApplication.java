package io.baizi.demo.elkdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class ElkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                log.debug("debug-启动完成");
                log.info("info-启动完成");
                log.warn("warn-启动完成");
                log.error("error-启动完成");
            }
        };
    }


}
