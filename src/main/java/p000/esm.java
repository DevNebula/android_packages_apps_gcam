package p000;

import java.io.File;

/* renamed from: esm */
final /* synthetic */ class esm implements Runnable {
    /* renamed from: a */
    private final esd f4430a;
    /* renamed from: b */
    private final File f4431b;
    /* renamed from: c */
    private final eso f4432c;

    esm(esd esd, File file, eso eso) {
        this.f4430a = esd;
        this.f4431b = file;
        this.f4432c = eso;
    }

    public final void run() {
        esd esd = this.f4430a;
        File file = this.f4431b;
        eso eso = this.f4432c;
        esd.f17706c.mo7393a(file);
        eso.f4435b.delete();
    }
}
