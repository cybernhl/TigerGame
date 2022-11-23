package com.ccsu.tigers.view;


import java.util.Random;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.ccsu.test.R;


/**
 * 
 * @aothor Yao Yuan
 * @version 1.00
 * @see android.content.Context
 * @see android.graphics.Bitmap
 * @see android.graphics.Canvas
 * @see android.graphics.Color
 * @see android.graphics.Paint
 * @see android.graphics.drawable.BitmapDrawable
 * @see android.media.MediaPlayer
 * @see android.os.Handler
 * @see android.view.MotionEvent
 * @see android.view.View
 * @see android.widget.Toast
 * @see com.ccsu.test.R
 * @see #image0
 * @see #image1
 * @see #image2
 * @see #image3
 * @see #image4
 * @see #image5
 * @see #image6
 * @see #image7
 * @see #image8
 * @see #image9
 * @see #image10
 * @see #image11
 * @see #image12
 * @see #image13
 * @see #image14
 * @see #music1
 * @see #music2
 * @see #music3
 * @see #music4
 * @see #music5
 * @see #mPaint
 * @see #totchX
 * @see #totchY
 * @see #startX
 * @see #startY
 * @see #imageSize
 * @see #StartX2
 * @see #StartY2
 * @see #buttonWidth
 * @see #buttonHight
 * @see #pingguo
 * @see #boluo
 * @see #putao
 * @see #xiangjiao
 * @see #caomei
 * @see #yingtao
 * @see #lizi
 * @see #huolongguo
 * @see #total
 * @see #start
 * @see #count
 * @see #imageChecked
 * @see #speed
 * @see #counter
 * @see #GameView(Context)
 * @see #onDraw(Canvas)
 * @see #check(int, int)
 * @see #init()
 * @see #onTouchEvent(MotionEvent)
 * @see #touch_start(float, float)
 * @see #startInit()
 * @see #endInit()
 * @see #start()
 * @see #run()
 * @see #changeSpeed()
 * 
*/
public class GameView extends View implements Runnable{
	
	/**
	 * image0用来保存一张樱桃图片资源
	*/
	private Bitmap image0;
	/**
	 * image1用来保存一张苹果图片资源
	*/
	private Bitmap image1;
	/**
	 * image2用来保存一张菠萝图片资源
	*/
	private Bitmap image2;
	/**
	 * image3用来保存一张草莓图片资源
	*/
	private Bitmap image3;
	/**
	 * image4用来保存一张香蕉图片资源
	*/
	private Bitmap image4;
	/**
	 * image5用来保存一张葡萄图片资源
	*/
	private Bitmap image5;
	/**
	 * image6用来保存一张苹果图片资源
	*/
	private Bitmap image6;
	/**
	 * image7用来保存一张草莓图片资源
	*/
	private Bitmap image7;
	/**
	 * image8用来保存一张火龙果图片资源
	*/
	private Bitmap image8;
	/**
	 * image9用来保存一张香蕉图片资源
	*/
	private Bitmap image9;
	/**
	 * image10用来保存一张梨子图片资源
	*/
	private Bitmap image10;
	/**
	 * image11用来保存一张葡萄图片资源
	*/
	private Bitmap image11;
	/*private Bitmap image12;
	  private Bitmap image13;
	*/
	/**
	 * image14用来保存一张背景图片资源
	*/
	private Bitmap image14;
	
