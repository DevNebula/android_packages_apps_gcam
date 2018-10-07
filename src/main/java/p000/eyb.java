package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eyb */
public class eyb extends fiw {
    /* renamed from: a */
    public final exd f18005a;
    /* renamed from: b */
    public final ccr f18006b;
    /* renamed from: c */
    public final Rect f18007c;
    /* renamed from: d */
    public volatile long f18008d;
    /* renamed from: e */
    private final axm f18009e;
    /* renamed from: f */
    private final Executor f18010f;
    /* renamed from: g */
    private volatile boolean f18011g = true;

    static {
        eyb.class.getSimpleName();
    }

    public eyb(exd exd, ccr ccr, axm axm, ffc ffc, Executor executor) {
        this.f18005a = exd;
        this.f18006b = ccr;
        this.f18009e = axm;
        this.f18010f = executor;
        this.f18007c = (Rect) ffc.mo9056a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        super.mo6826a_(iwp);
        if (this.f18011g) {
            this.f18010f.execute(new eyc(this, iwp, this.f18009e.mo1836a()));
        }
    }

    /* renamed from: a */
    public final void mo13201a(boolean z) {
        this.f18011g = z;
        if (!z) {
            this.f18005a.mo6662a();
        }
    }
}
