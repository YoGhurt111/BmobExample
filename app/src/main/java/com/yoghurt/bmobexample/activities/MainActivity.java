package com.yoghurt.bmobexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.yoghurt.bmobexample.R;
import com.yoghurt.bmobexample.beans.Person;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //提供以下两种方式进行初始化操作：
        //第一：默认初始化
        //1c0fab954d400e32b33caacc31d4c3fa为Bmob后端云的Application ID
        Bmob.initialize(this, "1c0fab954d400e32b33caacc31d4c3fa");

        //第二：设置BmobConfig,允许设置请求超时时间、文件分片上传时每片的大小、文件的过期时间(单位为秒)，自v3.4.7版本开始
        //BmobConfig config =new BmobConfig.Builder(this)
        ////设置appkey
        //.setApplicationId("Your Application ID")
        ////请求超时时间（单位为秒）：默认15s
        //.setConnectTimeout(30)
        ////文件分片上传时每片的大小（单位字节），默认512*1024
        //.setUploadBlockSize(1024*1024)
        ////文件的过期时间(单位为秒)：默认1800s
        //.setFileExpiration(2500)
        //.build();
        //Bmob.initialize(config);

        // 添加一行数据
//        final Person person = new Person();
//        person.setName("yoghurt");
//        person.setAddress("上海宝山");
//        person.save(this, new SaveListener() {
//            @Override
//            public void onSuccess() {
//                Toast.makeText(MainActivity.this, "添加数据成功，返回objectId为："+person.getObjectId(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailure(int i, String s) {
//                Toast.makeText(MainActivity.this, "创建数据失败：" + s, Toast.LENGTH_SHORT);
//            }
//        });
    }
}
