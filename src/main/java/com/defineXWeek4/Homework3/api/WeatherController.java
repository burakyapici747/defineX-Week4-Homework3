package com.defineXWeek4.Homework3.api;

import com.defineXWeek4.Homework3.api.response.DataResponse;
import com.defineXWeek4.Homework3.model.Weather;
import com.defineXWeek4.Homework3.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("daily/country/{countryName}/city/{cityName}")
    ResponseEntity<DataResponse<Weather>> getDailyTemperatureInformationByCountryNameAndCityName(
            @PathVariable("countryName") String countryName, @PathVariable("cityName") String cityName){
        return ResponseEntity.ok().body(weatherService.getDailyTemperatureInformationByCountryNameAndCityName(countryName, cityName));
    }

    @GetMapping("weekly/country/{countryName}/city/{cityName}")
    ResponseEntity<DataResponse<Weather>> getWeeklyTemperatureInformationByCountryNameAndCityName(
            @PathVariable("countryName") String countryName, @PathVariable("cityName") String cityName){
        return ResponseEntity.ok().body(weatherService.getWeeklyTemperatureInformationByCountryNameAndCityName(countryName, cityName));
    }

    @GetMapping("monthly/country/{countryName}/city/{cityName}")
    ResponseEntity<DataResponse<Weather>> getMonthlyTemperatureInformationByCountryNameAndCityName(
            @PathVariable("countryName") String countryName, @PathVariable("cityName") String cityName){
        return ResponseEntity.ok().body(weatherService.getMonthlyTemperatureInformationByCountryNameAndCityName(countryName, cityName));
    }

}
