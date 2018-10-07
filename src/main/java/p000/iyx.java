package p000;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: iyx */
final /* synthetic */ class iyx implements Callable {
    /* renamed from: a */
    private final File f7938a;

    iyx(File file) {
        this.f7938a = file;
    }

    public final Object call() {
        return Integer.valueOf((int) this.f7938a.length());
    }
}
