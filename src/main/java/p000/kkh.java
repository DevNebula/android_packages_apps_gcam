package p000;

/* compiled from: PG */
/* renamed from: kkh */
public final class kkh extends kvf {
    /* renamed from: a */
    private int f25136a;
    /* renamed from: b */
    private int f25137b;
    /* renamed from: c */
    private int f25138c;
    /* renamed from: d */
    private int f25139d;
    /* renamed from: e */
    private kkj f25140e;
    /* renamed from: f */
    private float f25141f;

    public kkh() {
        this.f25136a = 0;
        this.f25137b = 0;
        this.f25138c = 0;
        this.f25139d = 0;
        this.f25140e = null;
        this.f25141f = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25136a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25137b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f25138c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        i = this.f25139d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        kvl kvl = this.f25140e;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(5, kvl);
        }
        if (Float.floatToIntBits(this.f25141f) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(48) + 4);
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* JADX WARNING: Missing block: B:17:0x0050, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARNING: Missing block: B:43:0x00b5, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARNING: Missing block: B:56:0x00e8, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* renamed from: a */
    private final p000.kkh m16925a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x00c3;
            case 16: goto L_0x008f;
            case 24: goto L_0x005c;
            case 32: goto L_0x002a;
            case 42: goto L_0x0019;
            case 53: goto L_0x000e;
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
        r6.f25141f = r0;
        goto L_0x0000;
    L_0x0019:
        r0 = r6.f25140e;
        if (r0 != 0) goto L_0x0024;
    L_0x001d:
        r0 = new kkj;
        r0.<init>();
        r6.f25140e = r0;
    L_0x0024:
        r0 = r6.f25140e;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x002a:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0051 }
        if (r2 < 0) goto L_0x0038;
    L_0x0034:
        r3 = 12;
        if (r2 <= r3) goto L_0x0059;
    L_0x0038:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0051 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0051 }
        r5 = 50;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0051 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
        r2 = " is not a valid enum BarcodeContentType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0051 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0051 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0051 }
    L_0x0051:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0059:
        r6.f25139d = r2;	 Catch:{ IllegalArgumentException -> 0x0051 }
        goto L_0x0000;
    L_0x005c:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r2 < 0) goto L_0x0069;
    L_0x0066:
        r3 = 4;
        if (r2 <= r3) goto L_0x008b;
    L_0x0069:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r5 = 44;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r2 = " is not a valid enum TwoDCodeType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0082 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0082 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0082:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x008b:
        r6.f25138c = r2;	 Catch:{ IllegalArgumentException -> 0x0082 }
        goto L_0x0000;
    L_0x008f:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r2 < 0) goto L_0x009d;
    L_0x0099:
        r3 = 9;
        if (r2 <= r3) goto L_0x00bf;
    L_0x009d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r5 = 44;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r2 = " is not a valid enum OneDCodeType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00b6 }
    L_0x00b6:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00bf:
        r6.f25137b = r2;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        goto L_0x0000;
    L_0x00c3:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r2 < 0) goto L_0x00d0;
    L_0x00cd:
        r3 = 2;
        if (r2 <= r3) goto L_0x00f2;
    L_0x00d0:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r5 = 43;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = " is not a valid enum BarcodeType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00e9 }
    L_0x00e9:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00f2:
        r6.f25136a = r2;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kkh.a(kvc):kkh");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25136a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25137b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f25138c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        i = this.f25139d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        kvl kvl = this.f25140e;
        if (kvl != null) {
            kvd.mo10496b(5, kvl);
        }
        if (Float.floatToIntBits(this.f25141f) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(6, this.f25141f);
        }
        super.writeTo(kvd);
    }
}
