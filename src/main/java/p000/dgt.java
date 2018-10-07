package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dgt */
final class dgt implements fbl {
    /* renamed from: a */
    public final /* synthetic */ dgl f13807a;

    dgt(dgl dgl) {
        this.f13807a = dgl;
    }

    /* renamed from: s */
    public final void mo6728s() {
    }

    /* renamed from: t */
    public final void mo6729t() {
        this.f13807a.f23898d.execute(new dgu(this));
    }

    /* renamed from: a */
    public final void mo6727a(float f) {
        if (f == 0.0f) {
            this.f13807a.f23897c.mo12481l().mo13141r();
        } else if (f == 1.0f) {
            this.f13807a.f23897c.mo12481l().mo13142s();
            this.f13807a.f23900f.mo7328a(R.raw.camera_shutter);
        }
    }
}
