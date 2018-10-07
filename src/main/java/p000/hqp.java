package p000;

/* compiled from: PG */
/* renamed from: hqp */
public final class hqp extends ksb implements ktg {
    /* renamed from: c */
    public static final hqp f26756c = new hqp();
    /* renamed from: i */
    private static volatile ktn f26757i;
    /* renamed from: a */
    public int f26758a;
    /* renamed from: b */
    public int f26759b;
    /* renamed from: h */
    private byte f26760h = (byte) 2;

    static {
        hqp hqp = f26756c;
        kry.f26605f.put(hqp.class, hqp);
    }

    private hqp() {
    }

    /* renamed from: a */
    protected final Object mo15667a(int i, Object obj) {
        byte b = (byte) 0;
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f26760h);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.f26760h = b;
                return null;
            case 2:
                return new ktp(f26756c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqp();
            case 4:
                return new ksa((byte) 0);
            case 5:
                return f26756c;
            case 6:
                Object obj2 = f26757i;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqp.class) {
                    obj2 = f26757i;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f26757i = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
