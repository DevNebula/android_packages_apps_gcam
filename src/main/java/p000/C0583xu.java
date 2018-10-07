package p000;

import android.os.Handler;
import com.google.android.libraries.smartburst.filterfw.FrameType;

/* compiled from: PG */
/* renamed from: xu */
final class C0583xu implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ C0623zw f10021a;
    /* renamed from: b */
    public final /* synthetic */ Handler f10022b;
    /* renamed from: c */
    private final /* synthetic */ C0788xt f10023c;

    C0583xu(C0788xt c0788xt, C0623zw c0623zw, Handler handler) {
        this.f10023c = c0788xt;
        this.f10021a = c0623zw;
        this.f10022b = handler;
    }

    public final void run() {
        Object c0789xv;
        if (this.f10021a != null) {
            c0789xv = new C0789xv(this);
        } else {
            c0789xv = null;
        }
        this.f10023c.f22395c.f22381c.mo80b(48);
        this.f10023c.f22395c.f22380b.obtainMessage(FrameType.ELEMENT_RGBA8888, c0789xv).sendToTarget();
    }
}
