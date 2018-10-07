package p000;

import com.google.android.apps.camera.stats.CameraDeviceInstrumentationSession;

/* compiled from: PG */
/* renamed from: diq */
final class diq implements iri {
    /* renamed from: a */
    private final /* synthetic */ CameraDeviceInstrumentationSession f14043a;
    /* renamed from: b */
    private final /* synthetic */ kpw f14044b;
    /* renamed from: c */
    private final /* synthetic */ din f14045c;

    diq(din din, CameraDeviceInstrumentationSession cameraDeviceInstrumentationSession, kpw kpw) {
        this.f14045c = din;
        this.f14043a = cameraDeviceInstrumentationSession;
        this.f14044b = kpw;
    }

    /* renamed from: a */
    public final void mo8871a() {
        if (!this.f14044b.isDone()) {
            knk knk = this.f14044b;
            String valueOf = String.valueOf(this.f14045c.f23974z);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been closed.");
            knk.mo15642a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: b */
    public final void mo8874b() {
        if (!this.f14044b.isDone()) {
            knk knk = this.f14044b;
            String valueOf = String.valueOf(this.f14045c.f23974z);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.mo15642a(new isr(stringBuilder.toString()));
        }
    }

    /* renamed from: a */
    public final void mo8872a(int i) {
        String str = din.f23927a;
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Camera fatal error: errorCode=");
        stringBuilder.append(i);
        bli.m891b(str, stringBuilder.toString());
        if (i == 4) {
            this.f14045c.f23947T.mo13701a();
        } else if (!this.f14044b.isDone()) {
            this.f14044b.mo15642a(new isg(i));
        }
    }

    /* renamed from: a */
    public final void mo8873a(iwl iwl) {
        this.f14043a.mo12626c();
        this.f14044b.mo15641a(new dvm(iwl, this.f14043a));
    }
}
