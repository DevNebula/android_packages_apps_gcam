package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: khz */
public final class khz extends khy implements ListIterator {
    /* renamed from: a */
    private final int f21908a;
    /* renamed from: b */
    private int f21909b;
    /* renamed from: c */
    private final ken f21910c;

    protected khz() {
    }

    private khz(int i, int i2) {
        this();
        jri.m13403b(i2, i);
        this.f21908a = i;
        this.f21909b = i2;
    }

    khz(ken ken, int i) {
        this(ken.size(), i);
        this.f21910c = ken;
    }

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Object m13803a(int i) {
        return this.f21910c.get(i);
    }

    public final boolean hasNext() {
        return this.f21909b < this.f21908a;
    }

    public final boolean hasPrevious() {
        return this.f21909b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f21909b;
            this.f21909b = i + 1;
            return m13803a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f21909b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f21909b - 1;
            this.f21909b = i;
            return m13803a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f21909b - 1;
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
