package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: bnk */
public final class bnk implements bnl {
    /* renamed from: a */
    public final UUID f11579a;
    /* renamed from: b */
    public final File f11580b;
    /* renamed from: c */
    public final long f11581c;
    /* renamed from: d */
    private final iqm f11582d;
    /* renamed from: e */
    private final int f11583e;
    /* renamed from: f */
    private final int f11584f;
    /* renamed from: g */
    private final int f11585g;
    /* renamed from: h */
    private final long f11586h;

    public bnk(int i, long j, long j2, UUID uuid, File file, iqm iqm, int i2, int i3) {
        this.f11585g = i;
        this.f11586h = j;
        this.f11581c = j2;
        this.f11579a = uuid;
        this.f11580b = file;
        this.f11582d = iqm;
        this.f11583e = i2;
        this.f11584f = i3;
    }

    /* renamed from: a */
    public final synchronized void mo2045a() {
        jri.m13405b(ikd.m12502b() ^ 1);
        if (this.f11580b.exists() && !this.f11580b.delete()) {
            String valueOf = String.valueOf(this.f11580b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Could not delete file at ");
            stringBuilder.append(valueOf);
            Log.w("BurstDiskImage", stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bnk) && this.f11580b.equals(((bnk) obj).f11580b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final ixx mo2046b() {
        return ixx.JPEG;
    }

    /* renamed from: c */
    public final iqm mo2047c() {
        return this.f11582d;
    }

    /* renamed from: d */
    public final File mo2048d() {
        return this.f11580b;
    }

    /* renamed from: e */
    public final long mo2049e() {
        return this.f11581c;
    }

    public final int hashCode() {
        return this.f11580b.hashCode();
    }

    /* renamed from: f */
    public final int mo2050f() {
        return this.f11584f;
    }

    /* renamed from: g */
    public final Bitmap mo12399g() {
        Options options = new Options();
        options.inSampleSize = 8;
        Bitmap decodeFile = BitmapFactory.decodeFile(this.f11580b.getAbsolutePath(), options);
        try {
            int i;
            switch (new ExifInterface(this.f11580b.getAbsolutePath()).getAttributeInt("Orientation", 1)) {
                case 3:
                    i = MediaDecoder.ROTATE_180;
                    break;
                case 6:
                    i = 90;
                    break;
                case 8:
                    i = MediaDecoder.ROTATE_90_LEFT;
                    break;
                default:
                    return decodeFile;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i);
            return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
        } catch (IOException e) {
            String valueOf = String.valueOf(this.f11580b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
            stringBuilder.append("Could not read EXIF data to properly rotate: ");
            stringBuilder.append(valueOf);
            Log.e("BurstDiskImage", stringBuilder.toString());
            return decodeFile;
        }
    }

    /* JADX WARNING: Missing block: B:14:0x0049, code:
            p000.bnk.m7681a(r0, r2);
     */
    /* JADX WARNING: Missing block: B:21:?, code:
            p000.bnk.m7682a(r0, r3);
     */
    /* renamed from: a */
    private final java.io.File m7680a(p000.gsl r7) {
        /*
        r6 = this;
        r5 = 0;
        r2 = 1;
        r0 = r6.f11579a;
        r1 = p000.bve.BURSTS;
        r1 = r1.mo2167d();
        r0 = p000.bbz.m813a(r0, r2, r1, r2);
        r1 = new java.io.File;
        r2 = r6.f11580b;
        r2 = r2.getParent();
        r3 = r6.f11580b;
        r3 = r3.getName();
        r3 = java.lang.String.valueOf(r3);
        r4 = "_cover_mark.jpg";
        r3 = r3.concat(r4);
        r1.<init>(r2, r3);
        r2 = new java.io.FileInputStream;
        r3 = r6.f11580b;
        r2.<init>(r3);
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x0046 }
        r4 = 0;
        r3.<init>(r1, r4);	 Catch:{ all -> 0x0046 }
        p000.ern.m2090a(r2, r3, r0);	 Catch:{ all -> 0x004d }
        r0 = 0;
        p000.bnk.m7682a(r0, r3);	 Catch:{ all -> 0x0046 }
        p000.bnk.m7681a(r5, r2);
        r0 = r6.f11580b;
        r7.mo7397b(r0);
        return r1;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r1 = move-exception;
        p000.bnk.m7681a(r0, r2);
        throw r1;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004f }
    L_0x004f:
        r1 = move-exception;
        p000.bnk.m7682a(r0, r3);	 Catch:{ all -> 0x0046 }
        throw r1;	 Catch:{ all -> 0x0046 }
        */
        throw new UnsupportedOperationException("Method not decompiled: bnk.a(gsl):java.io.File");
    }

    /* renamed from: a */
    public final boe mo2043a(gsl gsl, File file, boolean z, boolean z2) {
        File a;
        if (z) {
            a = m7680a(gsl);
        } else {
            a = this.f11580b;
        }
        gsl.mo7396a(a, file);
        return new boe(file, this.f11582d, iqp.m4101a(this.f11583e, this.f11584f), mo2044a(z, z2));
    }

    /* renamed from: h */
    public final boolean mo2051h() {
        return false;
    }

    /* renamed from: a */
    public final String mo2044a(boolean z, boolean z2) {
        return jxr.m4734a(this.f11585g, this.f11586h, "", z, z2);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11580b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("BurstDiskImage[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: i */
    public final int mo2052i() {
        return this.f11583e;
    }
}
