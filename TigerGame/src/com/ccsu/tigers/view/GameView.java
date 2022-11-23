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
	 * image0��������һ��ӣ��ͼƬ��Դ
	*/
	private Bitmap image0;
	/**
	 * image1��������һ��ƻ��ͼƬ��Դ
	*/
	private Bitmap image1;
	/**
	 * image2��������һ�Ų���ͼƬ��Դ
	*/
	private Bitmap image2;
	/**
	 * image3��������һ�Ų�ݮͼƬ��Դ
	*/
	private Bitmap image3;
	/**
	 * image4��������һ���㽶ͼƬ��Դ
	*/
	private Bitmap image4;
	/**
	 * image5��������һ������ͼƬ��Դ
	*/
	private Bitmap image5;
	/**
	 * image6��������һ��ƻ��ͼƬ��Դ
	*/
	private Bitmap image6;
	/**
	 * image7��������һ�Ų�ݮͼƬ��Դ
	*/
	private Bitmap image7;
	/**
	 * image8��������һ�Ż�����ͼƬ��Դ
	*/
	private Bitmap image8;
	/**
	 * image9��������һ���㽶ͼƬ��Դ
	*/
	private Bitmap image9;
	/**
	 * image10��������һ������ͼƬ��Դ
	*/
	private Bitmap image10;
	/**
	 * image11��������һ������ͼƬ��Դ
	*/
	private Bitmap image11;
	/*private Bitmap image12;
	  private Bitmap image13;
	*/
	/**
	 * image14��������һ�ű���ͼƬ��Դ
	*/
	private Bitmap image14;
	
	/*public MediaPlayer music1=null;
	public MediaPlayer music2=null;
	*/
	/**
	 * music3�Ǵ���һ����Ϸ��ʼ�󷽿�任ʱ������
	*/
	public MediaPlayer music3=null;
	/**
	 * music4�Ǵ���һ����Ϸ�����������
	*/
	public MediaPlayer music4=null;
	//public MediaPlayer music5=null;
	/**
	 * mPaint��һ����������
	*/
	Paint mPaint;
	/**
	 * totchX�Ǵ��������X
	*/
	float totchX;
	/**
	 * totchY�Ǵ���������Y
	*/
	float totchY;
	/**
	 * startX��ǻ�ͼƬʱ�ĺ�����X
	*/
	int startX;	
	/**
	 * startY��ǻ�ͼƬʱ��������Y
	*/
	int startY;
	/**
	 * imageSize��ʾͼƬ��С
	*/
	int imageSize;
	/**
	 * startX2��ǻ�ѡ���ʱ�ĺ�����X
	*/
	int startX2;
	/**
	 * startY2��ǻ�ѡ���ʱ��������Y
	*/
	int startY2;
	/**
	 * buttonWidth��ʾѡ���Ŀ��
	*/
	int buttonWidth;
	/**
	 * buttonHight��ʾѡ���ĸ߶�
	*/
	int buttonHight;
	/**
	 * pingguo��¼Ͷע��ƻ�������ע��
	*/
	int pingguo = 0;
	/**
	 * boluo��¼Ͷע�ڲ��������ע��
	*/
	int boluo = 0;
	/**
	 * putao��¼Ͷע�����������ע��
	*/
	int putao = 0;
	/**
	 * xiangjiao��¼Ͷע���㽶�����ע��
	*/
	int xiangjiao = 0;
	/**
	 * caomei��¼Ͷע�ڲ�ݮ�����ע��
	*/
	int caomei = 0;
	/**
	 * yingtao��¼Ͷע��ӣ�������ע��
	*/
	int yingtao = 0;
	/**
	 * lizi��¼Ͷע�����������ע��
	*/
	int lizi = 0;
	/**
	 * huolongguo��¼Ͷע�ڻ����������ע��
	*/
	int huolongguo = 0;
	/**
	 * total��¼�û���֧���ʣ����
	*/
	int total = 0;
    /**
     * �����߳�
	*/
	boolean start = false;
	/**
     * �����ϻ���ת���Ĳ���
	*/
	int count = 0;
	/**
	 * ������Ϸѡ�����λ��
	*/
	int imageChecked = 0;
	/**
     * ����ѡ����ת�����ٶ�
	*/
	int speed = 120;
	
	/**
	 * ��ʾȦ��
	*/
	int counter = 0;
	
	
	
	/**
     * GameView(context)���������������ȡͼƬ��������Դ��
     * <p>image0��image1��image2��image3��image4��image5��13��������ȡͼƬ��Դ<br>
     * music3��music4����������ȡ������Դ
     * @return û�з���ֵ
	*/
	public GameView(Context context) {
		super(context);
       /*		
		*image0��image1��image2��13��������ȡͼƬ��Դ
		*music1��music2����������ȡ������Դ
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
		image14 =((BitmapDrawable)getResources().getDrawable(R.drawable.haha)).getBitmap();//�м�ͼƬ
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
	 *onDraw(Canvas)�����������������Ϸ����������
     *<p>�������ֻ�����Ϸ����<br>
     *��һ���ֻ�����Ϸ������<br>
     *�ڶ����ֻ�����Ϸ������ 	
	 *@param cancas��һ������
	 *@return û�з���ֵ
	*/
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		/*
		 * counter����һ��ʱ���ڵ��ٶ�
		 * ����ߵĲ�������5��ʱ�����changeSpeed()����
		 * ����Ȧ����Ϊ0
		 * ���Ȧ��С��5��ʱ��ÿ���߳�ˢ�£�Ȧ���ͼ�1
		 * 
		*/
		if(counter == 5){
			/*
			 * 
			 *����changeSpeed();
			 *�ı��ٶ�
			 * 
			*/
			changeSpeed();
			counter = 0;
		}else{
			counter ++;
		}
        /*
         * ������Ϸ������������12��ˮ�����м�һ�ű���ͼƬ
        */
		canvas.drawBitmap(image14,startX+imageSize,startY+imageSize,mPaint);//���м�ͼƬ
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
		 * ���û�����ɫΪ��ɫ
		*/
		mPaint.setColor(Color.GRAY);
		/*
		 * ���ĸ�forѭ���������Ų�����Ԫ��ÿһ��������ɫ���ο�
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
		 * ���û�����ɫΪ��ɫ��׼������Ϸѡ��
		*/
		mPaint.setColor(Color.YELLOW);
		/*
		 * ����cancas.drawText()����������2�š���3�š���4���е�ѡ��
		*/
		canvas.drawText("ƻ��", startX+10, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("����", startX+10+48, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("����", startX+10+48*2, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("�㽶", startX+10+48*3, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("��ݮ", startX+10+48*4, startY2 +buttonHight + 5 + 20, mPaint); 
		canvas.drawText("ӣ��", startX+10+48*5, startY2 +buttonHight + 5 + 20, mPaint);
		canvas.drawText("����", startX+10, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("������", startX+5+48, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("����", startX+10+48*2, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("Ͷ��", startX+10+48*4, startY2 +buttonHight + 5 + 20 + 35, mPaint); 
		canvas.drawText("�˱�", startX+10+48*5, startY2 +buttonHight + 5 + 20 + 35, mPaint); 
		canvas.drawText("��ʼ", startX+10+48*4, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		canvas.drawText("�˳�", startX+10+48*5, startY2 +buttonHight + 5 + 20 + 70, mPaint); 
		/*
		 * ���û�����ɫΪ��ɫ��׼������Ϸѡ��
		*/
		mPaint.setColor(Color.RED);
		/*
		 * ����cancas.drawText()��������ѡ���ĸ���ѡ���е�Ͷע��Ŀ
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
		 * ���û�����ɫΪ��ɫ��׼������Ϸѡ����
        */		
		mPaint.setColor(Color.BLUE);
		/*
		 * ���û��ʴ�ϸ��׼������Ϸѡ����
		*/
		mPaint.setStrokeWidth(5);
		/*
		 * ��Ϸ��ʼ����ʼת��ѡ����,��imageChecked����ѡ�����λ��
		 * ��canvas.drawRect()��ѡ����
		 * ��check()�����ж��Ƿ������ת����������Ӧ�ļӽ�����
		*/
		switch (imageChecked){
		case 0:
			/*
			 * ��ѡ����
			*/
			canvas.drawRect(startX, startY,  startX+imageSize,  startY+imageSize, mPaint);
			/*
			 * ��check()�����ж��Ƿ������ת����������Ӧ�ļӽ�����
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
	 * check(int,int)������������ѡ����
	 * <p>�����ж��߳��Ƿ��Ѿ���������������Ϳ�ʼ�ƶ�<br>
	 * �ж�count�Ƿ����0���������0���͸ı�imageChecked��ֵ������ѡ������ƶ�<br>
	 * ����count��1��˵���Ѿ�����һ��<br>
	 * ���������0����˵����Ϸ�Ѿ�������������Ӧ�Ľ�Ҵ������ص��߳�
	 * @param type�ж�ѡ��������������
	 * @param scoreָ��Ӧ�ý��еĴ������
	 * @return û�з���ֵ
	*/
	public void check(int type, int score) {
		/*
		 * ��ѡ������д��������ж�start�Ƿ�Ϊ��
		 * Ҳ�����ж��Ƿ����߳�
		 * ��������߳��ˣ�Ȼ���ж�count����0��Ҳ����ѡ����Ӧ��ת���Ĳ����Ƿ�ת��
		 * ���û��ת�꣬��imageChecked��1��ת����һ��
		 * ���ת�꣬�ͽ�����Ӧ�Ľ�����������������߳�
		*/
		if(start){
			if(count>0){
				if(imageChecked != 11){
					/*
					 *imageChecked��1,ת������һ����Ϸѡ��
					*/
					imageChecked ++;	
				}else{
					/*
					 *imageChecked����0,ת��һ�֣�����ת
					*/
					imageChecked = 0;
				}
				/*
				 *����ת���Ĳ�����ת��һ�κ���Ӧ��ȥ1
				*/
				count--;
				/*
				 * ѡ����ת��ʱ����������
				*/
				music3.start();
			}else{
				/*
				 * ���н�Ҵ���
				*/
				total += type*score;
				/*
				 * �ж��Ƿ��н���
				*/
				if(type*score!=0){
					/*
					 * ��ý���ʱ����������
					*/
					music4.start();
				}
				/*
				 * �ص��߳�
				*/
				start = false;
				/*
				 * ����endInit()�����и�λ����
				*/
				endInit();
			}
		}
	}
	
	
	
	/**
	 *init()����������ʼ������
	 *<p>������Ӧ���Եĳ�ʼֵ<br>
	 *@return û�з���ֵ
	*/
	private void init() {
		/*
		 * ���û���
		 * ���û��ʵķ��Ϊ����
		*/
		mPaint = new Paint();
		mPaint.setStyle(Paint.Style.STROKE);
		/*
		 * ����ͼƬ
		 * ����ͼƬ������X��������Y��ʼֵ
		 * ����ͼƬ��СimageSize��ʼֵ
		*/
		startX = 20;
		startY = 5;
		imageSize = 71;
		/*
		 * ���ò�����ѡ���
		 * ���ò�����ѡ��������X��������Y��ʼֵ
		 * ����ѡ�����buttonWidth�͸߶�buttonHight��ʼֵ
		*/
		startX2 = 10;
		startY2 = startY+imageSize*4+5;
		buttonWidth = 43;
		buttonHight = 30;
	}
	
	
	
	/**
	 * onTouchEvent(MotionEvent)�����������������¼�
	 * <p>������ֻ�����˰��´���<br>
	 * @param event��ʾһ������¼�
	 * @return ����һ��boolean���͵�ֵ
	*/
    public boolean onTouchEvent(MotionEvent event) {
        
    	/*
         *��õ��������
         *x��ʾ�����ĺ�����,��event.getX()���
         *y��ʾ������������ ,��event.getY()���
         *
        */
    	float x = event.getX();
        float y = event.getY();
        /*
         * �жϰ���������
         * ������Ӧ�Ĵ���
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
     * touch_start(float,float)���ڴ���Ͷע�¼�
     * <p>��������totchX,totchY�����Ӧ������,���ڴ�������Ͷע����<br>
     * ������Ӧ�����꣬��Ӧ����Ӧ��ѡ���<br>
     * �����������һ�Σ���ӦͶעһ��
     * @param x��ʾ�����ĺ�����
     * @param y��ʾ������������
     * @return û�з���ֵ
     * 
    */
    private void touch_start(float x, float y) {
    	
    	/*
    	 * touchX��ʾ������ĺ�����
    	 * touchY��ʾ�������������
    	 * 
    	*/
        totchX = x;
        totchY = y;
        //Toast.makeText(this.getContext(), x +"aaa" + y, Toast.LENGTH_LONG).show();

        /*
         * �������Ķ���
         * �����������������if�ж�����е���Ӧ����
         * �ͽ���Ͷע����
         * ��Ӧ��ѡ�����ֵ��1
         * ��������1
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
        	 * ���ѡ���˱�
        	 * ����ʾ����˶��ٵĽ��
        	 * ��Һͻ��ֵı�ֵ��1��10
        	*/
        	Toast.makeText(this.getContext(), "��ϲ�������"+total/10+"���", Toast.LENGTH_LONG).show();
        	/*
        	 * 
        	 * ��ʱ��total����
        	 * ��ֹ�ڶ�����Ϸ��ʼʱ�ۼ��˵�һ�εĽ����ֵ
        	 * 
        	*/
        	total = 0;
        }else if(x>startX + 48*5 && y>startY2 + 70+35 && x<startX+48*6+43 && y<startY2 + buttonHight + 70+35){
        	try {
        		
        	/*
        	 * ����˳���ťʱ
        	 * �˳���Ϸ
        	 * 	
        	*/	
        		System.exit(0);
			} catch (Throwable e) {
				e.printStackTrace();
			}
        }
    
    }

    

    /**
     * startInit()���ڼ���Ƿ��Ѿ�Ͷע
     * <p>�����������ת���Ĳ���<br>
     * ��ʼ����Ϸ��ʼʱ�Ľ���ѡ����λ��Ϊӣ�ҵ�λ��<br>
     * ���ûͶע��������˿�ʼ��Ϸ������ʾ"��Ͷע"
     * @return û�з���ֵ
     * 
    */
    private void startInit(){
    	if(pingguo != 0 || boluo != 0|| putao != 0 || xiangjiao != 0|| caomei != 0 ||
    	yingtao != 0 || lizi != 0|| huolongguo != 0){
    		/*
    		 * ��ʼ��ѡ����λ��
    		 * ��ֵΪ0����Ϊӣ��λ��
    		*/
    		imageChecked = 0;
    		/*
    		 * ������Ϸ��ʼ
    		*/
    		start = true;
    		/*
    		 * ����һ�������
    		 * �������ϻ���120��ֵ��count
    		 * 
    		*/
        	Random r = new Random();
    		count = r.nextInt(11) + 120;//��ʼ������
    	}else{
    		/*
    		 * ���û��Ͷע������˿�ʼ��ť������ʾ"��Ͷע"
    		*/
    		Toast.makeText(this.getContext(), "��Ͷע��", Toast.LENGTH_LONG).show();
    		
    	}
    	
    }

    
    /**
     * endInit()��ѡ����������ֵ����
     * <p>��ѡ����������ֵ���㣬�ȴ���һ����Ϸ��ʼ<br>
     * @return û�з���ֵ
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
     * start()�����߳�
     * <p>��ʼ����Ϸ����,�����߳�<br>
     * @return û�з���ֵ
    */
    private void start() {
		init();
		new Handler().post(this);
		//new Thread(this).start();
	}


    /**
     * run()�߳�
     * <p>�����߳�<br>
     * @return û�з���ֵ
    */
	public void run() {
		/*try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/	
		postInvalidate();
		/*
		 * �߳�ˢ�£���Ϣspeed���ˢ��һ��
		*/
		postDelayed(this, speed);
		
	}
	
	/*
	 * changeSpeed()�ı�ѡ���ת���ٶ�
	 * <p>�ı�ѡ����ת���ٶ�<br>
	 * ���ת����ʣ��Ȧ������6ʱ���Ϳ�ʼ����<br>
	 * ���ʣ��Ȧ��С��5���Ϳ�ʼ����
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
