package p000;

/* compiled from: PG */
/* renamed from: klc */
public final class klc extends kvf {
    /* renamed from: a */
    public int f25214a;
    /* renamed from: b */
    public int f25215b;
    /* renamed from: c */
    public String f25216c;
    /* renamed from: d */
    public float f25217d;
    /* renamed from: e */
    public float f25218e;
    /* renamed from: f */
    private String f25219f;

    public klc() {
        this.f25214a = 0;
        this.f25219f = "";
        this.f25215b = 0;
        this.f25216c = "";
        this.f25217d = 0.0f;
        this.f25218e = 0.0f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25214a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        String str = this.f25219f;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(2, this.f25219f);
        }
        i = this.f25215b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(3, i);
        }
        str = this.f25216c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(4, this.f25216c);
        }
        if (Float.floatToIntBits(this.f25217d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(40) + 4;
        }
        if (Float.floatToIntBits(this.f25218e) == Float.floatToIntBits(0.0f)) {
            return computeSerializedSize;
        }
        return computeSerializedSize + (kvd.m5484b(48) + 4);
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.klc m16936a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0049;
            case 18: goto L_0x0042;
            case 24: goto L_0x002b;
            case 34: goto L_0x0024;
            case 45: goto L_0x0019;
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
        r6.f25218e = r0;
        goto L_0x0000;
    L_0x0019:
        r0 = r7.mo10481d();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r6.f25217d = r0;
        goto L_0x0000;
    L_0x0024:
        r0 = r7.mo10487h();
        r6.f25216c = r0;
        goto L_0x0000;
    L_0x002b:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x003a }
        r2 = p000.klh.m16939a(r2);	 Catch:{ IllegalArgumentException -> 0x003a }
        r6.f25215b = r2;	 Catch:{ IllegalArgumentException -> 0x003a }
        goto L_0x0000;
    L_0x003a:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0042:
        r0 = r7.mo10487h();
        r6.f25219f = r0;
        goto L_0x0000;
    L_0x0049:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x006f }
        if (r2 < 0) goto L_0x0056;
    L_0x0053:
        r3 = 7;
        if (r2 <= r3) goto L_0x0077;
    L_0x0056:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006f }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006f }
        r5 = 47;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x006f }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = " is not a valid enum InteractionType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x006f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x006f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0077:
        r6.f25214a = r2;	 Catch:{ IllegalArgumentException -> 0x006f }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: klc.a(kvc):klc");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25214a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        String str = this.f25219f;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(2, this.f25219f);
        }
        i = this.f25215b;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        str = this.f25216c;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(4, this.f25216c);
        }
        if (Float.floatToIntBits(this.f25217d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(5, this.f25217d);
        }
        if (Float.floatToIntBits(this.f25218e) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(6, this.f25218e);
        }
        super.writeTo(kvd);
    }
}
