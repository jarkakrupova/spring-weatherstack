package cz.vsb.austra.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//zjednoduseni importu
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.vsb.austra.City;
import cz.vsb.austra.dto.WeatherDto;
import cz.vsb.austra.service.WeatherService;

@RestController
public class WeatherController {	
	@RequestMapping("/weather")	
	public Collection<WeatherDto> getWeather(){
		ArrayList weatherList = new ArrayList<>();
		WeatherService ws = new WeatherService();
		for (City city : City.values()) {
			WeatherDto w= ws.getWeatherForCity(city);
			weatherList.add(w);			
		}
		return weatherList;
	} 
	
	@RequestMapping("/weather/bruntal")	
	public String bruntal(){
		return "<h1>Bruntál nenalezen</h1> To fakt existuje??? <p> <img src='http://www.zubatezaby.cz/files/IMG_26.jpg'/>";
	}
	
	@RequestMapping("/weather/{city}")
	public WeatherDto getWeatherForCity(@PathVariable String city){
		City cityEnum = City.valueOf(city.toUpperCase());
		WeatherService weatherService = new WeatherService();
		return weatherService.getWeatherForCity(cityEnum);
	}
}
