package p000;

/* compiled from: PG */
/* renamed from: gpx */
final class gpx implements kov {
    /* renamed from: a */
    private final /* synthetic */ int f19475a;
    /* renamed from: b */
    private final /* synthetic */ gpv f19476b;

    gpx(gpv gpv, int i) {
        this.f19476b = gpv;
        this.f19475a = i;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = gpv.f19466a;
        int i = this.f19475a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
        stringBuilder.append("Sound resource ");
        stringBuilder.append(i);
        stringBuilder.append(" failed to load: ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
        this.f19476b.mo13396f(this.f19475a);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            i = 0;
        } else if (bool.booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            this.f19476b.mo13394a(this.f19475a, 0.6f, 0);
            return;
        }
        String str = gpv.f19466a;
        int i2 = this.f19475a;
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("Sound resource ");
        stringBuilder.append(i2);
        stringBuilder.append(" failed to load.");
        bli.m891b(str, stringBuilder.toString());
        this.f19476b.mo13396f(this.f19475a);
    }
}
