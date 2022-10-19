package cn.mybatis.pojo;

import java.io.Serializable;

public class City implements Serializable{
	
	private Integer id;
	private String Name;
	private String CountryCode;
	private String District;
	private Integer Population;
	
	
	public City()  {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(Integer id, String name, String countryCode, String district, Integer population) {
		this.id = id;
		Name = name;
		CountryCode = countryCode;
		District = district;
		Population = population;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public Integer getPopulation() {
		return Population;
	}
	public void setPopulation(Integer population) {
		Population = population;
	}
	
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	@Override
	public String toString() {
		return "City [ID=" + id + ", Name=" + Name + ", CountryCode=" + CountryCode + ", District=" + District
				+ ", Population=" + Population + "]\n";
	}
	
	
	

}
