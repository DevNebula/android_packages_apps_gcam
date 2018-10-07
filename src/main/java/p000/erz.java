package p000;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.hardware.SensorManager;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: erz */
public final class erz {
    /* renamed from: a */
    public static final ezk f4414a = new ezk();

    static {
        bli.m887a("PhotoSphereHelper");
    }

    /* renamed from: a */
    public static ezk m2143a(Context context, Uri uri) {
        String a;
        ContentResolver contentResolver = context.getContentResolver();
        if ("content".equals(uri.getScheme())) {
            a = eio.m1802a(contentResolver, uri);
        } else {
            a = uri.getPath();
        }
        if (a == null) {
            return f4414a;
        }
        ery a2 = ery.m2138a(a);
        if (a2 == null) {
            return f4414a;
        }
        return new ezk(a2);
    }

    /* renamed from: a */
    public static boolean m2145a(Context context, SensorManager sensorManager, ActivityManager activityManager) {
        if (!ije.m3836a(context.getContentResolver(), "camera:lightcycle_enabled", true) || sensorManager.getSensorList(4).size() <= 0 || erz.m2144a(activityManager)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m2144a(ActivityManager activityManager) {
        try {
            return activityManager.isLowRamDevice();
        } catch (NoSuchMethodError e) {
            return false;
        }
    }
}
