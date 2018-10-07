package p000;

/* renamed from: ieo */
public final class ieo {
    /* renamed from: a */
    public static final huh f7343a = new huh("LocationServices.API", f7345c, f7344b);
    /* renamed from: b */
    private static final hum f7344b = new hum((byte) 0);
    /* renamed from: c */
    private static final huk f7345c = new iep();

    static {
        iel iel = new iel();
        iem iem = new iem();
        ier ier = new ier();
    }

    /* renamed from: a */
    public static iff m3782a(huq huq) {
        boolean z = true;
        htl.m3493b(huq != null, (Object) "GoogleApiClient parameter is required.");
        iff iff = (iff) huq.mo8133a(f7344b);
        if (iff == null) {
            z = false;
        }
        htl.m3479a(z, (Object) "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return iff;
    }
}
