package p000;

import android.media.MediaCodec;

/* renamed from: jfv */
public final class jfv implements kaw, kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f21457a;

    public jfv(kpw kpw) {
        this.f21457a = kpw;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        ((MediaCodec) obj).setInputSurface(null);
        return null;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f21457a.mo15641a(Boolean.valueOf(false));
    }

    /* renamed from: b_ */
    public final void mo10186b_(Object obj) {
        this.f21457a.mo15641a(Boolean.valueOf(true));
    }
}
