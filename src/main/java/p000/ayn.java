package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ayn */
public final class ayn implements kwk {
    /* renamed from: a */
    private final kwk f11050a;
    /* renamed from: b */
    private final kwk f11051b;
    /* renamed from: c */
    private final kwk f11052c;
    /* renamed from: d */
    private final kwk f11053d;

    private ayn(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11050a = kwk;
        this.f11051b = kwk2;
        this.f11052c = kwk3;
        this.f11053d = kwk4;
    }

    /* renamed from: a */
    public static ayn m7251a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new ayn(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11050a;
        kwk kwk2 = this.f11051b;
        kwk kwk3 = this.f11052c;
        kwk kwk4 = this.f11053d;
        Object obj = (ayt) kwk.mo10566a();
        Object obj2 = (azf) kwk2.mo10566a();
        kwk3.mo10566a();
        if (((Boolean) ((ilp) kwk4.mo10566a()).mo13673b()).booleanValue()) {
            obj = keu.m13727a(fds.m10416a(keu.m13728a(obj, obj2)));
        } else {
            obj = kgn.f24941a;
        }
        return (Set) ktm.m14219a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
