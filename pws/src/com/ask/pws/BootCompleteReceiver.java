package com.ask.pws;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompleteReceiver extends BroadcastReceiver {

	public static String PWS_SERVICE_NAME = "com.ask.pws.PhoneWatchingService";
	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Intent intent = new Intent();
		intent.setAction(PWS_SERVICE_NAME);
		arg0.startService(intent);
	}

}
