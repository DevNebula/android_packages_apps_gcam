package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: iqv */
public final class iqv implements iqz, ira {
    /* renamed from: a */
    private final String f21210a;
    /* renamed from: b */
    private final iqu f21211b;

    public iqv(String str, iqu iqu) {
        this.f21210a = str;
        this.f21211b = iqu;
    }

    /* renamed from: a */
    public final iqz mo8830a(String str) {
        iqu iqu = this.f21211b;
        String valueOf = String.valueOf(iqu.f7703a);
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        int length = str.length();
        int i = iqu.f7704b;
        if (length > i) {
            iqv a = iqu.mo8827a(valueOf2.substring(0, i));
            i = str.length();
            int i2 = iqu.f7704b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 44);
            stringBuilder.append("Tag ");
            stringBuilder.append(str);
            stringBuilder.append(" is ");
            stringBuilder.append(i - i2);
            stringBuilder.append(" chars longer than limit.");
            a.mo8838f(stringBuilder.toString());
        }
        return iqu.mo8827a(valueOf2);
    }

    /* renamed from: b */
    public final void mo8832b(String str) {
        if (this.f21211b.mo8828a(this.f21210a, 3)) {
            Log.d(this.f21210a, str);
        }
    }

    /* renamed from: a */
    public final void mo8831a(String str, Throwable th) {
        if (this.f21211b.mo8828a(this.f21210a, 3)) {
            Log.d(this.f21210a, str, th);
        }
    }

    /* renamed from: c */
    public final void mo8834c(String str) {
        if (this.f21211b.mo8828a(this.f21210a, 6)) {
            Log.e(this.f21210a, str);
        }
    }

    /* renamed from: b */
    public final void mo8833b(String str, Throwable th) {
        if (this.f21211b.mo8828a(this.f21210a, 6)) {
            Log.e(this.f21210a, str, th);
        }
    }

    /* renamed from: d */
    public final void mo8836d(String str) {
        if (this.f21211b.mo8828a(this.f21210a, 4)) {
            Log.i(this.f21210a, str);
        }
    }

    /* renamed from: e */
    public final void mo8837e(String str) {
        if (this.f21211b.mo8828a(this.f21210a, 2)) {
            Log.v(this.f21210a, str);
        }
    }

    /* renamed from: f */
    public final void mo8838f(String str) {
        if (this.f21211b.mo8828a(this.f21210a, 5)) {
            Log.w(this.f21210a, str);
        }
    }

    /* renamed from: c */
    public final void mo8835c(String str, Throwable th) {
        if (this.f21211b.mo8828a(this.f21210a, 5)) {
            Log.w(this.f21210a, str, th);
        }
    }
}
