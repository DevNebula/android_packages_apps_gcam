package p000;

/* compiled from: PG */
/* renamed from: brm */
public final class brm extends fiw {
    /* renamed from: a */
    public kbg f11739a = kau.f21835a;
    /* renamed from: b */
    private kbg f11740b = kau.f21835a;

    brm() {
    }

    /* renamed from: a */
    public final synchronized void mo12424a() {
        this.f11739a = kau.f21835a;
    }

    /* JADX WARNING: Missing block: B:9:0x002d, code:
            r4 = (java.lang.Long) r19.mo13730a(android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP);
            r5 = (android.hardware.camera2.params.Face[]) r19.mo13730a(android.hardware.camera2.CaptureResult.STATISTICS_FACES);
     */
    /* JADX WARNING: Missing block: B:10:0x0041, code:
            if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Missing block: B:11:0x0043, code:
            r7 = p000.ken.m13718d();
     */
    /* JADX WARNING: Missing block: B:12:0x0047, code:
            if (r5 == null) goto L_0x0083;
     */
    /* JADX WARNING: Missing block: B:13:0x0049, code:
            r8 = r5.length;
            r6 = 0;
     */
    /* JADX WARNING: Missing block: B:14:0x004b, code:
            if (r6 >= r8) goto L_0x0083;
     */
    /* JADX WARNING: Missing block: B:15:0x004d, code:
            r9 = r5[r6].getBounds();
            r10 = r9.left;
            r11 = r3.getWidth();
            r12 = r9.top;
            r13 = r3.getHeight();
            r14 = r9.right;
            r7.mo15104c(new android.graphics.RectF(((float) r10) / r11, ((float) r12) / r13, ((float) r14) / r3.getWidth(), ((float) r9.bottom) / r3.getHeight()));
            r6 = r6 + 1;
     */
    /* JADX WARNING: Missing block: B:16:0x0083, code:
            r6 = new p000.brk(r4.longValue(), p000.ken.m13713a(r7.mo15102a()));
            r2.mo2094a();
     */
    /* JADX WARNING: Missing block: B:29:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:31:?, code:
            return;
     */
    /* renamed from: a_ */
    public final void mo6826a_(p000.iwp r19) {
        /*
        r18 = this;
        super.mo6826a_(r19);
        monitor-enter(r18);
        r0 = r18;
        r2 = r0.f11740b;	 Catch:{ all -> 0x00bc }
        r2 = r2.mo9709b();	 Catch:{ all -> 0x00bc }
        if (r2 == 0) goto L_0x0098;
    L_0x000e:
        r0 = r18;
        r2 = r0.f11739a;	 Catch:{ all -> 0x00bc }
        r2 = r2.mo9709b();	 Catch:{ all -> 0x00bc }
        if (r2 == 0) goto L_0x0098;
    L_0x0018:
        r0 = r18;
        r2 = r0.f11740b;	 Catch:{ all -> 0x00bc }
        r2 = r2.mo9706a();	 Catch:{ all -> 0x00bc }
        r2 = (p000.brn) r2;	 Catch:{ all -> 0x00bc }
        r0 = r18;
        r3 = r0.f11739a;	 Catch:{ all -> 0x00bc }
        r3 = r3.mo9706a();	 Catch:{ all -> 0x00bc }
        r3 = (android.util.SizeF) r3;	 Catch:{ all -> 0x00bc }
        monitor-exit(r18);	 Catch:{ all -> 0x00bc }
        r4 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP;
        r0 = r19;
        r4 = r0.mo13730a(r4);
        r4 = (java.lang.Long) r4;
        r5 = android.hardware.camera2.CaptureResult.STATISTICS_FACES;
        r0 = r19;
        r5 = r0.mo13730a(r5);
        r5 = (android.hardware.camera2.params.Face[]) r5;
        if (r4 == 0) goto L_0x0097;
    L_0x0043:
        r7 = p000.ken.m13718d();
        if (r5 == 0) goto L_0x0083;
    L_0x0049:
        r8 = r5.length;
        r6 = 0;
    L_0x004b:
        if (r6 >= r8) goto L_0x0083;
    L_0x004d:
        r9 = r5[r6];
        r9 = r9.getBounds();
        r10 = r9.left;
        r11 = r3.getWidth();
        r12 = r9.top;
        r13 = r3.getHeight();
        r14 = r9.right;
        r15 = r3.getWidth();
        r9 = r9.bottom;
        r16 = r3.getHeight();
        r17 = new android.graphics.RectF;
        r10 = (float) r10;
        r10 = r10 / r11;
        r11 = (float) r12;
        r11 = r11 / r13;
        r12 = (float) r14;
        r12 = r12 / r15;
        r9 = (float) r9;
        r9 = r9 / r16;
        r0 = r17;
        r0.<init>(r10, r11, r12, r9);
        r0 = r17;
        r7.mo15104c(r0);
        r6 = r6 + 1;
        goto L_0x004b;
    L_0x0083:
        r4 = r4.longValue();
        r3 = r7.mo15102a();
        r6 = new brk;
        r3 = p000.ken.m13713a(r3);
        r6.<init>(r4, r3);
        r2.mo2094a();
    L_0x0097:
        return;
    L_0x0098:
        r0 = r18;
        r2 = r0.f11740b;	 Catch:{ all -> 0x00bc }
        r2 = r2.mo9709b();	 Catch:{ all -> 0x00bc }
        if (r2 != 0) goto L_0x00a9;
    L_0x00a2:
        r2 = "faceMetadataDistributor";
        r3 = "Face metadata listener is not set";
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x00bc }
    L_0x00a9:
        r0 = r18;
        r2 = r0.f11739a;	 Catch:{ all -> 0x00bc }
        r2 = r2.mo9709b();	 Catch:{ all -> 0x00bc }
        if (r2 != 0) goto L_0x00ba;
    L_0x00b3:
        r2 = "faceMetadataDistributor";
        r3 = "Active size is not set";
        android.util.Log.w(r2, r3);	 Catch:{ all -> 0x00bc }
    L_0x00ba:
        monitor-exit(r18);	 Catch:{ all -> 0x00bc }
        goto L_0x0097;
    L_0x00bc:
        r2 = move-exception;
        monitor-exit(r18);	 Catch:{ all -> 0x00bc }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: brm.a_(iwp):void");
    }
}
