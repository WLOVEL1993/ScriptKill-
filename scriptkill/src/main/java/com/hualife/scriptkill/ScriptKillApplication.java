package com.hualife.scriptkill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hualife.scriptkill.mapper")
public class ScriptKillApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScriptKillApplication.class, args);
    }

}
