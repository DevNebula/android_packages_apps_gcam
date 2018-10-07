package p000;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: bjd */
public final class bjd implements ioi {
    /* renamed from: a */
    private static final String f22783a = bli.m887a("DynBitOpt");
    /* renamed from: b */
    private final AtomicLong f22784b = new AtomicLong(0);
    /* renamed from: c */
    private final ios f22785c;
    /* renamed from: d */
    private bjf f22786d;

    public bjd(ios ios) {
        this.f22785c = ios;
        this.f22786d = bjf.FPS_30;
    }

    public final void close() {
        this.f22784b.set(0);
        this.f22786d = bjf.FPS_30;
    }

    /* renamed from: a */
    public final void mo13679a(iwp iwp) {
        boolean z;
        Object obj = (Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP);
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        long longValue = ((Long) jri.m13404b(obj)).longValue() - this.f22784b.getAndSet(obj.longValue());
        int a;
        String str;
        StringBuilder stringBuilder;
        if (bjf.FPS_30.mo1981a(longValue) && this.f22786d != bjf.FPS_30) {
            this.f22786d = bjf.FPS_30;
            a = this.f22785c.mo13689a(this.f22786d.f1232c);
            str = f22783a;
            stringBuilder = new StringBuilder(63);
            stringBuilder.append("FPS changes from 60 to 30, new bitrate would be ");
            stringBuilder.append((float) a);
            bli.m888a(str, stringBuilder.toString());
        } else if (bjf.FPS_60.mo1981a(longValue) && this.f22786d != bjf.FPS_60) {
            this.f22786d = bjf.FPS_60;
            a = this.f22785c.mo13689a(this.f22786d.f1232c);
            str = f22783a;
            stringBuilder = new StringBuilder(63);
            stringBuilder.append("FPS changes from 30 to 60, new bitrate would be ");
            stringBuilder.append((float) a);
            bli.m888a(str, stringBuilder.toString());
        }
    }
}
