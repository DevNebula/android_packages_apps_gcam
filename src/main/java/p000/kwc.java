package p000;

/* compiled from: PG */
/* renamed from: kwc */
public final class kwc implements kwa, kwk {
    /* renamed from: a */
    private static final Object f22015a = new Object();
    /* renamed from: b */
    private volatile kwk f22016b;
    /* renamed from: c */
    private volatile Object f22017c = f22015a;

    private kwc(kwk kwk) {
        this.f22016b = kwk;
    }

    /* renamed from: a */
    public final Object mo10562a() {
        Object obj = null;
        Object obj2 = this.f22017c;
        if (obj2 == f22015a) {
            synchronized (this) {
                obj2 = this.f22017c;
                if (obj2 == f22015a) {
                    obj2 = this.f22016b.mo10566a();
                    Object obj3 = this.f22017c;
                    if (!(obj3 == f22015a || (obj3 instanceof kwe))) {
                        obj = 1;
                    }
                    if (obj == null || obj3 == obj2) {
                        this.f22017c = obj2;
                        this.f22016b = null;
                    } else {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj2);
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 118) + String.valueOf(valueOf2).length());
                        stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" & ");
                        stringBuilder.append(valueOf2);
                        stringBuilder.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
        }
        return obj2;
    }

    /* renamed from: a */
    public static kwa m14272a(kwk kwk) {
        if (kwk instanceof kwa) {
            return (kwa) kwk;
        }
        return new kwc((kwk) ktm.m14218a((Object) kwk));
    }

    /* renamed from: b */
    public static kwk m14273b(kwk kwk) {
        ktm.m14218a((Object) kwk);
        return kwk instanceof kwc ? kwk : new kwc(kwk);
    }
}
