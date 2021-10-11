package com.lr.pdfload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    private var webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        webView = findViewById(R.id.web_container)
        val settings: WebSettings? = webView?.settings
        settings?.javaScriptEnabled = true
        settings?.allowFileAccess = true

        settings?.builtInZoomControls = true
        settings?.setSupportZoom(true)
        settings?.displayZoomControls = false //不显示缩放按钮

        webView?.loadUrl("file:///android_asset/index.html?https://www.gjtool.cn/pdfh5/git.pdf");

    }

    override fun onDestroy() {
        super.onDestroy()
        webView?.clearHistory()
        webView?.clearCache(true)
        webView?.clearFormData()
        webView =null
    }
}