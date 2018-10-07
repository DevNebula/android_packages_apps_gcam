package p000;

import android.graphics.PointF;
import java.util.Set;

/* compiled from: PG */
/* renamed from: avn */
public final class avn extends hnr {
    /* renamed from: a */
    public final atb f22516a;
    /* renamed from: b */
    public hiv f22517b = null;
    /* renamed from: c */
    public hiv f22518c = null;
    /* renamed from: d */
    private final asl f22519d;
    /* renamed from: e */
    private final asx f22520e;
    /* renamed from: f */
    private final iut f22521f;
    /* renamed from: g */
    private final Set f22522g;
    /* renamed from: h */
    private final iju f22523h = new avs(this);

    public avn(asl asl, asx asx, atb atb, iut iut, Set set) {
        this.f22519d = asl;
        this.f22520e = asx;
        this.f22516a = atb;
        this.f22521f = iut;
        this.f22522g = set;
    }

    /* renamed from: a */
    public final boolean mo7975a(PointF pointF) {
        hiv hiv = this.f22517b;
        if (hiv != null) {
            hiv.mo7895a();
        }
        hiv = this.f22518c;
        if (hiv != null) {
            hiv.mo7895a();
        }
        for (hnr a : this.f22522g) {
            a.mo7975a(pointF);
        }
        atc a2 = this.f22519d.mo1781a();
        this.f22517b = this.f22516a.mo12313a(pointF);
        this.f22517b.mo7896a(new avo(this));
        aub a3 = this.f22520e.mo1788a(this.f22521f, pointF, a2);
        iel.m3774a(this.f22517b.mo7897b(), a3.mo1800c(), this.f22523h, iel.m3771a());
        kpk a4 = a2.mo1792a();
        iel.m3776a(a4, new avp(a3), kpq.f8776a);
        iel.m3776a(a3.mo1801d(), new avq(a4, a3), kpq.f8776a);
        iel.m3776a(a2.mo1793b(), new avr(a3), kpq.f8776a);
        return true;
    }
}
