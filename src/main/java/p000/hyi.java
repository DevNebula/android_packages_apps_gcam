package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;

/* renamed from: hyi */
public final class hyi {
    /* renamed from: a */
    public final Activity f7188a;
    /* renamed from: b */
    public final huq f7189b;
    /* renamed from: c */
    public final File f7190c;

    public hyi(Activity activity) {
        this(activity, new hur(activity).mo8146a(hzj.f7205a).mo8145a());
    }

    private hyi(Activity activity, huq huq) {
        this.f7190c = activity.getCacheDir();
        this.f7188a = activity;
        this.f7189b = huq;
    }

    /* renamed from: a */
    public final void mo8270a(int i, Intent intent) {
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).f23478b);
        if (i == 7 || this.f7188a.getPackageManager().queryIntentActivities(data, 0).size() <= 0) {
            hud.m12227b(i, this.f7188a);
        } else {
            this.f7188a.startActivity(data);
        }
    }
}
