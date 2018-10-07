package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gvv */
final class gvv implements eok, eol, gvt {
    /* renamed from: a */
    public static final String f19695a = bli.m887a("IndicatorCtrl");
    /* renamed from: b */
    public final List f19696b = new ArrayList();
    /* renamed from: c */
    private final RoundedThumbnailView f19697c;
    /* renamed from: d */
    private final Callback f19698d = new gvx(this);
    /* renamed from: e */
    private boolean f19699e = false;
    /* renamed from: f */
    private final boolean f19700f;
    /* renamed from: g */
    private final awr f19701g;
    /* renamed from: h */
    private final gst f19702h;
    /* renamed from: i */
    private final ikd f19703i;

    gvv(het het, boolean z, awr awr, gst gst, ikd ikd) {
        this.f19697c = het.f6493g;
        this.f19697c.setCallback(this.f19698d);
        this.f19700f = z;
        this.f19701g = awr;
        this.f19702h = gst;
        this.f19703i = ikd;
    }

    /* renamed from: a */
    public final iqo mo7469a(gvu gvu) {
        this.f19696b.add(gvu);
        return new gvw(this, gvu);
    }

    /* renamed from: a */
    public final void mo7470a() {
        if (!awl.m739b(this.f19701g) && !this.f19700f) {
            Executor executor;
            kpk a = this.f19702h.mo7421a();
            if (a.isDone()) {
                executor = kpq.f8776a;
            } else {
                executor = this.f19703i;
            }
            kow.m13878a(a, new gvy(this), executor);
        }
    }

    /* renamed from: j */
    public final void mo6373j() {
        this.f19697c.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo7474a(boolean z) {
        this.f19699e = z;
    }

    /* renamed from: a */
    public final void mo7472a(hip hip) {
        this.f19697c.setThumbnail(this.f19697c.getDefaultThumbnail(hip), 0);
    }

    /* renamed from: b */
    public final void mo7475b() {
        this.f19697c.setEnabled(false);
        mo7472a(hip.PLACEHOLDER);
    }

    /* renamed from: a */
    public final void mo7473a(String str) {
        if (!this.f19699e && this.f19697c.getVisibility() == 0) {
            this.f19697c.startRevealThumbnailAnimation(str);
        }
    }

    /* renamed from: a */
    public final void mo7471a(Bitmap bitmap, int i) {
        this.f19697c.setVisibility(0);
        this.f19697c.setEnabled(true);
        this.f19697c.setThumbnail(bitmap, i);
    }
}
