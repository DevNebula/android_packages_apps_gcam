package p000;

import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: kri */
final class kri extends krh {
    /* renamed from: d */
    private final byte[] f25361d;
    /* renamed from: e */
    private final int f25362e;
    /* renamed from: f */
    private int f25363f;

    kri(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i)}));
        }
        this.f25361d = bArr;
        this.f25363f = 0;
        this.f25362e = i;
    }

    /* renamed from: i */
    public final int mo14178i() {
        return this.f25362e - this.f25363f;
    }

    /* renamed from: a */
    public final void mo14153a(byte b) {
        try {
            byte[] bArr = this.f25361d;
            int i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = b;
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25363f), Integer.valueOf(this.f25362e), Integer.valueOf(1)}), e);
        }
    }

    /* renamed from: b */
    private final void m16985b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f25361d, this.f25363f, i2);
            this.f25363f += i2;
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25363f), Integer.valueOf(this.f25362e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: a */
    public final void mo14158a(int i, boolean z) {
        mo14177h(i, 0);
        mo14153a(z);
    }

    /* renamed from: a */
    public final void mo14159a(byte[] bArr, int i) {
        mo14183p(i);
        m16985b(bArr, 0, i);
    }

    /* renamed from: c */
    public final void mo14164c(int i, kqx kqx) {
        mo14177h(i, 2);
        mo14163b(kqx);
    }

    /* renamed from: b */
    public final void mo14163b(kqx kqx) {
        mo14183p(kqx.mo10227b());
        kqx.mo10224a((kqw) this);
    }

    /* renamed from: e */
    public final void mo14170e(int i, int i2) {
        mo14177h(i, 5);
        mo14180m(i2);
    }

    /* renamed from: m */
    public final void mo14180m(int i) {
        try {
            byte[] bArr = this.f25361d;
            int i2 = this.f25363f;
            this.f25363f = i2 + 1;
            bArr[i2] = (byte) i;
            i2 = this.f25363f;
            this.f25363f = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            i2 = this.f25363f;
            this.f25363f = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            i2 = this.f25363f;
            this.f25363f = i2 + 1;
            bArr[i2] = i >> 24;
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25363f), Integer.valueOf(this.f25362e), Integer.valueOf(1)}), e);
        }
    }

    /* renamed from: d */
    public final void mo14167d(int i, long j) {
        mo14177h(i, 1);
        mo14169d(j);
    }

    /* renamed from: d */
    public final void mo14169d(long j) {
        try {
            byte[] bArr = this.f25361d;
            int i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) j);
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) (j >> 8));
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) (j >> 16));
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) (j >> 24));
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) (j >> 32));
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) (j >> 40));
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) (j >> 48));
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) (j >> 56));
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25363f), Integer.valueOf(this.f25362e), Integer.valueOf(1)}), e);
        }
    }

    /* renamed from: f */
    public final void mo14173f(int i, int i2) {
        mo14177h(i, 0);
        mo14181n(i2);
    }

    /* renamed from: n */
    public final void mo14181n(int i) {
        if (i >= 0) {
            mo14183p(i);
        } else {
            mo14175f((long) i);
        }
    }

    /* renamed from: a */
    public final void mo10220a(byte[] bArr, int i, int i2) {
        m16985b(bArr, i, i2);
    }

    /* renamed from: c */
    final void mo14165c(int i, kte kte, ktr ktr) {
        int i2;
        mo14177h(i, 2);
        kqo kqo = (kqo) kte;
        int a = kqo.mo15154a();
        if (a == -1) {
            a = ktr.mo10360a(kqo);
            kqo.mo15155a(a);
            i2 = a;
        } else {
            i2 = a;
        }
        mo14183p(i2);
        ktr.mo10363a((Object) kte, this.f21973c);
    }

    /* renamed from: c */
    public final void mo14166c(kte kte) {
        mo14183p(kte.mo14187e());
        kte.mo14185a(this);
    }

    /* renamed from: b */
    public final void mo14161b(int i, kte kte) {
        mo14177h(1, 3);
        mo14179i(2, i);
        mo14177h(3, 2);
        mo14166c(kte);
        mo14177h(1, 4);
    }

    /* renamed from: d */
    public final void mo14168d(int i, kqx kqx) {
        mo14177h(1, 3);
        mo14179i(2, i);
        mo14164c(3, kqx);
        mo14177h(1, 4);
    }

    /* renamed from: b */
    public final void mo14160b(int i, String str) {
        mo14177h(i, 2);
        mo14162b(str);
    }

    /* renamed from: b */
    public final void mo14162b(String str) {
        int i = this.f25363f;
        int l;
        try {
            l = krh.m14103l(str.length() * 3);
            int l2 = krh.m14103l(str.length());
            if (l2 == l) {
                this.f25363f = i + l2;
                l = kur.m5418a(str, this.f25361d, this.f25363f, mo14178i());
                this.f25363f = i;
                mo14183p((l - i) - l2);
                this.f25363f = l;
                return;
            }
            mo14183p(kur.m5417a((CharSequence) str));
            this.f25363f = kur.m5418a(str, this.f25361d, this.f25363f, mo14178i());
        } catch (Throwable e) {
            this.f25363f = i;
            krh.f21971a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(ksd.f8883a);
            try {
                l = bytes.length;
                mo14183p(l);
                mo10220a(bytes, 0, l);
            } catch (Throwable e2) {
                throw new krj(e2);
            } catch (krj e3) {
                throw e3;
            }
        } catch (Throwable e22) {
            throw new krj(e22);
        }
    }

    /* renamed from: h */
    public final void mo14177h(int i, int i2) {
        mo14183p((i << 3) | i2);
    }

    /* renamed from: i */
    public final void mo14179i(int i, int i2) {
        mo14177h(i, 0);
        mo14183p(i2);
    }

    /* renamed from: p */
    public final void mo14183p(int i) {
        byte[] bArr;
        int i2;
        if (!krh.f21972b || mo14178i() < 10) {
            while ((i & -128) != 0) {
                try {
                    bArr = this.f25361d;
                    i2 = this.f25363f;
                    this.f25363f = i2 + 1;
                    bArr[i2] = (byte) ((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
                    i >>>= 7;
                } catch (Throwable e) {
                    throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25363f), Integer.valueOf(this.f25362e), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f25361d;
            i2 = this.f25363f;
            this.f25363f = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        while ((i & -128) != 0) {
            bArr = this.f25361d;
            i2 = this.f25363f;
            this.f25363f = i2 + 1;
            kul.m5383a(bArr, (long) i2, (byte) ((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128));
            i >>>= 7;
        }
        bArr = this.f25361d;
        i2 = this.f25363f;
        this.f25363f = i2 + 1;
        kul.m5383a(bArr, (long) i2, (byte) i);
    }

    /* renamed from: f */
    public final void mo14174f(int i, long j) {
        mo14177h(i, 0);
        mo14175f(j);
    }

    /* renamed from: f */
    public final void mo14175f(long j) {
        byte[] bArr;
        int i;
        if (!krh.f21972b || mo14178i() < 10) {
            while ((j & -128) != 0) {
                try {
                    bArr = this.f25361d;
                    i = this.f25363f;
                    this.f25363f = i + 1;
                    bArr[i] = (byte) ((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
                    j >>>= 7;
                } catch (Throwable e) {
                    throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25363f), Integer.valueOf(this.f25362e), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f25361d;
            i = this.f25363f;
            this.f25363f = i + 1;
            bArr[i] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            bArr = this.f25361d;
            i = this.f25363f;
            this.f25363f = i + 1;
            kul.m5383a(bArr, (long) i, (byte) ((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128));
            j >>>= 7;
        }
        bArr = this.f25361d;
        i = this.f25363f;
        this.f25363f = i + 1;
        kul.m5383a(bArr, (long) i, (byte) ((int) j));
    }
}
