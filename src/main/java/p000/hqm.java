package p000;

/* compiled from: PG */
/* renamed from: hqm */
public final class hqm extends kry implements ktg {
    /* renamed from: c */
    public static final hqm f26686c = new hqm();
    /* renamed from: g */
    private static volatile ktn f26687g;
    /* renamed from: a */
    public int f26688a;
    /* renamed from: b */
    public boolean f26689b;

    static {
        hqm hqm = f26686c;
        kry.f26605f.put(hqm.class, hqm);
    }

    private hqm() {
    }

    /* renamed from: a */
    protected final Object mo15667a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return new ktp(f26686c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqm();
            case 4:
                return new krz(0);
            case 5:
                return f26686c;
            case 6:
                Object obj2 = f26687g;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqm.class) {
                    obj2 = f26687g;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f26687g = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
