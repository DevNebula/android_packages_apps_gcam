package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hkk */
public final class hkk {
    /* renamed from: a */
    public static final String f6656a = bli.m887a("Vid2ActiveCdrRecSes");
    /* renamed from: b */
    public final bfr f6657b;
    /* renamed from: c */
    public final ikd f6658c;
    /* renamed from: d */
    public final hke f6659d;
    /* renamed from: e */
    public final hkv f6660e;
    /* renamed from: f */
    public final List f6661f = Collections.synchronizedList(new ArrayList());
    /* renamed from: g */
    public final Object f6662g = new Object();
    /* renamed from: h */
    public final Runnable f6663h = new hkm(this);
    /* renamed from: i */
    public final hkw f6664i;
    /* renamed from: j */
    public int f6665j = C0252go.f5906bz;
    /* renamed from: k */
    private final gpn f6666k;
    /* renamed from: l */
    private final gxz f6667l;
    /* renamed from: m */
    private final ScheduledExecutorService f6668m = iel.m3780e("Video2SchEx", 1);
    /* renamed from: n */
    private final Executor f6669n = new bbv("Video2DelEx", VideoProviderSource.TIMESTAMP_FILTER_SIZE);
    /* renamed from: o */
    private final ScheduledFuture f6670o;
    /* renamed from: p */
    private final gtx f6671p;

    public hkk(ikd ikd, hke hke, gpn gpn, gtx gtx, bfr bfr, hkv hkv, gxz gxz, hkw hkw) {
        this.f6657b = bfr;
        this.f6658c = ikd;
        this.f6659d = hke;
        this.f6660e = hkv;
        this.f6666k = gpn;
        this.f6667l = gxz;
        this.f6664i = hkw;
        this.f6671p = gtx;
        this.f6670o = this.f6668m.scheduleAtFixedRate(new hkn(this), 0, 1, TimeUnit.SECONDS);
        gtx.mo7451a(30000, new hkl(this));
    }

    /* renamed from: a */
    public final boolean mo7922a() {
        synchronized (this.f6662g) {
            if (this.f6665j == C0252go.f5906bz) {
                this.f6657b.mo12371h();
                this.f6665j = C0252go.f5855bA;
                this.f6666k.mo7328a(R.raw.video_pause);
                gxz gxz = this.f6667l;
                gxz.f6152c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                gxz.f6152c.setText(gxz.f6151b.getString(R.string.video_recording_paused_indicator, new Object[]{hkd.m3275a(gxz.f6150a)}));
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo7923b() {
        synchronized (this.f6662g) {
            if (this.f6665j != C0252go.f5855bA) {
                return false;
            }
            this.f6666k.mo7328a(R.raw.video_start);
            this.f6669n.execute(new hkr(this));
            return true;
        }
    }

    /* renamed from: a */
    public final kpk mo7921a(boolean z) {
        kpk a;
        synchronized (this.f6662g) {
            String str = f6656a;
            StringBuilder stringBuilder = new StringBuilder(35);
            stringBuilder.append("stopRecording: shouldShutdown=");
            stringBuilder.append(z);
            bli.m888a(str, stringBuilder.toString());
            if (this.f6665j == C0252go.f5857bC || this.f6665j == C0252go.f5856bB) {
                a = kow.m13874a(new IllegalStateException("state is not RECORDING"));
            } else {
                this.f6665j = C0252go.f5856bB;
                this.f6671p.mo7450a();
                this.f6670o.cancel(true);
                this.f6668m.shutdown();
                if (z) {
                    a = this.f6657b.mo12373j();
                } else {
                    a = this.f6657b.mo12374k();
                }
                a = kny.m18475a(a, new hko(this), kpq.f8776a);
            }
        }
        return a;
    }
}
