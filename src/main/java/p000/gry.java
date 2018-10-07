package p000;

import com.google.common.logging.nano.eventprotos$CameraEvent;

/* renamed from: gry */
final /* synthetic */ class gry implements Runnable {
    /* renamed from: a */
    private final grx f6023a;
    /* renamed from: b */
    private final eventprotos$CameraEvent f6024b;

    gry(grx grx, eventprotos$CameraEvent eventprotos_cameraevent) {
        this.f6023a = grx;
        this.f6024b = eventprotos_cameraevent;
    }

    public final void run() {
        grx grx = this.f6023a;
        grx.f19534a.mo6439a(this.f6024b);
    }
}
