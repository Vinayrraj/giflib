package com.abhi.gif.lib.example;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.abhi.gif.R;
import com.abhi.gif.lib.AnimatedGifImageView;
import com.abhi.gif.lib.AnimatedGifImageView.TYPE;

public class MainActivity extends FragmentActivity implements OnClickListener {
	
	private AnimatedGifImageView animatedGifImageView;
	boolean switchMe = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gif_main);
		animatedGifImageView = ((AnimatedGifImageView)findViewById(R.id.animatedGifImageView));
		animatedGifImageView.setAnimatedGif(R.raw.animated_gif,
				TYPE.FIT_CENTER);
		((Button) findViewById(R.id.button1)).setOnClickListener(this);
		switchMe = true;
	}

	@Override
	public void onClick(View v) {
		if (!switchMe)
			animatedGifImageView.setAnimatedGif(R.raw.animated_gif_big,
					TYPE.STREACH_TO_FIT);
		else
			animatedGifImageView.setImageResource(R.drawable.ic_launcher);
		switchMe = !switchMe;
	}
}
