package p000;

/* compiled from: PG */
/* renamed from: alf */
public final class alf implements ajz {
    /* renamed from: a */
    private static final adm f10381a = adm.m169a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    /* renamed from: b */
    private final ajw f10382b;

    public alf() {
        this(null);
    }

    public alf(ajw ajw) {
        this.f10382b = ajw;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        adl adl = (ajl) obj;
        ajw ajw = this.f10382b;
        if (ajw != null) {
            ajl ajl = (ajl) ajw.mo339a(adl);
            if (ajl == null) {
                ajw = this.f10382b;
                ajw.f501a.mo1751b(ajy.m315a(adl), adl);
            } else {
                obj = ajl;
            }
        }
        return new aka(adl, new aeg(adl, ((Integer) adp.mo11616a(f10381a)).intValue()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo344a(Object obj) {
        return true;
    }
}
