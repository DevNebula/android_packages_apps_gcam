package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kcb */
abstract class kcb implements Iterator {
    /* renamed from: a */
    private final Iterator f8557a;
    /* renamed from: b */
    private Object f8558b = null;
    /* renamed from: c */
    private Collection f8559c = null;
    /* renamed from: d */
    private Iterator f8560d = kfd.f8629a;
    /* renamed from: e */
    private final /* synthetic */ kbv f8561e;

    kcb(kbv kbv) {
        this.f8561e = kbv;
        this.f8557a = kbv.f24899a.entrySet().iterator();
    }

    /* renamed from: a */
    abstract Object mo9720a(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f8557a.hasNext() || this.f8560d.hasNext();
    }

    public Object next() {
        if (!this.f8560d.hasNext()) {
            Entry entry = (Entry) this.f8557a.next();
            this.f8558b = entry.getKey();
            this.f8559c = (Collection) entry.getValue();
            this.f8560d = this.f8559c.iterator();
        }
        return mo9720a(this.f8558b, this.f8560d.next());
    }

    public void remove() {
        this.f8560d.remove();
        if (this.f8559c.isEmpty()) {
            this.f8557a.remove();
        }
        this.f8561e.f24900b = this.f8561e.f24900b - 1;
    }
}
