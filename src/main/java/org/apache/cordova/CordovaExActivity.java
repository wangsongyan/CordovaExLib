package org.apache.cordova;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;

import org.apache.cordova.engine.SystemWebView;

public class CordovaExActivity extends CordovaActivity {

  private String userAgent;

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if (!TextUtils.isEmpty(userAgent)) {
      super.init();
      WebSettings settings = ((SystemWebView) appView.getView()).getSettings();
      String ua = settings.getUserAgentString();
      settings.setUserAgentString(ua + ";" + userAgent);
    }
  }

  /***
   * 设置客户端userAgent
   * @param userAgent 客户端标识
     */
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  /**
   * Construct the default web view object.
   * <p/>
   * Override this to customize the webview that is used.
   */
  protected CordovaWebView makeWebView() {
    return new CordovaWebViewImplEx(makeWebViewEngine());
  }

  protected CordovaWebViewEngine makeWebViewEngine() {
    return CordovaWebViewImplEx.createEngine(this, preferences);
  }

}
