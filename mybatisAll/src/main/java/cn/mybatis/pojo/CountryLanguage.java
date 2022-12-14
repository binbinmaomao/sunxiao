package cn.mybatis.pojo;

public class CountryLanguage {
//	1		CountryCode	char(3)
//	2		Language	char(30)
//	3		IsOfficial	enum('T','F')
//	4		Percentage	float(4,1)
	private String CountryCode;
	private String Language;
	private String IsOfficial;
	private Float Percentage;
	
	public String getIsOfficial() {
		return IsOfficial;
	}
	public void setIsOfficial(String isOfficial) {
		IsOfficial = isOfficial;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public Float getPercentage() {
		return Percentage;
	}
	public void setPercentage(Float percentage) {
		Percentage = percentage;
	}
	@Override
	public String toString() {
		return "CountryLanguage [CountryCode=" + CountryCode + ", Language=" + Language + ", IsOfficial=" + IsOfficial
				+ ", Percentage=" + Percentage + "]\n";
	}
	

	
	

}
