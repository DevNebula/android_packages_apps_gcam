package p000;

import java.util.Arrays;

/* renamed from: ibv */
public final class ibv extends ibm implements Cloneable {
    /* renamed from: a */
    private byte[] f24570a;
    /* renamed from: b */
    private String f24571b;
    /* renamed from: c */
    private byte[][] f24572c;

    public ibv() {
        this.f24570a = ibs.f7284f;
        this.f24571b = "";
        this.f24572c = ibs.f7283e;
        this.f20855o = null;
        this.f7278p = -1;
    }

    /* renamed from: b */
    private final ibv m16316b() {
        try {
            ibv ibv = (ibv) super.clone();
            Object obj = this.f24572c;
            if (obj != null && obj.length > 0) {
                ibv.f24572c = (byte[][]) obj.clone();
            }
            return ibv;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    protected final int mo8342a() {
        int i = 0;
        int a = super.mo8342a();
        if (!Arrays.equals(this.f24570a, ibs.f7284f)) {
            a += ibl.m3683b(1, this.f24570a);
        }
        byte[][] bArr = this.f24572c;
        if (bArr != null && bArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f24572c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += ibl.m3675a(bArr3);
                }
                i++;
            }
            a = (a + i2) + i3;
        }
        String str = this.f24571b;
        return (str == null || str.equals("")) ? a : a + ibl.m3682b(4, this.f24571b);
    }

    /* renamed from: a */
    public final void mo8343a(ibl ibl) {
        if (!Arrays.equals(this.f24570a, ibs.f7284f)) {
            ibl.mo8327a(1, this.f24570a);
        }
        byte[][] bArr = this.f24572c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f24572c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    ibl.mo8327a(2, bArr3);
                }
                i++;
            }
        }
        String str = this.f24571b;
        if (!(str == null || str.equals(""))) {
            ibl.mo8326a(4, this.f24571b);
        }
        super.mo8343a(ibl);
    }

    /* renamed from: c */
    public final /* synthetic */ ibm mo13616c() {
        return (ibv) clone();
    }

    /* renamed from: d */
    public final /* synthetic */ ibr mo8345d() {
        return (ibv) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibv)) {
            return false;
        }
        ibv ibv = (ibv) obj;
        if (!Arrays.equals(this.f24570a, ibv.f24570a)) {
            return false;
        }
        String str = this.f24571b;
        if (str != null) {
            if (!str.equals(ibv.f24571b)) {
                return false;
            }
        } else if (ibv.f24571b != null) {
            return false;
        }
        return ibq.m3712a(this.f24572c, ibv.f24572c) ? (this.f20855o == null || this.f20855o.mo8333a()) ? ibv.f20855o == null || ibv.f20855o.mo8333a() : this.f20855o.equals(ibv.f20855o) : false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + Arrays.hashCode(this.f24570a)) * 31;
        String str = this.f24571b;
        int hashCode2 = ((((((str != null ? str.hashCode() : 0) + hashCode) * 31) + ibq.m3706a(this.f24572c)) * 31) + 1237) * 31;
        if (!(this.f20855o == null || this.f20855o.mo8333a())) {
            i = this.f20855o.hashCode();
        }
        return hashCode2 + i;
    }
}
