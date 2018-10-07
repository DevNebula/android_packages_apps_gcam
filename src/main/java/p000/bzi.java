package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.PostviewCallback;
import com.google.googlex.gcam.YuvReadView;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: bzi */
final class bzi extends PostviewCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f12045a;
    /* renamed from: b */
    private final /* synthetic */ bze f12046b;

    bzi(bze bze, bzx bzx) {
        this.f12046b = bze;
        this.f12045a = bzx;
    }

    public final void RgbReady(int i, InterleavedReadViewU8 interleavedReadViewU8, int i2) {
        boolean z;
        bli.m888a(bze.f1762a, String.format(null, "Got postview (shotId = %d, pixelFormat = %s)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        if (this.f12046b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (i != GcamModule.getKInvalidShotId()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        jri.m13404b((Object) interleavedReadViewU8);
        kbg bitmap = this.f12046b.f1774m.getBitmap();
        jri.m13405b(bitmap.mo9709b());
        Bitmap bitmap2 = (Bitmap) bitmap.mo9706a();
        if (this.f12045a.mo2239f().mo9709b()) {
            Bitmap createBitmap;
            bzz bzz = (bzz) this.f12045a.mo2239f().mo9706a();
            if (bzz.f1798a.mo9709b()) {
                eyh eyh = (eyh) bzz.f1798a.mo9706a();
                eyh.f4582e.mo15641a(bitmap2.copy(Config.ARGB_8888, false));
            }
            if (bzz.f1799b != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) bzz.f1799b);
                createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            } else {
                createBitmap = bitmap2;
            }
            fwb fwb = bzz.f1800c.f4984d;
            fwb.mo13289a(createBitmap);
            fwb.mo13290a(createBitmap, 0);
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap2.compress(CompressFormat.JPEG, 90, byteArrayOutputStream);
            fwb.mo13293a(byteArrayOutputStream.toByteArray());
        }
    }

    public final void YuvReady(int i, YuvReadView yuvReadView, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.f12046b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (i == GcamModule.getKInvalidShotId()) {
            z2 = false;
        }
        jri.m13395a(z2);
        jri.m13404b((Object) yuvReadView);
    }
}
