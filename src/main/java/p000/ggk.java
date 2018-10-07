package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.CameraProfile;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.camera.jpegutil.JpegUtilNative;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggk */
public final class ggk extends ggx {
    /* renamed from: a */
    private static final String f24352a = bli.m887a("TaskCompImg2Jpg");
    /* renamed from: b */
    private final ghf f24353b;

    ggk(gfw gfw, Executor executor, gfv gfv, get get, ghf ghf) {
        super(gfw, executor, gfv, C0252go.f5822aU, get);
        this.f24353b = ghf;
    }

    public final void run() {
        ghg c;
        Object obj;
        ggt ggt;
        int i;
        ggt ggt2;
        Object obj2;
        int i2 = 0;
        gfw gfw = (gfw) jri.m13404b(this.f5405g);
        ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7376b();
        int i3;
        ByteBuffer byteBuffer;
        switch (gfw.f5387b.mo13741c()) {
            case 35:
                Rect a = ggr.m2597a(gfw.f5387b, gfw.f5391f);
                try {
                    ggt ggt3 = new ggt(gfw.f5388c, gfw.f5387b.mo13745g(), gfw.f5387b.mo13742d());
                    iqp iqp = new iqp(a.width(), a.height());
                    ggt ggt4 = new ggt(gfw.f5388c, iqp.f7695a, iqp.f7696b);
                    mo7122a(this.f5403e, ggt4, C0252go.f5825aX);
                    i3 = (ggt4.f5410c * 3) * ggt4.f5409b;
                    i2 = i3 / 2;
                    c = this.f24353b.mo7126c(Integer.valueOf(i2));
                    byteBuffer = (ByteBuffer) c.mo13354a();
                    if (byteBuffer != null) {
                        int a2 = JpegUtilNative.m1381a(gfw.f5387b, byteBuffer, CameraProfile.getJpegEncodingQualityParameter(2), gfw.f5391f);
                        if (a2 > i2) {
                            c.close();
                            this.f24353b.mo7126c(Integer.valueOf(i3));
                            byteBuffer = (ByteBuffer) c.mo13354a();
                            if (byteBuffer == null) {
                                this.f5406h.mo7076a(hci.m11977a(), true, "Failed to allocate jpeg buffer for encoding.");
                                c.close();
                                this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
                                return;
                            }
                            a2 = JpegUtilNative.m1381a(gfw.f5387b, byteBuffer, CameraProfile.getJpegEncodingQualityParameter(2), gfw.f5391f);
                            obj = byteBuffer;
                        } else {
                            ByteBuffer obj3 = byteBuffer;
                        }
                        if (a2 >= 0) {
                            obj3.limit(a2);
                            this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
                            ExifInterface exifInterface = itg.m4255a().f7821a;
                            exifInterface.mo12674a(ExifInterface.f13019i, this.f5405g.f5392g, TimeZone.getDefault());
                            ExifInterface obj22 = exifInterface;
                            ggt = ggt3;
                            i = a2;
                            ggt2 = ggt4;
                            break;
                        }
                        c.close();
                        throw new RuntimeException("Error compressing jpeg.");
                    }
                    this.f5406h.mo7076a(hci.m11977a(), true, "Failed to allocate jpeg buffer for encoding.");
                    c.close();
                    return;
                } finally {
                    this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
                }
            case 256:
                try {
                    byteBuffer = ((ixa) gfw.f5387b.mo13743e().get(0)).mo9144a();
                    Object allocate = ByteBuffer.allocate(byteBuffer.limit());
                    if (allocate != null) {
                        ExifInterface a3;
                        isx isx;
                        Integer valueOf;
                        Integer valueOf2;
                        Rect a4;
                        ggt ggt5;
                        byteBuffer.rewind();
                        allocate.put(byteBuffer);
                        byteBuffer.rewind();
                        allocate.rewind();
                        if (allocate.array() != null) {
                            a3 = itg.m4252a(allocate.array());
                            ggm ggm = new ggm(isx.m4217a(a3), ((Integer) jri.m13404b(a3.mo8965a(ExifInterface.f13034x))).intValue(), ((Integer) jri.m13404b(a3.mo8965a(ExifInterface.f13035y))).intValue());
                            isx = ggm.f5398a;
                            valueOf = Integer.valueOf(ggm.f5399b);
                            valueOf2 = Integer.valueOf(ggm.f5400c);
                        } else {
                            a3 = null;
                            valueOf2 = null;
                            valueOf = null;
                            isx = null;
                        }
                        iqm a5 = isx.m4216a(isx);
                        iqm a6 = iqm.m4095a(gfw.f5388c.f7692e + a5.f7692e);
                        if (valueOf == null || valueOf2 == null) {
                            bli.m898e(f24352a, "Cannot parse EXIF for image dimensions, passing 0x0 dimensions");
                            i3 = 0;
                            a4 = ggr.m2597a(gfw.f5387b, ggr.m2596a(gfw.f5391f, a6));
                            i = 0;
                        } else {
                            i3 = valueOf.intValue();
                            i = valueOf2.intValue();
                            a4 = ggr.m2595a(i3, i, ggr.m2596a(gfw.f5391f, a6));
                        }
                        ggt2 = new ggt(a5, i3, i);
                        iwz iwz = gfw.f5387b;
                        if (a4 != null) {
                            i2 = a4.equals(new Rect(0, 0, iwz.mo13745g(), iwz.mo13742d())) ^ 1;
                        }
                        if (i2 != 0) {
                            ggt5 = new ggt(a5, a4.width(), a4.height());
                            byte[] array = allocate.array();
                            int jpegEncodingQualityParameter = CameraProfile.getJpegEncodingQualityParameter(2);
                            Bitmap createBitmap = Bitmap.createBitmap(BitmapFactory.decodeByteArray(array, 0, array.length), a4.left, a4.top, a4.width(), a4.height());
                            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            createBitmap.compress(CompressFormat.JPEG, jpegEncodingQualityParameter, byteArrayOutputStream);
                            byte[] toByteArray = byteArrayOutputStream.toByteArray();
                            byteBuffer = ByteBuffer.allocate(toByteArray.length);
                            byteBuffer.put(ByteBuffer.wrap(toByteArray));
                            byteBuffer.rewind();
                            allocate = byteBuffer;
                        } else {
                            ggt5 = ggt2;
                        }
                        this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
                        long j = this.f5403e;
                        jri.m13404b((Object) ggt2);
                        mo7122a(j, (ggt) jri.m13404b((Object) ggt5), C0252go.f5825aX);
                        i = ((ByteBuffer) jri.m13404b(allocate)).limit();
                        obj22 = a3;
                        ggt = ggt2;
                        ggt2 = ggt5;
                        obj3 = allocate;
                        c = null;
                        break;
                    }
                    this.f5406h.mo7076a(hci.m11977a(), true, "Failed to allocate jpeg buffer for encoding.");
                    return;
                } finally {
                    this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
                }
                break;
            default:
                this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
                throw new IllegalArgumentException("Unsupported input image format for TaskCompressImageToJpeg");
        }
        byte[] bArr = new byte[i];
        ((ByteBuffer) jri.m13404b(obj3)).get(bArr);
        obj3.rewind();
        if (c != null) {
            c.close();
        }
        mo13352a(this.f5403e, ggt2, bArr, C0252go.f5825aX);
        ExifInterface a7 = mo13350a(kbg.m4803b(obj22), ggt2, gfw.f5389d);
        ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7366a(a7);
        kow.m13878a(glx.m11389a(this.f5406h, bArr, ggt2.f5410c, ggt2.f5409b, ((iqm) jri.m13404b(ggt2.f5408a)).f7692e, a7), new ggl(this, ggt, ggt2), kpq.f8776a);
        kpk kpk = gfw.f5389d;
        if (kpk.isDone()) {
            try {
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7371a((iwp) kpk.get());
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
                return;
            } catch (InterruptedException e) {
                bli.m891b(f24352a, "CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
                return;
            } catch (ExecutionException e2) {
                bli.m898e(f24352a, "CaptureResults not added to photoCaptureDoneEvent event due to Execution Exception.");
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
                return;
            } catch (Throwable th) {
                Throwable th2 = th;
                ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
            }
        }
        bli.m898e(f24352a, "CaptureResults unavailable to photoCaptureDoneEvent event.");
        ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7378c();
    }
}
