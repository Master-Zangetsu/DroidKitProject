package uk.co.nightshiftgroup.droidkit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/**
 * Created by rmuldoon on 02/06/2016.
 */
public class LoadingKit {

    static boolean loadingBar;
    static int loadingTime;
    static Drawable background;
    static Drawable logo;

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

    public LoadingKit setLoadingBar(Boolean result) {
        loadingBar = result;
        return this;
    }

    public LoadingKit setLoadingTime(int result) {
        loadingTime = result;
        return this;
    }

    public LoadingKit addBackground(Drawable result) {
        background = result;
        return this;
    }

    public LoadingKit addLogo(Drawable result) {
        logo = result;
        return this;
    }
}
