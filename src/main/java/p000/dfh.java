package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import com.google.android.GoogleCamera.R;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: dfh */
final class dfh extends Thread {
    /* renamed from: a */
    private final /* synthetic */ des f3234a;

    dfh(des des) {
        this.f3234a = des;
    }

    public final void run() {
        int i;
        if (this.f3234a.f25939X == C0252go.f5834ag) {
            i = R.drawable.ic_photosphere_processing;
        } else {
            i = R.drawable.ic_panorama_processing;
        }
        Bitmap bitmap = ((BitmapDrawable) this.f3234a.f25981p.mo12480k().getResources().getDrawable(i)).getBitmap();
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArrayOutputStream.close();
            des des = this.f3234a;
            int i2 = !des.f25970e ? R.string.processing_photo_sphere : R.string.processing_panorama;
            gkr gkr = des.f25980o.f4165b;
            glw glw = glw.PANORAMA;
            if (!this.f3234a.f25970e) {
                glw = glw.PHOTOSPHERE;
            }
            gkr.mo13372a(byteArrayOutputStream.toByteArray(), hci.m11979a(i2, new Object[0]), glw);
            this.f3234a.f23696a.f1069a.mo7199a(gkr);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3234a.f25931O;
            goe m = gkr.mo13384m();
            if (m.mo7274b()) {
                new FileOutputStream(m.mo7273a()).write(byteArrayOutputStream.toByteArray());
                this.f3234a.f25980o.f4165b.mo13387p();
                des des2 = this.f3234a;
                if (des2.f25970e) {
                    i2 = 11;
                } else {
                    i2 = 5;
                }
                irs f = des2.f25949ag;
                des des3 = this.f3234a;
                f.mo8880a(i2, des3.f25984s, des3.f25930N, ((float) elapsedRealtime) * 0.001f, des3.m17363w());
                return;
            }
            throw new IOException("Temporary session file not usable.");
        } catch (IOException e) {
            bli.m891b(des.f25916c, "Could not write temporary panorama image.");
        }
    }
}
