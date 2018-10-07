package com.google.android.libraries.camera.exif;

import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import p000.ikm;
import p000.iqn;
import p000.ist;
import p000.isu;
import p000.isz;
import p000.ita;
import p000.itd;
import p000.ite;
import p000.itf;
import p000.ith;
import p000.jri;

@UsedByReflection
/* compiled from: PG */
public class ExifInterface implements isu {
    /* renamed from: A */
    public static final int f12913A = 173059;
    /* renamed from: B */
    public static final int f12914B = 173061;
    /* renamed from: C */
    public static final int f12915C = 173068;
    /* renamed from: D */
    public static final int f12916D = 262145;
    /* renamed from: E */
    public static final int f12917E = 262146;
    /* renamed from: F */
    public static final int f12918F = 262147;
    /* renamed from: G */
    public static final int f12919G = 262148;
    /* renamed from: H */
    public static final int f12920H = 262149;
    /* renamed from: I */
    public static final int f12921I = 262150;
    /* renamed from: J */
    public static final int f12922J = 262151;
    /* renamed from: K */
    public static final int f12923K = 262160;
    /* renamed from: L */
    public static final int f12924L = 262161;
    /* renamed from: M */
    public static final int f12925M = 262173;
    /* renamed from: O */
    public static final Long f12926O;
    /* renamed from: S */
    private static final int f12927S = 258;
    /* renamed from: T */
    private static final int f12928T = 259;
    @UsedByReflection
    public static final int TAG_SOFTWARE = 305;
    /* renamed from: U */
    private static final int f12929U = 262;
    /* renamed from: V */
    private static final int f12930V = 277;
    /* renamed from: W */
    private static final int f12931W = 278;
    /* renamed from: X */
    private static final int f12932X = 282;
    /* renamed from: Y */
    private static final int f12933Y = 283;
    /* renamed from: Z */
    private static final int f12934Z = 284;
    /* renamed from: a */
    public static final int f12935a = 256;
    /* renamed from: aA */
    private static final int f12936aA = 168594;
    /* renamed from: aB */
    private static final int f12937aB = 172032;
    /* renamed from: aC */
    private static final int f12938aC = 172033;
    /* renamed from: aD */
    private static final int f12939aD = 172036;
    /* renamed from: aE */
    private static final int f12940aE = 172555;
    /* renamed from: aF */
    private static final int f12941aF = 172556;
    /* renamed from: aG */
    private static final int f12942aG = 172558;
    /* renamed from: aH */
    private static final int f12943aH = 172559;
    /* renamed from: aI */
    private static final int f12944aI = 172560;
    /* renamed from: aJ */
    private static final int f12945aJ = 172564;
    /* renamed from: aK */
    private static final int f12946aK = 172565;
    /* renamed from: aL */
    private static final int f12947aL = 172567;
    /* renamed from: aM */
    private static final int f12948aM = 172800;
    /* renamed from: aN */
    private static final int f12949aN = 172801;
    /* renamed from: aO */
    private static final int f12950aO = 172802;
    /* renamed from: aP */
    private static final int f12951aP = 173057;
    /* renamed from: aQ */
    private static final int f12952aQ = 173058;
    /* renamed from: aR */
    private static final int f12953aR = 173060;
    /* renamed from: aS */
    private static final int f12954aS = 173062;
    /* renamed from: aT */
    private static final int f12955aT = 173063;
    /* renamed from: aU */
    private static final int f12956aU = 173064;
    /* renamed from: aV */
    private static final int f12957aV = 173065;
    /* renamed from: aW */
    private static final int f12958aW = 173066;
    /* renamed from: aX */
    private static final int f12959aX = 173067;
    /* renamed from: aY */
    private static final int f12960aY = 173088;
    /* renamed from: aZ */
    private static final int f12961aZ = 262144;
    /* renamed from: aa */
    private static final int f12962aa = 296;
    /* renamed from: ab */
    private static final int f12963ab = FrameType.ELEMENT_RGBA8888;
    /* renamed from: ac */
    private static final int f12964ac = 315;
    /* renamed from: ad */
    private static final int f12965ad = 318;
    /* renamed from: ae */
    private static final int f12966ae = 319;
    /* renamed from: af */
    private static final int f12967af = 529;
    /* renamed from: ag */
    private static final int f12968ag = 530;
    /* renamed from: ah */
    private static final int f12969ah = 531;
    /* renamed from: ai */
    private static final int f12970ai = 532;
    /* renamed from: aj */
    private static final int f12971aj = 33432;
    /* renamed from: ak */
    private static final int f12972ak = 165922;
    /* renamed from: al */
    private static final int f12973al = 165924;
    /* renamed from: am */
    private static final int f12974am = 165928;
    /* renamed from: an */
    private static final int f12975an = 167936;
    /* renamed from: ao */
    private static final int f12976ao = 167939;
    /* renamed from: ap */
    private static final int f12977ap = 167940;
    /* renamed from: aq */
    private static final int f12978aq = 168193;
    /* renamed from: ar */
    private static final int f12979ar = 168194;
    /* renamed from: as */
    private static final int f12980as = 168451;
    /* renamed from: at */
    private static final int f12981at = 168453;
    /* renamed from: au */
    private static final int f12982au = 168455;
    /* renamed from: av */
    private static final int f12983av = 168456;
    /* renamed from: aw */
    private static final int f12984aw = 168468;
    /* renamed from: ax */
    private static final int f12985ax = 168582;
    /* renamed from: ay */
    private static final int f12986ay = 168592;
    /* renamed from: az */
    private static final int f12987az = 168593;
    /* renamed from: b */
    public static final int f12988b = 257;
    /* renamed from: ba */
    private static final int f12989ba = 262152;
    /* renamed from: bb */
    private static final int f12990bb = 262153;
    /* renamed from: bc */
    private static final int f12991bc = 262154;
    /* renamed from: bd */
    private static final int f12992bd = 262155;
    /* renamed from: be */
    private static final int f12993be = 262156;
    /* renamed from: bf */
    private static final int f12994bf = 262157;
    /* renamed from: bg */
    private static final int f12995bg = 262158;
    /* renamed from: bh */
    private static final int f12996bh = 262159;
    /* renamed from: bi */
    private static final int f12997bi = 262162;
    /* renamed from: bj */
    private static final int f12998bj = 262163;
    /* renamed from: bk */
    private static final int f12999bk = 262164;
    /* renamed from: bl */
    private static final int f13000bl = 262167;
    /* renamed from: bm */
    private static final int f13001bm = 262168;
    /* renamed from: bn */
    private static final int f13002bn = 262169;
    /* renamed from: bo */
    private static final int f13003bo = 262170;
    /* renamed from: bp */
    private static final int f13004bp = 262171;
    /* renamed from: bq */
    private static final int f13005bq = 262172;
    /* renamed from: br */
    private static final int f13006br = 262174;
    /* renamed from: bs */
    private static final int f13007bs = 196609;
    /* renamed from: bt */
    private static final int f13008bt = 196610;
    /* renamed from: bu */
    private static HashSet f13009bu;
    /* renamed from: bv */
    private static HashSet f13010bv;
    /* renamed from: bw */
    private static final Long f13011bw;
    /* renamed from: bx */
    private static final ByteOrder f13012bx = ByteOrder.BIG_ENDIAN;
    /* renamed from: c */
    public static final int f13013c = MediaDecoder.ROTATE_90_LEFT;
    /* renamed from: d */
    public static final int f13014d = 271;
    /* renamed from: e */
    public static final int f13015e = 272;
    /* renamed from: f */
    public static final int f13016f = 273;
    /* renamed from: g */
    public static final int f13017g = 274;
    /* renamed from: h */
    public static final int f13018h = 279;
    /* renamed from: i */
    public static final int f13019i = 306;
    /* renamed from: j */
    public static final int f13020j = 34665;
    /* renamed from: k */
    public static final int f13021k = 34853;
    /* renamed from: l */
    public static final int f13022l = 66049;
    /* renamed from: m */
    public static final int f13023m = 66050;
    /* renamed from: n */
    public static final int f13024n = 164506;
    /* renamed from: o */
    public static final int f13025o = 164509;
    /* renamed from: p */
    public static final int f13026p = 165927;
    /* renamed from: q */
    public static final int f13027q = 168449;
    /* renamed from: r */
    public static final int f13028r = 168450;
    /* renamed from: s */
    public static final int f13029s = 168452;
    /* renamed from: t */
    public static final int f13030t = 168454;
    /* renamed from: u */
    public static final int f13031u = 168457;
    /* renamed from: v */
    public static final int f13032v = 168458;
    /* renamed from: w */
    public static final int f13033w = 168572;
    /* renamed from: x */
    public static final int f13034x = 172034;
    /* renamed from: y */
    public static final int f13035y = 172035;
    /* renamed from: z */
    public static final int f13036z = 172037;
    /* renamed from: N */
    public int f13037N = 0;
    /* renamed from: P */
    public ist f13038P = new ist(f13012bx);
    /* renamed from: Q */
    public final DateFormat f13039Q = new SimpleDateFormat("yyyy:MM:dd");
    /* renamed from: R */
    public final Calendar f13040R = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    /* renamed from: by */
    private final DateFormat f13041by = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    /* renamed from: bz */
    private SparseIntArray f13042bz = null;

