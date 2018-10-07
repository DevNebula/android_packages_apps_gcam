package p000;

import com.google.android.apps.camera.stats.BurstSessionStatistics;

/* compiled from: PG */
/* renamed from: cwn */
final class cwn implements kaw {
    /* renamed from: a */
    private final /* synthetic */ boolean f13358a;
    /* renamed from: b */
    private final /* synthetic */ BurstSessionStatistics f13359b;
    /* renamed from: c */
    private final /* synthetic */ cwj f13360c;

    cwn(cwj cwj, boolean z, BurstSessionStatistics burstSessionStatistics) {
        this.f13360c = cwj;
        this.f13358a = z;
        this.f13359b = burstSessionStatistics;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            this.f13360c.f13335g.mo7330c();
            this.f13360c.f13340l.mo2063b(this.f13358a);
            this.f13359b.mo12607i();
        } else if (this.f13358a) {
            this.f13360c.f13340l.mo2061a();
            ((chy) this.f13360c.f13338j.mo10562a()).mo2314h_();
            ((chy) this.f13360c.f13338j.mo10562a()).mo2315i_();
        }
        return bool;
    }
}
