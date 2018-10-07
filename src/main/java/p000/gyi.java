package p000;

import android.app.Activity;
import android.graphics.RectF;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.views.MainActivityLayout;

@Deprecated
/* compiled from: PG */
/* renamed from: gyi */
public final class gyi implements hik {
    /* renamed from: a */
    public final Activity f19825a;
    /* renamed from: b */
    private final MainActivityLayout f19826b;

    static {
        bli.m887a("CaptLayoutHelper");
    }

    public gyi(Activity activity) {
        this.f19825a = activity;
        this.f19826b = (MainActivityLayout) activity.findViewById(R.id.activity_root_view);
    }

    /* renamed from: a */
    public final RectF mo7882a() {
        return new RectF(((gxy) jqk.m13354c((gxy) this.f19826b.f12894d.mo9715b())).mo7529a().mo7517e());
    }

    /* renamed from: a */
    public final void mo13503a(int i, int i2, boolean z) {
        this.f19826b.mo12648a(i, i2, z);
    }
}
