package p000;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.faceboxes.FaceView;

/* compiled from: PG */
/* renamed from: czp */
public final class czp implements iqt {
    /* renamed from: a */
    private final AccessibilityManager f13574a;
    /* renamed from: b */
    private final brp f13575b;
    /* renamed from: c */
    private final bqq f13576c;
    /* renamed from: d */
    private final ffc f13577d;
    /* renamed from: e */
    private final cwc f13578e;
    /* renamed from: f */
    private final gci f13579f;
    /* renamed from: g */
    private final boolean f13580g = true;
    /* renamed from: h */
    private final boolean f13581h = false;

    static {
        bsb bsb = new bsb("camera.faceannouncer");
    }

    public czp(AccessibilityManager accessibilityManager, bqq bqq, ffc ffc, gci gci, cwc cwc, brp brp, boolean z, int i) {
        this.f13574a = (AccessibilityManager) ktm.m14218a((Object) accessibilityManager);
        this.f13576c = (bqq) ktm.m14218a((Object) bqq);
        this.f13577d = (ffc) ktm.m14218a((Object) ffc);
        this.f13579f = (gci) ktm.m14218a((Object) gci);
        this.f13578e = (cwc) ktm.m14218a((Object) cwc);
        this.f13575b = (brp) ktm.m14218a((Object) brp);
    }

    /* renamed from: a */
    public final void mo12949a(boolean z) {
        FaceView faceView = this.f13575b.f1515a;
        faceView.f2476b = z;
        faceView.mo2594c();
    }

    /* renamed from: a */
    public final void mo12948a(iqp iqp) {
        brp brp = this.f13575b;
        int i = iqp.f7695a;
        int i2 = iqp.f7696b;
        FaceView faceView = brp.f1515a;
        if (faceView.f2480f != i || faceView.f2481g != i2 || faceView.f2477c == null) {
            faceView.f2480f = i;
            faceView.f2481g = i2;
            faceView.mo2594c();
        }
    }
}
