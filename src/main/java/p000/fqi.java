package p000;

import java.util.List;

/* renamed from: fqi */
final /* synthetic */ class fqi implements kaw {
    /* renamed from: a */
    private final fqh f18646a;
    /* renamed from: b */
    private final List f18647b;

    fqi(fqh fqh, List list) {
        this.f18646a = fqh;
        this.f18647b = list;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        fqh fqh = this.f18646a;
        List list = this.f18647b;
        Integer num = (Integer) obj;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                if (i2 != num.intValue()) {
                    ((fkp) list.get(i2)).close();
                }
                i = i2 + 1;
            } else {
                frj a = fri.m10892a((fkp) list.get(num.intValue())).mo6876a(fqh.f24294e.f18637c);
                a.f4895a = (iqm) jri.m13404b(fqh.f24293d);
                return a.mo6875a();
            }
        }
    }
}
