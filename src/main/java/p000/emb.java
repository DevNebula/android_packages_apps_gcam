package p000;

import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.p004ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: emb */
public final class emb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ boolean f4190a;
    /* renamed from: b */
    private final /* synthetic */ int f4191b;
    /* renamed from: c */
    private final /* synthetic */ PhotoSphereMessageOverlay f4192c;

    public emb(PhotoSphereMessageOverlay photoSphereMessageOverlay, boolean z, int i) {
        this.f4192c = photoSphereMessageOverlay;
        this.f4190a = z;
        this.f4191b = i;
    }

    public final void run() {
        TextView textView = (TextView) this.f4192c.findViewById(R.id.long_message_overlay);
        if (this.f4190a) {
            textView.setVisibility(0);
            switch (this.f4191b) {
                case 0:
                    textView.setText(R.string.photosphere_calibration_step_one);
                    return;
                case 1:
                    textView.setText(R.string.photosphere_calibration_step_two);
                    return;
                case 2:
                    textView.setText(R.string.photosphere_calibration_step_three);
                    return;
                case 3:
                    textView.setText(R.string.photosphere_calibration_finished);
                    return;
                default:
                    return;
            }
        }
        textView.setVisibility(4);
    }
}
