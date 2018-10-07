package p000;

import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: aiz */
final class aiz implements adw {
    /* renamed from: a */
    private final File f10329a;

    aiz(File file) {
        this.f10329a = file;
    }

    /* renamed from: b */
    public final void mo188b() {
    }

    /* renamed from: c */
    public final void mo189c() {
    }

    /* renamed from: a */
    public final Class mo186a() {
        return ByteBuffer.class;
    }

    /* renamed from: d */
    public final adf mo190d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        try {
            adx.mo192a(arg.m647a(this.f10329a));
        } catch (Exception e) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
            }
            adx.mo191a(e);
        }
    }
}
