package com.mustafak01.foundoutbackendrestaurants.service.abstracts;

import com.mustafak01.foundoutbackendrestaurants.model.LocationModel;
import com.mustafak01.foundoutbackendrestaurants.model.UserModel;
import com.mustafak01.foundoutbackendrestaurants.model.dtos.LocationDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LocationService {

    void save(Double longitude, Double latitude,String address, String restaurantName);
    ResponseEntity<LocationModel> getByRestaurantName(String restaurantName);
    ResponseEntity<List<LocationModel>> getAll();

    ResponseEntity<LocationDto> getByRestaurantNameWithDto(String restaurantNam);

    ResponseEntity<List<LocationDto>> getAllWithDto();
}
