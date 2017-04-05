package com.angie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.angie.datasource.DynamicDataSourceRegister;

@SpringBootApplication
@MapperScan("com.angie.*")
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class DynamicDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicDataSourceApplication.class, args);
	}
}
