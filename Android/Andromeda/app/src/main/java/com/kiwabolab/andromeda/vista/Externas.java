package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.Rues;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Externas extends Activity {
    //----------------------------------------------------------------------------------------------
    //Variables
    @BindView(R.id.webExternas)WebView webView;

    private Rues rues;
    private String url="https://www.google.com/search?client=firefox-b-ab&dcr=0&biw=1600&bih=538&tbm=nws&ei=s_MUWvuZI6mcjwT577WYBw&q=";
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_externas);
        ButterKnife.bind(this);

        rues = (Rues)getIntent().getSerializableExtra("rues");

        setVista();
    }
    //----------------------------------------------------------------------------------------------
    //
    private void setVista(){
        webView.setWebViewClient(new MyWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        url=url+rues.getRows().get(0).getRazonSocial()+"&oq="+rues.getRows().get(0).getRazonSocial();
        webView.loadUrl(url);
    }

    //----------------------------------------------------------------------------------------------
    //
    public void Exit(View view){
        finish();
    }
    //----------------------------------------------------------------------------------------------
    //
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
