package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bkd */
final class bkd extends fiw {
    /* renamed from: a */
    private final /* synthetic */ bkc f11488a;

    bkd(bkc bkc) {
        this.f11488a = bkc;
    }

    /* renamed from: a */
    public final void mo6823a(Surface surface, long j) {
        String str = bjz.f22791a;
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append("onCaptureBufferLost: frame=");
        stringBuilder.append(j);
        bli.m891b(str, stringBuilder.toString());
        this.f11488a.f1261c.mo15642a(new IllegalStateException("onCaptureBufferLost"));
        this.f11488a.f1262d.mo14569b();
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        this.f11488a.f1260b.mo15641a((Object) iwp);
    }

    /* renamed from: a */
    public final void mo6825a(iwm iwm) {
        String str = bjz.f22791a;
        int a = iwm.mo9132a();
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("onCaptureFailed: reason=");
        stringBuilder.append(a);
        bli.m891b(str, stringBuilder.toString());
        this.f11488a.f1260b.mo15642a(new IllegalStateException("onCaptureFailed"));
        this.f11488a.f1262d.mo14569b();
    }

    /* renamed from: a */
    public final void mo6824a(fhq fhq) {
        this.f11488a.f1259a.mo15641a(null);
    }
}
