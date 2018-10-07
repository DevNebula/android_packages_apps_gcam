package p000;

/* compiled from: PG */
/* renamed from: we */
public final class C0557we {
    /* renamed from: a */
    public static C0558wg f9955a = new C0558wg();
    /* renamed from: b */
    private static C0559wh f9956b = null;

    /* renamed from: a */
    public static C0556wd m6180a() {
        return new C0776wt();
    }

    /* renamed from: b */
    public static synchronized C0559wh m6184b() {
        C0559wh c0559wh;
        synchronized (C0557we.class) {
            if (f9956b == null) {
                try {
                    f9956b = new C0773wf();
                } catch (Throwable th) {
                    System.out.println(th);
                }
            }
            c0559wh = f9956b;
        }
        return c0559wh;
    }

    /* renamed from: a */
    public static C0556wd m6182a(byte[] bArr) {
        return C0569wv.m6238a((Object) bArr);
    }

    /* renamed from: a */
    public static C0556wd m6181a(String str) {
        return C0569wv.m6238a((Object) str);
    }

    /* renamed from: a */
    public static byte[] m6183a(C0556wd c0556wd, C0783xk c0783xk) {
        if (c0556wd instanceof C0776wt) {
            return C0509tz.m5944a((C0776wt) c0556wd, c0783xk);
        }
        throw new UnsupportedOperationException("The serializing service works onlywith the XMPMeta implementation of this library");
    }
}
