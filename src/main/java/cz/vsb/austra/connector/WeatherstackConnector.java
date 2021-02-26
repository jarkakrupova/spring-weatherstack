package cz.vsb.austra.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cz.vsb.austra.City;
import cz.vsb.austra.dto.WeatherstackDto;

public class WeatherstackConnector {
//http://api.weatherstack.com/current?access_key=889c1e31949c940b6c51d95be14ff636&query=New%20York
	private static String baseURL="http://api.weatherstack.com/";
	private static String urlParams="current?access_key=";
	private static String APIkey = "889c1e31949c940b6c51d95be14ff636";
	private static String url=baseURL+urlParams+APIkey+"&query=";

	public WeatherstackDto getWeatherForCity(City city) {
		RestTemplate template = new RestTemplate();
		URI uri = null;
		try {
			uri = new URI(url + city);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResponseEntity<WeatherstackDto> response = template.getForEntity(uri, WeatherstackDto.class);
		return response.getBody();
	}

}
