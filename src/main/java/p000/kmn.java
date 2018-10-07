package p000;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kmn */
class kmn {
    /* renamed from: a */
    private final kes f8712a = kgi.f21897a;

    kmn() {
    }

    /* renamed from: a */
    Type mo10140a(TypeVariable typeVariable, kmn kmn) {
        Type type = (Type) this.f8712a.get(new kmp(typeVariable));
        if (type != null) {
            return new kmm(kmn).mo10138a(type);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length == 0) {
            return typeVariable;
        }
        Type[] a = new kmm(kmn).mo10139a(bounds);
        if (knd.f8728a && Arrays.equals(bounds, a)) {
            return typeVariable;
        }
        return kms.m5062a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
    }
}
