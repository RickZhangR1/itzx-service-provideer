package com.irzx.itzxserviceprovideer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 张祥
 */
@SpringBootApplication
//mapper接口的包扫描
@MapperScan("com.irzx.service.mapper")
public class ItzxServiceProvideerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItzxServiceProvideerApplication.class, args);
    }

}
