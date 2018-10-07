package p000;

import android.app.NotificationManager;

/* compiled from: PG */
/* renamed from: cck */
public final class cck implements kwk {
    /* renamed from: a */
    private final kwk f12150a;

    public cck(kwk kwk) {
        this.f12150a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return cck.m8096a(this.f12150a.mo10566a());
    }

    /* renamed from: a */
    public static NotificationManager m8096a(Object obj) {
        return (NotificationManager) ktm.m14219a((NotificationManager) ((ccb) obj).mo2252a("notification"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
