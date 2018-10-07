package p000;

import android.annotation.TargetApi;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jzu */
public final class jzu {
    /* renamed from: a */
    public static final jzu f8528a = new jzu();
    /* renamed from: b */
    private final List f8529b = new ArrayList();
    /* renamed from: c */
    private final ReferenceQueue f8530c = new ReferenceQueue();

    /* renamed from: a */
    public final synchronized void mo9670a(Object obj) {
        if (jlo.m4599b()) {
            Iterator it = this.f8529b.iterator();
            while (it.hasNext()) {
                if (((jzv) it.next()).get() == obj) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo9671b(Object obj) {
        if (jlo.m4599b()) {
            for (jzv jzv : this.f8529b) {
                if (jzv.get() == obj) {
                    break;
                }
            }
            this.f8529b.add(new jzv(obj, this.f8530c));
        }
    }
}
