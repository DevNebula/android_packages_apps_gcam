package p000;

import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gfz */
public final class gfz extends gfk {
    /* renamed from: c */
    public static final String f26397c = bli.m887a("LkyShtImgFltr");
    /* renamed from: d */
    private final kbg f26398d;
    /* renamed from: e */
    private final epl f26399e;
    /* renamed from: f */
    private gfw f26400f = null;
    /* renamed from: g */
    private double f26401g = 0.0d;

    private gfz(gfh gfh, ggw ggw, kbg kbg, epl epl) {
        super(gfh, ggw, true);
        this.f26398d = kbg;
        this.f26399e = epl;
    }

    public final synchronized void close() {
        SystemClock.elapsedRealtimeNanos();
        super.close();
    }

    /* renamed from: a */
    public static gfz m17717a(gfa gfa, Executor executor, kbg kbg, iqb iqb, ggc ggc, ird ird) {
        Long.toString(SystemClock.elapsedRealtime());
        epl epl = new epl(new iya());
        ggw ggw = new ggw(gfa, executor, iqb, ggc, epl, ird);
        gfz gfz = new gfz(gfa, ggw, kbg, epl);
        ggw.f5417c = gfz;
        return gfz;
    }

    /* renamed from: a */
    public final synchronized void mo15536a(Set set, gkr gkr) {
        String str;
        int size;
        StringBuilder stringBuilder;
        if (set.size() == 0) {
            str = f26397c;
            size = set.size();
            stringBuilder = new StringBuilder(104);
            stringBuilder.append("Filtered Image future failed to return a single image. There are ");
            stringBuilder.append(size);
            stringBuilder.append(" images.  No Image produced.");
            bli.m898e(str, stringBuilder.toString());
        } else if (set.size() > 1) {
            str = f26397c;
            size = set.size();
            stringBuilder = new StringBuilder(88);
            stringBuilder.append("Filtered Image return multiple images. There are ");
            stringBuilder.append(size);
            stringBuilder.append(" images.  No Image produced.");
            bli.m891b(str, stringBuilder.toString());
            throw new IllegalStateException("Lucky Shot Filter returned multiple images.");
        } else {
            this.f26399e.f4265e = SystemClock.elapsedRealtimeNanos();
            str = f26397c;
            epl epl = this.f26399e;
            long j = epl.f4265e;
            long j2 = epl.f4264d;
            StringBuilder stringBuilder2 = new StringBuilder(54);
            stringBuilder2.append("LS calculation session time (ms)= ");
            stringBuilder2.append((j - j2) / 1000000);
            bli.m896d(str, stringBuilder2.toString());
            grg h = gkr.mo7077h();
            if (h != null) {
                grj a = h.mo7364a();
                if (a != null) {
                    epl = this.f26399e;
                    a.f19516c = epl.f4264d;
                    a.f19517d = epl.f4265e;
                    a.f19518e = epl.mo6444b();
                }
            }
            if (this.f26398d.mo9709b()) {
                ggb ggb = (ggb) this.f26398d.mo9706a();
                gfw gfw = (gfw) set.iterator().next();
                gkr.mo7077h().mo7367a(this.f26399e);
                ggb.f5395b.f24279a.f18627a.mo8837e("finish lucky shot selection, pass to the piped image saver");
                try {
                    ggb.f5394a.mo13282a(gfw.f5387b, (kpk) jri.m13404b(gfw.f5389d));
                } finally {
                    ggb.f5394a.close();
                }
            }
        }
    }

    /* renamed from: a */
    public final kpk mo13340a() {
        this.f26399e.f4264d = SystemClock.elapsedRealtimeNanos();
        return super.mo13340a();
    }

    /* renamed from: a */
    public final synchronized gfw mo15535a(gfw gfw, double d) {
        gfw gfw2 = this.f26400f;
        if (gfw2 == null || d > this.f26401g) {
            this.f26400f = gfw;
            this.f26401g = d;
            gfw = gfw2;
        }
        return gfw;
    }
}
