package uk.co.nightshiftgroup.droidkitproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.nightshiftgroup.droidkit.LoadingKit;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    private void test() {
        LoadingKit.with().setLoadingBar(true).setLoadingTime(5000);
    }
}
