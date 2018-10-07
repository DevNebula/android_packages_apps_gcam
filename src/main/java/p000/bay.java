package p000;

/* compiled from: PG */
/* renamed from: bay */
final class bay implements koj {
    /* renamed from: a */
    private final /* synthetic */ String f11144a;
    /* renamed from: b */
    private final /* synthetic */ kwk f11145b;
    /* renamed from: c */
    private final /* synthetic */ bax f11146c;

    bay(bax bax, String str, kwk kwk) {
        this.f11146c = bax;
        this.f11144a = str;
        this.f11145b = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo10183a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return kow.m13873a(Boolean.valueOf(false));
        }
        ird ird = this.f11146c.f1080b;
        if (ird == null) {
            return ((ijk) this.f11145b.mo10566a()).mo8560a();
        }
        ird.mo8856a(String.valueOf(this.f11144a).concat("#get"));
        ijk ijk = (ijk) this.f11145b.mo10566a();
        this.f11146c.f1080b.mo8858b(String.valueOf(this.f11144a).concat("#start"));
        kpk a = ijk.mo8560a();
        this.f11146c.f1080b.mo8857b();
        return a;
    }
}
