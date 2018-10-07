package p000;

/* compiled from: PG */
/* renamed from: ivj */
public final class ivj extends iwy {
    /* renamed from: a */
    private final Object f26547a = new Object();
    /* renamed from: b */
    private boolean f26548b = false;
    /* renamed from: c */
    private boolean f26549c = false;
    /* renamed from: d */
    private int f26550d = 0;

    public ivj(ixe ixe) {
        super(ixe);
    }

    /* JADX WARNING: Missing block: B:15:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:16:?, code:
            return;
     */
    public final void close() {
        /*
        r2 = this;
        r1 = r2.f26547a;
        monitor-enter(r1);
        r0 = r2.f26549c;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.f26548b;	 Catch:{ all -> 0x001c }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
    L_0x000c:
        return;
    L_0x000d:
        r0 = 1;
        r2.f26548b = r0;	 Catch:{ all -> 0x001c }
        r0 = r2.f26550d;	 Catch:{ all -> 0x001c }
        if (r0 != 0) goto L_0x001a;
    L_0x0014:
        r0 = 1;
        r2.f26549c = r0;	 Catch:{ all -> 0x001c }
        super.close();	 Catch:{ all -> 0x001c }
    L_0x001a:
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        goto L_0x000c;
    L_0x001c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001c }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ivj.close():void");
    }

    /* renamed from: b */
    final void mo15562b() {
        synchronized (this.f26547a) {
            this.f26550d--;
            if (this.f26548b && !this.f26549c && this.f26550d == 0) {
                this.f26549c = true;
                super.close();
            }
        }
    }

    /* renamed from: a */
    public final iwz mo13756a(long j) {
        synchronized (this.f26547a) {
            if (this.f26548b || this.f26549c) {
                throw new isr("Cannot dequeueInputImage from a closed ImageWriter");
            }
            try {
                iwz a = super.mo13756a(j);
                this.f26550d++;
                iwz ivk = new ivk(this, a);
                return ivk;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}
