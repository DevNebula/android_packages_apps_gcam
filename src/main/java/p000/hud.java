package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;

/* renamed from: hud */
public final class hud extends hue {
    @Deprecated
    /* renamed from: a */
    public static Dialog m12224a(int i, Activity activity) {
        if (hue.m3519a((Context) activity, i)) {
            i = 18;
        }
        return hua.m12220a(activity, i, 0, null);
    }

    /* renamed from: a */
    public static Resources m12225a(Context context) {
        return hue.m3522c(context);
    }

    @Deprecated
    /* renamed from: b */
    public static int m12226b(Context context) {
        return hue.m3524e(context);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m12227b(int i, Activity activity) {
        if (hue.m3519a((Context) activity, i)) {
            i = 18;
        }
        return hua.f20814a.mo13571b(activity, i, 0, null);
    }
}
