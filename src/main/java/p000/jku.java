package p000;

import com.google.common.p006io.ByteStreams;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jku */
final class jku implements Callable {
    /* renamed from: a */
    private final /* synthetic */ InputStream f8264a;
    /* renamed from: b */
    private final /* synthetic */ OutputStream f8265b;
    /* renamed from: c */
    private final /* synthetic */ jwx f8266c;

    jku(InputStream inputStream, OutputStream outputStream, jwx jwx) {
        this.f8264a = inputStream;
        this.f8265b = outputStream;
        this.f8266c = jwx;
    }

    public final /* synthetic */ Object call() {
        ByteStreams.copy(this.f8264a, this.f8265b);
        this.f8264a.close();
        this.f8265b.close();
        return this.f8266c;
    }
}
