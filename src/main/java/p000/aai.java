package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: aai */
public final class aai implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f13a;
    /* renamed from: b */
    private final /* synthetic */ C0625zy f14b;
    /* renamed from: c */
    private final /* synthetic */ aah f15c;

    public aai(aah aah, Handler handler, C0625zy c0625zy) {
        this.f15c = aah;
        this.f13a = handler;
        this.f14b = c0625zy;
    }

    public final void run() {
        this.f15c.mo20b().obtainMessage(3, this.f15c.mo22c(), 0, C0805zz.m14879a(this.f13a, this.f14b)).sendToTarget();
    }
}
