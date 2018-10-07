package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: glx */
public final class glx implements kwk {
    /* renamed from: a */
    private final kwk f19297a;
    /* renamed from: b */
    private final kwk f19298b;
    /* renamed from: c */
    private final kwk f19299c;

    public glx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f19297a = kwk;
        this.f19298b = kwk2;
        this.f19299c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f19297a;
        kwk kwk2 = this.f19298b;
        kwk kwk3 = this.f19299c;
        kwk.mo10566a();
        return (gln) ktm.m14219a(new glo((gnu) kwk3.mo10566a(), new ikd(), new iya(), (irs) kwk2.mo10566a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static kpk m11388a(get get, InputStream inputStream, int i, int i2, int i3, ExifInterface exifInterface) {
        return get.mo7074a(inputStream, new glz(new iqp(i, i2), ixx.JPEG).mo7221a(exifInterface).mo7222a(Integer.valueOf(i3)));
    }

    @Deprecated
    /* renamed from: a */
    public static kpk m11389a(get get, byte[] bArr, int i, int i2, int i3, ExifInterface exifInterface) {
        return glx.m11388a(get, new ByteArrayInputStream(bArr), i, i2, i3, exifInterface);
    }
}
