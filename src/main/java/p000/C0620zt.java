package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: zt */
public final class C0620zt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f10100a;
    /* renamed from: b */
    private final /* synthetic */ Handler f10101b;
    /* renamed from: c */
    private final /* synthetic */ C0625zy f10102c;
    /* renamed from: d */
    private final /* synthetic */ C0619zs f10103d;

    public C0620zt(C0619zs c0619zs, int i, Handler handler, C0625zy c0625zy) {
        this.f10103d = c0619zs;
        this.f10100a = i;
        this.f10101b = handler;
        this.f10102c = c0625zy;
    }

    public final void run() {
        this.f10103d.mo11593c().obtainMessage(1, this.f10100a, 0, C0805zz.m14879a(this.f10101b, this.f10102c)).sendToTarget();
    }
}
