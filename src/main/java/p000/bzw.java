package p000;

import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: bzw */
public final class bzw implements iqo {
    /* renamed from: a */
    public final ByteBuffer f12064a;
    /* renamed from: b */
    public final int f12065b;
    /* renamed from: c */
    public final int f12066c;
    /* renamed from: d */
    private final SWIGTYPE_p_unsigned_char f12067d;

    public bzw(SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j, int i, int i2) {
        this.f12067d = sWIGTYPE_p_unsigned_char;
        this.f12065b = i;
        this.f12066c = i2;
        this.f12064a = BufferUtils.byteBufferViewOfNativePointer(sWIGTYPE_p_unsigned_char, (int) j);
    }

    public final void close() {
        GcamModule.delete_uint8_array(this.f12067d);
    }
}
