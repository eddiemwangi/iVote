package ltd.pvt.tagore_6.navigationapp.utils;


import android.content.Context;
import android.net.ConnectivityManager;
import android.support.annotation.NonNull;
/**
 * Created by Aman on 6/19/2017.
 */
public class InternetConnection {
    /** CHECK WHETHER INTERNET CONNECTION IS AVAILABLE OR NOT */
    public static boolean checkConnection(@NonNull Context context) {
        return  ((ConnectivityManager) context.getSystemService
                (Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }
}
