package p000;

import android.view.Surface;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: bhk */
final class bhk implements iwh {
    /* renamed from: a */
    private final Map f11390a;
    /* renamed from: b */
    private final /* synthetic */ bhj f11391b;

    bhk(bhj bhj, Map map) {
        this.f11391b = bhj;
        this.f11390a = map;
    }

    /* renamed from: a */
    private final fiw m7468a(iwo iwo) {
        boolean z = true;
        Object b = iwo.mo13727b();
        if (b != null || !this.f11391b.f11387c.f7870e) {
            return (fiw) this.f11390a.get(b);
        }
        bli.m891b(bhj.f11385a, "Invoking listener for null tag, ideally should never happen");
        if (this.f11390a.size() != 1) {
            z = false;
        }
        jri.m13406b(z, (Object) "Since we submit one request at a time, only one listener should be in the map.");
        return (fiw) ((Entry) this.f11390a.entrySet().iterator().next()).getValue();
    }

    /* renamed from: a */
    public final void mo9122a(iwo iwo, Surface surface, long j) {
        ((fiw) jri.m13404b(m7468a(iwo))).mo6823a(surface, j);
    }

    /* renamed from: a */
    public final void mo9124a(iwo iwo, iwp iwp) {
        ((fiw) jri.m13404b(m7468a(iwo))).mo6826a_(iwp);
    }

    /* renamed from: a */
    public final void mo9123a(iwo iwo, iwm iwm) {
        ((fiw) jri.m13404b(m7468a(iwo))).mo6825a(iwm);
    }

    /* renamed from: b */
    public final void mo9125b(iwo iwo, iwp iwp) {
        ((fiw) jri.m13404b(m7468a(iwo))).mo6828c(iwp);
    }

    /* renamed from: a */
    public final void mo9119a(int i) {
        for (fiw a : this.f11390a.values()) {
            a.mo6821a(i);
        }
    }

    /* renamed from: a */
    public final void mo9120a(int i, long j) {
        for (fiw a : this.f11390a.values()) {
            a.mo6822a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo9121a(iwo iwo, long j, long j2) {
        ((fiw) jri.m13404b(m7468a(iwo))).mo6824a(new fhq(j, (long) this.f11391b.f11386b.incrementAndGet(), j2));
    }
}
