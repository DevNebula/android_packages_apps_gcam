package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: bnh */
final class bnh {
    /* renamed from: a */
    public final gkr f1365a;
    /* renamed from: b */
    public final UUID f1366b;
    /* renamed from: c */
    public final long f1367c;
    /* renamed from: d */
    public final iqm f1368d;
    /* renamed from: e */
    public final AtomicInteger f1369e = new AtomicInteger(0);
    /* renamed from: f */
    public final AtomicInteger f1370f = new AtomicInteger(0);
    /* renamed from: g */
    public final AtomicInteger f1371g = new AtomicInteger(0);
    /* renamed from: h */
    public final bnx f1372h;
    /* renamed from: i */
    public final BurstSessionStatistics f1373i;
    /* renamed from: j */
    public final iqp f1374j;
    /* renamed from: k */
    public volatile Bitmap f1375k = null;

    bnh(gkr gkr, UUID uuid, long j, iqm iqm, bnx bnx, BurstSessionStatistics burstSessionStatistics, iqp iqp) {
        this.f1365a = gkr;
        this.f1366b = uuid;
        this.f1367c = j;
        this.f1368d = iqm;
        this.f1372h = bnx;
        this.f1373i = burstSessionStatistics;
        this.f1374j = iqp;
    }
}
