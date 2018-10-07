package p000;

import android.util.Log;
import android.util.LongSparseArray;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: jlc */
public final class jlc implements jla {
    /* renamed from: a */
    public final LongSparseArray f21618a = new LongSparseArray();
    /* renamed from: b */
    private final AtomicLong f21619b = new AtomicLong(0);

    /* renamed from: b */
    final synchronized void mo13816b() {
        if (GraphRunner.current() == null) {
            throw new IllegalStateException("Called from a thread with no graph runner.");
        } else if (this.f21619b.get() != Thread.currentThread().getId() && !this.f21619b.compareAndSet(0, Thread.currentThread().getId())) {
            throw new IllegalStateException("Called from a different graph runner thread.");
        }
    }

    /* renamed from: c */
    public final void mo13817c() {
        mo13816b();
        while (this.f21618a.size() > 0) {
            mo13813a(this.f21618a.keyAt(0));
        }
    }

    /* renamed from: a */
    public final void mo13815a(Set set, Set set2, jqt jqt) {
        mo13816b();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f21618a.size()) {
                long keyAt = this.f21618a.keyAt(i2);
                FrameImage2D frameImage2D = (FrameImage2D) this.f21618a.get(keyAt);
                Long valueOf = Long.valueOf(keyAt);
                if (set.contains(valueOf)) {
                    jqt.mo9532a(keyAt, frameImage2D.toBitmap(), set2.contains(valueOf) ^ 1);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final List mo13818d() {
        mo13816b();
        return ken.m13713a(new jzq(this.f21618a));
    }

    /* renamed from: a */
    public final void mo9507a() {
        mo13816b();
        mo13817c();
    }

    /* renamed from: a */
    public final void mo9508a(FrameImage2D frameImage2D) {
        mo13816b();
        jri.m13404b((Object) frameImage2D);
        long timestamp = frameImage2D.getTimestamp();
        if (this.f21618a.get(timestamp) == null) {
            this.f21618a.put(timestamp, frameImage2D);
            frameImage2D.retain();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Duplicate timestamp: ");
        stringBuilder.append(timestamp);
        Log.w("FrameImageBuffer", stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo13813a(long j) {
        mo13816b();
        FrameImage2D frameImage2D = (FrameImage2D) this.f21618a.get(j);
        if (frameImage2D != null) {
            this.f21618a.remove(j);
            frameImage2D.release();
        }
    }
}
