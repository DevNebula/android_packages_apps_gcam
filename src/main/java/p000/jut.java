package p000;

import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: jut */
public final class jut extends jum {
    /* renamed from: a */
    private final jxm f24814a;
    /* renamed from: b */
    private final float f24815b;
    /* renamed from: c */
    private final float f24816c;

    public jut(jxm jxm) {
        this(jxm, (byte) 0);
    }

    private jut(jxm jxm, byte b) {
        jri.m13404b((Object) jxm);
        this.f24814a = jxm;
        this.f24815b = 50.0f;
        this.f24816c = 7.0f;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        jri.m13404b((Object) juh);
        FrameManager.attachToThread();
        try {
            if (!juh.mo9563b()) {
                Object jtz = new jtz(this.f24814a, jxa.f8414e);
                jri.m13404b((Object) juh);
                jri.m13404b(jtz);
                List arrayList = new ArrayList(ken.m13713a(juh.f8350a));
                Collections.sort(arrayList, Collections.reverseOrder(new juy(jtz)));
                Collection b = khb.m4945b();
                while (!arrayList.isEmpty()) {
                    long longValue = ((Long) arrayList.get(0)).longValue();
                    b.add(Long.valueOf(longValue));
                    arrayList.remove(0);
                    jxa a = this.f24814a.mo9599a(longValue);
                    jzp jzp = (jzp) a.mo9589a(jxa.f8411b);
                    List b2 = khb.m4945b();
                    ArrayList arrayList2 = (ArrayList) arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if ((i >= size ? null : 1) == null) {
                            break;
                        }
                        Object obj;
                        int i2 = i + 1;
                        long longValue2 = ((Long) arrayList2.get(i)).longValue();
                        jxa a2 = this.f24814a.mo9599a(longValue2);
                        List list = (List) a.mo9589a(jxa.f8412c);
                        arrayList = (List) a2.mo9589a(jxa.f8412c);
                        List list2 = (List) a.mo9589a(jxa.f8431v);
                        List list3 = (List) a2.mo9589a(jxa.f8431v);
                        int i3 = jzp.f8515a;
                        int i4 = jzp.f8516b;
                        if (list.size() != arrayList.size()) {
                            i = 1;
                        } else if (FaceUtils.getAverageFaceImageDistance(list, arrayList, list2, list3, i3, i4) <= this.f24816c) {
                            obj = null;
                        } else {
                            i = 1;
                        }
                        float abs = Math.abs(((Float) a2.mo9589a(jxa.f8426q)).floatValue() - ((Float) a.mo9589a(jxa.f8426q)).floatValue());
                        float f = this.f24815b;
                        if (obj != null || abs > f) {
                            b2.add(Long.valueOf(longValue2));
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    arrayList = b2;
                }
                juh juh2 = new juh(b);
            }
            FrameManager.detachFromThread();
            return juh;
        } catch (Throwable th) {
            FrameManager.detachFromThread();
        }
    }

    public final String toString() {
        return "DiverseFaceFrameSegmentFilter";
    }
}
