package p000;

import android.os.Looper;

/* renamed from: ieg */
public final class ieg {
    /* renamed from: a */
    public volatile Object f7336a;
    /* renamed from: b */
    public final iei f7337b;
    /* renamed from: c */
    private final ieh f7338c;

    ieg(Looper looper, Object obj, String str) {
        this.f7338c = new ieh(this, looper);
        this.f7336a = htl.m3489b(obj, (Object) "Listener must not be null");
        this.f7337b = new iei(obj, htl.m3460a(str));
    }

    /* renamed from: a */
    public final void mo8404a(iej iej) {
        htl.m3489b((Object) iej, (Object) "Notifier must not be null");
        this.f7338c.sendMessage(this.f7338c.obtainMessage(1, iej));
    }
}
