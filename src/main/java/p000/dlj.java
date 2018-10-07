package p000;

import android.graphics.SurfaceTexture;
import android.view.GestureDetector.OnGestureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dlj */
public final class dlj extends has {
    /* renamed from: b */
    private static final String f23981b = bli.m887a("VideoUI");
    /* renamed from: a */
    public ImageView f23982a;
    /* renamed from: c */
    private final cfh f23983c;
    /* renamed from: d */
    private final View f23984d;
    /* renamed from: e */
    private final OnGestureListener f23985e = new dlk();

    public dlj(cfh cfh, View view) {
        this.f23983c = cfh;
        this.f23984d = view;
        this.f23983c.mo12489t().inflate(R.layout.video_module, (ViewGroup) jri.m13404b((ViewGroup) this.f23984d.findViewById(R.id.root_module_layout)), true);
        ((ViewStub) this.f23984d.findViewById(R.id.camera_intent_layout_stub)).inflate();
        this.f23982a = (ImageView) jri.m13404b((ImageView) this.f23984d.findViewById(R.id.intent_review_imageview));
    }

    /* renamed from: a */
    public final OnGestureListener mo7610a() {
        return this.f23985e;
    }

    /* renamed from: k_ */
    public final OnTouchListener mo7612k_() {
        return null;
    }

    /* renamed from: l_ */
    public final void mo7613l_() {
    }

    /* renamed from: d */
    public final void mo7611d() {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bli.m888a(f23981b, "surfaceTexture is destroyed");
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
