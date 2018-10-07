package p000;

import android.util.Log;

/* renamed from: hqz */
final /* synthetic */ class hqz implements Runnable {
    /* renamed from: a */
    private final hqx f6828a;
    /* renamed from: b */
    private final byte[] f6829b;

    hqz(hqx hqx, byte[] bArr) {
        this.f6828a = hqx;
        this.f6829b = bArr;
    }

    public final void run() {
        hqx hqx = this.f6828a;
        byte[] bArr = this.f6829b;
        if (!hqx.mo14953g() || hqx.mo8042c()) {
            Log.w("LensServiceConnImpl", "ServiceEvent received after connection disposed.");
            return;
        }
        krn b = krn.m5165b();
        krl krl = hqj.f6813a;
        b.f8812b.put(new kro(krl.f8805a, krl.f8808d.f8822b), krl);
        try {
            Object obj;
            Object a = kry.m18195a(hqp.f26756c, bArr, b);
            if (a != null) {
                boolean z;
                boolean booleanValue = Boolean.TRUE.booleanValue();
                byte byteValue = ((Byte) a.mo15667a(C0252go.f5876bV, null)).byteValue();
                if (byteValue == (byte) 1) {
                    z = true;
                } else if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    boolean c = kto.f8910a.mo10315a(a).mo10367c(a);
                    if (booleanValue) {
                        if (c) {
                            obj = a;
                        } else {
                            obj = null;
                        }
                        a.mo15667a(C0252go.f5877bW, obj);
                        z = c;
                    } else {
                        z = c;
                    }
                }
                if (!z) {
                    ksh ksh = new ksh(new jdh().getMessage());
                    if (ksh == null) {
                        throw null;
                    }
                    throw ksh;
                }
            }
            kry kry = (hqp) a;
            if (kry.f26759b == hqn.LENS_SERVICE_API_VERSION.f20781b) {
                krl a2 = kry.m18191a(hqj.f6813a);
                if (a2.f8805a != ((kry) kry.mo15667a(C0252go.f5908ca, null))) {
                    throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
                }
                obj = kry.f26750g.mo10266a(a2.f8808d);
                if (obj == null) {
                    obj = a2.f8806b;
                } else if (a2.f8808d.f8823c.f8982d == gcb.f5298j) {
                    ksf ksf = null;
                    obj = ksf.mo10278a(((Integer) obj).intValue());
                }
                hqx.f24506b = ((hqk) obj).f26685b;
                hqx.mo14952a(3);
            }
        } catch (Throwable e) {
            Log.e("LensServiceConnImpl", "Unable to parse the protobuf.", e);
            hqx.mo14952a(6);
        }
    }
}
