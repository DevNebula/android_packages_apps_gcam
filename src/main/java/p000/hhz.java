package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hhz */
public final class hhz {
    /* renamed from: a */
    public static Object m3210a(Object obj) {
        if (obj == null) {
            hhz.m3213a(new NullPointerException());
        }
        return obj;
    }

    /* renamed from: a */
    public static void m3212a() {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        hhz.m3214a(z, "This should be running on the main thread.");
    }

    /* renamed from: a */
    public static void m3214a(boolean z, String str) {
        if (!z) {
            hhz.m3213a(new IllegalStateException(str));
        }
    }

    /* renamed from: a */
    public static int m3207a(float f) {
        return Math.round(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
    }

    /* renamed from: a */
    public static String m3211a(long j) {
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1);
        long toMinutes = TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1);
        if (TimeUnit.MILLISECONDS.toHours(j) > 0) {
            return String.format("%1d:%02d:%02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(toMinutes), Long.valueOf(toSeconds)});
        }
        return String.format("%1d:%02d", new Object[]{Long.valueOf(toMinutes), Long.valueOf(toSeconds)});
    }

    /* renamed from: a */
    public static int m3208a(View view) {
        if (view.getParent() == view.getRootView()) {
            return view.getLeft();
        }
        return hhz.m3208a((View) view.getParent()) + view.getLeft();
    }

    /* renamed from: b */
    public static int m3215b(View view) {
        if (view.getParent() == view.getRootView()) {
            return view.getTop();
        }
        return hhz.m3215b((View) view.getParent()) + view.getTop();
    }

    /* renamed from: c */
    public static int[] m3216c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: d */
    public static View m3217d(View view) {
        view.setLayoutParams(new LayoutParams(-1, -1));
        return view;
    }

    /* renamed from: a */
    public static PackageInfo m3209a(PackageManager packageManager, Context context) {
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable e) {
            throw new IllegalStateException("getPackageInfo for getPackageName should always succeed.", e);
        }
    }

    /* renamed from: a */
    private static void m3213a(RuntimeException runtimeException) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", runtimeException);
    }
}
