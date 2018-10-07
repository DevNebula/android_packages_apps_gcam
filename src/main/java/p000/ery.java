package p000;

import java.util.Calendar;

/* compiled from: PG */
/* renamed from: ery */
public final class ery {
    /* renamed from: a */
    public static final String f4406a = bli.m887a("PanoMetadata");
    /* renamed from: b */
    public final boolean f4407b;
    /* renamed from: c */
    public final int f4408c;
    /* renamed from: d */
    public final int f4409d;
    /* renamed from: e */
    public final int f4410e;
    /* renamed from: f */
    public final int f4411f;
    /* renamed from: g */
    public final boolean f4412g;
    /* renamed from: h */
    public final boolean f4413h;

    private ery(int i, int i2) {
        Calendar.getInstance();
        Calendar.getInstance();
        this.f4407b = true;
        this.f4408c = i;
        this.f4409d = i2;
        this.f4410e = i;
        this.f4411f = i2;
        this.f4412g = true;
        this.f4413h = false;
    }

    private ery(boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.f4407b = z;
        this.f4408c = i;
        this.f4409d = i2;
        this.f4410e = i3;
        this.f4411f = i4;
        this.f4412g = false;
        this.f4413h = z2;
    }

    /* renamed from: a */
    private static boolean m2140a(C0556wd c0556wd, String str) {
        return c0556wd.mo11449b("http://ns.google.com/photos/1.0/panorama/", str) ? c0556wd.mo11454f("http://ns.google.com/photos/1.0/panorama/", str).booleanValue() : false;
    }

    /* renamed from: b */
    private static Calendar m2141b(C0556wd c0556wd, String str) {
        return c0556wd.mo11449b("http://ns.google.com/photos/1.0/panorama/", str) ? c0556wd.mo11455g("http://ns.google.com/photos/1.0/panorama/", str) : null;
    }

    /* renamed from: c */
    private static int m2142c(C0556wd c0556wd, String str) {
        return c0556wd.mo11449b("http://ns.google.com/photos/1.0/panorama/", str) ? c0556wd.mo11457i("http://ns.google.com/photos/1.0/panorama/", str).intValue() : 0;
    }

