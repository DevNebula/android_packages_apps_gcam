package p000;

/* compiled from: PG */
/* renamed from: kjy */
public final class kjy extends kvf {
    /* renamed from: a */
    public int f25031a;
    /* renamed from: b */
    public int f25032b;
    /* renamed from: c */
    public kmd f25033c;
    /* renamed from: d */
    public klr f25034d;
    /* renamed from: e */
    private long f25035e;

    public kjy() {
        this.f25031a = 0;
        this.f25032b = 0;
        this.f25035e = 0;
        this.f25033c = null;
        this.f25034d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25031a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25032b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        long j = this.f25035e;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        kvl kvl = this.f25033c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(10, kvl);
        }
        kvl = this.f25034d;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(11, kvl);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kjy m16918a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x004e;
            case 16: goto L_0x0037;
            case 24: goto L_0x0030;
            case 82: goto L_0x001f;
            case 90: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f25034d;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new klr;
        r0.<init>();
        r6.f25034d = r0;
    L_0x0019:
        r0 = r6.f25034d;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r6.f25033c;
        if (r0 != 0) goto L_0x002a;
    L_0x0023:
        r0 = new kmd;
        r0.<init>();
        r6.f25033c = r0;
    L_0x002a:
        r0 = r6.f25033c;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x0030:
        r0 = r7.mo10486g();
        r6.f25035e = r0;
        goto L_0x0000;
    L_0x0037:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0046 }
        r2 = p000.klh.m16941b(r2);	 Catch:{ IllegalArgumentException -> 0x0046 }
        r6.f25032b = r2;	 Catch:{ IllegalArgumentException -> 0x0046 }
        goto L_0x0000;
    L_0x0046:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x004e:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r2 < 0) goto L_0x005c;
    L_0x0058:
        r3 = 10;
        if (r2 <= r3) goto L_0x007d;
    L_0x005c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = 43;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = " is not a valid enum ControlType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0075:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x007d:
        r6.f25031a = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kjy.a(kvc):kjy");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25031a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25032b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        long j = this.f25035e;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        kvl kvl = this.f25033c;
        if (kvl != null) {
            kvd.mo10496b(10, kvl);
        }
        kvl = this.f25034d;
        if (kvl != null) {
            kvd.mo10496b(11, kvl);
        }
        super.writeTo(kvd);
    }
}
