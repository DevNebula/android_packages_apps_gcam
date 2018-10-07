package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: xx */
final class C0585xx implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ C0624zx f10027a;
    /* renamed from: b */
    public final /* synthetic */ Handler f10028b;
    /* renamed from: c */
    private final /* synthetic */ C0788xt f10029c;

    C0585xx(C0788xt c0788xt, C0624zx c0624zx, Handler handler) {
        this.f10029c = c0788xt;
        this.f10027a = c0624zx;
        this.f10028b = handler;
    }

    public final void run() {
        Object c0790xy;
        if (this.f10027a != null) {
            c0790xy = new C0790xy(this);
        } else {
            c0790xy = null;
        }
        this.f10029c.f22395c.f22380b.obtainMessage(303, c0790xy).sendToTarget();
    }
}
