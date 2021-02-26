package cz.vsb.austra.dto;

import java.util.List;

public class Current {
	public String getObservation_time() {
		return observation_time;
	}
	public void setObservation_time(String observation_time) {
		this.observation_time = observation_time;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public List<String> getWeather_descriptions() {
		return weather_descriptions;
	}
	public void setWeather_descriptions(List<String> weather_descriptions) {
		this.weather_descriptions = weather_descriptions;
	}
	public int getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(int wind_speed) {
		this.wind_speed = wind_speed;
	}
	public String getWind_dir() {
		return wind_dir;
	}
	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public String observation_time;
	public int temperature;
	public List<String> weather_descriptions;
	public int wind_speed;
	public String wind_dir;
	public int humidity;
}
