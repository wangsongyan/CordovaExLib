package org.apache.cordova;

/**
 * Created by songy on 2016/7/6.
 */
public class CustomerPlugin extends CordovaPlugin {

  @Override
  public Boolean shouldAllowBridgeAccess(String url) {
    return true;
  }

//  @Override
//  public boolean onOverrideUrlLoading(String url) {
//    return true;
//  }

}
