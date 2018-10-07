package p000;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

/* renamed from: iyw */
final /* synthetic */ class iyw implements Callable {
    /* renamed from: a */
    private final File f7937a;

    iyw(File file) {
        this.f7937a = file;
    }

    public final Object call() {
        return new FileInputStream(this.f7937a);
    }
}
