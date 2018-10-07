package p000;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: dtf */
public final class dtf implements kwk {
    /* renamed from: a */
    private final kwk f16668a;
    /* renamed from: b */
    private final kwk f16669b;
    /* renamed from: c */
    private final kwk f16670c;
    /* renamed from: d */
    private final kwk f16671d;

    private dtf(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f16668a = kwk;
        this.f16669b = kwk2;
        this.f16670c = kwk3;
        this.f16671d = kwk4;
    }

    /* renamed from: a */
    public static dtf m9514a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new dtf(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f16668a;
        kwk kwk2 = this.f16669b;
        kwk kwk3 = this.f16670c;
        Object obj = (fmg) kwk.mo10566a();
        fhg fhg = (fhg) kwk2.mo10566a();
        era era = (era) kwk3.mo10566a();
        bym bym = (bym) this.f16671d.mo10566a();
        Collection arrayList = new ArrayList();
        arrayList.add(fhg.mo6791b());
        arrayList.add(era.mo6519a(eqv.HDR_PLUS));
        int max_full_metering_sweep_frames = bym.mo2219a().getMax_full_metering_sweep_frames();
        int max_payload_frames = bym.mo2219a().getMax_payload_frames();
        jri.m13404b(obj);
        arrayList.add(ilq.m3890b(obj.mo6851a(), Integer.valueOf(max_full_metering_sweep_frames)));
        arrayList.add(ilq.m3890b(obj.mo6851a(), Integer.valueOf(max_payload_frames)));
        return (ilp) ktm.m14219a(ilq.m3891b(arrayList), "Cannot return null from a non-@Nullable @Provides method");
    }
}
