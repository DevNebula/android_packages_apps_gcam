package p000;

/* compiled from: PG */
/* renamed from: klo */
public final class klo extends kvf {
    /* renamed from: a */
    public int f25270a;
    /* renamed from: b */
    public String f25271b;
    /* renamed from: c */
    public boolean f25272c;
    /* renamed from: d */
    public boolean f25273d;
    /* renamed from: e */
    public String f25274e;
    /* renamed from: f */
    public String f25275f;

    public klo() {
        this.f25270a = 0;
        this.f25271b = "";
        this.f25272c = false;
        this.f25273d = false;
        this.f25274e = "";
        this.f25275f = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25270a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        String str = this.f25271b;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(2, this.f25271b);
        }
        if (this.f25272c) {
            computeSerializedSize += kvd.m5484b(24) + 1;
        }
        if (this.f25273d) {
            computeSerializedSize += kvd.m5484b(32) + 1;
        }
        str = this.f25274e;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(5, this.f25274e);
        }
        str = this.f25275f;
        if (str == null || str.equals("")) {
            return computeSerializedSize;
        }
        return computeSerializedSize + kvd.m5478a(6, this.f25275f);
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.klo m16946a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0031;
            case 18: goto L_0x002a;
            case 24: goto L_0x0023;
            case 32: goto L_0x001c;
            case 42: goto L_0x0015;
            case 50: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.mo10487h();
        r6.f25275f = r0;
        goto L_0x0000;
    L_0x0015:
        r0 = r7.mo10487h();
        r6.f25274e = r0;
        goto L_0x0000;
    L_0x001c:
        r0 = r7.mo10480c();
        r6.f25273d = r0;
        goto L_0x0000;
    L_0x0023:
        r0 = r7.mo10480c();
        r6.f25272c = r0;
        goto L_0x0000;
    L_0x002a:
        r0 = r7.mo10487h();
        r6.f25271b = r0;
        goto L_0x0000;
    L_0x0031:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r2 < 0) goto L_0x003e;
    L_0x003b:
        r3 = 2;
        if (r2 <= r3) goto L_0x005f;
    L_0x003e:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0057 }
        r5 = 36;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = " is not a valid enum Type";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0057 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0057 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0057 }
    L_0x0057:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x005f:
        r6.f25270a = r2;	 Catch:{ IllegalArgumentException -> 0x0057 }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: klo.a(kvc):klo");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25270a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        String str = this.f25271b;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(2, this.f25271b);
        }
        boolean z = this.f25272c;
        if (z) {
            kvd.mo10491a(3, z);
        }
        z = this.f25273d;
        if (z) {
            kvd.mo10491a(4, z);
        }
        str = this.f25274e;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(5, this.f25274e);
        }
        str = this.f25275f;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(6, this.f25275f);
        }
        super.writeTo(kvd);
    }
}
