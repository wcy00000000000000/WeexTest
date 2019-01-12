package com.example.wcy.wexxtest;

import android.app.Application;
import android.text.TextUtils;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by $USER_NAME on 2019/1/11
 */
public class WXApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder().build();
        WXSDKEngine.initialize(this,config);
        //initDebugEnvironment(true, "127.0.0.1"/*"DEBUG_SERVER_HOST"*/);
    }

    /*private void initDebugEnvironment(boolean enable, String host) {
        WXEnvironment.sRemoteDebugMode = enable;
        WXEnvironment.sRemoteDebugProxyUrl = "ws://" + host + ":8088/debugProxy/native/ab71232a-4c97-4eab-9f9c-404b5f72df9a";
    }*/
}
