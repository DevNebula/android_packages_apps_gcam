package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;
import java.util.List;

/* compiled from: PG */
/* renamed from: itr */
public class itr implements iwp {
    /* renamed from: a */
    public final CaptureResult f24668a;

    public itr(CaptureResult captureResult) {
        this.f24668a = captureResult;
    }

    /* renamed from: a */
    public final Object mo13730a(Key key) {
        return this.f24668a.get(key);
    }

    /* renamed from: b */
    public final long mo13731b() {
        return this.f24668a.getFrameNumber();
    }

    /* renamed from: c */
    public final List mo13732c() {
        return this.f24668a.getKeys();
    }

    /* renamed from: d */
    public final iwo mo13733d() {
        return new itq(this.f24668a.getRequest());
    }
}
