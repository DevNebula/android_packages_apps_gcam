package p000;

/* renamed from: huh */
public final class huh {
    /* renamed from: a */
    public final String f7041a;
    /* renamed from: b */
    private final huk f7042b;
    /* renamed from: c */
    private final hum f7043c;

    public huh(String str, huk huk, hum hum) {
        htl.m3489b((Object) huk, (Object) "Cannot construct an Api with a null ClientBuilder");
        htl.m3489b((Object) hum, (Object) "Cannot construct an Api with a null ClientKey");
        this.f7041a = str;
        this.f7042b = huk;
        this.f7043c = hum;
    }

    /* renamed from: a */
    public final huk mo8130a() {
        htl.m3479a(this.f7042b != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f7042b;
    }

    /* renamed from: b */
    public final hum mo8131b() {
        hum hum = this.f7043c;
        if (hum != null) {
            return hum;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
