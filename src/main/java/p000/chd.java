package p000;

/* compiled from: PG */
/* renamed from: chd */
final class chd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ chc f2161a;

    chd(chc chc) {
        this.f2161a = chc;
    }

    public final void run() {
        chc chc = this.f2161a;
        chc.f2158c.removeCallbacks(chc.f2159d);
        che che = chc.f2160e;
        if (che != null) {
            che.f2162a.setEnabled(true);
            chc.f2160e = null;
        }
        if (chc.f2157b == C0252go.f5779E) {
            chc.f2156a.mo2307a(chw.A11Y_BUTTON, true);
        }
        chc.f2157b = C0252go.f5778D;
    }
}
