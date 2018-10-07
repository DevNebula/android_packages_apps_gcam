package p000;

/* compiled from: PG */
/* renamed from: kjo */
public final class kjo extends kvf {
    /* renamed from: a */
    public int f24994a;
    /* renamed from: b */
    public String f24995b;
    /* renamed from: c */
    public String f24996c;
    /* renamed from: d */
    public int f24997d;
    /* renamed from: e */
    public int f24998e;
    /* renamed from: f */
    public int f24999f;
    /* renamed from: g */
    private int f25000g;

    public kjo() {
        this.f24994a = 0;
        this.f24995b = "";
        this.f24996c = "";
        this.f24997d = 0;
        this.f24998e = 0;
        this.f25000g = 0;
        this.f24999f = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f24994a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        String str = this.f24995b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(2, this.f24995b);
        }
        str = this.f24996c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(3, this.f24996c);
        }
        i = this.f24997d;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(4, i);
        }
        i = this.f24998e;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(5, i);
        }
        i = this.f25000g;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(6, i);
        }
        i = this.f24999f;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(7, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* JADX WARNING: Missing block: B:13:0x003a, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* renamed from: a */
    private final p000.kjo m16911a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0062;
            case 18: goto L_0x005b;
            case 26: goto L_0x0054;
            case 32: goto L_0x004d;
            case 40: goto L_0x0046;
            case 48: goto L_0x0015;
            case 56: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.mo10485f();
        r6.f24999f = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r2 < 0) goto L_0x0022;
    L_0x001f:
        r3 = 2;
        if (r2 <= r3) goto L_0x0043;
    L_0x0022:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 41;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = " is not a valid enum CameraApi";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x003b }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003b }
    L_0x003b:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0043:
        r6.f25000g = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
    L_0x0046:
        r0 = r7.mo10485f();
        r6.f24998e = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.mo10485f();
        r6.f24997d = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.mo10487h();
        r6.f24996c = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r7.mo10487h();
        r6.f24995b = r0;
        goto L_0x0000;
    L_0x0062:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0089 }
        if (r2 < 0) goto L_0x0070;
    L_0x006c:
        r3 = 9;
        if (r2 <= r3) goto L_0x0092;
    L_0x0070:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0089 }
        r5 = 45;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0089 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0089 }
        r2 = " is not a valid enum FailureReason";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0089 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0089 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0089 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0089 }
    L_0x0089:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0092:
        r6.f24994a = r2;	 Catch:{ IllegalArgumentException -> 0x0089 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kjo.a(kvc):kjo");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f24994a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        String str = this.f24995b;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(2, this.f24995b);
        }
        str = this.f24996c;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(3, this.f24996c);
        }
        i = this.f24997d;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        i = this.f24998e;
        if (i != 0) {
            kvd.mo10493b(5, i);
        }
        i = this.f25000g;
        if (i != 0) {
            kvd.mo10493b(6, i);
        }
        i = this.f24999f;
        if (i != 0) {
            kvd.mo10493b(7, i);
        }
        super.writeTo(kvd);
    }
}
