package com.defineXWeek4.Homework3.service.impl;

import com.defineXWeek4.Homework3.api.response.DataResponse;
import com.defineXWeek4.Homework3.api.response.SuccessDataResponse;
import com.defineXWeek4.Homework3.constant.API;
import com.defineXWeek4.Homework3.enums.DayType;
import com.defineXWeek4.Homework3.model.Weather;
import com.defineXWeek4.Homework3.service.WeatherService;
import com.defineXWeek4.Homework3.util.URLHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class WeatherServiceImpl implements WeatherService {
    private final RestTemplate restTemplate;

    public WeatherServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public DataResponse<Weather> getDailyTemperatureInformationByCountryNameAndCityName(
            String countryName,
            String cityName) {
        final String URL = API.BASE_URL + URLHelper.countryName(countryName) + URLHelper.cityName(cityName)
                + URLHelper.startDate(LocalDate.now());
        return new SuccessDataResponse<>(request(URL), "Success");
    }

    @Override
    public DataResponse<Weather> getWeeklyTemperatureInformationByCountryNameAndCityName(
            String countryName,
            String cityName) {
        final String URL = API.BASE_URL + URLHelper.countryName(countryName) + URLHelper.cityName(cityName)
                + URLHelper.startDate(LocalDate.now().minusDays(DayType.WEEKLY.getDay()))
                + URLHelper.endDate(LocalDate.now());
        return new SuccessDataResponse<>(request(URL), "Success");
    }

    @Override
    public DataResponse<Weather> getMonthlyTemperatureInformationByCountryNameAndCityName(
            String countryName,
            String cityName) {
        final String URL = API.BASE_URL + URLHelper.countryName(countryName) + URLHelper.cityName(cityName)
                + URLHelper.startDate(LocalDate.now().minusDays(DayType.MONTHLY.getDay()))
                + URLHelper.endDate(LocalDate.now());
        return new SuccessDataResponse<>(request(URL), "Success");
    }

    private Weather request(String URL){
        Weather response = restTemplate.getForObject(URL, Weather.class);
        return response;
    }
}

