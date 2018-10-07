package p000;

import com.google.googlex.gcam.InterleavedReadViewU16;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: car */
public final class car implements bzv {
    /* renamed from: a */
    public static final String f22871a = bli.m887a("PostProcImgSvr");
    /* renamed from: b */
    public final hju f22872b;
    /* renamed from: c */
    public final fov f22873c;
    /* renamed from: d */
    public final fov f22874d;
    /* renamed from: e */
    public final Executor f22875e;
    /* renamed from: f */
    public final Executor f22876f;
    /* renamed from: g */
    public final ixv f22877g;
    /* renamed from: h */
    public final cap f22878h;
    /* renamed from: i */
    public final AtomicLong f22879i = new AtomicLong(0);
    /* renamed from: j */
    public final kbg f22880j;
    /* renamed from: k */
    private final kbg f22881k;
    /* renamed from: l */
    private final bmb f22882l;

    public car(hju hju, kbg kbg, ikd ikd, ixv ixv, bmb bmb, cap cap, kbg kbg2) {
        this.f22872b = hju;
        this.f22881k = kbg;
        this.f22877g = ixv;
        this.f22882l = bmb;
        this.f22878h = cap;
        this.f22880j = kbg2;
        this.f22873c = new fov(1);
        this.f22874d = new fov(1);
        this.f22875e = new ikh(ikd, Executors.newSingleThreadExecutor(iel.m3778c("PortEnc", 0)));
        this.f22876f = new ikh(ikd, kpq.f8776a);
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        return new cau(this, fwa.f4982b, fwa.f4984d, this.f22881k, UUID.randomUUID(), (byte) 0);
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return ilq.m3876a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    final InterleavedReadViewU16 mo14577a(kpk kpk) {
        bsn bsn = this.f22882l.f1335a;
        try {
            InterleavedReadViewU16 interleavedReadViewU16 = (InterleavedReadViewU16) kpk.get(100, TimeUnit.MILLISECONDS);
            bli.m896d(f22871a, "Got PD data");
            return interleavedReadViewU16;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new InterleavedReadViewU16();
        } catch (ExecutionException e2) {
            return new InterleavedReadViewU16();
        } catch (TimeoutException e3) {
            return new InterleavedReadViewU16();
        } catch (CancellationException e4) {
            return new InterleavedReadViewU16();
        }
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return fuy.m2452a();
    }

    /* renamed from: c */
    public final bzr mo6917b(fwa fwa) {
        return new cau(this, fwa.f4982b, fwa.f4984d, this.f22881k, UUID.randomUUID(), (byte) 0);
    }
}
