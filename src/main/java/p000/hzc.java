package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.List;

/* renamed from: hzc */
final class hzc implements hzn {
    /* renamed from: a */
    private final /* synthetic */ List f20837a = null;
    /* renamed from: b */
    private final /* synthetic */ Bundle f20838b;
    /* renamed from: c */
    private final /* synthetic */ long f20839c;
    /* renamed from: d */
    private final /* synthetic */ hzb f20840d;

    hzc(hzb hzb, List list, Bundle bundle, long j) {
        this.f20840d = hzb;
        this.f20838b = bundle;
        this.f20839c = j;
    }

    /* renamed from: a */
    public final void mo8287a() {
        Log.w("gH_GetAsyncFeedbackPsbd", "Failed to send async feedback psbd to Help.");
    }

    /* renamed from: b */
    public final huu mo8288b() {
        List list = this.f20837a;
        FeedbackOptions feedbackOptions = new FeedbackOptions(null);
        feedbackOptions.f23461h = list;
        hzh hzh = hzj.f7206b;
        hzb hzb = this.f20840d;
        return hzh.mo8282a(hzb.f7196a, hzb.f7197b, feedbackOptions, this.f20838b, this.f20839c);
    }
}
