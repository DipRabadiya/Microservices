package com.hotel.service.HotelService.Repositories;

import com.hotel.service.HotelService.Entites.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
