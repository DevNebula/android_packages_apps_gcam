package p000;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Collections;

/* renamed from: hzf */
public final class hzf implements Runnable {
    /* renamed from: a */
    public final huq f7202a;
    /* renamed from: b */
    public final GoogleHelp f7203b;
    /* renamed from: c */
    private final long f7204c;

    public hzf(huq huq, GoogleHelp googleHelp, long j) {
        this.f7202a = huq;
        this.f7203b = googleHelp;
        this.f7204c = j;
    }

    public final void run() {
        try {
            new hyk().mo8271a();
            throw new NoSuchMethodError();
        } catch (Exception e) {
            Log.w("gH_GetAsyncHelpPsd", "Failed to get async help psd.");
            hzj.m3649a(this.f7202a, new hzg(this, htl.m3453a(Collections.singletonList(Pair.create("gms:googlehelp:async_help_psd_failure", "exception"))), this.f7204c));
        }
    }
}
