package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dyd */
public final class dyd implements kwk {
    /* renamed from: a */
    private final kwk f16972a;
    /* renamed from: b */
    private final kwk f16973b;

    public dyd(kwk kwk, kwk kwk2) {
        this.f16972a = kwk;
        this.f16973b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(((gor) this.f16972a.mo10566a()).mo7281a("default_scope", "pref_double_tap_key", ((Resources) this.f16973b.mo10566a()).getString(R.string.preference_double_tap_zoom)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
