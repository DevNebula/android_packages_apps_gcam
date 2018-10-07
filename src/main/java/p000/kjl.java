package p000;

/* compiled from: PG */
/* renamed from: kjl */
public final class kjl extends kvf {
    /* renamed from: a */
    private long f24986a;
    /* renamed from: b */
    private int f24987b;
    /* renamed from: c */
    private kjn f24988c;
    /* renamed from: d */
    private kjk f24989d;
    /* renamed from: e */
    private kjm f24990e;

    public kjl() {
        this.f24986a = 0;
        this.f24987b = 0;
        this.f24988c = null;
        this.f24989d = null;
        this.f24990e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f24986a;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        int i = this.f24987b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        kvl kvl = this.f24988c;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(3, kvl);
        }
        kvl = this.f24989d;
        if (kvl != null) {
            computeSerializedSize += kvd.m5479a(4, kvl);
        }
        kvl = this.f24990e;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5479a(5, kvl);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kjl m16907a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0072;
            case 16: goto L_0x0041;
            case 26: goto L_0x0030;
            case 34: goto L_0x001f;
            case 42: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r6.f24990e;
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new kjm;
        r0.<init>();
        r6.f24990e = r0;
    L_0x0019:
        r0 = r6.f24990e;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x001f:
        r0 = r6.f24989d;
        if (r0 != 0) goto L_0x002a;
    L_0x0023:
        r0 = new kjk;
        r0.<init>();
        r6.f24989d = r0;
    L_0x002a:
        r0 = r6.f24989d;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x0030:
        r0 = r6.f24988c;
        if (r0 != 0) goto L_0x003b;
    L_0x0034:
        r0 = new kjn;
        r0.<init>();
        r6.f24988c = r0;
    L_0x003b:
        r0 = r6.f24988c;
        r7.mo10474a(r0);
        goto L_0x0000;
    L_0x0041:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r2 < 0) goto L_0x004e;
    L_0x004b:
        r3 = 4;
        if (r2 <= r3) goto L_0x006f;
    L_0x004e:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r5 = 42;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = " is not a valid enum ActionType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0067 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0067 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x006f:
        r6.f24987b = r2;	 Catch:{ IllegalArgumentException -> 0x0067 }
        goto L_0x0000;
    L_0x0072:
        r0 = r7.mo10486g();
        r6.f24986a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kjl.a(kvc):kjl");
    }

    public final void writeTo(kvd kvd) {
        long j = this.f24986a;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        int i = this.f24987b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        kvl kvl = this.f24988c;
        if (kvl != null) {
            kvd.mo10496b(3, kvl);
        }
        kvl = this.f24989d;
        if (kvl != null) {
            kvd.mo10496b(4, kvl);
        }
        kvl = this.f24990e;
        if (kvl != null) {
            kvd.mo10496b(5, kvl);
        }
        super.writeTo(kvd);
    }
}
