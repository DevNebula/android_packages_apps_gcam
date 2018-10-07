package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: agz */
final class agz {
    /* renamed from: a */
    private final aha f452a = new aha();
    /* renamed from: b */
    private final Map f453b = new HashMap();

    agz() {
    }

    /* renamed from: a */
    public final Object mo287a(ahh ahh) {
        aha aha = (aha) this.f453b.get(ahh);
        if (aha == null) {
            aha = new aha(ahh);
            this.f453b.put(ahh, aha);
        } else {
            ahh.mo298a();
        }
        agz.m272a(aha);
        aha aha2 = this.f452a;
        aha.f457d = aha2;
        aha.f456c = aha2.f456c;
        agz.m273b(aha);
        return aha.mo290a();
    }

    /* renamed from: a */
    public final void mo288a(ahh ahh, Object obj) {
        aha aha = (aha) this.f453b.get(ahh);
        if (aha == null) {
            aha = new aha(ahh);
            agz.m272a(aha);
            aha aha2 = this.f452a;
            aha.f457d = aha2.f457d;
            aha.f456c = aha2;
            agz.m273b(aha);
            this.f453b.put(ahh, aha);
        } else {
            ahh.mo298a();
        }
        if (aha.f455b == null) {
            aha.f455b = new ArrayList();
        }
        aha.f455b.add(obj);
    }

    /* renamed from: a */
    private static void m272a(aha aha) {
        aha aha2 = aha.f457d;
        aha2.f456c = aha.f456c;
        aha.f456c.f457d = aha2;
    }

    /* renamed from: a */
    public final Object mo286a() {
        aha aha = this.f452a.f457d;
        while (true) {
            aha aha2 = aha;
            if (aha2.equals(this.f452a)) {
                return null;
            }
            Object a = aha2.mo290a();
            if (a != null) {
                return a;
            }
            agz.m272a(aha2);
            this.f453b.remove(aha2.f454a);
            ((ahh) aha2.f454a).mo298a();
            aha = aha2.f457d;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupedLinkedMap( ");
        aha aha = this.f452a.f456c;
        Object obj = null;
        while (!aha.equals(this.f452a)) {
            stringBuilder.append('{');
            stringBuilder.append(aha.f454a);
            stringBuilder.append(':');
            stringBuilder.append(aha.mo291b());
            stringBuilder.append("}, ");
            aha = aha.f456c;
            obj = 1;
        }
        if (obj != null) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append(" )");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static void m273b(aha aha) {
        aha.f456c.f457d = aha;
        aha.f457d.f456c = aha;
    }
}
