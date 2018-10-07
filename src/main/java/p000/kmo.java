package p000;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* renamed from: kmo */
final class kmo extends kmn {
    /* renamed from: a */
    private final /* synthetic */ TypeVariable f21923a;
    /* renamed from: b */
    private final /* synthetic */ kmn f21924b;

    kmo(TypeVariable typeVariable, kmn kmn) {
        this.f21923a = typeVariable;
        this.f21924b = kmn;
    }

    /* renamed from: a */
    public final Type mo10140a(TypeVariable typeVariable, kmn kmn) {
        return typeVariable.getGenericDeclaration().equals(this.f21923a.getGenericDeclaration()) ? typeVariable : this.f21924b.mo10140a(typeVariable, kmn);
    }
}
