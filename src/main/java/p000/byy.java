package p000;

import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BackgroundAeResultsCallback;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.MemoryStateCallback;
import com.google.googlex.gcam.SimpleCallback;
import com.google.googlex.gcam.hdrplus.MapImageProxyReleaseCallback;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: byy */
final class byy {
    /* renamed from: a */
    public static final String f1748a = bli.m887a("HdrPlusState");
    /* renamed from: b */
    public final InitParams f1749b;
    /* renamed from: c */
    public final ConcurrentMap f1750c = new ConcurrentHashMap();
    /* renamed from: d */
    public final ilb f1751d;
    /* renamed from: e */
    public final ilb f1752e;
    /* renamed from: f */
    public final ilb f1753f;
    /* renamed from: g */
    private final MapImageProxyReleaseCallback f1754g = new MapImageProxyReleaseCallback();
    /* renamed from: h */
    private final MemoryStateCallback f1755h;
    /* renamed from: i */
    private final SimpleCallback f1756i;
    /* renamed from: j */
    private final BackgroundAeResultsCallback f1757j;

    byy(bkw bkw, era era, bxg bxg, fgw fgw, bku bku) {
        boolean z;
        boolean z2 = false;
        Object valueOf = Long.valueOf(0);
        this.f1751d = new ilb(valueOf);
        this.f1752e = new ilb(valueOf);
        this.f1755h = new byz(this);
        this.f1756i = new bza(this);
        this.f1753f = new ilb(new AeResults());
        this.f1757j = new bzb(this);
        int a = ije.m3829a(bkw.f1283a, "camera:gcam_thread_count", hjg.m3254a());
        if (a > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "threadCount %d is not a valid value.");
        InitParams initParams = new InitParams();
        initParams.setThread_count(a);
        if (bku == bku.ENG) {
            z2 = true;
        }
        initParams.setAllow_unknown_devices(z2);
        initParams.setTuning_locked(true);
        initParams.setMax_full_metering_sweep_frames(bxe.m1056a(fgw, bkw));
        initParams.setMin_payload_frames(bxg.f1720g);
        initParams.setMax_payload_frames(bxg.f1721h);
        initParams.setMax_zsl_frames(bxg.f1722i);
        bsn bsn = bxg.f1719a.f1335a;
        initParams.setMemory_callback(this.f1755h);
        initParams.setFinish_queue_empty_callback(this.f1756i);
        initParams.setBackground_ae_results_callback(this.f1757j);
        initParams.setImage_release_callback(this.f1754g);
        this.f1749b = initParams;
        era.mo6521a(new eqx(eqv.HDR_PLUS, this.f1751d, this.f1752e));
    }

    /* renamed from: a */
    final long mo2228a(iwz iwz) {
        return this.f1754g.put(iwz);
    }
}
