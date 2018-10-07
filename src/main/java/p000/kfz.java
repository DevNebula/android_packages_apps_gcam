package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kfz */
final class kfz extends kfw implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f24920a;
    /* renamed from: b */
    private final int f24921b;

    kfz(Object obj, int i) {
        this.f24920a = obj;
        this.f24921b = i;
        khb.m4919a(i, "count");
    }

    /* renamed from: a */
    public final int mo9953a() {
        return this.f24921b;
    }

    /* renamed from: b */
    public final Object mo9954b() {
        return this.f24920a;
    }
}
