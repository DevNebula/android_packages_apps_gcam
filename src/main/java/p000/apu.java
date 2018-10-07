package p000;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: apu */
public final class apu {
    /* renamed from: a */
    public static final agk f867a = new agk(Object.class, Object.class, Object.class, Collections.singletonList(new afk(Object.class, Object.class, Object.class, Collections.emptyList(), new aor(), null)), null);
    /* renamed from: b */
    public final C0691ih f868b = new C0691ih();
    /* renamed from: c */
    private final AtomicReference f869c = new AtomicReference();

    /* renamed from: a */
    public final agk mo1667a(Class cls, Class cls2, Class cls3) {
        arp arp;
        agk agk;
        arp arp2 = (arp) this.f869c.getAndSet(null);
        if (arp2 == null) {
            arp = new arp();
        } else {
            arp = arp2;
        }
        arp.mo1759a(cls, cls2, cls3);
        synchronized (this.f868b) {
            agk = (agk) this.f868b.get(arp);
        }
        this.f869c.set(arp);
        return agk;
    }
}
