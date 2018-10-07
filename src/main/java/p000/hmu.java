package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hmu */
public final class hmu {
    /* renamed from: a */
    public final List f6738a = new ArrayList();
    /* renamed from: b */
    public volatile iqm f6739b = iqm.CLOCKWISE_0;

    hmu() {
    }

    /* renamed from: a */
    final synchronized void mo7963a(Runnable runnable) {
        this.f6738a.add(runnable);
    }

    /* renamed from: a */
    final synchronized void mo7962a(iqm iqm) {
        this.f6739b = iqm;
    }
}
