package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: ang */
final class ang implements ado {
    /* renamed from: a */
    private final ByteBuffer f10600a = ByteBuffer.allocate(8);

    ang() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo178a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f10600a) {
            this.f10600a.position(0);
            messageDigest.update(this.f10600a.putLong(l.longValue()).array());
        }
    }
}
