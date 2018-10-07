package p000;

/* compiled from: PG */
/* renamed from: ajb */
public final class ajb implements ajz {
    /* renamed from: a */
    private final ajc f10330a;

    public ajb(ajc ajc) {
        this.f10330a = ajc;
    }

    /* renamed from: a */
    public final aka mo343a(Object obj, int i, int i2, adp adp) {
        return new aka(new arf(obj), new ajd(obj.toString(), this.f10330a));
    }

    /* renamed from: a */
    public final boolean mo344a(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
