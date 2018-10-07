package p000;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: hwt */
public final class hwt {
    /* renamed from: a */
    private static final Object f7153a = new Object();
    /* renamed from: b */
    private static hwt f7154b;

    private hwt() {
    }

    /* renamed from: a */
    public static hwt m3624a() {
        synchronized (f7153a) {
            if (f7154b == null) {
                f7154b = new hwt();
            }
        }
        return f7154b;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public static void m3625a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public static boolean m3626a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        return component != null ? htl.m3482a(context, component.getPackageName()) : false;
    }

    /* renamed from: b */
    public static void m3627b() {
    }

    /* renamed from: c */
    public static void m3628c() {
    }
}
