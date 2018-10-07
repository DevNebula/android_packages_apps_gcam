package p000;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: apv */
public final class apv {
    /* renamed from: a */
    public final C0691ih f870a = new C0691ih();
    /* renamed from: b */
    private final AtomicReference f871b = new AtomicReference();

    /* renamed from: a */
    public final List mo1668a(Class cls, Class cls2) {
        Object arp;
        List list;
        arp arp2 = (arp) this.f871b.getAndSet(null);
        if (arp2 == null) {
            arp = new arp(cls, cls2);
        } else {
            arp2.mo1759a(cls, cls2, null);
            arp arp3 = arp2;
        }
        synchronized (this.f870a) {
            list = (List) this.f870a.get(arp3);
        }
        this.f871b.set(arp3);
        return list;
    }
}
