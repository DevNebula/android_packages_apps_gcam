package p000;

/* compiled from: PG */
/* renamed from: krx */
final class krx implements ktd {
    /* renamed from: a */
    public static final krx f21974a = new krx();

    private krx() {
    }

    /* renamed from: a */
    public final boolean mo10310a(Class cls) {
        return kry.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final ktc mo10311b(Class cls) {
        String valueOf;
        if (kry.class.isAssignableFrom(cls)) {
            try {
                return (ktc) kry.m18193a(cls.asSubclass(kry.class)).mo15667a(C0252go.f5878bX, null);
            } catch (Throwable e) {
                Throwable th = e;
                valueOf = String.valueOf(cls.getName());
                String str = "Unable to get message info for ";
                throw new RuntimeException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), th);
            }
        }
        valueOf = String.valueOf(cls.getName());
        String str2 = "Unsupported message type: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        throw new IllegalArgumentException(valueOf);
    }
}
