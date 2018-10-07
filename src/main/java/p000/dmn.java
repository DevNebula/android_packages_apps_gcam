package p000;

import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;

/* compiled from: PG */
/* renamed from: dmn */
final class dmn implements iri {
    /* renamed from: a */
    private final /* synthetic */ CameraDeviceInstrumentationSession f14209a;
    /* renamed from: b */
    private final /* synthetic */ kpw f14210b;
    /* renamed from: c */
    private final /* synthetic */ dmf f14211c;

    dmn(dmf dmf, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession, kpw kpw) {
        this.f14211c = dmf;
        this.f14209a = cameraDeviceInstrumentationSession;
        this.f14210b = kpw;
    }

    /* renamed from: a */
    public final void mo8871a() {
        if (!this.f14210b.isDone()) {
            knk knk = this.f14210b;
            String valueOf = String.valueOf(this.f14211c.f23994e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.mo15642a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: b */
    public final void mo8874b() {
        if (!this.f14210b.isDone()) {
            knk knk = this.f14210b;
            String valueOf = String.valueOf(this.f14211c.f23994e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.mo15642a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: a */
    public final void mo8872a(int i) {
        String str = dmf.f23992c;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Camera fatal error: errorCode=");
        stringBuilder.append(i);
        bli.m891b(str, stringBuilder.toString());
        if (i == 4) {
            this.f14211c.f24000k.mo13701a();
        } else if (!this.f14210b.isDone()) {
            knk knk = this.f14210b;
            String valueOf = String.valueOf(this.f14211c.f23994e);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder2.append("Camera device ");
            stringBuilder2.append(valueOf);
            stringBuilder2.append(" has been disconnected.");
            knk.mo15642a(new isr(stringBuilder2.toString()));
        }
    }

    /* renamed from: a */
    public final void mo8873a(iwl iwl) {
        this.f14209a.mo12626c();
        this.f14210b.mo15641a(new dvm(iwl, this.f14209a));
    }
}
