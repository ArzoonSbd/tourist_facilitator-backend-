package com.jgos.hotelbooker.service;

import com.jgos.hotelbooker.entity.endpoint.HotelOffer;
import com.jgos.hotelbooker.entity.endpoint.SearchRequest;



public interface OfferSearch {
    HotelOffer search(SearchRequest searchRequest);
}
