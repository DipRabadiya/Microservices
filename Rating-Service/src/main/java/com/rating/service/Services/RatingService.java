package com.rating.service.Services;

import com.rating.service.Entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all by userId
    List<Rating> getRatingByUserId(String userId);
    //get All by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
