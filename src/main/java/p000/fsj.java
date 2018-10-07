package p000;

import android.graphics.Rect;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: fsj */
public final class fsj {
    /* renamed from: a */
    private final gfh f4910a;
    /* renamed from: b */
    private final fyy f4911b;

    fsj(gfa gfa, fyy fyy) {
        this.f4910a = gfa;
        this.f4911b = fyy;
    }

    /* renamed from: a */
    public final fsk mo6882a(iwz iwz, iqm iqm) {
        Rect a;
        kpw d = kpw.m18486d();
        kpw d2 = kpw.m18486d();
        kpk a2 = kow.m13874a(new IllegalStateException("Thumbnail generation should not require metadata"));
        iwz fuz = new fuz(iwz);
        if (this.f4911b.f5061c.mo9709b()) {
            a = ipz.m4077b(((ive) this.f4911b.f5061c.mo9706a()).f7861b).mo8749a(new iqp(iwz.mo13745g(), iwz.mo13742d()));
        } else {
            a = new Rect(0, 0, iwz.mo13745g(), iwz.mo13742d());
        }
        gfw gfw = new gfw(fuz, iqm, a2, a);
        get ggj = new ggj();
        Executor a3 = khx.m5000a();
        Set a4 = keu.m13729a(gfi.CLOSE_ON_ALL_TASKS_RELEASE, gfi.CREATE_EARLY_FILMSTRIP_PREVIEW, gfi.CONVERT_TO_RGB_PREVIEW);
        fsf fsf = new fsf();
        fsf.f4908c = new fse(d, iqm, d2);
        try {
            this.f4910a.mo7108a(gfw, a3, a4, ggj, fsf.f4909d);
            return new fsk(kbg.m4804c(d), kbg.m4804c(d2));
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }
}
