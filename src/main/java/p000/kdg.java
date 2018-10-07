package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kdg */
abstract class kdg implements Iterator {
    /* renamed from: a */
    private int f8592a;
    /* renamed from: b */
    private int f8593b;
    /* renamed from: c */
    private int f8594c;
    /* renamed from: d */
    private final /* synthetic */ kdb f8595d;

    private kdg(kdb kdb) {
        int i;
        this.f8595d = kdb;
        kdb kdb2 = this.f8595d;
        this.f8592a = kdb2.f8583d;
        if (kdb2.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.f8593b = i;
        this.f8594c = -1;
    }

    /* renamed from: a */
    abstract Object mo9786a(int i);

    /* synthetic */ kdg(kdb kdb, byte b) {
        this(kdb);
    }

    /* renamed from: a */
    private final void m4838a() {
        if (this.f8595d.f8583d != this.f8592a) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.f8593b >= 0;
    }

    public Object next() {
        m4838a();
        if (hasNext()) {
            int i = this.f8593b;
            this.f8594c = i;
            Object a = mo9786a(i);
            i = this.f8593b + 1;
            if (i >= this.f8595d.f8584e) {
                i = -1;
            }
            this.f8593b = i;
            return a;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        boolean z;
        m4838a();
        if (this.f8594c >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8592a++;
        kdb kdb = this.f8595d;
        int i = this.f8594c;
        kdb.mo9769a(kdb.f8581b[i], (int) (kdb.f8580a[i] >>> 32));
        this.f8593b--;
        this.f8594c = -1;
    }
}
