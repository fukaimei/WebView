package net.fkm.webviewtest.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;

import net.fkm.webviewtest.BaseApplication;

import java.util.List;

/**
 * 基础工具类
 */
public class BaseTools {

    /**
     * 实现文本复制功能
     *
     * @param content 复制的文本
     */
    public static void copy(String content) {
        // 得到剪贴板管理器
        ClipboardManager cmb = (ClipboardManager) BaseApplication.getInstance().getSystemService(Context.CLIPBOARD_SERVICE);
        cmb.setText(content.trim());
    }

    /**
     * 使用浏览器打开链接
     */
    public static void openLink(Context context, String content) {
        Uri issuesUrl = Uri.parse(content);
        Intent intent = new Intent(Intent.ACTION_VIEW, issuesUrl);
        context.startActivity(intent);
    }

    /**
     * 判断手机是否安装某个应用
     *
     * @param context
     * @param appPackageName 应用包名
     * @return true：安装，false：未安装
     */
    public static boolean isApplicationAvilible(Context context, String appPackageName) {
        try {
            // 获取packagemanager
            PackageManager packageManager = context.getPackageManager();
            // 获取所有已安装程序的包信息
            List<PackageInfo> pinfo = packageManager.getInstalledPackages(0);
            if (pinfo != null) {
                for (int i = 0; i < pinfo.size(); i++) {
                    String pn = pinfo.get(i).packageName;
                    if (appPackageName.equals(pn)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception ignored) {
            return false;
        }
    }

}
