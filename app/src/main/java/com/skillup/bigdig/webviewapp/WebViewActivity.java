package com.skillup.bigdig.webviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class WebViewActivity extends AppCompatActivity {

    Unbinder unbinder;

    @BindView(R.id.root_web_view)
    WebView rootWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        unbinder = ButterKnife.bind(this);
        rootWebView.loadUrl("https://skillup.ua/lp/kurs-android-kyiv/");
    }

    @Override
    protected void onDestroy() {
        unbinder.unbind();
        super.onDestroy();
    }
}
