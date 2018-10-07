package p000;

import com.google.lens.sdk.LensApi.LensAvailabilityCallback;
import com.google.lens.sdk.LensApi.LensAvailabilityStatus;

/* compiled from: PG */
/* renamed from: gyo */
final class gyo implements LensAvailabilityCallback {
    /* renamed from: a */
    private final /* synthetic */ long f19828a;
    /* renamed from: b */
    private final /* synthetic */ gyl f19829b;

    gyo(gyl gyl, long j) {
        this.f19829b = gyl;
        this.f19828a = j;
    }

    /* renamed from: a */
    public final void mo5638a(@LensAvailabilityStatus int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        String str = gyl.f6169a;
        long j = this.f19828a;
        StringBuilder stringBuilder = new StringBuilder(75);
        stringBuilder.append("onAvailabilityStatusFetched in ");
        stringBuilder.append(currentTimeMillis - j);
        stringBuilder.append("ms, status = ");
        stringBuilder.append(i);
        bli.m888a(str, stringBuilder.toString());
        knk knk = this.f19829b.f6173e;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        knk.mo15641a(Boolean.valueOf(z));
    }
}
