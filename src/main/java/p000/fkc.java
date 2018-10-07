package p000;

/* compiled from: PG */
/* renamed from: fkc */
final class fkc implements koj {
    /* renamed from: a */
    private final /* synthetic */ fhq f18353a;
    /* renamed from: b */
    private final /* synthetic */ fjz f18354b;

    fkc(fjz fjz, fhq fhq) {
        this.f18354b = fjz;
        this.f18353a = fhq;
    }

    /* renamed from: a */
    public final kpk mo10183a(Object obj) {
        fjz fjz = this.f18354b;
        fhq fhq = this.f18353a;
        iqz iqz = fjz.f18341b;
        String b = ion.m4019b(fjz.f18340a.mo13751e());
        String toHexString = Integer.toHexString(fjz.f18340a.hashCode());
        String valueOf = String.valueOf(fhq);
        int length = String.valueOf(b).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 35) + String.valueOf(toHexString).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("Missing ImageId from ");
        stringBuilder.append(b);
        stringBuilder.append("ImageReader@");
        stringBuilder.append(toHexString);
        stringBuilder.append("! ");
        stringBuilder.append(valueOf);
        iqz.mo8838f(stringBuilder.toString());
        return this.f18354b.mo13255a(new iux(this.f18353a.f4791a), this.f18353a);
    }
}
