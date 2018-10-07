package p000;

import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.p004ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: elz */
public final class elz implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f4187a;
    /* renamed from: b */
    private final /* synthetic */ PhotoSphereMessageOverlay f4188b;

    public elz(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z) {
        this.f4188b = photoSphereMessageOverlay;
        this.f4187a = z;
    }

    public final void run() {
        PhotoSphereMessageOverlay photoSphereMessageOverlay = this.f4188b;
        boolean z = photoSphereMessageOverlay.f2571f;
        boolean z2 = this.f4187a;
        if (z != z2) {
            int i;
            photoSphereMessageOverlay.f2571f = z2;
            ImageView imageView = (ImageView) photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon);
            if (this.f4187a) {
                i = R.drawable.ic_pano_rotate_error_cw;
            } else {
                i = R.drawable.ic_pano_rotate_error_ccw;
            }
            imageView.setImageResource(i);
        }
        photoSphereMessageOverlay = this.f4188b;
        if (!photoSphereMessageOverlay.f2570e) {
            photoSphereMessageOverlay.f2570e = true;
            photoSphereMessageOverlay.findViewById(R.id.rotate_device_icon).setVisibility(0);
        }
    }
}
