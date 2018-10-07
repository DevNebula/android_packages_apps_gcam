package p000;

/* compiled from: PG */
/* renamed from: hqg */
public final class hqg extends ksb implements ktg {
    /* renamed from: c */
    public static final hqg f26751c = new hqg();
    /* renamed from: i */
    private static volatile ktn f26752i;
    /* renamed from: a */
    public int f26753a;
    /* renamed from: b */
    public int f26754b;
    /* renamed from: h */
    private byte f26755h = (byte) 2;

    static {
        hqg hqg = f26751c;
        kry.f26605f.put(hqg.class, hqg);
    }

    private hqg() {
    }

    /* renamed from: a */
    protected final Object mo15667a(int i, Object obj) {
        byte b = (byte) 0;
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f26755h);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.f26755h = b;
                return null;
            case 2:
                return new ktp(f26751c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
            case 3:
                return new hqg();
            case 4:
                return new ksa();
            case 5:
                return f26751c;
            case 6:
                Object obj2 = f26752i;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (hqg.class) {
                    obj2 = f26752i;
                    if (obj2 == null) {
                        obj2 = new kqq((byte) 0);
                        f26752i = obj2;
                    }
                }
                return obj2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
