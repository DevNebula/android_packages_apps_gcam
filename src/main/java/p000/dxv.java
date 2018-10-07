package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dxv */
public final class dxv implements kwk {
    /* renamed from: a */
    private final kwk f16952a;
    /* renamed from: b */
    private final kwk f16953b;

    public dxv(kwk kwk, kwk kwk2) {
        this.f16952a = kwk;
        this.f16953b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(((gor) this.f16952a.mo10566a()).mo7284b("pref_camera_pano_orientation", ((Resources) this.f16953b.mo10566a()).getString(R.string.pano_orientation_horizontal)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
