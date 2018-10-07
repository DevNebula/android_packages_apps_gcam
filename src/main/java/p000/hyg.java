package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: hyg */
public final class hyg {
    /* renamed from: a */
    private static SharedPreferences f7186a = null;

    /* renamed from: a */
    public static SharedPreferences m3642a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f7186a == null) {
                f7186a = (SharedPreferences) htl.m3457a(new hyh(context));
            }
            sharedPreferences = f7186a;
        }
        return sharedPreferences;
    }
}
