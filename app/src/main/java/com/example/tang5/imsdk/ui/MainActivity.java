package com.example.tang5.imsdk.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.tang5.imsdk.App;
import com.example.tang5.imsdk.R;
import com.example.tang5.imsdk.im.NettyClient;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.btn);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				NettyClient.getInstance().connect(App.instance.getHost(),App.instance.getPort(),5);
				//ws://47.96.62.115:8012
//				NettyClient.getInstance().connect("47.96.62.115",8012,5);
//				NettyClient.getInstance().connect("juejin.im",80,5);
			}
		});
	}

}
