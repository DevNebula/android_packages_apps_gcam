package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* renamed from: jwz */
final class jwz extends ByteArrayOutputStream {
    /* renamed from: a */
    private final /* synthetic */ jwy f8409a;

    jwz(jwy jwy) {
        this.f8409a = jwy;
    }

    public final void close() {
        super.close();
        this.f8409a.f21792a.mo15641a(new ByteArrayInputStream(toByteArray()));
    }
}
