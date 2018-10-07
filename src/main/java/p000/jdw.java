package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jdw */
final class jdw implements Callable {
    /* renamed from: a */
    private final /* synthetic */ izi f8091a;
    /* renamed from: b */
    private final /* synthetic */ jdv f8092b;

    jdw(jdv jdv, izi izi) {
        this.f8092b = jdv;
        this.f8091a = izi;
    }

    public final Object call() {
        try {
            return this.f8091a.mo9217a(this.f8092b.mo15035c());
        } catch (Exception e) {
            throw e;
        } catch (Throwable th) {
            Error error = new Error(th);
        }
    }
}
