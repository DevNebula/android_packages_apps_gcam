package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kbb */
final class kbb extends kaz {
    /* renamed from: b */
    private final /* synthetic */ kaz f21842b;

    kbb(kaz kaz, kaz kaz2) {
        this.f21842b = kaz;
        super(kaz2);
    }

    /* renamed from: a */
    public final Appendable mo9691a(Appendable appendable, Iterator it) {
        Object next;
        jri.m13391a((Object) appendable, (Object) "appendable");
        jri.m13391a((Object) it, (Object) "parts");
        while (it.hasNext()) {
            next = it.next();
            if (next != null) {
                appendable.append(this.f21842b.mo9692a(next));
                break;
            }
        }
        while (it.hasNext()) {
            next = it.next();
            if (next != null) {
                appendable.append(this.f21842b.f8544a);
                appendable.append(this.f21842b.mo9692a(next));
            }
        }
        return appendable;
    }

    /* renamed from: b */
    public final kaz mo9695b(String str) {
        throw new UnsupportedOperationException("already specified skipNulls");
    }

    /* renamed from: c */
    public final kbc mo9696c(String str) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}
