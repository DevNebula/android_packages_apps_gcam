package p000;

/* compiled from: PG */
/* renamed from: kkg */
public final class kkg extends kvf {
    /* renamed from: a */
    private int f25126a;
    /* renamed from: b */
    private long f25127b;
    /* renamed from: c */
    private long f25128c;
    /* renamed from: d */
    private long f25129d;
    /* renamed from: e */
    private long f25130e;
    /* renamed from: f */
    private float f25131f;
    /* renamed from: g */
    private boolean f25132g;
    /* renamed from: h */
    private int f25133h;
    /* renamed from: i */
    private long f25134i;
    /* renamed from: j */
    private long f25135j;

    public kkg() {
        this.f25126a = 0;
        this.f25127b = 0;
        this.f25128c = 0;
        this.f25129d = 0;
        this.f25130e = 0;
        this.f25131f = 0.0f;
        this.f25132g = false;
        this.f25133h = 0;
        this.f25134i = 0;
        this.f25135j = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25126a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        long j = this.f25127b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(2, j);
        }
        j = this.f25128c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        j = this.f25129d;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(4, j);
        }
        j = this.f25130e;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(5, j);
        }
        if (Float.floatToIntBits(this.f25131f) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(48) + 4;
        }
        if (this.f25132g) {
            computeSerializedSize += kvd.m5484b(56) + 1;
        }
        i = this.f25133h;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(8, i);
        }
        j = this.f25134i;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(9, j);
        }
        j = this.f25135j;
        if (j != 0) {
            return computeSerializedSize + kvd.m5477a(10, j);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* JADX WARNING: Missing block: B:33:0x00a0, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* renamed from: a */
    private final p000.kkg m16924a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x007b;
            case 16: goto L_0x0074;
            case 24: goto L_0x006d;
            case 32: goto L_0x0066;
            case 40: goto L_0x005f;
            case 53: goto L_0x0054;
            case 56: goto L_0x004d;
            case 64: goto L_0x001c;
            case 72: goto L_0x0015;
            case 80: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.mo10486g();
        r6.f25135j = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.mo10486g();
        r6.f25134i = r0;
        goto L_0x0000;
    L_0x001c:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0042 }
        if (r2 < 0) goto L_0x0029;
    L_0x0026:
        r3 = 2;
        if (r2 <= r3) goto L_0x004a;
    L_0x0029:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0042 }
        r5 = 46;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = " is not a valid enum ImaxResolution";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0042 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0042 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0042 }
    L_0x0042:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x004a:
        r6.f25133h = r2;	 Catch:{ IllegalArgumentException -> 0x0042 }
        goto L_0x0000;
    L_0x004d:
        r0 = r7.mo10480c();
        r6.f25132g = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.mo10481d();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r6.f25131f = r0;
        goto L_0x0000;
    L_0x005f:
        r0 = r7.mo10486g();
        r6.f25130e = r0;
        goto L_0x0000;
    L_0x0066:
        r0 = r7.mo10486g();
        r6.f25129d = r0;
        goto L_0x0000;
    L_0x006d:
        r0 = r7.mo10486g();
        r6.f25128c = r0;
        goto L_0x0000;
    L_0x0074:
        r0 = r7.mo10486g();
        r6.f25127b = r0;
        goto L_0x0000;
    L_0x007b:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x00a1 }
        if (r2 < 0) goto L_0x0088;
    L_0x0085:
        r3 = 6;
        if (r2 <= r3) goto L_0x00aa;
    L_0x0088:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r5 = 50;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r2 = " is not a valid enum ImaxCaptureFailure";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x00a1 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00a1 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00a1 }
    L_0x00a1:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00aa:
        r6.f25126a = r2;	 Catch:{ IllegalArgumentException -> 0x00a1 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kkg.a(kvc):kkg");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25126a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        long j = this.f25127b;
        if (j != 0) {
            kvd.mo10494b(2, j);
        }
        j = this.f25128c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        j = this.f25129d;
        if (j != 0) {
            kvd.mo10494b(4, j);
        }
        j = this.f25130e;
        if (j != 0) {
            kvd.mo10494b(5, j);
        }
        if (Float.floatToIntBits(this.f25131f) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(6, this.f25131f);
        }
        boolean z = this.f25132g;
        if (z) {
            kvd.mo10491a(7, z);
        }
        i = this.f25133h;
        if (i != 0) {
            kvd.mo10493b(8, i);
        }
        j = this.f25134i;
        if (j != 0) {
            kvd.mo10494b(9, j);
        }
        j = this.f25135j;
        if (j != 0) {
            kvd.mo10494b(10, j);
        }
        super.writeTo(kvd);
    }
}
