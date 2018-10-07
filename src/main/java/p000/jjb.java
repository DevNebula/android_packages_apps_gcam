package p000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jjb */
public class jjb {
    /* renamed from: a */
    public final TreeSet f8243a;

    public jjb() {
        this.f8243a = new TreeSet(mo9469a());
    }

    public jjb(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo9470a(jja jja) {
        synchronized (this.f8243a) {
            this.f8243a.add(jja);
        }
    }

    /* renamed from: b */
    public final List mo9471b() {
        List arrayList;
        synchronized (this.f8243a) {
            arrayList = new ArrayList(this.f8243a);
        }
        return arrayList;
    }

    /* renamed from: a */
    protected Comparator mo9469a() {
        return new jjc();
    }
}
