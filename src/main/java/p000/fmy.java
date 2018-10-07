package p000;

/* compiled from: PG */
/* renamed from: fmy */
final class fmy extends iww implements fnf {
    /* renamed from: a */
    private final Object f26375a = new Object();
    /* renamed from: b */
    private boolean f26376b = false;
    /* renamed from: c */
    private fyr f26377c;
    /* renamed from: d */
    private final /* synthetic */ fmw f26378d;

    fmy(fmw fmw, iwz iwz, fyr fyr) {
        this.f26378d = fmw;
        super(iwz);
        this.f26377c = fyr;
    }

    /* JADX WARNING: Missing block: B:10:0x0014, code:
            super.close();
     */
    /* JADX WARNING: Missing block: B:19:?, code:
            return;
     */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f26375a;
        monitor-enter(r1);
        r0 = r2.f26376b;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r2.f26376b = r0;	 Catch:{ all -> 0x0018 }
        r0 = r2.f26377c;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r0.close();	 Catch:{ all -> 0x0018 }
    L_0x0013:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        super.close();
        goto L_0x0008;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fmy.close():void");
    }

    /* renamed from: h */
    public final void mo14900h() {
        synchronized (this.f26375a) {
            jri.m13406b(this.f26376b ^ 1, (Object) "Cannot submit image back to ImageWriter. It is already closed.");
            this.f26378d.f18471a.add((fyr) jri.m13404b(this.f26377c));
            this.f26377c = null;
            this.f26378d.f18472b.mo13757a((iwz) this);
            close();
        }
    }
}
