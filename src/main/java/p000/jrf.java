package p000;

import android.annotation.TargetApi;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jrf */
public final class jrf implements jqs {
    /* renamed from: a */
    private final jqz f24785a;
    /* renamed from: b */
    private final int f24786b;
    /* renamed from: c */
    private final int f24787c;
    /* renamed from: d */
    private final float f24788d;
    /* renamed from: e */
    private final float f24789e;

    public jrf(jqz jqz, int i, int i2) {
        boolean z;
        boolean z2 = true;
        jri.m13404b((Object) jqz);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Target width must be positive.");
        if (i2 <= 0) {
            z2 = false;
        }
        jri.m13396a(z2, (Object) "Target height must be positive.");
        this.f24785a = jqz;
        this.f24786b = i;
        this.f24787c = i2;
        jqz jqz2 = this.f24785a;
        this.f24788d = ((float) jqz2.f24782a) / ((float) this.f24786b);
        this.f24789e = ((float) jqz2.f24783b) / ((float) this.f24787c);
    }

    public final void close() {
        this.f24785a.close();
    }

    /* renamed from: a */
    public final int mo9533a() {
        return this.f24787c;
    }

    /* renamed from: b */
    public final int mo9534b() {
        return this.f24786b;
    }

    /* renamed from: a */
    public final jqr mo13824a(jqo jqo) {
        return mo13825b(jqo);
    }

    /* renamed from: b */
    public final jqr mo13825b(jqo jqo) {
        return mo13822a(this.f24786b, this.f24787c, jqo);
    }

    /* JADX WARNING: Missing block: B:10:0x004a, code:
            if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Missing block: B:12:?, code:
            r1.mo15063a();
     */
    /* JADX WARNING: Missing block: B:14:0x0050, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:15:0x0051, code:
            p000.kqg.m5105a(r0, r1);
     */
    /* renamed from: a */
    public final p000.jqr mo13823a(android.graphics.Rect r7, p000.jqo r8) {
        /*
        r6 = this;
        r0 = new android.graphics.Rect;
        r1 = r7.left;
        r1 = (float) r1;
        r2 = r6.f24788d;
        r1 = r1 * r2;
        r1 = java.lang.Math.round(r1);
        r2 = r7.top;
        r2 = (float) r2;
        r3 = r6.f24789e;
        r2 = r2 * r3;
        r2 = java.lang.Math.round(r2);
        r3 = r7.right;
        r3 = (float) r3;
        r4 = r6.f24788d;
        r3 = r3 * r4;
        r3 = java.lang.Math.round(r3);
        r4 = r7.bottom;
        r4 = (float) r4;
        r5 = r6.f24789e;
        r4 = r4 * r5;
        r4 = java.lang.Math.round(r4);
        r0.<init>(r1, r2, r3, r4);
        r1 = r6.f24785a;
        r1 = r1.mo13823a(r0, r8);
        r0 = "rescale-region";
        r2 = r7.width();	 Catch:{ all -> 0x0047 }
        r3 = r7.height();	 Catch:{ all -> 0x0047 }
        r0 = p000.jqp.m4670a(r8, r0, r1, r2, r3);	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x0046;
    L_0x0043:
        r1.mo15063a();
    L_0x0046:
        return r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r2 = move-exception;
        if (r1 == 0) goto L_0x004f;
    L_0x004c:
        r1.mo15063a();	 Catch:{ all -> 0x0050 }
    L_0x004f:
        throw r2;
    L_0x0050:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: jrf.a(android.graphics.Rect, jqo):jqr");
    }

    /* renamed from: a */
    public final jqr mo13822a(int i, int i2, jqo jqo) {
        return this.f24785a.mo13822a(i, i2, jqo);
    }
}
