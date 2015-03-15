package example.sens.p101_intentservice;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }




    public void onClickStart(View view) {

        startService(new Intent(this, MyIntentService.class)
                .putExtra("time", 3)
                .putExtra("label", "Call 1"));

        startService(new Intent(this, MyIntentService.class)
                .putExtra("time", 1)
                .putExtra("label", "Call 2"));

        startService(new Intent(this, MyIntentService.class)
                .putExtra("time", 4)
                .putExtra("label", "Call 3"));
    }
}
