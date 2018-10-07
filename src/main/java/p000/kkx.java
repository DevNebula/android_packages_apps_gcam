package p000;

/* compiled from: PG */
/* renamed from: kkx */
public final class kkx extends kvf {
    /* renamed from: a */
    public boolean f25188a;
    /* renamed from: b */
    public boolean f25189b;
    /* renamed from: c */
    public boolean f25190c;
    /* renamed from: d */
    public boolean f25191d;
    /* renamed from: e */
    public boolean f25192e;
    /* renamed from: f */
    public boolean f25193f;
    /* renamed from: g */
    public boolean f25194g;
    /* renamed from: h */
    public boolean f25195h;
    /* renamed from: i */
    public boolean f25196i;
    /* renamed from: j */
    private int f25197j;
    /* renamed from: k */
    private int f25198k;
    /* renamed from: l */
    private float f25199l;
    /* renamed from: m */
    private int f25200m;

    public kkx() {
        this.f25197j = 0;
        this.f25198k = 0;
        this.f25188a = false;
        this.f25189b = false;
        this.f25190c = false;
        this.f25191d = false;
        this.f25192e = false;
        this.f25193f = false;
        this.f25194g = false;
        this.f25195h = false;
        this.f25196i = false;
        this.f25199l = 0.0f;
        this.f25200m = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25197j;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25198k;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        if (this.f25188a) {
            computeSerializedSize += kvd.m5484b(24) + 1;
        }
        if (this.f25189b) {
            computeSerializedSize += kvd.m5484b(32) + 1;
        }
        if (this.f25190c) {
            computeSerializedSize += kvd.m5484b(40) + 1;
        }
        if (this.f25191d) {
            computeSerializedSize += kvd.m5484b(48) + 1;
        }
        if (this.f25192e) {
            computeSerializedSize += kvd.m5484b(56) + 1;
        }
        if (this.f25193f) {
            computeSerializedSize += kvd.m5484b(64) + 1;
        }
        if (this.f25194g) {
            computeSerializedSize += kvd.m5484b(72) + 1;
        }
        if (this.f25195h) {
            computeSerializedSize += kvd.m5484b(80) + 1;
        }
        if (this.f25196i) {
            computeSerializedSize += kvd.m5484b(88) + 1;
        }
        if (Float.floatToIntBits(this.f25199l) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(96) + 4;
        }
        i = this.f25200m;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(13, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kkx m16931a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0093;
            case 16: goto L_0x008b;
            case 24: goto L_0x0083;
            case 32: goto L_0x007b;
            case 40: goto L_0x0074;
            case 48: goto L_0x006d;
            case 56: goto L_0x0066;
            case 64: goto L_0x005f;
            case 72: goto L_0x0058;
            case 80: goto L_0x0051;
            case 88: goto L_0x004a;
            case 101: goto L_0x003f;
            case 104: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r2 < 0) goto L_0x001b;
    L_0x0018:
        r3 = 3;
        if (r2 <= r3) goto L_0x003c;
    L_0x001b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5 = 39;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = " is not a valid enum Quality";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x003c:
        r6.f25200m = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.mo10481d();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r6.f25199l = r0;
        goto L_0x0000;
    L_0x004a:
        r0 = r7.mo10480c();
        r6.f25196i = r0;
        goto L_0x0000;
    L_0x0051:
        r0 = r7.mo10480c();
        r6.f25195h = r0;
        goto L_0x0000;
    L_0x0058:
        r0 = r7.mo10480c();
        r6.f25194g = r0;
        goto L_0x0000;
    L_0x005f:
        r0 = r7.mo10480c();
        r6.f25193f = r0;
        goto L_0x0000;
    L_0x0066:
        r0 = r7.mo10480c();
        r6.f25192e = r0;
        goto L_0x0000;
    L_0x006d:
        r0 = r7.mo10480c();
        r6.f25191d = r0;
        goto L_0x0000;
    L_0x0074:
        r0 = r7.mo10480c();
        r6.f25190c = r0;
        goto L_0x0000;
    L_0x007b:
        r0 = r7.mo10480c();
        r6.f25189b = r0;
        goto L_0x0000;
    L_0x0083:
        r0 = r7.mo10480c();
        r6.f25188a = r0;
        goto L_0x0000;
    L_0x008b:
        r0 = r7.mo10485f();
        r6.f25198k = r0;
        goto L_0x0000;
    L_0x0093:
        r0 = r7.mo10485f();
        r6.f25197j = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kkx.a(kvc):kkx");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25197j;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25198k;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        boolean z = this.f25188a;
        if (z) {
            kvd.mo10491a(3, z);
        }
        z = this.f25189b;
        if (z) {
            kvd.mo10491a(4, z);
        }
        z = this.f25190c;
        if (z) {
            kvd.mo10491a(5, z);
        }
        z = this.f25191d;
        if (z) {
            kvd.mo10491a(6, z);
        }
        z = this.f25192e;
        if (z) {
            kvd.mo10491a(7, z);
        }
        z = this.f25193f;
        if (z) {
            kvd.mo10491a(8, z);
        }
        z = this.f25194g;
        if (z) {
            kvd.mo10491a(9, z);
        }
        z = this.f25195h;
        if (z) {
            kvd.mo10491a(10, z);
        }
        z = this.f25196i;
        if (z) {
            kvd.mo10491a(11, z);
        }
        if (Float.floatToIntBits(this.f25199l) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(12, this.f25199l);
        }
        i = this.f25200m;
        if (i != 0) {
            kvd.mo10493b(13, i);
        }
        super.writeTo(kvd);
    }
}
