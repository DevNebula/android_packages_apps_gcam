package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: yv */
final class C0599yv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f10051a;
    /* renamed from: b */
    private final /* synthetic */ aag f10052b;
    /* renamed from: c */
    private final /* synthetic */ C0800yu f10053c;

    C0599yv(C0800yu c0800yu, Handler handler, aag aag) {
        this.f10053c = c0800yu;
        this.f10051a = handler;
        this.f10052b = aag;
    }

    public final void run() {
        aah aah = this.f10053c;
        aah.f22452a.f22444d.obtainMessage(107, C0613zk.m6317a(this.f10051a, aah, this.f10052b)).sendToTarget();
    }
}
