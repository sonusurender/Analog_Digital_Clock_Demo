package com.analog_digital_clock_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.AnalogClock;
import android.widget.DigitalClock;

import com.android_analog_n_digital_clock_demo.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Just find both ID and it will automatically get the current device
		// timing and set time
		findViewById(R.id.analogClock1);
		findViewById(R.id.digitalClock1);

	}

}
