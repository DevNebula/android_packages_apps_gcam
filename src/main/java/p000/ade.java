package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* renamed from: ade */
public class ade implements ada {
    /* renamed from: a */
    private static final String f10123a = ade.class.getSimpleName();
    /* renamed from: b */
    private int[] f10124b;
    /* renamed from: c */
    private final int[] f10125c;
    /* renamed from: d */
    private final adk f10126d;
    /* renamed from: e */
    private ByteBuffer f10127e;
    /* renamed from: f */
    private byte[] f10128f;
    /* renamed from: g */
    private short[] f10129g;
    /* renamed from: h */
    private byte[] f10130h;
    /* renamed from: i */
    private byte[] f10131i;
    /* renamed from: j */
    private byte[] f10132j;
    /* renamed from: k */
    private int[] f10133k;
    /* renamed from: l */
    private int f10134l;
    /* renamed from: m */
    private adc f10135m;
    /* renamed from: n */
    private Bitmap f10136n;
    /* renamed from: o */
    private boolean f10137o;
    /* renamed from: p */
    private int f10138p;
    /* renamed from: q */
    private int f10139q;
    /* renamed from: r */
    private int f10140r;
    /* renamed from: s */
    private int f10141s;
    /* renamed from: t */
    private Boolean f10142t;
    /* renamed from: u */
    private Config f10143u;

    private ade(adk adk) {
        this.f10125c = new int[256];
        this.f10143u = Config.ARGB_8888;
        this.f10126d = adk;
        this.f10135m = new adc();
    }

    public ade(adk adk, adc adc, ByteBuffer byteBuffer, int i) {
        this(adk);
        m6351a(adc, byteBuffer, i);
    }

    /* renamed from: a */
    public final void mo154a() {
        this.f10134l = (this.f10134l + 1) % this.f10135m.f304c;
    }

    /* renamed from: b */
    public final void mo156b() {
        this.f10135m = null;
        byte[] bArr = this.f10132j;
        if (bArr != null) {
            this.f10126d.mo170a(bArr);
        }
        Object obj = this.f10133k;
        if (obj != null) {
            agu agu = this.f10126d.f333b;
            if (agu != null) {
                agu.mo276a(obj);
            }
        }
        Bitmap bitmap = this.f10136n;
        if (bitmap != null) {
            this.f10126d.mo169a(bitmap);
        }
        this.f10136n = null;
        this.f10127e = null;
        this.f10142t = null;
        bArr = this.f10128f;
        if (bArr != null) {
            this.f10126d.mo170a(bArr);
        }
    }

    /* renamed from: c */
    public final int mo157c() {
        return (this.f10127e.limit() + this.f10132j.length) + (this.f10133k.length << 2);
    }

    /* renamed from: d */
    public final int mo158d() {
        return this.f10134l;
    }

    /* renamed from: e */
    public final ByteBuffer mo159e() {
        return this.f10127e;
    }

    /* renamed from: f */
    public final int mo160f() {
        return this.f10135m.f304c;
    }

    /* renamed from: i */
    private final Bitmap m6352i() {
        Config config;
        Boolean bool = this.f10142t;
        if (bool == null || bool.booleanValue()) {
            config = Config.ARGB_8888;
        } else {
            config = this.f10143u;
        }
        adk adk = this.f10126d;
        Bitmap b = adk.f332a.mo285b(this.f10141s, this.f10140r, config);
        b.setHasAlpha(true);
        return b;
    }

