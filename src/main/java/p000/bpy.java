package p000;

/* compiled from: PG */
/* renamed from: bpy */
class bpy extends gqj {
    /* renamed from: a */
    private final /* synthetic */ bpx f22839a;

    bpy(bpx bpx) {
        this.f22839a = bpx;
        super((byte) 0);
    }

    /* renamed from: a */
    public void mo13422a(int i, int i2, float f) {
        boolean z;
        bqb bqb = this.f22839a.f22837d;
        bqb.f22847f = i;
        bqb.f22848g = i2 - i;
        bqb.f22849h = f;
        bpr bpr = bqb.f22842a.f2465a;
        if (i + i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13398a(z, "Expecting -minExposure to be equal to maxExposure, was [%s, %s]", i, i2);
        bpr.f1440s = (((int) (((float) i2) * f)) * 6) + 1;
    }

    /* renamed from: a */
    public final void mo7343a() {
        this.f22839a.f22834a.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f22839a.f22834a.setVisibility(0);
    }
}
