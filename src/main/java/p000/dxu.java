package p000;

import android.content.Context;
import com.google.android.apps.camera.logging.InstrumentationCameraEventLogger;

/* compiled from: PG */
/* renamed from: dxu */
public final class dxu implements kwk {
    /* renamed from: a */
    private final kwk f16950a;
    /* renamed from: b */
    private final kwk f16951b;

    private dxu(kwk kwk, kwk kwk2) {
        this.f16950a = kwk;
        this.f16951b = kwk2;
    }

    /* renamed from: a */
    public static dxu m9684a(kwk kwk, kwk kwk2) {
        return new dxu(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object instrumentationCameraEventLogger;
        kwk kwk = this.f16950a;
        Context context = (Context) kwk.mo10566a();
        bmb bmb = (bmb) this.f16951b.mo10566a();
        if (bmb.f1335a.mo2107a(bmb.f1312g)) {
            instrumentationCameraEventLogger = new InstrumentationCameraEventLogger();
        } else {
            bsn bsn = bmb.f1335a;
            epd instrumentationCameraEventLogger2 = new epd(context);
        }
        return (epc) ktm.m14219a(instrumentationCameraEventLogger2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
