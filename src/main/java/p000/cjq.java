package p000;

import android.view.ViewStub;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: cjq */
public final class cjq implements bcy {
    /* renamed from: a */
    public static final String f12640a = bli.m887a("CamAppBurstLPCont");
    /* renamed from: b */
    public volatile ViewStub f12641b;
    /* renamed from: c */
    public kpw f12642c = kpw.m18486d();
    /* renamed from: d */
    public volatile RoundedThumbnailView f12643d;
    /* renamed from: e */
    private final AtomicBoolean f12644e = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized void mo1903a() {
        if (this.f12644e.compareAndSet(true, false)) {
            mo12505a(cjw.f12650a);
            this.f12643d.post(new cjx(this));
        }
    }

    /* renamed from: a */
    public final void mo1904a(int i) {
        mo12505a(new cjt(i));
    }

    /* renamed from: b */
    public final synchronized void mo1906b() {
        mo1907b(0);
    }

    /* renamed from: b */
    public final synchronized void mo1907b(int i) {
        mo12505a(new cjv(this, hci.m11978a(R.plurals.burst_chip, i, Integer.valueOf(i))));
    }

    /* renamed from: a */
    public final void mo1905a(boolean z) {
        if (this.f12644e.compareAndSet(false, true)) {
            mo12505a(new cjr(z));
            RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView) jri.m13404b(this.f12643d);
            roundedThumbnailView.post(new cjs(roundedThumbnailView));
        }
    }

    /* renamed from: c */
    public final synchronized void mo1908c() {
        if (this.f12644e.compareAndSet(true, false)) {
            mo12505a(cju.f12647a);
        }
    }

    /* renamed from: a */
    final void mo12505a(ckd ckd) {
        if (!this.f12642c.isDone()) {
            this.f12641b.post(new cka(this));
        }
        kow.m13878a(this.f12642c, new ckb(ckd), kpq.f8776a);
    }
}
