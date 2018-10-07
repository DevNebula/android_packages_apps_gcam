package p000;

import android.util.Pair;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: exj */
public final class exj extends exh implements exi, ikz {
    /* renamed from: a */
    private final ixb f24226a;
    /* renamed from: b */
    private final Map f24227b;
    /* renamed from: c */
    private final Map f24228c;
    /* renamed from: d */
    private final bmb f24229d;
    /* renamed from: e */
    private final boolean f24230e;

    public exj(bmb bmb, ixb ixb, int i) {
        boolean z;
        super(i);
        if (i <= ixb.mo13752f()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f24226a = ixb;
        this.f24229d = bmb;
        this.f24227b = kes.m4867b(bmb.f1332I, Integer.valueOf(45), bmb.f1305F, Integer.valueOf(3));
        this.f24228c = khb.m4958c();
        this.f24230e = bmb.mo2022d();
        this.f24228c.put(bmb.f1332I, Boolean.valueOf(this.f24230e));
        this.f24228c.put(bmb.f1305F, Boolean.valueOf(bmb.mo2021c()));
    }

    /* renamed from: d */
    protected final Pair mo13197d() {
        iwz b = this.f24226a.mo13748b();
        if (b == null) {
            return null;
        }
        return Pair.create(Long.valueOf(b.mo13744f()), new iuz(b));
    }

    /* renamed from: a */
    public final synchronized void mo13199a(boolean z) {
        if (this.f24230e) {
            this.f24228c.put(Boolean.valueOf(this.f24229d.mo2022d()), Boolean.valueOf(z));
            int i = 0;
            for (Entry entry : this.f24227b.entrySet()) {
                Object key = entry.getKey();
                if (this.f24228c.containsKey(key) && ((Boolean) this.f24228c.get(key)).booleanValue()) {
                    i = ((Integer) entry.getValue()).intValue() + i;
                }
            }
            mo13196a(i);
        }
    }

    public final void close() {
        this.f24226a.close();
        iwz iwz = (iwz) mo6661c();
        while (iwz != null) {
            iwz.close();
            iwz = (iwz) mo6661c();
        }
    }

    /* renamed from: t_ */
    public final String mo8597t_() {
        return "VideoFrameStore";
    }
}
