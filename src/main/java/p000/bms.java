package p000;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bms */
public final class bms implements kwk {
    /* renamed from: a */
    private final kwk f11543a;
    /* renamed from: b */
    private final kwk f11544b;
    /* renamed from: c */
    private final kwk f11545c;
    /* renamed from: d */
    private final kwk f11546d;

    public bms(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11543a = kwk;
        this.f11544b = kwk2;
        this.f11545c = kwk3;
        this.f11546d = kwk4;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11543a;
        kwk kwk2 = this.f11544b;
        kwk kwk3 = this.f11545c;
        kwk kwk4 = this.f11546d;
        CameraManager cameraManager = (CameraManager) kwk.mo10566a();
        irs irs = (irs) kwk2.mo10566a();
        kwk3.mo10566a();
        return new bmp(cameraManager, irs, (Executor) kwk4.mo10566a());
    }
}
