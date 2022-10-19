package cn.mybatis.test;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.mybatis.dao.CityMapper;
import cn.mybatis.pojo.City;
import cn.mybatis.pojo.CityLanguageDTo;

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
	/*
	 * 根据id获取city对象
	 */
	@Test
	public void test01() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  CityMapper mapper = session.getMapper(CityMapper.class);
			  //Blog blog = mapper.selectBlog(101);
//			  City city = mapper.selectCity(5000,"sunya");
//			  System.out.print(city);
//			  logger.info(city.toString());
			  List<City> citys =mapper.sunxiaobin(10000);
			  for (City city:citys) {
				  System.out.println(city.toString());
			  }
			  
			}
		
	}
//	/*
//	 * city对象个数
//	 */
//	@Test
//	public void test02() {
//		
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			  CityMapper mapper = session.getMapper(CityMapper.class);
//			  //Blog blog = mapper.selectBlog(101);
//			  long count = mapper.cityCount();
//			  System.out.println(count);
//			  logger.info("cityの数"+Long.toString(count));
//			 
//			  
//			}
//		
//	}
//	/*
//	 * insert
//	 */
//	@Test
//	public void test03() {
//		
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			  CityMapper mapper = session.getMapper(CityMapper.class);
//			  City city = new City();
//			  //city.setID(5000);
//			  city.setName("suya");
//			  city.setCountryCode("CHN");
//			  city.setDistrict("sunya");
//			  city.setPopulation(123456);
//			  Integer result =mapper.cityInsert(city);
//			  session.commit();
//			  System.out.println(result);
//			  logger.info("city"+Integer.toString(result));
//			}
//		
//	}
//	/*
//	 * update
//	 */
////	@Test
////	public void test04() {
////		
////		try (SqlSession session = sqlSessionFactory.openSession()) {
////			  CityMapper mapper = session.getMapper(CityMapper.class);
////			  City city = new City();
////			  city.setId(5000);
////			  city.setName("sunya");
////			  Integer result =mapper.cityUpdate(city);
////			  session.commit();
////			  System.out.print(result);
////			}
////		
////	}
//	/*
//	 * 参数是javabean
//	 */
////	@Test
////	public void test05() {
////		logger.info("------test01方法开始执行--------------");
////		try (SqlSession session = sqlSessionFactory.openSession()) {
////			  CityMapper mapper = session.getMapper(CityMapper.class);
////			  City citybean = new City();
////			  citybean.setId(5000);
////			  citybean.setName("sunya");
////			  //Blog blog = mapper.selectBlog(101);
////			  City city = mapper.selectCity2(citybean);
////			  //System.out.print(city);
////			  logger.info(city.toString());
////			  
////			}
////		
////	}
//	
//	/*
//	 * 参数是list
//	 */
//	@Test
//	public void test06() {
//		logger.info("------test01方法开始执行--------------");
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			  CityMapper mapper = session.getMapper(CityMapper.class);
//			  List<String> list = new ArrayList<>();
//			  list.add("sunya");
//			  list.add("sunxiaobin");
//			  List<City> cityList = mapper.selectCity3(list);
//			  System.out.print(cityList.toString());
//			  //logger.info();
//			  
//			}
//		
//	}
	/*
	 * 嵌套结果
	 */
	@Test
	public void test07() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  CityMapper mapper = session.getMapper(CityMapper.class);
			  //Blog blog = mapper.selectBlog(101);
//			  City city = mapper.selectCity(5000,"sunya");
//			  System.out.print(city);
//			  logger.info(city.toString());
			  CityLanguageDTo dto =mapper.xiaobinsun(5000);
			  logger.info(dto.toString());
			  System.out.println("////////////////////////////");
			  System.out.println(dto.getCountryLanguage().get(0).getLanguage());
			  
			}
		
	}
	/*
	 * 嵌套查询
	 */
	@Test
	public void test08() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  CityMapper mapper = session.getMapper(CityMapper.class);
			  //Blog blog = mapper.selectBlog(101);
//			  City city = mapper.selectCity(5000,"sunya");
//			  System.out.print(city);
//			  logger.info(city.toString());
			  City city = new City();
			  //city.setId(10);
			  city.setName("sunya");
			  CityLanguageDTo dto =mapper.XXlan(city);
			  logger.info(dto.toString());
//			  System.out.println("////////////////////////////");
//			  System.out.println(dto.getCountryLanguage().get(0).getLanguage());
			  
			}
		
	}
	/*
	 * if where
	 */
	@Test
	public void test09() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  CityMapper mapper = session.getMapper(CityMapper.class);

			  City city = new City();
			  city.setId(10);
			  //city.setName("sunya");
			  City dto =mapper.selectCity2(city);
			  logger.info(dto.toString());

			  
		}
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			CityMapper mapper = session.getMapper(CityMapper.class);
//			  List<City> citys = new ArrayList<>();
//			  for(int i=0;i<=5;i++) {
//				  citys.add(new City(null,"binbin"+i,"CHN","binbin",11111));
//			  }
//			  Integer count=mapper.daliaoinsert(citys);
//			  session.commit();
//			  System.out.println(count);
//			
//
//			  
//		}
		
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  CityMapper mapper = session.getMapper(CityMapper.class);

			  City city = new City();
			  city.setId(10000);
			  //city.setName("sunya");
			  City dto =mapper.selectCity2(city);
			  logger.info(dto.toString());

			  
		}
		
	}
	/*
	 * 动态SQL foreach
	 */
	@Test
	public void test10() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  CityMapper mapper = session.getMapper(CityMapper.class);
			  //Blog blog = mapper.selectBlog(101);
//			  City city = mapper.selectCity(5000,"sunya");
//			  System.out.print(city);
//			  logger.info(city.toString());
			  int [] i= {10,5000};
			  //city.setName("sunya");
			   List<City> citys=mapper.selectCity3(i);
			  logger.info(citys.toString());
//			  System.out.println("////////////////////////////");
//			  System.out.println(dto.getCountryLanguage().get(0).getLanguage());
			  
			}
		
	}
	/*
	 * 批量插入
	 */
	@Test
	public void test11() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			  CityMapper mapper = session.getMapper(CityMapper.class);
			  List<City> citys = new ArrayList<>();
			  for(int i=0;i<=5;i++) {
				  citys.add(new City(null,"binbin"+i,"CHN","binbin",11111));
			  }
			  Integer count=mapper.daliaoinsert(citys);
			  sqlSession.commit();
			  System.out.println(count);
			}
		
	}
	
	/*
	 * 分页查询
	 */
	@Test
	public void test12() {
		logger.info("------test01方法开始执行--------------");
		try (SqlSession session = sqlSessionFactory.openSession(true)) {
			  CityMapper mapper = session.getMapper(CityMapper.class);
			  PageHelper.startPage(1, 10);
			  List<City> citys =mapper.fenye();
			  System.out.println(citys);
			  System.out.println("-------------------------------");
			  //把list对象转换成pageinfo对象，因为pageinfo对象有好多属性可以调用
			  //比如是否是第一页，是否是最后一页，等等 方便前端使用
			  PageInfo page =  new PageInfo(citys,5);
			  System.out.println("是否是第一页"+page.isIsFirstPage());
			  System.out.println("是否是最后一页"+page.isIsLastPage());
			  System.out.println("当前页"+page.getPageNum());
			  //获取所有导航页
			  int[] pageNums =page.getNavigatepageNums();
			  System.out.println("导航页");
			  for(int pageNum:pageNums) {
				  System.out.print(pageNum);
				  
			  }
			  
			  
			}
		
	}

}
