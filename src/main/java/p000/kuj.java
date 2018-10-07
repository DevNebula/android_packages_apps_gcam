package p000;

import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kuj */
final class kuj implements ListIterator {
    /* renamed from: a */
    private ListIterator f8946a = this.f8948c.f22013a.listIterator(this.f8947b);
    /* renamed from: b */
    private final /* synthetic */ int f8947b;
    /* renamed from: c */
    private final /* synthetic */ kui f8948c;

    kuj(kui kui, int i) {
        this.f8948c = kui;
        this.f8947b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f8946a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f8946a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f8946a.next();
    }

    public final int nextIndex() {
        return this.f8946a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f8946a.previous();
    }

    public final int previousIndex() {
        return this.f8946a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
