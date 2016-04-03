package org.me.myandroidstuff;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.Log;
import android.view.View;

public class CustomDrawView extends View 
{
	private ShapeDrawable shape;
	
	public CustomDrawView(Context context)
	{
		super(context);
		
		int x = 10;
	    int y = 10;
	    int width = 200;
	    int height = 50;

	    shape = new ShapeDrawable(new OvalShape());
	    shape.getPaint().setColor(0xff74AC23);
	    shape.setBounds(x, y, x + width, y + height);
	    Log.e("e","In View constructor");
	}
	
	protected void onDraw(Canvas canvas) 
	{
		 Log.e("e","In onDraw");
	     shape.draw(canvas);
	}
	
} // End of class
