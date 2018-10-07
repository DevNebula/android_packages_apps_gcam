package p000;

import android.graphics.ImageFormat;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.CameraProfile;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.image.ColorImage.Format;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dxj */
public final class dxj implements aag {
    /* renamed from: a */
    public static final String f16931a = bli.m887a("CameraPreview");
    /* renamed from: j */
    private static final abc[] f16932j = new abc[]{abc.CONTINUOUS_PICTURE, abc.CONTINUOUS_VIDEO, abc.AUTO, abc.FIXED, abc.EXTENDED_DOF, abc.INFINITY, abc.MACRO};
    /* renamed from: m */
    private static final Comparator f16933m = new dxk();
    /* renamed from: b */
    public aah f16934b = null;
    /* renamed from: c */
    public abh f16935c = null;
    /* renamed from: d */
    public boolean f16936d = false;
    /* renamed from: e */
    public dxm f16937e = null;
    /* renamed from: f */
    public abo f16938f;
    /* renamed from: g */
    public final cfh f16939g;
    /* renamed from: h */
    public final Handler f16940h;
    /* renamed from: i */
    public final Object f16941i;
    /* renamed from: k */
    private ColorImage f16942k = null;
    /* renamed from: l */
    private aaz f16943l;

    public dxj(cfh cfh, Handler handler, aah aah, int i) {
        this.f16939g = cfh;
        cfh.mo12480k();
        this.f16940h = handler;
        this.f16934b = aah;
        this.f16938f = aah.mo28i();
        this.f16943l = aah.mo24e();
        if (this.f16934b != null) {
            double d;
            abw[] abwArr;
            int i2;
            Object obj;
            abc abc;
            bli.m888a(f16931a, "Configuring camera...");
            this.f16935c = this.f16934b.mo25f();
            aaz aaz = this.f16943l;
            abo abo = this.f16938f;
            List<abw> c = aaz.mo51c();
            List<abw> a = aaz.mo45a();
            String str = f16931a;
            String valueOf = String.valueOf(dxj.m9668a((List) c));
            String str2 = "preview formats:\n";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            str = f16931a;
            valueOf = String.valueOf(dxj.m9668a((List) a));
            str2 = "picture formats:\n";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            Collections.sort(c, f16933m);
            Collections.sort(a, f16933m);
            hre hre = new hre(new hrf(i));
            double d2 = hre.f6850a.f6852b;
            if (d2 < 0.0d) {
                d = ((double) ((abw) a.get(0)).f178a.x) / ((double) ((abw) a.get(0)).f178a.y);
            } else {
                d = d2;
            }
            abw abw = null;
            abw abw2 = null;
            double d3 = Double.MAX_VALUE;
            for (abw abw3 : a) {
                double d4;
                Point point = abw3.f178a;
                if (Math.abs((((double) point.x) / ((double) point.y)) - d) > 0.01d) {
                    d4 = 14.0d;
                } else {
                    d4 = 0.0d;
                }
                point = abw3.f178a;
                double abs = d4 + (Math.abs((((double) (point.y * point.x)) / 1000000.0d) - hre.f6850a.f6851a) * 4.0d);
                if (abs <= d3) {
                    double d5 = d3;
                    abw abw4 = abw2;
                    abw abw5 = abw;
                    double d6 = d5;
                    for (abw abw6 : c) {
                        abw abw62;
                        double d7;
                        Point point2 = abw62.f178a;
                        int i3 = point2.x;
                        int i4 = point2.y;
                        Point point3 = abw3.f178a;
                        if (Math.abs((((double) i3) / ((double) i4)) - (((double) point3.x) / ((double) point3.y))) >= 0.01d) {
                            d4 = Double.MAX_VALUE;
                        } else {
                            point2 = abw62.f178a;
                            i4 = (int) Math.max(Math.ceil(Math.log(((double) Math.max(point2.x, point2.y)) / hre.f6850a.f6855e) / Math.log(2.0d)), 0.0d);
                            point3 = abw62.f178a;
                            abw abw7 = new abw(point3.x >> i4, point3.y >> i4);
                            point2 = abw3.f178a;
                            int i5 = point2.x;
                            i4 = point2.y;
                            Point point4 = abw7.f178a;
                            d7 = (double) ((i4 * i5) / (point4.x * point4.y));
                            d4 = (Math.log((double) (abw62.f178a.x / point4.x)) / Math.log(2.0d)) + (Math.max(0.0d, d7 - hre.f6850a.f6854d) + Math.max(0.0d, hre.f6850a.f6853c - d7));
                        }
                        d7 = d4 + abs;
                        if (d7 < d6) {
                            d4 = d7;
                        } else {
                            d4 = d6;
                        }
                        if (d7 < d6) {
                            abw5 = abw62;
                        }
                        if (d7 < d6) {
                            abw62 = abw3;
                        } else {
                            abw62 = abw4;
                        }
                        d6 = d4;
                        abw4 = abw62;
                    }
                    d5 = d6;
                    abw2 = abw4;
                    abw = abw5;
                    d3 = d5;
                }
            }
            if (abw2 != null) {
                abwArr = abw != null ? new abw[]{abw, abw2} : null;
            } else {
                abwArr = null;
            }
            if (abwArr == null) {
                bli.m891b(f16931a, "Could not find compatible preview and picture sizes!");
            } else {
                str = f16931a;
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Preferred megapixels: ");
                stringBuilder.append(i);
                bli.m894c(str, stringBuilder.toString());
                str = f16931a;
                Point point5 = abwArr[0].f178a;
                int i6 = point5.x;
                i2 = point5.y;
                StringBuilder stringBuilder2 = new StringBuilder(45);
                stringBuilder2.append("Preview size        : ");
                stringBuilder2.append(i6);
                stringBuilder2.append("x");
                stringBuilder2.append(i2);
                bli.m894c(str, stringBuilder2.toString());
                str = f16931a;
                point5 = abwArr[1].f178a;
                i6 = point5.x;
                i2 = point5.y;
                stringBuilder2 = new StringBuilder(45);
                stringBuilder2.append("Picture size        : ");
                stringBuilder2.append(i6);
                stringBuilder2.append("x");
                stringBuilder2.append(i2);
                bli.m894c(str, stringBuilder2.toString());
                abo.mo73b(abwArr[0]);
                abo.mo71a(abwArr[1]);
                abo.mo69a(CameraProfile.getJpegEncodingQualityParameter(this.f16934b.mo22c(), 2));
            }
            aaz = this.f16943l;
            abo abo2 = this.f16938f;
            List<int[]> b = aaz.mo50b();
            int[] iArr = new int[]{-1, -1};
            int[] iArr2 = iArr;
            for (int[] iArr3 : b) {
                int i7 = iArr3[0];
                if (i7 >= 7000) {
                    int i8 = iArr3[1];
                    if (i8 <= 30000) {
                        if (i8 > iArr2[1]) {
                            iArr2 = iArr3;
                        } else if (i7 < iArr2[0]) {
                            iArr2 = iArr3;
                        }
                    }
                }
            }
            if (iArr2[0] < 0) {
                iArr3 = (int[]) b.get(b.size() - 1);
            } else {
                iArr3 = iArr2;
            }
            abo2.mo70a(iArr3[0], iArr3[1]);
            str = f16931a;
            i2 = iArr3[0];
            int i9 = iArr3[1];
            StringBuilder stringBuilder3 = new StringBuilder(40);
            stringBuilder3.append("fps range set to ");
            stringBuilder3.append(i2);
            stringBuilder3.append("-");
            stringBuilder3.append(i9);
            bli.m888a(str, stringBuilder3.toString());
            aaz = this.f16943l;
            abf abf = abf.AUTO;
            if (abf == null) {
                obj = null;
            } else if (aaz.f57k.contains(abf)) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f16938f.f153s = abf.AUTO;
            }
            if (this.f16943l.mo47a(abb.OFF)) {
                this.f16938f.f150p = abb.OFF;
            }
            abo2 = this.f16938f;
            for (abc abc2 : f16932j) {
                if (this.f16943l.mo48a(abc2)) {
                    break;
                }
            }
            Iterator it = new HashSet(this.f16943l.f56j).iterator();
            if (it.hasNext()) {
                abc2 = (abc) it.next();
            } else {
                abc2 = null;
            }
            abo2.f151q = abc2;
            try {
                this.f16934b.mo18a(this.f16938f);
            } catch (RuntimeException e) {
                bli.m891b(f16931a, e.toString());
            }
            mo13083a();
        }
        aah.mo16a(false);
        this.f16941i = new Object();
    }

    /* renamed from: a */
    private static String m9668a(List list) {
        Iterator it = list.iterator();
        String str = "";
        while (true) {
            String str2 = str;
            if (!it.hasNext()) {
                return str2;
            }
            abw abw = (abw) it.next();
            str2 = String.valueOf(str2);
            r3 = new Object[2];
            Point point = abw.f178a;
            r3[0] = Integer.valueOf(point.x);
            r3[1] = Integer.valueOf(point.y);
            str = String.valueOf(String.format("%dx%d ", r3));
            if (str.length() != 0) {
                str = str2.concat(str);
            } else {
                str = new String(str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo13083a() {
        this.f16934b.mo9a(0);
    }

    /* renamed from: b */
    public final int mo13088b() {
        double tan = Math.tan(((((double) this.f16943l.f67u) * 3.141592653589793d) / 180.0d) / 2.0d);
        return (int) (36.0d / (tan + tan));
    }

    /* renamed from: a */
    public final void mo7a(byte[] bArr, aah aah) {
        if (this.f16937e != null) {
            this.f16942k.setBuffer(bArr);
            this.f16937e.mo6104a(this.f16942k, SystemClock.elapsedRealtimeNanos());
            if (this.f16936d) {
                aah.mo17a(this.f16942k.getBuffer());
            }
        }
    }

    /* renamed from: c */
    public final void mo13089c() {
        bli.m888a(f16931a, "Shutting down camera...");
        if (this.f16934b != null) {
            mo13090d();
            this.f16934b = null;
        }
    }

    /* renamed from: a */
    public final void mo13085a(abo abo) {
        this.f16938f = abo;
        this.f16934b.mo18a(this.f16938f);
    }

    /* renamed from: a */
    public final void mo13086a(SurfaceTexture surfaceTexture, aat aat) {
        if (this.f16934b == null || surfaceTexture == null) {
            bli.m891b(f16931a, "Started preview without camera or surface!");
            return;
        }
        bli.m888a(f16931a, "Starting camera preview...");
        this.f16934b.mo10a(surfaceTexture);
        mo13084a(aat);
    }

    /* renamed from: a */
    public final void mo13084a(aat aat) {
        synchronized (this.f16941i) {
            if (this.f16936d) {
                return;
            }
            if (this.f16937e != null) {
                abw c = this.f16938f.mo74c();
                int i = this.f16938f.f145k;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
                if (bitsPerPixel <= 0) {
                    StringBuilder stringBuilder = new StringBuilder(33);
                    stringBuilder.append("Unknown image format: ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                Point point = c.f178a;
                int i2 = (bitsPerPixel * (point.x * point.y)) / 8;
                for (bitsPerPixel = 0; bitsPerPixel < 2; bitsPerPixel++) {
                    this.f16934b.mo17a(new byte[i2]);
                }
                Point point2 = c.f178a;
                this.f16942k = new ColorImage(point2.x, point2.y, Format.fromImageFormat(i), null);
                this.f16934b.mo21b(this.f16940h, this);
            }
            if (aat != null) {
                this.f16934b.mo13a(this.f16940h, aat);
            } else {
                aah aah = this.f16934b;
                try {
                    aah.mo26g().mo82a(new aap(aah));
                } catch (RuntimeException e) {
                    aah.mo8a().mo11592b().mo59a(e);
                }
            }
            this.f16936d = true;
        }
    }

    /* JADX WARNING: Missing block: B:13:?, code:
            return;
     */
    /* renamed from: d */
    public final void mo13090d() {
        /*
        r4 = this;
        r1 = r4.f16941i;
        monitor-enter(r1);
        r0 = r4.f16936d;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r4.f16934b;	 Catch:{ all -> 0x0025 }
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = f16931a;	 Catch:{ all -> 0x0025 }
        r2 = "Stopping camera preview...";
        p000.bli.m888a(r0, r2);	 Catch:{ all -> 0x0025 }
        r0 = 0;
        r4.f16936d = r0;	 Catch:{ all -> 0x0025 }
        r0 = r4.f16934b;	 Catch:{ all -> 0x0025 }
        r0.mo30k();	 Catch:{ all -> 0x0025 }
        r0 = r4.f16934b;	 Catch:{ all -> 0x0025 }
        r2 = 0;
        r3 = 0;
        r0.mo21b(r2, r3);	 Catch:{ all -> 0x0025 }
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
        goto L_0x000c;
    L_0x0025:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0025 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dxj.d():void");
    }

    /* renamed from: a */
    public final void mo13087a(boolean z) {
        if (this.f16943l.mo46a(aba.AUTO_WHITE_BALANCE_LOCK)) {
            this.f16938f.f156v = z ^ 1;
        }
        if (this.f16943l.mo46a(aba.AUTO_EXPOSURE_LOCK)) {
            this.f16938f.f155u = z ^ 1;
        }
        try {
            this.f16934b.mo18a(this.f16938f);
        } catch (RuntimeException e) {
            bli.m891b(f16931a, e.toString());
        }
    }
}
