package p000;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: PG */
/* renamed from: kmq */
public class kmq extends kml implements Serializable {
    public static final long serialVersionUID = 3637540370352322684L;
    /* renamed from: a */
    private final Type f21925a;

    protected kmq() {
        this.f21925a = mo10137a();
        Object obj = this.f21925a;
        jri.m13408b((obj instanceof TypeVariable) ^ 1, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", obj);
    }

    private kmq(Type type) {
        this.f21925a = (Type) jri.m13404b((Object) type);
    }

    /* synthetic */ kmq(Type type, byte b) {
        this(type);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kmq)) {
            return false;
        }
        return this.f21925a.equals(((kmq) obj).f21925a);
    }

    public int hashCode() {
        return this.f21925a.hashCode();
    }

    /* renamed from: a */
    public static kmq m13827a(Class cls) {
        return new kmr(cls);
    }

    public String toString() {
        return kms.m5065b(this.f21925a);
    }

    protected Object writeReplace() {
        return new kmr(new kmm().mo10138a(this.f21925a));
    }
}
