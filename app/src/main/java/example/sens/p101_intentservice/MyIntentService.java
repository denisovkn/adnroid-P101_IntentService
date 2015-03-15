package example.sens.p101_intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import java.util.concurrent.TimeUnit;



public class MyIntentService extends IntentService {



    final String LOG_TAG = "myLogs";



    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(LOG_TAG, "onCreate");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onHandleIntent(Intent intent) {


        int tm = intent.getIntExtra("time",0 );
        String label =  intent.getStringExtra("label");
        Log.d(LOG_TAG, "onHandleIntent start " + label);

        try {
            TimeUnit.SECONDS.sleep(tm);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(LOG_TAG, "onHandleIntent end " + label);



    }





}
