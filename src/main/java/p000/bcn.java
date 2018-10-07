package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bcn */
public final class bcn {
    /* renamed from: a */
    private final List f1102a = new ArrayList();

    /* renamed from: a */
    public final void mo1900a(ilp ilp, Object obj) {
        synchronized (this.f1102a) {
            this.f1102a.add(new bcm(ilp, obj));
        }
    }

    /* renamed from: a */
    public final void mo1899a() {
        synchronized (this.f1102a) {
            for (bcm bcm : this.f1102a) {
                bcm.f1100a.mo8826a(bcm.f1101b);
            }
        }
    }
}
