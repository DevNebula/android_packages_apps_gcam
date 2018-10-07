package p000;

/* compiled from: PG */
/* renamed from: ksw */
final class ksw implements ktd {
    /* renamed from: a */
    private ktd[] f21979a;

    ksw(ktd... ktdArr) {
        this.f21979a = ktdArr;
    }

    /* renamed from: a */
    public final boolean mo10310a(Class cls) {
        for (ktd a : this.f21979a) {
            if (a.mo10310a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ktc mo10311b(Class cls) {
        for (ktd ktd : this.f21979a) {
            if (ktd.mo10310a(cls)) {
                return ktd.mo10311b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        String str = "No factory is available for message type: ";
        throw new UnsupportedOperationException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
