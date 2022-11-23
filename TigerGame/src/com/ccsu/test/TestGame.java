package com.ccsu.test;
import com.ccsu.tigers.view.GameView;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/**
 * @author Yao Yuan
 * @version 1.00
 * @see android.app.Activity
 * @see android.os.Bundle
 * @see android.view.KeyEvent
 * @see #gv
 * @see #onCreate(Bundle)
 * @see #onKeyDown(int, KeyEvent)
 * 
 * 
*/

public class TestGame extends Activity {
   
	GameView gv ;	
	/**
	 * onCreate(Bundle)��������main
	 * <p>��������main<br>
	 * @param saveInstanceState���ֵ�ʱ״̬
	 * @return û�з���ֵ
	*/
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gv = new GameView(this);
        setContentView(gv); 
    }
	
	/**
	 * onKeyDown(int,KeyEvent)��Ӧ��������
	 * <p>������Ӧ��������<br>
	 *@param keyCode��ʾ��Ӧ�İ������
	 *@param event��ʾ��Ӧ��ʱ��
	 *@return ����һ��boolean���͵�ֵ
	*/
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		gv.onKeyDown(keyCode, event);
		return super.onKeyDown(keyCode, event);
	}	
}