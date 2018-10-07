package p000;

import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: adk */
public final class adk {
    /* renamed from: a */
    public final agw f332a;
    /* renamed from: b */
    public final agu f333b;

    public adk(agw agw, agu agu) {
        this.f332a = agw;
        this.f333b = agu;
    }

    /* renamed from: a */
    public static int m162a(List list, InputStream inputStream, agu agu) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new amw(inputStream, agu);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                int a = ((ImageHeaderParser) list.get(i)).mo2417a(inputStream, agu);
                if (a == -1) {
                    inputStream.reset();
                    i++;
                } else {
                    inputStream.reset();
                    return a;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static ImageType m163b(List list, InputStream inputStream, agu agu) {
        if (inputStream == null) {
            return ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new amw(inputStream, agu);
        }
        inputStream.mark(5242880);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ImageType a = ((ImageHeaderParser) list.get(i)).mo2418a(inputStream);
                if (a == ImageType.UNKNOWN) {
                    inputStream.reset();
                    i++;
                } else {
                    inputStream.reset();
                    return a;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public final byte[] mo171a(int i) {
        agu agu = this.f333b;
        if (agu == null) {
            return new byte[i];
        }
        return (byte[]) agu.mo272a(i, byte[].class);
    }

    /* renamed from: a */
    public final void mo169a(Bitmap bitmap) {
        this.f332a.mo284a(bitmap);
    }

    /* renamed from: a */
    public final void mo170a(byte[] bArr) {
        agu agu = this.f333b;
        if (agu != null) {
            agu.mo276a((Object) bArr);
        }
    }
}
