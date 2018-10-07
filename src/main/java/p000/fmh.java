package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: fmh */
final class fmh implements bbf {
    /* renamed from: a */
    private final fjl f24276a;

    fmh(fjl fjl) {
        this.f24276a = fjl;
    }

    public final void close() {
        this.f24276a.close();
    }

    /* JADX WARNING: Missing block: B:20:0x0050, code:
            if (r0 != null) goto L_0x0052;
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            r0.mo1896a();
     */
    /* JADX WARNING: Missing block: B:24:0x0056, code:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x0057, code:
            p000.kqg.m5105a(r1, r0);
     */
    /* renamed from: d */
    private final p000.fkp m16006d() {
        /*
        r6 = this;
        r1 = 1;
        r0 = r6.f24276a;
        r0 = r0.mo12344a();
        r0 = (p000.fjj) r0;
        r2 = r0.mo13247a();	 Catch:{ all -> 0x004d }
        if (r2 != 0) goto L_0x0028;
    L_0x000f:
        r1 = new fkp;	 Catch:{ all -> 0x004d }
        r2 = new iux;	 Catch:{ all -> 0x004d }
        r4 = r0.mo13251e();	 Catch:{ all -> 0x004d }
        r2.<init>(r4);	 Catch:{ all -> 0x004d }
        r3 = r0.mo13250d();	 Catch:{ all -> 0x004d }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x0026;
    L_0x0023:
        r0.mo1896a();
    L_0x0026:
        r0 = r1;
    L_0x0027:
        return r0;
    L_0x0028:
        r2 = r0.mo13247a();	 Catch:{ all -> 0x004d }
        if (r2 != r1) goto L_0x004b;
    L_0x002e:
        p000.jri.m13405b(r1);	 Catch:{ all -> 0x004d }
        r2 = new fkp;	 Catch:{ all -> 0x004d }
        r1 = r0.mo13252f();	 Catch:{ all -> 0x004d }
        r1 = p000.jri.m13404b(r1);	 Catch:{ all -> 0x004d }
        r1 = (p000.iwz) r1;	 Catch:{ all -> 0x004d }
        r3 = r0.mo13250d();	 Catch:{ all -> 0x004d }
        r2.<init>(r1, r3);	 Catch:{ all -> 0x004d }
        if (r0 == 0) goto L_0x0049;
    L_0x0046:
        r0.mo1896a();
    L_0x0049:
        r0 = r2;
        goto L_0x0027;
    L_0x004b:
        r1 = 0;
        goto L_0x002e;
    L_0x004d:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r2 = move-exception;
        if (r0 == 0) goto L_0x0055;
    L_0x0052:
        r0.mo1896a();	 Catch:{ all -> 0x0056 }
    L_0x0055:
        throw r2;
    L_0x0056:
        r0 = move-exception;
        p000.kqg.m5105a(r1, r0);
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: fmh.d():fkp");
    }

    /* renamed from: b */
    public final boolean mo12345b() {
        return this.f24276a.mo12345b();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo12346c() {
        boolean z = true;
        fjj fjj = (fjj) this.f24276a.mo12346c();
        if (fjj == null) {
            return null;
        }
        if (fjj.mo13247a() == 0) {
            fjj.mo1896a();
            return null;
        }
        if (fjj.mo13247a() != 1) {
            z = false;
        }
        jri.m13405b(z);
        return new fkp((iwz) jri.m13404b(fjj.mo13252f()), fjj.mo13250d());
    }
}
