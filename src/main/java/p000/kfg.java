package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kfg */
final class kfg implements ListIterator {
    /* renamed from: a */
    private boolean f8632a;
    /* renamed from: b */
    private final /* synthetic */ ListIterator f8633b;
    /* renamed from: c */
    private final /* synthetic */ kff f8634c;

    kfg(kff kff, ListIterator listIterator) {
        this.f8634c = kff;
        this.f8633b = listIterator;
    }

    public final void add(Object obj) {
        this.f8633b.add(obj);
        this.f8633b.previous();
        this.f8632a = false;
    }

    public final boolean hasNext() {
        return this.f8633b.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.f8633b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.f8632a = true;
            return this.f8633b.previous();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f8634c.mo9882a(this.f8633b.nextIndex());
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.f8632a = true;
            return this.f8633b.next();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        jri.m13406b(this.f8632a, (Object) "no calls to next() since the last call to remove()");
        this.f8633b.remove();
        this.f8632a = false;
    }

    public final void set(Object obj) {
        jri.m13405b(this.f8632a);
        this.f8633b.set(obj);
    }
}
