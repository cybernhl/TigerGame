package com.ccsu.tigers.music;

import android.content.Context;
import android.media.MediaPlayer;


/**
 * @author Yao Yuan
 * @version 1.00
 * @see android.content.Context
 * @see android.media.MediaPlayer
 * @see android.os.Bundle
 * @see android.view.KeyEvent
 * @see #mMediaPlayer
 * @see #context
 * @see #MusicPlayer(Context)
 * @see #init()
 * @see #playMusic(int, boolean)
 * 
 * 
 * 
*/
public class MusicPlayer {
	
	public MediaPlayer mMediaPlayer = null;
	Context context;
	
	public MusicPlayer(Context context) {
		this.context = context;
		init();
	}
	
	private void init() {
		 mMediaPlayer = new MediaPlayer();
	}
	
	public void  playMusic(int rsc, boolean looping){
    	try {
    		mMediaPlayer = MediaPlayer.create(context, rsc);
			//mMediaPlayer.setDataSource(path);
			//mMediaPlayer.prepare();
    		mMediaPlayer.setLooping(looping);
			mMediaPlayer.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
  }
}
