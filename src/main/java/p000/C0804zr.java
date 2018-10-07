package p000;

import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;

/* compiled from: PG */
/* renamed from: zr */
public final class C0804zr extends abo {
    /* renamed from: a */
    private static final aby f22472a = new aby("AndCamSet");

    private C0804zr(C0804zr c0804zr) {
        super(c0804zr);
    }

    public C0804zr(aaz aaz, Parameters parameters) {
        if (parameters == null) {
            abx.m91e(f22472a, "Settings ctor requires a non-null Camera.Parameters.");
            return;
        }
        abe abe = aaz.f69w;
        this.f140f = false;
        Size previewSize = parameters.getPreviewSize();
        mo73b(new abw(previewSize.width, previewSize.height));
        int previewFrameRate = parameters.getPreviewFrameRate();
        if (previewFrameRate > 0) {
            this.f143i = previewFrameRate;
            this.f142h = previewFrameRate;
            this.f141g = previewFrameRate;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        mo70a(iArr[0], iArr[1]);
        this.f145k = parameters.getPreviewFormat();
        if (aaz.mo46a(aba.ZOOM)) {
            mo68a(((float) ((Integer) parameters.getZoomRatios().get(parameters.getZoom())).intValue()) / 100.0f);
        } else {
            mo68a(1.0f);
        }
        this.f149o = parameters.getExposureCompensation();
        this.f150p = abe.m46a(parameters.getFlashMode());
        this.f151q = abe.m47b(parameters.getFocusMode());
        this.f152r = abe.m48c(parameters.getSceneMode());
        aaz.mo46a(aba.VIDEO_STABILIZATION);
        this.f157w = "true".equals(parameters.get("recording-hint"));
        mo69a(parameters.getJpegQuality());
        previewSize = parameters.getPictureSize();
        mo71a(new abw(previewSize.width, previewSize.height));
        this.f147m = parameters.getPictureFormat();
    }

    /* renamed from: a */
    public final abo mo67a() {
        return new C0804zr(this);
    }
}