    static {
        HashSet hashSet = new HashSet();
        f13009bu = hashSet;
        hashSet.add(Short.valueOf((short) f13021k));
        f13009bu.add(Short.valueOf((short) f13020j));
        f13009bu.add(Short.valueOf((short) f13022l));
        f13009bu.add(Short.valueOf((short) f13036z));
        f13009bu.add(Short.valueOf((short) f13016f));
        hashSet = new HashSet(f13009bu);
        f13010bv = hashSet;
        hashSet.add(Short.valueOf((short) -1));
        f13010bv.add(Short.valueOf((short) f13023m));
        f13010bv.add(Short.valueOf((short) f13018h));
        Long valueOf = Long.valueOf(100);
        f12926O = valueOf;
        f13011bw = valueOf;
    }

    @UsedByReflection
    public ExifInterface() {
        this.f13039Q.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* renamed from: a */
    public final boolean mo12674a(int i, long j, TimeZone timeZone) {
        if (i != f13019i && i != f12977ap && i != f12976ao) {
            return false;
        }
        this.f13041by.setTimeZone(timeZone);
        ite a = mo12668a(i, this.f13041by.format(Long.valueOf(j)));
        if (a == null) {
            return false;
        }
        mo12669a(a);
        return true;
    }

    /* renamed from: a */
    public final ite mo12668a(int i, Object obj) {
        int i2 = 0;
        int i3 = i >>> 16;
        int i4 = mo12667a().get(i);
        if (i4 == 0 || obj == null) {
            return null;
        }
        boolean z;
        short h = m8591h(i4);
        char c = (char) i4;
        if (c != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!m8585a(i4, i3)) {
            return null;
        }
        ite ite = new ite((short) i, h, c, i3, z);
        if (obj != null) {
            int[] iArr;
            int i5;
            if (obj instanceof Short) {
                i2 = ite.mo8989c((char) ((Short) obj).shortValue());
            } else if (obj instanceof String) {
                i2 = ite.mo8982a((String) obj);
            } else if (obj instanceof int[]) {
                i2 = ite.mo8984a((int[]) obj);
            } else if (obj instanceof long[]) {
                i2 = ite.mo8985a((long[]) obj);
            } else if (obj instanceof iqn) {
                i2 = ite.mo8986a(new iqn[]{(iqn) obj});
            } else if (obj instanceof iqn[]) {
                i2 = ite.mo8986a((iqn[]) obj);
            } else if (obj instanceof byte[]) {
                i2 = ite.mo8983a((byte[]) obj);
            } else if (obj instanceof Integer) {
                i2 = ite.mo8989c(((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                i2 = ite.mo8985a(new long[]{((Long) obj).longValue()});
            } else if (obj instanceof Byte) {
                i2 = ite.mo8983a(new byte[]{((Byte) obj).byteValue()});
            } else if (obj instanceof Short[]) {
                Short[] shArr = (Short[]) obj;
                iArr = new int[shArr.length];
                for (i5 = 0; i5 < shArr.length; i5++) {
                    char shortValue;
                    Short sh = shArr[i5];
                    if (sh != null) {
                        shortValue = (char) sh.shortValue();
                    } else {
                        shortValue = 0;
                    }
                    iArr[i5] = shortValue;
                }
                i2 = ite.mo8984a(iArr);
            } else if (obj instanceof Integer[]) {
                Integer[] numArr = (Integer[]) obj;
                iArr = new int[numArr.length];
                for (i5 = 0; i5 < numArr.length; i5++) {
                    int intValue;
                    Integer num = numArr[i5];
                    if (num != null) {
                        intValue = num.intValue();
                    } else {
                        intValue = 0;
                    }
                    iArr[i5] = intValue;
                }
                i2 = ite.mo8984a(iArr);
            } else if (obj instanceof Long[]) {
                Long[] lArr = (Long[]) obj;
                long[] jArr = new long[lArr.length];
                while (i2 < lArr.length) {
                    long longValue;
                    Long l = lArr[i2];
                    if (l != null) {
                        longValue = l.longValue();
                    } else {
                        longValue = 0;
                    }
                    jArr[i2] = longValue;
                    i2++;
                }
                i2 = ite.mo8985a(jArr);
            } else if (obj instanceof Byte[]) {
                Byte[] bArr = (Byte[]) obj;
                byte[] bArr2 = new byte[bArr.length];
                for (i5 = 0; i5 < bArr.length; i5++) {
                    byte byteValue;
                    Byte b = bArr[i5];
                    if (b != null) {
                        byteValue = b.byteValue();
                    } else {
                        byteValue = (byte) 0;
                    }
                    bArr2[i5] = byteValue;
                }
                i2 = ite.mo8983a(bArr2);
            }
        }
        if (i2 == 0) {
            return null;
        }
        return ite;
    }

    /* renamed from: c */
    public final ite mo12676c(int i) {
        int i2 = mo12667a().get(i);
        if (i2 == 0) {
            return null;
        }
        boolean z;
        short h = m8591h(i2);
        char c = (char) i2;
        if (c != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ite((short) i, h, c, i >>> 16, z);
    }

    /* renamed from: a */
    public static double m8582a(iqn[] iqnArr, String str) {
        try {
            double a = (iqnArr[0].mo8807a() + (iqnArr[1].mo8807a() / 60.0d)) + (iqnArr[2].mo8807a() / 3600.0d);
            if (str.startsWith("S") || str.startsWith("W")) {
                return -a;
            }
            return a;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m8584a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr, 0, 1024);
        while (read != -1) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr, 0, 1024);
        }
    }

    /* renamed from: d */
    public final int mo12677d(int i) {
        if (mo12667a().get(i) == 0) {
            return -1;
        }
        return i >>> 16;
    }

    /* renamed from: a */
    public final OutputStream mo12670a(OutputStream outputStream) {
        if (outputStream != null) {
            return new ikm(new itf(new BufferedOutputStream(outputStream, 65536), this, this.f13038P));
        }
        throw new IllegalArgumentException("Argument is null");
    }

    /* renamed from: a */
    public final OutputStream mo12671a(String str) {
        if (str != null) {
            try {
                return mo12670a(new FileOutputStream(str));
            } catch (FileNotFoundException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException("Argument is null");
    }

    /* renamed from: a */
    private static int m8583a(int[] iArr) {
        if (iArr.length == 0) {
            return 0;
        }
        int[] iArr2 = ith.f7822c;
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 : iArr) {
                if (iArr2[i2] == i3) {
                    i |= 1 << i2;
                    break;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public final ite mo12678e(int i) {
        return m8588b(i, mo12677d(i));
    }

    /* renamed from: b */
    private final ite m8588b(int i, int i2) {
        if (!ite.m4234b(i2)) {
            return null;
        }
        short s = (short) i;
        ith ith = this.f13038P.f7760a[i2];
        if (ith != null) {
            return ith.mo9001a(s);
        }
        return null;
    }

    /* renamed from: a */
    public final SparseIntArray mo12667a() {
        if (this.f13042bz == null) {
            this.f13042bz = new SparseIntArray();
            int a = m8583a(new int[]{0, 1}) << 24;
            SparseIntArray sparseIntArray = (SparseIntArray) jri.m13404b(this.f13042bz);
            int i = a | 131072;
            sparseIntArray.put(f13014d, i);
            int i2 = a | 262144;
            int i3 = i2 | 1;
            sparseIntArray.put(f12935a, i3);
            sparseIntArray.put(f12988b, i3);
            int i4 = a | 196608;
            sparseIntArray.put(f12927S, i4 | 3);
            int i5 = i4 | 1;
            sparseIntArray.put(f12928T, i5);
            sparseIntArray.put(f12929U, i5);
            sparseIntArray.put(f13017g, i5);
            sparseIntArray.put(f12930V, i5);
            sparseIntArray.put(f12934Z, i5);
            sparseIntArray.put(f12968ag, i4 | 2);
            sparseIntArray.put(f12969ah, i5);
            a |= 327680;
            int i6 = a | 1;
            sparseIntArray.put(f12932X, i6);
            sparseIntArray.put(f12933Y, i6);
            sparseIntArray.put(f12962aa, i5);
            sparseIntArray.put(f13016f, i2);
            sparseIntArray.put(f12931W, i3);
            sparseIntArray.put(f13018h, i2);
            sparseIntArray.put(f12963ab, i4 | 768);
            sparseIntArray.put(f12965ad, a | 2);
            i2 = a | 6;
            sparseIntArray.put(f12966ae, i2);
            sparseIntArray.put(f12967af, a | 3);
            sparseIntArray.put(f12970ai, i2);
            sparseIntArray.put(f13019i, i | 20);
            sparseIntArray.put(f13013c, i);
            sparseIntArray.put(f13014d, i);
            sparseIntArray.put(f13015e, i);
            sparseIntArray.put(TAG_SOFTWARE, i);
            sparseIntArray.put(f12964ac, i);
            sparseIntArray.put(f12971aj, i);
            sparseIntArray.put(f13020j, i3);
            sparseIntArray.put(f13021k, i3);
            a = ((m8583a(new int[]{1}) << 24) | 262144) | 1;
            sparseIntArray.put(f13022l, a);
            sparseIntArray.put(f13023m, a);
            a = m8583a(new int[]{2}) << 24;
            i = 458752 | a;
            i2 = i | 4;
            sparseIntArray.put(f12975an, i2);
            sparseIntArray.put(f12937aB, i2);
            i3 = a | 196608;
            i4 = i3 | 1;
            sparseIntArray.put(f12938aC, i4);
            sparseIntArray.put(f12978aq, i2);
            i2 = (327680 | a) | 1;
            sparseIntArray.put(f12979ar, i2);
            i5 = (a | 262144) | 1;
            sparseIntArray.put(f13034x, i5);
            sparseIntArray.put(f13035y, i5);
            sparseIntArray.put(f13033w, i);
            sparseIntArray.put(f12985ax, i);
            i6 = a | 131072;
            sparseIntArray.put(f12939aD, i6 | 13);
            int i7 = i6 | 20;
            sparseIntArray.put(f12976ao, i7);
            sparseIntArray.put(f12977ap, i7);
            sparseIntArray.put(f12986ay, i6);
            sparseIntArray.put(f12987az, i6);
            sparseIntArray.put(f12936aA, i6);
            sparseIntArray.put(f12960aY, i6 | 33);
            sparseIntArray.put(f13024n, i2);
            sparseIntArray.put(f13025o, i2);
            sparseIntArray.put(f12972ak, i4);
            sparseIntArray.put(f12973al, i6);
            sparseIntArray.put(f13026p, i3);
            sparseIntArray.put(f12974am, i);
            a = (a | 655360) | 1;
            sparseIntArray.put(f13027q, a);
            sparseIntArray.put(f13028r, i2);
            sparseIntArray.put(f12980as, a);
            sparseIntArray.put(f13029s, a);
            sparseIntArray.put(f12981at, i2);
            sparseIntArray.put(f13030t, i2);
            sparseIntArray.put(f12982au, i4);
            sparseIntArray.put(f12983av, i4);
            sparseIntArray.put(f13031u, i4);
            sparseIntArray.put(f13032v, i2);
            sparseIntArray.put(f12984aw, i3);
            sparseIntArray.put(f12940aE, i2);
            sparseIntArray.put(f12941aF, i);
            sparseIntArray.put(f12942aG, i2);
            sparseIntArray.put(f12943aH, i2);
            sparseIntArray.put(f12944aI, i4);
            sparseIntArray.put(f12945aJ, i3 | 2);
            sparseIntArray.put(f12946aK, i2);
            sparseIntArray.put(f12947aL, i4);
            a = i | 1;
            sparseIntArray.put(f12948aM, a);
            sparseIntArray.put(f12949aN, a);
            sparseIntArray.put(f12950aO, i);
            sparseIntArray.put(f12951aP, i4);
            sparseIntArray.put(f12952aQ, i4);
            sparseIntArray.put(f12913A, i4);
            sparseIntArray.put(f12953aR, i2);
            sparseIntArray.put(f12914B, i4);
            sparseIntArray.put(f12954aS, i4);
            sparseIntArray.put(f12955aT, i2);
            sparseIntArray.put(f12956aU, i4);
            sparseIntArray.put(f12957aV, i4);
            sparseIntArray.put(f12958aW, i4);
            sparseIntArray.put(f12959aX, i);
            sparseIntArray.put(f12915C, i4);
            sparseIntArray.put(f13036z, i5);
            a = m8583a(new int[]{4}) << 24;
            i = 65536 | a;
            sparseIntArray.put(f12961aZ, i | 4);
            i2 = a | 131072;
            i3 = i2 | 2;
            sparseIntArray.put(f12916D, i3);
            sparseIntArray.put(f12918F, i3);
            i4 = 327680 | a;
            i5 = i4 | 3;
            sparseIntArray.put(f12917E, i5);
            sparseIntArray.put(f12919G, i5);
            sparseIntArray.put(f12920H, i | 1);
            i = i4 | 1;
            sparseIntArray.put(f12921I, i);
            sparseIntArray.put(f12922J, i5);
            sparseIntArray.put(f12989ba, i2);
            sparseIntArray.put(f12990bb, i3);
            sparseIntArray.put(f12991bc, i3);
            sparseIntArray.put(f12992bd, i);
            sparseIntArray.put(f12993be, i3);
            sparseIntArray.put(f12994bf, i);
            sparseIntArray.put(f12995bg, i3);
            sparseIntArray.put(f12996bh, i);
            sparseIntArray.put(f12923K, i3);
            sparseIntArray.put(f12924L, i);
            sparseIntArray.put(f12997bi, i2);
            sparseIntArray.put(f12998bj, i3);
            sparseIntArray.put(f12999bk, i);
            sparseIntArray.put(f13000bl, i3);
            sparseIntArray.put(f13001bm, i);
            sparseIntArray.put(f13002bn, i3);
            sparseIntArray.put(f13003bo, i);
            i = 458752 | a;
            sparseIntArray.put(f13004bp, i);
            sparseIntArray.put(f13005bq, i);
            sparseIntArray.put(f12925M, i2 | 11);
            sparseIntArray.put(f13006br, (a | 196608) | 11);
            a = m8583a(new int[]{3}) << 24;
            sparseIntArray.put(f13007bs, a | 131072);
            sparseIntArray.put(f13008bt, a | 458752);
        }
        jri.m13404b(this.f13042bz);
        return this.f13042bz;
    }

    /* renamed from: a */
    public final Integer mo8965a(int i) {
        int[] b;
        ite b2 = m8588b(i, mo12677d(i));
        if (b2 != null) {
            b = b2.mo8987b();
        } else {
            b = null;
        }
        if (b == null || b.length <= 0) {
            return null;
        }
        return Integer.valueOf(b[0]);
    }

    /* renamed from: b */
    public final iqn mo8966b(int i) {
        iqn[] c = m8589c(i, mo12677d(i));
        if (c == null || c.length == 0) {
            return null;
        }
        return new iqn(c[0]);
    }

    /* renamed from: f */
    public final iqn[] mo12679f(int i) {
        return m8589c(i, mo12677d(i));
    }

    /* renamed from: c */
    private final iqn[] m8589c(int i, int i2) {
        ite b = m8588b(i, i2);
        if (b == null) {
            return null;
        }
        return b.mo8993f();
    }

    @UsedByReflection
    public String getTagStringValue(int i) {
        ite b = m8588b(i, mo12677d(i));
        if (b == null) {
            return null;
        }
        return b.mo8994g();
    }

    /* renamed from: g */
    public static short m8590g(int i) {
        return (short) i;
    }

    /* renamed from: h */
    private static short m8591h(int i) {
        return (i >> 16) & Illuminant.kOther;
    }

    /* renamed from: a */
    public static boolean m8585a(int i, int i2) {
        int i3 = i >>> 24;
        int[] iArr = ith.f7822c;
        int i4 = 0;
        while (i4 < iArr.length) {
            if (i2 == iArr[i4] && ((i3 >> i4) & 1) == 1) {
                return true;
            }
            i4++;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m8586a(short s) {
        return f13009bu.contains(Short.valueOf(s));
    }

    /* renamed from: a */
    public final void mo12672a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                isz isz = new isz(inputStream, new itd(this).f7809a);
                ist ist = new ist(isz.f7783a.f7758b.order());
                for (int a = isz.mo8968a(); a != 5; a = isz.mo8968a()) {
                    ite ite;
                    ith a2;
                    switch (a) {
                        case 0:
                            ist.mo8958a(new ith(isz.f7784b));
                            break;
                        case 1:
                            ite = isz.f7785c;
                            if (ite != null) {
                                if (!ite.mo8995h()) {
                                    int i = ite.f7818g;
                                    if (i < isz.f7783a.f7757a) {
                                        break;
                                    }
                                    isz.f7789g.put(Integer.valueOf(i), new ita(ite, true));
                                    break;
                                }
                                a2 = ist.mo8957a(ite.f7816e);
                                if (a2 == null) {
                                    break;
                                }
                                a2.mo9000a(ite);
                                break;
                            }
                            break;
                        case 2:
                            ite = isz.f7785c;
                            if (ite != null) {
                                if (ite.f7813b == (short) 7) {
                                    isz.mo8970a(ite);
                                }
                                a2 = ist.mo8957a(ite.f7816e);
                                if (a2 == null) {
                                    break;
                                }
                                a2.mo9000a(ite);
                                break;
                            }
                            break;
                        case 3:
                            ite = isz.f7788f;
                            if (ite != null) {
                                a = (int) ite.mo8981a(0);
                            } else {
                                a = 0;
                            }
                            byte[] bArr = new byte[a];
                            if (bArr.length == isz.mo8969a(bArr)) {
                                ist.f7761b = bArr;
                                break;
                            } else {
                                Log.w("CAM_ExifReader", "Failed to read the compressed thumbnail");
                                break;
                            }
                        case 4:
                            ite = isz.f7787e;
                            if (ite != null) {
                                a = (int) ite.mo8981a(0);
                            } else {
                                a = 0;
                            }
                            byte[] bArr2 = new byte[a];
                            if (bArr2.length != isz.mo8969a(bArr2)) {
                                Log.w("CAM_ExifReader", "Failed to read the strip bytes");
                                break;
                            }
                            int i2 = isz.f7786d.f7807a;
                            if (i2 >= ist.f7762c.size()) {
                                for (a = ist.f7762c.size(); a < i2; a++) {
                                    ist.f7762c.add(null);
                                }
                                ist.f7762c.add(bArr2);
                                break;
                            }
                            ist.f7762c.set(i2, bArr2);
                            break;
                        default:
                            break;
                    }
                }
                this.f13038P = ist;
                return;
            } catch (Throwable e) {
                throw new IOException("Invalid exif format : ", e);
            }
        }
        throw new IllegalArgumentException("Argument is null");
    }

    @UsedByReflection
    public void readExif(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        InputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
        mo12672a(bufferedInputStream);
        bufferedInputStream.close();
    }

    /* renamed from: a */
    public final void mo12673a(byte[] bArr) {
        mo12672a(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public final ite mo12669a(ite ite) {
        return this.f13038P.mo8956a(ite);
    }

    /* renamed from: a */
    public static iqn[] m8587a(double d) {
        double abs = Math.abs(d);
        int i = (int) ((abs - ((double) ((int) abs))) * 60.0d);
        long longValue = f13011bw.longValue();
        return new iqn[]{new iqn((long) r2, 1), new iqn((long) i, 1), new iqn((long) ((int) (((abs - ((double) i)) * 60.0d) * ((double) longValue))), f13011bw.longValue())};
    }

    /* renamed from: b */
    public final void mo12675b(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        OutputStream a = mo12670a(outputStream);
        m8584a(inputStream, a);
        a.flush();
        a.close();
    }
}
