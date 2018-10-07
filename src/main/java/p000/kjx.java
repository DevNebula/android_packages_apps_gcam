package p000;

/* compiled from: PG */
/* renamed from: kjx */
public final class kjx extends kvf {
    /* renamed from: a */
    public int f25025a;
    /* renamed from: b */
    public int f25026b;
    /* renamed from: c */
    public long f25027c;
    /* renamed from: d */
    public long f25028d;
    /* renamed from: e */
    public int f25029e;
    /* renamed from: f */
    public boolean f25030f;

    public kjx() {
        this.f25025a = 0;
        this.f25026b = 0;
        this.f25027c = 0;
        this.f25028d = 0;
        this.f25029e = 0;
        this.f25030f = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    private static int m16916a(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum Camera");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25025a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25026b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        long j = this.f25027c;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(3, j);
        }
        j = this.f25028d;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(4, j);
        }
        i = this.f25029e;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(5, i);
        }
        if (this.f25030f) {
            return computeSerializedSize + (kvd.m5484b(48) + 1);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kjx m16917a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x006b;
            case 16: goto L_0x0054;
            case 24: goto L_0x004d;
            case 32: goto L_0x0046;
            case 40: goto L_0x0015;
            case 48: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = r7.mo10480c();
        r6.f25030f = r0;
        goto L_0x0000;
    L_0x0015:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x003b }
        if (r2 < 0) goto L_0x0022;
    L_0x001f:
        r3 = 1;
        if (r2 <= r3) goto L_0x0043;
    L_0x0022:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003b }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003b }
        r5 = 44;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003b }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003b }
        r2 = " is not a valid enum ChangeMethod";
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
        r6.f25029e = r2;	 Catch:{ IllegalArgumentException -> 0x003b }
        goto L_0x0000;
    L_0x0046:
        r0 = r7.mo10486g();
        r6.f25028d = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.mo10486g();
        r6.f25027c = r0;
        goto L_0x0000;
    L_0x0054:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0063 }
        r2 = p000.kjx.m16916a(r2);	 Catch:{ IllegalArgumentException -> 0x0063 }
        r6.f25026b = r2;	 Catch:{ IllegalArgumentException -> 0x0063 }
        goto L_0x0000;
    L_0x0063:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x006b:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x007a }
        r2 = p000.kjx.m16916a(r2);	 Catch:{ IllegalArgumentException -> 0x007a }
        r6.f25025a = r2;	 Catch:{ IllegalArgumentException -> 0x007a }
        goto L_0x0000;
    L_0x007a:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kjx.a(kvc):kjx");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25025a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25026b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        long j = this.f25027c;
        if (j != 0) {
            kvd.mo10494b(3, j);
        }
        j = this.f25028d;
        if (j != 0) {
            kvd.mo10494b(4, j);
        }
        i = this.f25029e;
        if (i != 0) {
            kvd.mo10493b(5, i);
        }
        boolean z = this.f25030f;
        if (z) {
            kvd.mo10491a(6, z);
        }
        super.writeTo(kvd);
    }
}
