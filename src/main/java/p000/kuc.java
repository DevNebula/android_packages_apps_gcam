package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kuc */
final class kuc implements Iterator {
    /* renamed from: a */
    private int f8934a = -1;
    /* renamed from: b */
    private boolean f8935b;
    /* renamed from: c */
    private Iterator f8936c;
    /* renamed from: d */
    private final /* synthetic */ ktu f8937d;

    kuc(ktu ktu) {
        this.f8937d = ktu;
    }

    /* renamed from: a */
    private final Iterator m5357a() {
        if (this.f8936c == null) {
            this.f8936c = this.f8937d.f8918b.entrySet().iterator();
        }
        return this.f8936c;
    }

    public final boolean hasNext() {
        boolean z = true;
        if (this.f8934a + 1 >= this.f8937d.f8917a.size()) {
            if (this.f8937d.f8918b.isEmpty()) {
                z = false;
            } else if (!m5357a().hasNext()) {
                return false;
            }
        }
        return z;
    }

    public final /* synthetic */ Object next() {
        this.f8935b = true;
        int i = this.f8934a + 1;
        this.f8934a = i;
        if (i < this.f8937d.f8917a.size()) {
            return (Entry) this.f8937d.f8917a.get(this.f8934a);
        }
        return (Entry) m5357a().next();
    }

    public final void remove() {
        if (this.f8935b) {
            this.f8935b = false;
            this.f8937d.mo10372a();
            if (this.f8934a < this.f8937d.f8917a.size()) {
                ktu ktu = this.f8937d;
                int i = this.f8934a;
                this.f8934a = i - 1;
                ktu.mo10375c(i);
                return;
            }
            m5357a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
