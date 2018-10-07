package p000;

import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.FinalImageCallback;
import com.google.googlex.gcam.FloatSmoothKeyValueMap;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.image.YuvUtils;
import com.google.googlex.gcam.imageio.JpgHelper;

/* compiled from: PG */
/* renamed from: bzl */
final class bzl extends FinalImageCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f12051a;
    /* renamed from: b */
    private final /* synthetic */ bze f12052b;

    bzl(bze bze, bzx bzx) {
        this.f12052b = bze;
        this.f12051a = bzx;
    }

    public final void RgbReady(int i, InterleavedReadViewU8 interleavedReadViewU8, ExifMetadata exifMetadata, int i2) {
        boolean z;
        bli.m888a(bze.f1762a, String.format(null, "RGB image ready. shotId = %d, resolution = %d x %d", new Object[]{Integer.valueOf(i), Integer.valueOf(interleavedReadViewU8.width()), Integer.valueOf(interleavedReadViewU8.height())}));
        if (this.f12052b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (i2 == 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "RgbReady only supports GcamPixelFormat.kRgb.");
        jri.m13406b(this.f12051a.mo2241h().mo9709b(), (Object) "Got RGB image and no callback present");
        jri.m13405b(this.f12052b.f1775n.getImage().mo9709b());
        InterleavedReadViewU8 interleavedReadViewU82 = (InterleavedWriteViewU8) this.f12052b.f1775n.getImage().mo9706a();
        this.f12052b.mo2230a(new ExifMetadata(exifMetadata));
        cah cah = (cah) this.f12051a.mo2241h().mo9706a();
        jri.m13406b(cah.f1824a.isDone(), (Object) "Base frame metadata not available in YUV callback");
        jri.m13405b(cah.f1825b.isDone());
        jri.m13405b(cah.f1826c.isDone());
        jri.m13405b(cah.f1827d.isDone());
        ExifMetadata exifMetadata2 = (ExifMetadata) kow.m13881c(cah.f1827d);
        long longValue = ((Long) kow.m13881c(cah.f1826c)).longValue();
        iwp iwp = (iwp) kow.m13881c(cah.f1824a);
        int intValue = ((Integer) kow.m13881c(cah.f1825b)).intValue();
        if (cah.f1828e.f1710c && cah.f1834k.f12197i.mo9709b() && !cah.f1834k.f12192d.mo9709b()) {
            cah.f1829f.f4982b.mo13385n();
            ((gii) cah.f1834k.f12197i.mo9706a()).mo7140b();
            if (cah.f1828e.f1708a || cah.f1834k.f12190b.mo9709b()) {
                YuvReadView yuvImage = new YuvImage(interleavedReadViewU82.width(), interleavedReadViewU82.height(), 1);
                YuvUtils.rgbToYuv(interleavedReadViewU82, yuvImage);
                ccy.m8127a(cah.f1834k, cah.f1829f, cah.f1830g, cah.f1824a, new cak(yuvImage, longValue), exifMetadata2, cah.f1828e.f1708a, cah.f1831h);
            } else {
                kbg encodeToJpegAsByteArray = JpgHelper.encodeToJpegAsByteArray(interleavedReadViewU82, GcamModule.getKDefaultJpgQuality(), exifMetadata2);
                bzo bzo = cah.f1834k.f12189a;
                fwa fwa = cah.f1829f;
                bzo.mo2232a(fwa, cah.f1830g, fwa.f4981a.f4680g, interleavedReadViewU82.width(), interleavedReadViewU82.height(), (byte[]) encodeToJpegAsByteArray.mo9706a());
            }
        }
        if (cah.f1834k.f12192d.mo9709b()) {
            FloatSmoothKeyValueMap post_zoom_sharpen_strength = cah.f1832i.f1788a.getRaw_finish_params().getPost_zoom_sharpen_strength();
            int width = interleavedReadViewU82.width();
            int height = interleavedReadViewU82.height();
            int i3 = cah.f1831h;
            fvj fvj = cah.f1832i.f1789b;
            ccy ccy = cah.f1834k;
            iqp iqp = ccy.f12195g.f5062d;
            bxc bxc = cah.f1828e;
            GoudaRequest a = bya.m1068a(post_zoom_sharpen_strength, width, height, exifMetadata2, i3, fvj, iqp, bxc.f1708a, bxc.f1710c, ccy.f12191c);
            bzr c = ((bzv) cah.f1834k.f12192d.mo9706a()).mo12443c(cah.f1829f);
            kbg kbg = cah.f1834k.f12191c;
            kpk kpk = cah.f1833j;
            int i4 = cah.f1831h;
            bxc bxc2 = cah.f1828e;
            c.mo14576a(interleavedReadViewU82, a, exifMetadata2, kbg, intValue, iwp, longValue, kpk, i4, bxc2.f1708a, bxc2.f1710c, cah.f1829f.f4981a.f4680g);
            c.close();
        }
    }

    public final void YuvReady(int i, YuvReadView yuvReadView, ExifMetadata exifMetadata, int i2) {
        boolean z;
        if (this.f12052b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        jri.m13405b(this.f12052b.f1776o.getImage().mo9709b());
        jri.m13406b(this.f12051a.mo2243j().mo9709b(), (Object) "Received YUV frame but no listener present");
        YuvReadView yuvReadView2 = (YuvReadView) this.f12052b.f1776o.getImage().mo9706a();
        this.f12052b.mo2230a(new ExifMetadata(exifMetadata));
        cai cai = (cai) this.f12051a.mo2243j().mo9706a();
        jri.m13406b(cai.f1835a.isDone(), (Object) "YUV results received before EXIF metadata");
        jri.m13406b(cai.f1836b.isDone(), (Object) "Metadata not available; aborting");
        ExifMetadata exifMetadata2 = (ExifMetadata) kow.m13881c(cai.f1835a);
        ccy.m8127a(cai.f1842h, cai.f1838d, cai.f1839e, cai.f1836b, new cak(yuvReadView2, ((Long) kow.m13881c(cai.f1837c)).longValue()), exifMetadata2, cai.f1840f.f1708a, cai.f1841g);
    }
}
