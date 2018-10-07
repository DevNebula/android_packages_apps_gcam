package p000;

/* compiled from: PG */
/* renamed from: iuz */
public final class iuz extends iww {
    /* renamed from: a */
    private int f26535a;

    public iuz(iwz iwz) {
        this(iwz, 1);
    }

    public iuz(iwz iwz, int i) {
        boolean z;
        super(iwz);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Initial reference count must be greater than zero!");
        this.f26535a = i;
    }

    public final void close() {
        mo15558j();
    }

    /* renamed from: h */
    public final iwz mo13195a() {
        synchronized (this) {
            int i = this.f26535a;
            if (i > 0) {
                this.f26535a = i + 1;
                iwz iva = new iva(this);
                return iva;
            }
            return null;
        }
    }

    /* renamed from: i */
    public final int mo15557i() {
        int i;
        synchronized (this) {
            i = this.f26535a;
        }
        return i;
    }

    /* JADX WARNING: Missing block: B:8:0x000f, code:
            if (r1 != 0) goto L_0x0015;
     */
    /* JADX WARNING: Missing block: B:9:0x0011, code:
            super.close();
     */
    /* JADX WARNING: Missing block: B:19:?, code:
            return true;
     */
    /* JADX WARNING: Missing block: B:20:?, code:
            return false;
     */
    /* renamed from: j */
    public final boolean mo15558j() {
        /*
        r2 = this;
        r0 = 1;
        monitor-enter(r2);
        r1 = r2.f26535a;	 Catch:{ all -> 0x0017 }
        if (r1 > 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
    L_0x0007:
        return r0;
    L_0x0008:
        r1 = r1 + -1;
        r2.f26535a = r1;	 Catch:{ all -> 0x0017 }
        r1 = r2.f26535a;	 Catch:{ all -> 0x0017 }
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        if (r1 != 0) goto L_0x0015;
    L_0x0011:
        super.close();
        goto L_0x0007;
    L_0x0015:
        r0 = 0;
        goto L_0x0007;
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0017 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: iuz.j():boolean");
    }

    public final String toString() {
        String kbd;
        synchronized (this) {
            kbd a = jqk.m13350b((Object) this).mo9701a("refCount", this.f26535a);
            a.mo9704a().f8551b = super.toString();
            kbd = a.toString();
        }
        return kbd;
    }
}
