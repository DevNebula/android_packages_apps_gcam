package p000;

/* renamed from: ibr */
public class ibr {
    /* renamed from: p */
    public volatile int f7278p = -1;

    /* renamed from: a */
    public static final byte[] m3713a(ibr ibr) {
        byte[] bArr = new byte[ibr.mo8346e()];
        try {
            ibl a = ibl.m3677a(bArr, bArr.length);
            ibr.mo8343a(a);
            if (a.f7269a.remaining() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    protected int mo8342a() {
        return 0;
    }

    /* renamed from: a */
    public void mo8343a(ibl ibl) {
    }

    /* renamed from: d */
    public ibr clone() {
        return (ibr) super.clone();
    }

    /* renamed from: e */
    public final int mo8346e() {
        int a = mo8342a();
        this.f7278p = a;
        return a;
    }

    public String toString() {
        return htl.m3459a(this);
    }
}
