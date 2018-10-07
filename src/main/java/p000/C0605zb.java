package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: zb */
final class C0605zb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Handler f10067a;
    /* renamed from: b */
    private final /* synthetic */ C0624zx f10068b;
    /* renamed from: c */
    private final /* synthetic */ C0800yu f10069c;

    C0605zb(C0800yu c0800yu, Handler handler, C0624zx c0624zx) {
        this.f10069c = c0800yu;
        this.f10067a = handler;
        this.f10068b = c0624zx;
    }

    public final void run() {
        Object obj = null;
        aah aah = this.f10069c;
        C0802zf c0802zf = aah.f22452a.f22444d;
        Handler handler = this.f10067a;
        C0624zx c0624zx = this.f10068b;
        if (!(handler == null || aah == null || c0624zx == null)) {
            obj = new C0597yq(handler, aah, c0624zx);
        }
        c0802zf.obtainMessage(303, obj).sendToTarget();
    }
}
