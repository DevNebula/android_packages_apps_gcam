package p000;

/* renamed from: gio */
public final /* synthetic */ class gio implements Runnable {
    /* renamed from: a */
    private final gil f5490a;
    /* renamed from: b */
    private final fkp f5491b;
    /* renamed from: c */
    private final gik f5492c;

    public gio(gil gil, fkp fkp, gik gik) {
        this.f5490a = gil;
        this.f5491b = fkp;
        this.f5492c = gik;
    }

    /* JADX WARNING: Missing block: B:50:?, code:
            p000.gim.m11306a(r0, r2);
     */
    /* JADX WARNING: Missing block: B:57:?, code:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:65:?, code:
            p000.gim.m11306a(r0, r1);
     */
    public final void run() {
        /*
        r11 = this;
        r1 = 1;
        r2 = 0;
        r8 = r11.f5490a;
        r9 = r11.f5491b;
        r10 = r11.f5492c;
        r0 = p000.fkr.f4832c;
        r0 = r9.mo15528a(r0);
        r0 = (p000.iqm) r0;
        r4 = new gfw;
        r3 = r9.mo15529h();
        r4.<init>(r9, r0, r3);
        r0 = 2;
        r5 = android.media.CameraProfile.getJpegEncodingQualityParameter(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r8.f5487d;	 Catch:{ BufferOverflowException -> 0x005b }
        if (r0 == 0) goto L_0x0137;
    L_0x0022:
        r3 = r0.limit();	 Catch:{ BufferOverflowException -> 0x005b }
    L_0x0026:
        r0 = p000.gil.m2619b(r4);	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r0 / 2;
        if (r0 <= r3) goto L_0x0035;
    L_0x002e:
        r3 = java.nio.ByteBuffer.allocateDirect(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r8.f5487d = r3;	 Catch:{ BufferOverflowException -> 0x005b }
        r3 = r0;
    L_0x0035:
        r0 = r8.f5487d;	 Catch:{ BufferOverflowException -> 0x005b }
        r6 = p000.gij.m2617a(r4, r5, r0);	 Catch:{ BufferOverflowException -> 0x005b }
        if (r6 <= 0) goto L_0x0134;
    L_0x003d:
        r0 = r1;
    L_0x003e:
        p000.jri.m13405b(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        if (r6 <= r3) goto L_0x0067;
    L_0x0043:
        r0 = p000.gil.m2619b(r4);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = java.nio.ByteBuffer.allocateDirect(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r8.f5487d = r1;	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r8.f5487d;	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = p000.gij.m2617a(r4, r5, r1);	 Catch:{ BufferOverflowException -> 0x005b }
        if (r1 <= r0) goto L_0x0067;
    L_0x0055:
        r0 = new java.nio.BufferOverflowException;	 Catch:{ BufferOverflowException -> 0x005b }
        r0.<init>();	 Catch:{ BufferOverflowException -> 0x005b }
        throw r0;	 Catch:{ BufferOverflowException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        r1 = r10.f5482a;
        r1.mo15642a(r0);
        r1 = r10.f5483b;
        r1.mo15642a(r0);
    L_0x0066:
        return;
    L_0x0067:
        r5 = p000.itg.m4255a();	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = p000.gil.m2618a(r4);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r4.f5391f;	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = p000.iqp.m4103a(r1);	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = r4.f5388c;	 Catch:{ BufferOverflowException -> 0x005b }
        r3 = r1.mo8813a(r2);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r3.f7695a;	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = r3.f7696b;	 Catch:{ BufferOverflowException -> 0x005b }
        r7 = r4.f5388c;	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = p000.kbg.m4803b(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r5.mo8998a(r1, r2, r7, r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r4.f5387b;	 Catch:{ BufferOverflowException -> 0x005b }
        r0 = r0.mo13744f();	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = r8.f5487d;	 Catch:{ BufferOverflowException -> 0x005b }
        r7 = r2.hasArray();	 Catch:{ BufferOverflowException -> 0x005b }
        if (r7 == 0) goto L_0x0126;
    L_0x0096:
        r7 = r2.limit();	 Catch:{ BufferOverflowException -> 0x005b }
        if (r7 != r6) goto L_0x0126;
    L_0x009c:
        r2 = r2.array();	 Catch:{ BufferOverflowException -> 0x005b }
    L_0x00a0:
        r4 = r4.f5388c;	 Catch:{ BufferOverflowException -> 0x005b }
        r4 = r4.f7692e;	 Catch:{ BufferOverflowException -> 0x005b }
        r5 = r5.f7821a;	 Catch:{ BufferOverflowException -> 0x005b }
        r6 = r8.f5486c;	 Catch:{ BufferOverflowException -> 0x005b }
        r7 = 0;
        r0 = p000.foz.m2410a(r0, r2, r3, r4, r5, r6, r7);	 Catch:{ BufferOverflowException -> 0x005b }
        r9.close();	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r10.f5482a;	 Catch:{ BufferOverflowException -> 0x005b }
        r1.mo15641a(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        r1 = r8.f5485b;	 Catch:{ IOException -> 0x0109 }
        r2 = r1.f5488a;	 Catch:{ IOException -> 0x0109 }
        r1 = r1.f5489b;	 Catch:{ IOException -> 0x0109 }
        r3 = new gim;	 Catch:{ IOException -> 0x0109 }
        r3.<init>(r9, r2, r1);	 Catch:{ IOException -> 0x0109 }
        r1 = r3.f19201a;	 Catch:{ all -> 0x0118 }
        r1 = r3.mo13357a(r1);	 Catch:{ all -> 0x0118 }
        r2 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x0118 }
        r4 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0118 }
        r4.<init>(r1);	 Catch:{ all -> 0x0118 }
        r2.<init>(r4);	 Catch:{ all -> 0x0118 }
        r1 = r0.f4884d;	 Catch:{ all -> 0x0111 }
        r1 = r1.mo12670a(r2);	 Catch:{ all -> 0x0111 }
        r4 = r0.f4882b;	 Catch:{ all -> 0x011f }
        r0 = r3.f19201a;	 Catch:{ all -> 0x011f }
        r5 = p000.fkr.f4833d;	 Catch:{ all -> 0x011f }
        r0 = r0.mo15528a(r5);	 Catch:{ all -> 0x011f }
        r0 = (java.util.UUID) r0;	 Catch:{ all -> 0x011f }
        r5 = p000.bve.BURSTS;	 Catch:{ all -> 0x011f }
        r5 = r5.mo2167d();	 Catch:{ all -> 0x011f }
        r6 = 0;
        r7 = 1;
        r0 = p000.bbz.m813a(r0, r6, r5, r7);	 Catch:{ all -> 0x011f }
        p000.bdf.m826b(r4, r1, r0);	 Catch:{ all -> 0x011f }
        r0 = 0;
        p000.gim.m11306a(r0, r1);	 Catch:{ all -> 0x0111 }
        r0 = 0;
        p000.gim.m11306a(r0, r2);	 Catch:{ all -> 0x0118 }
        r0 = r10.f5483b;	 Catch:{ all -> 0x0118 }
        r1 = r3.f19201a;	 Catch:{ all -> 0x0118 }
        r1 = r3.mo13357a(r1);	 Catch:{ all -> 0x0118 }
        r0.mo15641a(r1);	 Catch:{ all -> 0x0118 }
        r3.close();	 Catch:{ IOException -> 0x0109 }
        goto L_0x0066;
    L_0x0109:
        r0 = move-exception;
        r1 = r10.f5483b;	 Catch:{ BufferOverflowException -> 0x005b }
        r1.mo15642a(r0);	 Catch:{ BufferOverflowException -> 0x005b }
        goto L_0x0066;
    L_0x0111:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0113 }
    L_0x0113:
        r1 = move-exception;
        p000.gim.m11306a(r0, r2);	 Catch:{ all -> 0x0118 }
        throw r1;	 Catch:{ all -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x011a }
    L_0x011a:
        r1 = move-exception;
        r3.close();	 Catch:{ all -> 0x013a }
    L_0x011e:
        throw r1;	 Catch:{ IOException -> 0x0109 }
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0121 }
    L_0x0121:
        r4 = move-exception;
        p000.gim.m11306a(r0, r1);	 Catch:{ all -> 0x0111 }
        throw r4;	 Catch:{ all -> 0x0111 }
    L_0x0126:
        r7 = r2.duplicate();	 Catch:{ BufferOverflowException -> 0x005b }
        r7.rewind();	 Catch:{ BufferOverflowException -> 0x005b }
        r2 = new byte[r6];	 Catch:{ BufferOverflowException -> 0x005b }
        r7.get(r2);	 Catch:{ BufferOverflowException -> 0x005b }
        goto L_0x00a0;
    L_0x0134:
        r0 = r2;
        goto L_0x003e;
    L_0x0137:
        r3 = r2;
        goto L_0x0026;
    L_0x013a:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);	 Catch:{ IOException -> 0x0109 }
        goto L_0x011e;
        */
        throw new UnsupportedOperationException("Method not decompiled: gio.run():void");
    }
}
