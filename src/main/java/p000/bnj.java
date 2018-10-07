package p000;

import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.stats.BurstSessionStatistics;

/* compiled from: PG */
/* renamed from: bnj */
final class bnj implements kov {
    /* renamed from: a */
    private final /* synthetic */ BurstSessionStatistics f11577a;
    /* renamed from: b */
    private final /* synthetic */ bni f11578b;

    bnj(bni bni, BurstSessionStatistics burstSessionStatistics) {
        this.f11578b = bni;
        this.f11577a = burstSessionStatistics;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m898e("BurstController", "Could not score a frame because metadata is missing!");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        iwp iwp = (iwp) obj;
        long longValue = ((Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP)).longValue();
        float a = this.f11578b.f11575b.f11562j.mo9163a(iwp);
        if (Float.isNaN(a)) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("Score for ");
            stringBuilder.append(longValue);
            stringBuilder.append(" is NaN!");
            bli.m898e("BurstController", stringBuilder.toString());
        } else {
            this.f11578b.f11575b.f11563k.mo9168a(a, longValue);
        }
        BurstSessionStatistics burstSessionStatistics = this.f11577a;
        if (burstSessionStatistics != null) {
            burstSessionStatistics.mo12592g();
        }
    }
}
