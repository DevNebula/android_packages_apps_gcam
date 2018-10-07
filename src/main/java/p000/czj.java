package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.OneCameraSession;

/* compiled from: PG */
/* renamed from: czj */
final class czj implements kaw {
    /* renamed from: a */
    private final /* synthetic */ OneCameraSession f13553a;
    /* renamed from: b */
    private final /* synthetic */ fbj f13554b;
    /* renamed from: c */
    private final /* synthetic */ czg f13555c;

    czj(czg czg, OneCameraSession oneCameraSession, fbj fbj) {
        this.f13555c = czg;
        this.f13553a = oneCameraSession;
        this.f13554b = fbj;
    }

    /* renamed from: a */
    private final fbj m9033a() {
        boolean z;
        bli.m894c(czg.f3059a, "OneCamera started!");
        synchronized (this.f13555c.f3063e) {
            this.f13555c.f3064f = null;
        }
        OneCameraSession oneCameraSession = this.f13553a;
        if (oneCameraSession.f12878e == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Accidental session reuse.");
        iya iya = oneCameraSession.f2599m;
        oneCameraSession.f12878e = SystemClock.elapsedRealtimeNanos();
        oneCameraSession.mo2698a("OneCamera Started", oneCameraSession.f12877d, oneCameraSession.f12878e);
        return this.f13554b;
    }
}
