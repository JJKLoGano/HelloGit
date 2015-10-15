package com.jjklogano.hellogit;

import android.app.Application;
import com.beardedhen.androidbootstrap.TypefaceProvider;

/**
 * Created<br/>
 * Author : LoGano(贾璟琨)<br/>
 * Email : mengpangzhi@hotmial.com<br/>
 * Date : 2015/10/15<br/>
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceProvider.registerDefaultIconSets();
    }
}
