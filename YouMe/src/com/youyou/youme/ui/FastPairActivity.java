package com.youyou.youme.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import cn.bmob.im.bean.BmobChatUser;

import com.baidu.location.am;
import com.youyou.youme.R;
import com.youyou.youme.view.vxlist.XListView.IXListViewListener;


/**
 *  ����ƥ��İ����
 * @author youyou
 *
 */
public class FastPairActivity extends ActivityBase  {
	BmobChatUser targetUser;
	Button btn_start; //��ʼ���
	Button btn_cancel;//ȡ�����
	MyHandler mHandler;
	Thread thread;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fast_pair);
		
		btn_start = (Button)findViewById(R.id.btn_start);
		btn_cancel = (Button)findViewById(R.id.btn_cancel);
		mHandler = new MyHandler();
		thread = new Thread(){
			@Override
			public void run() {
				super.run();
				//TO DO
			}
			
			
		};
		btn_start.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View arg0) {
			     startAnimation();
			}

			private void startAnimation() {
				//ת��������ͼƬ
			}
		});
		
		btn_start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
			}
		});
		
		
	}


	//ƥ�����


    //ƥ��ɹ���ѡ����ת��
	public void onSuccess(){
		
	}
	
	//handler ֪ͨƥ�䵽�û�������ͼƬ
    class MyHandler extends Handler{
    	@Override
    	public void handleMessage(Message msg) {
    		super.handleMessage(msg);
    		if(msg.what == 0x314A018)
    		{
    			onSuccess();
    		}
    	}
    }
}
