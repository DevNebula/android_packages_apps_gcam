package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: axh */
public final class axh {
    /* renamed from: a */
    private static final int f1028a = R.string.all_photos;

    /* renamed from: a */
    public static kbg m756a(Context context, Menu menu, kbg kbg) {
        jri.m13404b((Object) context);
        jri.m13404b((Object) menu);
        if (!kbg.mo9709b()) {
            return kau.f21835a;
        }
        CharSequence charSequence;
        ComponentName component = ((Intent) kbg.mo9706a()).getComponent();
        if (component == null) {
            charSequence = null;
        } else if ("com.google.android.apps.photos".equals(component.getPackageName())) {
            charSequence = context.getResources().getString(f1028a);
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            return kau.f21835a;
        }
        MenuItem add = menu.add(charSequence);
        add.setShowAsAction(2);
        Intent intent = (Intent) kbg.mo9706a();
        intent.setFlags(65536);
        add.setIntent(intent);
        return kbg.m4804c(add);
    }

    /* renamed from: a */
    public static kbg m755a(Context context) {
        kbg b = kbg.m4803b(context.getPackageManager().getLaunchIntentForPackage("com.google.android.apps.photos"));
        if (!b.mo9709b()) {
            return kau.f21835a;
        }
        if (context.getPackageManager().queryIntentActivities((Intent) b.mo9706a(), 65536).size() != 0) {
            return b;
        }
        return kau.f21835a;
    }
}
