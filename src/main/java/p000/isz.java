package p000;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map.Entry;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: isz */
public final class isz {
    /* renamed from: h */
    private static final Charset f7775h = Charset.forName("US-ASCII");
    /* renamed from: r */
    private static final short f7776r = ExifInterface.m8590g(ExifInterface.f13020j);
    /* renamed from: s */
    private static final short f7777s = ExifInterface.m8590g(ExifInterface.f13021k);
    /* renamed from: t */
    private static final short f7778t = ExifInterface.m8590g(ExifInterface.f13036z);
    /* renamed from: u */
    private static final short f7779u = ExifInterface.m8590g(ExifInterface.f13022l);
    /* renamed from: v */
    private static final short f7780v = ExifInterface.m8590g(ExifInterface.f13023m);
    /* renamed from: w */
    private static final short f7781w = ExifInterface.m8590g(ExifInterface.f13016f);
    /* renamed from: x */
    private static final short f7782x = ExifInterface.m8590g(ExifInterface.f13018h);
    /* renamed from: a */
    public final iss f7783a;
    /* renamed from: b */
    public int f7784b;
    /* renamed from: c */
    public ite f7785c;
    /* renamed from: d */
    public itc f7786d;
    /* renamed from: e */
    public ite f7787e;
    /* renamed from: f */
    public ite f7788f;
    /* renamed from: g */
    public final TreeMap f7789g = new TreeMap();
    /* renamed from: i */
    private final int f7790i;
    /* renamed from: j */
    private int f7791j = 0;
    /* renamed from: k */
    private int f7792k = 0;
    /* renamed from: l */
    private boolean f7793l;
    /* renamed from: m */
    private boolean f7794m = false;
    /* renamed from: n */
    private int f7795n;
    /* renamed from: o */
    private byte[] f7796o;
    /* renamed from: p */
    private int f7797p;
    /* renamed from: q */
    private final ExifInterface f7798q;

