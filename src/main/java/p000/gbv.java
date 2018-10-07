package p000;

import android.annotation.TargetApi;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: gbv */
public final class gbv {
    /* renamed from: a */
    public final List f5279a = new ArrayList();
    /* renamed from: b */
    public final gbx f5280b;
    /* renamed from: c */
    public final ikd f5281c;
    /* renamed from: d */
    public final Object f5282d = new Object();
    /* renamed from: e */
    public iqm f5283e = iqm.CLOCKWISE_0;
    /* renamed from: f */
    public iqz f5284f;
    /* renamed from: g */
    public int f5285g;

    public gbv(ikd ikd, Context context, ira ira) {
        this.f5281c = ikd;
        this.f5280b = new gbx(this, context);
        this.f5284f = ira.mo8854a("DeviceOrientation");
    }

    /* renamed from: a */
    public final void mo7026a(gbw gbw) {
        if (!this.f5279a.contains(gbw)) {
            this.f5279a.add(gbw);
        }
    }

    /* renamed from: b */
    public final void mo7027b(gbw gbw) {
        if (!this.f5279a.remove(gbw)) {
            this.f5284f.mo8837e("Removing non-existing listener.");
        }
    }
}
