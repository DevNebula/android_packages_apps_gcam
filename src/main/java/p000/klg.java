package p000;

/* compiled from: PG */
/* renamed from: klg */
public final class klg extends kvf {
    /* renamed from: a */
    public int f25241a;
    /* renamed from: b */
    public int f25242b;
    /* renamed from: c */
    public int f25243c;
    /* renamed from: d */
    public int f25244d;
    /* renamed from: e */
    public boolean f25245e;
    /* renamed from: f */
    public boolean f25246f;
    /* renamed from: g */
    public int f25247g;

    public klg() {
        this.f25241a = 0;
        this.f25242b = 0;
        this.f25243c = 0;
        this.f25244d = 0;
        this.f25245e = false;
        this.f25246f = false;
        this.f25247g = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25241a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25242b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f25243c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        i = this.f25244d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        if (this.f25245e) {
            computeSerializedSize += kvd.m5484b(40) + 1;
        }
        if (this.f25246f) {
            computeSerializedSize += kvd.m5484b(48) + 1;
        }
        i = this.f25247g;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(7, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.klg m16938a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0062;
            case 16: goto L_0x005b;
            case 24: goto L_0x0054;
            case 32: goto L_0x004d;
            case 40: goto L_0x0046;
            case 48: goto L_0x003f;
            case 56: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r2 < 0) goto L_0x001b;
    L_0x0018:
        r3 = 3;
        if (r2 <= r3) goto L_0x003c;
    L_0x001b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5 = 46;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = " is not a valid enum MicrovideoMode";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f25247g = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.mo10480c();
        r6.f25246f = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.mo10480c();
        r6.f25245e = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.mo10485f();
        r6.f25244d = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.mo10485f();
        r6.f25243c = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r7.mo10485f();
        r6.f25242b = r0;
        goto L_0x0000;
    L_0x0062:
        r0 = r7.mo10485f();
        r6.f25241a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: klg.a(kvc):klg");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25241a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25242b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f25243c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        i = this.f25244d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        boolean z = this.f25245e;
        if (z) {
            kvd.mo10491a(5, z);
        }
        z = this.f25246f;
        if (z) {
            kvd.mo10491a(6, z);
        }
        i = this.f25247g;
        if (i != 0) {
            kvd.mo10493b(7, i);
        }
        super.writeTo(kvd);
    }
}
