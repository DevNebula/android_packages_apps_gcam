package p000;

import android.graphics.Rect;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvReadView;

/* compiled from: PG */
/* renamed from: gdv */
public final class gdv {
    /* renamed from: a */
    public final /* synthetic */ fwb f5337a;
    /* renamed from: b */
    public final /* synthetic */ cau f5338b;
    /* renamed from: c */
    private final /* synthetic */ gkr f5339c;

    public gdv(cau cau, fwb fwb, gkr gkr) {
        this.f5338b = cau;
        this.f5337a = fwb;
        this.f5339c = gkr;
    }

    /* renamed from: a */
    public final void mo7058a(long j, hjl hjl, gdy gdy, String str) {
        cau cau;
        if (hjl.f6638a.mo9709b()) {
            InterleavedReadViewU8 interleavedReadViewU8 = (InterleavedReadViewU8) hjl.f6638a.mo9706a();
            hjo a = ((hjn) jri.m13404b(this.f5338b.f25519a)).mo7912a();
            if (interleavedReadViewU8.width() <= 0 || interleavedReadViewU8.height() <= 0) {
                bli.m896d(car.f22871a, "Received an invalid primary image, ignoring");
                cau = this.f5338b;
                a.close();
                cau.mo15476a(j);
                return;
            }
            bli.m896d(car.f22871a, "Received a valid primary image, saving");
            this.f5338b.m17239a(j, interleavedReadViewU8, gdy, 100, cat.PRIMARY, str, a);
            return;
        }
        YuvReadView yuvReadView = (YuvReadView) hjl.f6639b.mo9706a();
        hjo a2 = ((hjn) jri.m13404b(this.f5338b.f25519a)).mo7912a();
        String str2;
        if (yuvReadView.width() <= 0 || yuvReadView.height() <= 0) {
            str2 = car.f22871a;
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("Received an invalid primary image, ignoring for shot ");
            stringBuilder.append(j);
            bli.m891b(str2, stringBuilder.toString());
            cau = this.f5338b;
            a2.close();
            cau.mo15476a(j);
        } else if (!this.f5338b.f25523e.mo9709b()) {
            bli.m891b(car.f22871a, "Received a YUV image without FxImageSaver associated with it. Ignoring.");
            cau = this.f5338b;
            a2.close();
            cau.mo15476a(j);
        } else if (this.f5338b.f25525g != null) {
            ExifInterface a3 = bxe.m1057a(yuvReadView.width(), yuvReadView.height(), this.f5338b.f25522d);
            iwz cak = new cak(yuvReadView, this.f5338b.f25526h);
            kow.m13878a(this.f5338b.f25532n.f22873c.mo13265a(new cav(this, new gfw(cak, iqm.m4095a(this.f5338b.f25530l), kow.m13873a(this.f5338b.f25525g), new Rect(0, 0, cak.mo13745g(), cak.mo13742d()), a3, this.f5339c.mo7077h()))), new caw(this, cak, a3, str, gdy, a2, j), this.f5338b.f25532n.f22876f);
        } else {
            str2 = car.f22871a;
            int i = this.f5338b.f25524f;
            StringBuilder stringBuilder2 = new StringBuilder(57);
            stringBuilder2.append("Not metadata associated with frame ");
            stringBuilder2.append(i);
            stringBuilder2.append(", ignoring.");
            bli.m898e(str2, stringBuilder2.toString());
            cau = this.f5338b;
            a2.close();
            cau.mo15476a(j);
        }
    }
}
