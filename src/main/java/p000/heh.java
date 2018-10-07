package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: heh */
public final class heh {
    /* renamed from: a */
    private final ffc f6454a;
    /* renamed from: b */
    private final heq f6455b;

    public heh(ffc ffc, heq heq) {
        jri.m13404b((Object) ffc);
        jri.m13404b((Object) heq);
        this.f6454a = ffc;
        this.f6455b = heq;
    }

    /* renamed from: a */
    public final iqp mo7763a(ipz ipz, inc inc, ine ine) {
        if (inc.mo8637d()) {
            return ine.mo8639c();
        }
        iut c = this.f6454a.mo9064c();
        List arrayList = new ArrayList();
        for (iqp iqp : this.f6454a.mo9078q()) {
            if (iqp.mo8812a() <= ine.mo8638b()) {
                arrayList.add(iqp);
            }
        }
        jri.m13395a(arrayList.isEmpty() ^ 1);
        return this.f6455b.mo7776a(arrayList, ipz, c, true);
    }
}
