package p000;

/* compiled from: PG */
/* renamed from: dgv */
final class dgv implements hnz {
    /* renamed from: a */
    private final /* synthetic */ dgl f13808a;

    dgv(dgl dgl) {
        this.f13808a = dgl;
    }

    /* renamed from: a */
    public final void mo7988a(boolean z) {
        if (!z) {
            dgl dgl = this.f13808a;
            cwh cwh = dgl.f23920z;
            boolean z2 = cwh != null ? ((Boolean) cwh.mo14832b().mo13673b()).booleanValue() ? !dgl.f23904j.f19934a.mo10582c() : false : false;
            if (z2) {
                dgl dgl2 = this.f13808a;
                dgl2.f23919y = true;
                dgl2.f23899e.onShutterButtonClick();
            }
        }
        this.f13808a.f23871C.mo7671a(z);
    }

    /* renamed from: b */
    public final void mo7989b(boolean z) {
        if (z && !this.f13808a.f23904j.f19934a.mo10582c()) {
            this.f13808a.f23916v.mo8011j();
        }
    }

    /* renamed from: c */
    public final void mo7990c(boolean z) {
        if (z && !this.f13808a.f23904j.f19934a.mo10582c()) {
            this.f13808a.f23916v.mo8012k();
        }
    }
}
