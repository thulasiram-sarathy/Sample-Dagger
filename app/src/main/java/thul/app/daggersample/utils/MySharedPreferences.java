package thul.app.daggersample.utils;

import android.content.SharedPreferences;

import javax.inject.Inject;

public class MySharedPreferences {
    private SharedPreferences mSharedPreferences;

    @Inject
    public MySharedPreferences(SharedPreferences mSharedPreferences) {
        this.mSharedPreferences = mSharedPreferences;
    }

    public void putData(String key, String data) {
        mSharedPreferences.edit().putString(key,data).apply();
    }

    public int getData(String key) {
        return mSharedPreferences.getInt(key,0);
    }
}
