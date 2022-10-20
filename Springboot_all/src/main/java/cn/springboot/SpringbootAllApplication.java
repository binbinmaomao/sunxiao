package cn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAllApplication {

	public static void main(String[] args) {
		/*
		 * `第一节课 springApplication 自定义
		 * 把SpringApplication进行实例化 SpringApplication app = new SpringApplication(SpringbootAllApplication.class)
		 * 可以调用SpringApplication中的好多方法，比如监听器等等
		 * 
		 */
		SpringApplication app = new SpringApplication(SpringbootAllApplication.class);
		app.run(args);
		//SpringApplication.run(SpringbootAllApplication.class, args);
	}

}
