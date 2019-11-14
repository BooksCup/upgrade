package com.bc.upgrade.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bc.upgrade.R;
import com.bc.upgrade.cons.Constant;
import com.bc.upgrade.service.DownloadService;

public class MainActivity extends AppCompatActivity {

    private Button mUpgradeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUpgradeBtn = findViewById(R.id.btn_upgrade);
        mUpgradeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DownloadService.class);
                intent.putExtra(Constant.APK_DOWNLOAD_URL, Constant.URL);
                startService(intent);
            }
        });
    }
}
