package p000;

/* compiled from: PG */
/* renamed from: klr */
public final class klr extends kvf {
    /* renamed from: a */
    public int f25288a;
    /* renamed from: b */
    public boolean f25289b;

    public klr() {
        this.f25288a = 0;
        this.f25289b = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25288a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        if (this.f25289b) {
            return computeSerializedSize + (kvd.m5484b(16) + 1);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.klr m16950a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0015;
            case 16: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.mo10480c();
        r6.f25289b = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r2 < 0) goto L_0x0022;
    L_0x001f:
        r3 = 2;
        if (r2 <= r3) goto L_0x0043;
    L_0x0022:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 37;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = " is not a valid enum State";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0043:
        r6.f25288a = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: klr.a(kvc):klr");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25288a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        boolean z = this.f25289b;
        if (z) {
            kvd.mo10491a(2, z);
        }
        super.writeTo(kvd);
    }
}
