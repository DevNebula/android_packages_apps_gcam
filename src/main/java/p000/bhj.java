package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bhj */
public final class bhj implements iqo {
    /* renamed from: a */
    public static final String f11385a = bli.m887a("CdrReqPro");
    /* renamed from: b */
    public final AtomicInteger f11386b = new AtomicInteger(0);
    /* renamed from: c */
    public final ivx f11387c;
    /* renamed from: d */
    private final fje f11388d = new fje();
    /* renamed from: e */
    private final iwg f11389e;

    public bhj(iwg iwg) {
        this.f11389e = iwg;
        this.f11387c = ivx.m4327a();
    }

    /* renamed from: a */
    public final void mo12378a() {
        this.f11389e.mo13712a();
    }

    public final void close() {
        this.f11389e.close();
    }

    /* renamed from: a */
    public final iwn mo12377a(int i) {
        return this.f11389e.mo13715b().mo13718a(i);
    }

    /* renamed from: a */
    public final synchronized void mo12379a(fiv fiv, iwn iwn, bhu bhu, fiw fiw) {
        try {
            Map hashMap = new HashMap();
            Object a = this.f11388d.mo6829a();
            hashMap.put(a, fiw);
            iwn.mo9136a(a);
            List a2 = bhu.mo1957a(this.f11389e, iwn);
            if (!a2.isEmpty()) {
                if (fiv == fiv.REPEATING) {
                    this.f11389e.mo13714b(a2, new bhk(this, hashMap), null);
                } else {
                    this.f11389e.mo13711a(a2, new bhk(this, hashMap), null);
                }
            }
        } catch (Throwable e) {
            throw new isr(e);
        }
    }
}
