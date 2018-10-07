package p000;

import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: zo */
final class C0803zo extends aaz {
    /* renamed from: x */
    private C0617zp f22470x = new C0617zp();
    /* renamed from: y */
    private C0618zq f22471y = new C0618zq();

    static {
        aby aby = new aby("AndCamCapabs");
    }

    C0803zo(Parameters parameters) {
        super(new abe());
        this.f61o = parameters.getMaxExposureCompensation();
        this.f60n = parameters.getMinExposureCompensation();
        this.f62p = parameters.getExposureCompensationStep();
        this.f63q = parameters.getMaxNumDetectedFaces();
        this.f65s = parameters.getMaxNumMeteringAreas();
        this.f59m = new abw(parameters.getPreferredPreviewSizeForVideo());
        this.f50d.addAll(parameters.getSupportedPreviewFormats());
        this.f53g.addAll(parameters.getSupportedPictureFormats());
        this.f67u = parameters.getHorizontalViewAngle();
        this.f68v = parameters.getVerticalViewAngle();
        Collection supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            this.f48b.addAll(supportedPreviewFpsRange);
        }
        Collections.sort(this.f48b, this.f22470x);
        List<Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            for (Size size : supportedPreviewSizes) {
                this.f49c.add(new abw(size.width, size.height));
            }
        }
        Collections.sort(this.f49c, this.f22471y);
        supportedPreviewSizes = parameters.getSupportedVideoSizes();
        if (supportedPreviewSizes != null) {
            for (Size size2 : supportedPreviewSizes) {
                this.f51e.add(new abw(size2.width, size2.height));
            }
        }
        Collections.sort(this.f51e, this.f22471y);
        supportedPreviewSizes = parameters.getSupportedPictureSizes();
        if (supportedPreviewSizes != null) {
            for (Size size22 : supportedPreviewSizes) {
                this.f52f.add(new abw(size22.width, size22.height));
            }
        }
        Collections.sort(this.f52f, this.f22471y);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String str : supportedSceneModes) {
                if ("auto".equals(str)) {
                    this.f54h.add(abd.AUTO);
                } else if ("action".equals(str)) {
                    this.f54h.add(abd.ACTION);
                } else if ("barcode".equals(str)) {
                    this.f54h.add(abd.BARCODE);
                } else if ("beach".equals(str)) {
                    this.f54h.add(abd.BEACH);
                } else if ("candlelight".equals(str)) {
                    this.f54h.add(abd.CANDLELIGHT);
                } else if ("fireworks".equals(str)) {
                    this.f54h.add(abd.FIREWORKS);
                } else if ("hdr".equals(str)) {
                    this.f54h.add(abd.HDR);
                } else if ("landscape".equals(str)) {
                    this.f54h.add(abd.LANDSCAPE);
                } else if ("night".equals(str)) {
                    this.f54h.add(abd.NIGHT);
                } else if ("night-portrait".equals(str)) {
                    this.f54h.add(abd.NIGHT_PORTRAIT);
                } else if ("party".equals(str)) {
                    this.f54h.add(abd.PARTY);
                } else if ("portrait".equals(str)) {
                    this.f54h.add(abd.PORTRAIT);
                } else if ("snow".equals(str)) {
                    this.f54h.add(abd.SNOW);
                } else if ("sports".equals(str)) {
                    this.f54h.add(abd.SPORTS);
                } else if ("steadyphoto".equals(str)) {
                    this.f54h.add(abd.STEADYPHOTO);
                } else if ("sunset".equals(str)) {
                    this.f54h.add(abd.SUNSET);
                } else if ("theatre".equals(str)) {
                    this.f54h.add(abd.THEATRE);
                }
            }
        }
        supportedSceneModes = parameters.getSupportedFlashModes();
        if (supportedSceneModes == null) {
            this.f55i.add(abb.NO_FLASH);
        } else {
            for (String str2 : supportedSceneModes) {
                if ("auto".equals(str2)) {
                    this.f55i.add(abb.AUTO);
                } else if ("off".equals(str2)) {
                    this.f55i.add(abb.OFF);
                } else if ("on".equals(str2)) {
                    this.f55i.add(abb.ON);
                } else if ("red-eye".equals(str2)) {
                    this.f55i.add(abb.RED_EYE);
                } else if ("torch".equals(str2)) {
                    this.f55i.add(abb.TORCH);
                }
            }
        }
        supportedSceneModes = parameters.getSupportedFocusModes();
        if (supportedSceneModes != null) {
            for (String str22 : supportedSceneModes) {
                if ("auto".equals(str22)) {
                    this.f56j.add(abc.AUTO);
                } else if ("continuous-picture".equals(str22)) {
                    this.f56j.add(abc.CONTINUOUS_PICTURE);
                } else if ("continuous-video".equals(str22)) {
                    this.f56j.add(abc.CONTINUOUS_VIDEO);
                } else if ("edof".equals(str22)) {
                    this.f56j.add(abc.EXTENDED_DOF);
                } else if ("fixed".equals(str22)) {
                    this.f56j.add(abc.FIXED);
                } else if ("infinity".equals(str22)) {
                    this.f56j.add(abc.INFINITY);
                } else if ("macro".equals(str22)) {
                    this.f56j.add(abc.MACRO);
                }
            }
        }
        supportedSceneModes = parameters.getSupportedFocusModes();
        if (supportedSceneModes != null) {
            for (String str222 : supportedSceneModes) {
                if ("auto".equals(str222)) {
                    this.f57k.add(abf.AUTO);
                } else if ("cloudy-daylight".equals(str222)) {
                    this.f57k.add(abf.CLOUDY_DAYLIGHT);
                } else if ("daylight".equals(str222)) {
                    this.f57k.add(abf.DAYLIGHT);
                } else if ("fluorescent".equals(str222)) {
                    this.f57k.add(abf.FLUORESCENT);
                } else if ("incandescent".equals(str222)) {
                    this.f57k.add(abf.INCANDESCENT);
                } else if ("shade".equals(str222)) {
                    this.f57k.add(abf.SHADE);
                } else if ("twilight".equals(str222)) {
                    this.f57k.add(abf.TWILIGHT);
                } else if ("warm-fluorescent".equals(str222)) {
                    this.f57k.add(abf.WARM_FLUORESCENT);
                }
            }
        }
        if (parameters.isZoomSupported()) {
            this.f66t = ((float) ((Integer) parameters.getZoomRatios().get(parameters.getMaxZoom())).intValue()) / 100.0f;
            this.f58l.add(aba.ZOOM);
        }
        if (parameters.isVideoSnapshotSupported()) {
            this.f58l.add(aba.VIDEO_SNAPSHOT);
        }
        if (parameters.isAutoExposureLockSupported()) {
            this.f58l.add(aba.AUTO_EXPOSURE_LOCK);
        }
        if (parameters.isAutoWhiteBalanceLockSupported()) {
            this.f58l.add(aba.AUTO_WHITE_BALANCE_LOCK);
        }
        if (mo48a(abc.AUTO)) {
            this.f64r = parameters.getMaxNumFocusAreas();
            if (this.f64r > 0) {
                this.f58l.add(aba.FOCUS_AREA);
            }
        }
        if (this.f65s > 0) {
            this.f58l.add(aba.METERING_AREA);
        }
    }

    C0803zo(C0803zo c0803zo) {
        super((aaz) c0803zo);
    }
}
