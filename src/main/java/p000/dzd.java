package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzd */
public final class dzd implements kwk {
    /* renamed from: a */
    private final kwk f17012a;
    /* renamed from: b */
    private final kwk f17013b;

    public dzd(kwk kwk, kwk kwk2) {
        this.f17012a = kwk;
        this.f17013b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(((gor) this.f17012a.mo10566a()).mo7281a("default_scope", "pref_volume_key_action", ((Resources) this.f17013b.mo10566a()).getString(R.string.preference_volume_key_shutter)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
