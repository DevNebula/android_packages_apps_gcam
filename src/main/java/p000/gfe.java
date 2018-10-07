package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gfe */
final class gfe implements Runnable {
    /* renamed from: a */
    private final gfa f5373a;
    /* renamed from: b */
    private final gff f5374b;
    /* renamed from: c */
    private final ggr f5375c;
    /* renamed from: d */
    private final ird f5376d;

    public gfe(gfa gfa, gff gff, ggr ggr, ird ird) {
        this.f5373a = gfa;
        this.f5374b = gff;
        this.f5375c = ggr;
        this.f5376d = ird;
    }

    public final void run() {
        this.f5376d.mo8856a("TaskDoneWrapper#run");
        try {
            this.f5375c.run();
            gfu gfu = this.f5374b.f5377a;
            if (this.f5373a.mo13338a(gfu)) {
                Set<iwz> set = this.f5374b.f5378b;
                gfa gfa = this.f5373a;
                synchronized (gfa.f19123b) {
                    for (iwz iwz : set) {
                        if (!(((gfd) gfa.f19123b.get(iwz)) == null || gfa.f19124c.contains(iwz))) {
                            gfa.f19124c.add(iwz);
                        }
                    }
                }
                Runnable runnable = gfu.f24348b;
                if (runnable != null) {
                    this.f5376d.mo8856a("TaskDoneWrapper#done#run");
                    Executor executor = this.f5375c.f5402d;
                    if (executor == null) {
                        runnable.run();
                    } else {
                        executor.execute(runnable);
                    }
                    this.f5376d.mo8857b();
                }
            }
            this.f5376d.mo8857b();
        } finally {
            this.f5373a.mo13337a(this.f5375c);
        }
    }
}
