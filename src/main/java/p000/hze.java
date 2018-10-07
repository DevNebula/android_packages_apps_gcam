package p000;

import android.os.Bundle;
import android.util.Log;

/* renamed from: hze */
final class hze implements hzn {
    /* renamed from: a */
    private final /* synthetic */ Bundle f20841a;
    /* renamed from: b */
    private final /* synthetic */ long f20842b;
    /* renamed from: c */
    private final /* synthetic */ hzd f20843c;

    hze(hzd hzd, Bundle bundle, long j) {
        this.f20843c = hzd;
        this.f20841a = bundle;
        this.f20842b = j;
    }

    /* renamed from: a */
    public final void mo8287a() {
        Log.w("gH_GetAsyncFeedbackPsd", "Failed to send async feedback psd to Help.");
    }

    /* renamed from: b */
    public final huu mo8288b() {
        hzh hzh = hzj.f7206b;
        hzd hzd = this.f20843c;
        return hzh.mo8283b(hzd.f7199a, hzd.f7200b, this.f20841a, this.f20842b);
    }
}
