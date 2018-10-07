package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* renamed from: kmm */
public final class kmm {
    /* renamed from: a */
    private final kmn f8711a;

    public kmm() {
        this.f8711a = new kmn();
    }

    kmm(kmn kmn) {
        this.f8711a = kmn;
    }

    /* renamed from: a */
    public final Type mo10138a(Type type) {
        jri.m13404b((Object) type);
        if (type instanceof TypeVariable) {
            kmn kmn = this.f8711a;
            TypeVariable typeVariable = (TypeVariable) type;
            return kmn.mo10140a(typeVariable, new kmo(typeVariable, kmn));
        } else if (type instanceof ParameterizedType) {
            Type a;
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                a = mo10138a(ownerType);
            } else {
                a = null;
            }
            return kms.m5060a(a, (Class) mo10138a(parameterizedType.getRawType()), mo10139a(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return kms.m5061a(mo10138a(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new knh(mo10139a(wildcardType.getLowerBounds()), mo10139a(wildcardType.getUpperBounds()));
        }
    }

    /* renamed from: a */
    final Type[] mo10139a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo10138a(typeArr[i]);
        }
        return typeArr2;
    }
}
