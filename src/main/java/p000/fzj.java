package p000;

import android.content.res.Configuration;

/* renamed from: fzj */
public final /* synthetic */ class fzj implements emn {
    /* renamed from: a */
    private final fzh f18932a;
    /* renamed from: b */
    private final fzm f18933b;

    public fzj(fzh fzh, fzm fzm) {
        this.f18932a = fzh;
        this.f18933b = fzm;
    }

    /* renamed from: a */
    public final void mo6334a(Configuration configuration) {
        fzh fzh = this.f18932a;
        fzo fzo = this.f18933b.f5085a;
        if (fzh.f5071d.containsKey(fzo)) {
            ((emn) fzh.f5071d.get(fzo)).mo6334a(configuration);
        }
    }
}
