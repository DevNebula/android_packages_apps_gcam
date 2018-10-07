package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kca */
final class kca implements Iterator {
    /* renamed from: a */
    private final Iterator f8554a = this.f8556c.f21855a.entrySet().iterator();
    /* renamed from: b */
    private Collection f8555b;
    /* renamed from: c */
    private final /* synthetic */ kby f8556c;

    kca(kby kby) {
        this.f8556c = kby;
    }

    public final boolean hasNext() {
        return this.f8554a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f8554a.next();
        this.f8555b = (Collection) entry.getValue();
        kby kby = this.f8556c;
        Object key = entry.getKey();
        return khb.m4957c(key, kby.f21856b.mo15067a(key, (Collection) entry.getValue()));
    }

    public final void remove() {
        boolean z;
        if (this.f8555b != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8554a.remove();
        kbv.m16782b(this.f8556c.f21856b, this.f8555b.size());
        this.f8555b.clear();
        this.f8555b = null;
    }
}
