package p000;

/* compiled from: PG */
/* renamed from: kkd */
public final class kkd extends kvf {
    /* renamed from: a */
    public int f25068a;
    /* renamed from: b */
    public int f25069b;
    /* renamed from: c */
    public String f25070c;
    /* renamed from: d */
    public boolean f25071d;
    /* renamed from: e */
    public boolean f25072e;
    /* renamed from: f */
    public boolean f25073f;
    /* renamed from: g */
    public long f25074g;
    /* renamed from: h */
    public int f25075h;
    /* renamed from: i */
    private boolean f25076i;
    /* renamed from: j */
    private boolean f25077j;
    /* renamed from: k */
    private boolean f25078k;
    /* renamed from: l */
    private String f25079l;

    public kkd() {
        this.f25068a = 0;
        this.f25076i = false;
        this.f25077j = false;
        this.f25078k = false;
        this.f25079l = "";
        this.f25069b = 0;
        this.f25070c = "";
        this.f25071d = false;
        this.f25072e = false;
        this.f25073f = false;
        this.f25074g = 0;
        this.f25075h = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25068a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        if (this.f25076i) {
            computeSerializedSize += kvd.m5484b(16) + 1;
        }
        if (this.f25077j) {
            computeSerializedSize += kvd.m5484b(24) + 1;
        }
        if (this.f25078k) {
            computeSerializedSize += kvd.m5484b(32) + 1;
        }
        String str = this.f25079l;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(5, this.f25079l);
        }
        i = this.f25069b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(6, i);
        }
        str = this.f25070c;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(7, this.f25070c);
        }
        if (this.f25071d) {
            computeSerializedSize += kvd.m5484b(64) + 1;
        }
        if (this.f25072e) {
            computeSerializedSize += kvd.m5484b(72) + 1;
        }
        if (this.f25073f) {
            computeSerializedSize += kvd.m5484b(80) + 1;
        }
        long j = this.f25074g;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(11, j);
        }
        i = this.f25075h;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(12, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* JADX WARNING: Missing block: B:12:0x0033, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* renamed from: a */
    private final p000.kkd m16922a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0098;
            case 16: goto L_0x0090;
            case 24: goto L_0x0088;
            case 32: goto L_0x0080;
            case 42: goto L_0x0079;
            case 48: goto L_0x0062;
            case 58: goto L_0x005b;
            case 64: goto L_0x0054;
            case 72: goto L_0x004d;
            case 80: goto L_0x0046;
            case 88: goto L_0x003f;
            case 96: goto L_0x000e;
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
        r3 = 7;
        if (r2 <= r3) goto L_0x003c;
    L_0x001b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5 = 65;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = " is not a valid enum ForegroundSourceLaunchMethodExtra";
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
        r6.f25075h = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r0 = r7.mo10486g();
        r6.f25074g = r0;
        goto L_0x0000;
    L_0x0046:
        r0 = r7.mo10480c();
        r6.f25073f = r0;
        goto L_0x0000;
    L_0x004d:
        r0 = r7.mo10480c();
        r6.f25072e = r0;
        goto L_0x0000;
    L_0x0054:
        r0 = r7.mo10480c();
        r6.f25071d = r0;
        goto L_0x0000;
    L_0x005b:
        r0 = r7.mo10487h();
        r6.f25070c = r0;
        goto L_0x0000;
    L_0x0062:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0071 }
        r2 = p000.klh.m16941b(r2);	 Catch:{ IllegalArgumentException -> 0x0071 }
        r6.f25069b = r2;	 Catch:{ IllegalArgumentException -> 0x0071 }
        goto L_0x0000;
    L_0x0071:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0079:
        r0 = r7.mo10487h();
        r6.f25079l = r0;
        goto L_0x0000;
    L_0x0080:
        r0 = r7.mo10480c();
        r6.f25078k = r0;
        goto L_0x0000;
    L_0x0088:
        r0 = r7.mo10480c();
        r6.f25077j = r0;
        goto L_0x0000;
    L_0x0090:
        r0 = r7.mo10480c();
        r6.f25076i = r0;
        goto L_0x0000;
    L_0x0098:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x00bf }
        if (r2 < 0) goto L_0x00a6;
    L_0x00a2:
        r3 = 9;
        if (r2 <= r3) goto L_0x00c8;
    L_0x00a6:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00bf }
        r5 = 48;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00bf }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00bf }
        r2 = " is not a valid enum ForegroundSource";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x00bf }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x00bf }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00bf }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00bf }
    L_0x00bf:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00c8:
        r6.f25068a = r2;	 Catch:{ IllegalArgumentException -> 0x00bf }
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kkd.a(kvc):kkd");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25068a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        boolean z = this.f25076i;
        if (z) {
            kvd.mo10491a(2, z);
        }
        z = this.f25077j;
        if (z) {
            kvd.mo10491a(3, z);
        }
        z = this.f25078k;
        if (z) {
            kvd.mo10491a(4, z);
        }
        String str = this.f25079l;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(5, this.f25079l);
        }
        i = this.f25069b;
        if (i != 0) {
            kvd.mo10493b(6, i);
        }
        str = this.f25070c;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(7, this.f25070c);
        }
        z = this.f25071d;
        if (z) {
            kvd.mo10491a(8, z);
        }
        z = this.f25072e;
        if (z) {
            kvd.mo10491a(9, z);
        }
        z = this.f25073f;
        if (z) {
            kvd.mo10491a(10, z);
        }
        long j = this.f25074g;
        if (j != 0) {
            kvd.mo10494b(11, j);
        }
        i = this.f25075h;
        if (i != 0) {
            kvd.mo10493b(12, i);
        }
        super.writeTo(kvd);
    }
}
