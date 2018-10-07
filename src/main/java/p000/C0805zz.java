package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: zz */
public final class C0805zz implements C0625zy {
    /* renamed from: a */
    public final C0625zy f22473a;
    /* renamed from: b */
    private final Handler f22474b = new Handler(Looper.getMainLooper());

    private C0805zz(C0625zy c0625zy) {
        this.f22473a = c0625zy;
    }

    /* renamed from: a */
    public static C0805zz m14879a(Handler handler, C0625zy c0625zy) {
        if (handler == null || c0625zy == null) {
            return null;
        }
        return new C0805zz(c0625zy);
    }

    /* renamed from: a */
    public final void mo11602a(int i) {
        this.f22474b.post(new aab(this, i));
    }

    /* renamed from: a */
    public final void mo11604a(aah aah) {
        this.f22474b.post(new aaa(this, aah));
    }

    /* renamed from: a */
    public final void mo11603a(int i, String str) {
        this.f22474b.post(new aac(this, i, str));
    }

    /* renamed from: b */
    public final void mo11606b(int i, String str) {
        this.f22474b.post(new aad(this, i, str));
    }

    /* renamed from: a */
    public final void mo11605a(C0619zs c0619zs, String str) {
        this.f22474b.post(new aae(this, c0619zs, str));
    }
}
