package p000;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: aoj */
public final class aoj implements adq {
    /* renamed from: a */
    private final List f10623a;
    /* renamed from: b */
    private final adq f10624b;
    /* renamed from: c */
    private final agu f10625c;

    public aoj(List list, adq adq, agu agu) {
        this.f10623a = list;
        this.f10624b = adq;
        this.f10625c = agu;
    }

    /* renamed from: a */
    public final /* synthetic */ agn mo179a(Object obj, int i, int i2, adp adp) {
        byte[] a = aoj.m6937a((InputStream) obj);
        if (a == null) {
            return null;
        }
        return this.f10624b.mo179a(ByteBuffer.wrap(a), i, i2, adp);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo180a(Object obj, adp adp) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) adp.mo11616a(aoi.f841b)).booleanValue() || adk.m163b(this.f10623a, inputStream, this.f10625c) != ImageType.GIF) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static byte[] m6937a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Throwable e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            return null;
        }
    }
}
