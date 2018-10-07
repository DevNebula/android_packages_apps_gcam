package p000;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fmf */
public final class fmf implements kaw, kwk {
    /* renamed from: a */
    private final /* synthetic */ List f18444a;
    /* renamed from: b */
    private final /* synthetic */ Set f18445b;

    public fmf(List list, Set set) {
        this.f18444a = list;
        this.f18445b = set;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        for (fis add : (List) obj) {
            this.f18444a.add(add);
        }
        return new ffw(this.f18444a, this.f18445b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }
}
