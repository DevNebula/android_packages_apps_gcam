package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: baz */
final class baz implements kov {
    /* renamed from: a */
    private final /* synthetic */ String f11147a;
    /* renamed from: b */
    private final /* synthetic */ kwk f11148b;
    /* renamed from: c */
    private final /* synthetic */ bax f11149c;

    baz(bax bax, String str, kwk kwk) {
        this.f11149c = bax;
        this.f11147a = str;
        this.f11148b = kwk;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ird ird = this.f11149c.f1080b;
            Set<gqd> set;
            if (ird != null) {
                ird.mo8856a(String.valueOf(this.f11147a).concat("#get-all"));
                set = (Set) this.f11148b.mo10566a();
                this.f11149c.f1080b.mo8858b(String.valueOf(this.f11147a).concat("#start-all"));
                if (!(set == null || set.isEmpty())) {
                    for (gqd execute : set) {
                        this.f11149c.f1079a.execute(execute);
                    }
                }
                this.f11149c.f1080b.mo8857b();
                return;
            }
            set = (Set) this.f11148b.mo10566a();
            if (set != null && !set.isEmpty()) {
                for (gqd execute2 : set) {
                    this.f11149c.f1079a.execute(execute2);
                }
            }
        }
    }
}
