package p000;

import android.hardware.SensorManager;
import android.location.Location;
import java.util.List;

/* compiled from: PG */
/* renamed from: ekb */
final class ekb implements C0623zw {
    /* renamed from: a */
    private final /* synthetic */ aah f17483a;
    /* renamed from: b */
    private final /* synthetic */ eka f17484b;

    ekb(eka eka, aah aah) {
        this.f17484b = eka;
        this.f17483a = aah;
    }

    /* renamed from: a */
    public final void mo11600a(boolean z, aah aah) {
        ejy ejy = this.f17484b.f3956a;
        ejy.f3941l++;
        if (ejy.f3940k) {
            bli.m898e(ejy.f3913a, "Past trial succeeded so nothing to do, shouldn't have gotten to this.");
        } else {
            if (z || ejy.f3941l >= 3) {
                this.f17483a.mo12a(ejy.f3924K, ejy.f3927N, ejy.f3926M, ejy.f3928O);
                List list = ejy.f3919F;
                long currentTimeMillis = System.currentTimeMillis();
                Location d = ejy.f3948s.mo7915d();
                eld eld = ejy.f3937h;
                float[] fArr = new float[16];
                ejk ejk = eld.f4134f;
                SensorManager.getRotationMatrix(fArr, null, new float[]{ejk.f3880a, ejk.f3881b, ejk.f3882c}, eld.f4137i);
                float[] fArr2 = new float[16];
                SensorManager.remapCoordinateSystem(fArr, 1, 3, fArr2);
                fArr = new float[3];
                SensorManager.getOrientation(fArr2, fArr);
                list.add(new emf(currentTimeMillis, d, (int) (((double) (fArr[0] * 180.0f)) / 3.141592653589793d)));
                ejy.f3923J = false;
            }
            if (z) {
                ejy = this.f17484b.f3956a;
                ejy.f3938i = ejy.f3939j;
            } else {
                this.f17484b.f3956a.f3938i = -9990.0d;
            }
            this.f17484b.f3956a.f3940k = z;
        }
        this.f17484b.f3956a.f3942m.release();
    }
}
