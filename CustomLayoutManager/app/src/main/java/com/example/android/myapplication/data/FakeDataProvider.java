package com.example.android.myapplication.data;

import android.content.Context;


import com.example.android.myapplication.R;
import com.example.android.myapplication.model.Article;
import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FakeDataProvider implements DataProvider {

    private final Context context;

    public FakeDataProvider(Context context) {
        this.context = context.getApplicationContext();
    }

    @Override
    public List<Article> getArticles() {
        Gson gson = new Gson();
        Article[] articles = gson.fromJson(new InputStreamReader(context.getResources().openRawResource(R.raw.data)), Article[].class);
        return new ArrayList<>(Arrays.asList(articles));
    }
}
