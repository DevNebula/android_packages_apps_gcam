package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: itf */
public final class itf extends ikn {
    /* renamed from: e */
    private static final byte[] f21265e = new byte[]{(byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0};
    /* renamed from: f */
    private static final byte[] f21266f = new byte[]{(byte) 73, (byte) 67, (byte) 67, (byte) 95, (byte) 80, (byte) 82, (byte) 79, (byte) 70, (byte) 73, (byte) 76, (byte) 69, (byte) 0};
    /* renamed from: g */
    private final ist f21267g;
    /* renamed from: h */
    private final ExifInterface f21268h;
    /* renamed from: i */
    private short f21269i = (short) 0;
    /* renamed from: j */
    private short f21270j = (short) 0;
    /* renamed from: k */
    private int f21271k = 0;
    /* renamed from: l */
    private boolean f21272l = true;

    public itf(OutputStream outputStream, ExifInterface exifInterface, ist ist) {
        super(outputStream, new iqa());
        this.f21268h = exifInterface;
        this.f21267g = ist;
    }

    /* renamed from: a */
    private static int m12696a(ith ith, int i) {
        int b = (((ith.mo9003b() * 12) + 2) + 4) + i;
        for (ite ite : ith.mo9002a()) {
            if (ite != null && ite.mo8980a() > 4) {
                ite.f7818g = b;
                b += ite.mo8980a();
            }
        }
        return b;
    }

    /* renamed from: a */
    private static void m12697a(int i, short s) {
        if (i < 0) {
            throw new IllegalStateException(String.format("Negative section length: section length read was 0x%02X%02X", new Object[]{Integer.valueOf((s >> 8) & Illuminant.kOther), Integer.valueOf(s & Illuminant.kOther)}));
        }
    }

    /* JADX WARNING: Missing block: B:177:0x0511, code:
            r10.f21270j = mo8591d(1);
            mo8584a(r10.f21270j);
            r10.f21271k = ((char) r10.f21270j) - 2;
            p000.itf.m12697a(r10.f21271k, r10.f21269i);
            mo8587a(r10.f21271k);
     */
    /* JADX WARNING: Missing block: B:181:0x0567, code:
            super.mo8583a(4, 3);
            super.mo8582a();
            r0 = r10.f7426a;
            r1 = r0.f7679b;
     */
    /* JADX WARNING: Missing block: B:182:0x0577, code:
            if ((r1 + 4) > r0.f7680c) goto L_0x05ea;
     */
    /* JADX WARNING: Missing block: B:183:0x0579, code:
            r2 = new byte[4];
            java.lang.System.arraycopy(r0.f7678a, r1, r2, 0, 4);
            r0.f7679b += 4;
            r10.f21271k -= 4;
            r0 = 0;
     */
    /* JADX WARNING: Missing block: B:185:0x0591, code:
            if (r0 >= 4) goto L_0x05bc;
     */
    /* JADX WARNING: Missing block: B:187:0x0599, code:
            if (r2[r0] != f21265e[r0]) goto L_0x059e;
     */
    /* JADX WARNING: Missing block: B:188:0x059b, code:
            r0 = r0 + 1;
     */
    /* JADX WARNING: Missing block: B:189:0x059e, code:
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:190:0x059f, code:
            if (r0 == null) goto L_0x05a9;
     */
    /* JADX WARNING: Missing block: B:191:0x05a1, code:
            mo8589b(r10.f21271k);
     */
    /* JADX WARNING: Missing block: B:193:0x05a9, code:
            mo8584a(r10.f21269i);
            mo8584a(r10.f21270j);
            mo8585a((byte[]) r2);
            mo8587a(r10.f21271k);
     */
    /* JADX WARNING: Missing block: B:194:0x05bc, code:
            r0 = 1;
     */
    /* JADX WARNING: Missing block: B:199:0x05f1, code:
            throw new java.lang.IllegalStateException("Byte queue is too short");
     */
    /* JADX WARNING: Missing block: B:220:?, code:
            return 0;
     */
    /* JADX WARNING: Missing block: B:224:?, code:
            return 0;
     */
    /* renamed from: c */
    protected final int mo8590c(int r11) {
        /*
        r10 = this;
        switch(r11) {
            case 0: goto L_0x0019;
            case 1: goto L_0x0511;
            case 2: goto L_0x05be;
            case 3: goto L_0x0567;
            case 4: goto L_0x0553;
            case 5: goto L_0x0536;
            default: goto L_0x0003;
        };
    L_0x0003:
        r0 = new java.lang.IllegalStateException;
        r1 = 1;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = java.lang.Integer.valueOf(r11);
        r1[r2] = r3;
        r2 = "No such state: %d";
        r1 = java.lang.String.format(r2, r1);
        r0.<init>(r1);
        throw r0;
    L_0x0019:
        r0 = 0;
        r0 = r10.mo8591d(r0);
        r10.f21269i = r0;
        r0 = r10.f21269i;
        r1 = r0 & -256;
        r2 = -256; // 0xffffffffffffff00 float:NaN double:NaN;
        if (r1 == r2) goto L_0x004b;
    L_0x0028:
        r1 = new java.lang.IllegalStateException;
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r0 >> 8;
        r4 = r4 & 255;
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r3 = 1;
        r0 = r0 & 255;
        r0 = java.lang.Integer.valueOf(r0);
        r2[r3] = r0;
        r0 = "Unexpected section marker: %02X%02X";
        r0 = java.lang.String.format(r0, r2);
        r1.<init>(r0);
        throw r1;
    L_0x004b:
        r1 = -40;
        if (r0 == r1) goto L_0x0053;
    L_0x004f:
        r1 = -39;
        if (r0 != r1) goto L_0x0496;
    L_0x0053:
        r10.mo8584a(r0);
        r0 = r10.f21269i;
        r1 = -40;
        if (r0 != r1) goto L_0x0494;
    L_0x005c:
        r3 = r10.f21267g;
        if (r3 == 0) goto L_0x0494;
    L_0x0060:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r5 = r3.f7760a;
        r6 = r5.length;
        r0 = 0;
        r1 = r0;
    L_0x006f:
        if (r1 >= r6) goto L_0x008c;
    L_0x0071:
        r0 = r5[r1];
        if (r0 != 0) goto L_0x0079;
    L_0x0075:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x006f;
    L_0x0079:
        r7 = r0.mo9002a();
        r8 = r7.length;
        r0 = 0;
    L_0x007f:
        if (r0 >= r8) goto L_0x0075;
    L_0x0081:
        r9 = r7[r0];
        if (r9 != 0) goto L_0x0088;
    L_0x0085:
        r0 = r0 + 1;
        goto L_0x007f;
    L_0x0088:
        r2.add(r9);
        goto L_0x0085;
    L_0x008c:
        r5 = r2.size();
        r0 = 0;
    L_0x0091:
        if (r0 >= r5) goto L_0x00b7;
    L_0x0093:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.ite) r0;
        r6 = r0.f7817f;
        if (r6 == 0) goto L_0x00a1;
    L_0x009f:
        r0 = r1;
        goto L_0x0091;
    L_0x00a1:
        r6 = r0.f7812a;
        r6 = com.google.android.libraries.camera.exif.ExifInterface.m8586a(r6);
        if (r6 == 0) goto L_0x00ab;
    L_0x00a9:
        r0 = r1;
        goto L_0x0091;
    L_0x00ab:
        r6 = r0.f7812a;
        r7 = r0.f7816e;
        r3.mo8959a(r6, r7);
        r4.add(r0);
        r0 = r1;
        goto L_0x0091;
    L_0x00b7:
        r0 = r10.f21267g;
        r1 = 0;
        r0 = r0.mo8957a(r1);
        if (r0 != 0) goto L_0x00cb;
    L_0x00c0:
        r0 = new ith;
        r1 = 0;
        r0.<init>(r1);
        r1 = r10.f21267g;
        r1.mo8958a(r0);
    L_0x00cb:
        r1 = r10.f21268h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f13020j;
        r1 = r1.mo12676c(r2);
        if (r1 != 0) goto L_0x00f0;
    L_0x00d5:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13020j;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00f0:
        r0.mo9000a(r1);
        r1 = r10.f21267g;
        r2 = 2;
        r1 = r1.mo8957a(r2);
        if (r1 != 0) goto L_0x0107;
    L_0x00fc:
        r1 = new ith;
        r2 = 2;
        r1.<init>(r2);
        r2 = r10.f21267g;
        r2.mo8958a(r1);
    L_0x0107:
        r2 = r10.f21267g;
        r5 = 4;
        r2 = r2.mo8957a(r5);
        if (r2 == 0) goto L_0x0138;
    L_0x0110:
        r2 = r10.f21268h;
        r5 = com.google.android.libraries.camera.exif.ExifInterface.f13021k;
        r2 = r2.mo12676c(r5);
        if (r2 != 0) goto L_0x0135;
    L_0x011a:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13021k;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0135:
        r0.mo9000a(r2);
    L_0x0138:
        r0 = r10.f21267g;
        r2 = 3;
        r0 = r0.mo8957a(r2);
        if (r0 == 0) goto L_0x0169;
    L_0x0141:
        r0 = r10.f21268h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f13036z;
        r0 = r0.mo12676c(r2);
        if (r0 != 0) goto L_0x0166;
    L_0x014b:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13036z;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0166:
        r1.mo9000a(r0);
    L_0x0169:
        r0 = r10.f21267g;
        r1 = 1;
        r0 = r0.mo8957a(r1);
        r1 = r10.f21267g;
        r1 = r1.mo8960a();
        if (r1 == 0) goto L_0x03ce;
    L_0x0178:
        if (r0 != 0) goto L_0x03cb;
    L_0x017a:
        r0 = new ith;
        r1 = 1;
        r0.<init>(r1);
        r1 = r10.f21267g;
        r1.mo8958a(r0);
        r1 = r0;
    L_0x0186:
        r0 = r10.f21268h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f13022l;
        r0 = r0.mo12676c(r2);
        if (r0 != 0) goto L_0x01ab;
    L_0x0190:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13022l;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01ab:
        r1.mo9000a(r0);
        r0 = r10.f21268h;
        r2 = com.google.android.libraries.camera.exif.ExifInterface.f13023m;
        r2 = r0.mo12676c(r2);
        if (r2 != 0) goto L_0x01d3;
    L_0x01b8:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13023m;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x01d3:
        r0 = r10.f21267g;
        r0 = r0.f7761b;
        r0 = p000.jri.m13404b(r0);
        r0 = (byte[]) r0;
        r0 = r0.length;
        r2.mo8989c(r0);
        r1.mo9000a(r2);
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f13016f;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r0);
        r1.mo9004b(r0);
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f13018h;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r0);
        r1.mo9004b(r0);
    L_0x01f6:
        r0 = r10.f21267g;
        r1 = 0;
        r0 = r0.mo8957a(r1);
        if (r0 == 0) goto L_0x03c7;
    L_0x01ff:
        r0 = p000.jri.m13404b(r0);
        r0 = (p000.ith) r0;
        r1 = 8;
        r2 = p000.itf.m12696a(r0, r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13020j;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r1 = r0.mo9001a(r1);
        r1 = p000.jri.m13404b(r1);
        r1 = (p000.ite) r1;
        r1.mo8989c(r2);
        r1 = r10.f21267g;
        r5 = 2;
        r1 = r1.mo8957a(r5);
        if (r1 == 0) goto L_0x02a4;
    L_0x0227:
        r1 = p000.jri.m13404b(r1);
        r1 = (p000.ith) r1;
        r2 = p000.itf.m12696a(r1, r2);
        r5 = r10.f21267g;
        r6 = 3;
        r5 = r5.mo8957a(r6);
        if (r5 == 0) goto L_0x0252;
    L_0x023a:
        r6 = com.google.android.libraries.camera.exif.ExifInterface.f13036z;
        r6 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r6);
        r1 = r1.mo9001a(r6);
        r1 = p000.jri.m13404b(r1);
        r1 = (p000.ite) r1;
        r1.mo8989c(r2);
        r1 = p000.itf.m12696a(r5, r2);
        r2 = r1;
    L_0x0252:
        r1 = r10.f21267g;
        r5 = 4;
        r5 = r1.mo8957a(r5);
        if (r5 == 0) goto L_0x0272;
    L_0x025b:
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13021k;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r1 = r0.mo9001a(r1);
        r1 = p000.jri.m13404b(r1);
        r1 = (p000.ite) r1;
        r1.mo8989c(r2);
        r2 = p000.itf.m12696a(r5, r2);
    L_0x0272:
        r1 = r10.f21267g;
        r5 = 1;
        r1 = r1.mo8957a(r5);
        if (r1 != 0) goto L_0x03bf;
    L_0x027b:
        r0 = r10.f21267g;
        r0 = r0.mo8960a();
        if (r0 == 0) goto L_0x037d;
    L_0x0283:
        if (r1 == 0) goto L_0x0298;
    L_0x0285:
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f13022l;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r0);
        r0 = r1.mo9001a(r0);
        r0 = p000.jri.m13404b(r0);
        r0 = (p000.ite) r0;
        r0.mo8989c(r2);
    L_0x0298:
        r0 = r10.f21267g;
        r0 = r0.f7761b;
        r0 = p000.jri.m13404b(r0);
        r0 = (byte[]) r0;
        r0 = r0.length;
        r2 = r2 + r0;
    L_0x02a4:
        r0 = r2 + 8;
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r0 <= r1) goto L_0x02b3;
    L_0x02ab:
        r0 = new java.io.IOException;
        r1 = "Exif header is too large (>64Kb)";
        r0.<init>(r1);
        throw r0;
    L_0x02b3:
        r0 = -31;
        r10.mo8584a(r0);
        r0 = f21265e;
        r0 = r0.length;
        r0 = r0 + 2;
        r0 = r0 + r2;
        r0 = (short) r0;
        r10.mo8584a(r0);
        r0 = f21265e;
        r10.mo8585a(r0);
        r0 = r3.f7763d;
        r1 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r1) goto L_0x0376;
    L_0x02cd:
        r0 = 19789; // 0x4d4d float:2.773E-41 double:9.777E-320;
        r10.mo8584a(r0);
    L_0x02d2:
        r1 = new iti;
        r0 = r10.f7427b;
        r1.<init>(r0);
        r0 = r3.f7763d;
        r2 = r1.f7826a;
        r2.order(r0);
        r0 = 42;
        r1.mo9008a(r0);
        r0 = 8;
        r1.mo9007a(r0);
        r0 = r10.f21267g;
        r2 = 0;
        r0 = r0.mo8957a(r2);
        r0 = p000.jri.m13404b(r0);
        r0 = (p000.ith) r0;
        p000.itf.m12699a(r0, r1);
        r0 = r10.f21267g;
        r2 = 2;
        r0 = r0.mo8957a(r2);
        r0 = p000.jri.m13404b(r0);
        r0 = (p000.ith) r0;
        p000.itf.m12699a(r0, r1);
        r0 = r10.f21267g;
        r2 = 3;
        r0 = r0.mo8957a(r2);
        if (r0 == 0) goto L_0x0316;
    L_0x0313:
        p000.itf.m12699a(r0, r1);
    L_0x0316:
        r0 = r10.f21267g;
        r2 = 4;
        r0 = r0.mo8957a(r2);
        if (r0 == 0) goto L_0x0322;
    L_0x031f:
        p000.itf.m12699a(r0, r1);
    L_0x0322:
        r0 = r10.f21267g;
        r2 = 1;
        r0 = r0.mo8957a(r2);
        if (r0 == 0) goto L_0x032e;
    L_0x032b:
        p000.itf.m12699a(r0, r1);
    L_0x032e:
        r0 = r10.f21267g;
        r0 = r0.mo8960a();
        if (r0 == 0) goto L_0x0357;
    L_0x0336:
        r0 = r10.f21267g;
        r0 = r0.f7761b;
        r0 = p000.jri.m13404b(r0);
        r0 = (byte[]) r0;
        r1.write(r0);
    L_0x0343:
        r2 = r4.size();
        r0 = 0;
    L_0x0348:
        if (r0 >= r2) goto L_0x0494;
    L_0x034a:
        r1 = r0 + 1;
        r0 = r4.get(r0);
        r0 = (p000.ite) r0;
        r3.mo8956a(r0);
        r0 = r1;
        goto L_0x0348;
    L_0x0357:
        r0 = r10.f21267g;
        r0 = r0.mo8961b();
        if (r0 == 0) goto L_0x0343;
    L_0x035f:
        r0 = 0;
    L_0x0360:
        r2 = r10.f21267g;
        r2 = r2.f7762c;
        r2 = r2.size();
        if (r0 >= r2) goto L_0x0343;
    L_0x036a:
        r2 = r10.f21267g;
        r2 = r2.mo8962b(r0);
        r1.write(r2);
        r0 = r0 + 1;
        goto L_0x0360;
    L_0x0376:
        r0 = 18761; // 0x4949 float:2.629E-41 double:9.269E-320;
        r10.mo8584a(r0);
        goto L_0x02d2;
    L_0x037d:
        r0 = r10.f21267g;
        r0 = r0.mo8961b();
        if (r0 == 0) goto L_0x02a4;
    L_0x0385:
        r0 = r10.f21267g;
        r0 = r0.f7762c;
        r0 = r0.size();
        r5 = new long[r0];
        r0 = 0;
    L_0x0390:
        r6 = r10.f21267g;
        r6 = r6.f7762c;
        r6 = r6.size();
        if (r0 >= r6) goto L_0x03a8;
    L_0x039a:
        r6 = (long) r2;
        r5[r0] = r6;
        r6 = r10.f21267g;
        r6 = r6.mo8962b(r0);
        r6 = r6.length;
        r2 = r2 + r6;
        r0 = r0 + 1;
        goto L_0x0390;
    L_0x03a8:
        if (r1 == 0) goto L_0x02a4;
    L_0x03aa:
        r0 = com.google.android.libraries.camera.exif.ExifInterface.f13016f;
        r0 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r0);
        r0 = r1.mo9001a(r0);
        r0 = p000.jri.m13404b(r0);
        r0 = (p000.ite) r0;
        r0.mo8985a(r5);
        goto L_0x02a4;
    L_0x03bf:
        r0.f7824b = r2;
        r2 = p000.itf.m12696a(r1, r2);
        goto L_0x027b;
    L_0x03c7:
        r2 = 8;
        goto L_0x02a4;
    L_0x03cb:
        r1 = r0;
        goto L_0x0186;
    L_0x03ce:
        r1 = r10.f21267g;
        r1 = r1.mo8961b();
        if (r1 == 0) goto L_0x046c;
    L_0x03d6:
        if (r0 != 0) goto L_0x03e3;
    L_0x03d8:
        r0 = new ith;
        r1 = 1;
        r0.<init>(r1);
        r1 = r10.f21267g;
        r1.mo8958a(r0);
    L_0x03e3:
        r1 = r10.f21267g;
        r1 = r1.f7762c;
        r1 = r1.size();
        r2 = r10.f21268h;
        r5 = com.google.android.libraries.camera.exif.ExifInterface.f13016f;
        r2 = r2.mo12676c(r5);
        if (r2 != 0) goto L_0x0410;
    L_0x03f5:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13016f;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0410:
        r5 = r10.f21268h;
        r6 = com.google.android.libraries.camera.exif.ExifInterface.f13018h;
        r5 = r5.mo12676c(r6);
        if (r5 != 0) goto L_0x0435;
    L_0x041a:
        r0 = new java.io.IOException;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13018h;
        r2 = new java.lang.StringBuilder;
        r3 = 47;
        r2.<init>(r3);
        r3 = "No definition for crucial exif tag: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0435:
        r6 = new long[r1];
        r1 = 0;
    L_0x0438:
        r7 = r10.f21267g;
        r7 = r7.f7762c;
        r7 = r7.size();
        if (r1 >= r7) goto L_0x044f;
    L_0x0442:
        r7 = r10.f21267g;
        r7 = r7.mo8962b(r1);
        r7 = r7.length;
        r8 = (long) r7;
        r6[r1] = r8;
        r1 = r1 + 1;
        goto L_0x0438;
    L_0x044f:
        r5.mo8985a(r6);
        r0.mo9000a(r2);
        r0.mo9000a(r5);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13022l;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r0.mo9004b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13023m;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r0.mo9004b(r1);
        goto L_0x01f6;
    L_0x046c:
        if (r0 == 0) goto L_0x01f6;
    L_0x046e:
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13016f;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r0.mo9004b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13018h;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r0.mo9004b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13022l;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r0.mo9004b(r1);
        r1 = com.google.android.libraries.camera.exif.ExifInterface.f13023m;
        r1 = com.google.android.libraries.camera.exif.ExifInterface.m8590g(r1);
        r0.mo9004b(r1);
        goto L_0x01f6;
    L_0x0494:
        r0 = 0;
    L_0x0495:
        return r0;
    L_0x0496:
        r0 = p000.ion.m4014a(r0);
        if (r0 == 0) goto L_0x04f3;
    L_0x049c:
        r0 = r10.f21272l;
        if (r0 == 0) goto L_0x04ec;
    L_0x04a0:
        r0 = r10.f21268h;
        r0 = r0.f13037N;
        r1 = 2;
        if (r0 != r1) goto L_0x04e9;
    L_0x04a7:
        r0 = p000.kwi.f9104a;
    L_0x04a9:
        r1 = r0.length;
        r2 = r1 + r1;
        r1 = f21266f;
        r1 = r1.length;
        r1 = r1 + 2;
        r1 = r1 + 2;
        r1 = r1 + r2;
        r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r1 > r3) goto L_0x04e7;
    L_0x04b9:
        r1 = 1;
    L_0x04ba:
        r3 = "ICC profile does not fit in one marker segment!";
        p000.jri.m13396a(r1, r3);
        r1 = -30;
        r10.mo8584a(r1);
        r1 = f21266f;
        r1 = r1.length;
        r1 = r1 + 2;
        r1 = r1 + 2;
        r1 = r1 + r2;
        r1 = (short) r1;
        r10.mo8584a(r1);
        r1 = f21266f;
        r10.mo8585a(r1);
        r1 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r10.mo8584a(r1);
        r1 = 0;
    L_0x04db:
        r2 = r0.length;
        if (r1 >= r2) goto L_0x04ec;
    L_0x04de:
        r2 = r0[r1];
        r2 = (short) r2;
        r10.mo8584a(r2);
        r1 = r1 + 1;
        goto L_0x04db;
    L_0x04e7:
        r1 = 0;
        goto L_0x04ba;
    L_0x04e9:
        r0 = p000.kwj.f9105a;
        goto L_0x04a9;
    L_0x04ec:
        r0 = r10.f21269i;
        r10.mo8584a(r0);
        r0 = 4;
        goto L_0x0495;
    L_0x04f3:
        r0 = r10.f21267g;
        if (r0 == 0) goto L_0x04ff;
    L_0x04f7:
        r0 = r10.f21269i;
        r1 = -31;
        if (r0 != r1) goto L_0x04ff;
    L_0x04fd:
        r0 = 2;
        goto L_0x0495;
    L_0x04ff:
        r0 = r10.f21269i;
        r1 = -30;
        if (r0 != r1) goto L_0x050e;
    L_0x0505:
        r1 = r10.f21268h;
        r1 = r1.f13037N;
        if (r1 != 0) goto L_0x0533;
    L_0x050b:
        r1 = 0;
        r10.f21272l = r1;
    L_0x050e:
        r10.mo8584a(r0);
    L_0x0511:
        r0 = 1;
        r0 = r10.mo8591d(r0);
        r10.f21270j = r0;
        r0 = r10.f21270j;
        r10.mo8584a(r0);
        r0 = r10.f21270j;
        r0 = (char) r0;
        r0 = r0 + -2;
        r10.f21271k = r0;
        r0 = r10.f21271k;
        r1 = r10.f21269i;
        p000.itf.m12697a(r0, r1);
        r0 = r10.f21271k;
        r10.mo8587a(r0);
        r0 = 0;
        goto L_0x0495;
    L_0x0533:
        r0 = 5;
        goto L_0x0495;
    L_0x0536:
        r0 = 5;
        r0 = r10.mo8591d(r0);
        r10.f21270j = r0;
        r0 = r10.f21270j;
        r0 = (char) r0;
        r0 = r0 + -2;
        r10.f21271k = r0;
        r0 = r10.f21271k;
        r1 = r10.f21269i;
        p000.itf.m12697a(r0, r1);
        r0 = r10.f21271k;
        r10.mo8589b(r0);
        r0 = 0;
        goto L_0x0495;
    L_0x0553:
        super.mo8582a();
        r0 = r10.f7426a;
        r1 = r10.f7427b;
        r2 = r0.mo8760a();
        r0.mo8762a(r1, r2);
        r0 = -1;
        r10.f7429d = r0;
        r0 = 4;
        goto L_0x0495;
    L_0x0567:
        r0 = 4;
        r1 = 3;
        super.mo8583a(r0, r1);
        super.mo8582a();
        r0 = r10.f7426a;
        r1 = r0.f7679b;
        r2 = r1 + 4;
        r3 = r0.f7680c;
        if (r2 > r3) goto L_0x05ea;
    L_0x0579:
        r2 = 4;
        r2 = new byte[r2];
        r3 = r0.f7678a;
        r4 = 0;
        r5 = 4;
        java.lang.System.arraycopy(r3, r1, r2, r4, r5);
        r1 = r0.f7679b;
        r1 = r1 + 4;
        r0.f7679b = r1;
        r0 = r10.f21271k;
        r0 = r0 + -4;
        r10.f21271k = r0;
        r0 = 0;
    L_0x0590:
        r1 = 4;
        if (r0 >= r1) goto L_0x05bc;
    L_0x0593:
        r1 = r2[r0];
        r3 = f21265e;
        r3 = r3[r0];
        if (r1 != r3) goto L_0x059e;
    L_0x059b:
        r0 = r0 + 1;
        goto L_0x0590;
    L_0x059e:
        r0 = 0;
    L_0x059f:
        if (r0 == 0) goto L_0x05a9;
    L_0x05a1:
        r0 = r10.f21271k;
        r10.mo8589b(r0);
    L_0x05a6:
        r0 = 0;
        goto L_0x0495;
    L_0x05a9:
        r0 = r10.f21269i;
        r10.mo8584a(r0);
        r0 = r10.f21270j;
        r10.mo8584a(r0);
        r10.mo8585a(r2);
        r0 = r10.f21271k;
        r10.mo8587a(r0);
        goto L_0x05a6;
    L_0x05bc:
        r0 = 1;
        goto L_0x059f;
    L_0x05be:
        r0 = 2;
        r0 = r10.mo8591d(r0);
        r10.f21270j = r0;
        r0 = r10.f21270j;
        r0 = (char) r0;
        r0 = r0 + -2;
        r10.f21271k = r0;
        r0 = r10.f21271k;
        r1 = r10.f21269i;
        p000.itf.m12697a(r0, r1);
        r0 = r10.f21271k;
        r1 = 5;
        if (r0 >= r1) goto L_0x0567;
    L_0x05d8:
        r0 = r10.f21269i;
        r10.mo8584a(r0);
        r0 = r10.f21270j;
        r10.mo8584a(r0);
        r0 = r10.f21271k;
        r10.mo8587a(r0);
        r0 = 0;
        goto L_0x0495;
    L_0x05ea:
        r0 = new java.lang.IllegalStateException;
        r1 = "Byte queue is too short";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: itf.c(int):int");
    }

    /* renamed from: a */
    private static void m12699a(ith ith, iti iti) {
        int i;
        int i2 = 0;
        ite[] a = ith.mo9002a();
        iti.mo9008a((short) r4);
        for (ite ite : a) {
            if (ite != null) {
                iti.mo9008a(ite.f7812a);
                iti.mo9008a(ite.f7813b);
                iti.mo9007a(ite.f7815d);
                if (ite.mo8980a() <= 4) {
                    itf.m12698a(ite, iti);
                    int a2 = 4 - ite.mo8980a();
                    for (i = 0; i < a2; i++) {
                        iti.write(0);
                    }
                } else {
                    iti.mo9007a(ite.f7818g);
                }
            }
        }
        iti.mo9007a(ith.f7824b);
        i = a.length;
        while (i2 < i) {
            ite ite2 = a[i2];
            if (ite2 != null && ite2.mo8980a() > 4) {
                itf.m12698a(ite2, iti);
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static void m12698a(ite ite, iti iti) {
        int i = 0;
        short s = ite.f7813b;
        int length;
        int i2;
        String valueOf;
        switch (s) {
            case (short) 1:
            case (short) 7:
                Object obj = new byte[ite.f7815d];
                length = obj.length;
                if (s == (short) 7 || s == (short) 1) {
                    jri.m13404b(ite.f7817f);
                    Object obj2 = ite.f7817f;
                    i2 = ite.f7815d;
                    if (length > i2) {
                        length = i2;
                    }
                    System.arraycopy(obj2, 0, obj, 0, length);
                    iti.write(obj);
                    return;
                }
                valueOf = String.valueOf(ite.m4233a(s));
                String str = "Cannot get BYTE value from ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new IllegalArgumentException(valueOf);
            case (short) 2:
                jri.m13404b(ite.f7817f);
                byte[] bArr = (byte[]) ite.f7817f;
                i2 = bArr.length;
                if (i2 != ite.f7815d || i2 <= 0) {
                    iti.write(bArr);
                    iti.write(0);
                    return;
                }
                bArr[i2 - 1] = (byte) 0;
                iti.write(bArr);
                return;
            case (short) 3:
                i2 = ite.f7815d;
                for (length = 0; length < i2; length++) {
                    iti.mo9008a((short) ((int) ite.mo8981a(length)));
                }
                return;
            case (short) 4:
            case (short) 9:
                length = ite.f7815d;
                while (i < length) {
                    iti.mo9007a((int) ite.mo8981a(i));
                    i++;
                }
                return;
            case (short) 5:
            case (short) 10:
                i2 = ite.f7815d;
                while (i < i2) {
                    short s2 = ite.f7813b;
                    if (s2 == (short) 10 || s2 == (short) 5) {
                        jri.m13404b(ite.f7817f);
                        iqn iqn = ((iqn[]) ite.f7817f)[i];
                        iti.mo9007a((int) iqn.f7693a);
                        iti.mo9007a((int) iqn.f7694b);
                        i++;
                    } else {
                        valueOf = String.valueOf(ite.m4233a(s2));
                        String str2 = "Cannot get RATIONAL value from ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            valueOf = str2.concat(valueOf);
                        }
                        throw new IllegalArgumentException(valueOf);
                    }
                }
                return;
            default:
                return;
        }
    }
}
