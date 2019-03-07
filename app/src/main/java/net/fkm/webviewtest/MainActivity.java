package net.fkm.webviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt_web_url, bt_web_url2, bt_web_url3, bt_web_url4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_web_url = findViewById(R.id.bt_web_url);
        bt_web_url2 = findViewById(R.id.bt_web_url2);
        bt_web_url3 = findViewById(R.id.bt_web_url3);
        bt_web_url4 = findViewById(R.id.bt_web_url4);

        bt_web_url.setOnClickListener(this);
        bt_web_url2.setOnClickListener(this);
        bt_web_url3.setOnClickListener(this);
        bt_web_url4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_web_url:
                WebViewActivity.loadUrl(this, "https://www.baidu.com", "百度");
                break;
            case R.id.bt_web_url2:
                WebViewActivity.loadUrl(this, "https://www.taobao.com", "淘宝");
                break;
            case R.id.bt_web_url3:
                WebViewActivity.loadUrl(this, "https://www.youku.com", "优酷");
                break;
            case R.id.bt_web_url4:
                WebViewActivity.loadUrl(this, "http://vfx.mtime.cn/Video/2018/07/06/mp4/180706094003288023.mp4", "以网页的方式播放视频");
                break;
            default:
                break;
        }
    }
}
