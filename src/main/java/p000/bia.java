package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bia */
final class bia implements kov {
    /* renamed from: a */
    private final /* synthetic */ bhz f11414a;

    bia(bhz bhz) {
        this.f11414a = bhz;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bhz bhz = this.f11414a;
        Surface surface = bhz.f1204c;
        knk knk = bhz.f1202a;
        bli.m889a(bhy.f11408a, "Fails to start preview", th);
        if (surface.isValid()) {
            knk.mo15642a(th);
            return;
        }
        bli.m891b(bhy.f11408a, "preview surface has became invalid");
        knk.mo15641a(null);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bhz bhz = this.f11414a;
        bhz.f1202a.mo15641a(bhz.f1203b);
    }
}
