package uk.co.nightshiftgroup.droidkit;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by rmuldoon on 02/06/2016.
 */
public class PrefKit {

    public void savePrefs(String key, boolean value, Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(key, value);
        edit.commit();
    }

    public void savePrefs(String key, String value, Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key, value);
        edit.commit();
    }

    public String getPrefs(String tag, String defaultString, Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        String result = sp.getString(tag, defaultString);
        return result;
    }

    public Boolean getPrefs(String tag, boolean defaultBoolean, Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        boolean result = sp.getBoolean(tag, defaultBoolean);
        return result;
    }
}
