package p000;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kmp */
final class kmp {
    /* renamed from: a */
    private final TypeVariable f8713a;

    kmp(TypeVariable typeVariable) {
        this.f8713a = (TypeVariable) jri.m13404b((Object) typeVariable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kmp)) {
            return false;
        }
        TypeVariable typeVariable = ((kmp) obj).f8713a;
        if (this.f8713a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f8713a.getName().equals(typeVariable.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8713a.getGenericDeclaration(), this.f8713a.getName()});
    }

    public final String toString() {
        return this.f8713a.toString();
    }
}
