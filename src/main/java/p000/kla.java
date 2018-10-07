package p000;

/* compiled from: PG */
/* renamed from: kla */
public final class kla extends kvf {
    /* renamed from: a */
    public int f25209a;
    /* renamed from: b */
    public kkz[] f25210b;

    public kla() {
        this.f25209a = 0;
        this.f25210b = kkz.m16933a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25209a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        kkz[] kkzArr = this.f25210b;
        if (kkzArr == null || kkzArr.length <= 0) {
            return computeSerializedSize;
        }
        i = computeSerializedSize;
        computeSerializedSize = 0;
        while (true) {
            kkz[] kkzArr2 = this.f25210b;
            if (computeSerializedSize >= kkzArr2.length) {
                return i;
            }
            kvl kvl = kkzArr2[computeSerializedSize];
            if (kvl != null) {
                i += kvd.m5479a(2, kvl);
            }
            computeSerializedSize++;
        }
    }

    /* JADX WARNING: Missing block: B:5:0x000e, code:
            return r7;
     */
    /* renamed from: a */
    private final p000.kla m16934a(p000.kvc r8) {
        /*
        r7 = this;
        r1 = 0;
    L_0x0001:
        r0 = r8.mo10488i();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x004a;
            case 18: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.storeUnknownField(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r0 = 18;
        r2 = p000.kvn.m5518a(r8, r0);
        r3 = r7.f25210b;
        if (r3 == 0) goto L_0x0048;
    L_0x0019:
        r0 = r3.length;
    L_0x001a:
        r2 = r2 + r0;
        r2 = new p000.kkz[r2];
        if (r0 == 0) goto L_0x0022;
    L_0x001f:
        java.lang.System.arraycopy(r3, r1, r2, r1, r0);
    L_0x0022:
        r3 = r2.length;
        r3 = r3 + -1;
        if (r0 >= r3) goto L_0x0039;
    L_0x0027:
        r3 = new kkz;
        r3.<init>();
        r2[r0] = r3;
        r3 = r2[r0];
        r8.mo10474a(r3);
        r8.mo10488i();
        r0 = r0 + 1;
        goto L_0x0022;
    L_0x0039:
        r3 = new kkz;
        r3.<init>();
        r2[r0] = r3;
        r0 = r2[r0];
        r8.mo10474a(r0);
        r7.f25210b = r2;
        goto L_0x0001;
    L_0x0048:
        r0 = r1;
        goto L_0x001a;
    L_0x004a:
        r2 = r8.mo10476b();
        r3 = r8.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0070 }
        if (r3 < 0) goto L_0x0057;
    L_0x0054:
        r4 = 2;
        if (r3 <= r4) goto L_0x0078;
    L_0x0057:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0070 }
        r6 = 49;
        r5.<init>(r6);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r3 = " is not a valid enum ScoringMetricType";
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        r3 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0070 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0070 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0070 }
    L_0x0070:
        r3 = move-exception;
        r8.mo10482d(r2);
        r7.storeUnknownField(r8, r0);
        goto L_0x0001;
    L_0x0078:
        r7.f25209a = r3;	 Catch:{ IllegalArgumentException -> 0x0070 }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: kla.a(kvc):kla");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25209a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        kkz[] kkzArr = this.f25210b;
        if (kkzArr != null && kkzArr.length > 0) {
            i = 0;
            while (true) {
                kkz[] kkzArr2 = this.f25210b;
                if (i >= kkzArr2.length) {
                    break;
                }
                kvl kvl = kkzArr2[i];
                if (kvl != null) {
                    kvd.mo10496b(2, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
