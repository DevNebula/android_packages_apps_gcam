package p000;

import android.util.Log;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: hxa */
abstract class hxa extends hwo {
    /* renamed from: a */
    private int f24523a;

    protected hxa(byte[] bArr) {
        Object obj = null;
        boolean z = true;
        int length = bArr.length;
        if (length != 25) {
            int i;
            if (!(bArr == null || length == 0 || length <= 0)) {
                StringBuilder stringBuilder = new StringBuilder((((length + 16) - 1) / 16) * 57);
                int i2 = 0;
                i = length;
                int i3 = 0;
                while (i > 0) {
                    if (i3 == 0) {
                        if (length >= 65536) {
                            stringBuilder.append(String.format("%08X:", new Object[]{Integer.valueOf(i2)}));
                        } else {
                            stringBuilder.append(String.format("%04X:", new Object[]{Integer.valueOf(i2)}));
                        }
                    } else if (i3 == 8) {
                        stringBuilder.append(" -");
                    }
                    stringBuilder.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i2] & Illuminant.kOther)}));
                    int i4 = i - 1;
                    i = i3 + 1;
                    if (i == 16 || i4 == 0) {
                        stringBuilder.append(10);
                        i = 0;
                    }
                    i2++;
                    i3 = i;
                    i = i4;
                }
                obj = stringBuilder.toString();
            }
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 51);
            stringBuilder2.append("Cert hash data has incorrect length (");
            stringBuilder2.append(length);
            stringBuilder2.append("):\n");
            stringBuilder2.append(valueOf);
            Log.wtf("GoogleCertificates", stringBuilder2.toString(), new Exception());
            bArr = Arrays.copyOfRange(bArr, 0, 25);
            i = bArr.length;
            if (i != 25) {
                z = false;
            }
            StringBuilder stringBuilder3 = new StringBuilder(55);
            stringBuilder3.append("cert hash data has incorrect length. length=");
            stringBuilder3.append(i);
            htl.m3493b(z, stringBuilder3.toString());
        }
        this.f24523a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    protected static byte[] m16269a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final int mo8237b() {
        return hashCode();
    }

    /* renamed from: c */
    abstract byte[] mo14958c();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hwn)) {
            return false;
        }
        try {
            hwn hwn = (hwn) obj;
            if (hwn.mo8237b() != hashCode()) {
                return false;
            }
            return Arrays.equals(mo14958c(), (byte[]) hxj.m16273a(hwn.mo8236a()));
        } catch (Throwable e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public int hashCode() {
        return this.f24523a;
    }

    /* renamed from: a */
    public final hxg mo8236a() {
        return new hxj(mo14958c());
    }
}
