package p000;

/* compiled from: PG */
/* renamed from: kkv */
public final class kkv extends kvf {
    /* renamed from: a */
    private int f25181a;
    /* renamed from: b */
    private kkj f25182b;
    /* renamed from: c */
    private float f25183c;
    /* renamed from: d */
    private int f25184d;

    public kkv() {
        this.f25181a = 0;
        this.f25182b = null;
        this.f25183c = 0.0f;
        this.f25184d = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25181a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        kvl kvl = this.f25182b;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(2, kvl);
        }
        if (Float.floatToIntBits(this.f25183c) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        i = this.f25184d;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(4, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kkv m16929a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0031;
            case 18: goto L_0x0020;
            case 29: goto L_0x0015;
            case 32: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.mo10485f();
        r6.f25184d = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.mo10481d();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r6.f25183c = r0;
        goto L_0x0000;
    L_0x0020:
        r0 = r6.f25182b;
        if (r0 != 0) goto L_0x002b;
    L_0x0024:
        r0 = new kkj;
        r0.<init>();
        r6.f25182b = r0;
    L_0x002b:
        r0 = r6.f25182b;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x0031:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r2 < 0) goto L_0x003f;
    L_0x003b:
        r3 = 9;
        if (r2 <= r3) goto L_0x0060;
    L_0x003f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r5 = 46;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = " is not a valid enum TextEntityType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0058:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0060:
        r6.f25181a = r2;	 Catch:{ IllegalArgumentException -> 0x0058 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kkv.a(kvc):kkv");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25181a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        kvl kvl = this.f25182b;
        if (kvl != null) {
            kvd.mo10496b(2, kvl);
        }
        if (Float.floatToIntBits(this.f25183c) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25183c);
        }
        i = this.f25184d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        super.writeTo(kvd);
    }
}
