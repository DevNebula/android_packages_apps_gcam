package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder;

/* compiled from: PG */
/* renamed from: hpo */
class hpo extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f26491a;

    hpo(hpf hpf) {
        this.f26491a = hpf;
    }

    /* renamed from: ag */
    public void mo14940ag() {
    }

    /* renamed from: a */
    public final void mo7343a() {
        hpf hpf = this.f26491a;
        if (!hpf.f26480o) {
            if (((Float) hpf.f26476k.mo13673b()).floatValue() == hpf.f26486u) {
                hpf.f26475j.postDelayed(hpf.f26487v, ImageDecoder.CONSUMER_REGISTRATION_DELAY_MS);
            } else {
                hpf.f26475j.removeCallbacks(hpf.f26487v);
            }
        }
    }

    /* renamed from: b */
    public final void mo7344b() {
        hpf hpf = this.f26491a;
        hpf.f26475j.removeCallbacks(hpf.f26487v);
    }

    /* renamed from: e */
    public void mo13438e() {
        this.f26491a.f26479n.reverse();
    }

    /* renamed from: ak */
    public void mo14944ak() {
        this.f26491a.f26484s.start();
    }

    /* renamed from: b */
    public void mo14949b(boolean z) {
        float floatValue = ((Float) this.f26491a.f26476k.mo13673b()).floatValue();
        hpf hpf = this.f26491a;
        float pow = (float) Math.pow((double) (hpf.f26485t / hpf.f26486u), 0.10000000149011612d);
        if (z) {
            floatValue *= pow;
        } else {
            floatValue /= pow;
        }
        hpf hpf2 = this.f26491a;
        pow = hpf2.f26485t;
        if (floatValue <= pow) {
            pow = hpf2.f26486u;
            if (floatValue >= pow) {
                pow = floatValue;
            }
        }
        hpf2.f26478m.setFloatValues(new float[]{((Float) hpf2.f26476k.mo13673b()).floatValue(), pow});
        this.f26491a.f26478m.start();
    }

    /* renamed from: c */
    public void mo14950c(boolean z) {
        this.f26491a.f26483r = z;
    }

    /* renamed from: an */
    public void mo14947an() {
    }
}
