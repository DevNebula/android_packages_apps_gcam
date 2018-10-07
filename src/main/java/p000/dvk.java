package p000;

import android.os.Handler;
import android.view.Surface;
import com.google.android.apps.camera.stats.CameraCaptureSessionInstrumentationSession;
import java.util.List;

/* compiled from: PG */
/* renamed from: dvk */
public final class dvk implements iwg {
    /* renamed from: a */
    private final iwg f24083a;
    /* renamed from: b */
    private final CameraCaptureSessionInstrumentationSession f24084b;

    public dvk(iwg iwg, CameraCaptureSessionInstrumentationSession cameraCaptureSessionInstrumentationSession) {
        this.f24083a = iwg;
        this.f24084b = cameraCaptureSessionInstrumentationSession;
    }

    /* renamed from: a */
    public final void mo13712a() {
        this.f24083a.mo13712a();
    }

    /* renamed from: a */
    public final int mo13711a(List list, iwh iwh, Handler handler) {
        this.f24084b.mo12619b();
        return this.f24083a.mo13711a(list, new dvl(iwh, this.f24084b), handler);
    }

    public final void close() {
        this.f24083a.close();
    }

    /* renamed from: a */
    public final void mo13713a(List list) {
        this.f24083a.mo13713a(list);
    }

    /* renamed from: b */
    public final iwl mo13715b() {
        return this.f24083a.mo13715b();
    }

    /* renamed from: c */
    public final Surface mo13716c() {
        return this.f24083a.mo9689a();
    }

    /* renamed from: b */
    public final int mo13714b(List list, iwh iwh, Handler handler) {
        this.f24084b.mo12619b();
        return this.f24083a.mo13714b(list, new dvl(iwh, this.f24084b), handler);
    }

    /* renamed from: d */
    public final void mo13717d() {
        this.f24083a.mo13717d();
    }
}
