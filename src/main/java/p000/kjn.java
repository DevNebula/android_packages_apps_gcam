package p000;

/* compiled from: PG */
/* renamed from: kjn */
public final class kjn extends kvf {
    /* renamed from: a */
    private int f24992a;
    /* renamed from: b */
    private int f24993b;

    public kjn() {
        this.f24992a = 0;
        this.f24993b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public static int m16909a(int i) {
        if ((i >= 0 && i <= 3) || ((i >= 10 && i <= 11) || ((i >= 20 && i <= 22) || (i >= 30 && i <= 32)))) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum MediaType");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f24992a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f24993b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(2, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kjn m16910a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0025;
            case 16: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x001d }
        r2 = p000.kjn.m16909a(r2);	 Catch:{ IllegalArgumentException -> 0x001d }
        r6.f24993b = r2;	 Catch:{ IllegalArgumentException -> 0x001d }
        goto L_0x0000;
    L_0x001d:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0025:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x004b }
        if (r2 < 0) goto L_0x0032;
    L_0x002f:
        r3 = 3;
        if (r2 <= r3) goto L_0x0053;
    L_0x0032:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004b }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004b }
        r5 = 41;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x004b }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = " is not a valid enum QueryType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x004b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0053:
        r6.f24992a = r2;	 Catch:{ IllegalArgumentException -> 0x004b }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kjn.a(kvc):kjn");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f24992a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f24993b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        super.writeTo(kvd);
    }
}
