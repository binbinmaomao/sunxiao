package cn.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.mybatis.pojo.City;
import cn.mybatis.pojo.CityLanguageDTo;

public interface CityMapper {
	
//	//根据id查询
//	//public City selectCity(@Param("id") int id ,@Param("name")String name);
//	public City selectCity(@Param("uid")int uid ,@Param("name")String name);
//	
//	//查询所有数据
//	long cityCount();
//	
//	//插入一条数据
//	Integer cityInsert(City city);
//	
//	//更新一条数据
//	Integer cityUpdate(City city);
//	
//	//参数是javabean
	City selectCity2(City city);
//	
//	//参数是list
//	public List<City> selectCity3(List<String> name);
	
	List<City> sunxiaobin(@Param("id") Integer id);
	
	CityLanguageDTo xiaobinsun(@Param("id") Integer id);
	
	CityLanguageDTo XXlan(City city);
	
	List<City> selectCity3(@Param("ids") int[] ids);
	
	Integer daliaoinsert(@Param("citys") List<City> city);
	
	//分页查询
	List<City> fenye();
}
