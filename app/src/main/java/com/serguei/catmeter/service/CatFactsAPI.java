package com.serguei.catmeter.service;// Created by Serguei Outenkov on 8/28/16.

import com.serguei.catmeter.model.CatFactsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CatFactsAPI {

    //URL base de nuestra API
    String ENDPOINT = "http://catfacts-api.appspot.com/api/";

    /**
     * Método que obtiene la lista de curiosidades de los gatos
     *
     * @param number
     * @return
     */
    @GET("facts")
    Call<CatFactsResponse> getCatFacts(@Query("number") int number);
}
