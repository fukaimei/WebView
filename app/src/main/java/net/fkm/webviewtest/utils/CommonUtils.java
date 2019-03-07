package net.fkm.webviewtest.utils;

import android.content.res.Resources;

import net.fkm.webviewtest.BaseApplication;

/**
 * 获取原生资源
 */
public class CommonUtils {

    public static int getColor(int resid) {
        return getResoure().getColor(resid);
    }

    public static Resources getResoure() {
        return BaseApplication.getInstance().getResources();
    }

}
