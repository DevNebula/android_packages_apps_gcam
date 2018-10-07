package p000;

import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: dpu */
public final class dpu {
    /* renamed from: a */
    private final gfa f3400a;
    /* renamed from: b */
    private final fre f3401b;

    public dpu(gfa gfa, fre fre) {
        jri.m13404b((Object) gfa);
        jri.m13404b((Object) fre);
        this.f3400a = gfa;
        this.f3401b = fre;
    }

    /* renamed from: a */
    public final kpk mo6042a(fkp fkp, Rect rect, int i, get get, kaw kaw) {
        jri.m13404b((Object) fkp);
        gfw gfw = new gfw(fkp, iqm.m4095a(i), fkp.mo15529h(), rect);
        Object d = kpw.m18486d();
        try {
            this.f3400a.mo7109a(new dpy(gfw, khx.m5000a(), this.f3400a, get, this.f3401b, d, kaw), true, kau.f21835a);
        } catch (Throwable e) {
            d.mo15642a(e);
        } finally {
            gfw.f5387b.close();
        }
        return d;
    }
}
