package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: beg */
final class beg implements iju {
    /* renamed from: a */
    private final /* synthetic */ bea f11203a;

    beg(bea bea) {
        this.f11203a = bea;
    }

    /* renamed from: a */
    private final kpk m7359a(biw biw) {
        kpk a;
        synchronized (this.f11203a.f22604w) {
            if (this.f11203a.f22603v.equals(bel.CLOSED)) {
                String valueOf = String.valueOf(this.f11203a.f22603v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13874a(new IllegalStateException(stringBuilder.toString()));
            } else {
                jri.m13395a(this.f11203a.f22603v.equals(bel.STARTING_RECORD));
                bea bea = this.f11203a;
                bjk bjk = bea.f22588g;
                bhj bhj = bea.f22600s;
                Surface d = biw.mo1972d();
                iop iop = this.f11203a;
                a = bjk.mo12386a(bhj, d, iop.f22601t, iop);
            }
        }
        return a;
    }
}
