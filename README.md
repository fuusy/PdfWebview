**A lib for loading PDF in Android using WebView**

## Usage

### Including in your project

Copy... /pdf/src/main/assets/... all files in the path

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

