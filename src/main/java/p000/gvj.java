package p000;

import android.graphics.PointF;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gvj */
public final class gvj implements hns {
    /* renamed from: a */
    public final atb f19676a;
    /* renamed from: b */
    public final hig f19677b;
    /* renamed from: c */
    public final hik f19678c;
    /* renamed from: d */
    public final iut f19679d;
    /* renamed from: e */
    public aub f19680e;
    /* renamed from: f */
    public hiv f19681f = null;
    /* renamed from: g */
    public hiv f19682g = null;
    /* renamed from: h */
    private final asl f19683h;
    /* renamed from: i */
    private final asx f19684i;
    /* renamed from: j */
    private final Set f19685j;
    /* renamed from: k */
    private iqo f19686k = null;
    /* renamed from: l */
    private final iju f19687l = new gvp(this);

    public gvj(asx asx, atb atb, hig hig, hik hik, iut iut, asl asl, Set set) {
        this.f19676a = atb;
        this.f19677b = hig;
        this.f19678c = hik;
        this.f19679d = iut;
        this.f19683h = asl;
        this.f19684i = asx;
        this.f19685j = set;
    }

    /* renamed from: a */
    public final void mo7974a() {
        aub aub = this.f19680e;
        if (aub != null) {
            aub.mo1802e();
        }
    }

    /* renamed from: a */
    public final boolean mo7975a(PointF pointF) {
        return true;
    }

    /* renamed from: b */
    public final boolean mo7976b(PointF pointF) {
        hiv hiv = this.f19681f;
        if (hiv != null) {
            hiv.mo7895a();
        }
        hiv = this.f19682g;
        if (hiv != null) {
            hiv.mo7895a();
        }
        iqo iqo = this.f19686k;
        if (iqo != null) {
            iqo.close();
        }
        for (hnr a : this.f19685j) {
            a.mo7975a(pointF);
        }
        this.f19683h.mo1781a();
        this.f19681f = this.f19676a.mo12313a(pointF);
        this.f19681f.mo7896a(new gvk(this));
        atc a2 = this.f19683h.mo1781a();
        this.f19680e = this.f19684i.mo1788a(this.f19679d, pointF, a2);
        iel.m3774a(this.f19681f.mo7897b(), this.f19680e.mo1800c(), this.f19687l, iel.m3771a());
        this.f19686k = this.f19680e.mo1799b().mo13672a(new gvl(this), kpq.f8776a);
        kpk c = this.f19680e.mo1800c();
        atb atb = this.f19676a;
        atb.getClass();
        c.mo10200a(new gvm(atb), iel.m3771a());
        iel.m3776a(a2.mo1792a(), new gvn(this), kpq.f8776a);
        iel.m3776a(a2.mo1793b(), new gvo(this), kpq.f8776a);
        return true;
    }
}
