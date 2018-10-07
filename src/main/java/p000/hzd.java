package p000;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;

/* renamed from: hzd */
public final class hzd implements Runnable {
    /* renamed from: a */
    public final huq f7199a;
    /* renamed from: b */
    public final GoogleHelp f7200b;
    /* renamed from: c */
    private final long f7201c;

    public hzd(huq huq, GoogleHelp googleHelp, long j) {
        this.f7199a = huq;
        this.f7200b = googleHelp;
        this.f7201c = j;
    }

    public final void run() {
        try {
            new hyk().mo8271a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.");
            hzj.m3649a(this.f7199a, new hze(this, htl.m3453a(Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"))), this.f7201c));
        }
    }
}
