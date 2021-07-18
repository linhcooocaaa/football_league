package com.example.football_league.dto.response;

import com.example.football_league.model.Country;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CountryResponseDTO {

    private Integer id;
    private String countryName;

    public static CountryResponseDTO fromModel(Country country) {
        return CountryResponseDTO.builder()
                .id(country.getId())
                .countryName(country.getCountryName())
                .build();
    }

}
