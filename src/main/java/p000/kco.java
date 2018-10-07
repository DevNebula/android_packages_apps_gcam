package p000;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kco */
final class kco extends AbstractCollection {
    /* renamed from: a */
    private final /* synthetic */ kcm f8573a;

    kco(kcm kcm) {
        this.f8573a = kcm;
    }

    public final void clear() {
        this.f8573a.mo9927c();
    }

    public final boolean contains(Object obj) {
        return this.f8573a.mo13939c(obj);
    }

    public final Iterator iterator() {
        return this.f8573a.mo13947j();
    }

    public final int size() {
        return this.f8573a.mo9929i();
    }
}
