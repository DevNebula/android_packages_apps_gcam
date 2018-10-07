package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;

/* compiled from: PG */
/* renamed from: ekj */
final class ekj implements C0623zw {
    /* renamed from: a */
    private final /* synthetic */ eki f17489a;

    ekj(eki eki) {
        this.f17489a = eki;
    }

    /* renamed from: a */
    public final void mo11600a(boolean z, aah aah) {
        eks eks = this.f17489a.f4016h;
        eld eld = eks.f4054b;
        if (eld != null) {
            eld.mo6302c();
            eks.f4054b.mo6300a();
            eks.f4055c = SystemClock.elapsedRealtimeNanos();
            LightCycle.m1319a(eks.f4054b.f4143o);
            eks.f4059g = true;
            eks.f4060h = false;
        }
        this.f17489a.f4033y = false;
    }
}
