package p000;

/* compiled from: PG */
/* renamed from: ksu */
final class ksu implements kts {
    /* renamed from: b */
    private static final ktd f21977b = new ksv();
    /* renamed from: a */
    private final ktd f21978a;

    public ksu() {
        this(new ksw(krx.f21974a, ksu.m14150a()));
    }

    private ksu(ktd ktd) {
        this.f21978a = (ktd) ksd.m5194a((Object) ktd, "messageInfoFactory");
    }

    /* renamed from: a */
    public final ktr mo10369a(Class cls) {
        ktt.m5302a(cls);
        ktc b = this.f21978a.mo10311b(cls);
        if (b.mo10309c()) {
            if (kry.class.isAssignableFrom(cls)) {
                return kti.m14208a(ktt.f8915c, krq.f8815a, b.mo10307a());
            }
            return kti.m14208a(ktt.f8913a, krq.m5173a(), b.mo10307a());
        } else if (kry.class.isAssignableFrom(cls)) {
            if (ksu.m14151a(b)) {
                return kth.m14174a(b, ktl.f8909b, ksq.f8903b, ktt.f8915c, krq.f8815a, ktb.f8907b);
            }
            return kth.m14174a(b, ktl.f8909b, ksq.f8903b, ktt.f8915c, null, ktb.f8907b);
        } else if (ksu.m14151a(b)) {
            return kth.m14174a(b, ktl.f8908a, ksq.f8902a, ktt.f8913a, krq.m5173a(), ktb.f8906a);
        } else {
            return kth.m14174a(b, ktl.f8908a, ksq.f8902a, ktt.f8914b, null, ktb.f8906a);
        }
    }

    /* renamed from: a */
    private static ktd m14150a() {
        try {
            return (ktd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return f21977b;
        }
    }

    /* renamed from: a */
    private static boolean m14151a(ktc ktc) {
        return ktc.mo10308b() == C0252go.f5909cb;
    }
}
