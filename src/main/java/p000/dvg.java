package p000;

import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: dvg */
public final class dvg implements kwk {
    /* renamed from: a */
    private final kwk f16857a;

    private dvg(kwk kwk) {
        this.f16857a = kwk;
    }

    /* renamed from: a */
    public static dvg m9607a(kwk kwk) {
        return new dvg(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (ViewfinderJankSession) ktm.m14219a((ViewfinderJankSession) ((Instrumentation) this.f16857a.mo10566a()).jankStats().create(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
