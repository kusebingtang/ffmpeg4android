package com.onzhou.ffmpeg.hello;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.onzhou.ffmpeg.base.AbsBaseActivity;

/**
 * @anchor: andy
 * @date: 2018-10-29
 * @description:
 */
public class HelloFFmpegActivity extends AbsBaseActivity {

    /**
     * 显示相关信息
     */
    private TextView mTvMessage;

    private HelloFFmpeg helloFFmpeg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_ffmpeg);
        setupViews();
        helloFFmpeg = new HelloFFmpeg();
    }

    private void setupViews() {
        mTvMessage = (TextView) findViewById(R.id.hello_tv_message);
    }

    public void onProtocolClick(View view) {
        mTvMessage.setText(helloFFmpeg.urlprotocolinfo());
    }

    public void onFormatClick(View view) {
        mTvMessage.setText(helloFFmpeg.avformatinfo());
    }

    public void onCodecClick(View view) {
        mTvMessage.setText(helloFFmpeg.avcodecinfo());
    }

    public void onFilterClick(View view) {
        mTvMessage.setText(helloFFmpeg.avfilterinfo());
    }

    public void onConfigurationClick(View view) {
        mTvMessage.setText(helloFFmpeg.configurationinfo());
    }
}
