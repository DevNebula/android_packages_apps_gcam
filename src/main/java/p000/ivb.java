package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: ivb */
public final class ivb extends iwx implements ixb {
    /* renamed from: a */
    public final Object f26537a = new Object();
    /* renamed from: b */
    public boolean f26538b;
    /* renamed from: c */
    private boolean f26539c = false;
    /* renamed from: d */
    private int f26540d = 0;

    public ivb(ixb ixb) {
        super(ixb);
    }

    /* JADX WARNING: Missing block: B:17:?, code:
            return null;
     */
    /* renamed from: a */
    public final p000.iwz mo13746a() {
        /*
        r3 = this;
        r1 = r3.f26537a;
        monitor-enter(r1);
        r0 = r3.f26538b;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x0007:
        r0 = r3.f26539c;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x000b:
        r2 = super.mo13746a();	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r3.f26540d;	 Catch:{ all -> 0x0021 }
        r0 = r0 + 1;
        r3.f26540d = r0;	 Catch:{ all -> 0x0021 }
        r0 = new ivd;	 Catch:{ all -> 0x0021 }
        r0.<init>(r3, r2);	 Catch:{ all -> 0x0021 }
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
    L_0x001d:
        return r0;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        r0 = 0;
        goto L_0x001d;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.a():iwz");
    }

    /* JADX WARNING: Missing block: B:17:?, code:
            return null;
     */
    /* renamed from: b */
    public final p000.iwz mo13748b() {
        /*
        r3 = this;
        r1 = r3.f26537a;
        monitor-enter(r1);
        r0 = r3.f26538b;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x0007:
        r0 = r3.f26539c;	 Catch:{ all -> 0x0021 }
        if (r0 != 0) goto L_0x001e;
    L_0x000b:
        r2 = super.mo13748b();	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x001e;
    L_0x0011:
        r0 = r3.f26540d;	 Catch:{ all -> 0x0021 }
        r0 = r0 + 1;
        r3.f26540d = r0;	 Catch:{ all -> 0x0021 }
        r0 = new ivd;	 Catch:{ all -> 0x0021 }
        r0.<init>(r3, r2);	 Catch:{ all -> 0x0021 }
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
    L_0x001d:
        return r0;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        r0 = 0;
        goto L_0x001d;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.b():iwz");
    }

    /* JADX WARNING: Missing block: B:13:?, code:
            return;
     */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f26537a;
        monitor-enter(r1);
        r0 = r2.f26539c;	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f26538b;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 1;
        r2.f26538b = r0;	 Catch:{ all -> 0x0015 }
        r2.mo15560j();	 Catch:{ all -> 0x0015 }
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        goto L_0x000c;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivb.close():void");
    }

    /* renamed from: i */
    final void mo15559i() {
        synchronized (this.f26537a) {
            this.f26540d--;
            if (this.f26538b) {
                mo15560j();
            }
        }
    }

    /* renamed from: j */
    final void mo15560j() {
        if (!this.f26539c) {
            if (this.f26540d == 0) {
                this.f26539c = true;
                super.close();
                return;
            }
            iwz a = super.mo13746a();
            if (a != null) {
                a.close();
            }
            mo13749c();
        }
    }

    /* renamed from: a */
    public final void mo13747a(ixd ixd, Handler handler) {
        super.mo13747a(new ivc(this, ixd), handler);
    }
}
