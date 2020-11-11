package com.esoftpublishing.csfundamentals;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {
 WebView Webv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Webv =(WebView) findViewById(R.id.CourseView);

        Webv.loadUrl("");
        Webv.setWebViewClient(new WebViewClient());
        WebSettings webSettings = Webv.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
//Not to open any url in new tab
 class MyWebv extends WebViewClient{
   @Override
   public boolean shouldOverrideUrlLoading(WebView view,String url) {
       view.loadUrl(url);
       return true;
   }
}


