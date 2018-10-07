package p000;

import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* renamed from: gbk */
public final /* synthetic */ class gbk implements fzq {
    /* renamed from: a */
    private final OptionsBarView f18987a;
    /* renamed from: b */
    private final fzm f18988b;

    public gbk(OptionsBarView optionsBarView, fzm fzm) {
        this.f18987a = optionsBarView;
        this.f18988b = fzm;
    }

    /* renamed from: a */
    public final void mo6973a(fzp fzp) {
        OptionsBarView optionsBarView = this.f18987a;
        fzq fzq = (fzq) optionsBarView.f23287a.get(this.f18988b);
        if (fzq != null) {
            fzq.mo6973a(fzp);
        }
        optionsBarView.mo14600a();
    }
}
