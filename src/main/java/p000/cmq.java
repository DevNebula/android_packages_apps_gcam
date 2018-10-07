package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: cmq */
public final class cmq implements C0323jx {
    /* renamed from: a */
    private final /* synthetic */ cmp f12732a;

    public cmq(cmp cmp) {
        this.f12732a = cmp;
    }

    /* renamed from: a */
    public final void mo9587a(int i) {
        if (i == 0) {
            for (Entry entry : this.f12732a.f2356l.entrySet()) {
                cmp cmp = this.f12732a;
                if (!((cot) cmp.f2346b.get(cmp.f2357m.f591e)).f13151c.f13139e.f4384h.equals(entry.getKey())) {
                    ((kvr) entry.getValue()).mo10536e();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9586a() {
    }

    /* renamed from: b */
    public final void mo9588b() {
    }
}
