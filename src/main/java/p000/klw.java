package p000;

/* compiled from: PG */
/* renamed from: klw */
public final class klw extends kvf {
    /* renamed from: a */
    public String f25310a;
    /* renamed from: b */
    public int f25311b;
    /* renamed from: c */
    public int f25312c;

    public klw() {
        this.f25310a = "";
        this.f25311b = 0;
        this.f25312c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f25310a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5478a(1, this.f25310a);
        }
        int i = this.f25311b;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(2, i);
        }
        i = this.f25312c;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(3, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:4:0x000d, code:
            return r6;
     */
    /* JADX WARNING: Missing block: B:25:0x0064, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* renamed from: a */
    private final p000.klw m16953a(p000.kvc r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.mo10488i();
        switch(r0) {
            case 0: goto L_0x000d;
            case 10: goto L_0x0070;
            case 16: goto L_0x003f;
            case 24: goto L_0x000e;
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
        r3 = 1;
        if (r2 <= r3) goto L_0x003c;
    L_0x001b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5 = 47;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = " is not a valid enum GenerationCause";
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
        r6.f25312c = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0000;
    L_0x003f:
        r1 = r7.mo10476b();
        r2 = r7.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r2 < 0) goto L_0x004c;
    L_0x0049:
        r3 = 5;
        if (r2 <= r3) goto L_0x006d;
    L_0x004c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r5 = 44;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = " is not a valid enum CreationType";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0065 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0065 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r2 = move-exception;
        r7.mo10482d(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x006d:
        r6.f25311b = r2;	 Catch:{ IllegalArgumentException -> 0x0065 }
        goto L_0x0000;
    L_0x0070:
        r0 = r7.mo10487h();
        r6.f25310a = r0;
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: klw.a(kvc):klw");
    }

    public final void writeTo(kvd kvd) {
        String str = this.f25310a;
        if (!(str == null || str.equals(""))) {
            kvd.mo10495b(1, this.f25310a);
        }
        int i = this.f25311b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        i = this.f25312c;
        if (i != 0) {
            kvd.mo10493b(3, i);
        }
        super.writeTo(kvd);
    }
}
