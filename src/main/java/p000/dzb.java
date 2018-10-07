package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzb */
public final class dzb implements kwk {
    /* renamed from: a */
    private final kwk f17009a;
    /* renamed from: b */
    private final kwk f17010b;

    public dzb(kwk kwk, kwk kwk2) {
        this.f17009a = kwk;
        this.f17010b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ilp) ktm.m14219a(((gor) this.f17009a.mo10566a()).mo7284b("pref_camera_video_flashmode_key", ((Resources) this.f17010b.mo10566a()).getString(R.string.pref_camera_video_flashmode_off)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
