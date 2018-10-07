package p000;

import android.hardware.SensorManager;
import android.location.Location;
import android.os.AsyncTask;
import java.util.List;

/* compiled from: PG */
/* renamed from: eka */
final class eka extends AsyncTask {
    /* renamed from: a */
    public final /* synthetic */ ejy f3956a;

    eka(ejy ejy) {
        this.f3956a = ejy;
    }

    /* renamed from: a */
    private final Void m1875a() {
        ejy ejy = this.f3956a;
        if (!ejy.f3951v) {
            return null;
        }
        aah aah = ejy.f3932c.f3862b;
        if (aah == null) {
            return null;
        }
        aah.mo21b(ejy.f3924K, null);
        aah.mo11a(this.f3956a.f3924K, null);
        ejy = this.f3956a;
        ejy.f3939j = (double) ((float) (Math.asin((double) (-ejy.f3937h.mo6301b()[6])) * 57.29577951308232d));
        ejy = this.f3956a;
        if (ejy.f3944o == 0) {
            ejy.f3938i = ejy.f3939j;
        }
        Object obj = this.f3956a.f3954y ? !ejv.m1862a(Math.abs(ejy.f3939j - ejy.f3938i)) ? this.f3956a.f3923J ? 1 : null : 1 : null;
        if (obj != null) {
            bli.m888a(ejy.f3913a, "Auto-focusing.");
            ejy = this.f3956a;
            ejy.f3940k = false;
            ejy.f3941l = 0;
            ejy.f3942m.drainPermits();
            for (int i = 0; i < 3; i++) {
                ejy ejy2 = this.f3956a;
                if (ejy2.f3940k) {
                    break;
                }
                aah.mo14a(ejy2.f3924K, new ekb(this, aah));
                try {
                    this.f3956a.f3942m.acquire();
                } catch (InterruptedException e) {
                    bli.m896d(ejy.f3913a, "mFocusRetrySemaphore.acquire() InterruptedException ");
                }
            }
        } else {
            ejy = this.f3956a;
            aah.mo12a(ejy.f3924K, ejy.f3927N, ejy.f3926M, ejy.f3928O);
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
        return null;
    }
}
