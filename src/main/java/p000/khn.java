package p000;

import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: khn */
abstract class khn extends khm implements ListIterator {
    khn(ListIterator listIterator) {
        super(listIterator);
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.f8655a).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.f8655a).nextIndex();
    }

    public final Object previous() {
        return mo9987a(((ListIterator) this.f8655a).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.f8655a).previousIndex();
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
