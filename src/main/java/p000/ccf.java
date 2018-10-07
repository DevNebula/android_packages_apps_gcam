package p000;

import android.media.AudioManager;

/* compiled from: PG */
/* renamed from: ccf */
public final class ccf implements kwk {
    /* renamed from: a */
    private final kwk f12142a;

    private ccf(kwk kwk) {
        this.f12142a = kwk;
    }

    /* renamed from: a */
    public static ccf m8085a(kwk kwk) {
        return new ccf(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return (AudioManager) ktm.m14219a((AudioManager) ((ccb) this.f12142a.mo10566a()).mo2252a("audio"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