    /* JADX WARNING: Missing block: B:45:0x00ef, code:
            android.util.Log.w("CAM_ExifParser", "Invalid JPEG format.");
            r0 = false;
     */
    public isz(java.io.InputStream r9, com.google.android.libraries.camera.exif.ExifInterface r10) {
        /*
        r8 = this;
        r1 = 0;
        r8.<init>();
        r8.f7791j = r1;
        r8.f7792k = r1;
        r8.f7794m = r1;
        r0 = new java.util.TreeMap;
        r0.<init>();
        r8.f7789g = r0;
        if (r9 != 0) goto L_0x001b;
    L_0x0013:
        r0 = new java.io.IOException;
        r1 = "Null argument inputStream to ExifParser";
        r0.<init>(r1);
        throw r0;
    L_0x001b:
        r8.f7798q = r10;
        r3 = new iss;
        r3.<init>(r9);
        r0 = r3.mo8950b();
        r2 = r0;
    L_0x0027:
        r0 = -39;
        if (r2 == r0) goto L_0x0103;
    L_0x002b:
        r0 = p000.ion.m4014a(r2);
        if (r0 != 0) goto L_0x0100;
    L_0x0031:
        r0 = -40;
        if (r2 != r0) goto L_0x003b;
    L_0x0035:
        r0 = r3.mo8950b();
        r2 = r0;
        goto L_0x0027;
    L_0x003b:
        r0 = r3.mo8950b();
        r0 = (char) r0;
        r4 = -31;
        if (r2 != r4) goto L_0x00e1;
    L_0x0044:
        r2 = 8;
        if (r0 < r2) goto L_0x00e1;
    L_0x0048:
        r2 = r3.mo8947a();
        r4 = r3.mo8950b();
        r0 = r0 + -6;
        r5 = 1165519206; // 0x45786966 float:3974.5874 double:5.758429993E-315;
        if (r2 != r5) goto L_0x00e1;
    L_0x0057:
        if (r4 != 0) goto L_0x00e1;
    L_0x0059:
        r8.f7795n = r0;
        r0 = 1;
    L_0x005c:
        r8.f7794m = r0;
        r0 = new iss;
        r0.<init>(r9);
        r8.f7783a = r0;
        r0 = 63;
        r8.f7790i = r0;
        r0 = r8.f7794m;
        if (r0 != 0) goto L_0x006e;
    L_0x006d:
        return;
    L_0x006e:
        r0 = r8.f7783a;
        r0 = r0.mo8950b();
        r2 = 18761; // 0x4949 float:2.629E-41 double:9.269E-320;
        if (r0 != r2) goto L_0x00d5;
    L_0x0078:
        r0 = r8.f7783a;
        r2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0.mo8948a(r2);
    L_0x007f:
        r0 = r8.f7783a;
        r0 = r0.mo8950b();
        r2 = 42;
        if (r0 != r2) goto L_0x0106;
    L_0x0089:
        r0 = r8.f7783a;
        r2 = r0.mo8951c();
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x00af;
    L_0x0096:
        r0 = new isw;
        r1 = new java.lang.StringBuilder;
        r4 = 35;
        r1.<init>(r4);
        r4 = "Invalid offset ";
        r1.append(r4);
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00af:
        r0 = (int) r2;
        r8.f7797p = r0;
        r8.f7784b = r1;
        r4 = r8.m4221a(r1);
        if (r4 != 0) goto L_0x00c0;
    L_0x00ba:
        r4 = r8.m4227c();
        if (r4 == 0) goto L_0x006d;
    L_0x00c0:
        r8.m4220a(r1, r2);
        r4 = 8;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x006d;
    L_0x00c9:
        r0 = r0 + -8;
        r0 = new byte[r0];
        r8.f7796o = r0;
        r0 = r8.f7796o;
        r8.mo8969a(r0);
        goto L_0x006d;
    L_0x00d5:
        r2 = 19789; // 0x4d4d float:2.773E-41 double:9.777E-320;
        if (r0 != r2) goto L_0x010e;
    L_0x00d9:
        r0 = r8.f7783a;
        r2 = java.nio.ByteOrder.BIG_ENDIAN;
        r0.mo8948a(r2);
        goto L_0x007f;
    L_0x00e1:
        r2 = 2;
        if (r0 < r2) goto L_0x00ef;
    L_0x00e4:
        r0 = r0 + -2;
        r4 = (long) r0;
        r6 = r3.skip(r4);
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 == 0) goto L_0x00f9;
    L_0x00ef:
        r0 = "CAM_ExifParser";
        r2 = "Invalid JPEG format.";
        android.util.Log.w(r0, r2);
        r0 = r1;
        goto L_0x005c;
    L_0x00f9:
        r0 = r3.mo8950b();
        r2 = r0;
        goto L_0x0027;
    L_0x0100:
        r0 = r1;
        goto L_0x005c;
    L_0x0103:
        r0 = r1;
        goto L_0x005c;
    L_0x0106:
        r0 = new isw;
        r1 = "Invalid TIFF header";
        r0.<init>(r1);
        throw r0;
    L_0x010e:
        r0 = new isw;
        r1 = "Invalid TIFF header";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: isz.<init>(java.io.InputStream, com.google.android.libraries.camera.exif.ExifInterface):void");
    }

    /* renamed from: a */
    private final boolean m4222a(int i, int i2) {
        int i3 = this.f7798q.mo12667a().get(i2);
        if (i3 == 0) {
            return false;
        }
        return ExifInterface.m8585a(i3, i);
    }

    /* renamed from: b */
    private final void m4225b(ite ite) {
        int i = 0;
        if (ite != null && ite.f7815d != 0) {
            short s = ite.f7812a;
            int i2 = ite.f7816e;
            if (s == f7776r && m4222a(i2, ExifInterface.f13020j)) {
                if (m4221a(2) || m4221a(3)) {
                    m4220a(2, ite.mo8981a(0));
                }
            } else if (s == f7777s && m4222a(i2, ExifInterface.f13021k)) {
                if (m4221a(4)) {
                    m4220a(4, ite.mo8981a(0));
                }
            } else if (s == f7778t && m4222a(i2, ExifInterface.f13036z)) {
                if (m4221a(3)) {
                    m4220a(3, ite.mo8981a(0));
                }
            } else if (s == f7779u && m4222a(i2, ExifInterface.f13022l)) {
                if (m4226b()) {
                    this.f7789g.put(Integer.valueOf((int) ite.mo8981a(0)), new itc());
                }
            } else if (s == f7780v && m4222a(i2, ExifInterface.f13023m)) {
                if (m4226b()) {
                    this.f7788f = ite;
                }
            } else if (s == f7781w && m4222a(i2, ExifInterface.f13016f)) {
                if (!m4226b()) {
                    return;
                }
                if (ite.mo8995h()) {
                    while (i < ite.f7815d) {
                        if (ite.f7813b == (short) 3) {
                            m4224b(i, ite.mo8981a(i));
                        } else {
                            m4224b(i, ite.mo8981a(i));
                        }
                        i++;
                    }
                    return;
                }
                this.f7789g.put(Integer.valueOf(ite.f7818g), new ita(ite, false));
            } else if (s == f7782x && m4222a(i2, ExifInterface.f13018h) && m4226b() && ite.mo8995h()) {
                this.f7787e = ite;
            }
        }
    }

    /* renamed from: a */
    private final boolean m4221a(int i) {
        switch (i) {
            case 0:
                return this.f7790i & 1;
            case 1:
                if ((this.f7790i & 2) == 0) {
                    return false;
                }
                return true;
            case 2:
                if ((this.f7790i & 4) == 0) {
                    return false;
                }
                return true;
            case 3:
                if ((this.f7790i & 16) == 0) {
                    return false;
                }
                return true;
            case 4:
                if ((this.f7790i & 8) == 0) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private final boolean m4226b() {
        return (this.f7790i & 32) != 0;
    }

    /* renamed from: c */
    private final boolean m4227c() {
        switch (this.f7784b) {
            case 0:
                if (m4221a(2) || m4221a(4) || m4221a(3) || m4221a(1)) {
                    return true;
                }
                return false;
            case 1:
                return m4226b();
            case 2:
                return m4221a(3);
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final int mo8968a() {
        while (this.f7794m) {
            int i = this.f7783a.f7757a;
            int i2 = (this.f7791j + 2) + (this.f7792k * 12);
            ite ite;
            if (i < i2) {
                this.f7785c = m4228d();
                ite = this.f7785c;
                if (ite != null) {
                    if (this.f7793l) {
                        m4225b(ite);
                    }
                    return 1;
                }
            }
            long e;
            StringBuilder stringBuilder;
            if (i == i2) {
                if (this.f7784b == 0) {
                    e = m4229e();
                    if ((m4221a(1) || m4226b()) && e != 0) {
                        m4220a(1, e);
                    }
                } else {
                    if (this.f7789g.size() > 0) {
                        i = ((Integer) ((Entry) jri.m13404b(this.f7789g.firstEntry())).getKey()).intValue() - this.f7783a.f7757a;
                    } else {
                        i = 4;
                    }
                    if (i < 4) {
                        stringBuilder = new StringBuilder(45);
                        stringBuilder.append("Invalid size of link to next IFD: ");
                        stringBuilder.append(i);
                        Log.w("CAM_ExifParser", stringBuilder.toString());
                    } else {
                        e = m4229e();
                        if (e != 0) {
                            StringBuilder stringBuilder2 = new StringBuilder(46);
                            stringBuilder2.append("Invalid link to next IFD: ");
                            stringBuilder2.append(e);
                            Log.w("CAM_ExifParser", stringBuilder2.toString());
                        }
                    }
                }
            }
            while (this.f7789g.size() != 0) {
                Entry entry = (Entry) jri.m13404b(this.f7789g.pollFirstEntry());
                Object value = entry.getValue();
                try {
                    m4223b(((Integer) entry.getKey()).intValue());
                    if (value instanceof itb) {
                        itb itb = (itb) value;
                        this.f7784b = itb.f7805a;
                        this.f7792k = (char) this.f7783a.mo8950b();
                        this.f7791j = ((Integer) entry.getKey()).intValue();
                        if (((this.f7792k * 12) + this.f7791j) + 2 > this.f7795n) {
                            i = this.f7784b;
                            stringBuilder = new StringBuilder(31);
                            stringBuilder.append("Invalid size of IFD ");
                            stringBuilder.append(i);
                            Log.w("CAM_ExifParser", stringBuilder.toString());
                            return 5;
                        }
                        this.f7793l = m4227c();
                        if (itb.f7806b) {
                            return 0;
                        }
                        int i3 = (this.f7792k * 12) + (this.f7791j + 2);
                        i = this.f7783a.f7757a;
                        if (i <= i3) {
                            if (this.f7793l) {
                                while (i < i3) {
                                    this.f7785c = m4228d();
                                    i += 12;
                                    ite ite2 = this.f7785c;
                                    if (ite2 != null) {
                                        m4225b(ite2);
                                    }
                                }
                            } else {
                                m4223b(i3);
                            }
                            e = m4229e();
                            if (this.f7784b == 0 && ((m4221a(1) || m4226b()) && e > 0)) {
                                m4220a(1, e);
                            }
                        }
                    } else if (value instanceof itc) {
                        this.f7786d = (itc) value;
                        return this.f7786d.f7808b;
                    } else {
                        ita ita = (ita) value;
                        this.f7785c = ita.f7803a;
                        ite = this.f7785c;
                        if (!(ite == null || ite.f7813b == (short) 7)) {
                            mo8970a(ite);
                            m4225b(this.f7785c);
                        }
                        if (ita.f7804b) {
                            return 2;
                        }
                    }
                } catch (IOException e2) {
                    String valueOf = String.valueOf(entry.getKey());
                    String name = value.getClass().getName();
                    StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(name).length());
                    stringBuilder3.append("Failed to skip to data at: ");
                    stringBuilder3.append(valueOf);
                    stringBuilder3.append(" for ");
                    stringBuilder3.append(name);
                    stringBuilder3.append(", the file may be broken.");
                    Log.w("CAM_ExifParser", stringBuilder3.toString());
                }
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: a */
    public final int mo8969a(byte[] bArr) {
        return this.f7783a.read(bArr);
    }

    /* renamed from: a */
    public final void mo8970a(ite ite) {
        int i;
        String valueOf;
        int i2;
        int i3 = 0;
        short s = ite.f7813b;
        if (s == (short) 2 || s == (short) 7 || s == (short) 1) {
            i = ite.f7815d;
            if (this.f7789g.size() > 0 && ((Integer) ((Entry) jri.m13404b(this.f7789g.firstEntry())).getKey()).intValue() < i + this.f7783a.f7757a) {
                Object value = ((Entry) jri.m13404b(this.f7789g.firstEntry())).getValue();
                String str;
                if (value instanceof itc) {
                    valueOf = String.valueOf(ite.toString());
                    str = "Thumbnail overlaps value for tag: \n";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    Log.w("CAM_ExifParser", valueOf);
                    valueOf = String.valueOf(((Entry) jri.m13404b(this.f7789g.pollFirstEntry())).getKey());
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    stringBuilder.append("Invalid thumbnail offset: ");
                    stringBuilder.append(valueOf);
                    Log.w("CAM_ExifParser", stringBuilder.toString());
                } else {
                    StringBuilder stringBuilder2;
                    if (value instanceof itb) {
                        i2 = ((itb) value).f7805a;
                        str = ite.toString();
                        stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 41);
                        stringBuilder2.append("Ifd ");
                        stringBuilder2.append(i2);
                        stringBuilder2.append(" overlaps value for tag: \n");
                        stringBuilder2.append(str);
                        Log.w("CAM_ExifParser", stringBuilder2.toString());
                    } else if (value instanceof ita) {
                        valueOf = ((ita) value).f7803a.toString();
                        str = ite.toString();
                        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(str).length());
                        stringBuilder3.append("Tag value for tag: \n");
                        stringBuilder3.append(valueOf);
                        stringBuilder3.append(" overlaps value for tag: \n");
                        stringBuilder3.append(str);
                        Log.w("CAM_ExifParser", stringBuilder3.toString());
                    }
                    i2 = ((Integer) ((Entry) jri.m13404b(this.f7789g.firstEntry())).getKey()).intValue() - this.f7783a.f7757a;
                    str = ite.toString();
                    stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 52);
                    stringBuilder2.append("Invalid size of tag: \n");
                    stringBuilder2.append(str);
                    stringBuilder2.append(" setting count to: ");
                    stringBuilder2.append(i2);
                    Log.w("CAM_ExifParser", stringBuilder2.toString());
                    ite.f7815d = i2;
                }
            }
        }
        iqn[] iqnArr;
        switch (ite.f7813b) {
            case (short) 1:
            case (short) 7:
                byte[] bArr = new byte[ite.f7815d];
                mo8969a(bArr);
                ite.mo8983a(bArr);
                return;
            case (short) 2:
                i2 = ite.f7815d;
                Charset charset = f7775h;
                if (i2 <= 0) {
                    valueOf = "";
                } else {
                    byte[] bArr2 = new byte[i2];
                    this.f7783a.mo8949a(bArr2, bArr2.length);
                    valueOf = new String(bArr2, charset);
                }
                ite.mo8982a(valueOf);
                return;
            case (short) 3:
                int[] iArr = new int[ite.f7815d];
                int length = iArr.length;
                for (i2 = 0; i2 < length; i2++) {
                    iArr[i2] = (char) this.f7783a.mo8950b();
                }
                ite.mo8984a(iArr);
                return;
            case (short) 4:
                long[] jArr = new long[ite.f7815d];
                i = jArr.length;
                while (i3 < i) {
                    jArr[i3] = m4229e();
                    i3++;
                }
                ite.mo8985a(jArr);
                return;
            case (short) 5:
                iqnArr = new iqn[ite.f7815d];
                i = iqnArr.length;
                while (i3 < i) {
                    iqnArr[i3] = new iqn(m4229e(), m4229e());
                    i3++;
                }
                ite.mo8986a(iqnArr);
                return;
            case (short) 9:
                int[] iArr2 = new int[ite.f7815d];
                i = iArr2.length;
                while (i3 < i) {
                    iArr2[i3] = this.f7783a.mo8947a();
                    i3++;
                }
                ite.mo8984a(iArr2);
                return;
            case (short) 10:
                iqnArr = new iqn[ite.f7815d];
                i = iqnArr.length;
                while (i3 < i) {
                    iqnArr[i3] = new iqn((long) this.f7783a.mo8947a(), (long) this.f7783a.mo8947a());
                    i3++;
                }
                ite.mo8986a(iqnArr);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private final ite m4228d() {
        boolean z = true;
        short b = this.f7783a.mo8950b();
        short b2 = this.f7783a.mo8950b();
        long c = this.f7783a.mo8951c();
        if (c > 2147483647L) {
            throw new isw("Number of component is larger then Integer.MAX_VALUE");
        } else if (ite.m4235b(b2)) {
            int i = (int) c;
            int i2 = this.f7784b;
            if (i == 0) {
                z = false;
            }
            ite ite = new ite(b, b2, i, i2, z);
            int a = ite.mo8980a();
            if (a > 4) {
                long c2 = this.f7783a.mo8951c();
                if (c2 > 2147483647L) {
                    throw new isw("offset is larger then Integer.MAX_VALUE");
                } else if (c2 >= ((long) this.f7797p) || b2 != (short) 7) {
                    ite.f7818g = (int) c2;
                    return ite;
                } else {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f7796o, ((int) c2) - 8, bArr, 0, i);
                    ite.mo8983a(bArr);
                    return ite;
                }
            }
            boolean z2 = ite.f7814c;
            ite.f7814c = false;
            mo8970a(ite);
            ite.f7814c = z2;
            this.f7783a.skip((long) (4 - a));
            ite.f7818g = this.f7783a.f7757a - 4;
            return ite;
        } else {
            Log.w("CAM_ExifParser", String.format("Tag %04x: Invalid data type %d", new Object[]{Short.valueOf(b), Short.valueOf(b2)}));
            this.f7783a.skip(4);
            return null;
        }
    }

    /* renamed from: e */
    private final long m4229e() {
        return ((long) this.f7783a.mo8947a()) & 4294967295L;
    }

    /* renamed from: a */
    private final void m4220a(int i, long j) {
        this.f7789g.put(Integer.valueOf((int) j), new itb(i, m4221a(i)));
    }

    /* renamed from: b */
    private final void m4224b(int i, long j) {
        this.f7789g.put(Integer.valueOf((int) j), new itc(i));
    }

    /* renamed from: b */
    private final void m4223b(int i) {
        iss iss = this.f7783a;
        long j = ((long) i) - ((long) iss.f7757a);
        if (iss.skip(j) == j) {
            while (!this.f7789g.isEmpty() && ((Integer) this.f7789g.firstKey()).intValue() < i) {
                this.f7789g.pollFirstEntry();
            }
            return;
        }
        throw new EOFException();
    }
}
