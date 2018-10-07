package p000;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: cmx */
final class cmx implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ Uri f2370a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2371b;

    cmx(cmp cmp, Uri uri) {
        this.f2371b = cmp;
        this.f2370a = uri;
    }

    public final void onClick(View view) {
        cmy cmy = this.f2371b.f2345a;
        Uri uri = this.f2370a;
        if (cmy.f2372a.mo12533c().mo14825d() == 1) {
            cmy.f2372a.mo12535e();
        } else {
            cmy.f2372a.mo12531a(khb.m4924a(uri));
            cmy.f2372a.f12708f.mo5651b();
        }
        cmy.f2372a.f12706d.mo7363a();
        this.f2371b.mo2388a();
    }
}
