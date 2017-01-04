package com.example.administrator.webviewtest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* 화면 전체를 해당 사이트로
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(intent);*/

        webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://m.yesfile.com");
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event){
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_BACK:
                    // 단말기의 BACK버튼
                    return true;
                case KeyEvent.KEYCODE_MENU:
                    Toast.makeText(getApplicationContext(), "메뉴버튼!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,DataExchangeActivity.class);
                    startActivity(intent);

                    // 단말기의 메뉴버튼
                    return true;
                case KeyEvent.KEYCODE_HOME:
                    // 단말기의 HOME버튼 -> 동작안함
                    return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

}
