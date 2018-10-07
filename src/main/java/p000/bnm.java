package p000;

import android.annotation.TargetApi;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.util.UUID;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: bnm */
public final class bnm implements bnl {
    /* renamed from: a */
    private static final String f11587a = bli.m887a("BurstMemoryImage");
    /* renamed from: b */
    private final String f11588b;
    /* renamed from: c */
    private final UUID f11589c;
    /* renamed from: d */
    private final iqm f11590d;
    /* renamed from: e */
    private final int f11591e;
    /* renamed from: f */
    private final int f11592f;
    /* renamed from: g */
    private final int f11593g;
    /* renamed from: h */
    private final long f11594h;
    /* renamed from: i */
    private final long f11595i;
    /* renamed from: j */
    private final bve f11596j;
    /* renamed from: k */
    private final boolean f11597k;
    /* renamed from: l */
    private final String f11598l;
    /* renamed from: m */
    private final gdy f11599m;
    /* renamed from: n */
    private byte[] f11600n;
    /* renamed from: o */
    private ExifInterface f11601o;
    /* renamed from: p */
    private File f11602p;

    public bnm(String str, int i, long j, long j2, UUID uuid, iqm iqm, int i2, int i3, byte[] bArr, ExifInterface exifInterface, gdy gdy, bve bve, boolean z, String str2) {
        this.f11588b = str;
        this.f11593g = i;
        this.f11594h = j;
        this.f11595i = j2;
        this.f11589c = uuid;
        this.f11590d = iqm;
        this.f11591e = i2;
        this.f11592f = i3;
        this.f11600n = bArr;
        this.f11601o = exifInterface;
        this.f11599m = gdy;
        this.f11596j = bve;
        this.f11597k = z;
        this.f11598l = str2;
    }

    /* renamed from: a */
    public final synchronized void mo2045a() {
        jri.m13405b(ikd.m12502b() ^ 1);
        this.f11600n = null;
        this.f11601o = null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bnm) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final ixx mo2046b() {
        return this.f11596j != bve.DNG ? ixx.JPEG : ixx.DNG;
    }

    /* renamed from: c */
    public final iqm mo2047c() {
        return this.f11590d;
    }

    /* renamed from: d */
    public final File mo2048d() {
        return null;
    }

    /* renamed from: e */
    public final long mo2049e() {
        return this.f11595i;
    }

    public final int hashCode() {
        return String.format("%d_%dx%d_%d", new Object[]{Long.valueOf(this.f11595i), Integer.valueOf(this.f11591e), Integer.valueOf(this.f11592f), Integer.valueOf(this.f11593g)}).hashCode();
    }

    /* renamed from: f */
    public final int mo2050f() {
        return this.f11592f;
    }

