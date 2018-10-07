package p000;

import java.lang.ref.WeakReference;

/* renamed from: hxc */
abstract class hxc extends hxa {
    /* renamed from: b */
    private static final WeakReference f26504b = new WeakReference(null);
    /* renamed from: a */
    private WeakReference f26505a = f26504b;

    hxc(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: c */
    final byte[] mo14958c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f26505a.get();
            if (bArr == null) {
                bArr = mo15550d();
                this.f26505a = new WeakReference(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: d */
    protected abstract byte[] mo15550d();
}
