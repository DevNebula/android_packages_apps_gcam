package p000;

import android.os.Bundle;
import android.util.Log;

/* renamed from: hzg */
final class hzg implements hzn {
    /* renamed from: a */
    private final /* synthetic */ Bundle f20844a;
    /* renamed from: b */
    private final /* synthetic */ long f20845b;
    /* renamed from: c */
    private final /* synthetic */ hzf f20846c;

    hzg(hzf hzf, Bundle bundle, long j) {
        this.f20846c = hzf;
        this.f20844a = bundle;
        this.f20845b = j;
    }

    /* renamed from: a */
    public final void mo8287a() {
        Log.w("gH_GetAsyncHelpPsd", "Failed to send async help psd to Help.");
    }

    /* renamed from: b */
    public final huu mo8288b() {
        hzh hzh = hzj.f7206b;
        hzf hzf = this.f20846c;
        return hzh.mo8281a(hzf.f7202a, hzf.f7203b, this.f20844a, this.f20845b);
    }
}
