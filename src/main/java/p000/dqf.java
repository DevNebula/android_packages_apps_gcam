package p000;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: dqf */
public final class dqf implements fbj {
    /* renamed from: f */
    private static final AtomicInteger f24047f = new AtomicInteger(0);
    /* renamed from: a */
    public final ikb f24048a;
    /* renamed from: b */
    public final ikv f24049b;
    /* renamed from: c */
    public final kpk f24050c;
    /* renamed from: d */
    public final iqz f24051d;
    /* renamed from: e */
    public kpk f24052e;
    /* renamed from: g */
    private final AtomicBoolean f24053g = new AtomicBoolean(false);
    /* renamed from: h */
    private final dqn f24054h;
    /* renamed from: i */
    private final asn f24055i;
    /* renamed from: j */
    private final fva f24056j;
    /* renamed from: k */
    private final fbp f24057k;
    /* renamed from: l */
    private final Executor f24058l;

    public dqf(ikb ikb, ikv ikv, ikd ikd, fvy fvy, bpn bpn, asn asn, kpk kpk, ilp ilp, ilp ilp2, fva fva, ilp ilp3, ilp ilp4, ilp ilp5, fcm fcm, iqz iqz, Executor executor, ilp ilp6) {
        this.f24048a = ikb;
        this.f24049b = ikv;
        this.f24055i = asn;
        this.f24050c = kpk;
        this.f24056j = fva;
        this.f24054h = new dqn(fvy, ikd, bpn);
        int incrementAndGet = f24047f.incrementAndGet();
        StringBuilder stringBuilder = new StringBuilder(21);
        stringBuilder.append("OneCamera-");
        stringBuilder.append(incrementAndGet);
        this.f24051d = iqz.mo8830a(stringBuilder.toString());
        this.f24058l = executor;
        this.f24052e = null;
        this.f24057k = new fbp(fvy, ilp2, fcm.f18123a, ilp, ilp3, ilp4, ilp5, ilp6);
        this.f24051d.mo8836d("OneCamera created.");
    }

    public final void close() {
        if (this.f24053g.compareAndSet(false, true)) {
            this.f24058l.execute(new dqg(this));
        }
    }

    /* renamed from: a */
    public final fbp mo13214a() {
        return this.f24057k;
    }

    /* renamed from: c */
    public final boolean mo13216c() {
        return this.f24048a.mo13666a();
    }

    /* renamed from: d */
    public final kpk mo13217d() {
        this.f24051d.mo8836d("One camera starting.");
        fva fva = this.f24056j;
        Iterable arrayList = new ArrayList();
        for (ijk a : fva.f4960a) {
            arrayList.add(a.mo8560a());
        }
        kpk a2 = kow.m13876a(kny.m18475a(kow.m13872a(arrayList), fvb.f18815a, kpq.f8776a));
        synchronized (this) {
            this.f24052e = bbz.m812a(this.f24051d, a2, "OneCamera started.", "OneCamera failed to start!");
            a2 = this.f24052e;
        }
        return a2;
    }

    /* renamed from: a */
    public final kpk mo13215a(fbk fbk, gkr gkr) {
        dqn dqn = this.f24054h;
        fvy fvy = dqn.f3405a;
        ikd ikd = dqn.f3406b;
        fwa fwa = new fwa(fbk, gkr, new fvz(fbk, ikd, gkr), new fwd(fbk, gkr, ikd, dqn.f3407c));
        if (!((Boolean) fvy.f4969b.mo9689a().mo13673b()).booleanValue() || fvy.f4968a.mo6773a()) {
            iqz iqz = fvy.f4970c;
            String valueOf = String.valueOf(fvy.f4969b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 74);
            stringBuilder.append("Take picture was invoked, but the picture taker is not available! Command ");
            stringBuilder.append(valueOf);
            iqz.mo8834c(stringBuilder.toString());
            fwa.f4984d.close();
            fwa.f4983c.mo6926a();
            return kow.m13873a(Boolean.valueOf(false));
        }
        boolean z;
        kpw d = kpw.m18486d();
        ilb ilb = fvy.f4972e;
        if (fvy.f4973f.incrementAndGet() > 0) {
            z = true;
        } else {
            z = false;
        }
        ilb.mo8826a(Boolean.valueOf(z));
        fvy.f4971d.m2973a();
        fvy.f4968a.mo6772a(new fwp(fvy, new fwm(fvy, d), fwa));
        return d;
    }

    /* renamed from: a */
    public final aub mo1782a(asw asw) {
        return this.f24055i.mo1782a(asw);
    }
}
