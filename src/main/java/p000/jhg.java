package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jhg */
final class jhg implements jhf {
    /* renamed from: a */
    public final kpk f21494a;
    /* renamed from: b */
    public final kpk f21495b;
    /* renamed from: c */
    public final jhe f21496c;
    /* renamed from: d */
    public final kpw f21497d = kpw.m18486d();
    /* renamed from: e */
    public final kpw f21498e;
    /* renamed from: f */
    public final kpk f21499f;
    /* renamed from: g */
    public final ConcurrentLinkedDeque f21500g;
    /* renamed from: h */
    public final Object f21501h;
    /* renamed from: i */
    public long f21502i;
    /* renamed from: j */
    private final Executor f21503j;
    /* renamed from: k */
    private final AtomicBoolean f21504k;
    /* renamed from: l */
    private final AtomicBoolean f21505l;

    jhg(kpk kpk, kpk kpk2, kpk kpk3, jhe jhe, Executor executor) {
        this.f21499f = kpk;
        this.f21494a = kpk2;
        this.f21503j = executor;
        this.f21496c = jhe;
        this.f21498e = kpw.m18486d();
        this.f21495b = kpk3;
        this.f21504k = new AtomicBoolean();
        this.f21505l = new AtomicBoolean();
        this.f21500g = new ConcurrentLinkedDeque();
        this.f21502i = 0;
        this.f21501h = new Object();
    }

    /* renamed from: a */
    final void mo13797a() {
        this.f21498e.cancel(false);
        this.f21495b.cancel(false);
        this.f21497d.mo15641a(null);
    }

    public final void close() {
        if (!this.f21504k.getAndSet(true)) {
            BufferInfo bufferInfo = new BufferInfo();
            bufferInfo.size = 0;
            bufferInfo.flags = 4;
            m13088a(new jgy(ByteBuffer.wrap(new byte[0]), bufferInfo));
        }
    }

    /* renamed from: a */
    private final void m13088a(jgy jgy) {
        boolean a = jgy.mo9417a();
        if (this.f21505l.get() || !jhg.m13089a(this.f21496c.f8199b, "oo.muxer.drop_initial_non_keyframes") || (jgy.f8185b.flags & 1) != 0 || a) {
            this.f21500g.addLast(jgy);
            if (a) {
                this.f21504k.set(true);
                if (!this.f21498e.isDone()) {
                    mo13797a();
                    return;
                }
            }
            this.f21505l.set(true);
            this.f21498e.mo15641a(Long.valueOf(jgy.f8185b.presentationTimeUs));
            this.f21495b.mo10200a(new jhh(this), this.f21503j);
        }
    }

    /* renamed from: a */
    static boolean m13089a(MediaFormat mediaFormat, String str) {
        return mediaFormat.containsKey(str) && mediaFormat.getInteger(str) > 0;
    }

    /* renamed from: a */
    public final void mo9430a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        if (this.f21504k.get()) {
            Log.w("MuxerTrackStreamImpl", "WriteSampleData called after close called. Packet dropped.");
        } else {
            m13088a(jgy.m4536a(byteBuffer, bufferInfo));
        }
    }
}
