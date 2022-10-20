package cn.springboot;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("app.properties")
public class SpringbootAllApplication {

	public static void main(String[] args) throws Exception {
		/*
		 * `第一节课 springApplication 自定义
		 * 把SpringApplication进行实例化 SpringApplication app = new SpringApplication(SpringbootAllApplication.class)
		 * 可以调用SpringApplication中的好多方法，比如监听器等等
		 * 
		 * 第二节课介绍了yml的写法
		 * 刚开始老师说yml＞propertis 
		 * 但是我执行了一下是不识别yml
		 * 解决方法是把target给删掉在重新编译一下就好了
		 * 
		 * 第三节课 profile的运用
		 * 真正开发中，配置文件分为开发用(dev) , 测试用(prop)等等
		 * 这时候就会在application中激活使用哪儿个配置文件
		 * spring.profiles.active 使用这个更改配置文件
		 * --------------------------------------------------
		 * 在真正的开发过程当中，要么我们就用一个配置文件，要么我们就按功能分成多个配置文件
		 * 配置多个配置文件的话，就需要建立一个config文件夹，按照功能配置多个配置文件
		 * 
		 * 第4节课，外部配置文件加载
		 * 1，使用输入流加载
		 * Properties ps= new Properties();
		   InputStream inStream = SpringbootAllApplication.class.getClassLoader().getResourceAsStream("app.properties");
		   ps.load(inStream);
		   
		   2，使用注解加载
		   @PropertySource("app.properties")
		 */
//		Properties ps= new Properties();
//		InputStream inStream = SpringbootAllApplication.class.getClassLoader().getResourceAsStream("app.properties");
//		ps.load(inStream);
		
		SpringApplication app = new SpringApplication(SpringbootAllApplication.class);
		//app.setDefaultProperties(ps);
		app.run(args);
		//SpringApplication.run(SpringbootAllApplication.class, args);
	}

}
