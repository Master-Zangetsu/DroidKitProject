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

    private final boolean loadingBar;
    private final int loadingTime;
    private final Drawable background;
    private final Drawable logo;

    private LoadingKit(LoadingKit builder) {
        this.loadingBar = builder.loadingBar;
        this.loadingTime = builder.loadingTime;
        this.background = builder.background;
        this.logo = builder.logo;
    }

    public static class LoadingBuilder {
        private final boolean loadingBar;
        private final int loadingTime;
        private final Drawable background;
        private final Drawable logo;

        public LoadingBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public LoadingBuilder age(int age) {
            this.age = age;
            return this;
        }

        public LoadingBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public LoadingBuilder address(String address) {
            this.address = address;
            return this;
        }

        public LoadingKit build() {
            return new LoadingKit(this);
        }

    }

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
}
