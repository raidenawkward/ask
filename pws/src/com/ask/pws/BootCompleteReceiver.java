package com.ask.pws;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleteReceiver extends BroadcastReceiver {

	public static String PWS_SERVICE_NAME = "com.ask.pws.PhoneWatchingService";
	public static Context context = null;

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Intent intent = new Intent();
		intent.setAction(PWS_SERVICE_NAME);
		context = arg0;
		arg0.startService(intent);
	}

}
