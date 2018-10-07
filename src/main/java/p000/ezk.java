package p000;

import android.annotation.TargetApi;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: ezk */
public class ezk {
    /* renamed from: a */
    public final boolean f4610a;
    /* renamed from: b */
    public final boolean f4611b;
    /* renamed from: c */
    public final boolean f4612c;

    public ezk() {
        this.f4610a = false;
        this.f4611b = false;
        this.f4612c = false;
    }

    public ezk(ery ery) {
        boolean z = false;
        float f = (((float) ery.f4408c) * 360.0f) / ((float) ery.f4410e);
        boolean z2 = ery.f4407b ? !ery.f4412g ? f < 70.0f ? (((float) ery.f4409d) * 180.0f) / ((float) ery.f4411f) >= 70.0f : true : false : false;
        this.f4610a = z2;
        if (!ery.f4412g && f == 360.0f) {
            z = true;
        }
        this.f4611b = z;
        this.f4612c = ery.f4413h;
    }
}
