package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* compiled from: PG */
/* renamed from: hcl */
public final class hcl {
    /* renamed from: a */
    public final Object f6343a = new Object();
    /* renamed from: b */
    public final SimpleOnGestureListener f6344b;
    /* renamed from: c */
    public final long f6345c;
    /* renamed from: d */
    public final Handler f6346d;
    /* renamed from: e */
    public final boolean f6347e;
    /* renamed from: f */
    public MotionEvent f6348f = null;
    /* renamed from: g */
    public final Runnable f6349g = new hcm(this);

    public hcl(SimpleOnGestureListener simpleOnGestureListener) {
        this.f6344b = simpleOnGestureListener;
        this.f6345c = 350;
        this.f6346d = new Handler(Looper.getMainLooper());
        this.f6347e = true;
    }
}
