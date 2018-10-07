package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.location.Location;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Range;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ClientExifMetadata;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.ImageSaverParams;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotCallbacks;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.hdrplus.ImageConverter;
import com.google.googlex.gcam.hdrplus.MapImageProxyReleaseCallback;
import java.io.File;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: byn */
final class byn implements bym {
    /* renamed from: b */
    private static final String f11971b = bli.m887a("HdrPlusSession");
    /* renamed from: a */
    public final byy f11972a;
    /* renamed from: c */
    private final Gcam f11973c;
    /* renamed from: d */
    private final ilp f11974d;
    /* renamed from: e */
    private final kbg f11975e;
    /* renamed from: f */
    private final DisplayMetrics f11976f;
    /* renamed from: g */
    private final bya f11977g;
    /* renamed from: h */
    private final ffc f11978h;
    /* renamed from: i */
    private final fgw f11979i;
    /* renamed from: j */
    private final iqp f11980j = bxe.m1060a(this.f11978h).f7861b;
    /* renamed from: k */
    private final iqp f11981k;
    /* renamed from: l */
    private final ipz f11982l;
    /* renamed from: m */
    private final PostviewParams f11983m;
    /* renamed from: n */
    private final kwk f11984n;
    /* renamed from: o */
    private final hjw f11985o;
    /* renamed from: p */
    private final ikb f11986p;
    /* renamed from: q */
    private final fer f11987q;
    /* renamed from: r */
    private final caj f11988r;
    /* renamed from: s */
    private final kbg f11989s;
    /* renamed from: t */
    private String f11990t;
    /* renamed from: u */
    private final grk f11991u;
    /* renamed from: v */
    private final bku f11992v;
    /* renamed from: w */
    private final bmh f11993w;
    /* renamed from: x */
    private final bxj f11994x;

    byn(DisplayMetrics displayMetrics, byy byy, bya bya, ffc ffc, fbr fbr, fyy fyy, fgw fgw, Gcam gcam, kwk kwk, hjw hjw, ikb ikb, fer fer, caj caj, kbg kbg, kbg kbg2, bsn bsn, grk grk, bku bku, bmh bmh, bxj bxj) {
        this.f11976f = displayMetrics;
        this.f11972a = byy;
        this.f11977g = bya;
        this.f11978h = ffc;
        this.f11979i = fgw;
        this.f11973c = gcam;
        this.f11974d = fbr.f4692b;
        this.f11985o = hjw;
        this.f11986p = ikb;
        this.f11987q = fer;
        this.f11988r = caj;
        this.f11975e = kbg;
        this.f11989s = kbg2;
        this.f11991u = grk;
        this.f11992v = bku;
        this.f11993w = bmh;
        this.f11994x = bxj;
        this.f11981k = fyy.f5062d;
        this.f11982l = ipz.m4077b(this.f11981k);
        this.f11984n = kwk;
        this.f11990t = null;
        iqp iqp = this.f11980j;
        PostviewParams postviewParams = new PostviewParams();
        postviewParams.setPixel_format(5);
        iqp a = bxe.m1059a(iqp, ((ipz) jri.m13404b(this.f11982l)).mo8752b());
        int i = a.f7695a;
        if (i > a.f7696b) {
            postviewParams.setTarget_width(i);
            postviewParams.setTarget_height(0);
        } else {
            postviewParams.setTarget_width(0);
            postviewParams.setTarget_height(a.f7696b);
        }
        this.f11983m = postviewParams;
    }

    /* renamed from: a */
    public final boolean mo2223a(int i) {
        return this.f11973c.AbortShot(i);
    }

    /* renamed from: a */
    public final void mo2220a(byx byx, int i, iwp iwp, iwz iwz) {
        m7982b();
        FrameMetadata a = this.f11977g.mo2209a(iwp, null, null);
        if (m7983c()) {
            bxo.m7943a((String) jri.m13404b(this.f11990t), 1, i, iwp);
        }
        SpatialGainMap a2 = this.f11977g.mo2210a(iwp);
        Pair a3 = m7979a(iwz);
        this.f11973c.AddMeteringFrame(byx.f1746a, a, ((Long) a3.first).longValue(), (RawWriteView) a3.second, a2);
    }

