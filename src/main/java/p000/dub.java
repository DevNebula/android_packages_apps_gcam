package p000;

import android.util.Pair;

/* compiled from: PG */
/* renamed from: dub */
final class dub implements dva, ikz {
    /* renamed from: a */
    private static final String f24078a = bli.m887a("LazySMProcssor");
    /* renamed from: b */
    private final Object f24079b = new Object();
    /* renamed from: c */
    private iwz f24080c = null;
    /* renamed from: d */
    private iwp f24081d = null;
    /* renamed from: e */
    private boolean f24082e = false;

    dub() {
    }

    /* JADX WARNING: Missing block: B:14:?, code:
            return;
     */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f24079b;
        monitor-enter(r1);
        r0 = r2.f24082e;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r2.f24082e = r0;	 Catch:{ all -> 0x001b }
        r0 = r2.f24080c;	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0019;
    L_0x0010:
        r0.close();	 Catch:{ all -> 0x001b }
        r0 = 0;
        r2.f24080c = r0;	 Catch:{ all -> 0x001b }
        r0 = 0;
        r2.f24081d = r0;	 Catch:{ all -> 0x001b }
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0008;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dub.close():void");
    }

    /* renamed from: a */
    public final synchronized kbg mo13056a() {
        kbg b;
        synchronized (this.f24079b) {
            b = kbg.m4803b(this.f24080c);
            this.f24080c = null;
        }
        return b;
    }

    /* renamed from: t_ */
    public final String mo8597t_() {
        return f24078a;
    }

    /* JADX WARNING: Missing block: B:22:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo13057a(p000.fkp r4, p000.iwp r5) {
        /*
        r3 = this;
        r1 = r3.f24079b;
        monitor-enter(r1);
        r0 = r3.f24082e;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x000e;
    L_0x0007:
        if (r4 == 0) goto L_0x000c;
    L_0x0009:
        r4.close();	 Catch:{ all -> 0x0022 }
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
    L_0x000d:
        return;
    L_0x000e:
        if (r4 == 0) goto L_0x0025;
    L_0x0010:
        r0 = r4.mo15530i();	 Catch:{ all -> 0x0022 }
        if (r0 != 0) goto L_0x0025;
    L_0x0016:
        r0 = f24078a;	 Catch:{ all -> 0x0022 }
        r2 = "No Image Data! Ignoring the metering frames.";
        p000.bli.m898e(r0, r2);	 Catch:{ all -> 0x0022 }
        r4.close();	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        goto L_0x000d;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        throw r0;
    L_0x0025:
        r0 = r3.f24080c;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r0.close();	 Catch:{ all -> 0x0022 }
    L_0x002c:
        r3.f24080c = r4;	 Catch:{ all -> 0x0022 }
        r3.f24081d = r5;	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: dub.a(fkp, iwp):void");
    }

    /* renamed from: c */
    public final kbn mo13058c() {
        kbn a;
        synchronized (this.f24079b) {
            a = jqk.m13342a(Pair.create(null, this.f24081d));
        }
        return a;
    }
}
