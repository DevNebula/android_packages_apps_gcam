package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bcs */
public abstract class bcs implements ijk {
    /* renamed from: a */
    public static final String f11179a = bli.m887a("PreInitializer");
    /* renamed from: b */
    public final aws f11180b;
    /* renamed from: c */
    public volatile kpw f11181c;
    /* renamed from: d */
    private final Object f11182d;
    /* renamed from: e */
    private final Executor f11183e;
    /* renamed from: f */
    private volatile boolean f11184f;

    /* renamed from: c */
    public abstract void mo12354c();

    public bcs(aws aws) {
        this(aws, null);
    }

    public bcs(aws aws, Executor executor) {
        this.f11184f = false;
        this.f11180b = aws;
        this.f11183e = executor;
        this.f11182d = new Object();
        this.f11181c = kpw.m18486d();
    }

    /* renamed from: b */
    public final void mo12353b() {
        this.f11181c.mo15641a(Boolean.valueOf(true));
    }

    /* JADX WARNING: Missing block: B:9:0x000f, code:
            r0 = r2.f11183e;
     */
    /* JADX WARNING: Missing block: B:10:0x0011, code:
            if (r0 == null) goto L_0x001e;
     */
    /* JADX WARNING: Missing block: B:11:0x0013, code:
            r0.execute(new p000.bct(r2));
     */
    /* JADX WARNING: Missing block: B:13:0x001e, code:
            mo12354c();
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            return r2.f11181c;
     */
    /* renamed from: a */
    public final p000.kpk mo8560a() {
        /*
        r2 = this;
        r1 = r2.f11182d;
        monitor-enter(r1);
        r0 = r2.f11184f;	 Catch:{ all -> 0x0022 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f11181c;	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = 1;
        r2.f11184f = r0;	 Catch:{ all -> 0x0022 }
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        r0 = r2.f11183e;
        if (r0 == 0) goto L_0x001e;
    L_0x0013:
        r1 = new bct;
        r1.<init>(r2);
        r0.execute(r1);
    L_0x001b:
        r0 = r2.f11181c;
        goto L_0x000a;
    L_0x001e:
        r2.mo12354c();
        goto L_0x001b;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bcs.a():kpk");
    }
}
