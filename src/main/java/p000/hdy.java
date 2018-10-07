package p000;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;

/* compiled from: PG */
/* renamed from: hdy */
public final class hdy {
    /* renamed from: a */
    public static hdy f6441a;
    /* renamed from: b */
    private final int f6442b;
    /* renamed from: c */
    private final boolean f6443c;

    private hdy(Context context) {
        this.f6442b = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        this.f6443c = ((Activity) context).isInMultiWindowMode();
    }

    /* renamed from: a */
    public static void m3138a(Context context) {
        if (f6441a == null) {
            f6441a = new hdy(context);
        }
    }

    /* renamed from: b */
    public static int m3139b(Context context) {
        hdy hdy = f6441a;
        if (hdy != null) {
            return hdy.f6442b;
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: c */
    public static boolean m3140c(Context context) {
        hdy hdy = f6441a;
        if (hdy != null) {
            return hdy.f6443c;
        }
        return ((Activity) context).isInMultiWindowMode();
    }
}
