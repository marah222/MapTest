package com.maroo.android.maptest.webService;

import com.maroo.android.maptest.model.DirectionPlaceModel.DirectionResponseModel;
import com.maroo.android.maptest.model.GoogleResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {

    @GET
    Call<GoogleResponseModel> getNearByPlaces(@Url String url);

    @GET
    Call<DirectionResponseModel> getDirection(@Url String url);
}
