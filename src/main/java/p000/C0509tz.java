package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;

/* compiled from: PG */
/* renamed from: tz */
public class C0509tz {
    /* renamed from: a */
    public static void m5942a(String str) {
        if (str == null || str.length() == 0) {
            throw new C0554wb("Empty array name", 4);
        }
    }

    /* renamed from: a */
    public static void m5941a(Object obj) {
        if (obj == null) {
            throw new C0554wb("Parameter must not be null", 4);
        } else if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new C0554wb("Parameter must not be null or empty", 4);
        }
    }

    /* renamed from: b */
    public static void m5946b(String str) {
        if (str == null || str.length() == 0) {
            throw new C0554wb("Empty property name", 4);
        }
    }

    /* renamed from: c */
    public static void m5947c(String str) {
        if (str == null || str.length() == 0) {
            throw new C0554wb("Empty schema namespace URI", 4);
        }
    }

    /* renamed from: d */
    public static boolean m5948d(String str) {
        if (str == null || str.length() == 0) {
            throw new C0554wb("Empty convert-string", 5);
        }
        Object toLowerCase = str.toLowerCase();
        try {
            if (Integer.parseInt(toLowerCase) != 0) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            if ("true".equals(toLowerCase) || "t".equals(toLowerCase) || "on".equals(toLowerCase) || "yes".equals(toLowerCase)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: e */
    public static C0551vz m5949e(String str) {
        int i = 1;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            throw new C0554wb("Empty convert-string", 5);
        }
        int a;
        C0551vz c0774wq = new C0774wq();
        C0509tz.m5941a((Object) str);
        C0565wn c0565wn = new C0565wn(str);
        int i3 = c0565wn.mo11482a(0) == 'T' ? 1 : (c0565wn.f9973a.length() < 2 || c0565wn.mo11482a(1) != ':') ? c0565wn.f9973a.length() >= 3 ? c0565wn.mo11482a(2) != ':' ? 0 : 1 : 0 : 1;
        if (i3 == 0) {
            if (c0565wn.mo11482a(0) == '-') {
                c0565wn.mo11485c();
            }
            a = c0565wn.mo11483a("Invalid year in date string", 9999);
            if (!c0565wn.mo11484b() || c0565wn.mo11481a() == '-') {
                if (c0565wn.mo11482a(0) == '-') {
                    a = -a;
                }
                c0774wq.mo11431g(a);
                if (!c0565wn.mo11484b()) {
                    return c0774wq;
                }
                c0565wn.mo11485c();
                a = c0565wn.mo11483a("Invalid month in date string", 12);
                if (!c0565wn.mo11484b() || c0565wn.mo11481a() == '-') {
                    c0774wq.mo11425d(a);
                    if (!c0565wn.mo11484b()) {
                        return c0774wq;
                    }
                    c0565wn.mo11485c();
                    a = c0565wn.mo11483a("Invalid day in date string", 31);
                    if (!c0565wn.mo11484b() || c0565wn.mo11481a() == 'T') {
                        c0774wq.mo11418a(a);
                        if (!c0565wn.mo11484b()) {
                            return c0774wq;
                        }
                    }
                    throw new C0554wb("Invalid date string, after day", 5);
                }
                throw new C0554wb("Invalid date string, after month", 5);
            }
            throw new C0554wb("Invalid date string, after year", 5);
        }
        c0774wq.mo11425d(1);
        c0774wq.mo11418a(1);
        if (c0565wn.mo11481a() == 'T') {
            c0565wn.mo11485c();
        } else if (i3 == 0) {
            throw new C0554wb("Invalid date string, missing 'T' after date", 5);
        }
        a = c0565wn.mo11483a("Invalid hour in date string", 23);
        if (c0565wn.mo11481a() != ':') {
            throw new C0554wb("Invalid date string, after hour", 5);
        }
        c0774wq.mo11421b(a);
        c0565wn.mo11485c();
        a = c0565wn.mo11483a("Invalid minute in date string", 59);
        if (!c0565wn.mo11484b() || c0565wn.mo11481a() == ':' || c0565wn.mo11481a() == 'Z' || c0565wn.mo11481a() == '+' || c0565wn.mo11481a() == '-') {
            c0774wq.mo11423c(a);
            if (c0565wn.mo11481a() == ':') {
                c0565wn.mo11485c();
                a = c0565wn.mo11483a("Invalid whole seconds in date string", 59);
                if (!c0565wn.mo11484b() || c0565wn.mo11481a() == '.' || c0565wn.mo11481a() == 'Z' || c0565wn.mo11481a() == '+' || c0565wn.mo11481a() == '-') {
                    c0774wq.mo11429f(a);
                    if (c0565wn.mo11481a() == '.') {
                        c0565wn.mo11485c();
                        a = c0565wn.f9974b;
                        i3 = c0565wn.mo11483a("Invalid fractional seconds in date string", 999999999);
                        if (c0565wn.mo11481a() == 'Z' || c0565wn.mo11481a() == '+' || c0565wn.mo11481a() == '-') {
                            a = c0565wn.f9974b - a;
                            while (a > 9) {
                                i3 /= 10;
                                a--;
                            }
                            while (a < 9) {
                                i3 *= 10;
                                a++;
                            }
                            c0774wq.mo11427e(i3);
                        } else {
                            throw new C0554wb("Invalid date string, after fractional second", 5);
                        }
                    }
                }
                throw new C0554wb("Invalid date string, after whole seconds", 5);
            }
            if (c0565wn.mo11481a() == 'Z') {
                c0565wn.mo11485c();
                a = 0;
                i = 0;
            } else if (c0565wn.mo11484b()) {
                if (c0565wn.mo11481a() != '+') {
                    if (c0565wn.mo11481a() == '-') {
                        i = -1;
                    } else {
                        throw new C0554wb("Time zone must begin with 'Z', '+', or '-'", 5);
                    }
                }
                c0565wn.mo11485c();
                i2 = c0565wn.mo11483a("Invalid time zone hour in date string", 23);
                if (c0565wn.mo11481a() != ':') {
                    throw new C0554wb("Invalid date string, after time zone hour", 5);
                }
                c0565wn.mo11485c();
                a = c0565wn.mo11483a("Invalid time zone minute in date string", 59);
            } else {
                a = 0;
                i = 0;
            }
            c0774wq.mo11419a(new SimpleTimeZone((((a * 60) * 1000) + ((i2 * 3600) * 1000)) * i, ""));
            if (!c0565wn.mo11484b()) {
                return c0774wq;
            }
            throw new C0554wb("Invalid date string, extra chars at end", 5);
        }
        throw new C0554wb("Invalid date string, after minute", 5);
    }

    /* renamed from: f */
    public static double m5950f(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Double.parseDouble(str);
                }
            } catch (NumberFormatException e) {
                throw new C0554wb("Invalid double string", 5);
            }
        }
        throw new C0554wb("Empty convert-string", 5);
    }

    /* renamed from: g */
    public static int m5951g(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (str.startsWith("0x")) {
                        return Integer.parseInt(str.substring(2), 16);
                    }
                    return Integer.parseInt(str);
                }
            } catch (NumberFormatException e) {
                throw new C0554wb("Invalid integer string", 5);
            }
        }
        throw new C0554wb("Empty convert-string", 5);
    }

    /* renamed from: h */
    public static long m5952h(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (str.startsWith("0x")) {
                        return Long.parseLong(str.substring(2), 16);
                    }
                    return Long.parseLong(str);
                }
            } catch (NumberFormatException e) {
                throw new C0554wb("Invalid long string", 5);
            }
        }
        throw new C0554wb("Empty convert-string", 5);
    }

    /* renamed from: a */
    public static byte[] m5943a(byte b) {
        int i = b & Illuminant.kOther;
        if (i >= 128) {
            if (i == ScriptIntrinsicBLAS.RsBlas_ctrmm || i == 141 || i == 143 || i == 144 || i == 157) {
                try {
                    return new byte[]{(byte) 32};
                } catch (UnsupportedEncodingException e) {
                }
            } else {
                return new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            }
        }
        return new byte[]{b};
    }

    /* renamed from: i */
    public static byte[] m5953i(String str) {
        try {
            return C0560wi.m6191a(str.getBytes());
        } catch (Throwable th) {
            C0554wb c0554wb = new C0554wb("Invalid base64 string", 5, th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x03c4 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0182  */
    /* renamed from: a */
    public static p000.C0577xd m5940a(java.lang.String r11, java.lang.String r12) {
        /*
        r10 = 0;
        r9 = 93;
        r8 = 0;
        r7 = 1;
        r6 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r11 == 0) goto L_0x000b;
    L_0x0009:
        if (r12 != 0) goto L_0x0014;
    L_0x000b:
        r0 = new wb;
        r1 = "Parameter must not be null";
        r2 = 4;
        r0.<init>(r1, r2);
        throw r0;
    L_0x0014:
        r2 = new xd;
        r2.<init>();
        r3 = new xc;
        r3.<init>();
        r3.f10008a = r12;
    L_0x0020:
        r0 = r3.f10012e;
        r1 = r3.f10008a;
        r1 = r1.length();
        if (r0 >= r1) goto L_0x0041;
    L_0x002a:
        r0 = "/[*";
        r1 = r3.f10008a;
        r4 = r3.f10012e;
        r1 = r1.charAt(r4);
        r0 = r0.indexOf(r1);
        if (r0 >= 0) goto L_0x0041;
    L_0x003a:
        r0 = r3.f10012e;
        r0 = r0 + 1;
        r3.f10012e = r0;
        goto L_0x0020;
    L_0x0041:
        r0 = r3.f10012e;
        r1 = r3.f10011d;
        if (r0 != r1) goto L_0x004f;
    L_0x0047:
        r0 = new wb;
        r1 = "Empty initial XMPPath step";
        r0.<init>(r1, r6);
        throw r0;
    L_0x004f:
        r4 = r3.f10008a;
        r0 = r4.substring(r1, r0);
        r0 = p000.C0509tz.m5945b(r11, r0);
        r1 = p000.C0557we.f9955a;
        r1 = r1.mo11460a(r0);
        if (r1 != 0) goto L_0x0352;
    L_0x0061:
        r1 = new xe;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1.<init>(r11, r4);
        r2.mo11529a(r1);
        r1 = new xe;
        r1.<init>(r0, r7);
        r2.mo11529a(r1);
    L_0x0073:
        r0 = r3.f10012e;
        r1 = r12.length();
        if (r0 >= r1) goto L_0x03cc;
    L_0x007b:
        r0 = r3.f10012e;
        r3.f10011d = r0;
        r0 = r3.f10011d;
        r0 = r12.charAt(r0);
        r1 = 47;
        if (r0 != r1) goto L_0x009f;
    L_0x0089:
        r0 = r3.f10011d;
        r0 = r0 + 1;
        r3.f10011d = r0;
        r0 = r3.f10011d;
        r1 = r12.length();
        if (r0 < r1) goto L_0x009f;
    L_0x0097:
        r0 = new wb;
        r1 = "Empty XMPPath segment";
        r0.<init>(r1, r6);
        throw r0;
    L_0x009f:
        r0 = r3.f10011d;
        r0 = r12.charAt(r0);
        r1 = 42;
        if (r0 != r1) goto L_0x00c9;
    L_0x00a9:
        r0 = r3.f10011d;
        r0 = r0 + 1;
        r3.f10011d = r0;
        r0 = r3.f10011d;
        r1 = r12.length();
        if (r0 >= r1) goto L_0x00c1;
    L_0x00b7:
        r0 = r3.f10011d;
        r0 = r12.charAt(r0);
        r1 = 91;
        if (r0 == r1) goto L_0x00c9;
    L_0x00c1:
        r0 = new wb;
        r1 = "Missing '[' after '*'";
        r0.<init>(r1, r6);
        throw r0;
    L_0x00c9:
        r0 = r3.f10011d;
        r3.f10012e = r0;
        r0 = r12.charAt(r0);
        r1 = 91;
        if (r0 == r1) goto L_0x01ea;
    L_0x00d5:
        r0 = r3.f10011d;
        r3.f10009b = r0;
    L_0x00d9:
        r0 = r3.f10012e;
        r1 = r3.f10008a;
        r1 = r1.length();
        if (r0 >= r1) goto L_0x00fa;
    L_0x00e3:
        r0 = "/[*";
        r1 = r3.f10008a;
        r4 = r3.f10012e;
        r1 = r1.charAt(r4);
        r0 = r0.indexOf(r1);
        if (r0 >= 0) goto L_0x00fa;
    L_0x00f3:
        r0 = r3.f10012e;
        r0 = r0 + 1;
        r3.f10012e = r0;
        goto L_0x00d9;
    L_0x00fa:
        r1 = r3.f10012e;
        r3.f10010c = r1;
        r4 = r3.f10011d;
        if (r1 != r4) goto L_0x010a;
    L_0x0102:
        r0 = new wb;
        r1 = "Empty XMPPath segment";
        r0.<init>(r1, r6);
        throw r0;
    L_0x010a:
        r0 = new xe;
        r5 = r3.f10008a;
        r1 = r5.substring(r4, r1);
        r0.<init>(r1, r7);
        r1 = r0;
    L_0x0116:
        r0 = r1.f10015b;
        if (r0 == r7) goto L_0x019c;
    L_0x011a:
        r4 = 6;
        if (r0 == r4) goto L_0x0122;
    L_0x011d:
        r2.mo11529a(r1);
        goto L_0x0073;
    L_0x0122:
        r0 = r1.f10014a;
        r0 = r0.charAt(r7);
        r4 = 64;
        if (r0 != r4) goto L_0x015d;
    L_0x012c:
        r0 = r1.f10014a;
        r4 = 2;
        r0 = r0.substring(r4);
        r0 = java.lang.String.valueOf(r0);
        r4 = "[?";
        r5 = r0.length();
        if (r5 != 0) goto L_0x0158;
    L_0x013f:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x0144:
        r1.f10014a = r0;
        r0 = r1.f10014a;
        r4 = "[?xml:lang=";
        r0 = r0.startsWith(r4);
        if (r0 != 0) goto L_0x015d;
    L_0x0150:
        r0 = new wb;
        r1 = "Only xml:lang allowed with '@'";
        r0.<init>(r1, r6);
        throw r0;
    L_0x0158:
        r0 = r4.concat(r0);
        goto L_0x0144;
    L_0x015d:
        r0 = r1.f10014a;
        r0 = r0.charAt(r7);
        r4 = 63;
        if (r0 != r4) goto L_0x011d;
    L_0x0167:
        r0 = r3.f10009b;
        r0 = r0 + 1;
        r3.f10009b = r0;
        r0 = 5;
        r1.f10015b = r0;
    L_0x0170:
        r0 = r3.f10008a;
        r4 = r3.f10009b;
        r5 = r3.f10010c;
        r0 = r0.substring(r4, r5);
        r4 = 58;
        r4 = r0.indexOf(r4);
        if (r4 <= 0) goto L_0x03c4;
    L_0x0182:
        r0 = r0.substring(r8, r4);
        r4 = p000.C0567wp.m6226c(r0);
        if (r4 == 0) goto L_0x03c4;
    L_0x018c:
        r4 = p000.C0557we.f9955a;
        r0 = r4.mo11462c(r0);
        if (r0 != 0) goto L_0x011d;
    L_0x0194:
        r0 = new wb;
        r1 = "Unknown namespace prefix for qualified name";
        r0.<init>(r1, r6);
        throw r0;
    L_0x019c:
        r0 = r1.f10014a;
        r0 = r0.charAt(r8);
        r4 = 64;
        if (r0 != r4) goto L_0x01d6;
    L_0x01a6:
        r0 = r1.f10014a;
        r0 = r0.substring(r7);
        r0 = java.lang.String.valueOf(r0);
        r4 = "?";
        r5 = r0.length();
        if (r5 != 0) goto L_0x01d1;
    L_0x01b8:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x01bd:
        r1.f10014a = r0;
        r0 = "?xml:lang";
        r4 = r1.f10014a;
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x01d6;
    L_0x01c9:
        r0 = new wb;
        r1 = "Only xml:lang allowed with '@'";
        r0.<init>(r1, r6);
        throw r0;
    L_0x01d1:
        r0 = r4.concat(r0);
        goto L_0x01bd;
    L_0x01d6:
        r0 = r1.f10014a;
        r0 = r0.charAt(r8);
        r4 = 63;
        if (r0 != r4) goto L_0x0170;
    L_0x01e0:
        r0 = r3.f10009b;
        r0 = r0 + 1;
        r3.f10009b = r0;
        r0 = 2;
        r1.f10015b = r0;
        goto L_0x0170;
    L_0x01ea:
        r0 = r3.f10012e;
        r0 = r0 + 1;
        r3.f10012e = r0;
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        r1 = 48;
        if (r0 >= r1) goto L_0x0315;
    L_0x01fc:
        r0 = r3.f10012e;
        r1 = r3.f10008a;
        r1 = r1.length();
        if (r0 >= r1) goto L_0x0223;
    L_0x0206:
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        if (r0 == r9) goto L_0x0223;
    L_0x0210:
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        r1 = 61;
        if (r0 == r1) goto L_0x0223;
    L_0x021c:
        r0 = r3.f10012e;
        r0 = r0 + 1;
        r3.f10012e = r0;
        goto L_0x01fc;
    L_0x0223:
        r0 = r3.f10012e;
        r1 = r3.f10008a;
        r1 = r1.length();
        if (r0 < r1) goto L_0x0235;
    L_0x022d:
        r0 = new wb;
        r1 = "Missing ']' or '=' for array index";
        r0.<init>(r1, r6);
        throw r0;
    L_0x0235:
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        if (r0 != r9) goto L_0x0290;
    L_0x023f:
        r0 = "[last()";
        r1 = r3.f10008a;
        r4 = r3.f10011d;
        r5 = r3.f10012e;
        r1 = r1.substring(r4, r5);
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0259;
    L_0x0251:
        r0 = new wb;
        r1 = "Invalid non-numeric array index";
        r0.<init>(r1, r6);
        throw r0;
    L_0x0259:
        r0 = new xe;
        r1 = 4;
        r0.<init>(r10, r1);
    L_0x025f:
        r1 = r3.f10012e;
        r4 = r3.f10008a;
        r4 = r4.length();
        if (r1 >= r4) goto L_0x0273;
    L_0x0269:
        r1 = r3.f10008a;
        r4 = r3.f10012e;
        r1 = r1.charAt(r4);
        if (r1 == r9) goto L_0x027b;
    L_0x0273:
        r0 = new wb;
        r1 = "Missing ']' for array index";
        r0.<init>(r1, r6);
        throw r0;
    L_0x027b:
        r1 = r3.f10012e;
        r1 = r1 + 1;
        r3.f10012e = r1;
        r1 = r3.f10008a;
        r4 = r3.f10011d;
        r5 = r3.f10012e;
        r1 = r1.substring(r4, r5);
        r0.f10014a = r1;
        r1 = r0;
        goto L_0x0116;
    L_0x0290:
        r0 = r3.f10011d;
        r0 = r0 + 1;
        r3.f10009b = r0;
        r0 = r3.f10012e;
        r3.f10010c = r0;
        r0 = r0 + 1;
        r3.f10012e = r0;
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        r1 = 39;
        if (r0 == r1) goto L_0x02b6;
    L_0x02aa:
        r1 = 34;
        if (r0 == r1) goto L_0x02b6;
    L_0x02ae:
        r0 = new wb;
        r1 = "Invalid quote in array selector";
        r0.<init>(r1, r6);
        throw r0;
    L_0x02b6:
        r1 = r3.f10012e;
        r1 = r1 + 1;
        r3.f10012e = r1;
    L_0x02bc:
        r1 = r3.f10012e;
        r4 = r3.f10008a;
        r4 = r4.length();
        if (r1 >= r4) goto L_0x02f5;
    L_0x02c6:
        r1 = r3.f10008a;
        r4 = r3.f10012e;
        r1 = r1.charAt(r4);
        if (r1 != r0) goto L_0x02ee;
    L_0x02d0:
        r1 = r3.f10012e;
        r1 = r1 + 1;
        r4 = r3.f10008a;
        r4 = r4.length();
        if (r1 >= r4) goto L_0x02f5;
    L_0x02dc:
        r1 = r3.f10008a;
        r4 = r3.f10012e;
        r4 = r4 + 1;
        r1 = r1.charAt(r4);
        if (r1 != r0) goto L_0x02f5;
    L_0x02e8:
        r1 = r3.f10012e;
        r1 = r1 + 1;
        r3.f10012e = r1;
    L_0x02ee:
        r1 = r3.f10012e;
        r1 = r1 + 1;
        r3.f10012e = r1;
        goto L_0x02bc;
    L_0x02f5:
        r0 = r3.f10012e;
        r1 = r3.f10008a;
        r1 = r1.length();
        if (r0 < r1) goto L_0x0307;
    L_0x02ff:
        r0 = new wb;
        r1 = "No terminating quote for array selector";
        r0.<init>(r1, r6);
        throw r0;
    L_0x0307:
        r0 = r3.f10012e;
        r0 = r0 + 1;
        r3.f10012e = r0;
        r0 = new xe;
        r1 = 6;
        r0.<init>(r10, r1);
        goto L_0x025f;
    L_0x0315:
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        r1 = 57;
        if (r0 > r1) goto L_0x01fc;
    L_0x0321:
        r0 = r3.f10012e;
        r1 = r3.f10008a;
        r1 = r1.length();
        if (r0 >= r1) goto L_0x034a;
    L_0x032b:
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        r1 = 48;
        if (r0 < r1) goto L_0x034a;
    L_0x0337:
        r0 = r3.f10008a;
        r1 = r3.f10012e;
        r0 = r0.charAt(r1);
        r1 = 57;
        if (r0 > r1) goto L_0x034a;
    L_0x0343:
        r0 = r3.f10012e;
        r0 = r0 + 1;
        r3.f10012e = r0;
        goto L_0x0321;
    L_0x034a:
        r0 = new xe;
        r1 = 3;
        r0.<init>(r10, r1);
        goto L_0x025f;
    L_0x0352:
        r0 = new xe;
        r4 = r1.mo11541b();
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0.<init>(r4, r5);
        r2.mo11529a(r0);
        r0 = new xe;
        r4 = r1.mo11541b();
        r5 = r1.mo11543d();
        r4 = p000.C0509tz.m5945b(r4, r5);
        r0.<init>(r4, r7);
        r0.f10016c = r7;
        r4 = r1.mo11540a();
        r4 = r4.f10018a;
        r0.f10017d = r4;
        r2.mo11529a(r0);
        r0 = r1.mo11540a();
        r4 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r0.mo11535b(r4);
        if (r0 == 0) goto L_0x03a1;
    L_0x038a:
        r0 = new xe;
        r4 = "[?xml:lang='x-default']";
        r5 = 5;
        r0.<init>(r4, r5);
        r0.f10016c = r7;
        r1 = r1.mo11540a();
        r1 = r1.f10018a;
        r0.f10017d = r1;
        r2.mo11529a(r0);
        goto L_0x0073;
    L_0x03a1:
        r0 = r1.mo11540a();
        r4 = 512; // 0x200 float:7.175E-43 double:2.53E-321;
        r0 = r0.mo11535b(r4);
        if (r0 == 0) goto L_0x0073;
    L_0x03ad:
        r0 = new xe;
        r4 = "[1]";
        r5 = 3;
        r0.<init>(r4, r5);
        r0.f10016c = r7;
        r1 = r1.mo11540a();
        r1 = r1.f10018a;
        r0.f10017d = r1;
        r2.mo11529a(r0);
        goto L_0x0073;
    L_0x03c4:
        r0 = new wb;
        r1 = "Ill-formed qualified name";
        r0.<init>(r1, r6);
        throw r0;
    L_0x03cc:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: tz.a(java.lang.String, java.lang.String):xd");
    }

    /* renamed from: a */
    public void mo11196a() {
    }

    /* renamed from: a */
    public static String m5939a(C0551vz c0551vz) {
        StringBuffer stringBuffer = new StringBuffer();
        DecimalFormat decimalFormat = new DecimalFormat("0000", new DecimalFormatSymbols(Locale.ENGLISH));
        stringBuffer.append(decimalFormat.format((long) c0551vz.mo11433i()));
        if (c0551vz.mo11426e() == 0) {
            return stringBuffer.toString();
        }
        decimalFormat.applyPattern("'-'00");
        stringBuffer.append(decimalFormat.format((long) c0551vz.mo11426e()));
        if (c0551vz.mo11420b() == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append(decimalFormat.format((long) c0551vz.mo11420b()));
        if (!(c0551vz.mo11422c() == 0 && c0551vz.mo11424d() == 0 && c0551vz.mo11430g() == 0 && c0551vz.mo11428f() == 0 && (c0551vz.mo11432h() == null || c0551vz.mo11432h().getRawOffset() == 0))) {
            int g;
            int f;
            stringBuffer.append('T');
            decimalFormat.applyPattern("00");
            stringBuffer.append(decimalFormat.format((long) c0551vz.mo11422c()));
            stringBuffer.append(':');
            stringBuffer.append(decimalFormat.format((long) c0551vz.mo11424d()));
            if (!(c0551vz.mo11430g() == 0 && c0551vz.mo11428f() == 0)) {
                g = c0551vz.mo11430g();
                f = c0551vz.mo11428f();
                decimalFormat.applyPattern(":00.#########");
                stringBuffer.append(decimalFormat.format((((double) f) / 1.0E9d) + ((double) g)));
            }
            if (c0551vz.mo11432h() != null) {
                g = c0551vz.mo11432h().getOffset(c0551vz.mo11417a().getTimeInMillis());
                if (g == 0) {
                    stringBuffer.append('Z');
                } else {
                    f = Math.abs((g % 3600000) / 60000);
                    decimalFormat.applyPattern("+00;-00");
                    stringBuffer.append(decimalFormat.format((long) (g / 3600000)));
                    decimalFormat.applyPattern(":00");
                    stringBuffer.append(decimalFormat.format((long) f));
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static byte[] m5944a(C0776wt c0776wt, C0783xk c0783xk) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        if (c0783xk == null) {
            c0783xk = new C0783xk();
        }
        if (c0783xk.mo11535b(4096)) {
            c0776wt.f22365a.mo11510j();
        }
        C0575xb c0575xb = new C0575xb();
        try {
            int i;
            String valueOf;
            int i2;
            c0575xb.f10003b = new C0562wk(byteArrayOutputStream);
            c0575xb.f10004c = new OutputStreamWriter(c0575xb.f10003b, c0783xk.mo14462d());
            c0575xb.f10002a = c0776wt;
            c0575xb.f10005d = c0783xk;
            c0575xb.f10007f = c0783xk.f22371b;
            c0575xb.f10004c = new OutputStreamWriter(c0575xb.f10003b, c0783xk.mo14462d());
            if ((c0575xb.f10005d.mo14459b() | c0575xb.f10005d.mo14460c()) != 0) {
                c0575xb.f10006e = 2;
            }
            if (c0575xb.f10005d.mo11535b(512)) {
                if ((c0575xb.f10005d.mo11535b(16) | c0575xb.f10005d.mo11535b(256)) != 0) {
                    throw new C0554wb("Inconsistent options for exact size serialize", 103);
                } else if ((c0575xb.f10005d.f22371b & (c0575xb.f10006e - 1)) != 0) {
                    throw new C0554wb("Exact size must be a multiple of the Unicode element", 103);
                }
            } else if (c0575xb.f10005d.mo11535b(32)) {
                if ((c0575xb.f10005d.mo11535b(16) | c0575xb.f10005d.mo11535b(256)) != 0) {
                    throw new C0554wb("Inconsistent options for read-only packet", 103);
                }
                c0575xb.f10007f = 0;
            } else if (!c0575xb.f10005d.mo11535b(16)) {
                if (c0575xb.f10007f == 0) {
                    c0575xb.f10007f = c0575xb.f10006e << 11;
                }
                if (c0575xb.f10005d.mo11535b(256) && !c0575xb.f10002a.mo11449b("http://ns.adobe.com/xap/1.0/", "Thumbnails")) {
                    c0575xb.f10007f += c0575xb.f10006e * MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR;
                }
            } else if (c0575xb.f10005d.mo11535b(256)) {
                throw new C0554wb("Inconsistent options for non-packet serialize", 103);
            } else {
                c0575xb.f10007f = 0;
            }
            if (!c0575xb.f10005d.mo11535b(16)) {
                c0575xb.mo11526c(0);
                c0575xb.mo11519a("<?xpacket begin=\"﻿\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>");
                c0575xb.mo11517a();
            }
            c0575xb.mo11526c(0);
            c0575xb.mo11519a("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"");
            C0783xk c0783xk2 = c0575xb.f10005d;
            c0575xb.mo11519a(C0557we.m6184b().mo11463a());
            c0575xb.mo11519a("\">");
            c0575xb.mo11517a();
            c0575xb.mo11526c(1);
            c0575xb.mo11519a("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\">");
            c0575xb.mo11517a();
            Iterator h;
            Iterator h2;
            if (c0575xb.f10005d.mo11535b(64)) {
                c0575xb.mo11526c(2);
                c0575xb.mo11519a("<rdf:Description rdf:about=");
                c0575xb.mo11523b();
                Set hashSet = new HashSet();
                hashSet.add("xml");
                hashSet.add("rdf");
                h = c0575xb.f10002a.f22365a.mo11508h();
                while (h.hasNext()) {
                    c0575xb.mo11520a((C0570ww) h.next(), hashSet, 4);
                }
                h = c0575xb.f10002a.f22365a.mo11508h();
                int i3 = 1;
                while (true) {
                    i = i3;
                    if (!h.hasNext()) {
                        break;
                    }
                    i3 = c0575xb.mo11522a((C0570ww) h.next(), 3) & i;
                }
                if (i == 0) {
                    c0575xb.mo11518a(62);
                    c0575xb.mo11517a();
                    h2 = c0575xb.f10002a.f22365a.mo11508h();
                    while (h2.hasNext()) {
                        c0575xb.mo11525b((C0570ww) h2.next(), 3);
                    }
                    c0575xb.mo11526c(2);
                    c0575xb.mo11519a("</rdf:Description>");
                    c0575xb.mo11517a();
                } else {
                    c0575xb.mo11519a("/>");
                    c0575xb.mo11517a();
                }
            } else if (c0575xb.f10002a.f22365a.mo11499c() > 0) {
                h2 = c0575xb.f10002a.f22365a.mo11508h();
                while (h2.hasNext()) {
                    C0570ww c0570ww = (C0570ww) h2.next();
                    c0575xb.mo11526c(2);
                    c0575xb.mo11519a("<rdf:Description rdf:about=");
                    c0575xb.mo11523b();
                    Set hashSet2 = new HashSet();
                    hashSet2.add("xml");
                    hashSet2.add("rdf");
                    c0575xb.mo11520a(c0570ww, hashSet2, 4);
                    c0575xb.mo11518a(62);
                    c0575xb.mo11517a();
                    h = c0570ww.mo11508h();
                    while (h.hasNext()) {
                        c0575xb.mo11521a((C0570ww) h.next(), false, 3);
                    }
                    c0575xb.mo11526c(2);
                    c0575xb.mo11519a("</rdf:Description>");
                    c0575xb.mo11517a();
                }
            } else {
                c0575xb.mo11526c(2);
                c0575xb.mo11519a("<rdf:Description rdf:about=");
                c0575xb.mo11523b();
                c0575xb.mo11519a("/>");
                c0575xb.mo11517a();
            }
            c0575xb.mo11526c(1);
            c0575xb.mo11519a("</rdf:RDF>");
            c0575xb.mo11517a();
            c0575xb.mo11526c(0);
            c0575xb.mo11519a("</x:xmpmeta>");
            c0575xb.mo11517a();
            Object obj = "";
            if (!c0575xb.f10005d.mo11535b(16)) {
                char c;
                for (i = c0575xb.f10005d.f22374e; i > 0; i--) {
                    String valueOf2 = String.valueOf(obj);
                    valueOf = String.valueOf(c0575xb.f10005d.f22373d);
                    if (valueOf.length() == 0) {
                        obj = new String(valueOf2);
                    } else {
                        obj = valueOf2.concat(valueOf);
                    }
                }
                String valueOf3 = String.valueOf(obj);
                valueOf = String.valueOf("<?xpacket end=\"");
                if (valueOf.length() == 0) {
                    obj = new String(valueOf3);
                } else {
                    obj = valueOf3.concat(valueOf);
                }
                valueOf3 = String.valueOf(obj);
                if (c0575xb.f10005d.mo11535b(32)) {
                    c = 'r';
                } else {
                    c = 'w';
                }
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 1);
                stringBuilder.append(valueOf3);
                stringBuilder.append(c);
                valueOf3 = String.valueOf(stringBuilder.toString());
                valueOf = String.valueOf("\"?>");
                if (valueOf.length() != 0) {
                    valueOf = valueOf3.concat(valueOf);
                } else {
                    valueOf = new String(valueOf3);
                }
            }
            c0575xb.f10004c.flush();
            i = valueOf.length();
            if (c0575xb.f10005d.mo11535b(512)) {
                i = (i * c0575xb.f10006e) + c0575xb.f10003b.f9966a;
                i2 = c0575xb.f10007f;
                if (i > i2) {
                    throw new C0554wb("Can't fit into specified packet size", 107);
                }
                c0575xb.f10007f = i2 - i;
            }
            c0575xb.f10007f /= c0575xb.f10006e;
            i = c0575xb.f10005d.f22372c.length();
            i2 = c0575xb.f10007f;
            if (i2 >= i) {
                c0575xb.f10007f = i2 - i;
                while (true) {
                    i2 = c0575xb.f10007f;
                    int i4 = i + 100;
                    if (i2 < i4) {
                        break;
                    }
                    c0575xb.mo11524b(100);
                    c0575xb.mo11517a();
                    c0575xb.f10007f -= i4;
                }
                c0575xb.mo11524b(i2);
                c0575xb.mo11517a();
            } else {
                c0575xb.mo11524b(i2);
            }
            c0575xb.mo11519a(valueOf);
            c0575xb.f10004c.flush();
            c0575xb.f10003b.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C0554wb("Error writing to the OutputStream", 0);
        }
    }

    /* renamed from: a */
    public static String m5938a(int i) {
        switch (i) {
            case 1:
                return "OPEN_CAMERA";
            case 2:
                return "RELEASE";
            case 3:
                return "RECONNECT";
            case 4:
                return "UNLOCK";
            case 5:
                return "LOCK";
            case 101:
                return "SET_PREVIEW_TEXTURE_ASYNC";
            case 102:
                return "START_PREVIEW_ASYNC";
            case 103:
                return "STOP_PREVIEW";
            case 104:
                return "SET_PREVIEW_CALLBACK_WITH_BUFFER";
            case 105:
                return "ADD_CALLBACK_BUFFER";
            case 106:
                return "SET_PREVIEW_DISPLAY_ASYNC";
            case 107:
                return "SET_PREVIEW_CALLBACK";
            case 108:
                return "SET_ONE_SHOT_PREVIEW_CALLBACK";
            case FrameType.ELEMENT_FLOAT64 /*201*/:
                return "SET_PARAMETERS";
            case 202:
                return "GET_PARAMETERS";
            case 203:
                return "REFRESH_PARAMETERS";
            case 204:
                return "APPLY_SETTINGS";
            case FrameType.ELEMENT_RGBA8888 /*301*/:
                return "AUTO_FOCUS";
            case 302:
                return "CANCEL_AUTO_FOCUS";
            case 303:
                return "SET_AUTO_FOCUS_MOVE_CALLBACK";
            case 304:
                return "SET_ZOOM_CHANGE_LISTENER";
            case 305:
                return "CANCEL_AUTO_FOCUS_FINISH";
            case 461:
                return "SET_FACE_DETECTION_LISTENER";
            case 462:
                return "START_FACE_DETECTION";
            case 463:
                return "STOP_FACE_DETECTION";
            case 501:
                return "ENABLE_SHUTTER_SOUND";
            case 502:
                return "SET_DISPLAY_ORIENTATION";
            case 601:
                return "CAPTURE_PHOTO";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UNKNOWN(");
                stringBuilder.append(i);
                stringBuilder.append(")");
                return stringBuilder.toString();
        }
    }

    /* renamed from: j */
    private static void m5954j(String str) {
        if (!C0567wp.m6224b(str)) {
            throw new C0554wb("Bad XML name", 102);
        }
    }

    /* renamed from: b */
    private static String m5945b(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C0554wb("Schema namespace URI is required", 101);
        } else if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new C0554wb("Top level name must not be a qualifier", 102);
        } else if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new C0554wb("Top level name must be simple", 102);
        } else {
            String b = C0557we.f9955a.mo11461b(str);
            if (b == null) {
                throw new C0554wb("Unregistered schema namespace URI", 101);
            }
            int indexOf = str2.indexOf(58);
            String valueOf;
            if (indexOf < 0) {
                C0509tz.m5954j(str2);
                valueOf = String.valueOf(b);
                b = String.valueOf(str2);
                return b.length() == 0 ? new String(valueOf) : valueOf.concat(b);
            } else {
                C0509tz.m5954j(str2.substring(0, indexOf));
                C0509tz.m5954j(str2.substring(indexOf));
                b = str2.substring(0, indexOf + 1);
                valueOf = C0557we.f9955a.mo11461b(str);
                if (valueOf == null) {
                    throw new C0554wb("Unknown schema namespace prefix", 101);
                } else if (b.equals(valueOf)) {
                    return str2;
                } else {
                    throw new C0554wb("Schema namespace URI and prefix mismatch", 101);
                }
            }
        }
    }
}
