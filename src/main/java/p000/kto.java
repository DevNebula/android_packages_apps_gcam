package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: kto */
public final class kto {
    /* renamed from: a */
    public static final kto f8910a = new kto();
    /* renamed from: b */
    private final kts f8911b;
    /* renamed from: c */
    private final ConcurrentMap f8912c = new ConcurrentHashMap();

    private kto() {
        kts a;
        String[] strArr = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        kts kts = null;
        for (int i = 0; i <= 0; i = 1) {
            a = kto.m5234a(strArr[0]);
            if (a != null) {
                break;
            }
            kts = a;
        }
        a = kts;
        if (a == null) {
            a = new ksu();
        }
        this.f8911b = a;
    }

    /* renamed from: a */
    private static kts m5234a(String str) {
        try {
            return (kts) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public final ktr mo10314a(Class cls) {
        ksd.m5194a((Object) cls, "messageType");
        ktr ktr = (ktr) this.f8912c.get(cls);
        if (ktr != null) {
            return ktr;
        }
        ktr a = this.f8911b.mo10369a(cls);
        ksd.m5194a((Object) cls, "messageType");
        ksd.m5194a((Object) a, "schema");
        ktr = (ktr) this.f8912c.putIfAbsent(cls, a);
        if (ktr == null) {
            return a;
        }
        return ktr;
    }

    /* renamed from: a */
    public final ktr mo10315a(Object obj) {
        return mo10314a(obj.getClass());
    }
}