	/*public MediaPlayer music1=null;
	public MediaPlayer music2=null;
	*/
	/**
	 * music3是代表一个游戏开始后方块变换时的声音
	*/
	public MediaPlayer music3=null;
	/**
	 * music4是代表一个游戏结束后的声音
	*/
	public MediaPlayer music4=null;
	//public MediaPlayer music5=null;
	/**
	 * mPaint是一个画笔属性
	*/
	Paint mPaint;
	/**
	 * totchX是代表横坐标X
	*/
	float totchX;
	/**
	 * totchY是代表纵坐标Y
	*/
	float totchY;
	/**
	 * startX标记画图片时的横坐标X
	*/
	int startX;	
	/**
	 * startY标记画图片时的纵坐标Y
	*/
	int startY;
	/**
	 * imageSize表示图片大小
	*/
	int imageSize;
	/**
	 * startX2标记画选择框时的横坐标X
	*/
	int startX2;
	/**
	 * startY2标记画选择框时的纵坐标Y
	*/
	int startY2;
	/**
	 * buttonWidth表示选择框的宽度
	*/
	int buttonWidth;
	/**
	 * buttonHight表示选择框的高度
	*/
	int buttonHight;
	/**
	 * pingguo记录投注在苹果上面的注数
	*/
	int pingguo = 0;
	/**
	 * boluo记录投注在菠萝上面的注数
	*/
	int boluo = 0;
	/**
	 * putao记录投注在葡萄上面的注数
	*/
	int putao = 0;
	/**
	 * xiangjiao记录投注在香蕉上面的注数
	*/
	int xiangjiao = 0;
	/**
	 * caomei记录投注在草莓上面的注数
	*/
	int caomei = 0;
	/**
	 * yingtao记录投注在樱桃上面的注数
	*/
	int yingtao = 0;
	/**
	 * lizi记录投注在梨子上面的注数
	*/
	int lizi = 0;
	/**
	 * huolongguo记录投注在火龙果上面的注数
	*/
	int huolongguo = 0;
	/**
	 * total记录用户可支配的剩余金币
	*/
	int total = 0;
    /**
     * 控制线程
	*/
	boolean start = false;
	/**
     * 控制老虎机转动的步数
	*/
	int count = 0;
	/**
	 * 控制游戏选定框的位置
	*/
	int imageChecked = 0;
	/**
     * 控制选定框转动的速度
	*/
	int speed = 120;
	
	/**
	 * 表示圈数
	*/
	int counter = 0;
	
	
	
