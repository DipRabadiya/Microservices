package com.hotel.service.HotelService.Services;

import com.hotel.service.HotelService.Entites.Hotel;
import com.hotel.service.HotelService.Impl.HotelServiceImpl;
import com.hotel.service.HotelService.Repositories.HotelRepository;

import java.util.List;

public interface HotelService {

    //create
    Hotel create(Hotel hotel);
    //get all
    List<Hotel> getAll();
    //single get
    Hotel get(String id);
}
