package p000;

/* compiled from: PG */
/* renamed from: klp */
public final class klp extends kvf {
    /* renamed from: a */
    public int f25276a;
    /* renamed from: b */
    public int f25277b;

    public klp() {
        this.f25276a = 0;
        this.f25277b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f25276a;
        if (i != 0) {
            computeSerializedSize += kvd.m5476a(1, i);
        }
        i = this.f25277b;
        if (i != 0) {
            return computeSerializedSize + kvd.m5476a(2, i);
        }
        return computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:5:0x000e, code:
            return r7;
     */
    /* JADX WARNING: Missing block: B:24:0x0063, code:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* renamed from: a */
    private final p000.klp m16947a(p000.kvc r8) {
        /*
        r7 = this;
        r6 = 2;
    L_0x0001:
        r0 = r8.mo10488i();
        switch(r0) {
            case 0: goto L_0x000e;
            case 8: goto L_0x003f;
            case 16: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.storeUnknownField(r8, r0);
        if (r0 != 0) goto L_0x0001;
    L_0x000e:
        return r7;
    L_0x000f:
        r1 = r8.mo10476b();
        r2 = r8.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r2 < 0) goto L_0x001b;
    L_0x0019:
        if (r2 <= r6) goto L_0x003c;
    L_0x001b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r5 = 37;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = " is not a valid enum State";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0034 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        r8.mo10482d(r1);
        r7.storeUnknownField(r8, r0);
        goto L_0x0001;
    L_0x003c:
        r7.f25277b = r2;	 Catch:{ IllegalArgumentException -> 0x0034 }
        goto L_0x0001;
    L_0x003f:
        r1 = r8.mo10476b();
        r2 = r8.mo10485f();	 Catch:{ IllegalArgumentException -> 0x0064 }
        if (r2 < 0) goto L_0x004b;
    L_0x0049:
        if (r2 <= r6) goto L_0x006c;
    L_0x004b:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0064 }
        r5 = 36;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r2 = " is not a valid enum Type";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0064 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0064 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0064 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0064 }
    L_0x0064:
        r2 = move-exception;
        r8.mo10482d(r1);
        r7.storeUnknownField(r8, r0);
        goto L_0x0001;
    L_0x006c:
        r7.f25276a = r2;	 Catch:{ IllegalArgumentException -> 0x0064 }
        goto L_0x0001;
        */
        throw new UnsupportedOperationException("Method not decompiled: klp.a(kvc):klp");
    }

    public final void writeTo(kvd kvd) {
        int i = this.f25276a;
        if (i != 0) {
            kvd.mo10493b(1, i);
        }
        i = this.f25277b;
        if (i != 0) {
            kvd.mo10493b(2, i);
        }
        super.writeTo(kvd);
    }
}
