package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kfh */
public final class kfh extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final kaw f8635a;
    /* renamed from: b */
    private final List f8636b;

    public kfh(List list, kaw kaw) {
        this.f8636b = (List) jri.m13404b((Object) list);
        this.f8635a = (kaw) jri.m13404b((Object) kaw);
    }

    public final void clear() {
        this.f8636b.clear();
    }

    public final Object get(int i) {
        return this.f8635a.mo9689a(this.f8636b.get(i));
    }

    public final boolean isEmpty() {
        return this.f8636b.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new kfi(this, this.f8636b.listIterator(i));
    }

    public final Object remove(int i) {
        return this.f8635a.mo9689a(this.f8636b.remove(i));
    }

    public final int size() {
        return this.f8636b.size();
    }
}