	/**
     * GameView(context)这个方法是用来获取图片和音乐资源的
     * <p>image0、image1、image2、image3、image4、image5等13个变量获取图片资源<br>
     * music3、music4两个变量获取音乐资源
     * @return 没有返回值
	*/
	public GameView(Context context) {
		super(context);
       /*		
		*image0、image1、image2等13个变量获取图片资源
		*music1、music2两个变量获取音乐资源
		*/
		image0 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image0)).getBitmap();
		image1 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image1)).getBitmap();
		image2 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image2)).getBitmap();
		image3 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image3)).getBitmap();
		image4 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image4)).getBitmap();
		image5 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image5)).getBitmap();
		image6 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image6)).getBitmap();
		image7 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image7)).getBitmap();
		image8 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image8)).getBitmap();
		image9 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image9)).getBitmap();
		image10 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image10)).getBitmap();
		image11 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image11)).getBitmap();
        /*
         * image12 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image12)).getBitmap();
		 * image13 = ((BitmapDrawable)getResources().getDrawable(R.drawable.image13)).getBitmap();
		*/
		image14 =((BitmapDrawable)getResources().getDrawable(R.drawable.haha)).getBitmap();//中间图片
		/*
		 *music1=MediaPlayer.create(context,R.raw.back1);
		 *music2=MediaPlayer.create(context,R.raw.fadelayer);
		*/
		music3=MediaPlayer.create(context,R.raw.fixup);
		music4=MediaPlayer.create(context,R.raw.readygo);
		//music5=MediaPlayer.create(context,R.raw.transform);
		start();
	}
	
	
	
	/**
	 *onDraw(Canvas)这个方法用来画出游戏的整个界面
     *<p>分两部分画出游戏界面<br>
     *第一部分画出游戏画面栏<br>
     *第二部分画出游戏操作栏 	
	 *@param cancas是一个画布
	 *@return 没有返回值
	*/
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		/*
		 * counter控制一段时间内的速度
		 * 如果走的步数等于5的时候调用changeSpeed()加速
		 * 并把圈数赋为0
		 * 如果圈数小于5的时候，每次线程刷新，圈数就加1
		 * 
		*/
		if(counter == 5){
			/*
			 * 
			 *调用changeSpeed();
			 *改变速度
			 * 
			*/
			changeSpeed();
			counter = 0;
		}else{
			counter ++;
		}
        /*
         * 画出游戏画面栏，包括12个水果和中间一张背景图片
        */
		canvas.drawBitmap(image14,startX+imageSize,startY+imageSize,mPaint);//画中间图片
		canvas.drawBitmap(image0, startX, startY, mPaint);
		canvas.drawBitmap(image1, startX+imageSize, startY, mPaint);
		canvas.drawBitmap(image2, startX+imageSize*2, startY, mPaint);
		canvas.drawBitmap(image3, startX+imageSize*3, startY, mPaint);
		canvas.drawBitmap(image11,startX, startY+imageSize, mPaint);
		canvas.drawBitmap(image4, startX+imageSize*3, startY+imageSize, mPaint);
		canvas.drawBitmap(image10,startX, startY+imageSize*2, mPaint);
		canvas.drawBitmap(image5, startX+imageSize*3, startY+imageSize*2, mPaint);
		canvas.drawBitmap(image9, startX, startY+imageSize*3, mPaint);
		canvas.drawBitmap(image8, startX+imageSize, startY+imageSize*3, mPaint);
		canvas.drawBitmap(image7, startX+imageSize*2, startY+imageSize*3, mPaint);
		canvas.drawBitmap(image6, startX+imageSize*3, startY+imageSize*3, mPaint);
		/*
		 * 设置画笔颜色为灰色
		*/
		mPaint.setColor(Color.GRAY);
		/*
		 * 用四个for循环画出四排操作单元，每一排六个灰色矩形框
		*/
		for(int i=0; i<6; i++) {
			canvas.drawRect(startX + 48*i, startY2, startX+48*i+43, startY2 + buttonHight, mPaint);
		}
		for(int i=0; i<6; i++) {
			canvas.drawRect(startX + 48*i, startY2 +buttonHight + 5, startX+48*i+43, startY2 + buttonHight*2 +5, mPaint);
		}
		for(int i=0; i<6; i++) {
			canvas.drawRect(startX + 48*i, startY2 +buttonHight*2 + 10, startX+48*i+43, startY2 + buttonHight*3+10, mPaint);
		}
		for(int i=0; i<6; i++) {
			canvas.drawRect(startX + 48*i, startY2 +buttonHight*3 + 15, startX+48*i+43, startY2 + buttonHight*4+15, mPaint);
		}
		/*
		 * 设置画笔颜色为黄色，准备画游戏选项
		*/
		mPaint.setColor(Color.YELLOW);
		/*
		 * 调用cancas.drawText()方法画出第2排、第3排、第4排中的选项
		*/
		canvas.drawText("苹果", startX+10, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("菠萝", startX+10+48, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("葡萄", startX+10+48*2, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("香蕉", startX+10+48*3, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("草莓", startX+10+48*4, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("樱桃", startX+10+48*5, startY2 +buttonHight + 5 + 20, mPaint);
		canvas.drawText("梨子", startX+10, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("火龙果", startX+5+48, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("积分", startX+10+48*2, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("投币", startX+10+48*4, startY2 +buttonHight + 5 + 20 + 35, mPaint); 
		canvas.drawText("退币", startX+10+48*5, startY2 +buttonHight + 5 + 20 + 35, mPaint); 
		canvas.drawText("开始", startX+10+48*4, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("退出", startX+10+48*5, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		/*
		 * 设置画笔颜色为红色，准备画游戏选项
		*/
		mPaint.setColor(Color.RED);
		/*
		 * 调用cancas.drawText()方法画出选定的各个选项中的投注数目
		*/
		canvas.drawText(pingguo + "", startX+10, startY2 + 20, mPaint); 
		canvas.drawText(boluo + "", startX+10+48, startY2 + 20, mPaint); 
		canvas.drawText(putao + "", startX+10+48*2, startY2 + 20, mPaint); 
		canvas.drawText(xiangjiao + "", startX+10+48*3, startY2 + 20, mPaint); 
		canvas.drawText(caomei + "", startX+10+48*4, startY2 + 20, mPaint); 
		canvas.drawText(yingtao + "", startX+10+48*5, startY2 + 20, mPaint);
		canvas.drawText(lizi + "", startX+10, startY2 +buttonHight + 5 + 20 + 35, mPaint); 
		canvas.drawText(huolongguo + "", startX+5+48, startY2 +buttonHight + 5 + 20 + 35, mPaint); 
		canvas.drawText(total + "", startX+10+48*2, startY2 +buttonHight + 5 + 20 + 35, mPaint); 
		/*
		 * 设置画笔颜色为蓝色，准备画游戏选定框
        */		
		mPaint.setColor(Color.BLUE);
		/*
		 * 设置画笔粗细，准备画游戏选定框
		*/
		mPaint.setStrokeWidth(5);
		/*
		 * 游戏开始，开始转动选定框,由imageChecked控制选定框的位置
		 * 用canvas.drawRect()画选定框
		 * 用check()方法判断是否完成旋转，并进行相应的加奖金处理
		*/
		switch (imageChecked){
		case 0:
			/*
			 * 画选定框
			*/
			canvas.drawRect(startX, startY,  startX+imageSize,  startY+imageSize, mPaint);
			/*
			 * 用check()方法判断是否完成旋转，并进行相应的加奖金处理
			*/
			check(yingtao,10);
			break;
		case 1:
			canvas.drawRect(startX+imageSize, startY, startX+imageSize*2, startY+imageSize, mPaint);
			check(pingguo,5);
			break;
		case 2:
			canvas.drawRect(startX+imageSize*2, startY, startX+imageSize*3, startY+imageSize, mPaint);
			check(boluo,10);
			break;
		case 3:
			canvas.drawRect(startX+imageSize*3, startY, startX+imageSize*4, startY+imageSize, mPaint);
			check(caomei,5);
			break;
		case 4:
			canvas.drawRect(startX+imageSize*3, startY+imageSize, startX+imageSize*4, startY+imageSize*2, mPaint);
			check(xiangjiao,5);
			break;
		case 5:
			canvas.drawRect(startX+imageSize*3, startY+imageSize*2, startX+imageSize*4, startY+imageSize*3, mPaint);
			check(putao,5);
			break;
		case 6:
			canvas.drawRect(startX+imageSize*3, startY+imageSize*3, startX+imageSize*4, startY+imageSize*4, mPaint);
			check(pingguo,5);
			break;
		case 7:
			canvas.drawRect(startX+imageSize*2, startY+imageSize*3, startX+imageSize*3, startY+imageSize*4, mPaint);
			check(caomei,5);
			break;
		case 8:
			canvas.drawRect(startX+imageSize*1, startY+imageSize*3, startX+imageSize*2, startY+imageSize*4, mPaint);
			check(huolongguo,10);
			break;
		case 9:
			canvas.drawRect(startX, startY+imageSize*3, startX+imageSize, startY+imageSize*4, mPaint);
			check(xiangjiao,5);
			break;
		case 10:
			canvas.drawRect(startX, startY+imageSize*2, startX+imageSize, startY+imageSize*3, mPaint);
			check(lizi,10);
			break;
		case 11:
			canvas.drawRect(startX, startY+imageSize*1, startX+imageSize, startY+imageSize*2, mPaint);
			check(putao, 5);
			break;
		}
		mPaint.setStrokeWidth(1);
	}
	
	
	
	/**
	 * check(int,int)方法用来控制选定框
	 * <p>首先判断线程是否已经开启，如果开启就开始移动<br>
	 * 判断count是否大于0，如果大于0，就改变imageChecked的值，控制选定框的移动<br>
	 * 并对count减1，说明已经走了一步<br>
	 * 如果不大于0，则说明游戏已经结束，进行相应的金币处理，并关掉线程
	 * @param type判断选定框是哪种类型
	 * @param score指定应该进行的处理参数
	 * @return 没有返回值
	*/
	public void check(int type, int score) {
		/*
		 * 对选定框进行处理，首先判断start是否为真
		 * 也就是判断是否开启线程
		 * 如果开启线程了，然后判断count大于0，也就是选定框应该转动的步数是否转完
		 * 如果没有转完，就imageChecked加1，转到下一个
		 * 如果转完，就进行相应的金币总数处理，并关了线程
		*/
		if(start){
			if(count>0){
				if(imageChecked != 11){
					/*
					 *imageChecked加1,转到入下一个游戏选项
					*/
					imageChecked ++;	
				}else{
					/*
					 *imageChecked等于0,转完一轮，继续转
					*/
					imageChecked = 0;
				}
				/*
				 *控制转动的步数，转了一次后，相应减去1
				*/
				count--;
				/*
				 * 选定框转动时发出的声音
				*/
				music3.start();
			}else{
				/*
				 * 进行金币处理
				*/
				total += type*score;
				/*
				 * 判断是否有奖励
				*/
				if(type*score!=0){
					/*
					 * 获得奖励时发出的声音
					*/
					music4.start();
				}
				/*
				 * 关掉线程
				*/
				start = false;
				/*
				 * 调用endInit()，进行复位处理
				*/
				endInit();
			}
		}
	}
	
	
	
	/**
	 *init()方法用来初始化数据
	 *<p>设置相应属性的初始值<br>
	 *@return 没有返回值
	*/
	private void init() {
		/*
		 * 设置画笔
		 * 设置画笔的风格为空心
		*/
		mPaint = new Paint();
		mPaint.setStyle(Paint.Style.STROKE);
		/*
		 * 设置图片
		 * 设置图片横坐标X和纵坐标Y初始值
		 * 设置图片大小imageSize初始值
		*/
		startX = 20;
		startY = 5;
		imageSize = 71;
		/*
		 * 设置操作栏选项框
		 * 设置操作栏选项框横坐标X和纵坐标Y初始值
		 * 设置选项框宽度buttonWidth和高度buttonHight初始值
		*/
		startX2 = 10;
		startY2 = startY+imageSize*4+5;
		buttonWidth = 43;
		buttonHight = 30;
	}
	
	
	
	/**
	 * onTouchEvent(MotionEvent)用来处理点击触摸屏事件
	 * <p>在这里只进行了按下处理<br>
	 * @param event表示一个点击事件
	 * @return 返回一个boolean类型的值
	*/
    public boolean onTouchEvent(MotionEvent event) {
        
    	/*
         *获得点击的坐标
         *x表示点击点的横坐标,用event.getX()获得
         *y表示点击点的纵坐标 ,用event.getY()获得
         *
        */
    	float x = event.getX();
        float y = event.getY();
        /*
         * 判断按键的类型
         * 进行相应的处理
        */
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            	touch_start(x, y);
                break;
            /*case MotionEvent.ACTION_MOVE:
               
                break;
            case MotionEvent.ACTION_UP:
                
                break;*/
        }
        return true;
    }
    
    
    
    /**
     * 
     * touch_start(float,float)用于处理投注事件
     * <p>首先是用totchX,totchY获得相应的坐标,用于处理具体的投注对象<br>
     * 根据相应的坐标，对应到相应的选择框<br>
     * 点击该区域内一次，对应投注一次
     * @param x表示点击点的横坐标
     * @param y表示点击点的纵坐标
     * @return 没有返回值
     * 
    */
    private void touch_start(float x, float y) {
    	
    	/*
    	 * touchX表示鼠标点击的横坐标
    	 * touchY表示鼠标点击的纵坐标
    	 * 
    	*/
        totchX = x;
        totchY = y;
        //Toast.makeText(this.getContext(), x +"aaa" + y, Toast.LENGTH_LONG).show();

        /*
         * 处理具体的对象
         * 如果点击点的坐标满足if判断语句中的相应条件
         * 就进行投注处理
         * 相应的选择框数值加1
         * 而总数减1
         * 
        */
        if(x>startX && y>startY2+35 && x<startX+43 && y<startY2 + buttonHight +35 && total>0){
        	pingguo += 1;
        	total -= 1;
        }else if(x>startX +48 && y>startY2+35 && x<startX+43+48 && y<startY2 + buttonHight +35 && total>0){
        	boluo += 1;
        	total -= 1;
        }else if(x>startX +48*2 && y>startY2+35 && x<startX+43+48*2 && y<startY2 + buttonHight +35 && total>0){
        	putao += 1;
        	total -= 1;
        }else if(x>startX +48*3 && y>startY2+35 && x<startX+43+48*3 && y<startY2 + buttonHight +35 && total>0){
        	xiangjiao += 1;
        	total -= 1;
        }else if(x>startX +48*4 && y>startY2+35 && x<startX+43+48*4 && y<startY2 + buttonHight +35 && total>0){
        	caomei += 1;
        	total -= 1;
        }else if(x>startX +48*5 && y>startY2+35 && x<startX+43+48*5 && y<startY2 + buttonHight +35 && total>0){
        	yingtao += 1;
        	total -= 1;
        }else if(x>startX && y>startY2+35 +70 && x<startX+43 && y<startY2 + buttonHight +35 +70&& total>0){
        	lizi += 1;
        	total -= 1;
        }else if(x>startX +48 && y>startY2+35 +70&& x<startX+43+48 && y<startY2 + buttonHight +35+70 && total>0){
        	huolongguo += 1;
        	total -= 1;
        }else if(x>startX + 48*4 && y>startY2 + 70 && x<startX+48*4+43 && y<startY2 + buttonHight + 70){
        	total += 10;
        }else if(x>startX + 48*4 && y>startY2 + 70+35 && x<startX+48*4+43 && y<startY2 + buttonHight + 70+35){
        	startInit();
        }else if(x>startX + 48*5 && y>startY2 + 70 && x<startX+48*6+43 && y<startY2 + buttonHight + 70){
        	/*
        	 * 如果选择退币
        	 * 则提示获得了多少的金币
        	 * 金币和积分的比值是1：10
        	*/
        	Toast.makeText(this.getContext(), "恭喜您获得了"+total/10+"金币", Toast.LENGTH_LONG).show();
        	/*
        	 * 
        	 * 及时把total清零
        	 * 防止第二次游戏开始时累计了第一次的金币数值
        	 * 
        	*/
        	total = 0;
        }else if(x>startX + 48*5 && y>startY2 + 70+35 && x<startX+48*6+43 && y<startY2 + buttonHight + 70+35){
        	try {
        		
        	/*
        	 * 点击退出按钮时
        	 * 退出游戏
        	 * 	
        	*/	
        		System.exit(0);
			} catch (Throwable e) {
				e.printStackTrace();
			}
        }
    
    }

    

    /**
     * startInit()用于检查是否已经投注
     * <p>用随机数生成转动的步数<br>
     * 初始化游戏开始时的界面选择框的位置为樱桃的位置<br>
     * 如果没投注，但点击了开始游戏，则提示"请投注"
     * @return 没有返回值
     * 
    */
    private void startInit(){
    	if(pingguo != 0 || boluo != 0|| putao != 0 || xiangjiao != 0|| caomei != 0 ||
    	yingtao != 0 || lizi != 0|| huolongguo != 0){
    		/*
    		 * 初始化选项框的位置
    		 * 赋值为0，即为樱桃位置
    		*/
    		imageChecked = 0;
    		/*
    		 * 控制游戏开始
    		*/
    		start = true;
    		/*
    		 * 生成一个随机数
    		 * 把它加上基数120赋值给count
    		 * 
    		*/
        	Random r = new Random();
    		count = r.nextInt(11) + 120;//初始化参数
    	}else{
    		/*
    		 * 如果没有投注，点击了开始按钮，则提示"请投注"
    		*/
    		Toast.makeText(this.getContext(), "请投注！", Toast.LENGTH_LONG).show();
    		
    	}
    	
    }

    
    /**
     * endInit()将选择框里面的数值清零
     * <p>将选择框里面的数值清零，等待下一次游戏开始<br>
     * @return 没有返回值
     * 
    */
    private void endInit(){
    	pingguo = 0;
    	boluo = 0;
    	putao = 0;
    	xiangjiao = 0;
    	caomei = 0;
    	yingtao = 0;
    	lizi = 0;
    	huolongguo = 0;
    	count = 0;
    }
    

    
    /**
     * start()启动线程
     * <p>初始化游戏数据,启动线程<br>
     * @return 没有返回值
    */
    private void start() {
		init();
		new Handler().post(this);
		//new Thread(this).start();
	}


    /**
     * run()线程
     * <p>调用线程<br>
     * @return 没有返回值
    */
	public void run() {
		/*try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/	
		postInvalidate();
		/*
		 * 线程刷新，休息speed秒就刷新一次
		*/
		postDelayed(this, speed);
		
	}
	
	/*
	 * changeSpeed()改变选项框转动速度
	 * <p>改变选项框的转动速度<br>
	 * 如果转动的剩余圈数大于6时，就开始减速<br>
	 * 如果剩余圈数小于5，就开始加速
	*/
	private void changeSpeed(){
		if(count/12 > 6){
			speed -= 20;
		}
		if(count/12 < 5 && count>0){
			speed += 20;
		}		
	}
}
