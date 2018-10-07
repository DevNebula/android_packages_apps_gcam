package p000;

import java.util.Set;

/* renamed from: exo */
public final /* synthetic */ class exo implements Runnable {
    /* renamed from: a */
    private final ird f4559a;
    /* renamed from: b */
    private final kwk f4560b;

    public exo(ird ird, kwk kwk) {
        this.f4559a = ird;
        this.f4560b = kwk;
    }

    public final void run() {
        ird ird = this.f4559a;
        kwk kwk = this.f4560b;
        ird.mo8856a("MICRO_ImageReaderModule_runningStartupTasks");
        for (Runnable runnable : (Set) kwk.mo10566a()) {
            ird.mo8856a("MICRO_ImageReaderModule_runSingleTask");
            runnable.run();
            ird.mo8857b();
        }
        ird.mo8857b();
    }
}
