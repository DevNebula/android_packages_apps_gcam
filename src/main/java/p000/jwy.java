package p000;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jwy */
public final class jwy implements jxo {
    /* renamed from: a */
    public final kpw f21792a = kpw.m18486d();
    /* renamed from: b */
    private final AtomicBoolean f21793b = new AtomicBoolean(false);

    /* renamed from: a */
    public final /* synthetic */ OutputStream mo9601a(jxn jxn) {
        if (!this.f21793b.getAndSet(true)) {
            return new jwz(this);
        }
        throw new IllegalStateException("BufferedArtifactRasterSink supports rasterizing only up to one artifact.");
    }
}
