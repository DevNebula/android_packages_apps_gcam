package p000;

/* compiled from: PG */
/* renamed from: cyh */
final class cyh implements hnz {
    /* renamed from: a */
    private final /* synthetic */ cyd f13476a;

    cyh(cyd cyd) {
        this.f13476a = cyd;
    }

    /* renamed from: a */
    public final void mo7988a(boolean z) {
        cyd cyd = this.f13476a;
        if (!cyd.f25823I) {
            if (z) {
                cyd.f25881h.mo2340a();
            } else if (!cyd.f25881h.mo2341b()) {
                if (this.f13476a.f25899z.f3057c.mo13532b()) {
                    this.f13476a.mo15488n();
                    return;
                } else if (this.f13476a.mo15491v()) {
                    cyd = this.f13476a;
                    cyd.f25822H = true;
                    cyd.f25885l.onShutterButtonClick();
                }
            }
            this.f13476a.f25884k.mo7671a(z);
        }
    }

    /* renamed from: b */
    public final void mo7989b(boolean z) {
        if (z && this.f13476a.mo15491v()) {
            this.f13476a.f25886m.mo8011j();
        }
    }

    /* renamed from: c */
    public final void mo7990c(boolean z) {
        if (z && this.f13476a.mo15491v()) {
            this.f13476a.f25886m.mo8012k();
        }
    }
}
