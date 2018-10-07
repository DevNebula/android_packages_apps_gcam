package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: yx */
final class C0601yx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f10057a;
    /* renamed from: b */
    private final /* synthetic */ aag f10058b;
    /* renamed from: c */
    private final /* synthetic */ C0800yu f10059c;

    C0601yx(C0800yu c0800yu, Handler handler, aag aag) {
        this.f10059c = c0800yu;
        this.f10057a = handler;
        this.f10058b = aag;
    }

    public final void run() {
        aah aah = this.f10059c;
        aah.f22452a.f22444d.obtainMessage(104, C0613zk.m6317a(this.f10057a, aah, this.f10058b)).sendToTarget();
    }
}
