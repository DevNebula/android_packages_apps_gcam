package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: krn */
public final class krn {
    /* renamed from: a */
    public static final krn f8810a = new krn((byte) 0);
    /* renamed from: c */
    private static volatile boolean f8811c = false;
    /* renamed from: b */
    public final Map f8812b;

    static {
        krn.m5166c();
    }

    krn() {
        this.f8812b = new HashMap();
    }

    private krn(byte b) {
        this.f8812b = Collections.emptyMap();
    }

    /* renamed from: a */
    public static krn m5164a() {
        return krm.m5162b();
    }

    /* renamed from: b */
    public static krn m5165b() {
        return krm.m5160a();
    }

    /* renamed from: c */
    private static Class m5166c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