    /* renamed from: a */
    public final void mo2221a(byx byx, int i, iwp iwp, iwz iwz, iwz iwz2, Face[] faceArr) {
        GyroSampleVector a;
        Pair create;
        long longValue = ((Long) jri.m13404b((Long) iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP))).longValue();
        long longValue2 = ((Long) jri.m13404b((Long) iwp.mo13730a(CaptureResult.SENSOR_EXPOSURE_TIME))).longValue();
        ive a2 = bxe.m1060a(this.f11978h);
        long a3 = this.f11978h.mo9055a(a2.f7860a, a2.f7861b) + (longValue2 + longValue);
        if (this.f11989s.mo9709b()) {
            Object bxf = new bxf();
            ((bwp) this.f11989s.mo9706a()).mo12435a(longValue - 5000000, a3 + 5000000, bxf);
            a = bxf.mo12440a();
        } else {
            a = null;
        }
        FrameMetadata a4 = this.f11977g.mo2209a(iwp, faceArr, a);
        if (m7983c()) {
            bxo.m7943a((String) jri.m13404b(this.f11990t), 2, i, iwp);
        }
        bze bze = byx.f1747b;
        if (iwz != null) {
            longValue2 = iwz.mo13744f();
        } else {
            longValue2 = -1;
        }
        bze.f1765d.add(Long.valueOf(longValue2));
        bze.f1764c.add(iwp);
        SpatialGainMap a5 = this.f11977g.mo2210a(iwp);
        Pair a6 = m7979a(iwz);
        if (iwz2 == null) {
            create = Pair.create(Long.valueOf(MapImageProxyReleaseCallback.INVALID_IMAGE_ID), new InterleavedWriteViewU16());
        } else {
            boolean isCompatiblePdFormat = ImageConverter.isCompatiblePdFormat(iwz2.mo13741c());
            int c = iwz2.mo13741c();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Incompatible PD data format: ");
            stringBuilder.append(c);
            jri.m13406b(isCompatiblePdFormat, stringBuilder.toString());
            kbg wrapPdWriteView = ImageConverter.wrapPdWriteView(iwz2);
            if (wrapPdWriteView.mo9709b()) {
                create = Pair.create(Long.valueOf(this.f11972a.mo2228a(iwz2)), (InterleavedWriteViewU16) wrapPdWriteView.mo9706a());
            } else {
                create = Pair.create(Long.valueOf(MapImageProxyReleaseCallback.INVALID_IMAGE_ID), new InterleavedWriteViewU16());
            }
        }
        if (!this.f11973c.AddPayloadFrame(byx.f1746a, a4, ((Long) a6.first).longValue(), (RawWriteView) a6.second, ((Long) create.first).longValue(), (InterleavedWriteViewU16) create.second, a5)) {
            bli.m891b(f11971b, String.format(null, "addPayloadFrame for shot %d failed, closing input images at frame index %d.", new Object[]{Integer.valueOf(byx.f1746a), Integer.valueOf(i)}));
            if (iwz != null) {
                iwz.close();
            }
            if (iwz2 != null) {
                iwz2.close();
            }
        }
    }

    /* renamed from: a */
    public final BurstSpec mo2217a(byx byx) {
        BurstSpec GetMeteringBurstSpec = this.f11973c.GetMeteringBurstSpec(byx.f1746a);
        if (GetMeteringBurstSpec.getFrame_requests().size() == 0) {
            bli.m891b(f11971b, "Gcam::GetMeteringBurstSpec failed.");
            throw new isr("libgcam::GetMeteringBurstSpec() failed.");
        }
        this.f11973c.BeginMeteringFrames(byx.f1746a, GetMeteringBurstSpec);
        return GetMeteringBurstSpec;
    }

    /* renamed from: a */
    public final void mo2222a(byx byx, BurstSpec burstSpec) {
        this.f11973c.BeginPayloadFrames(byx.f1746a, burstSpec);
    }

    /* renamed from: a */
    public final BurstSpec mo2218a(byx byx, AeResults aeResults) {
        return this.f11973c.BuildPayloadBurstSpec(byx.f1746a, aeResults);
    }

    /* renamed from: b */
    private final void m7982b() {
        if (this.f11986p.mo13666a()) {
            throw new isr("Camera already closed");
        }
    }

    /* renamed from: a */
    public final AeResults mo2216a(byx byx, iwp iwp, iwz iwz) {
        Object obj;
        bzc obj2;
        m7982b();
        iqp iqp = this.f11981k;
        jri.m13404b((Object) iwz);
        jri.m13405b(ImageConverter.isCompatibleRawFormat(iwz.mo13741c()));
        bzc bzc = new bzc();
        bzc.f1758a = ImageConverter.wrapRawWriteView(iwz);
        bzc.f1759b = this.f11977g.mo2209a(iwp, null, null);
        bzc.f1760c = this.f11977g.mo2210a(iwp);
        bzc.f1761d = m7981a(this.f11977g.mo2208a(((Integer) jri.m13404b((Integer) iwp.mo13730a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION))).intValue()));
        Rect rect = (Rect) jri.m13404b((Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION));
        if (rect.isEmpty()) {
            String str = f11971b;
            String valueOf = String.valueOf(rect);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
            stringBuilder.append("Invalid scaler crop region: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            obj2 = null;
        } else {
            this.f11977g.mo2211a(bzc.f1761d, rect, (MeteringRectangle[]) iwp.mo13730a(CaptureResult.CONTROL_AE_REGIONS), iqp);
            obj2 = bzc;
        }
        obj2 = (bzc) jri.m13404b(obj2);
        return this.f11973c.ComputeAeResults(byx.f1746a, obj2.f1759b, obj2.f1758a, obj2.f1760c);
    }

    /* renamed from: a */
    private final AeShotParams m7981a(float f) {
        AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.setExposure_compensation(f);
        aeShotParams.setTarget_width(this.f11981k.f7695a);
        aeShotParams.setTarget_height(this.f11981k.f7696b);
        return aeShotParams;
    }

    /* renamed from: c */
    private final boolean m7983c() {
        fgw fgw = this.f11979i;
        boolean z = !fgw.mo6783a("persist.gcam.save_hal3_metadata", false) ? fgw.mo6783a("persist.gcam.debug", false) : true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final BurstSpec mo2224b(byx byx) {
        bli.m888a(f11971b, "endMeteringFrames");
        BurstSpec burstSpec = (BurstSpec) jri.m13404b(this.f11973c.EndMeteringFrames(byx.f1746a));
        if (((FrameRequestVector) jri.m13404b(burstSpec.getFrame_requests())).size() == 0) {
            bli.m891b(f11971b, "Gcam did not generate a valid payload burst spec.");
        }
        return burstSpec;
    }

    /* renamed from: c */
    public final boolean mo2227c(byx byx) {
        ClientExifMetadata clientExifMetadata;
        Location d = this.f11985o.mo7915d();
        if (d != null) {
            LocationData locationData = new LocationData();
            locationData.setAltitude(d.getAltitude());
            locationData.setDegree_of_precision((double) d.getAccuracy());
            locationData.setLatitude(d.getLatitude());
            locationData.setLongitude(d.getLongitude());
            locationData.setTimestamp_unix(d.getTime() / 1000);
            locationData.setProcessing_method(d.getProvider());
            clientExifMetadata = new ClientExifMetadata();
            clientExifMetadata.setLocation(locationData);
        } else {
            clientExifMetadata = null;
        }
        boolean EndPayloadFrames = this.f11973c.EndPayloadFrames(byx.f1746a, clientExifMetadata, null, null);
        if (EndPayloadFrames) {
            bze bze = byx.f1747b;
            bze.f1763b.f4984d.mo13292a(hci.m11979a((int) R.string.processing_hdr_plus, new Object[0]));
            bze.f1763b.f4984d.mo13288a(0.0f);
        } else {
            bli.m891b(f11971b, "EndPayloadFrames() failed.");
        }
        return EndPayloadFrames;
    }

    /* renamed from: b */
    public final boolean mo2225b(int i) {
        return this.f11973c.EndShotCapture(i);
    }

    /* renamed from: c */
    public final int mo2226c(int i) {
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i2 < this.f11973c.GetNumCameras()) {
            if (this.f11973c.GetStaticMetadata(i2).getSensor_id() == i) {
                i4++;
                i3 = i2;
            }
            i2++;
        }
        return i4 == 1 ? i3 : -1;
    }

    /* renamed from: a */
    public final InitParams mo2219a() {
        return this.f11973c.GetInitParams();
    }

    /* renamed from: a */
    public final byx mo2214a(int i, bzx bzx, fwa fwa, fxi fxi, AeResults aeResults, iwp iwp) {
        return m7980a(i, bzx, fwa, fxi, aeResults, iwp, false);
    }

    /* renamed from: a */
    private final byx m7980a(int i, bzx bzx, fwa fwa, fxi fxi, AeResults aeResults, iwp iwp, boolean z) {
        int i2;
        String str;
        m7982b();
        bli.m888a(f11971b, "startShotCapture()");
        jri.m13404b((Object) bzx);
        float a = this.f11977g.mo2208a(((Integer) this.f11974d.mo13673b()).intValue());
        int a2 = axm.m759a(fwa.f4981a.f4674a, this.f11978h);
        boolean b = bzx.mo2235b().mo9709b();
        int max_full_metering_sweep_frames = this.f11973c.GetInitParams().getMax_full_metering_sweep_frames();
        ShotParams shotParams = new ShotParams();
        shotParams.setFull_metering_sweep_frame_count(max_full_metering_sweep_frames);
        shotParams.setImage_rotation(bxe.m1055a(a2));
        shotParams.setManually_rotate_final_jpg(true);
        shotParams.setSave_merged_dng(b);
        shotParams.setCompress_merged_dng(true);
        shotParams.setAe(m7981a(a));
        if (this.f11975e.mo9709b()) {
            shotParams.setResampling_method_override(0);
        }
        shotParams.setFlash_mode(bya.m1067a(fxi));
        shotParams.setAllow_temporal_binning(this.f11979i.mo6783a("persist.gcam.temporal_binning", false));
        shotParams.setRecompute_wb_on_base_frame(false);
        if (this.f11987q.mo13673b() == feq.AUTO) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        shotParams.setWb_mode(i2);
        if (z) {
            str = "z";
        } else {
            str = "n";
        }
        shotParams.setSoftware_suffix(str);
        shotParams.setZsl(z);
        if (z) {
            jri.m13396a(true, (Object) "Incorrect base frame hint.");
            shotParams.setZsl_base_frame_index_hint(-1);
        } else {
            AwbInfo b2 = this.f11977g.mo2213b(iwp);
            shotParams.setForce_wb(b2);
            shotParams.setPrevious_viewfinder_wb(b2);
        }
        bya bya = this.f11977g;
        if (iwp == null) {
            throw new IllegalArgumentException("source should not be null");
        }
        Object obj;
        ImageSaverParams imageSaverParams;
        int i3;
        boolean z2;
        long longValue = ((Long) jri.m13404b((Long) iwp.mo13730a(CaptureResult.SENSOR_EXPOSURE_TIME))).longValue();
        float f = ((float) longValue) / 1000000.0f;
        iwp iwp2 = iwp;
        a = (((float) ((Integer) jri.m13404b((Integer) iwp2.mo13730a(CaptureResult.SENSOR_SENSITIVITY))).intValue()) / ((float) ((Integer) ((Range) jri.m13404b((Range) bya.f1743a.mo9056a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE))).getLower()).intValue())) * f;
        shotParams.setPrevious_viewfinder_tet(a);
        String str2 = f11971b;
        StringBuilder stringBuilder = new StringBuilder(70);
        stringBuilder.append("takePicture - Using captured WB from viewfinder, TET = ");
        stringBuilder.append(a);
        bli.m896d(str2, stringBuilder.toString());
        if (aeResults == null) {
            this.f11977g.mo2211a(shotParams.getAe(), (Rect) jri.m13404b((Rect) iwp.mo13730a(CaptureResult.SCALER_CROP_REGION)), (MeteringRectangle[]) iwp.mo13730a(CaptureResult.CONTROL_AE_REGIONS), this.f11981k);
        }
        bze bze = new bze(bzx, this.f11976f, fwa, this.f11972a.f1749b.getExecute_finish_on(), this.f11991u, this.f11992v, this.f11993w);
        ShotCallbacks shotCallbacks = new ShotCallbacks();
        if (bze.f1778q.mo2240g().mo9709b()) {
            shotCallbacks.setProgress_callback(bze.f1766e);
        }
        shotCallbacks.setStatus_callback(bze.f1767f);
        if (bze.f1778q.mo2234a().mo9709b()) {
            shotCallbacks.setBase_frame_callback(bze.f1768g);
        }
        if (bze.f1778q.mo2239f().mo9709b()) {
            shotCallbacks.setPostview_rgb_allocator(bze.f1774m);
            shotCallbacks.setPostview_callback(bze.f1769h);
        }
        if (bze.f1778q.mo2235b().mo9709b()) {
            shotCallbacks.setMerged_dng_callback(bze.f1771j);
        }
        if (bze.f1778q.mo2238e().mo9709b()) {
            shotCallbacks.setMerged_pd_allocator(bze.f1777p);
            shotCallbacks.setMerged_pd_callback(bze.f1770i);
        }
        if (bze.f1778q.mo2241h().mo9709b()) {
            shotCallbacks.setFinal_image_rgb_allocator(bze.f1775n);
            shotCallbacks.setFinal_image_callback(bze.f1772k);
        }
        if (bze.f1778q.mo2243j().mo9709b()) {
            shotCallbacks.setFinal_image_yuv_allocator(bze.f1776o);
            shotCallbacks.setFinal_image_callback(bze.f1772k);
        }
        if (bze.f1778q.mo2237d().mo9709b()) {
            shotCallbacks.setJpeg_callback(bze.f1773l);
        }
        kbg kbg = (kbg) this.f11984n.mo10566a();
        if (this.f11979i.mo6781a()) {
            obj = 1;
        } else if (this.f11979i.mo6784b()) {
            obj = 1;
        } else if (this.f11979i.mo6785c()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            imageSaverParams = null;
        } else if (kbg.mo9709b()) {
            imageSaverParams = new ImageSaverParams();
            this.f11990t = bxe.m1062a((File) kbg.mo9706a(), "gcam", fwa.f4982b.mo13383l());
            imageSaverParams.setDest_folder(this.f11990t);
        } else {
            imageSaverParams = null;
        }
        if (bzx.mo2241h().mo9709b()) {
            i3 = 3;
        } else if (bzx.mo2243j().mo9709b()) {
            i3 = 1;
        } else if (bzx.mo2237d().mo9709b()) {
            i3 = 0;
        } else {
            throw new RuntimeException("No primary output can be inferred.");
        }
        int StartShotCapture = this.f11973c.StartShotCapture(i, shotParams, shotCallbacks, i3, this.f11983m, imageSaverParams);
        if (StartShotCapture != GcamModule.getKInvalidShotId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13396a(z2, (Object) "Gcam::StartShotCapture() returned an invalid shot id.");
        fwa.f4981a.f4680g.mo8557a(this.f11994x.mo2203a(StartShotCapture));
        for (iwp a3 : this.f11988r.mo12444a()) {
            this.f11973c.AddFrameMetadataForLogging(StartShotCapture, this.f11977g.mo2209a(a3, null, null));
        }
        byx byx = new byx(StartShotCapture, bze);
        this.f11972a.f1750c.put(Integer.valueOf(StartShotCapture), byx);
        bze.f1779r = new byo(this, StartShotCapture);
        return byx;
    }

    /* renamed from: a */
    public final byx mo2215a(int i, bzx bzx, fwa fwa, fxi fxi, iwp iwp) {
        return m7980a(i, bzx, fwa, fxi, null, iwp, true);
    }

    /* renamed from: a */
    private final Pair m7979a(iwz iwz) {
        if (iwz == null) {
            return Pair.create(Long.valueOf(MapImageProxyReleaseCallback.INVALID_IMAGE_ID), new RawWriteView());
        }
        boolean isCompatibleRawFormat = ImageConverter.isCompatibleRawFormat(iwz.mo13741c());
        int c = iwz.mo13741c();
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("Incompatible Raw image format: ");
        stringBuilder.append(c);
        jri.m13406b(isCompatibleRawFormat, stringBuilder.toString());
        return Pair.create(Long.valueOf(this.f11972a.mo2228a(iwz)), ImageConverter.wrapRawWriteView(iwz));
    }
}
