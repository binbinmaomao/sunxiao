package cn.mybatis.pojo;

import java.util.List;

public class CityLanguageDTo extends City{
	
	private List<CountryLanguage> countryLanguage;

	public List<CountryLanguage> getCountryLanguage() {
		return countryLanguage;
	}

	public void setCountryLanguage(List<CountryLanguage> countryLanguage) {
		this.countryLanguage = countryLanguage;
	}

	@Override
	public String toString() {
		return super.toString()+"CityLanguageDTo [countryLanguage=" + countryLanguage + "]";
	}
	
	

}
