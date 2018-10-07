package p000;

import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.CameraProfile;
import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggx */
public abstract class ggx extends ggr {
    /* renamed from: a */
    private final iqb f19165a;

    static {
        bli.m887a("TaskJpegEnc");
    }

    public ggx(gfw gfw, Executor executor, gfv gfv, int i, get get) {
        super(gfw, executor, gfv, i, get);
        this.f19165a = ggz.f19167a;
    }

    public ggx(ggr ggr, int i) {
        super(ggr, i);
        this.f19165a = ggy.f19166a;
    }

    /* renamed from: a */
    public static byte[] m11279a(byte[] bArr, int i, int i2, int[] iArr) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, iArr);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), CameraProfile.getJpegEncodingQualityParameter(2), byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    protected final ExifInterface mo13350a(kbg kbg, ggt ggt, kpk kpk) {
        itg itg;
        if (kbg.mo9709b()) {
            itg = new itg((ExifInterface) kbg.mo9706a());
        } else {
            itg = itg.m4255a();
        }
        itg.mo8998a(ggt.f5410c, ggt.f5409b, ggt.f5408a, kbg.m4803b((iwp) iel.m3770a(kpk)));
        this.f19165a.mo8765a(itg);
        return itg.f7821a;
    }

    /* renamed from: a */
    static final /* synthetic */ void m11278a() {
    }

    /* renamed from: b */
    static final /* synthetic */ void m11280b() {
    }

    /* renamed from: a */
    public final void mo13352a(long j, ggt ggt, byte[] bArr, int i) {
        this.f5401c.mo7118b().mo7114a(new ggu(j, ggt, i), new ggs(bArr));
    }

    /* renamed from: a */
    public final void mo13351a(long j, ggt ggt, Uri uri, int i) {
        this.f5401c.mo7118b().mo7113a(new ggu(j, ggt, i), uri);
    }
}
