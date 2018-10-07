package p000;

import android.support.p001v4.app.Person;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fkq */
public final class fkq {
    /* renamed from: a */
    private final String f4829a;

    fkq(String str) {
        jri.m13404b((Object) str);
        this.f4829a = str;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof fkq) && this.f4829a.equals(((fkq) obj).f4829a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4829a});
    }

    public final String toString() {
        return jqk.m13350b((Object) this).mo9703a(Person.NAME_KEY, this.f4829a).toString();
    }
}
