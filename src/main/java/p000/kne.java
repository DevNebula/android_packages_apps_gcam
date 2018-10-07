package p000;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kne */
final class kne implements Serializable, ParameterizedType {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Type f8729a;
    /* renamed from: b */
    private final ken f8730b;
    /* renamed from: c */
    private final Class f8731c;

    kne(Type type, Class cls, Type[] typeArr) {
        boolean z;
        jri.m13404b((Object) cls);
        if (typeArr.length == cls.getTypeParameters().length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        kms.m5063a(typeArr, "type parameter");
        this.f8729a = type;
        this.f8731c = cls;
        this.f8730b = kmy.f8723c.mo10150a(typeArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        if (getRawType().equals(parameterizedType.getRawType()) && kbf.m16778b(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
            return true;
        }
        return false;
    }

    public final Type[] getActualTypeArguments() {
        return kms.m5064a(this.f8730b);
    }

    public final Type getOwnerType() {
        return this.f8729a;
    }

    public final Type getRawType() {
        return this.f8731c;
    }

    public final int hashCode() {
        int hashCode;
        Type type = this.f8729a;
        if (type != null) {
            hashCode = type.hashCode();
        } else {
            hashCode = 0;
        }
        return (hashCode ^ this.f8730b.hashCode()) ^ this.f8731c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f8729a != null && kmy.f8723c.mo10151a()) {
            stringBuilder.append(kmy.f8723c.mo10152b(this.f8729a));
            stringBuilder.append('.');
        }
        stringBuilder.append(this.f8731c.getName());
        stringBuilder.append('<');
        kaz kaz = kms.f8715b;
        Object obj = this.f8730b;
        Object obj2 = kms.f8714a;
        jri.m13404b(obj);
        jri.m13404b(obj2);
        stringBuilder.append(kaz.mo9693a(new key(obj, obj2)));
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}
