package p000;

/* compiled from: PG */
/* renamed from: atg */
final class atg implements iqt {
    /* renamed from: a */
    private boolean f10720a = true;
    /* renamed from: b */
    private final /* synthetic */ atd f10721b;

    atg(atd atd) {
        this.f10721b = atd;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f10720a) {
            this.f10720a = false;
        } else if (!bool.booleanValue()) {
            this.f10721b.close();
        }
    }
}