    /* renamed from: a */
    private static boolean m2139a(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* renamed from: a */
    private static p000.ery m2137a(p000.eys r15) {
        /*
        r0 = r15.mo13202b();
        if (r0 != 0) goto L_0x0008;
    L_0x0006:
        r0 = 0;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = p000.jri.m13404b(r0);
        r0 = (java.io.InputStream) r0;
        r6 = p000.ern.m2084a(r0);
        r0.close();	 Catch:{ IOException -> 0x0137 }
    L_0x0015:
        if (r6 == 0) goto L_0x0129;
    L_0x0017:
        r0 = "FirstPhotoDate";
        p000.ery.m2141b(r6, r0);	 Catch:{ wb -> 0x015e }
        r0 = "LastPhotoDate";
        p000.ery.m2141b(r6, r0);	 Catch:{ wb -> 0x015e }
        r0 = "SourcePhotosCount";
        p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x015e }
        r0 = "ProjectionType";
        r1 = "http://ns.google.com/photos/1.0/panorama/";
        r1 = r6.mo11449b(r1, r0);	 Catch:{ wb -> 0x015e }
        if (r1 == 0) goto L_0x0035;
    L_0x0030:
        r1 = "http://ns.google.com/photos/1.0/panorama/";
        r6.mo11458j(r1, r0);	 Catch:{ wb -> 0x015e }
    L_0x0035:
        r0 = "UsePanoramaViewer";
        r5 = p000.ery.m2140a(r6, r0);	 Catch:{ wb -> 0x015e }
        r0 = "CroppedAreaImageWidthPixels";
        r4 = p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x016d }
        r0 = "CroppedAreaImageHeightPixels";
        r3 = p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x0173 }
        r0 = "FullPanoWidthPixels";
        r2 = p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x0178 }
        r0 = "FullPanoHeightPixels";
        r1 = p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x017c }
        r0 = "CroppedAreaLeftPixels";
        p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x01a6 }
        r0 = "CroppedAreaTopPixels";
        p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x01a6 }
        r0 = "LargestValidInteriorRectLeft";
        p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x01a6 }
        r0 = "LargestValidInteriorRectTop";
        p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x01a6 }
        r0 = "LargestValidInteriorRectWidth";
        p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x01a6 }
        r0 = "LargestValidInteriorRectHeight";
        p000.ery.m2142c(r6, r0);	 Catch:{ wb -> 0x01a6 }
        r0 = "http://ns.google.com/photos/1.0/panorama/";
        r7 = "IsPhotosphere";
        r0 = r6.mo11449b(r0, r7);	 Catch:{ wb -> 0x01a6 }
        if (r0 == 0) goto L_0x0121;
    L_0x007b:
        r0 = "IsPhotosphere";
        r6 = p000.ery.m2140a(r6, r0);	 Catch:{ wb -> 0x01a6 }
    L_0x0081:
        if (r4 <= 0) goto L_0x011e;
    L_0x0083:
        if (r3 <= 0) goto L_0x011b;
    L_0x0085:
        if (r2 <= 0) goto L_0x0118;
    L_0x0087:
        if (r1 <= 0) goto L_0x0115;
    L_0x0089:
        r0 = 1;
    L_0x008a:
        r7 = r1;
        r8 = r2;
        r9 = r3;
        r10 = r4;
        r11 = r5;
    L_0x008f:
        r1 = new android.graphics.BitmapFactory$Options;
        r1.<init>();
        r2 = 1;
        r1.inJustDecodeBounds = r2;
        r2 = r15.mo13202b();
        if (r2 != 0) goto L_0x00a7;
    L_0x009d:
        r0 = f4406a;
        r1 = "Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata";
        p000.bli.m898e(r0, r1);
        r0 = 0;
        goto L_0x0007;
    L_0x00a7:
        r3 = 0;
        android.graphics.BitmapFactory.decodeStream(r2, r3, r1);
        r2.close();	 Catch:{ IOException -> 0x017f }
    L_0x00ae:
        r13 = r1.outWidth;
        r14 = r1.outHeight;
        r1 = r14 + r14;
        if (r0 != 0) goto L_0x0112;
    L_0x00b6:
        if (r1 != r13) goto L_0x010f;
    L_0x00b8:
        r0 = f4406a;
        r1 = "Could not parse pano metadata for file. Filling in 360 defaults.";
        p000.bli.m894c(r0, r1);
        r0 = 1;
        r12 = r0;
    L_0x00c1:
        r0 = (double) r13;
        r2 = (double) r14;
        r0 = r0 / r2;
        r2 = (double) r10;
        r4 = (double) r9;
        r2 = r2 / r4;
        if (r12 != 0) goto L_0x00de;
    L_0x00c9:
        r4 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r0 = p000.ery.m2139a(r0, r2, r4);
        if (r0 != 0) goto L_0x00de;
    L_0x00d4:
        r0 = f4406a;
        r1 = "Pano metadata does not match file dimensions.";
        p000.bli.m898e(r0, r1);
        r0 = 0;
        goto L_0x0007;
    L_0x00de:
        if (r12 != 0) goto L_0x00fa;
    L_0x00e0:
        r0 = (double) r8;
        r2 = (double) r7;
        r0 = r0 / r2;
        r2 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r4 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
        r0 = p000.ery.m2139a(r0, r2, r4);
        if (r0 != 0) goto L_0x00fa;
    L_0x00f0:
        r0 = f4406a;
        r1 = "Pano metadata invalid: Full pano dimension not 2:1.";
        p000.bli.m898e(r0, r1);
        r0 = 0;
        goto L_0x0007;
    L_0x00fa:
        if (r12 == 0) goto L_0x0103;
    L_0x00fc:
        r0 = new ery;
        r0.<init>(r13, r14);
        goto L_0x0007;
    L_0x0103:
        r0 = new ery;
        r1 = r11;
        r2 = r10;
        r3 = r9;
        r4 = r8;
        r5 = r7;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        goto L_0x0007;
    L_0x010f:
        r0 = 0;
        goto L_0x0007;
    L_0x0112:
        r0 = 0;
        r12 = r0;
        goto L_0x00c1;
    L_0x0115:
        r0 = 0;
        goto L_0x008a;
    L_0x0118:
        r0 = 0;
        goto L_0x008a;
    L_0x011b:
        r0 = 0;
        goto L_0x008a;
    L_0x011e:
        r0 = 0;
        goto L_0x008a;
    L_0x0121:
        r0 = "UsePanoramaViewer";
        r6 = p000.ery.m2140a(r6, r0);	 Catch:{ wb -> 0x01a6 }
        goto L_0x0081;
    L_0x0129:
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r1 = 0;
        r0 = 0;
        r6 = 0;
        r7 = r1;
        r8 = r2;
        r9 = r3;
        r10 = r4;
        r11 = r5;
        goto L_0x008f;
    L_0x0137:
        r0 = move-exception;
        r1 = f4406a;
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 24;
        r3.<init>(r2);
        r2 = "Failed to close stream: ";
        r3.append(r2);
        r3.append(r0);
        r0 = r3.toString();
        p000.bli.m891b(r1, r0);
        goto L_0x0015;
    L_0x015e:
        r0 = move-exception;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r1 = 0;
    L_0x0164:
        r0 = 0;
        r6 = 0;
        r7 = r1;
        r8 = r2;
        r9 = r3;
        r10 = r4;
        r11 = r5;
        goto L_0x008f;
    L_0x016d:
        r0 = move-exception;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r1 = 0;
        goto L_0x0164;
    L_0x0173:
        r0 = move-exception;
        r3 = 0;
        r2 = 0;
        r1 = 0;
        goto L_0x0164;
    L_0x0178:
        r0 = move-exception;
        r2 = 0;
        r1 = 0;
        goto L_0x0164;
    L_0x017c:
        r0 = move-exception;
        r1 = 0;
        goto L_0x0164;
    L_0x017f:
        r2 = move-exception;
        r3 = f4406a;
        r2 = java.lang.String.valueOf(r2);
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 24;
        r5.<init>(r4);
        r4 = "Failed to close stream: ";
        r5.append(r4);
        r5.append(r2);
        r2 = r5.toString();
        p000.bli.m891b(r3, r2);
        goto L_0x00ae;
    L_0x01a6:
        r0 = move-exception;
        goto L_0x0164;
        */
        throw new UnsupportedOperationException("Method not decompiled: ery.a(eys):ery");
    }

    /* renamed from: a */
    public static ery m2138a(String str) {
        return ery.m2137a(new eys(str));
    }
}
