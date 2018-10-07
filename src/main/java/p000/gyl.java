package p000;

import android.app.Activity;
import android.content.Context;
import com.google.lens.sdk.LensApi;

/* compiled from: PG */
/* renamed from: gyl */
public final class gyl {
    /* renamed from: a */
    public static final String f6169a = bli.m887a("LensUtil");
    /* renamed from: b */
    public final Activity f6170b;
    /* renamed from: c */
    public final ikd f6171c;
    /* renamed from: d */
    public final LensApi f6172d;
    /* renamed from: e */
    public final kpw f6173e = kpw.m18486d();
    /* renamed from: f */
    private final bkw f6174f;

    gyl(Context context, Activity activity, ikd ikd, bkw bkw) {
        this.f6170b = activity;
        this.f6174f = bkw;
        this.f6172d = new LensApi(context);
        this.f6171c = ikd;
    }

    /* renamed from: a */
    public final kpk mo7547a() {
        if (!ije.m3836a(this.f6174f.f1283a, "camera:google_lens_enabled", true)) {
            return kow.m13873a(Boolean.valueOf(false));
        }
        if (!this.f6173e.isDone()) {
            this.f6172d.checkLensAvailability(new gyo(this, System.currentTimeMillis()));
        }
        return this.f6173e;
    }
}
