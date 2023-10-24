package com.example.soapclient;

import com.example.soapclient.org.oorsprong.websamples_countryinfo.CountryInfoService;
import com.example.soapclient.org.oorsprong.websamples_countryinfo.CountryInfoServiceSoapType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoapClientApplication.class, args);
        System.out.println("Hi");
        CountryInfoService countryInfoService = new CountryInfoService();
        CountryInfoServiceSoapType countryInfoServiceSoapType = countryInfoService.getCountryInfoServiceSoap();
        System.out.println(countryInfoServiceSoapType.capitalCity("NL"));

    }

}
