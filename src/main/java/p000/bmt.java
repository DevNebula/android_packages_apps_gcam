package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: bmt */
public final class bmt {
    /* renamed from: a */
    public static final bsa f1354a = new bsa("camera.narrow_cam");
    /* renamed from: b */
    public static final bsa f1355b = new bsa("camera.wide_cam");

    /* renamed from: a */
    public static float m917a(iun iun) {
        double a = ion.m3993a(iun);
        Collection g = iun.mo9068g();
        double a2 = ion.m3993a(iun);
        Iterator it = iun.mo9068g().iterator();
        float f = -1.0f;
        double d = -100.0d;
        while (true) {
            float f2 = f;
            double d2 = d;
            if (!it.hasNext()) {
                return (float) (a / ion.m3991a(ion.m3992a(f2, a), ((Float) Collections.min(g)).floatValue()));
            }
            Float f3 = (Float) it.next();
            double a3 = ion.m3992a(f3.floatValue(), a2);
            if (Math.abs(-1.4085350036621094d + a3) < Math.abs(-1.4085350036621094d + d2)) {
                f = f3.floatValue();
                d = a3;
            } else {
                double d3 = d2;
                f = f2;
                d = d3;
            }
        }
    }

    /* renamed from: a */
    public static iur m919a(iuo iuo, hjf hjf, iut iut) {
        boolean z;
        if (iut != iut.FRONT) {
            z = false;
        } else if (hjf.mo7906d()) {
            z = true;
        } else {
            z = false;
        }
        List b = khb.m4945b();
        for (iur a : iuo.mo9092b()) {
            b.add(iuo.mo9088a(a));
        }
        iru iru = new iru(b);
        iru.f7747a = iru.m4193a(iru.f7747a, new irw(iut));
        iru.f7747a = iru.m4193a(iru.f7747a, new irv(z));
        ArrayList b2 = khb.m4945b();
        for (iun d : iru.f7747a) {
            b2.add(d.mo9065d());
        }
        if (b2.isEmpty()) {
            return null;
        }
        if (z) {
            return (iur) b2.get(0);
        }
        List b3 = khb.m4945b();
        int size = b2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            b3.add(iuo.mo9088a((iur) b2.get(i)));
            i = i2;
        }
        Collections.sort(b3, bmu.f1356a);
        return ((iun) b3.get(0)).mo9065d();
    }
}
