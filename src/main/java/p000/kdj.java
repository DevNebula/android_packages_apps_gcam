package p000;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kdj */
final class kdj extends AbstractCollection {
    /* renamed from: a */
    private final /* synthetic */ kdb f8597a;

    kdj(kdb kdb) {
        this.f8597a = kdb;
    }

    public final void clear() {
        this.f8597a.clear();
    }

    public final Iterator iterator() {
        return new kde(this.f8597a);
    }

    public final int size() {
        return this.f8597a.f8584e;
    }
}
