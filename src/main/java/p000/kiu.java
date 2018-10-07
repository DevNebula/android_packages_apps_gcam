package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* renamed from: kiu */
public final class kiu implements Closeable {
    /* renamed from: a */
    private static final kix f8686a;
    /* renamed from: b */
    private final kix f8687b;
    /* renamed from: c */
    private final Deque f8688c = new ArrayDeque(4);
    /* renamed from: d */
    private Throwable f8689d;

    static {
        kix kix;
        if (kiw.f21919b != null) {
            kix = kiw.f21918a;
        } else {
            kix = kiv.f21917a;
        }
        f8686a = kix;
    }

    private kiu(kix kix) {
        this.f8687b = (kix) jri.m13404b((Object) kix);
    }

    public final void close() {
        Throwable th = this.f8689d;
        while (!this.f8688c.isEmpty()) {
            Closeable closeable = (Closeable) this.f8688c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th != null) {
                    this.f8687b.mo10070a(closeable, th, th2);
                } else {
                    th = th2;
                }
            }
        }
        if (this.f8689d == null && th != null) {
            kbr.m4817a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public static kiu m5025a() {
        return new kiu(f8686a);
    }

    /* renamed from: a */
    public final Closeable mo10067a(Closeable closeable) {
        if (closeable != null) {
            this.f8688c.addFirst(closeable);
        }
        return closeable;
    }

    /* renamed from: a */
    public final RuntimeException mo10068a(Throwable th) {
        jri.m13404b((Object) th);
        this.f8689d = th;
        kbr.m4817a(th, IOException.class);
        throw new RuntimeException(th);
    }
}
