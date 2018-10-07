package p000;

import java.util.Iterator;

/* renamed from: fye */
final /* synthetic */ class fye implements kaw {
    /* renamed from: a */
    private final fyd f18900a;

    fye(fyd fyd) {
        this.f18900a = fyd;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        fyd fyd = this.f18900a;
        obj = (bbo) obj;
        jri.m13404b(obj);
        bbo bbo = new bbo();
        Iterator it = obj.iterator();
        while (it.hasNext()) {
            bbo.add(new fyh(fyd, (fyr) it.next()));
        }
        return bbo;
    }
}
