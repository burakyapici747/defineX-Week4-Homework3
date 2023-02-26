package com.defineXWeek4.Homework3.service;

import com.defineXWeek4.Homework3.api.response.DataResponse;
import com.defineXWeek4.Homework3.model.Weather;

public interface WeatherService {
    DataResponse<Weather> getDailyTemperatureInformationByCountryNameAndCityName(String countryName, String cityName);
    DataResponse<Weather> getWeeklyTemperatureInformationByCountryNameAndCityName(String countryName, String cityName);
    DataResponse<Weather> getMonthlyTemperatureInformationByCountryNameAndCityName(String countryName, String cityName);
}
