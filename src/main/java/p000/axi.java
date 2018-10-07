package p000;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: axi */
public final class axi {
    /* renamed from: a */
    public static final String f1029a = bli.m887a("GoogleHelpHelper");
    /* renamed from: b */
    public static final Uri f1030b = Uri.parse("https://support.google.com/nexus/topic/6012822");
    /* renamed from: c */
    public static final Uri f1031c = Uri.parse("http://www.google.com/policies/privacy/");
    /* renamed from: d */
    public static final Uri f1032d = Uri.parse("http://www.google.com/policies/terms/");
    /* renamed from: e */
    public final String f1033e;
    /* renamed from: f */
    public final Context f1034f;
    /* renamed from: g */
    public final Activity f1035g;

    public axi(Activity activity) {
        this.f1035g = activity;
        this.f1034f = activity.getApplicationContext();
        this.f1033e = activity.getPackageName();
    }

    /* renamed from: a */
    public final void mo1834a(int i, Exception exception) {
        bli.m888a(f1029a, "Attempting to connect to Google API client to begin feedback flow");
        kow.m13878a(new hji(new hur(this.f1034f).mo8146a(hxp.f7158a).mo8145a()).mo13541a(), new axj(this, i, exception), kpq.f8776a);
    }
}
