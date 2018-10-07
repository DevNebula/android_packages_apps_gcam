package p000;

import android.hardware.Camera.AutoFocusCallback;
import com.google.android.libraries.smartburst.filterfw.FrameType;

/* compiled from: PG */
/* renamed from: za */
final class C0604za implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ AutoFocusCallback f10065a;
    /* renamed from: b */
    private final /* synthetic */ C0800yu f10066b;

    C0604za(C0800yu c0800yu, AutoFocusCallback autoFocusCallback) {
        this.f10066b = c0800yu;
        this.f10065a = autoFocusCallback;
    }

    public final void run() {
        if (!this.f10066b.f22452a.f22445e.mo81c()) {
            this.f10066b.f22452a.f22445e.mo80b(2);
            this.f10066b.f22452a.f22444d.obtainMessage(FrameType.ELEMENT_RGBA8888, this.f10065a).sendToTarget();
        }
    }
}
