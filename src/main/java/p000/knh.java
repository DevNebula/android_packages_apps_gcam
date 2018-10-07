package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: knh */
final class knh implements Serializable, WildcardType {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final ken f8737a;
    /* renamed from: b */
    private final ken f8738b;

    knh(Type[] typeArr, Type[] typeArr2) {
        kms.m5063a(typeArr, "lower bound for wildcard");
        kms.m5063a(typeArr2, "upper bound for wildcard");
        this.f8737a = kmy.f8723c.mo10150a(typeArr);
        this.f8738b = kmy.f8723c.mo10150a(typeArr2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        if (this.f8737a.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f8738b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
            return true;
        }
        return false;
    }

    public final Type[] getLowerBounds() {
        return kms.m5064a(this.f8737a);
    }

    public final Type[] getUpperBounds() {
        return kms.m5064a(this.f8738b);
    }

    public final int hashCode() {
        return this.f8737a.hashCode() ^ this.f8738b.hashCode();
    }

    public final String toString() {
        Type type;
        StringBuilder stringBuilder = new StringBuilder("?");
        ken ken = this.f8737a;
        int size = ken.size();
        int i = 0;
        while (i < size) {
            Object obj = ken.get(i);
            i++;
            type = (Type) obj;
            stringBuilder.append(" super ");
            stringBuilder.append(kmy.f8723c.mo10152b(type));
        }
        for (Type type2 : kms.m5059a(this.f8738b)) {
            stringBuilder.append(" extends ");
            stringBuilder.append(kmy.f8723c.mo10152b(type2));
        }
        return stringBuilder.toString();
    }
}
