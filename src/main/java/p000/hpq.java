package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hpq */
class hpq extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f26493a;

    hpq(hpf hpf) {
        this.f26493a = hpf;
    }

    /* renamed from: a */
    public final void mo7343a() {
        boolean z;
        boolean z2 = true;
        if (this.f26493a.f26485t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "max zoom value hasn't been initialized properly");
        if (this.f26493a.f26486u < 1.0f) {
            z2 = false;
        }
        jri.m13396a(z2, (Object) "min zoom value hasn't been initialized properly");
    }

    /* renamed from: ai */
    public void mo14942ai() {
        hpf hpf = this.f26493a;
        hpf.f26473h.announceForAccessibility(hpf.f26473h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f26476k.mo13673b()}));
    }

    /* renamed from: g */
    public void mo13440g() {
        hpf hpf = this.f26493a;
        hpf.f26473h.announceForAccessibility(hpf.f26473h.getContext().getString(R.string.zoom_announcement, new Object[]{hpf.f26476k.mo13673b()}));
    }

    /* renamed from: b */
    public void mo14948b(float f) {
        float floatValue = ((Float) this.f26493a.f26476k.mo13673b()).floatValue();
        hpf hpf = this.f26493a;
        float f2 = -0.33f + (((floatValue + 0.33f) * f) * f);
        floatValue = hpf.f26485t;
        if (f2 <= floatValue) {
            floatValue = hpf.f26486u;
            if (f2 >= floatValue) {
                floatValue = f2;
            }
        }
        hpf.f26476k.mo8826a(Float.valueOf(floatValue));
    }
}
