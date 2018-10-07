package p000;

import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.RefocusProgressView;
import com.google.android.apps.refocus.image.ColorImage;
import com.google.android.apps.refocus.image.ColorImage.Format;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.apps.refocus.processing.ProcessingNative;

/* compiled from: PG */
/* renamed from: dwl */
final class dwl implements aaf {
    /* renamed from: a */
    public final /* synthetic */ dwd f16895a;

    dwl(dwd dwd) {
        this.f16895a = dwd;
    }

    /* renamed from: a */
    public final void mo6a(byte[] bArr) {
        int i = 0;
        dwd dwd = this.f16895a;
        dxj dxj = dwd.f26224m;
        if (dxj == null || dxj.f16934b == null) {
            bli.m898e(dwd.f26171d, "onPictureTaken called after camera released");
            return;
        }
        abo abo = dxj.f16938f;
        dwd.f26233v = new ColorImage(abo.mo72b().f178a.x, abo.mo72b().f178a.y, Format.fromImageFormat(abo.f147m), bArr);
        this.f16895a.f26173B.submit(new dwm(this));
        dwd = this.f16895a;
        dwd.f26223l.removeCallbacks(dwd.f26176E);
        dwd.f26223l.removeCallbacks(dwd.f26177F);
        RefocusProgressView refocusProgressView = dwd.f26225n;
        refocusProgressView.f2645a = false;
        refocusProgressView.mo2763a(0.0f);
        dwd.f26225n.setVisibility(0);
        dwd.f26226o.setVisibility(8);
        dwd.f26227p.setText(R.string.refocus_instructions);
        dwd.f26227p.setVisibility(0);
        dwd.f26231t.mo8061b();
        dwd.f26228q = new hrj();
        dxo dxo = dwd.f26232u;
        int i2 = dwd.f26224m.f16938f.mo74c().f178a.x;
        int i3 = dwd.f26224m.f16938f.mo74c().f178a.y;
        dxo.f3570e = (float) Math.max(i2, i3);
        ProcessingNative.StartTracker(dxo.f3571f, (int) Math.max((double) Math.round(Math.log((double) (Math.max(i2, i3) / DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX)) / Math.log(2.0d)), 0.0d));
        hrv.m3370a(hrv.f6892a, dxo.f3566a);
        float[] fArr = dxo.f3568c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        while (i < 64) {
            fArr = dxo.f3567b;
            fArr[i] = (float) (i2 / 2);
            fArr[i + 1] = (float) (i3 / 2);
            i += 2;
        }
        dxo.f3572g.reset();
        dwd.f26237z = new dxn(dwd.f26232u, dwd.f26236y, dwd.f26228q, dwd.f26231t);
        dwd.f26236y.mo8076b();
        dwd.f26234w = C0252go.f5832ae;
        dwd.f26218g.mo13401D();
        this.f16895a.f26229r.mo13482d();
    }
}
