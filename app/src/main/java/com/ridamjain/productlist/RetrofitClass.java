package com.ridamjain.productlist;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClass {
    private static final String BASE_URL=" http://15.207.165.1/demo/webservice/v1/productList/";
    private static RetrofitClass myClient;
    private Retrofit retrofitClass;

    private RetrofitClass(){

        retrofitClass =new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }
    public static synchronized RetrofitClass getInstance(){
        if (myClient==null){
            myClient=new RetrofitClass();
        }
        return myClient;
    }
    public ProductAPI getMyApi(){
        return retrofitClass.create(ProductAPI.class);
    }
}
