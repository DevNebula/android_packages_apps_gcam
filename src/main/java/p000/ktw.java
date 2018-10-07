package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ktw */
final class ktw implements Iterator {
    /* renamed from: a */
    private int f8924a = this.f8926c.f8917a.size();
    /* renamed from: b */
    private Iterator f8925b;
    /* renamed from: c */
    private final /* synthetic */ ktu f8926c;

    ktw(ktu ktu) {
        this.f8926c = ktu;
    }

    /* renamed from: a */
    private final Iterator m5355a() {
        if (this.f8925b == null) {
            this.f8925b = this.f8926c.f8920d.entrySet().iterator();
        }
        return this.f8925b;
    }

    public final boolean hasNext() {
        int i = this.f8924a;
        return (i > 0 && i <= this.f8926c.f8917a.size()) || m5355a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m5355a().hasNext()) {
            return (Entry) m5355a().next();
        }
        List list = this.f8926c.f8917a;
        int i = this.f8924a - 1;
        this.f8924a = i;
        return (Entry) list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
