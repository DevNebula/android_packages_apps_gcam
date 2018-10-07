package p000;

/* compiled from: PG */
/* renamed from: klj */
public final class klj extends kvf {
    /* renamed from: a */
    public int f25255a;
    /* renamed from: b */
    public float f25256b;

    public klj() {
        this.f25255a = 0;
        this.f25256b = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25255a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        if (Float.floatToIntBits(this.f25256b) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(16) + 4);
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.klj m16943a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0019;
            case 21: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.mo10481d();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r6.f25256b = r0;
        goto L_0x0000;
    L_0x0019:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x003f }
        if (r2 < 0) goto L_0x0026;
    L_0x0023:
        r3 = 4;
        if (r2 <= r3) goto L_0x0047;
    L_0x0026:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003f }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003f }
        r5 = 40;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003f }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003f }
        r2 = " is not a valid enum PanoType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003f }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x003f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003f }
    L_0x003f:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0047:
        r6.f25255a = r2;	 Catch:{ IllegalArgumentException -> 0x003f }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: klj.a(kvc):klj");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25255a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        if (Float.floatToIntBits(this.f25256b) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(2, this.f25256b);
        }
        super.writeTo(kvd);
    }
}
