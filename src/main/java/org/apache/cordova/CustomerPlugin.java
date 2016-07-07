package org.apache.cordova;

import android.net.Uri;

/**
 * Created by songy on 2016/7/6.
 */
public class CustomerPlugin extends CordovaPlugin {

  //允许js访问原生代码
  @Override
  public Boolean shouldAllowBridgeAccess(String url) {
    return true;
  }

  //跳转链接处理，点击链接跳转页面
  @Override
  public boolean onOverrideUrlLoading(String url) {
    this.webView.loadUrl(url);
    return true;
  }

}
