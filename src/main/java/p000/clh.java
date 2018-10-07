package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: clh */
public final class clh implements iqo {
    /* renamed from: a */
    public final Object f12698a = new Object();
    /* renamed from: b */
    public final Surface f12699b = new Surface(this.f12701d);
    /* renamed from: c */
    public final List f12700c = new ArrayList();
    /* renamed from: d */
    private final SurfaceTexture f12701d;

    public clh(SurfaceTexture surfaceTexture) {
        this.f12701d = surfaceTexture;
    }

    public final void close() {
        synchronized (this.f12698a) {
            for (iqo close : this.f12700c) {
                close.close();
            }
            this.f12699b.release();
            this.f12701d.release();
        }
    }
}
