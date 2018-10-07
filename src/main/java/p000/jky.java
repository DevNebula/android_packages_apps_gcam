package p000;

import com.google.android.libraries.smartburst.utils.Feature;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jky */
public final class jky {
    /* renamed from: a */
    private final int f8267a;
    /* renamed from: b */
    private final int[] f8268b;
    /* renamed from: c */
    private final /* synthetic */ jkx f8269c;

    jky(jkx jkx, int[] iArr, int i) {
        this.f8269c = jkx;
        this.f8268b = iArr;
        this.f8267a = i;
    }

    /* renamed from: a */
    public final Feature mo9479a(jza jza) {
        return this.f8269c.mo13811a(jza, this.f8267a, this.f8268b[jza.f8497z]);
    }

    /* renamed from: a */
    public final Feature[] mo9480a() {
        Feature[] featureArr = new Feature[this.f8269c.f21602a.size()];
        Iterator it = this.f8269c.f21602a.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            featureArr[i] = mo9479a((jza) it.next());
            i = i2;
        }
        return featureArr;
    }

    /* renamed from: b */
    public final long mo9481b() {
        return this.f8269c.mo13810a(this.f8267a);
    }
}
