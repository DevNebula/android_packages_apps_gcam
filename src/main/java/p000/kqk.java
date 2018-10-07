package p000;

import java.io.PrintStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: kqk */
final class kqk extends kqh {
    /* renamed from: b */
    private final kqi f21951b = new kqi();

    kqk() {
    }

    /* renamed from: a */
    public final void mo10211a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        } else {
            this.f21951b.mo10214a(th, true).add(th2);
        }
    }

    /* renamed from: a */
    public final Throwable[] mo10212a(Throwable th) {
        List a = this.f21951b.mo10214a(th, false);
        if (a == null || a.isEmpty()) {
            return f8787a;
        }
        return (Throwable[]) a.toArray(f8787a);
    }

    /* renamed from: b */
    public final void mo10213b(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f21951b.mo10214a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10210a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> a = this.f21951b.mo10214a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printStream.print("Suppressed: ");
                    th2.printStackTrace(printStream);
                }
            }
        }
    }
}
