package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: fjp */
public final class fjp extends fiw implements fjs {
    /* renamed from: a */
    private final AtomicLong f18334a = new AtomicLong(Long.MAX_VALUE);
    /* renamed from: b */
    private final long f18335b;

    public fjp(long j) {
        this.f18335b = j;
    }

    /* renamed from: a */
    public final boolean mo6836a(iwp iwp) {
        long longValue = ((Long) jri.m13404b((Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP))).longValue();
        long j = this.f18334a.get();
        if (j == Long.MAX_VALUE) {
            return false;
        }
        return longValue < j - this.f18335b;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        this.f18334a.set(((Long) jri.m13404b((Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP))).longValue());
    }
}
