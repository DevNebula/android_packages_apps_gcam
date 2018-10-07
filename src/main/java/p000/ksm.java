package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ksm */
final class ksm implements Iterator {
    /* renamed from: a */
    private Iterator f8898a;

    public ksm(Iterator it) {
        this.f8898a = it;
    }

    public final boolean hasNext() {
        return this.f8898a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f8898a.next();
        if (entry.getValue() instanceof ksk) {
            return new ksl(entry);
        }
        return entry;
    }

    public final void remove() {
        this.f8898a.remove();
    }
}
