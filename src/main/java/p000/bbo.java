package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: bbo */
public final class bbo extends kdw implements iqo, List {
    /* renamed from: a */
    private final ArrayList f25500a;
    /* renamed from: b */
    private boolean f25501b;

    public bbo() {
        this.f25500a = new ArrayList();
    }

    public bbo(ArrayList arrayList) {
        this.f25500a = arrayList;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        iqo iqo = (iqo) obj;
        jri.m13405b(this.f25501b ^ 1);
        this.f25500a.add(i, iqo);
    }

    public final boolean addAll(int i, Collection collection) {
        jri.m13405b(this.f25501b ^ 1);
        return this.f25500a.addAll(i, collection);
    }

    public final void close() {
        if (!this.f25501b) {
            this.f25501b = true;
            ArrayList arrayList = this.f25500a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ((iqo) arrayList.get(i)).close();
                i = i2;
            }
            this.f25500a.clear();
        }
    }

    /* renamed from: F_ */
    protected final /* synthetic */ Object mo9820F_() {
        return this.f25500a;
    }

    /* renamed from: b */
    protected final /* synthetic */ Collection mo13974b() {
        return this.f25500a;
    }

    /* renamed from: c */
    protected final List mo15083c() {
        return this.f25500a;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13405b(this.f25501b ^ 1);
        return (iqo) this.f25500a.get(i);
    }

    public final int indexOf(Object obj) {
        jri.m13405b(this.f25501b ^ 1);
        return this.f25500a.indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        jri.m13405b(this.f25501b ^ 1);
        return this.f25500a.lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        jri.m13405b(this.f25501b ^ 1);
        return this.f25500a.listIterator();
    }

    public final ListIterator listIterator(int i) {
        jri.m13405b(this.f25501b ^ 1);
        return this.f25500a.listIterator(i);
    }

    public final /* synthetic */ Object remove(int i) {
        jri.m13405b(this.f25501b ^ 1);
        return (iqo) this.f25500a.remove(i);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        iqo iqo = (iqo) obj;
        jri.m13405b(this.f25501b ^ 1);
        return (iqo) this.f25500a.set(i, iqo);
    }

    public final List subList(int i, int i2) {
        jri.m13405b(this.f25501b ^ 1);
        return this.f25500a.subList(i, i2);
    }
}
