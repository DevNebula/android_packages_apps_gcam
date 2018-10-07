package p000;

import android.annotation.TargetApi;
import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;
import com.google.android.apps.camera.stats.Instrumentation;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: doo */
public final class doo implements don {
    /* renamed from: a */
    private static final String f14267a = bli.m887a("McdlOneCameraOpnr");
    /* renamed from: b */
    private final fhc f14268b;
    /* renamed from: c */
    private final fbn f14269c;
    /* renamed from: d */
    private final irh f14270d;
    /* renamed from: e */
    private final ird f14271e;
    /* renamed from: f */
    private final ise f14272f;

    doo(ise ise, fhc fhc, fbn fbn, irh irh, ird ird) {
        this.f14272f = ise;
        this.f14268b = fhc;
        this.f14269c = fbn;
        this.f14270d = irh;
        this.f14271e = ird;
    }

    /* renamed from: a */
    public final fbj mo6035a(iur iur, iqo iqo, dof dof, fxg fxg, doz doz) {
        String str = f14267a;
        String valueOf = String.valueOf(iur);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Opening Camera: ");
        stringBuilder.append(valueOf);
        bli.m894c(str, stringBuilder.toString());
        this.f14271e.mo8856a("OneCamera#open");
        this.f14271e.mo8856a("CameraDevice#future");
        Object b = this.f14272f.mo8941b();
        b.mo8557a(iqo);
        Object irg = new irg(iur, b);
        CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession = (CameraDeviceInstrumentationSession) Instrumentation.instance().cameraDevice().create();
        kow.m13878a(irg.f21215a, new dop(cameraDeviceInstrumentationSession), kpq.f8776a);
        cameraDeviceInstrumentationSession.mo12625b();
        this.f14270d.mo8867a(iur, irg);
        this.f14271e.mo8857b();
        this.f14271e.mo8856a("OneCharacteristics#get");
        ffc b2 = this.f14269c.mo13218b(iur);
        this.f14271e.mo8857b();
        this.f14271e.mo8856a("OneCamera#select");
        dox a = doz.mo6038a(irg.f21215a, b2, dof, this.f14268b, fxg, cameraDeviceInstrumentationSession);
        this.f14271e.mo8857b();
        fbj fbj = (fbj) b.mo8557a(a.mo6036a());
        this.f14271e.mo8857b();
        return fbj;
    }
}
