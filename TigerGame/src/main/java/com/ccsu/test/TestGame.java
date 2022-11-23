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
	 * onCreate(Bundle)用于启动main
	 * <p>用于启动main<br>
	 * @param saveInstanceState保持当时状态
	 * @return 没有返回值
	*/
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gv = new GameView(this);
        setContentView(gv); 
    }
	
	/**
	 * onKeyDown(int,KeyEvent)响应按键功能
	 * <p>用于响应按键功能<br>
	 *@param keyCode表示对应的按键编号
	 *@param event表示相应的时间
	 *@return 返回一个boolean类型的值
	*/
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		gv.onKeyDown(keyCode, event);
		return super.onKeyDown(keyCode, event);
	}	
}