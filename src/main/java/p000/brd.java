package p000;

/* renamed from: brd */
public final /* synthetic */ class brd implements kaw {
    /* renamed from: a */
    private final bsn f11724a;
    /* renamed from: b */
    private final bsq f11725b;

    public brd(bsn bsn, bsq bsq) {
        this.f11724a = bsn;
        this.f11725b = bsq;
    }

    /* renamed from: a */
    public final Object mo9689a(Object obj) {
        boolean z = false;
        Boolean bool = (Boolean) obj;
        if (this.f11724a.mo2107a(this.f11725b) && bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
