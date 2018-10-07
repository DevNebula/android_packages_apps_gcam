package p000;

/* compiled from: PG */
/* renamed from: eoz */
public final class eoz implements kwk {
    /* renamed from: a */
    private final kwk f17583a;
    /* renamed from: b */
    private final kwk f17584b;
    /* renamed from: c */
    private final kwk f17585c;

    public eoz(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17583a = kwk;
        this.f17584b = kwk2;
        this.f17585c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17583a;
        kwk kwk2 = this.f17584b;
        kwk kwk3 = this.f17585c;
        Object a = kwk.mo10566a();
        Object obj = (enf) kwk2.mo10566a();
        Object obj2 = (ikd) kwk3.mo10566a();
        eol eol = (epa) a;
        jri.m13404b(obj2);
        jri.m13404b(obj);
        jri.m13404b((Object) eol);
        if (ikd.m12502b()) {
            obj.mo13164a(eol);
        } else {
            obj2.execute(new eoo(obj, eol));
        }
        return (hjw) ktm.m14219a(eol, "Cannot return null from a non-@Nullable @Provides method");
    }
}
