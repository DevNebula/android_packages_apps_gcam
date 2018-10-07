package p000;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* renamed from: bdd */
final class bdd extends ByteArrayOutputStream {
    /* renamed from: a */
    private final /* synthetic */ jwx f1108a;
    /* renamed from: b */
    private final /* synthetic */ bdc f1109b;

    bdd(bdc bdc, jwx jwx) {
        this.f1109b = bdc;
        this.f1108a = jwx;
    }

    public final void close() {
        /*
        r4 = this;
        super.close();
        r0 = r4.f1109b;
        r1 = r4.f1108a;
        r1 = r0.mo12357a(r1);
        r0 = r4.f1109b;
        r0 = r0.f11191a;
        r2 = r4.f1108a;
        r2 = r0.mo9601a(r2);
        r0 = r4.f1108a;
        r0 = r0.f8436b;
        r3 = r0.hashCode();
        switch(r3) {
            case -1487394660: goto L_0x0046;
            case -879267568: goto L_0x003c;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = -1;
    L_0x0021:
        switch(r0) {
            case 0: goto L_0x0034;
            case 1: goto L_0x002c;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = new java.lang.RuntimeException;
        r1 = "Unknown image type.";
        r0.<init>(r1);
        throw r0;
    L_0x002c:
        r0 = r4.toByteArray();
        p000.bdf.m825a(r0, r2, r1);
    L_0x0033:
        return;
    L_0x0034:
        r0 = r4.toByteArray();
        p000.bdf.m826b(r0, r2, r1);
        goto L_0x0033;
    L_0x003c:
        r3 = "image/gif";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0020;
    L_0x0044:
        r0 = 1;
        goto L_0x0021;
    L_0x0046:
        r3 = "image/jpeg";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0020;
    L_0x004e:
        r0 = 0;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdd.close():void");
    }
}
