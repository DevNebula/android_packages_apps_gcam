package p000;

/* compiled from: PG */
/* renamed from: kjz */
public final class kjz extends kvf {
    /* renamed from: a */
    private static volatile kjz[] f25036a;
    /* renamed from: b */
    private long f25037b;
    /* renamed from: c */
    private int f25038c;
    /* renamed from: d */
    private float f25039d;
    /* renamed from: e */
    private int f25040e;

    public kjz() {
        this.f25037b = 0;
        this.f25038c = 0;
        this.f25039d = 0.0f;
        this.f25040e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f25037b;
        if (j != 0) {
            computeSerializedSize += kvd.m5477a(1, j);
        }
        int i = this.f25038c;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        if (Float.floatToIntBits(this.f25039d) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5484b(24) + 4;
        }
        i = this.f25040e;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(4, i);
        }
        return computeSerializedSize;
    }

    /* renamed from: a */
    public static kjz[] m16920a() {
        if (f25036a == null) {
            synchronized (kvj.f9023b) {
                if (f25036a == null) {
                    f25036a = new kjz[0];
                }
            }
        }
        return f25036a;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* renamed from: a */
    private final p000.kjz m16919a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 8: goto L_0x0069;
            case 16: goto L_0x0030;
            case 29: goto L_0x0025;
            case 32: goto L_0x000e;
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
        r2 = p000.kjj.m16903a(r2);	 Catch:{ IllegalArgumentException -> 0x001d }
        r6.f25040e = r2;	 Catch:{ IllegalArgumentException -> 0x001d }
        goto L_0x0000;
    L_0x001d:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0025:
        r0 = r7.mo10481d();
        r0 = java.lang.Float.intBitsToFloat(r0);
        r6.f25039d = r0;
        goto L_0x0000;
    L_0x0030:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x005e }
        if (r2 < 0) goto L_0x003d;
    L_0x003a:
        r3 = 2;
        if (r2 <= r3) goto L_0x0066;
    L_0x003d:
        r3 = 10;
        if (r2 < r3) goto L_0x0045;
    L_0x0041:
        r3 = 19;
        if (r2 <= r3) goto L_0x0066;
    L_0x0045:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x005e }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x005e }
        r5 = 41;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x005e }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = " is not a valid enum EventType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x005e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x005e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x005e:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0066:
        r6.f25038c = r2;	 Catch:{ IllegalArgumentException -> 0x005e }
        goto L_0x0000;
    L_0x0069:
        r0 = r7.mo10486g();
        r6.f25037b = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: kjz.a(kvc):kjz");
    }

    public final void writeTo(kvd kvd) {
        long j = this.f25037b;
        if (j != 0) {
            kvd.mo10494b(1, j);
        }
        int i = this.f25038c;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        if (Float.floatToIntBits(this.f25039d) != Float.floatToIntBits(0.0f)) {
            kvd.mo10490a(3, this.f25039d);
        }
        i = this.f25040e;
        if (i != 0) {
            kvd.mo10493b(4, i);
        }
        super.writeTo(kvd);
    }
}
