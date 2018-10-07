package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpl */
class hpl extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f26488a;

    hpl(hpf hpf) {
        this.f26488a = hpf;
    }

    /* renamed from: a */
    public final void mo7343a() {
        boolean z;
        float f;
        if (this.f26488a.f26485t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "max zoom value hasn't been initialized properly");
        hpf hpf = this.f26488a;
        if (hpf.f26483r) {
            f = hpf.f26485t;
        } else {
            f = hpf.f26486u;
        }
        hpf.f26481p.setFloatValues(new float[]{((Float) hpf.f26476k.mo13673b()).floatValue(), f});
        float abs = Math.abs(f - ((Float) this.f26488a.f26476k.mo13673b()).floatValue());
        hpf hpf2 = this.f26488a;
        hpf2.f26481p.setDuration((long) ((int) ((abs / (hpf2.f26485t - hpf2.f26486u)) * 1500.0f)));
        this.f26488a.f26481p.start();
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f26488a.f26481p.cancel();
    }

    /* renamed from: e */
    public void mo13438e() {
        this.f26488a.f26479n.reverse();
    }

    /* renamed from: am */
    public void mo14946am() {
        hpf hpf = this.f26488a;
        hpf.f26473h.announceForAccessibility(hpf.f26473h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f26476k.mo13673b()}));
    }
}
