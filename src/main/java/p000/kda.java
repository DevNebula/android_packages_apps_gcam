package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kda */
public final class kda extends AbstractCollection {
    /* renamed from: a */
    private final Collection f8578a;
    /* renamed from: b */
    private final kaw f8579b;

    public kda(Collection collection, kaw kaw) {
        this.f8578a = (Collection) jri.m13404b((Object) collection);
        this.f8579b = (kaw) jri.m13404b((Object) kaw);
    }

    public final void clear() {
        this.f8578a.clear();
    }

    public final boolean isEmpty() {
        return this.f8578a.isEmpty();
    }

    public final Iterator iterator() {
        return khb.m4925a(this.f8578a.iterator(), this.f8579b);
    }

    public final int size() {
        return this.f8578a.size();
    }
}
