package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ijl */
public final class ijl implements iqo {
    /* renamed from: a */
    public final iqo f21002a;
    /* renamed from: b */
    public int f21003b;
    /* renamed from: c */
    public final ikq f21004c;
    /* renamed from: d */
    public final Object f21005d;
    /* renamed from: e */
    public final Runnable f21006e;
    /* renamed from: f */
    public boolean f21007f = false;

    public ijl(iqo iqo, Executor executor, ikq ikq) {
        this.f21002a = iqo;
        this.f21004c = ikq;
        this.f21005d = new Object();
        this.f21003b = 0;
        this.f21006e = new ijo(new ijm(this), executor);
    }

    /* JADX WARNING: Missing block: B:20:?, code:
            return new p000.ijn(r2);
     */
    /* renamed from: a */
    public final p000.iqo mo13665a() {
        /*
        r2 = this;
        r1 = r2.f21005d;
        monitor-enter(r1);
        r0 = r2.f21007f;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x000a;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        r0 = 0;
    L_0x0009:
        return r0;
    L_0x000a:
        r0 = r2.f21003b;	 Catch:{ all -> 0x001e }
        r0 = r0 + 1;
        r2.f21003b = r0;	 Catch:{ all -> 0x001e }
        r0 = r2.f21004c;	 Catch:{ all -> 0x001e }
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        r0.mo13670a();	 Catch:{ all -> 0x001e }
    L_0x0017:
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        r0 = new ijn;
        r0.<init>(r2);
        goto L_0x0009;
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ijl.a():iqo");
    }

    /* JADX WARNING: Missing block: B:10:0x0014, code:
            r2.f21002a.close();
     */
    /* JADX WARNING: Missing block: B:19:?, code:
            return;
     */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f21005d;
        monitor-enter(r1);
        r0 = r2.f21007f;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r2.f21007f = r0;	 Catch:{ all -> 0x001a }
        r0 = r2.f21004c;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r0.mo13670a();	 Catch:{ all -> 0x001a }
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        r0 = r2.f21002a;
        r0.close();
        goto L_0x0008;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ijl.close():void");
    }
}
