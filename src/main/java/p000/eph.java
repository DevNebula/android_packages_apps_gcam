package p000;

/* compiled from: PG */
/* renamed from: eph */
public final class eph {
    /* renamed from: c */
    public static final eph f4238c = new eph(epi.INIT, ken.m13719e());
    /* renamed from: d */
    public static final eph f4239d = new eph(epi.CREATED, ken.m13709a(epi.INIT, epi.STOPPED));
    /* renamed from: e */
    public static final eph f4240e = new eph(epi.STARTED, ken.m13710a(epi.INIT, epi.STOPPED, epi.CREATED));
    /* renamed from: f */
    public static final eph f4241f = new eph(epi.SHUTTER_BUTTON_DRAWN, ken.m13708a(epi.STARTED));
    /* renamed from: g */
    public static final eph f4242g = new eph(epi.SHUTTER_BUTTON_ENABLED, ken.m13708a(epi.SHUTTER_BUTTON_DRAWN));
    /* renamed from: h */
    public static final eph f4243h = new eph(epi.STOPPED, ken.m13708a(epi.ANY));
    /* renamed from: a */
    public final epi f4244a;
    /* renamed from: b */
    public final ken f4245b;

    static {
        eph eph = new eph(epi.INVALID, ken.m13719e());
    }

    private eph(epi epi, ken ken) {
        this.f4244a = epi;
        this.f4245b = ken;
    }

    public final String toString() {
        return this.f4244a.name();
    }
}
