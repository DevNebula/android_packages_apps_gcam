package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fhx */
final class fhx implements fhh {
    /* renamed from: a */
    private final AtomicBoolean f24255a = new AtomicBoolean(false);
    /* renamed from: b */
    private final fhh f24256b;
    /* renamed from: c */
    private final /* synthetic */ fhw f24257c;

    fhx(fhw fhw, fhh fhh) {
        this.f24257c = fhw;
        this.f24256b = fhh;
    }

    public final void close() {
        boolean z = true;
        if (!this.f24255a.getAndSet(true)) {
            int decrementAndGet = this.f24257c.f18302a.decrementAndGet();
            ilb ilb = this.f24257c.f18303b;
            if (decrementAndGet != 0) {
                z = false;
            }
            ilb.mo8826a(Boolean.valueOf(z));
            this.f24256b.close();
        }
    }

    /* renamed from: a */
    public final void mo6816a(List list, fiv fiv) {
        this.f24256b.mo6816a(list, fiv);
    }
}
