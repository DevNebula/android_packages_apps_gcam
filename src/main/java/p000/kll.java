package p000;

/* compiled from: PG */
/* renamed from: kll */
public final class kll extends kvf {
    /* renamed from: a */
    public int f25260a;
    /* renamed from: b */
    public int f25261b;
    /* renamed from: c */
    public float f25262c;
    /* renamed from: d */
    public int f25263d;
    /* renamed from: e */
    private boolean f25264e;

    public kll() {
        this.f25264e = false;
        this.f25260a = 0;
        this.f25261b = 0;
        this.f25262c = 0.0f;
        this.f25263d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (this.f25264e) {
            computeSerializedSize += kvd.m5484b(8) + 1;
        }
        int i = this.f25260a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f25261b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        if (Float.floatToIntBits(this.f25262c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(32) + 4;
        }
        i = this.f25263d;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(5, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kll m16944a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0058;
            case 16: goto L_0x0051;
            case 24: goto L_0x004a;
            case 37: goto L_0x003f;
            case 40: goto L_0x000e;
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
        r5 = 39;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = " is not a valid enum Quality";
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
        r6.f25263d = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.mo10481d();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r6.f25262c = r0;
        goto L_0x0000;
    L_0x004a:
        r0 = r7.mo10485f();
        r6.f25261b = r0;
        goto L_0x0000;
    L_0x0051:
        r0 = r7.mo10485f();
        r6.f25260a = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.mo10480c();
        r6.f25264e = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kll.a(kvc):kll");
    }

    public final void writeTo(kvd kvd) {
        boolean z = this.f25264e;
        if (z) {
            kvd.mo10491a(1, z);
        }
        int i = this.f25260a;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f25261b;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        if (Float.floatToIntBits(this.f25262c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(4, this.f25262c);
        }
        i = this.f25263d;
        if (i != 0) {
            kvd.mo10493b(5, i);
        }
        super.writeTo(kvd);
    }
}
