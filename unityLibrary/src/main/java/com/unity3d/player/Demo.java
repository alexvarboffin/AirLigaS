package com.unity3d.player;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public class Demo {
    String a ="https://wheel-slot.ru/lander/policy/index.html#";


//    private Boolean isNetworkAvailable(Application application) {
//        ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            Network nw = connectivityManager.getActiveNetwork();
//            if (nw == null) return false;
//            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
//            return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
//        } else {
//            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
//            return nwInfo != null && nwInfo.isConnected();
//        }
//    }

}
