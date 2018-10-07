package p000;

import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cwp */
final class cwp implements kov {
    /* renamed from: a */
    public final /* synthetic */ BurstSessionStatistics f13362a;
    /* renamed from: b */
    public final /* synthetic */ cwj f13363b;
    /* renamed from: c */
    private final /* synthetic */ chw f13364c;

    cwp(cwj cwj, chw chw, BurstSessionStatistics burstSessionStatistics) {
        this.f13363b = cwj;
        this.f13364c = chw;
        this.f13362a = burstSessionStatistics;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f13363b.f13329a.mo8831a("error when stopping burst", th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        kpk kpk;
        Boolean bool = (Boolean) obj;
        if (this.f13364c != chw.FORCE_STOP || this.f13363b.f13339k.keySet().isEmpty()) {
            kpk = (kpk) this.f13363b.f13339k.remove(this.f13364c);
        } else {
            Map map = this.f13363b.f13339k;
            kpk = (kpk) map.remove(map.keySet().iterator().next());
        }
        if (bool.booleanValue() && kpk != null) {
            kow.m13878a(kpk, new cwq(this), this.f13363b.f13330b);
        }
    }
}
