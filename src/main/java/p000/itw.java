package p000;

import android.media.Image.Plane;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: itw */
public final class itw implements ixa {
    /* renamed from: a */
    private final int f21275a;
    /* renamed from: b */
    private final int f21276b;
    /* renamed from: c */
    private final ByteBuffer f21277c;

    public itw(Plane plane) {
        this.f21275a = plane.getPixelStride();
        this.f21276b = plane.getRowStride();
        this.f21277c = plane.getBuffer();
    }

    /* renamed from: a */
    public final ByteBuffer mo9144a() {
        return this.f21277c;
    }

    /* renamed from: b */
    public final int mo9145b() {
        return this.f21275a;
    }

    /* renamed from: c */
    public final int mo9146c() {
        return this.f21276b;
    }
}
