package com.konstantinov.yaoptovik;

import com.konstantinov.yaoptovik.pojo.Otvet;
import com.konstantinov.yaoptovik.pojo.Post;
import com.konstantinov.yaoptovik.pojo.Suggestions;
import com.konstantinov.yaoptovik.ui.suppliers.SuppliersAddFragment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DadataApi {
    @POST("party")
    @Headers({"Content-Type: application/json", "Accept: application/json", "Authorization: Token 2cbfa1400e2e98fdb26396f798d3276cf70e91a2"})

    Call<Otvet> getPostWithID(@Body SuppliersAddFragment.QueryInn queryInn);
}
