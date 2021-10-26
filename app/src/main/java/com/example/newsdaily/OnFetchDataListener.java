package com.example.newsdaily;

import com.example.newsdaily.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{

    void onError(String message);
    void OnFetchData(List<NewsHeadlines> list, String message);






}
