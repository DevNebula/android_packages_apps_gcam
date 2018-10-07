package p000;

/* compiled from: PG */
/* renamed from: fcr */
public final class fcr implements kwk {
    /* renamed from: a */
    private final kwk f18126a;
    /* renamed from: b */
    private final kwk f18127b;
    /* renamed from: c */
    private final kwk f18128c;

    private fcr(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f18126a = kwk;
        this.f18127b = kwk2;
        this.f18128c = kwk3;
    }

    /* renamed from: a */
    public static fcr m10374a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new fcr(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object obj;
        fde fde;
        kwk kwk = this.f18126a;
        kwk kwk2 = this.f18127b;
        kwk kwk3 = this.f18128c;
        hjf hjf = (hjf) kwk.mo10566a();
        ivy ivy = hjf.f6633b;
        int obj2;
        if (ivy.f7874d) {
            obj2 = 1;
        } else if (ivy.f7875e) {
            obj2 = 1;
        } else if (hjf.mo7905c()) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            fde = (fde) kwk3.mo10566a();
        } else {
            fde = (fde) kwk2.mo10566a();
        }
        return (fde) ktm.m14219a(new fdj(fde), "Cannot return null from a non-@Nullable @Provides method");
    }
}
