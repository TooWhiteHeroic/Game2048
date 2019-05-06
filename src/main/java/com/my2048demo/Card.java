package com.my2048demo;


import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

	
	public static int width;
	
	private TextView label;
	
	public Card(Context context) {
		super(context);

		LayoutParams lp = null;

		View background = new View(getContext());
		lp = new LayoutParams(-1, -1);
		lp.setMargins(10, 10, 0, 0);
		background.setBackgroundColor(getResources().getColor(R.color.color0));
		addView(background, lp);

		label = new TextView(getContext());
		label.setTextSize(28);
		label.setTextColor(Color.WHITE);
		label.setGravity(Gravity.CENTER);

		lp = new LayoutParams(-1, -1);
		lp.setMargins(10, 10, 0, 0);
		addView(label, lp);

		setNum(0);
	}


	private int num = 0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;

		if (num<=0) {
			label.setText("");
		}else{
			label.setText(String.valueOf(num));
			
		}

		switch (num) {
		case 0:
			label.setBackgroundColor(getResources().getColor(R.color.color0));
			break;
		case 2:
			label.setBackgroundColor(getResources().getColor(R.color.color2));
			break;
		case 4:
			label.setBackgroundColor(getResources().getColor(R.color.color4));
			break;
		case 8:
			label.setBackgroundColor(getResources().getColor(R.color.color8));
			break;
		case 16:
			label.setBackgroundColor(getResources().getColor(R.color.color16));
			break;
		case 32:
			label.setBackgroundColor(getResources().getColor(R.color.color32));
			break;
		case 64:
			label.setBackgroundColor(getResources().getColor(R.color.color64));
			break;
		case 128:
			label.setBackgroundColor(getResources().getColor(R.color.color128));
			break;
		case 256:
			label.setBackgroundColor(getResources().getColor(R.color.color256));
			break;
		case 512:
			label.setBackgroundColor(getResources().getColor(R.color.color512));
			break;
		case 1024:
			label.setBackgroundColor(getResources().getColor(R.color.color1024));
			break;
		case 2048:
			label.setBackgroundColor(getResources().getColor(R.color.color2048));
			break;
		default:
			label.setBackgroundColor(getResources().getColor(R.color.color0));
			break;
		}
	}

	public boolean equals(Card another) {
		return getNum()==another.getNum();
	}
	
	public TextView getLabel() {
		return label;
	}
	
	public void addScaleAnimation(){
		ScaleAnimation sa = new ScaleAnimation(0.5f, 1, 0.5f, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		sa.setDuration(500);
		setAnimation(null);
		getLabel().startAnimation(sa);
	}

}
