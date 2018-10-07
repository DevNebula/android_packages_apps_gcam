package p000;

import android.os.Looper;

/* renamed from: hvc */
public final class hvc {
    /* renamed from: a */
    public hzv f7078a;
    /* renamed from: b */
    private Looper f7079b;

    /* renamed from: a */
    public final hvb mo8161a() {
        if (this.f7078a == null) {
            this.f7078a = new hzv();
        }
        if (this.f7079b == null) {
            if (Looper.myLooper() == null) {
                this.f7079b = Looper.getMainLooper();
            } else {
                this.f7079b = Looper.myLooper();
            }
        }
        return new hvb(this.f7078a, this.f7079b);
    }
}
