package p000;

import android.hardware.camera2.CaptureResult.Key;

/* compiled from: PG */
/* renamed from: fjr */
public final class fjr implements fjs {
    /* renamed from: a */
    private final Key f18336a;
    /* renamed from: b */
    private final keu f18337b;

    public fjr(Key key, keu keu) {
        this.f18336a = key;
        this.f18337b = keu;
    }

    /* renamed from: a */
    public final boolean mo6836a(iwp iwp) {
        return this.f18337b.contains(iwp.mo13730a(this.f18336a)) ^ 1;
    }
}
