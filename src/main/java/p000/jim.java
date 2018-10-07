package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: jim */
public final class jim implements jif {
    /* renamed from: a */
    private final jif[] f21529a;

    public jim(List list) {
        this((jif[]) list.toArray(new jif[list.size()]));
    }

    private jim(jif... jifArr) {
        boolean z;
        int i = 0;
        jri.m13404b((Object) jifArr);
        int length = jifArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "empty array");
        while (i < length) {
            jri.m13404b(jifArr[i]);
            i++;
        }
        this.f21529a = jifArr;
    }

    /* renamed from: a */
    public final int mo9453a() {
        int i = 0;
        jif[] jifArr = this.f21529a;
        int i2 = 0;
        while (i < jifArr.length) {
            i2 += jifArr[i].mo9453a();
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public final synchronized void mo9455b() {
        for (jif b : this.f21529a) {
            b.mo9455b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo9454a(jzt jzt) {
        jzt jzo = new jzo(jzt);
        for (jif a : this.f21529a) {
            a.mo9454a(jzo);
        }
    }

    /* renamed from: c */
    public final synchronized void mo9456c() {
        for (jif c : this.f21529a) {
            c.mo9456c();
        }
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f21529a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 34);
        stringBuilder.append("MultiFeatureExtractor[extractors=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
