package p000;

import android.hardware.camera2.CaptureResult.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dtv */
public final class dtv implements dty {
    /* renamed from: a */
    private final int f16771a = 1;
    /* renamed from: b */
    private final keu f16772b;
    /* renamed from: c */
    private final dty f16773c;

    public dtv(dty dty, Collection collection) {
        jri.m13395a(true);
        this.f16773c = dty;
        this.f16772b = keu.m13732a(collection);
    }

    /* renamed from: a */
    public final List mo6058a(List list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        boolean z;
        List a = this.f16773c.mo6058a(list);
        if (a.size() == list.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        List arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (((Boolean) a.get(i)).booleanValue()) {
                if (i > 0) {
                    int i2 = i - 1;
                    iwp iwp = (iwp) list.get(i);
                    iwp iwp2 = (iwp) list.get(i2);
                    Iterator c = this.f16772b.iterator();
                    while (c.hasNext()) {
                        Key key = (Key) c.next();
                        if (!kbf.m16778b(iwp.mo13730a(key), iwp2.mo13730a(key))) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                        arrayList.add(Integer.valueOf(((Integer) arrayList.get(i2)).intValue() + 1));
                    }
                }
                arrayList.add(Integer.valueOf(1));
            } else {
                arrayList.add(Integer.valueOf(0));
            }
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            if (((Integer) arrayList.get(size)).intValue() >= this.f16771a) {
                break;
            }
            size--;
        }
        size = -1;
        if (size == -1) {
            List arrayList2 = new ArrayList(list.size());
            for (int i3 = 0; i3 < list.size(); i3++) {
                arrayList2.add(Boolean.valueOf(false));
            }
            return arrayList2;
        }
        List emptyList;
        int intValue = ((Integer) arrayList.get(size)).intValue();
        boolean[] zArr = new boolean[list.size()];
        if (zArr.length == 0) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new kmh(zArr);
        }
        intValue = (size - intValue) + 1;
        while (size >= intValue) {
            emptyList.set(size, Boolean.valueOf(true));
            size--;
        }
        return emptyList;
    }
}
