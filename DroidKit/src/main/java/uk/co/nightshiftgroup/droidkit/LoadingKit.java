package uk.co.nightshiftgroup.droidkit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/**
 * Created by rmuldoon on 02/06/2016.
 */
public class LoadingKit {

    public static boolean showLoadingScreen;

    public void completeSplash(long splashTime, final Context context, final Class destination) {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                ((Activity) context).finish();
                Intent intent = new Intent(context, destination);
                context.startActivity(intent);
            }
        }, splashTime);
    }

    public static void setLoadingBar() {

    }
}
