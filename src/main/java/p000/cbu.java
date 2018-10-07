package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;

/* compiled from: PG */
/* renamed from: cbu */
public final class cbu {
    /* renamed from: a */
    public final Context f1865a;

    cbu(Context context) {
        this.f1865a = context;
    }

    /* renamed from: a */
    public static Object m1124a(Context context, String str) {
        try {
            System.currentTimeMillis();
            return context.getSystemService(str);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public final ActivityManager mo2250a() {
        return (ActivityManager) cbu.m1124a(this.f1865a, "activity");
    }

    /* renamed from: b */
    public final SensorManager mo2251b() {
        return (SensorManager) cbu.m1124a(this.f1865a, "sensor");
    }
}
