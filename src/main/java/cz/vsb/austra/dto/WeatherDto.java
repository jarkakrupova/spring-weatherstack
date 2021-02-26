package cz.vsb.austra.dto;

public class WeatherDto {
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getTemp_celsius() {
		return temp_celsius;
	}
	public void setTemp_celsius(int i) {
		this.temp_celsius = i;
	}
	public int getRel_humidity() {
		return rel_humidity;
	}
	public void setRel_humidity(int rel_humidity) {
		this.rel_humidity = rel_humidity;
	}
	public Double getWindSpeed_mps() {
		return windSpeed_mps;
	}
	public void setWindSpeed_mps(Double windSpeed_mps) {
		this.windSpeed_mps = windSpeed_mps;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	private String location;
	private String timestamp;
	private int temp_celsius;
	private int rel_humidity;
	private Double windSpeed_mps;
	private String windDirection;
	private String weatherDescription;
}
