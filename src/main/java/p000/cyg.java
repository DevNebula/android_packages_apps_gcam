package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.InstrumentationSession;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cyg */
final /* synthetic */ class cyg implements iqt {
    /* renamed from: a */
    private final cyd f13470a;
    /* renamed from: b */
    private final grd f13471b;
    /* renamed from: c */
    private final boolean f13472c;
    /* renamed from: d */
    private final boolean f13473d;
    /* renamed from: e */
    private final Long f13474e;
    /* renamed from: f */
    private final AtomicReference f13475f;

    cyg(cyd cyd, grd grd, boolean z, boolean z2, Long l, AtomicReference atomicReference) {
        this.f13470a = cyd;
        this.f13471b = grd;
        this.f13472c = z;
        this.f13473d = z2;
        this.f13474e = l;
        this.f13475f = atomicReference;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        cyd cyd = this.f13470a;
        InstrumentationSession instrumentationSession = this.f13471b;
        boolean z = this.f13472c;
        boolean z2 = this.f13473d;
        Long l = this.f13474e;
        AtomicReference atomicReference = this.f13475f;
        if (((Boolean) obj).booleanValue()) {
            int i;
            int i2;
            iya iya = instrumentationSession.f2599m;
            instrumentationSession.f19494a = SystemClock.elapsedRealtimeNanos();
            instrumentationSession.mo2698a("Camera Change", instrumentationSession.f2597k, instrumentationSession.f19494a);
            irs irs = cyd.f25834T;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            if (z2) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            irs.mo8882a(i, i2, l.longValue(), System.nanoTime());
            if (atomicReference.get() != null) {
                ((iqo) atomicReference.get()).close();
            }
        }
    }
}
