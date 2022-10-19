package test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;

import org.mybatis.generator.internal.DefaultShellCallback;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import cn.mybatis.domain.city;
import cn.mybatis.mapper.cityMapper;





public class MybatisTest<T> {
	public static final Logger logger = LoggerFactory.getLogger(MybatisTest.class);
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
    @Before
    public void before(){
        
        
      //读取mybatis配置文件
		String resource="Mybatis.xml";
		InputStream inputStream;
		try {
			//得到配置文件流inputStream
			inputStream=Resources.getResourceAsStream(resource);
			//根据配置信息创建会话工厂sqlSessionFactory
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			//通过会话工厂获得SqlSession 
			sqlSession=sqlSessionFactory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}	

    }
    
    @Test
    public void test01() throws Exception, IOException {
    	List<String> warnings = new ArrayList<String>();
    	   boolean overwrite = true;
    	   File configFile = new File("generatorConfig.xml");
    	   ConfigurationParser cp = new ConfigurationParser(warnings);
    	   Configuration config = cp.parseConfiguration(configFile);
    	   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    	   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    	   myBatisGenerator.generate(null);

    }
    
	/*
	 * 根据id获取city对象
	 */
	@Test
	public void test02() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  //cityMapper mapper = session.getMapper(cityMapper.class);
//			  city city=mapper.selectByPrimaryKey(10);
//			  System.out.println(city);
			cityMapper mapper =session.getMapper(cityMapper.class);
			 mapper.selectByPrimaryKey(5000);
			System.out.println(mapper.selectByPrimaryKey(5000));

			  
			}
		
	}
    
    


}
