package p000;

import android.util.Log;
import com.google.lens.sdk.LensApi;
import com.google.lens.sdk.LensApi.LensAvailabilityCallback;
import com.google.lens.sdk.LensApi.LensFeature;

/* compiled from: PG */
/* renamed from: ksy */
public final class ksy implements hqr {
    /* renamed from: a */
    private final LensAvailabilityCallback f21981a;
    @LensFeature
    /* renamed from: b */
    private final int f21982b;

    public ksy(LensAvailabilityCallback lensAvailabilityCallback, @LensFeature int i) {
        this.f21981a = lensAvailabilityCallback;
        this.f21982b = i;
    }

    /* renamed from: a */
    public final void mo8034a(hra hra) {
        int i = this.f21982b;
        switch (i) {
            case 0:
                i = hra.f24515c;
                break;
            case 1:
                i = hra.f24516d;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(33);
                stringBuilder.append("Invalid lens feature: ");
                stringBuilder.append(i);
                Log.w("LensApi", stringBuilder.toString());
                i = 1;
                break;
        }
        this.f21981a.mo5638a(LensApi.m1432a(i));
    }
}
