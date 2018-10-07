package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kui */
public final class kui extends AbstractList implements RandomAccess, ksp {
    /* renamed from: a */
    public final ksp f22013a;

    public kui(ksp ksp) {
        this.f22013a = ksp;
    }

    /* renamed from: a */
    public final void mo10291a(kqx kqx) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f22013a.get(i);
    }

    /* renamed from: b */
    public final Object mo10292b(int i) {
        return this.f22013a.mo10292b(i);
    }

    /* renamed from: d */
    public final List mo10293d() {
        return this.f22013a.mo10293d();
    }

    /* renamed from: e */
    public final ksp mo10294e() {
        return this;
    }

    public final Iterator iterator() {
        return new kuk(this);
    }

    public final ListIterator listIterator(int i) {
        return new kuj(this, i);
    }

    public final int size() {
        return this.f22013a.size();
    }
}
