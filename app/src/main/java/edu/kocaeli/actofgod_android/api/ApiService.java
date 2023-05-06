package edu.kocaeli.actofgod_android.api;

import java.util.List;

import edu.kocaeli.actofgod_android.model.Location;
import edu.kocaeli.actofgod_android.model.TcNoValidateDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
    @GET("location")
    Call<List<Location>> getLocations();

    @POST("tcno-validate")
    Call<Boolean> tcNoValidate(@Body TcNoValidateDto tcNoValidateDto);
}