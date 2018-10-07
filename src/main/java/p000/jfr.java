package p000;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: jfr */
public final class jfr implements jfx {
    /* renamed from: a */
    private long f21448a = 0;
    /* renamed from: b */
    private final /* synthetic */ ByteBuffer f21449b;
    /* renamed from: c */
    private final /* synthetic */ int f21450c;
    /* renamed from: d */
    private final /* synthetic */ jfw f21451d;

    public jfr(jfw jfw, ByteBuffer byteBuffer, int i) {
        this.f21451d = jfw;
        this.f21449b = byteBuffer;
        this.f21450c = i;
    }

    public final void close() {
        this.f21451d.f8147a.queueInputBuffer(this.f21450c, 0, this.f21449b.position(), this.f21448a, 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9393a() {
        return this.f21449b;
    }

    /* renamed from: a */
    public final void mo9394a(long j) {
        this.f21448a = j;
    }
}
