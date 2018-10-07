package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kgb */
class kgb extends kdx implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final kft f26586a;
    /* renamed from: b */
    private transient Set f26587b;
    /* renamed from: c */
    private transient Set f26588c;

    kgb(kft kft) {
        this.f26586a = kft;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final int mo9939a(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    Set mo15599c() {
        return Collections.unmodifiableSet(this.f26586a.mo9946e());
    }

    /* renamed from: f */
    protected kft mo13974b() {
        return this.f26586a;
    }

    /* renamed from: e */
    public Set mo9946e() {
        Set set = this.f26587b;
        if (set != null) {
            return set;
        }
        set = mo15599c();
        this.f26587b = set;
        return set;
    }

    /* renamed from: g */
    public final Set mo9948g() {
        Set set = this.f26588c;
        if (set != null) {
            return set;
        }
        set = Collections.unmodifiableSet(this.f26586a.mo9948g());
        this.f26588c = set;
        return set;
    }

    public Iterator iterator() {
        return khb.m4961d(this.f26586a.iterator());
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final int mo9942b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final int mo9943c(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo9940a(Object obj, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
