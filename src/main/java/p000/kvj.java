package p000;

import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: kvj */
public final class kvj {
    /* renamed from: a */
    public static final Charset f9022a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final Object f9023b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    /* renamed from: a */
    public static void m5514a(kvf kvf, kvf kvf2) {
        kvh kvh = kvf.unknownFieldData;
        if (kvh != null) {
            kvf2.unknownFieldData = kvh.clone();
        }
    }
}
