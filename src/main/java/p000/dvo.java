package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;
import java.util.Set;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: dvo */
public final class dvo extends fiw {
    /* renamed from: a */
    private final Set f16865a;
    /* renamed from: b */
    private long f16866b = -1;
    /* renamed from: c */
    private double f16867c = -1.0d;

    public dvo(Set set) {
        this.f16865a = set;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        long longValue;
        double d;
        double d2 = -1.0d;
        Long l = (Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            longValue = l.longValue();
        } else {
            longValue = -1;
        }
        long j = this.f16866b;
        if (j >= 0) {
            double d3 = ((double) (longValue - j)) / 1000000.0d;
            d = this.f16867c;
            if (d > 0.0d) {
                d2 = d;
            }
            this.f16867c = d3;
            d = d2;
            d2 = d3;
        } else {
            d = -1.0d;
        }
        this.f16866b = longValue;
        for (dvp a : this.f16865a) {
            a.mo6083a(iwp, d2, d);
        }
    }
}
