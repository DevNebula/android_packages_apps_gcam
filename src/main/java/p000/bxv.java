package p000;

import android.util.ArraySet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bxv */
public final class bxv implements kwk {
    /* renamed from: a */
    private final kwk f11939a;

    private bxv(kwk kwk) {
        this.f11939a = kwk;
    }

    /* renamed from: a */
    public static bxv m7955a(kwk kwk) {
        return new bxv(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        ilp ilp = (ilp) this.f11939a.mo10566a();
        Set arraySet = new ArraySet();
        arraySet.add(ilq.m3876a(bxh.POSTVIEW));
        arraySet.add(ilq.m3875a(ilp, bxp.f11927a));
        return (Set) ktm.m14219a(arraySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
