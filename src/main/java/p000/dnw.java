package p000;

import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import com.google.android.apps.camera.p005ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: dnw */
final class dnw implements dob {
    /* renamed from: a */
    public final /* synthetic */ dnt f24045a;

    dnw(dnt dnt) {
        this.f24045a = dnt;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        bdy bdy = ((dlp) obj).f3334a;
        ((doa) this.f24045a.mo2152d()).f14236c.execute(new dnx(this));
        bbv bbv = new bbv("StSrtPrev", ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS);
        if (this.f24045a.f24038d.mo9079r() || this.f24045a.f24038d.mo9080s()) {
            asu asu = ((doa) this.f24045a.mo2152d()).f14224C;
            dnt dnt = this.f24045a;
            bdy.mo8557a(asu.mo1787a(bdy, dnt.f24038d, dnt.f24040f.mo12363b(), kau.f21835a, ilq.m3876a(Boolean.valueOf(false))));
        }
        Context context = ((doa) this.f24045a.mo2152d()).f14237d;
        this.f24045a.mo2152d();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        bug bug = this.f24045a;
        ffc ffc = bug.f24038d;
        AudioManager audioManager = (AudioManager) cbu.m1124a(((doa) bug.mo2152d()).f14253t.f1865a, "audio");
        gpn gpn = ((doa) this.f24045a.mo2152d()).f14246m;
        hjf.m3248a();
        dkd dke = new dke(audioManager, gpn, notificationManager);
        hkc hkc = new hkc();
        dnt dnt2 = this.f24045a;
        return new dmo(bug, dke, bbv, bdy, dnt2.f24040f, dnt2.f24042h);
    }
}
