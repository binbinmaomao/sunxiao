package cn.mybatis.pojo;

public class CitycountryLanguageDTO extends City{
	
	

	private CountryLanguage countryLanguage;

	
	

	public CountryLanguage getCountryLanguage() {
		return countryLanguage;
	}




	public void setCountryLanguage(CountryLanguage countryLanguage) {
		this.countryLanguage = countryLanguage;
	}




	@Override
	public String toString() {
		return super.toString();//+" countryLanguage=" + countryLanguage + "]";
	}

	
	
	

}
