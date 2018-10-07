package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.GoogleCamera.R;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* renamed from: dzq */
final class dzq implements OnPreferenceClickListener {
    /* renamed from: a */
    private final /* synthetic */ Activity f3611a;

    dzq(Activity activity) {
        this.f3611a = activity;
    }

    public final boolean onPreferenceClick(Preference preference) {
        axi axi = new axi(this.f3611a);
        Parcelable googleHelp = new GoogleHelp("android_default");
        googleHelp.f23478b = axi.f1030b;
        googleHelp.mo14659a(0, axi.f1034f.getResources().getString(R.string.privacy_policy), new Intent("android.intent.action.VIEW", axi.f1031c));
        googleHelp.mo14659a(1, axi.f1034f.getResources().getString(R.string.open_source_licenses), new Intent(axi.f1034f, LicenseMenuActivity.class));
        googleHelp.mo14659a(2, axi.f1034f.getResources().getString(R.string.terms_of_service), new Intent("android.intent.action.VIEW", axi.f1032d));
        Intent putExtra = new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", googleHelp);
        hyi hyi = new hyi(axi.f1035g);
        if (putExtra.getAction().equals("com.google.android.gms.googlehelp.HELP") && putExtra.hasExtra("EXTRA_GOOGLE_HELP")) {
            int b = hud.m12226b(hyi.f7188a);
            if (b != 0) {
                hyi.mo8270a(b, putExtra);
            } else {
                GoogleHelp googleHelp2 = (GoogleHelp) putExtra.getParcelableExtra("EXTRA_GOOGLE_HELP");
                googleHelp2.f23480d = hua.f20815b;
                putExtra.putExtra("EXTRA_GOOGLE_HELP", googleHelp2);
                hzj.m3649a(hyi.f7189b, new hyj(hyi, putExtra, null));
            }
            return true;
        }
        throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
    }
}
