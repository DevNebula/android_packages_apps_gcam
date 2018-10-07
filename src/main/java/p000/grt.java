package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.InstrumentationSession;

/* compiled from: PG */
/* renamed from: grt */
public final class grt extends InstrumentationSession {
    /* renamed from: a */
    public long f19531a;

    public grt(iya iya) {
        super(iya, "ModeSwitch");
    }

    /* renamed from: a */
    public static kwk m11633a() {
        return new gru();
    }

    /* renamed from: b */
    public final void mo13464b() {
        this.f19531a = SystemClock.elapsedRealtimeNanos();
        mo2698a("Mode Switch", this.f2597k, this.f19531a);
    }
}
