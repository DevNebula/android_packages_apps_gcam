package p000;

/* compiled from: PG */
/* renamed from: alu */
public final class alu implements adr {
    /* renamed from: a */
    public static final adm f22484a = adm.m169a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", Integer.valueOf(90));
    /* renamed from: b */
    public static final adm f22485b = adm.m168a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    /* renamed from: c */
    private final agu f22486c;

    @Deprecated
    public alu() {
        this.f22486c = null;
    }

    public alu(agu agu) {
        this.f22486c = agu;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce A:{Catch:{ all -> 0x00fc }} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A:{SYNTHETIC, Splitter: B:36:0x00d7} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2 A:{SYNTHETIC, Splitter: B:42:0x00e2} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2 A:{SYNTHETIC, Splitter: B:42:0x00e2} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce A:{Catch:{ all -> 0x00fc }} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d7 A:{SYNTHETIC, Splitter: B:36:0x00d7} */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e2 A:{SYNTHETIC, Splitter: B:42:0x00e2} */
    /* renamed from: a */
    private final boolean m14914a(p000.agn r12, java.io.File r13, p000.adp r14) {
        /*
        r11 = this;
        r4 = 0;
        r5 = 1;
        r6 = 0;
        r0 = r12.mo262b();
        r0 = (android.graphics.Bitmap) r0;
        r1 = f22485b;
        r1 = r14.mo11616a(r1);
        r1 = (android.graphics.Bitmap.CompressFormat) r1;
        if (r1 != 0) goto L_0x00bd;
    L_0x0013:
        r1 = r0.hasAlpha();
        if (r1 == 0) goto L_0x00b8;
    L_0x0019:
        r1 = android.graphics.Bitmap.CompressFormat.PNG;
        r2 = r1;
    L_0x001c:
        r0.getWidth();
        r0.getHeight();
        r8 = p000.arm.m655a();	 Catch:{ all -> 0x00c0 }
        r1 = f22484a;	 Catch:{ all -> 0x00c0 }
        r1 = r14.mo11616a(r1);	 Catch:{ all -> 0x00c0 }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x00c0 }
        r7 = r1.intValue();	 Catch:{ all -> 0x00c0 }
        r3 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00c2, all -> 0x00dd }
        r3.<init>(r13);	 Catch:{ IOException -> 0x00c2, all -> 0x00dd }
        r4 = r11.f22486c;	 Catch:{ IOException -> 0x00e6, all -> 0x00eb }
        if (r4 == 0) goto L_0x0041;
    L_0x003b:
        r1 = new adv;	 Catch:{ IOException -> 0x00e6, all -> 0x00eb }
        r1.<init>(r3, r4);	 Catch:{ IOException -> 0x00e6, all -> 0x00eb }
        r3 = r1;
    L_0x0041:
        r0.compress(r2, r7, r3);	 Catch:{ IOException -> 0x00ef, all -> 0x00f4 }
        r3.close();	 Catch:{ IOException -> 0x00ef, all -> 0x00f4 }
        r3.close();	 Catch:{ IOException -> 0x00f8 }
        r1 = r5;
    L_0x004b:
        r3 = "BitmapEncoder";
        r4 = 2;
        r3 = android.util.Log.isLoggable(r3, r4);	 Catch:{ all -> 0x00c0 }
        if (r3 == 0) goto L_0x00b7;
    L_0x0054:
        r3 = "BitmapEncoder";
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00c0 }
        r4 = p000.arq.m672a(r0);	 Catch:{ all -> 0x00c0 }
        r6 = p000.arm.m654a(r8);	 Catch:{ all -> 0x00c0 }
        r5 = f22485b;	 Catch:{ all -> 0x00c0 }
        r5 = r14.mo11616a(r5);	 Catch:{ all -> 0x00c0 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00c0 }
        r0 = r0.hasAlpha();	 Catch:{ all -> 0x00c0 }
        r8 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00c0 }
        r8 = r8.length();	 Catch:{ all -> 0x00c0 }
        r8 = r8 + 105;
        r9 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x00c0 }
        r9 = r9.length();	 Catch:{ all -> 0x00c0 }
        r8 = r8 + r9;
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00c0 }
        r9.<init>(r8);	 Catch:{ all -> 0x00c0 }
        r8 = "Compressed with type: ";
        r9.append(r8);	 Catch:{ all -> 0x00c0 }
        r9.append(r2);	 Catch:{ all -> 0x00c0 }
        r2 = " of size ";
        r9.append(r2);	 Catch:{ all -> 0x00c0 }
        r9.append(r4);	 Catch:{ all -> 0x00c0 }
        r2 = " in ";
        r9.append(r2);	 Catch:{ all -> 0x00c0 }
        r9.append(r6);	 Catch:{ all -> 0x00c0 }
        r2 = ", options format: ";
        r9.append(r2);	 Catch:{ all -> 0x00c0 }
        r9.append(r5);	 Catch:{ all -> 0x00c0 }
        r2 = ", hasAlpha: ";
        r9.append(r2);	 Catch:{ all -> 0x00c0 }
        r9.append(r0);	 Catch:{ all -> 0x00c0 }
        r0 = r9.toString();	 Catch:{ all -> 0x00c0 }
        android.util.Log.v(r3, r0);	 Catch:{ all -> 0x00c0 }
    L_0x00b7:
        return r1;
    L_0x00b8:
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;
        r2 = r1;
        goto L_0x001c;
    L_0x00bd:
        r2 = r1;
        goto L_0x001c;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r1 = move-exception;
        r3 = r1;
        r1 = r4;
    L_0x00c5:
        r4 = "BitmapEncoder";
        r5 = 3;
        r4 = android.util.Log.isLoggable(r4, r5);	 Catch:{ all -> 0x00fc }
        if (r4 == 0) goto L_0x00d5;
    L_0x00ce:
        r4 = "BitmapEncoder";
        r5 = "Failed to encode Bitmap";
        android.util.Log.d(r4, r5, r3);	 Catch:{ all -> 0x00fc }
    L_0x00d5:
        if (r1 == 0) goto L_0x0101;
    L_0x00d7:
        r1.close();	 Catch:{ IOException -> 0x0104 }
        r1 = r6;
        goto L_0x004b;
    L_0x00dd:
        r0 = move-exception;
        r1 = r0;
        r0 = r4;
    L_0x00e0:
        if (r0 == 0) goto L_0x00e5;
    L_0x00e2:
        r0.close();	 Catch:{ IOException -> 0x0108 }
    L_0x00e5:
        throw r1;	 Catch:{ all -> 0x00c0 }
    L_0x00e6:
        r1 = move-exception;
        r10 = r3;
        r3 = r1;
        r1 = r10;
        goto L_0x00c5;
    L_0x00eb:
        r0 = move-exception;
        r1 = r0;
        r0 = r3;
        goto L_0x00e0;
    L_0x00ef:
        r1 = move-exception;
        r10 = r3;
        r3 = r1;
        r1 = r10;
        goto L_0x00c5;
    L_0x00f4:
        r0 = move-exception;
        r1 = r0;
        r0 = r3;
        goto L_0x00e0;
    L_0x00f8:
        r1 = move-exception;
        r1 = r5;
        goto L_0x004b;
    L_0x00fc:
        r0 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
        goto L_0x00e0;
    L_0x0101:
        r1 = r6;
        goto L_0x004b;
    L_0x0104:
        r1 = move-exception;
        r1 = r6;
        goto L_0x004b;
    L_0x0108:
        r0 = move-exception;
        goto L_0x00e5;
        */
        throw new UnsupportedOperationException("Method not decompiled: alu.a(agn, java.io.File, adp):boolean");
    }

    /* renamed from: a */
    public final adh mo11619a(adp adp) {
        return adh.TRANSFORMED;
    }
}
