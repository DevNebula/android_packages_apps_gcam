package p000;

/* compiled from: PG */
/* renamed from: cbb */
final class cbb implements kov {
    /* renamed from: a */
    private final /* synthetic */ int f12106a;
    /* renamed from: b */
    private final /* synthetic */ boolean f12107b;
    /* renamed from: c */
    private final /* synthetic */ String f12108c;
    /* renamed from: d */
    private final /* synthetic */ gdy f12109d;
    /* renamed from: e */
    private final /* synthetic */ kpw f12110e;
    /* renamed from: f */
    private final /* synthetic */ cau f12111f;

    cbb(cau cau, int i, boolean z, String str, gdy gdy, kpw kpw) {
        this.f12111f = cau;
        this.f12106a = i;
        this.f12107b = z;
        this.f12108c = str;
        this.f12109d = gdy;
        this.f12110e = kpw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m891b(car.f22871a, "Error encoding jpeg image");
        this.f12110e.mo15641a(Boolean.valueOf(false));
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        try {
            this.f12111f.m17242a((foz) jri.m13404b((foz) obj), this.f12106a, this.f12107b, this.f12108c, null, this.f12109d);
            this.f12110e.mo15641a(Boolean.valueOf(true));
        } catch (Exception e) {
            String str = car.f22871a;
            String valueOf = String.valueOf(e.getMessage());
            String str2 = "Error attaching jpeg image to the session: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m891b(str, valueOf);
            this.f12110e.mo15641a(Boolean.valueOf(false));
        }
    }
}
