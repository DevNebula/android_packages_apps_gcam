package p000;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: khi */
class khi implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final Object f8653a;
    /* renamed from: b */
    private final Object f8654b;

    khi(Object obj, Object obj2) {
        this.f8654b = jri.m13404b(obj);
        if (obj2 == null) {
            obj2 = this;
        }
        this.f8653a = obj2;
    }

    /* renamed from: a */
    Object mo9985a() {
        return this.f8654b;
    }

    public String toString() {
        String obj;
        synchronized (this.f8653a) {
            obj = this.f8654b.toString();
        }
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f8653a) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
