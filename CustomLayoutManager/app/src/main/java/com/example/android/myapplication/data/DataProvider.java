package com.example.android.myapplication.data;


import com.example.android.myapplication.model.Article;

import java.util.List;

public interface DataProvider {
    List<Article> getArticles();
}
