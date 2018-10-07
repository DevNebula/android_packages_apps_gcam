package p000;

import android.annotation.TargetApi;
import com.google.android.apps.camera.stats.ViewfinderJankSession;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: dvu */
public final class dvu implements dvp {
    /* renamed from: a */
    private final ViewfinderJankSession f16874a;

    dvu(ViewfinderJankSession viewfinderJankSession) {
        this.f16874a = viewfinderJankSession;
    }

    /* renamed from: a */
    public final void mo6083a(iwp iwp, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.f16874a;
        synchronized (viewfinderJankSession.f12879a) {
            if (viewfinderJankSession.f12880b.size() < 30) {
                kke a = ViewfinderJankSession.m8542a(iwp, d, d2);
                viewfinderJankSession.f12880b.add(a);
                viewfinderJankSession.mo12638a(a);
            }
        }
    }
}
