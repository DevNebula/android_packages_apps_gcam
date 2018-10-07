package p000;

import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: kms */
final class kms {
    /* renamed from: a */
    public static final kaw f8714a = new khc();
    /* renamed from: b */
    public static final kaz f8715b = kaz.m4791a(", ").mo9695b("null");

    /* renamed from: a */
    static void m5063a(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Object obj = (Class) type;
                jri.m13401a(obj.isPrimitive() ^ 1, "Primitive type '%s' used as %s", obj, (Object) str);
            }
        }
    }

    /* renamed from: a */
    static Iterable m5059a(Iterable iterable) {
        Object kbl = new kbl(new kbk(Object.class));
        jri.m13404b((Object) iterable);
        jri.m13404b(kbl);
        return new kex(iterable, kbl);
    }

    /* renamed from: a */
    static Class m5058a(Class cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: a */
    static Type m5061a(Type type) {
        if (!(type instanceof WildcardType)) {
            return kmy.f8723c.mo10149a(type);
        }
        boolean z;
        WildcardType wildcardType = (WildcardType) type;
        int length = wildcardType.getLowerBounds().length;
        if (length <= 1) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Wildcard cannot have more than one lower bounds.");
        if (length == 1) {
            return new knh(new Type[]{kms.m5061a(r3[0])}, new Type[]{Object.class});
        }
        if (wildcardType.getUpperBounds().length == 1) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Wildcard should have only one upper bound.");
        return new knh(new Type[0], new Type[]{kms.m5061a(r3[0])});
    }

    /* renamed from: a */
    static TypeVariable m5062a(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        Object obj = TypeVariable.class;
        Object kng = new kng(new knf(genericDeclaration, str, typeArr));
        jri.m13404b(kng);
        jri.m13400a(obj.isInterface(), "%s is not an interface", obj);
        return (TypeVariable) obj.cast(Proxy.newProxyInstance(obj.getClassLoader(), new Class[]{obj}, kng));
    }

    /* renamed from: a */
    static ParameterizedType m5060a(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return new kne(kmt.f8716a.mo10144a(cls), cls, typeArr);
        }
        boolean z;
        jri.m13404b((Object) typeArr);
        if (cls.getEnclosingClass() != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13400a(z, "Owner type for unenclosed %s", (Object) cls);
        return new kne(type, cls, typeArr);
    }

    /* renamed from: a */
    static Type[] m5064a(Collection collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    /* renamed from: b */
    static String m5065b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
