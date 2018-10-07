package p000;

import java.io.PrintStream;

/* compiled from: PG */
/* renamed from: kqm */
final class kqm extends kqh {
    kqm() {
    }

    /* renamed from: a */
    public final void mo10211a(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    /* renamed from: a */
    public final Throwable[] mo10212a(Throwable th) {
        return th.getSuppressed();
    }

    /* renamed from: b */
    public final void mo10213b(Throwable th) {
        th.printStackTrace();
    }

    /* renamed from: a */
    public final void mo10210a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
    }
}
