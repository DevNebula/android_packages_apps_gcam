package p000;

import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: eiq */
public final class eiq implements kwk {
    /* renamed from: a */
    private final kwk f17432a;
    /* renamed from: b */
    private final kwk f17433b;

    public eiq(eio eio, kwk kwk, kwk kwk2) {
        this.f17432a = kwk;
        this.f17433b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17432a;
        ShutterButton shutterButton = (ShutterButton) jqk.m13354c(((het) kwk.mo10566a()).f6492f.getShutterButton());
        bsn bsn = ((bmb) this.f17433b.mo10566a()).f1335a;
        return (hcd) ktm.m14219a(new hcd(shutterButton, false), "Cannot return null from a non-@Nullable @Provides method");
    }
}
