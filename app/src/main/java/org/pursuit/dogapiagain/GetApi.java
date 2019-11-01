package org.pursuit.dogapiagain;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

//https://dog.ceo/api/breed/hound/images/random/3
public interface GetApi {
    @GET("api/breed/{name}/images/random/3")
    Call<Dog> getDogImages(
            @Path("name") String dogName);
}
