package p000;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: cly */
final class cly implements Callable {
    /* renamed from: a */
    private final /* synthetic */ List f2318a;

    cly(List list) {
        this.f2318a = list;
    }

    public final /* synthetic */ Object call() {
        for (cot a : this.f2318a) {
            a.mo6532a();
        }
        return izg.f7956a;
    }
}
