package p000;

import android.view.Surface;
import java.io.File;

/* compiled from: PG */
/* renamed from: beh */
final class beh implements iju {
    /* renamed from: a */
    private final /* synthetic */ bfs f11204a;
    /* renamed from: b */
    private final /* synthetic */ bea f11205b;

    beh(bea bea, bfs bfs) {
        this.f11205b = bea;
        this.f11204a = bfs;
    }

    /* renamed from: a */
    private final kpk m7361a(biw biw) {
        kpk a;
        synchronized (this.f11205b.f22604w) {
            if (this.f11205b.f22603v.equals(bel.CLOSED)) {
                String valueOf = String.valueOf(this.f11205b.f22603v);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("CamcorderCaptureSessionImpl state=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            jri.m13395a(this.f11205b.f22603v.equals(bel.STARTING_RECORD));
            this.f11205b.f22603v = bel.RECORDING;
            long currentTimeMillis = System.currentTimeMillis();
            bea bea = this.f11205b;
            bhj bhj = bea.f22600s;
            bhs bhs = bea.f22601t;
            Surface surface = bea.f22598q;
            Surface d = biw.mo1972d();
            bea bea2 = this.f11205b;
            bhc bhc = new bhc(bhj, bhs, surface, d, bea2.f22583b, bea2.f22597p);
            bic bic = this.f11205b.f22597p;
            Surface d2 = biw.mo1972d();
            bea = this.f11205b;
            bib bib = new bib(bic, d2, bea.f22600s, bea.f22601t);
            kbg a2 = biw.mo1967a();
            Object obj = this.f11205b;
            bfs bfs = this.f11204a;
            inp inp = obj.f22584c;
            bhj bhj2 = obj.f22600s;
            ilp ilp = obj.f22592k;
            ilp ilp2 = obj.f22593l;
            ilp ilp3 = obj.f22594m;
            kbg kbg = obj.f22595n;
            File c = biw.mo1971c();
            bea bea3 = this.f11205b;
            obj.f22602u = new bft(bfs, obj, inp, bhj2, ilp, ilp2, ilp3, kbg, c, bea3.f22586e, bea3.f22587f, bea3.f22589h, bea3.f22591j, bea3.f22590i, new hke(), biw.mo1970b(), currentTimeMillis, bhc, bib, a2, this.f11205b.f22601t);
            a = kow.m13873a(this.f11205b.f22602u);
        }
        return a;
    }
}
