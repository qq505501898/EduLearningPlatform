package com.jiaoyu.learningplatform;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author JiaoHongWei  by android On 2025/9/19 08:45
 * email： jhw505501898@163.com
 * 描述：   学习平台主页面
 */
public class EduMainActivity extends AppCompatActivity {


    private String title;

    public static void startActivity(Context context, String title) {
        Intent intent = new Intent(context, EduMainActivity.class);
        intent.putExtra("title", title);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_avtivity);


        title = getIntent().getStringExtra("title");


        TextView tv_name = findViewById(R.id.tv_name);


        tv_name.setText(title);


    }
}
