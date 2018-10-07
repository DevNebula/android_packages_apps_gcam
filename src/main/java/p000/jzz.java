package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jzz */
public final class jzz implements kah {
    /* renamed from: a */
    private final /* synthetic */ kai f26582a;

    public jzz(kai kai) {
        this.f26582a = kai;
    }

    public final void close() {
        try {
            this.f26582a.close();
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("SharedHandle threw exception: ");
            stringBuilder.append(valueOf);
            Log.e("SafeHandle", stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public final Object mo9673d() {
        return this.f26582a.mo9673d();
    }

    /* renamed from: e */
    public final Object mo9674e() {
        return this.f26582a.mo9674e();
    }

    /* renamed from: D_ */
    public final kah mo13896E_() {
        return jqk.m13341a(this.f26582a.mo13896E_());
    }
}
