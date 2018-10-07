package p000;

import com.google.common.p006io.ByteStreams;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: kiq */
public abstract class kiq {
    protected kiq() {
    }

    /* renamed from: a */
    public abstract InputStream mo10054a();

    /* renamed from: a */
    public final long mo10053a(kip kip) {
        jri.m13404b((Object) kip);
        kiu a = kiu.m5025a();
        try {
            long copy = ByteStreams.copy((InputStream) a.mo10067a(mo10054a()), (OutputStream) a.mo10067a(kip.mo10052a()));
            a.close();
            return copy;
        } catch (Throwable th) {
            a.close();
        }
    }

    /* renamed from: b */
    public byte[] mo10055b() {
        kiu a = kiu.m5025a();
        try {
            byte[] toByteArray;
            InputStream inputStream = (InputStream) a.mo10067a(mo10054a());
            kbg c = mo10056c();
            if (c.mo9709b()) {
                toByteArray = ByteStreams.toByteArray(inputStream, ((Long) c.mo9706a()).longValue());
            } else {
                toByteArray = ByteStreams.toByteArray(inputStream);
            }
            a.close();
            return toByteArray;
        } catch (Throwable th) {
            a.close();
        }
    }

    /* renamed from: c */
    public kbg mo10056c() {
        return kau.f21835a;
    }
}
