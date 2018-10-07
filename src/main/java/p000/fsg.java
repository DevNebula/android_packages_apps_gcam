package p000;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: fsg */
final class fsg implements gfn {
    /* renamed from: a */
    private final /* synthetic */ fsf f18756a;

    fsg(fsf fsf) {
        this.f18756a = fsf;
    }

    /* renamed from: a */
    public final void mo7114a(ggu ggu, ggs ggs) {
        gfn gfn = this.f18756a.f4908c;
        if (gfn != null) {
            gfn.mo7114a(ggu, ggs);
        }
    }

    /* renamed from: a */
    public final void mo7115a(ggu ggu, ggv ggv) {
        gfn gfn = this.f18756a.f4908c;
        if (gfn != null) {
            gfn.mo7115a(ggu, ggv);
        }
        if (ggu.f5411a == C0252go.f5823aV) {
            this.f18756a.f4906a = true;
        } else if (ggu.f5411a == C0252go.f5824aW) {
            this.f18756a.f4907b = true;
        }
        fsf fsf = this.f18756a;
        if (fsf.f4906a && fsf.f4907b) {
            fsf.f4908c = null;
        }
    }

    /* renamed from: a */
    public final void mo7113a(ggu ggu, Uri uri) {
        gfn gfn = this.f18756a.f4908c;
        if (gfn != null) {
            gfn.mo7113a(ggu, uri);
        }
    }

    /* renamed from: a */
    public final void mo7112a(ggu ggu) {
    }
}
