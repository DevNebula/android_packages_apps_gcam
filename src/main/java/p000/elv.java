package p000;

import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.p004ui.PhotoSphereMessageOverlay;

/* compiled from: PG */
/* renamed from: elv */
public final class elv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f4181a;
    /* renamed from: b */
    private final /* synthetic */ PhotoSphereMessageOverlay f4182b;

    public elv(PhotoSphereMessageOverlay photoSphereMessageOverlay, int i) {
        this.f4182b = photoSphereMessageOverlay;
        this.f4181a = i;
    }

    public final void run() {
        TextView textView = (TextView) this.f4182b.findViewById(R.id.short_info_message);
        textView.setText(this.f4181a);
        textView.setVisibility(0);
    }
}
