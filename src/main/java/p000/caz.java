package p000;

/* compiled from: PG */
/* renamed from: caz */
final class caz implements kov {
    /* renamed from: a */
    private final /* synthetic */ cat f12099a;
    /* renamed from: b */
    private final /* synthetic */ hjo f12100b;
    /* renamed from: c */
    private final /* synthetic */ long f12101c;
    /* renamed from: d */
    private final /* synthetic */ cau f12102d;

    caz(cau cau, cat cat, hjo hjo, long j) {
        this.f12102d = cau;
        this.f12099a = cat;
        this.f12100b = hjo;
        this.f12101c = j;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f12100b.close();
        this.f12102d.mo15476a(this.f12101c);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Boolean bool = (Boolean) obj;
        cau cau = this.f12102d;
        cau.f25528j = Boolean.TRUE.equals(bool) | cau.f25528j;
        if (!Boolean.TRUE.equals(bool)) {
            String str = car.f22871a;
            String valueOf = String.valueOf(this.f12099a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("Error encoding the image: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
        }
        this.f12100b.close();
        this.f12102d.mo15476a(this.f12101c);
    }
}
