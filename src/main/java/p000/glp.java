package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: glp */
final class glp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ glq f5621a;
    /* renamed from: b */
    private final /* synthetic */ glo f5622b;

    glp(glo glo, glq glq) {
        this.f5622b = glo;
        this.f5621a = glq;
    }

    public final void run() {
        synchronized (this.f5622b.f19286a) {
            for (String str : this.f5622b.f19286a.keySet()) {
                gkr gkr = (gkr) this.f5622b.f19286a.get(str);
                this.f5621a.mo7207a((Uri) jri.m13404b(gkr.mo13386o()), gkr.mo13382k(), null);
                this.f5621a.mo7206a((Uri) jri.m13404b(gkr.mo13386o()), gkr.mo13380i());
                this.f5621a.mo7208a((Uri) jri.m13404b(gkr.mo13386o()), gkr.mo13381j());
            }
        }
    }
}
