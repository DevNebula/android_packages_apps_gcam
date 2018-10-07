package p000;

import com.google.android.vision.face.Face;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: juv */
public final class juv extends jum {
    /* renamed from: a */
    private final jxm f24826a;
    /* renamed from: b */
    private final float f24827b = 0.5f;

    public juv(jxm jxm) {
        jri.m13404b((Object) jxm);
        jri.m13395a(true);
        this.f24826a = jxm;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        if (juh.mo9565d() <= 1) {
            return juh;
        }
        Set hashSet = new HashSet();
        List arrayList = new ArrayList();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            Collection hashSet2 = new HashSet();
            for (Face trackId : (List) this.f24826a.mo9599a(longValue).mo9589a(jxa.f8412c)) {
                hashSet2.add(Integer.valueOf(trackId.getTrackId()));
            }
            arrayList.add(hashSet2);
            hashSet.addAll(hashSet2);
        }
        if (hashSet.isEmpty()) {
            return juh;
        }
        List a = ken.m13713a(juh.f8350a);
        Collection b = khb.m4945b();
        for (int i = 0; i < a.size(); i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < a.size(); i3++) {
                if (i3 != i) {
                    Set hashSet3 = new HashSet((Collection) arrayList.get(i3));
                    hashSet3.retainAll((Collection) arrayList.get(i));
                    i2 += hashSet3.size();
                }
            }
            if ((((float) i2) / ((float) (a.size() - 1))) / ((float) hashSet.size()) >= this.f24827b) {
                b.add((Long) a.get(i));
            }
        }
        return new juh(b);
    }

    public final String toString() {
        float f = this.f24827b;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("FaceIdOverlapSegmentFilter[minOverlapFraction=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
