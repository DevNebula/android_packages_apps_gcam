package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jhw */
final class jhw implements Iterator {
    /* renamed from: a */
    private int f8211a = 0;
    /* renamed from: b */
    private final /* synthetic */ jhv f8212b;

    jhw(jhv jhv) {
        this.f8212b = jhv;
    }

    public final boolean hasNext() {
        return this.f8211a < this.f8212b.f8210a.length;
    }

    public final /* synthetic */ Object next() {
        int[] iArr = this.f8212b.f8210a;
        int i = this.f8211a;
        this.f8211a = i + 1;
        return Integer.valueOf(iArr[i]);
    }

    public final void remove() {
        throw new UnsupportedOperationException("IntSets are immutable!");
    }
}
