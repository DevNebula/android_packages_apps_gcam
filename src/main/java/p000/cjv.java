package p000;

import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.burstchip.BurstChip;

/* renamed from: cjv */
final /* synthetic */ class cjv implements ckd {
    /* renamed from: a */
    private final cjq f12648a;
    /* renamed from: b */
    private final hec f12649b;

    cjv(cjq cjq, hec hec) {
        this.f12648a = cjq;
        this.f12649b = hec;
    }

    /* renamed from: a */
    public final void mo2347a(BurstChip burstChip) {
        cjq cjq = this.f12648a;
        RoundedThumbnailView roundedThumbnailView = (RoundedThumbnailView) jri.m13404b(cjq.f12643d);
        cjq.mo12505a(new cjy(this.f12649b.mo7762a(burstChip.getContext().getResources())));
        roundedThumbnailView.post(new cjz(roundedThumbnailView));
    }
}
