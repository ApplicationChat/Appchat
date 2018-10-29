package com.example.ngothihuyen.chatnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

         TabHost tabHost=(TabHost) findViewById(R.id.tabhost);
         tabHost.setup();
         TabHost.TabSpec tab1=tabHost.newTabSpec("Tin nhắn");
         tab1.setIndicator("Tin nhắn");
         tab1.setContent(R.id.Tinnhan);

        TabHost.TabSpec tab2=tabHost.newTabSpec("tab 2");
        tab2.setIndicator("Hoạt động ");
        tab2.setContent(R.id.hoatdong);

        TabHost.TabSpec tab3=tabHost.newTabSpec("Tab 3");
        tab3.setIndicator("Nhóm");
        tab3.setContent(R.id.nhom);

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);
    }
}
