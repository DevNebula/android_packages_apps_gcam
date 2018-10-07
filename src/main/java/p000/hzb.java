package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

/* renamed from: hzb */
public final class hzb implements Runnable {
    /* renamed from: a */
    public final huq f7196a;
    /* renamed from: b */
    public final GoogleHelp f7197b;
    /* renamed from: c */
    private final long f7198c;

    public hzb(huq huq, GoogleHelp googleHelp, File file, long j) {
        this.f7196a = huq;
        this.f7197b = googleHelp;
        this.f7198c = j;
    }

    public final void run() {
        Bundle bundle = new Bundle(1);
        try {
            new hyk().mo8271a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.");
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            hzj.m3649a(this.f7196a, new hzc(this, null, bundle, this.f7198c));
        }
    }
}
