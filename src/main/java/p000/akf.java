package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: akf */
final class akf implements ajz {
    /* renamed from: a */
    private final List f10355a;
    /* renamed from: b */
    private final C0300iw f10356b;

    akf(List list, C0300iw c0300iw) {
        this.f10355a = list;
        this.f10356b = c0300iw;
    }

    /* renamed from: a */
    public final aka mo343a(Object obj, int i, int i2, adp adp) {
        int size = this.f10355a.size();
        List arrayList = new ArrayList(size);
        int i3 = 0;
        adl adl = null;
        while (i3 < size) {
            adl adl2;
            ajz ajz = (ajz) this.f10355a.get(i3);
            if (ajz.mo344a(obj)) {
                aka a = ajz.mo343a(obj, i, i2, adp);
                if (a != null) {
                    adl2 = a.f506a;
                    arrayList.add(a.f508c);
                } else {
                    adl2 = adl;
                }
            } else {
                adl2 = adl;
            }
            i3++;
            adl = adl2;
        }
        if (arrayList.isEmpty() || adl == null) {
            return null;
        }
        return new aka(adl, new akg(arrayList, this.f10356b));
    }

    /* renamed from: a */
    public final boolean mo344a(Object obj) {
        for (ajz a : this.f10355a) {
            if (a.mo344a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f10355a.toArray());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 31);
        stringBuilder.append("MultiModelLoader{modelLoaders=");
        stringBuilder.append(arrays);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
