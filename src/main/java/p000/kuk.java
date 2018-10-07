package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kuk */
final class kuk implements Iterator {
    /* renamed from: a */
    private Iterator f8949a = this.f8950b.f22013a.iterator();
    /* renamed from: b */
    private final /* synthetic */ kui f8950b;

    kuk(kui kui) {
        this.f8950b = kui;
    }

    public final boolean hasNext() {
        return this.f8949a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f8949a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
