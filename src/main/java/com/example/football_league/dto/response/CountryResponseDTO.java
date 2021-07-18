package com.example.football_league.dto.response;

import com.example.football_league.model.Country;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CountryResponseDTO {

    private String id;
    private String countryName;

    public static CountryResponseDTO fromModel(Country country) {
        return CountryResponseDTO.builder()
                .id(country.getId().toString())
                .countryName(country.getCountryName())
                .build();
    }

}
