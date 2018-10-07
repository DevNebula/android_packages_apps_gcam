package p000;

import android.app.NotificationManager;
import android.media.AudioManager;

/* compiled from: PG */
/* renamed from: dkg */
public final class dkg implements kwk {
    /* renamed from: a */
    private final kwk f14146a;
    /* renamed from: b */
    private final kwk f14147b;
    /* renamed from: c */
    private final kwk f14148c;
    /* renamed from: d */
    private final kwk f14149d;

    public dkg(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f14146a = kwk;
        this.f14147b = kwk2;
        this.f14148c = kwk3;
        this.f14149d = kwk4;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f14146a;
        kwk kwk2 = this.f14147b;
        kwk kwk3 = this.f14148c;
        AudioManager audioManager = (AudioManager) kwk.mo10566a();
        gpn gpn = (gpn) kwk2.mo10566a();
        NotificationManager notificationManager = (NotificationManager) kwk3.mo10566a();
        this.f14149d.mo10566a();
        return new dke(audioManager, gpn, notificationManager);
    }
}
