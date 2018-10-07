package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dnj */
final class dnj implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f3367a;
    /* renamed from: b */
    private final /* synthetic */ dni f3368b;

    dnj(dni dni, List list) {
        this.f3368b = dni;
        this.f3367a = list;
    }

    public final void run() {
        bgl bgl;
        this.f3368b.f14214a.f24018e.close();
        if (this.f3367a.isEmpty()) {
            bgl = null;
        } else {
            bgl = (bgl) this.f3367a.get(0);
        }
        this.f3368b.f14214a.f1623a.mo2154a(new dlt(bgl));
    }
}
