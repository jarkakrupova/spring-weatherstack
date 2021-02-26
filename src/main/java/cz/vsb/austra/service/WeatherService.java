package cz.vsb.austra.service;

import org.springframework.stereotype.Service;

import cz.vsb.austra.City;
import cz.vsb.austra.connector.WeatherstackConnector;
import cz.vsb.austra.dto.*;

@Service
public class WeatherService {
	public WeatherDto getWeatherForCity(City cityEnum) {
		WeatherstackConnector connector = new WeatherstackConnector();
		WeatherstackDto weatherStackDto = connector.getWeatherForCity(cityEnum);
		return transformDto(weatherStackDto);
	}
	private WeatherDto transformDto(WeatherstackDto weatherStackDto) {
		WeatherDto wdto = new WeatherDto();
		wdto.setLocation(weatherStackDto.getLocation().getName());
		wdto.setTemp_celsius(weatherStackDto.getCurrent().getTemperature());
		wdto.setRel_humidity(weatherStackDto.getCurrent().getHumidity());
		wdto.setTimestamp(weatherStackDto.getCurrent().getObservation_time());
		wdto.setWeatherDescription(weatherStackDto.getCurrent().getWeather_descriptions().get(0));
		wdto.setWindDirection(weatherStackDto.getCurrent().getWind_dir());
		wdto.setWindSpeed_mps(weatherStackDto.getCurrent().getWind_speed()/3.6);
		return wdto;
	}
}
