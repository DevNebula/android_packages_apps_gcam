package p000;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.EncodedBlobCallback;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bzm */
final class bzm extends EncodedBlobCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f12053a;
    /* renamed from: b */
    private final /* synthetic */ bze f12054b;

    bzm(bze bze, bzx bzx) {
        this.f12054b = bze;
        this.f12053a = bzx;
    }

    public final void Run(int i, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, int i2, int i3) {
        boolean z = true;
        bli.m888a(bze.f1762a, String.format(null, "JPEG ready. shotId = %d, resolution = %d x %d, %d bytes", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j)}));
        if (this.f12054b.f1780s != C0252go.f5954z) {
            z = false;
        }
        jri.m13405b(z);
        jri.m13406b(this.f12053a.mo2237d().mo9709b(), (Object) "Received final JPEG but no listener present");
        int i4 = (int) j;
        byte[] bArr = new byte[i4];
        BufferUtils.byteBufferViewOfNativePointer(sWIGTYPE_p_unsigned_char, i4).get(bArr);
        GcamModule.free_uint8_p(sWIGTYPE_p_unsigned_char);
        cad cad = (cad) this.f12053a.mo2237d().mo9706a();
        bzn bzn = new bzn(ByteBuffer.wrap(bArr), i2, i3);
        bzo bzo = cad.f1816c.f12189a;
        fwa fwa = cad.f1814a;
        bzo.mo2232a(fwa, cad.f1815b, fwa.f4981a.f4680g, bzn.f1784b, bzn.f1785c, bzn.f1783a.duplicate().array());
    }
}
