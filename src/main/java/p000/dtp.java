package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtp */
public final class dtp implements fwl {
    /* renamed from: a */
    private final iqz f16756a;
    /* renamed from: b */
    private final ird f16757b;
    /* renamed from: c */
    private final fhg f16758c;
    /* renamed from: d */
    private final kpk f16759d;
    /* renamed from: e */
    private final fmg f16760e;
    /* renamed from: f */
    private final fuw f16761f;

    public dtp(ira ira, ird ird, fhg fhg, kpk kpk, fmg fmg, fuw fuw) {
        this.f16757b = ird;
        this.f16758c = fhg;
        this.f16759d = kpk;
        this.f16760e = fmg;
        this.f16761f = fuw;
        this.f16756a = ira.mo8854a("SimpleImgCaptureCmd");
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return ilq.m3892b(this.f16758c.mo6791b(), ilq.m3890b(this.f16760e.mo6851a(), Integer.valueOf(1)));
    }

    /* renamed from: b */
    public final ilp mo6938b() {
        return ilq.m3876a(fds.m10411a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c7  */
    /* renamed from: a */
    public final void mo6937a(p000.fwm r12, p000.fwa r13) {
        /*
        r11 = this;
        r2 = 0;
        r1 = 1;
        r0 = r11.f16756a;
        r3 = "Executing simple capture command.";
        r0.mo8836d(r3);
        r0 = r11.f16757b;
        r3 = "SimpleImageCapture";
        r0.mo8856a(r3);
        r0 = r11.f16757b;
        r3 = "AcquireResources";
        r0.mo8856a(r3);
        r0 = r11.f16761f;	 Catch:{ all -> 0x00c1 }
        r3 = r0.mo6915a(r13);	 Catch:{ all -> 0x00c1 }
        r0 = r11.f16758c;	 Catch:{ all -> 0x00e4 }
        r4 = r0.mo6790a();	 Catch:{ all -> 0x00e4 }
        r0 = r11.f16760e;	 Catch:{ all -> 0x00f2 }
        r5 = 1;
        r5 = r0.mo6850a(r5);	 Catch:{ all -> 0x00f2 }
        r0 = r11.f16757b;	 Catch:{ all -> 0x0100 }
        r6 = "submitRequest";
        r0.mo8858b(r6);	 Catch:{ all -> 0x0100 }
        r6 = new bcq;	 Catch:{ all -> 0x0100 }
        r6.<init>();	 Catch:{ all -> 0x0100 }
        r0 = r11.f16759d;	 Catch:{ all -> 0x0100 }
        r0 = p000.isr.m4201a(r0);	 Catch:{ all -> 0x0100 }
        r0 = (p000.ffw) r0;	 Catch:{ all -> 0x0100 }
        r7 = new fio;	 Catch:{ all -> 0x0100 }
        r0 = r0.mo13673b();	 Catch:{ all -> 0x0100 }
        r0 = (p000.fim) r0;	 Catch:{ all -> 0x0100 }
        r7.<init>(r0);	 Catch:{ all -> 0x0100 }
        r0 = 2;
        r0 = r7.mo6808a(r0);	 Catch:{ all -> 0x0100 }
        r0.mo6810a(r5);	 Catch:{ all -> 0x0100 }
        r7 = new fwn;	 Catch:{ all -> 0x0100 }
        r7.<init>();	 Catch:{ all -> 0x0100 }
        r0.mo6813a(r7);	 Catch:{ all -> 0x0100 }
        r8 = r13.f4983c;	 Catch:{ all -> 0x0100 }
        r8 = r8.mo6927b();	 Catch:{ all -> 0x0100 }
        r8 = p000.fds.m10426b(r8);	 Catch:{ all -> 0x0100 }
        r0.mo6813a(r8);	 Catch:{ all -> 0x0100 }
        r8 = p000.fds.m10426b(r6);	 Catch:{ all -> 0x0100 }
        r0.mo6813a(r8);	 Catch:{ all -> 0x0100 }
        r8 = 1;
        r8 = new p000.fim[r8];	 Catch:{ all -> 0x0100 }
        r0 = r0.mo6807a();	 Catch:{ all -> 0x0100 }
        r9 = 0;
        r8[r9] = r0;	 Catch:{ all -> 0x0100 }
        r0 = java.util.Arrays.asList(r8);	 Catch:{ all -> 0x0100 }
        r8 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x0100 }
        r4.mo6816a(r0, r8);	 Catch:{ all -> 0x0100 }
        r0 = r11.f16757b;	 Catch:{ all -> 0x0100 }
        r8 = "exposureLatch#await";
        r0.mo8858b(r8);	 Catch:{ all -> 0x0100 }
        r6.await();	 Catch:{ all -> 0x0100 }
        r4.close();	 Catch:{ all -> 0x0100 }
        r0 = r11.f16757b;	 Catch:{ all -> 0x0100 }
        r6 = "getImage";
        r0.mo8858b(r6);	 Catch:{ all -> 0x0100 }
        r0 = r5.mo12344a();	 Catch:{ all -> 0x0100 }
        r0 = (p000.iwz) r0;	 Catch:{ all -> 0x0100 }
        r6 = r7.f18837a;	 Catch:{ all -> 0x0100 }
        r3.mo13282a(r0, r6);	 Catch:{ all -> 0x0100 }
        r0 = r11.f16756a;	 Catch:{ all -> 0x010c }
        r2 = "Payload succeeded. Shot is not yet saved.";
        r0.mo8836d(r2);	 Catch:{ all -> 0x010c }
        r0 = 0;
        p000.dtp.m9535a(r0, r5);	 Catch:{ all -> 0x0110 }
        if (r4 == 0) goto L_0x00b0;
    L_0x00ac:
        r0 = 0;
        p000.dtp.m9534a(r0, r4);	 Catch:{ all -> 0x0114 }
    L_0x00b0:
        if (r3 == 0) goto L_0x00b6;
    L_0x00b2:
        r0 = 0;
        p000.dtp.m9536a(r0, r3);	 Catch:{ all -> 0x0118 }
    L_0x00b6:
        r0 = r11.f16757b;
        r0.mo8857b();
        r0 = r11.f16757b;
        r0.mo8857b();
        return;
    L_0x00c1:
        r0 = move-exception;
        r10 = r2;
        r2 = r0;
        r0 = r10;
    L_0x00c5:
        if (r0 != 0) goto L_0x00d9;
    L_0x00c7:
        r0 = r11.f16756a;
        r3 = "Failed to expose an image. Aborting capture!";
        r0.mo8834c(r3);
        r0 = r13.f4982b;
        r3 = p000.hci.m11977a();
        r4 = "Simple image capture failed to expose an image. Aborting capture!";
        r0.mo7076a(r3, r1, r4);
    L_0x00d9:
        r0 = r11.f16757b;
        r0.mo8857b();
        r0 = r11.f16757b;
        r0.mo8857b();
        throw r2;
    L_0x00e4:
        r0 = move-exception;
        r10 = r2;
        r2 = r0;
        r0 = r10;
    L_0x00e8:
        throw r2;	 Catch:{ all -> 0x00e9 }
    L_0x00e9:
        r4 = move-exception;
        if (r3 == 0) goto L_0x00ef;
    L_0x00ec:
        p000.dtp.m9536a(r2, r3);	 Catch:{ all -> 0x00f0 }
    L_0x00ef:
        throw r4;	 Catch:{ all -> 0x00f0 }
    L_0x00f0:
        r2 = move-exception;
        goto L_0x00c5;
    L_0x00f2:
        r0 = move-exception;
        r10 = r2;
        r2 = r0;
        r0 = r10;
    L_0x00f6:
        throw r2;	 Catch:{ all -> 0x00f7 }
    L_0x00f7:
        r5 = move-exception;
        if (r4 == 0) goto L_0x00fd;
    L_0x00fa:
        p000.dtp.m9534a(r2, r4);	 Catch:{ all -> 0x00fe }
    L_0x00fd:
        throw r5;	 Catch:{ all -> 0x00fe }
    L_0x00fe:
        r2 = move-exception;
        goto L_0x00e8;
    L_0x0100:
        r0 = move-exception;
        r10 = r2;
        r2 = r0;
        r0 = r10;
    L_0x0104:
        throw r2;	 Catch:{ all -> 0x0105 }
    L_0x0105:
        r6 = move-exception;
        p000.dtp.m9535a(r2, r5);	 Catch:{ all -> 0x010a }
        throw r6;	 Catch:{ all -> 0x010a }
    L_0x010a:
        r2 = move-exception;
        goto L_0x00f6;
    L_0x010c:
        r0 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x0104;
    L_0x0110:
        r0 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x00f6;
    L_0x0114:
        r0 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x00e8;
    L_0x0118:
        r2 = move-exception;
        r0 = r1;
        goto L_0x00c5;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtp.a(fwm, fwa):void");
    }
}
