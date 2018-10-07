package p000;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: nm */
public final class C0386nm {
    /* renamed from: a */
    public Context f9442a;

    private C0386nm(Context context) {
        this.f9442a = context;
    }

    /* renamed from: a */
    public static C0386nm m5683a(Context context) {
        return new C0386nm(context);
    }

    /* renamed from: a */
    public final int mo10735a() {
        Configuration configuration = this.f9442a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: b */
    public final boolean mo10736b() {
        return this.f9442a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
