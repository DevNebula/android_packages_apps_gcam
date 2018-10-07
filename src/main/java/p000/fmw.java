package p000;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: fmw */
final class fmw implements fne {
    /* renamed from: a */
    public final BlockingQueue f18471a = new LinkedBlockingQueue();
    /* renamed from: b */
    public final ixe f18472b;
    /* renamed from: c */
    private final fxr f18473c;

    fmw(ixe ixe, ikb ikb, iuw iuw) {
        this.f18472b = ixe;
        this.f18472b.mo13758a(new fmz(this), ijy.m3846a(ikb, "CopyingManagedImageWriter.ImageListener"));
        this.f18473c = (fxr) ikb.mo8557a(new fxr(this.f18472b.mo13755a()));
    }

    /* renamed from: a */
    public final ilp mo6862a() {
        return this.f18473c.f18880a;
    }

    /* renamed from: b */
    public final int mo6863b() {
        return this.f18472b.mo13755a();
    }

    /* renamed from: a */
    public final fng mo6861a(int i) {
        Collection a = fpo.m10808a(this.f18473c, i);
        if (a == null) {
            return null;
        }
        return new fng(this, a);
    }
}
