package example.com.akhbaar_thenewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NewsFullActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_full);

        String url=getIntent().getStringExtra("url");
        webView=findViewById(R.id.webview);
        WebSettings  webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);



    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
            webView.goBack();
        else

        super.onBackPressed();
    }
}