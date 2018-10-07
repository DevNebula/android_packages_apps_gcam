package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: eac */
public final class eac {
    /* renamed from: a */
    private static final String f3641a = bli.m887a("PictureSizeLoader");
    /* renamed from: b */
    private final bkw f3642b;
    /* renamed from: c */
    private final fbn f3643c;
    /* renamed from: d */
    private final bfk f3644d;

    public eac(bkw bkw, fbn fbn, bfk bfk) {
        this.f3642b = bkw;
        this.f3643c = fbn;
        this.f3644d = bfk;
    }

    /* renamed from: a */
    final List mo6158a(iut iut) {
        iur b = this.f3643c.mo9091b(iut);
        if (b == null) {
            return new ArrayList(0);
        }
        return gly.m11392a(eag.m1776a(this.f3643c.mo13218b(b).mo9063b(256)), this.f3642b.mo1997a());
    }

    /* renamed from: b */
    final kbg mo6159b(iut iut) {
        iur b = this.f3643c.mo9091b(iut);
        if (b == null) {
            return kau.f21835a;
        }
        kbg b2 = this.f3644d.mo12367b(b);
        if (b2.mo9709b()) {
            boolean z;
            List a = ((bez) b2.mo9706a()).mo1931a(inc.FPS_30);
            if (a.size() >= 3) {
                z = true;
            } else {
                z = false;
            }
            jri.m13395a(z);
            eao eao = new eao();
            eao.f3668a = ((iob) jri.m13404b(iob.m3976a((ine) a.get(0)))).f7574a;
            eao.f3669b = ((iob) jri.m13404b(iob.m3976a((ine) a.get(1)))).f7574a;
            eao.f3670c = ((iob) jri.m13404b(iob.m3976a((ine) a.get(2)))).f7574a;
            return kbg.m4804c(eao);
        }
        bli.m898e(f3641a, "CamcorderCharacteristics not available");
        return kau.f21835a;
    }
}
