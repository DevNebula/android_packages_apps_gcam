package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsu */
public final class jsu implements jso {
    /* renamed from: a */
    public final List mo9541a(List list) {
        int i = 0;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int i3 = i;
            if (!it.hasNext()) {
                break;
            }
            String b = ((jsp) it.next()).f8312a.mo9462b();
            if (jiu.m4571b(b) && jiu.m4570a(b) > r1) {
                i2 = jiu.m4570a(b);
            } else if (jiu.m4572c(b) && jiu.m4570a(b) > i3) {
                i3 = jiu.m4570a(b);
            }
            i = i2;
            i2 = i3;
            i3 = i2;
        }
        List arrayList = new ArrayList();
        for (jsp jsp : list) {
            String b2 = jsp.f8312a.mo9462b();
            if ((!jiu.m4571b(b2) || jiu.m4570a(b2) >= r1) && (!jiu.m4572c(b2) || jiu.m4570a(b2) >= i3)) {
                arrayList.add(jsp);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "HighestPriorityInTypeArtifactFilter";
    }
}
