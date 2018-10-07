package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dxw */
public final class dxw implements kwk {
    /* renamed from: a */
    private final kwk f16954a;
    /* renamed from: b */
    private final kwk f16955b;

    public dxw(kwk kwk, kwk kwk2) {
        this.f16954a = kwk;
        this.f16955b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(((gor) this.f16954a.mo10566a()).mo7284b("pref_camera_photosphere_orientation", ((Resources) this.f16955b.mo10566a()).getString(R.string.pano_orientation_photosphere)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