    /* renamed from: g */
    public final int mo161g() {
        adc adc = this.f10135m;
        int i = adc.f304c;
        if (i > 0) {
            int i2 = this.f10134l;
            if (i2 >= 0) {
                if (i2 < 0 || i2 >= i) {
                    return -1;
                }
                return ((adb) adc.f306e.get(i2)).f299i;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04d3  */
    /* renamed from: h */
    public final synchronized android.graphics.Bitmap mo162h() {
        /*
        r34 = this;
        monitor-enter(r34);
        r0 = r34;
        r2 = r0.f10135m;	 Catch:{ all -> 0x0355 }
        r2 = r2.f304c;	 Catch:{ all -> 0x0355 }
        if (r2 <= 0) goto L_0x000f;
    L_0x0009:
        r0 = r34;
        r2 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        if (r2 >= 0) goto L_0x0047;
    L_0x000f:
        r2 = f10123a;	 Catch:{ all -> 0x0355 }
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x0042;
    L_0x0018:
        r2 = f10123a;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r3 = r0.f10135m;	 Catch:{ all -> 0x0355 }
        r3 = r3.f304c;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r4 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0355 }
        r6 = 72;
        r5.<init>(r6);	 Catch:{ all -> 0x0355 }
        r6 = "Unable to decode frame, frameCount=";
        r5.append(r6);	 Catch:{ all -> 0x0355 }
        r5.append(r3);	 Catch:{ all -> 0x0355 }
        r3 = ", framePointer=";
        r5.append(r3);	 Catch:{ all -> 0x0355 }
        r5.append(r4);	 Catch:{ all -> 0x0355 }
        r3 = r5.toString();	 Catch:{ all -> 0x0355 }
        android.util.Log.d(r2, r3);	 Catch:{ all -> 0x0355 }
    L_0x0042:
        r2 = 1;
        r0 = r34;
        r0.f10138p = r2;	 Catch:{ all -> 0x0355 }
    L_0x0047:
        r0 = r34;
        r2 = r0.f10138p;	 Catch:{ all -> 0x0355 }
        r3 = 1;
        if (r2 != r3) goto L_0x0076;
    L_0x004e:
        r2 = f10123a;	 Catch:{ all -> 0x0355 }
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x0073;
    L_0x0057:
        r2 = f10123a;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r3 = r0.f10138p;	 Catch:{ all -> 0x0355 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0355 }
        r5 = 42;
        r4.<init>(r5);	 Catch:{ all -> 0x0355 }
        r5 = "Unable to decode frame, status=";
        r4.append(r5);	 Catch:{ all -> 0x0355 }
        r4.append(r3);	 Catch:{ all -> 0x0355 }
        r3 = r4.toString();	 Catch:{ all -> 0x0355 }
        android.util.Log.d(r2, r3);	 Catch:{ all -> 0x0355 }
    L_0x0073:
        r2 = 0;
    L_0x0074:
        monitor-exit(r34);
        return r2;
    L_0x0076:
        r3 = 2;
        if (r2 == r3) goto L_0x004e;
    L_0x0079:
        r2 = 0;
        r0 = r34;
        r0.f10138p = r2;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r2 = r0.f10128f;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0092;
    L_0x0084:
        r0 = r34;
        r2 = r0.f10126d;	 Catch:{ all -> 0x0355 }
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2 = r2.mo171a(r3);	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10128f = r2;	 Catch:{ all -> 0x0355 }
    L_0x0092:
        r0 = r34;
        r2 = r0.f10135m;	 Catch:{ all -> 0x0355 }
        r2 = r2.f306e;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r3 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0355 }
        r0 = r2;
        r0 = (p000.adb) r0;	 Catch:{ all -> 0x0355 }
        r10 = r0;
        r0 = r34;
        r2 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        r2 = r2 + -1;
        if (r2 < 0) goto L_0x060f;
    L_0x00ac:
        r0 = r34;
        r3 = r0.f10135m;	 Catch:{ all -> 0x0355 }
        r3 = r3.f306e;	 Catch:{ all -> 0x0355 }
        r2 = r3.get(r2);	 Catch:{ all -> 0x0355 }
        r2 = (p000.adb) r2;	 Catch:{ all -> 0x0355 }
        r4 = r2;
    L_0x00b9:
        r2 = r10.f301k;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x00c3;
    L_0x00bd:
        r0 = r34;
        r2 = r0.f10135m;	 Catch:{ all -> 0x0355 }
        r2 = r2.f302a;	 Catch:{ all -> 0x0355 }
    L_0x00c3:
        r0 = r34;
        r0.f10124b = r2;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r2 = r0.f10124b;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x00fa;
    L_0x00cd:
        r2 = f10123a;	 Catch:{ all -> 0x0355 }
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x00f2;
    L_0x00d6:
        r2 = f10123a;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r3 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0355 }
        r5 = 49;
        r4.<init>(r5);	 Catch:{ all -> 0x0355 }
        r5 = "No valid color table found for frame #";
        r4.append(r5);	 Catch:{ all -> 0x0355 }
        r4.append(r3);	 Catch:{ all -> 0x0355 }
        r3 = r4.toString();	 Catch:{ all -> 0x0355 }
        android.util.Log.d(r2, r3);	 Catch:{ all -> 0x0355 }
    L_0x00f2:
        r2 = 1;
        r0 = r34;
        r0.f10138p = r2;	 Catch:{ all -> 0x0355 }
        r2 = 0;
        goto L_0x0074;
    L_0x00fa:
        r3 = r10.f296f;	 Catch:{ all -> 0x0355 }
        if (r3 == 0) goto L_0x0119;
    L_0x00fe:
        r3 = 0;
        r0 = r34;
        r5 = r0.f10125c;	 Catch:{ all -> 0x0355 }
        r6 = 0;
        r7 = r2.length;	 Catch:{ all -> 0x0355 }
        java.lang.System.arraycopy(r2, r3, r5, r6, r7);	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r2 = r0.f10125c;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10124b = r2;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r2 = r0.f10124b;	 Catch:{ all -> 0x0355 }
        r3 = r10.f298h;	 Catch:{ all -> 0x0355 }
        r5 = 0;
        r2[r3] = r5;	 Catch:{ all -> 0x0355 }
    L_0x0119:
        r0 = r34;
        r3 = r0.f10133k;	 Catch:{ all -> 0x0355 }
        if (r4 != 0) goto L_0x0135;
    L_0x011f:
        r0 = r34;
        r2 = r0.f10136n;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x012c;
    L_0x0125:
        r0 = r34;
        r5 = r0.f10126d;	 Catch:{ all -> 0x0355 }
        r5.mo169a(r2);	 Catch:{ all -> 0x0355 }
    L_0x012c:
        r2 = 0;
        r0 = r34;
        r0.f10136n = r2;	 Catch:{ all -> 0x0355 }
        r2 = 0;
        java.util.Arrays.fill(r3, r2);	 Catch:{ all -> 0x0355 }
    L_0x0135:
        if (r4 == 0) goto L_0x0146;
    L_0x0137:
        r2 = r4.f297g;	 Catch:{ all -> 0x0355 }
        r5 = 3;
        if (r2 != r5) goto L_0x0146;
    L_0x013c:
        r0 = r34;
        r2 = r0.f10136n;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0146;
    L_0x0142:
        r2 = 0;
        java.util.Arrays.fill(r3, r2);	 Catch:{ all -> 0x0355 }
    L_0x0146:
        if (r4 == 0) goto L_0x01bc;
    L_0x0148:
        r2 = r4.f297g;	 Catch:{ all -> 0x0355 }
        if (r2 <= 0) goto L_0x01bc;
    L_0x014c:
        r5 = 2;
        if (r2 != r5) goto L_0x01a4;
    L_0x014f:
        r2 = r10.f296f;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0191;
    L_0x0153:
        r0 = r34;
        r5 = r0.f10135m;	 Catch:{ all -> 0x0355 }
        r2 = r5.f312k;	 Catch:{ all -> 0x0355 }
        r6 = r10.f301k;	 Catch:{ all -> 0x0355 }
        if (r6 == 0) goto L_0x0164;
    L_0x015d:
        r5 = r5.f311j;	 Catch:{ all -> 0x0355 }
        r6 = r10.f298h;	 Catch:{ all -> 0x0355 }
        if (r5 != r6) goto L_0x0164;
    L_0x0163:
        r2 = 0;
    L_0x0164:
        r5 = r4.f294d;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r6 = r0.f10139q;	 Catch:{ all -> 0x0355 }
        r7 = r5 / r6;
        r5 = r4.f292b;	 Catch:{ all -> 0x0355 }
        r5 = r5 / r6;
        r8 = r4.f293c;	 Catch:{ all -> 0x0355 }
        r8 = r8 / r6;
        r4 = r4.f291a;	 Catch:{ all -> 0x0355 }
        r4 = r4 / r6;
        r0 = r34;
        r6 = r0.f10141s;	 Catch:{ all -> 0x0355 }
        r5 = r5 * r6;
        r5 = r5 + r4;
        r4 = r7 * r6;
        r6 = r5 + r4;
    L_0x017f:
        if (r5 >= r6) goto L_0x01bc;
    L_0x0181:
        r7 = r5 + r8;
        r4 = r5;
    L_0x0184:
        if (r4 >= r7) goto L_0x018b;
    L_0x0186:
        r3[r4] = r2;	 Catch:{ all -> 0x0355 }
        r4 = r4 + 1;
        goto L_0x0184;
    L_0x018b:
        r0 = r34;
        r4 = r0.f10141s;	 Catch:{ all -> 0x0355 }
        r5 = r5 + r4;
        goto L_0x017f;
    L_0x0191:
        r0 = r34;
        r2 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x0199;
    L_0x0197:
        r2 = 0;
        goto L_0x0164;
    L_0x0199:
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10142t = r2;	 Catch:{ all -> 0x0355 }
        r2 = 0;
        goto L_0x0164;
    L_0x01a4:
        r4 = 3;
        if (r2 != r4) goto L_0x01bc;
    L_0x01a7:
        r0 = r34;
        r2 = r0.f10136n;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x01bc;
    L_0x01ad:
        r0 = r34;
        r5 = r0.f10141s;	 Catch:{ all -> 0x0355 }
        r4 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r34;
        r9 = r0.f10140r;	 Catch:{ all -> 0x0355 }
        r8 = r5;
        r2.getPixels(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0355 }
    L_0x01bc:
        if (r10 == 0) goto L_0x01c7;
    L_0x01be:
        r0 = r34;
        r2 = r0.f10127e;	 Catch:{ all -> 0x0355 }
        r4 = r10.f300j;	 Catch:{ all -> 0x0355 }
        r2.position(r4);	 Catch:{ all -> 0x0355 }
    L_0x01c7:
        if (r10 != 0) goto L_0x0606;
    L_0x01c9:
        r0 = r34;
        r2 = r0.f10135m;	 Catch:{ all -> 0x0355 }
        r4 = r2.f307f;	 Catch:{ all -> 0x0355 }
        r2 = r2.f308g;	 Catch:{ all -> 0x0355 }
        r2 = r2 * r4;
        r18 = r2;
    L_0x01d4:
        r0 = r34;
        r2 = r0.f10132j;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x01df;
    L_0x01da:
        r2 = r2.length;	 Catch:{ all -> 0x0355 }
        r0 = r18;
        if (r2 >= r0) goto L_0x01ed;
    L_0x01df:
        r0 = r34;
        r2 = r0.f10126d;	 Catch:{ all -> 0x0355 }
        r0 = r18;
        r2 = r2.mo171a(r0);	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10132j = r2;	 Catch:{ all -> 0x0355 }
    L_0x01ed:
        r0 = r34;
        r0 = r0.f10132j;	 Catch:{ all -> 0x0355 }
        r19 = r0;
        r0 = r34;
        r2 = r0.f10129g;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0201;
    L_0x01f9:
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r2 = new short[r2];	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10129g = r2;	 Catch:{ all -> 0x0355 }
    L_0x0201:
        r0 = r34;
        r0 = r0.f10129g;	 Catch:{ all -> 0x0355 }
        r20 = r0;
        r0 = r34;
        r2 = r0.f10130h;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0215;
    L_0x020d:
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r2 = new byte[r2];	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10130h = r2;	 Catch:{ all -> 0x0355 }
    L_0x0215:
        r0 = r34;
        r0 = r0.f10130h;	 Catch:{ all -> 0x0355 }
        r21 = r0;
        r0 = r34;
        r2 = r0.f10131i;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0229;
    L_0x0221:
        r2 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        r2 = new byte[r2];	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10131i = r2;	 Catch:{ all -> 0x0355 }
    L_0x0229:
        r0 = r34;
        r0 = r0.f10131i;	 Catch:{ all -> 0x0355 }
        r22 = r0;
        r23 = r34.m6353j();	 Catch:{ all -> 0x0355 }
        r2 = 1;
        r24 = r2 << r23;
        r25 = r24 + 1;
        r13 = r24 + 2;
        r5 = r23 + 1;
        r2 = 1;
        r26 = r2 << r5;
        r11 = r26 + -1;
        r2 = 0;
    L_0x0242:
        r0 = r24;
        if (r2 >= r0) goto L_0x024f;
    L_0x0246:
        r4 = 0;
        r20[r2] = r4;	 Catch:{ all -> 0x0355 }
        r4 = (byte) r2;	 Catch:{ all -> 0x0355 }
        r21[r2] = r4;	 Catch:{ all -> 0x0355 }
        r2 = r2 + 1;
        goto L_0x0242;
    L_0x024f:
        r0 = r34;
        r0 = r0.f10128f;	 Catch:{ all -> 0x0355 }
        r27 = r0;
        r9 = -1;
        r15 = 0;
        r4 = 0;
        r14 = 0;
        r12 = 0;
        r6 = 0;
        r7 = 0;
        r2 = 0;
        r8 = 0;
        r16 = r12;
        r17 = r15;
        r12 = r11;
        r11 = r6;
        r6 = r8;
        r8 = r14;
    L_0x0266:
        r0 = r18;
        if (r8 >= r0) goto L_0x0291;
    L_0x026a:
        if (r4 != 0) goto L_0x0602;
    L_0x026c:
        r4 = r34.m6353j();	 Catch:{ all -> 0x0355 }
        if (r4 <= 0) goto L_0x028a;
    L_0x0272:
        r0 = r34;
        r2 = r0.f10127e;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r14 = r0.f10128f;	 Catch:{ all -> 0x0355 }
        r15 = 0;
        r28 = r2.remaining();	 Catch:{ all -> 0x0355 }
        r0 = r28;
        r28 = java.lang.Math.min(r4, r0);	 Catch:{ all -> 0x0355 }
        r0 = r28;
        r2.get(r14, r15, r0);	 Catch:{ all -> 0x0355 }
    L_0x028a:
        if (r4 > 0) goto L_0x054c;
    L_0x028c:
        r2 = 3;
        r0 = r34;
        r0.f10138p = r2;	 Catch:{ all -> 0x0355 }
    L_0x0291:
        r2 = 0;
        r0 = r19;
        r1 = r18;
        java.util.Arrays.fill(r0, r6, r1, r2);	 Catch:{ all -> 0x0355 }
        r2 = r10.f295e;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0363;
    L_0x029d:
        r0 = r34;
        r2 = r0.f10139q;	 Catch:{ all -> 0x0355 }
        r4 = 1;
        if (r2 != r4) goto L_0x0363;
    L_0x02a4:
        r0 = r34;
        r9 = r0.f10133k;	 Catch:{ all -> 0x0355 }
        r11 = r10.f294d;	 Catch:{ all -> 0x0355 }
        r12 = r10.f292b;	 Catch:{ all -> 0x0355 }
        r13 = r10.f293c;	 Catch:{ all -> 0x0355 }
        r14 = r10.f291a;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r15 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0 = r0.f10141s;	 Catch:{ all -> 0x0355 }
        r16 = r0;
        r0 = r34;
        r0 = r0.f10132j;	 Catch:{ all -> 0x0355 }
        r17 = r0;
        r0 = r34;
        r0 = r0.f10124b;	 Catch:{ all -> 0x0355 }
        r18 = r0;
        r5 = -1;
        r2 = 0;
        r8 = r2;
    L_0x02c9:
        if (r8 >= r11) goto L_0x0303;
    L_0x02cb:
        r2 = r8 + r12;
        r6 = r2 * r16;
        r4 = r6 + r14;
        r2 = r4 + r13;
        r6 = r6 + r16;
        if (r6 < r2) goto L_0x0301;
    L_0x02d7:
        r7 = r2;
    L_0x02d8:
        r2 = r10.f293c;	 Catch:{ all -> 0x0355 }
        r2 = r2 * r8;
        r6 = r4;
        r33 = r2;
        r2 = r5;
        r5 = r33;
    L_0x02e1:
        if (r6 >= r7) goto L_0x02fc;
    L_0x02e3:
        r4 = r17[r5];	 Catch:{ all -> 0x0355 }
        r0 = r4 & 255;
        r19 = r0;
        r0 = r19;
        if (r0 == r2) goto L_0x02f3;
    L_0x02ed:
        r19 = r18[r19];	 Catch:{ all -> 0x0355 }
        if (r19 == 0) goto L_0x02fa;
    L_0x02f1:
        r9[r6] = r19;	 Catch:{ all -> 0x0355 }
    L_0x02f3:
        r4 = r5 + 1;
        r5 = r6 + 1;
        r6 = r5;
        r5 = r4;
        goto L_0x02e1;
    L_0x02fa:
        r2 = r4;
        goto L_0x02f3;
    L_0x02fc:
        r4 = r8 + 1;
        r8 = r4;
        r5 = r2;
        goto L_0x02c9;
    L_0x0301:
        r7 = r6;
        goto L_0x02d8;
    L_0x0303:
        r0 = r34;
        r2 = r0.f10142t;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x0358;
    L_0x0309:
        r2 = 0;
    L_0x030a:
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10142t = r2;	 Catch:{ all -> 0x0355 }
    L_0x0312:
        r0 = r34;
        r2 = r0.f10137o;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x0340;
    L_0x0318:
        r2 = r10.f297g;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x031f;
    L_0x031c:
        r4 = 1;
        if (r2 != r4) goto L_0x0340;
    L_0x031f:
        r0 = r34;
        r2 = r0.f10136n;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x032d;
    L_0x0325:
        r2 = r34.m6352i();	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10136n = r2;	 Catch:{ all -> 0x0355 }
    L_0x032d:
        r0 = r34;
        r2 = r0.f10136n;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r5 = r0.f10141s;	 Catch:{ all -> 0x0355 }
        r4 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r34;
        r9 = r0.f10140r;	 Catch:{ all -> 0x0355 }
        r8 = r5;
        r2.setPixels(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0355 }
    L_0x0340:
        r2 = r34.m6352i();	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r5 = r0.f10141s;	 Catch:{ all -> 0x0355 }
        r4 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r34;
        r9 = r0.f10140r;	 Catch:{ all -> 0x0355 }
        r8 = r5;
        r2.setPixels(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0355 }
        goto L_0x0074;
    L_0x0355:
        r2 = move-exception;
        monitor-exit(r34);
        throw r2;
    L_0x0358:
        if (r15 == 0) goto L_0x035c;
    L_0x035a:
        r2 = 0;
        goto L_0x030a;
    L_0x035c:
        r2 = -1;
        if (r5 == r2) goto L_0x0361;
    L_0x035f:
        r2 = 1;
        goto L_0x030a;
    L_0x0361:
        r2 = 0;
        goto L_0x030a;
    L_0x0363:
        r0 = r34;
        r0 = r0.f10133k;	 Catch:{ all -> 0x0355 }
        r20 = r0;
        r2 = r10.f294d;	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0 = r0.f10139q;	 Catch:{ all -> 0x0355 }
        r21 = r0;
        r22 = r2 / r21;
        r2 = r10.f292b;	 Catch:{ all -> 0x0355 }
        r23 = r2 / r21;
        r2 = r10.f293c;	 Catch:{ all -> 0x0355 }
        r24 = r2 / r21;
        r2 = r10.f291a;	 Catch:{ all -> 0x0355 }
        r25 = r2 / r21;
        r0 = r34;
        r2 = r0.f10134l;	 Catch:{ all -> 0x0355 }
        if (r2 == 0) goto L_0x0547;
    L_0x0385:
        r2 = 0;
        r19 = r2;
    L_0x0388:
        r0 = r34;
        r0 = r0.f10141s;	 Catch:{ all -> 0x0355 }
        r26 = r0;
        r0 = r34;
        r0 = r0.f10140r;	 Catch:{ all -> 0x0355 }
        r27 = r0;
        r0 = r34;
        r0 = r0.f10132j;	 Catch:{ all -> 0x0355 }
        r28 = r0;
        r0 = r34;
        r0 = r0.f10124b;	 Catch:{ all -> 0x0355 }
        r29 = r0;
        r0 = r34;
        r8 = r0.f10142t;	 Catch:{ all -> 0x0355 }
        r4 = 1;
        r5 = 8;
        r2 = 0;
        r9 = 0;
    L_0x03a9:
        r0 = r22;
        if (r9 >= r0) goto L_0x052f;
    L_0x03ad:
        r6 = r10.f295e;	 Catch:{ all -> 0x0355 }
        if (r6 == 0) goto L_0x0529;
    L_0x03b1:
        r0 = r22;
        if (r2 < r0) goto L_0x0521;
    L_0x03b5:
        r4 = r4 + 1;
        switch(r4) {
            case 2: goto L_0x0515;
            case 3: goto L_0x050c;
            case 4: goto L_0x0518;
            default: goto L_0x03ba;
        };	 Catch:{ all -> 0x0355 }
    L_0x03ba:
        r33 = r4;
        r4 = r5;
        r5 = r2;
        r2 = r33;
    L_0x03c0:
        r6 = r5 + r4;
        r11 = r6;
        r12 = r4;
        r13 = r2;
    L_0x03c5:
        r2 = r5 + r23;
        r0 = r27;
        if (r2 >= r0) goto L_0x04e4;
    L_0x03cb:
        r5 = r2 * r26;
        r4 = r5 + r25;
        r2 = r4 + r24;
        r5 = r5 + r26;
        if (r5 < r2) goto L_0x0509;
    L_0x03d5:
        r14 = r2;
    L_0x03d6:
        r2 = r9 * r21;
        r5 = r10.f293c;	 Catch:{ all -> 0x0355 }
        r2 = r2 * r5;
        r5 = 1;
        r0 = r21;
        if (r0 == r5) goto L_0x04eb;
    L_0x03e0:
        r5 = r14 - r4;
        r5 = r5 * r21;
        r30 = r2 + r5;
        r15 = r2;
        r16 = r4;
    L_0x03e9:
        r0 = r16;
        if (r0 >= r14) goto L_0x04e4;
    L_0x03ed:
        r0 = r10.f293c;	 Catch:{ all -> 0x0355 }
        r18 = r0;
        r7 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r2 = 0;
        r17 = r15;
    L_0x03f8:
        r0 = r34;
        r0 = r0.f10139q;	 Catch:{ all -> 0x0355 }
        r31 = r0;
        r31 = r31 + r15;
        r0 = r17;
        r1 = r31;
        if (r0 >= r1) goto L_0x0454;
    L_0x0406:
        r0 = r34;
        r0 = r0.f10132j;	 Catch:{ all -> 0x0355 }
        r31 = r0;
        r0 = r31;
        r0 = r0.length;	 Catch:{ all -> 0x0355 }
        r32 = r0;
        r0 = r17;
        r1 = r32;
        if (r0 >= r1) goto L_0x0454;
    L_0x0417:
        r0 = r17;
        r1 = r30;
        if (r0 >= r1) goto L_0x0454;
    L_0x041d:
        r31 = r31[r17];	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0 = r0.f10124b;	 Catch:{ all -> 0x0355 }
        r32 = r0;
        r0 = r31;
        r0 = r0 & 255;
        r31 = r0;
        r31 = r32[r31];	 Catch:{ all -> 0x0355 }
        if (r31 == 0) goto L_0x0451;
    L_0x042f:
        r32 = r31 >>> 24;
        r7 = r7 + r32;
        r32 = r31 >> 16;
        r0 = r32;
        r0 = r0 & 255;
        r32 = r0;
        r6 = r6 + r32;
        r32 = r31 >> 8;
        r0 = r32;
        r0 = r0 & 255;
        r32 = r0;
        r5 = r5 + r32;
        r0 = r31;
        r0 = r0 & 255;
        r31 = r0;
        r4 = r4 + r31;
        r2 = r2 + 1;
    L_0x0451:
        r17 = r17 + 1;
        goto L_0x03f8;
    L_0x0454:
        r18 = r18 + r15;
        r17 = r18;
    L_0x0458:
        r0 = r34;
        r0 = r0.f10139q;	 Catch:{ all -> 0x0355 }
        r31 = r0;
        r31 = r31 + r18;
        r0 = r17;
        r1 = r31;
        if (r0 >= r1) goto L_0x04b4;
    L_0x0466:
        r0 = r34;
        r0 = r0.f10132j;	 Catch:{ all -> 0x0355 }
        r31 = r0;
        r0 = r31;
        r0 = r0.length;	 Catch:{ all -> 0x0355 }
        r32 = r0;
        r0 = r17;
        r1 = r32;
        if (r0 >= r1) goto L_0x04b4;
    L_0x0477:
        r0 = r17;
        r1 = r30;
        if (r0 >= r1) goto L_0x04b4;
    L_0x047d:
        r31 = r31[r17];	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0 = r0.f10124b;	 Catch:{ all -> 0x0355 }
        r32 = r0;
        r0 = r31;
        r0 = r0 & 255;
        r31 = r0;
        r31 = r32[r31];	 Catch:{ all -> 0x0355 }
        if (r31 == 0) goto L_0x04b1;
    L_0x048f:
        r32 = r31 >>> 24;
        r7 = r7 + r32;
        r32 = r31 >> 16;
        r0 = r32;
        r0 = r0 & 255;
        r32 = r0;
        r6 = r6 + r32;
        r32 = r31 >> 8;
        r0 = r32;
        r0 = r0 & 255;
        r32 = r0;
        r5 = r5 + r32;
        r0 = r31;
        r0 = r0 & 255;
        r31 = r0;
        r4 = r4 + r31;
        r2 = r2 + 1;
    L_0x04b1:
        r17 = r17 + 1;
        goto L_0x0458;
    L_0x04b4:
        if (r2 == 0) goto L_0x04e1;
    L_0x04b6:
        r7 = r7 / r2;
        r7 = r7 << 24;
        r6 = r6 / r2;
        r6 = r6 << 16;
        r6 = r6 | r7;
        r5 = r5 / r2;
        r5 = r5 << 8;
        r5 = r5 | r6;
        r2 = r4 / r2;
        r2 = r2 | r5;
    L_0x04c4:
        if (r2 == 0) goto L_0x04d3;
    L_0x04c6:
        r20[r16] = r2;	 Catch:{ all -> 0x0355 }
        r2 = r8;
    L_0x04c9:
        r4 = r15 + r21;
        r5 = r16 + 1;
        r15 = r4;
        r8 = r2;
        r16 = r5;
        goto L_0x03e9;
    L_0x04d3:
        if (r19 == 0) goto L_0x04df;
    L_0x04d5:
        if (r8 != 0) goto L_0x04dd;
    L_0x04d7:
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0355 }
        goto L_0x04c9;
    L_0x04dd:
        r2 = r8;
        goto L_0x04c9;
    L_0x04df:
        r2 = r8;
        goto L_0x04c9;
    L_0x04e1:
        r2 = 0;
        goto L_0x04c4;
    L_0x04e3:
        r8 = r2;
    L_0x04e4:
        r9 = r9 + 1;
        r2 = r11;
        r5 = r12;
        r4 = r13;
        goto L_0x03a9;
    L_0x04eb:
        r5 = r4;
        r4 = r2;
        r2 = r8;
    L_0x04ee:
        if (r5 >= r14) goto L_0x04e3;
    L_0x04f0:
        r6 = r28[r4];	 Catch:{ all -> 0x0355 }
        r6 = r6 & 255;
        r6 = r29[r6];	 Catch:{ all -> 0x0355 }
        if (r6 == 0) goto L_0x04ff;
    L_0x04f8:
        r20[r5] = r6;	 Catch:{ all -> 0x0355 }
    L_0x04fa:
        r4 = r4 + r21;
        r5 = r5 + 1;
        goto L_0x04ee;
    L_0x04ff:
        if (r19 == 0) goto L_0x04fa;
    L_0x0501:
        if (r2 != 0) goto L_0x04fa;
    L_0x0503:
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0355 }
        goto L_0x04fa;
    L_0x0509:
        r14 = r5;
        goto L_0x03d6;
    L_0x050c:
        r5 = 2;
        r2 = 4;
        r33 = r4;
        r4 = r2;
        r2 = r33;
        goto L_0x03c0;
    L_0x0515:
        r2 = 4;
        goto L_0x03ba;
    L_0x0518:
        r5 = 1;
        r2 = 2;
        r33 = r4;
        r4 = r2;
        r2 = r33;
        goto L_0x03c0;
    L_0x0521:
        r33 = r4;
        r4 = r5;
        r5 = r2;
        r2 = r33;
        goto L_0x03c0;
    L_0x0529:
        r11 = r2;
        r12 = r5;
        r13 = r4;
        r5 = r9;
        goto L_0x03c5;
    L_0x052f:
        r0 = r34;
        r2 = r0.f10142t;	 Catch:{ all -> 0x0355 }
        if (r2 != 0) goto L_0x0312;
    L_0x0535:
        if (r8 != 0) goto L_0x0542;
    L_0x0537:
        r2 = 0;
    L_0x0538:
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x0355 }
        r0 = r34;
        r0.f10142t = r2;	 Catch:{ all -> 0x0355 }
        goto L_0x0312;
    L_0x0542:
        r2 = r8.booleanValue();	 Catch:{ all -> 0x0355 }
        goto L_0x0538;
    L_0x0547:
        r2 = 1;
        r19 = r2;
        goto L_0x0388;
    L_0x054c:
        r2 = 0;
        r14 = r2;
        r15 = r4;
    L_0x054f:
        r2 = r27[r14];	 Catch:{ all -> 0x0355 }
        r2 = r2 & 255;
        r2 = r2 << r17;
        r2 = r2 + r16;
        r4 = r17 + 8;
        r16 = r14 + 1;
        r17 = r15 + -1;
        r14 = r8;
        r15 = r4;
        r8 = r6;
        r4 = r13;
        r6 = r11;
        r33 = r5;
        r5 = r12;
        r12 = r2;
        r2 = r33;
    L_0x0568:
        if (r15 >= r2) goto L_0x057c;
    L_0x056a:
        r11 = r6;
        r13 = r4;
        r6 = r8;
        r4 = r17;
        r8 = r14;
        r17 = r15;
        r33 = r12;
        r12 = r5;
        r5 = r2;
        r2 = r16;
        r16 = r33;
        goto L_0x0266;
    L_0x057c:
        r11 = r12 & r5;
        r13 = r12 >> r2;
        r15 = r15 - r2;
        r0 = r24;
        if (r11 != r0) goto L_0x058f;
    L_0x0585:
        r2 = r23 + 1;
        r5 = r26 + -1;
        r4 = r24 + 2;
        r11 = -1;
        r12 = r13;
        r9 = r11;
        goto L_0x0568;
    L_0x058f:
        r0 = r25;
        if (r11 == r0) goto L_0x05f2;
    L_0x0593:
        r12 = -1;
        if (r9 != r12) goto L_0x05a4;
    L_0x0596:
        r6 = r21[r11];	 Catch:{ all -> 0x0355 }
        r19[r8] = r6;	 Catch:{ all -> 0x0355 }
        r6 = r8 + 1;
        r8 = r14 + 1;
        r12 = r13;
        r14 = r8;
        r9 = r11;
        r8 = r6;
        r6 = r11;
        goto L_0x0568;
    L_0x05a4:
        if (r11 < r4) goto L_0x05f0;
    L_0x05a6:
        r6 = (byte) r6;	 Catch:{ all -> 0x0355 }
        r22[r7] = r6;	 Catch:{ all -> 0x0355 }
        r7 = r7 + 1;
        r6 = r9;
    L_0x05ac:
        r0 = r24;
        if (r6 < r0) goto L_0x05b9;
    L_0x05b0:
        r12 = r21[r6];	 Catch:{ all -> 0x0355 }
        r22[r7] = r12;	 Catch:{ all -> 0x0355 }
        r7 = r7 + 1;
        r6 = r20[r6];	 Catch:{ all -> 0x0355 }
        goto L_0x05ac;
    L_0x05b9:
        r6 = r21[r6];	 Catch:{ all -> 0x0355 }
        r12 = r6 & 255;
        r0 = (byte) r12;	 Catch:{ all -> 0x0355 }
        r28 = r0;
        r19[r8] = r28;	 Catch:{ all -> 0x0355 }
        r6 = r8 + 1;
        r8 = r14 + 1;
    L_0x05c6:
        if (r7 <= 0) goto L_0x05d3;
    L_0x05c8:
        r7 = r7 + -1;
        r14 = r22[r7];	 Catch:{ all -> 0x0355 }
        r19[r6] = r14;	 Catch:{ all -> 0x0355 }
        r6 = r6 + 1;
        r8 = r8 + 1;
        goto L_0x05c6;
    L_0x05d3:
        r14 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r4 >= r14) goto L_0x05e9;
    L_0x05d7:
        r9 = (short) r9;	 Catch:{ all -> 0x0355 }
        r20[r4] = r9;	 Catch:{ all -> 0x0355 }
        r21[r4] = r28;	 Catch:{ all -> 0x0355 }
        r4 = r4 + 1;
        r9 = r4 & r5;
        if (r9 != 0) goto L_0x05e9;
    L_0x05e2:
        r9 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r4 >= r9) goto L_0x05e9;
    L_0x05e6:
        r2 = r2 + 1;
        r5 = r5 + r4;
    L_0x05e9:
        r14 = r8;
        r9 = r11;
        r8 = r6;
        r6 = r12;
        r12 = r13;
        goto L_0x0568;
    L_0x05f0:
        r6 = r11;
        goto L_0x05ac;
    L_0x05f2:
        r11 = r6;
        r12 = r5;
        r6 = r8;
        r5 = r2;
        r8 = r14;
        r2 = r16;
        r16 = r13;
        r13 = r4;
        r4 = r17;
        r17 = r15;
        goto L_0x0266;
    L_0x0602:
        r14 = r2;
        r15 = r4;
        goto L_0x054f;
    L_0x0606:
        r2 = r10.f293c;	 Catch:{ all -> 0x0355 }
        r4 = r10.f294d;	 Catch:{ all -> 0x0355 }
        r2 = r2 * r4;
        r18 = r2;
        goto L_0x01d4;
    L_0x060f:
        r2 = 0;
        r4 = r2;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: ade.h():android.graphics.Bitmap");
    }

    /* renamed from: j */
    private final int m6353j() {
        return this.f10127e.get() & Illuminant.kOther;
    }

    /* renamed from: a */
    private final synchronized void m6351a(adc adc, ByteBuffer byteBuffer, int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Sample size must be >=0, not: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int[] iArr;
        int highestOneBit = Integer.highestOneBit(i);
        this.f10138p = 0;
        this.f10135m = adc;
        this.f10134l = -1;
        this.f10127e = byteBuffer.asReadOnlyBuffer();
        this.f10127e.position(0);
        this.f10127e.order(ByteOrder.LITTLE_ENDIAN);
        this.f10137o = false;
        for (adb adb : adc.f306e) {
            if (adb.f297g == 3) {
                this.f10137o = true;
                break;
            }
        }
        this.f10139q = highestOneBit;
        int i2 = adc.f307f;
        this.f10141s = i2 / highestOneBit;
        int i3 = adc.f308g;
        this.f10140r = i3 / highestOneBit;
        this.f10132j = this.f10126d.mo171a(i2 * i3);
        highestOneBit = this.f10141s * this.f10140r;
        agu agu = this.f10126d.f333b;
        if (agu == null) {
            iArr = new int[highestOneBit];
        } else {
            iArr = (int[]) agu.mo272a(highestOneBit, int[].class);
        }
        this.f10133k = iArr;
    }

    /* renamed from: a */
    public final void mo155a(Config config) {
        if (config == Config.ARGB_8888 || config == Config.RGB_565) {
            this.f10143u = config;
            return;
        }
        String valueOf = String.valueOf(config);
        String valueOf2 = String.valueOf(Config.ARGB_8888);
        String valueOf3 = String.valueOf(Config.RGB_565);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 41) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("Unsupported format: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", must be one of ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" or ");
        stringBuilder.append(valueOf3);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
