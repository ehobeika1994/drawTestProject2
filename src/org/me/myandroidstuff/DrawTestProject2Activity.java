package org.me.myandroidstuff;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class DrawTestProject2Activity extends Activity 
{
	private LinearLayout toplevel;
	private CustomDrawView aView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        toplevel = (LinearLayout)findViewById(R.id.topView);
        aView = new CustomDrawView(this);
        toplevel.addView(aView);
        
    }

} // End of class