    /* JADX WARNING: Missing block: B:46:?, code:
            p000.bnm.m7694a(r0, r1);
     */
    /* JADX WARNING: Missing block: B:53:?, code:
            p000.bnm.m7694a(r0, r2);
     */
    /* JADX WARNING: Missing block: B:60:?, code:
            p000.bnm.m7694a(r0, r3);
     */
    /* renamed from: a */
    public final p000.boe mo2043a(p000.gsl r7, java.io.File r8, boolean r9, boolean r10) {
        /*
        r6 = this;
        r0 = r6.f11602p;
        if (r0 != 0) goto L_0x00b6;
    L_0x0004:
        r0 = r6.f11596j;
        r1 = p000.bve.DNG;
        if (r0 != r1) goto L_0x002b;
    L_0x000a:
        r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00bb }
        r1.<init>(r8);	 Catch:{ IOException -> 0x00bb }
        r0 = r6.f11600n;	 Catch:{ all -> 0x00e2 }
        r1.write(r0);	 Catch:{ all -> 0x00e2 }
        r1.close();	 Catch:{ IOException -> 0x00bb }
    L_0x0017:
        r0 = new boe;
        r1 = r6.f11590d;
        r2 = r6.f11591e;
        r3 = r6.f11592f;
        r2 = p000.iqp.m4101a(r2, r3);
        r3 = r6.mo2044a(r9, r10);
        r0.<init>(r8, r1, r2, r3);
        return r0;
    L_0x002b:
        r2 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x009d }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x009d }
        r0.<init>(r8);	 Catch:{ IOException -> 0x009d }
        r2.<init>(r0);	 Catch:{ IOException -> 0x009d }
        r0 = r6.f11601o;	 Catch:{ all -> 0x00e9 }
        r0 = p000.jri.m13404b(r0);	 Catch:{ all -> 0x00e9 }
        r0 = (com.google.android.libraries.camera.exif.ExifInterface) r0;	 Catch:{ all -> 0x00e9 }
        r3 = r0.mo12670a(r2);	 Catch:{ all -> 0x00e9 }
        r0 = r6.f11597k;	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x00ae;
    L_0x0045:
        if (r9 != 0) goto L_0x00ae;
    L_0x0047:
        r0 = p000.bve.NONE;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo2167d();	 Catch:{ all -> 0x00f0 }
        r1 = r0;
    L_0x004e:
        r0 = r6.f11599m;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo7061b();	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo9709b();	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x00a4;
    L_0x005a:
        r4 = r6.f11589c;	 Catch:{ all -> 0x00f0 }
        r5 = r9 ^ 1;
        r0 = r6.f11599m;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo7061b();	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo9706a();	 Catch:{ all -> 0x00f0 }
        r0 = (p000.C0556wd) r0;	 Catch:{ all -> 0x00f0 }
        r0 = p000.bbz.m814a(r4, r9, r1, r5, r0);	 Catch:{ all -> 0x00f0 }
        r1 = r0;
    L_0x006f:
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x00f0 }
        r4.<init>();	 Catch:{ all -> 0x00f0 }
        r5 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x00f0 }
        r0 = r6.f11600n;	 Catch:{ all -> 0x00f0 }
        r5.<init>(r0);	 Catch:{ all -> 0x00f0 }
        r0 = r6.f11599m;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo7060a();	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo9710c();	 Catch:{ all -> 0x00f0 }
        r0 = (p000.C0556wd) r0;	 Catch:{ all -> 0x00f0 }
        com.google.android.apps.camera.metadata.refocus.XmpUtil.writeXMPMeta(r5, r4, r1, r0);	 Catch:{ all -> 0x00f0 }
        r0 = r4.toByteArray();	 Catch:{ all -> 0x00f0 }
        r3.write(r0);	 Catch:{ all -> 0x00f0 }
        r6.f11602p = r8;	 Catch:{ all -> 0x00f0 }
        r0 = 0;
        p000.bnm.m7694a(r0, r3);	 Catch:{ all -> 0x00e9 }
        r0 = 0;
        p000.bnm.m7694a(r0, r2);	 Catch:{ IOException -> 0x009d }
        goto L_0x0017;
    L_0x009d:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x00a4:
        r0 = r6.f11589c;	 Catch:{ all -> 0x00f0 }
        r4 = r9 ^ 1;
        r0 = p000.bbz.m813a(r0, r9, r1, r4);	 Catch:{ all -> 0x00f0 }
        r1 = r0;
        goto L_0x006f;
    L_0x00ae:
        r0 = r6.f11596j;	 Catch:{ all -> 0x00f0 }
        r0 = r0.mo2167d();	 Catch:{ all -> 0x00f0 }
        r1 = r0;
        goto L_0x004e;
    L_0x00b6:
        r7.mo7396a(r0, r8);
        goto L_0x0017;
    L_0x00bb:
        r0 = move-exception;
        r1 = f11587a;
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 26;
        r3.<init>(r2);
        r2 = "Could not write DNG file: ";
        r3.append(r2);
        r3.append(r0);
        r0 = r3.toString();
        p000.bli.m891b(r1, r0);
        goto L_0x0017;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r2 = move-exception;
        p000.bnm.m7694a(r0, r1);	 Catch:{ IOException -> 0x00bb }
        throw r2;	 Catch:{ IOException -> 0x00bb }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00eb }
    L_0x00eb:
        r1 = move-exception;
        p000.bnm.m7694a(r0, r2);	 Catch:{ IOException -> 0x009d }
        throw r1;	 Catch:{ IOException -> 0x009d }
    L_0x00f0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00f2 }
    L_0x00f2:
        r1 = move-exception;
        p000.bnm.m7694a(r0, r3);	 Catch:{ all -> 0x00e9 }
        throw r1;	 Catch:{ all -> 0x00e9 }
        */
        throw new UnsupportedOperationException("Method not decompiled: bnm.a(gsl, java.io.File, boolean, boolean):boe");
    }

    /* renamed from: h */
    public final boolean mo2051h() {
        return this.f11597k;
    }

    /* renamed from: a */
    public final String mo2044a(boolean z, boolean z2) {
        if (this.f11596j == bve.DNG || this.f11596j == bve.NONE) {
            return this.f11588b;
        }
        Object obj;
        boolean z3;
        if (!z) {
            obj = null;
        } else if (this.f11597k) {
            obj = 1;
        } else {
            obj = null;
        }
        if (this.f11596j != bve.PORTRAIT) {
            z3 = false;
        } else if (obj == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        return jxr.m4735a(this.f11593g, this.f11594h, this.f11598l, z, z2, z3, "yyyyMMddHHmmssSSS");
    }

    public final String toString() {
        long j = this.f11595i;
        String valueOf = String.valueOf(this.f11596j);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
        stringBuilder.append("BurstMemoryImage[");
        stringBuilder.append(j);
        stringBuilder.append("][");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: i */
    public final int mo2052i() {
        return this.f11591e;
    }
}
