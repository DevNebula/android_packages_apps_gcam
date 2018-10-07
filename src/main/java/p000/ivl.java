package p000;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ivl */
public final class ivl implements ijk {
    /* renamed from: a */
    public final iqz f21308a;
    /* renamed from: b */
    public final ikb f21309b;
    /* renamed from: c */
    public final isq f21310c;
    /* renamed from: d */
    public final kpw f21311d = kpw.m18486d();
    /* renamed from: e */
    public final kpw f21312e = kpw.m18486d();
    /* renamed from: f */
    private final kpk f21313f;
    /* renamed from: g */
    private final List f21314g;
    /* renamed from: h */
    private final ivr f21315h;
    /* renamed from: i */
    private final kbg f21316i;
    /* renamed from: j */
    private final ivx f21317j;
    /* renamed from: k */
    private final ird f21318k;
    /* renamed from: l */
    private final Executor f21319l;
    /* renamed from: m */
    private final Object f21320m = new Object();
    /* renamed from: n */
    private boolean f21321n = false;

    public ivl(ikb ikb, kpk kpk, Set set, ivr ivr, ira ira, isq isq, kbg kbg, ivx ivx, ird ird, Executor executor) {
        this.f21309b = ikb;
        this.f21313f = kpk;
        this.f21314g = ken.m13713a((Collection) set);
        this.f21315h = ivr;
        this.f21310c = isq;
        this.f21316i = kbg;
        this.f21317j = ivx;
        this.f21318k = ird;
        this.f21319l = executor;
        this.f21308a = ira.mo8854a("CmrCptrSssnCrtr");
    }

    /* JADX WARNING: Missing block: B:7:0x000b, code:
            r1 = new java.util.ArrayList();
            r2 = r5.f21314g.iterator();
     */
    /* JADX WARNING: Missing block: B:9:0x001a, code:
            if (r2.hasNext() == false) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:10:0x001c, code:
            r1.add(((p000.ivs) r2.next()).f7864a);
     */
    /* JADX WARNING: Missing block: B:11:0x0028, code:
            r1 = p000.kow.m13872a(r1);
            r2 = new java.util.ArrayList();
            r3 = r5.f21314g.iterator();
     */
    /* JADX WARNING: Missing block: B:13:0x003b, code:
            if (r3.hasNext() == false) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:14:0x003d, code:
            r0 = (p000.ivs) r3.next();
     */
    /* JADX WARNING: Missing block: B:15:0x0047, code:
            if (r0.mo9109b() == false) goto L_0x0037;
     */
    /* JADX WARNING: Missing block: B:16:0x0049, code:
            r2.add(r0.mo9108a());
     */
    /* JADX WARNING: Missing block: B:17:0x0051, code:
            r0 = p000.kow.m13872a(r2);
            r1 = p000.iel.m3774a(r5.f21313f, r1, new p000.ivm(r5), r5.f21319l);
            p000.iel.m3775a(r1, r0, new p000.ivn(r5));
            p000.kow.m13878a(r1, new p000.ivo(r5), p000.kpq.f8776a);
     */
    /* JADX WARNING: Missing block: B:29:?, code:
            return r5.f21311d;
     */
    /* renamed from: a */
    public final p000.kpk mo8560a() {
        /*
        r5 = this;
        r1 = r5.f21320m;
        monitor-enter(r1);
        r0 = r5.f21321n;	 Catch:{ all -> 0x007b }
        if (r0 != 0) goto L_0x0077;
    L_0x0007:
        r0 = 1;
        r5.f21321n = r0;	 Catch:{ all -> 0x007b }
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r5.f21314g;
        r2 = r0.iterator();
    L_0x0016:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0028;
    L_0x001c:
        r0 = r2.next();
        r0 = (p000.ivs) r0;
        r0 = r0.f7864a;
        r1.add(r0);
        goto L_0x0016;
    L_0x0028:
        r1 = p000.kow.m13872a(r1);
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r5.f21314g;
        r3 = r0.iterator();
    L_0x0037:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0051;
    L_0x003d:
        r0 = r3.next();
        r0 = (p000.ivs) r0;
        r4 = r0.mo9109b();
        if (r4 == 0) goto L_0x0037;
    L_0x0049:
        r0 = r0.mo9108a();
        r2.add(r0);
        goto L_0x0037;
    L_0x0051:
        r0 = p000.kow.m13872a(r2);
        r2 = r5.f21313f;
        r3 = new ivm;
        r3.<init>(r5);
        r4 = r5.f21319l;
        r1 = p000.iel.m3774a(r2, r1, r3, r4);
        r2 = new ivn;
        r2.<init>(r5);
        p000.iel.m3775a(r1, r0, r2);
        r0 = new ivo;
        r0.<init>(r5);
        r2 = p000.kpq.f8776a;
        p000.kow.m13878a(r1, r0, r2);
        r0 = r5.f21311d;
    L_0x0076:
        return r0;
    L_0x0077:
        r0 = r5.f21311d;	 Catch:{ all -> 0x007b }
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        goto L_0x0076;
    L_0x007b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x007b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivl.a():kpk");
    }

    /* renamed from: a */
    private static List m12797a(List list) {
        List b = khb.m4945b();
        for (iwt b2 : list) {
            Object b3 = b2.mo13738b();
            jri.m13391a(b3, (Object) "Surface must not be null when adding to surface list.");
            b.add(b3);
        }
        return b;
    }
}
