package p000;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* renamed from: knf */
final class knf {
    /* renamed from: a */
    private final GenericDeclaration f8732a;
    /* renamed from: b */
    private final String f8733b;
    /* renamed from: c */
    private final ken f8734c;

    knf(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        kms.m5063a(typeArr, "bound for type variable");
        this.f8732a = (GenericDeclaration) jri.m13404b((Object) genericDeclaration);
        this.f8733b = (String) jri.m13404b((Object) str);
        this.f8734c = ken.m13715b(typeArr);
    }

    public final boolean equals(Object obj) {
        if (knd.f8728a) {
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof kng)) {
                return false;
            }
            knf knf = ((kng) Proxy.getInvocationHandler(obj)).f8736a;
            if (this.f8733b.equals(knf.f8733b) && this.f8732a.equals(knf.f8732a) && this.f8734c.equals(knf.f8734c)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (this.f8733b.equals(typeVariable.getName()) && this.f8732a.equals(typeVariable.getGenericDeclaration())) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        return this.f8732a.hashCode() ^ this.f8733b.hashCode();
    }

    public final String toString() {
        return this.f8733b;
    }
}
