package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kdl */
final class kdl implements Iterator {
    /* renamed from: a */
    private int f8605a;
    /* renamed from: b */
    private int f8606b;
    /* renamed from: c */
    private int f8607c;
    /* renamed from: d */
    private final /* synthetic */ kdk f8608d;

    kdl(kdk kdk) {
        int i;
        this.f8608d = kdk;
        kdk kdk2 = this.f8608d;
        this.f8605a = kdk2.f8600c;
        if (kdk2.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.f8606b = i;
        this.f8607c = -1;
    }

    /* renamed from: a */
    private final void m4844a() {
        if (this.f8608d.f8600c != this.f8605a) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        return this.f8606b >= 0;
    }

    public final Object next() {
        m4844a();
        if (hasNext()) {
            int i = this.f8606b;
            this.f8607c = i;
            kdk kdk = this.f8608d;
            Object obj = kdk.f8599b[i];
            i++;
            if (i >= kdk.f8601d) {
                i = -1;
            }
            this.f8606b = i;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        m4844a();
        if (this.f8607c >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8605a++;
        kdk kdk = this.f8608d;
        Object[] objArr = kdk.f8599b;
        int i = this.f8607c;
        kdk.mo9798a(objArr[i], (int) (kdk.f8598a[i] >>> 32));
        this.f8606b--;
        this.f8607c = -1;
    }
}
