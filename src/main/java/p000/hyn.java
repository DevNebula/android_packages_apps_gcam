package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: hyn */
public final class hyn implements hzh {
    /* renamed from: a */
    public static final Status f20836a = new Status(13);

    /* renamed from: a */
    static /* synthetic */ void m12267a(huq huq, GoogleHelp googleHelp, htl htl, htl htl2, File file, long j) {
        if (htl != null) {
            hyn.m12268a(new hzf(huq, googleHelp, j));
        }
        if (htl2 != null) {
            hyn.m12268a(new hzb(huq, googleHelp, file, j));
            hyn.m12268a(new hzd(huq, googleHelp, j));
        }
    }

    /* renamed from: a */
    private static void m12268a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(4);
        thread.start();
    }

    /* renamed from: a */
    public final huu mo8280a(huq huq, Activity activity, Intent intent, List list, File file) {
        return huq.mo8134a(new hyo(this, huq, intent, null, null, null, activity, list, new WeakReference(huq), file));
    }

    /* renamed from: a */
    public final huu mo8281a(huq huq, GoogleHelp googleHelp, Bundle bundle, long j) {
        return huq.mo8134a(new hyq(huq, bundle, j, googleHelp));
    }

    /* renamed from: a */
    public final huu mo8282a(huq huq, GoogleHelp googleHelp, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        return huq.mo8134a(new hyu(huq, feedbackOptions, bundle, j, googleHelp));
    }

    /* renamed from: b */
    public final huu mo8283b(huq huq, GoogleHelp googleHelp, Bundle bundle, long j) {
        return huq.mo8134a(new hys(huq, bundle, j, googleHelp));
    }
}
