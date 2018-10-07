package p000;

/* compiled from: PG */
/* renamed from: kkk */
public final class kkk extends kvf {
    /* renamed from: a */
    private int f25149a;
    /* renamed from: b */
    private String f25150b;
    /* renamed from: c */
    private kkr f25151c;

    public kkk() {
        this.f25149a = 0;
        this.f25150b = "";
        this.f25151c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25149a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        String str = this.f25150b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(2, this.f25150b);
        }
        kvl kvl = this.f25151c;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(3, kvl);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kkk m16926a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0026;
            case 18: goto L_0x001f;
            case 26: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f25151c;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new kkr;
        r0.<init>();
        r6.f25151c = r0;
    L_0x0019:
        r0 = r6.f25151c;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r7.mo10487h();
        r6.f25150b = r0;
        goto L_0x0000;
    L_0x0026:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x004d }
        if (r2 < 0) goto L_0x0034;
    L_0x0030:
        r3 = 17;
        if (r2 <= r3) goto L_0x0055;
    L_0x0034:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004d }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004d }
        r5 = 42;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x004d }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x004d }
        r2 = " is not a valid enum ActionType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x004d }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x004d }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x004d }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0055:
        r6.f25149a = r2;	 Catch:{ IllegalArgumentException -> 0x004d }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kkk.a(kvc):kkk");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25149a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        String str = this.f25150b;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(2, this.f25150b);
        }
        kvl kvl = this.f25151c;
        if (kvl != null) {
            kvd.mo10496b(3, kvl);
        }
        super.writeTo(kvd);
    }
}
