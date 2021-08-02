package com.ridamjain.productlist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ProductAPI {
    @Headers({"Authorization: 5_787cd1d627251146007143bfea3358c2"})
    @GET("category_id/66/subcategory_id/95/subcategory_level2_id/4/user_id/5/page/1")
    Call<List<Model>> getProduct();
}
