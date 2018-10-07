package p000;

import android.graphics.drawable.AnimatedVectorDrawable;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.modeswitch.ViewfinderCover;

/* compiled from: PG */
/* renamed from: ece */
class ece extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ecd f24116a;

    ece(ecd ecd) {
        this.f24116a = ecd;
        super(null);
    }

    /* renamed from: a */
    public final void mo7343a() {
        boolean z = true;
        bli.m888a(ecd.f24105a, "enter Back camera state");
        ecd ecd = this.f24116a;
        ffc ffc = ecd.f24107c;
        if (ffc != null) {
            boolean z2;
            ecd.f24110f.f19240d = ffc.mo13237v_();
            gal gal = ecd.f24112h;
            if (ffc.mo9064c() == iut.FRONT) {
                z2 = true;
            } else {
                z2 = false;
            }
            gal.f5232l = z2;
            if (!(ffc.mo9083v() || gal.f5232l)) {
                z = false;
            }
            gal.f5230j = z;
            gal.f5231k = ffc.mo13238w_();
            gal.mo7002a((hhx) gal.f5223c.mo13673b());
            ecd.f24109e.mo7159a(ffc);
            ecd.f24114j.mo7999a(ffc);
            ecd.f24115k.mo1848f();
            this.f24116a.f24113i.resetCameraSwitch(0);
            this.f24116a.f24106b.mo14866a(ece.class);
            return;
        }
        bli.m898e(ecd.f24105a, "Trying to enter Back camera state but back camera does not exist.");
        if (this.f24116a.f24108d != null) {
            bli.m894c(ecd.f24105a, "Open front camera instead.");
            mo13445n();
        }
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f24116a.f24106b.mo14867b(ece.class);
        this.f24116a.f24114j.mo8006e();
        this.f24116a.f24114j.mo8010i();
    }

    /* renamed from: n */
    public void mo13445n() {
    }

    /* renamed from: o */
    public void mo13446o() {
        ViewfinderCover viewfinderCover = this.f24116a.f24111g;
        viewfinderCover.f12888c = (AnimatedVectorDrawable) viewfinderCover.getResources().getDrawable(R.drawable.camera_back_front_animation, null);
        viewfinderCover.f12887b.setImageDrawable(viewfinderCover.f12888c);
        viewfinderCover.f12887b.setVisibility(0);
        this.f24116a.f24111g.mo12642a();
        this.f24116a.f24111g.f12888c.start();
    }
}
