package p000;

import java.util.Collection;

/* renamed from: fyf */
final /* synthetic */ class fyf implements Runnable {
    /* renamed from: a */
    private final fyd f5050a;
    /* renamed from: b */
    private final bbi f5051b;
    /* renamed from: c */
    private final kpw f5052c;

    fyf(fyd fyd, bbi bbi, kpw kpw) {
        this.f5050a = fyd;
        this.f5051b = bbi;
        this.f5052c = kpw;
    }

    public final void run() {
        fyd fyd = this.f5050a;
        bbi bbi = this.f5051b;
        knk knk = this.f5052c;
        Collection collection = (bbo) bbi.mo12351c();
        if (collection != null) {
            fyd.mo13304a(collection);
        } else if (bbi.mo12348a() != null) {
            Throwable a = bbi.mo12348a();
            jri.m13404b((Object) a);
            knk.mo15642a(a);
        } else {
            knk.mo15642a(new isr());
        }
        synchronized (fyd.f18891a) {
            fyd.f18892b.remove(bbi);
        }
        knk.mo15641a(Boolean.valueOf(true));
    }
}
