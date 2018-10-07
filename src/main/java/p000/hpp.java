package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpp */
class hpp extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f26492a;

    hpp(hpf hpf) {
        this.f26492a = hpf;
    }

    /* renamed from: a */
    public final void mo7343a() {
        boolean z;
        if (this.f26492a.f26485t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "max zoom value hasn't been initialized properly");
    }

    /* renamed from: e */
    public void mo13438e() {
        this.f26492a.f26484s.reverse();
        this.f26492a.f26479n.reverse();
    }

    /* renamed from: g */
    public void mo13440g() {
        this.f26492a.f26484s.reverse();
        hpf hpf = this.f26492a;
        hpf.f26473h.announceForAccessibility(hpf.f26473h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f26476k.mo13673b()}));
    }
}
