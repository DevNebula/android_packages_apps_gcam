package p000;

import java.io.OutputStream;
import java.util.concurrent.Callable;

/* renamed from: iyv */
final /* synthetic */ class iyv implements Callable {
    /* renamed from: a */
    private final OutputStream f7936a;

    iyv(OutputStream outputStream) {
        this.f7936a = outputStream;
    }

    public final Object call() {
        return this.f7936a;
    }
}
