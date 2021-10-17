**A lib for loading PDF in Android using WebView**

## Usage

### Including in your project

Copy... /pdf/src/main/assets/... all files in the path and paste it into the assert directory of your project.

Check out the article for details https://juejin.cn/post/7017840637450043422

### Use

```js
val settings: WebSettings? = webView?.settings
settings?.javaScriptEnabled = true
settings?.allowFileAccess = true

settings?.builtInZoomControls = true
settings?.setSupportZoom(true)
settings?.displayZoomControls = false 

webView?.loadUrl("file:///android_asset/index.html?${pdfPath}");
```

## Thanks

[pdf.js](https://github.com/mozilla/pdf.js)

