package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcs */
abstract class kcs extends kbv implements kgq {
    public static final long serialVersionUID = 7431625294878419160L;

    protected kcs(Map map) {
        super(map);
    }

    /* renamed from: b */
    abstract Set mo15066a();

    /* renamed from: p */
    public Set mo13948l() {
        return (Set) super.mo13948l();
    }

    /* renamed from: b */
    public Set mo9924a(Object obj) {
        return (Set) super.mo9924a(obj);
    }

    /* renamed from: a */
    final Collection mo15067a(Object obj, Collection collection) {
        return new kcj(this, obj, (Set) collection);
    }
}
