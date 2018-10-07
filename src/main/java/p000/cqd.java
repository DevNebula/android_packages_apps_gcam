package p000;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: cqd */
public final class cqd implements Iterable {
    /* renamed from: c */
    private static final String f2762c = bli.m887a("MediaDetails");
    /* renamed from: a */
    public TreeMap f2763a = new TreeMap();
    /* renamed from: b */
    public SparseIntArray f2764b = new SparseIntArray();

    /* renamed from: a */
    public final void mo5667a(int i, Object obj) {
        this.f2763a.put(Integer.valueOf(i), obj);
    }

    /* renamed from: a */
    public static void m1452a(cqd cqd, String str) {
        Throwable th;
        String str2;
        String valueOf;
        String str3;
        ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.readExif(str);
            cqd.m1451a(cqd, exifInterface.mo12678e(ExifInterface.f13031u), 102);
            ite e = exifInterface.mo12678e(ExifInterface.f12935a);
            ite e2 = exifInterface.mo12678e(ExifInterface.f12988b);
            iqm a = isx.m4216a(isx.m4217a(exifInterface));
            if (a == iqm.CLOCKWISE_0 || a == iqm.CLOCKWISE_180) {
                cqd.m1451a(cqd, e, 5);
                cqd.m1451a(cqd, e2, 6);
            } else {
                cqd.m1451a(cqd, e2, 5);
                cqd.m1451a(cqd, e, 6);
            }
            cqd.m1451a(cqd, exifInterface.mo12678e(ExifInterface.f13014d), 100);
            cqd.m1451a(cqd, exifInterface.mo12678e(ExifInterface.f13015e), 101);
            cqd.m1451a(cqd, exifInterface.mo12678e(ExifInterface.f13028r), 105);
            cqd.m1451a(cqd, exifInterface.mo12678e(ExifInterface.f13026p), 108);
            cqd.m1451a(cqd, exifInterface.mo12678e(ExifInterface.f12913A), 104);
            cqd.m1451a(cqd, exifInterface.mo12678e(ExifInterface.f13024n), 107);
            ite e3 = exifInterface.mo12678e(ExifInterface.f13032v);
            if (e3 != null) {
                cqd.mo5667a(103, Double.valueOf(e3.mo8991e().mo8807a()));
                cqd.f2764b.put(103, R.string.unit_mm);
            }
        } catch (Throwable e4) {
            th = e4;
            str2 = f2762c;
            valueOf = String.valueOf(str);
            str3 = "Could not find file to read exif: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m899e(str2, valueOf, th);
        } catch (Throwable e42) {
            th = e42;
            str2 = f2762c;
            valueOf = String.valueOf(str);
            str3 = "Could not read exif from file: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m899e(str2, valueOf, th);
        }
    }

    /* renamed from: a */
    public static String m1450a(Context context, long j) {
        long j2 = j / 3600;
        long j3 = 3600 * j2;
        j3 = j - (j3 + (60 * ((j - j3) / 60)));
        if (j2 == 0) {
            return String.format(context.getString(R.string.details_ms), new Object[]{Long.valueOf(r4), Long.valueOf(j3)});
        }
        return String.format(context.getString(R.string.details_hms), new Object[]{Long.valueOf(j2), Long.valueOf(r4), Long.valueOf(j3)});
    }

    public final Iterator iterator() {
        return this.f2763a.entrySet().iterator();
    }

    /* renamed from: a */
    private static void m1451a(cqd cqd, ite ite, int i) {
        if (ite != null) {
            Object valueOf;
            short s = ite.f7813b;
            if (s == (short) 5 || s == (short) 10) {
                valueOf = String.valueOf(ite.mo8991e().mo8807a());
            } else if (s == (short) 2) {
                valueOf = ite.mo8994g();
            } else {
                long j;
                long[] d = ite.mo8990d();
                if (d == null || d.length <= 0) {
                    byte[] bArr;
                    valueOf = ite.f7817f;
                    if (valueOf instanceof byte[]) {
                        bArr = (byte[]) valueOf;
                    } else {
                        bArr = null;
                    }
                    if (bArr == null || bArr.length <= 0) {
                        iqn[] f = ite.mo8993f();
                        if (f == null) {
                            j = 0;
                        } else if (f.length > 0) {
                            iqn iqn = f[0];
                            if (iqn.f7694b != 0) {
                                j = (long) iqn.mo8807a();
                            } else {
                                j = 0;
                            }
                        } else {
                            j = 0;
                        }
                    } else {
                        j = (long) bArr[0];
                    }
                } else {
                    j = d[0];
                }
                valueOf = String.valueOf(j);
            }
            if (i == 102) {
                cqd.mo5667a(i, new cqe(Integer.parseInt(valueOf)));
            } else {
                cqd.mo5667a(i, valueOf);
            }
        }
    }
}
