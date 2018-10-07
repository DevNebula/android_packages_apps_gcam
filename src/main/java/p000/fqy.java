package p000;

/* compiled from: PG */
/* renamed from: fqy */
final class fqy implements fow {
    /* renamed from: a */
    private final /* synthetic */ gfw f18674a;
    /* renamed from: b */
    private final /* synthetic */ fqx f18675b;

    fqy(fqx fqx, gfw gfw) {
        this.f18675b = fqx;
        this.f18674a = gfw;
    }

    /* renamed from: a */
    public final kpk mo6864a() {
        kpk d = kpw.m18486d();
        fqx fqx = this.f18675b;
        fqx.f18667a.execute(new fqz(fqx, this.f18674a, d));
        return d;
    }

    /* renamed from: b */
    public final kpk mo6865b() {
        this.f18674a.f5387b.close();
        return kow.m13874a(new isr("Software jpeg saver was closed"));
    }
}
