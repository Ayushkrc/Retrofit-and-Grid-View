package com.training.gridretro;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
public interface ApiInterface {

    @GET("users")
    Call<List<PostsResponse>> getAllPost();

}
