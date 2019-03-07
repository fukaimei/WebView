package net.fkm.webviewtest;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;

public class BaseApplication extends Application {

    private static BaseApplication baseApplication;

    public static BaseApplication getInstance() {
        return baseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        initTextSize();
    }

    /**
     * 使其系统更改字体大小无效
     */
    private void initTextSize() {
        Resources res = getResources();
        Configuration config = new Configuration();
        config.setToDefaults();
        res.updateConfiguration(config, res.getDisplayMetrics());
    }

}
