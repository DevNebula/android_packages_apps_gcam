package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsq */
public final class jsq extends jum {
    /* renamed from: a */
    private final jsr f24798a;
    /* renamed from: b */
    private final float f24799b;
    /* renamed from: c */
    private final int f24800c;
    /* renamed from: d */
    private final int f24801d;

    private jsq(jtv jtv, int i) {
        this.f24798a = new jsr((jtv) jri.m13404b((Object) jtv));
        this.f24799b = 0.8f;
        this.f24800c = i;
        this.f24801d = 1;
    }

    public jsq(jtv jtv, int i, byte b) {
        this(jtv, i);
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        jri.m13404b((Object) juh);
        if (juh.mo9563b()) {
            Log.d("ContentValueSegmentFilter", "Empty image set passed in! Nothing to do.");
            return new juh(khb.m4945b());
        }
        List e;
        StringBuilder stringBuilder;
        int i;
        jss jss;
        jsr jsr = this.f24798a;
        jri.m13404b((Object) juh);
        jri.m13404b(jsr.f8314a);
        if (juh.mo9563b()) {
            e = ken.m13719e();
        } else {
            long longValue;
            List arrayList = new ArrayList();
            jsr.f8314a.mo9555a();
            Iterator it = juh.iterator();
            while (it.hasNext()) {
                longValue = ((Long) it.next()).longValue();
                stringBuilder = new StringBuilder(34);
                stringBuilder.append("Adding frame: ");
                stringBuilder.append(longValue);
                Log.d("ContentValueSegmentFilter", stringBuilder.toString());
                jsr.f8314a.mo9557c(longValue);
            }
            i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= juh.mo9565d()) {
                    break;
                }
                float a;
                Log.d("ContentValueSegmentFilter", "CalcLeastValueFrame.");
                Iterator it2 = juh.iterator();
                longValue = -1;
                float f = Float.MAX_VALUE;
                while (it2.hasNext()) {
                    Object obj;
                    long longValue2 = ((Long) it2.next()).longValue();
                    stringBuilder = new StringBuilder(39);
                    stringBuilder.append("Considering frame: ");
                    stringBuilder.append(longValue2);
                    Log.d("ContentValueSegmentFilter", stringBuilder.toString());
                    int size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        int i3 = i + 1;
                        long j = ((jss) arrayList.get(i)).f8315a;
                        if (j == longValue2) {
                            stringBuilder = new StringBuilder(43);
                            stringBuilder.append("frame ");
                            stringBuilder.append(j);
                            stringBuilder.append(" already dropped!");
                            Log.d("ContentValueSegmentFilter", stringBuilder.toString());
                            obj = 1;
                            break;
                        }
                        i = i3;
                    }
                    obj = null;
                    if (obj == null) {
                        a = jsr.f8314a.mo9554a(longValue2).mo9629a();
                        StringBuilder stringBuilder2 = new StringBuilder(24);
                        stringBuilder2.append("Score is ");
                        stringBuilder2.append(a);
                        Log.d("ContentValueSegmentFilter", stringBuilder2.toString());
                        if (a < f) {
                            longValue = longValue2;
                        }
                        if (a >= f) {
                            a = f;
                        }
                        f = a;
                    }
                }
                if (longValue == -1) {
                    jss = null;
                } else {
                    jss = new jss(longValue, f);
                }
                if (jss != null) {
                    arrayList.add(jss);
                    jsr.f8314a.mo9556b(jss.f8315a);
                    longValue = jss.f8315a;
                    a = jss.f8316b;
                    StringBuilder stringBuilder3 = new StringBuilder(85);
                    stringBuilder3.append(" Iteration: ");
                    stringBuilder3.append(i2);
                    stringBuilder3.append(" Least value Frame ");
                    stringBuilder3.append(longValue);
                    stringBuilder3.append(" Value: ");
                    stringBuilder3.append(a);
                    Log.d("ContentValueSegmentFilter", stringBuilder3.toString());
                }
                i = i2 + 1;
            }
            e = arrayList;
        }
        Collection arrayList2 = new ArrayList();
        long j2 = ((jss) e.get(e.size() - 1)).f8315a;
        arrayList2.add(Long.valueOf(j2));
        stringBuilder = new StringBuilder(37);
        stringBuilder.append("Including frame: ");
        stringBuilder.append(j2);
        Log.d("ContentValueSegmentFilter", stringBuilder.toString());
        for (int d = juh.mo9565d() - 2; d >= 0; d--) {
            jss = (jss) e.get(d);
            j2 = jss.f8315a;
            StringBuilder stringBuilder4 = new StringBuilder(42);
            stringBuilder4.append("considering including ");
            stringBuilder4.append(j2);
            Log.d("ContentValueSegmentFilter", stringBuilder4.toString());
            if (arrayList2.size() >= this.f24801d) {
                j2 = jss.f8315a;
                float f2 = jss.f8316b;
                StringBuilder stringBuilder5 = new StringBuilder(68);
                stringBuilder5.append("shouldIncludeFrame ");
                stringBuilder5.append(j2);
                stringBuilder5.append(" frameValue = ");
                stringBuilder5.append(f2);
                Log.d("ContentValueSegmentFilter", stringBuilder5.toString());
                if (jss.f8316b >= this.f24799b) {
                    if (arrayList2.size() >= this.f24800c) {
                    }
                }
            }
            arrayList2.add(Long.valueOf(jss.f8315a));
        }
        i = arrayList2.size();
        StringBuilder stringBuilder6 = new StringBuilder(43);
        stringBuilder6.append("Filtered to a new stack of size ");
        stringBuilder6.append(i);
        Log.d("ContentValueSegmentFilter", stringBuilder6.toString());
        return new juh(arrayList2, juh.f8351b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24798a.f8314a);
        float f = this.f24799b;
        int i = this.f24800c;
        int i2 = this.f24801d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 107);
        stringBuilder.append("ContentValueSegmentFilter[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", threshold=");
        stringBuilder.append(f);
        stringBuilder.append(", maxFrames=");
        stringBuilder.append(i);
        stringBuilder.append(", minFrames=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
