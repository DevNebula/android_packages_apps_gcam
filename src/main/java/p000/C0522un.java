package p000;

import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: un */
public final class C0522un {
    /* renamed from: a */
    public SparseArray f9836a = new SparseArray();
    /* renamed from: b */
    public int f9837b = 0;

    /* renamed from: a */
    final C0523uo mo11287a(int i) {
        C0523uo c0523uo = (C0523uo) this.f9836a.get(i);
        if (c0523uo != null) {
            return c0523uo;
        }
        c0523uo = new C0523uo();
        this.f9836a.put(i, c0523uo);
        return c0523uo;
    }

    /* renamed from: a */
    static long m6056a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }
}
