package p000;

/* compiled from: PG */
/* renamed from: ffn */
public final class ffn implements kwk {
    /* renamed from: a */
    private final kwk f18214a;
    /* renamed from: b */
    private final kwk f18215b;
    /* renamed from: c */
    private final kwk f18216c;
    /* renamed from: d */
    private final kwk f18217d;
    /* renamed from: e */
    private final kwk f18218e;
    /* renamed from: f */
    private final kwk f18219f;

    private ffn(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f18214a = kwk;
        this.f18215b = kwk2;
        this.f18216c = kwk3;
        this.f18217d = kwk4;
        this.f18218e = kwk5;
        this.f18219f = kwk6;
    }

    /* renamed from: a */
    public static ffn m10477a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new ffn(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18214a;
        kwk kwk2 = this.f18215b;
        ikb ikb = (ikb) kwk.mo10566a();
        ikb ikb2 = (ikb) kwk2.mo10566a();
        fff fff = new fff((ira) this.f18217d.mo10566a(), (ird) this.f18218e.mo10566a(), (ikd) this.f18219f.mo10566a(), this.f18216c);
        fff.getClass();
        ikb.mo8557a(new ffi(fff));
        fff.getClass();
        ikb2.mo8557a(new ffj(fff));
        return (fff) ktm.m14219a(fff, "Cannot return null from a non-@Nullable @Provides method");
    }
}
