package p000;

import android.app.AlertDialog.Builder;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dfb */
final class dfb implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ des f3230a;

    dfb(des des) {
        this.f3230a = des;
    }

    public final void run() {
        Builder builder = new Builder(this.f3230a.f25981p.mo12475b(), 16974546);
        builder.setPositiveButton(R.string.dialog_ok, new dfc(this));
        builder.setNegativeButton(R.string.dialog_cancel, new dfd());
        if (this.f3230a.f25957ao.mo13673b() == hhx.PHOTO_SPHERE) {
            builder.setMessage(R.string.cancel_photo_sphere);
        } else {
            builder.setMessage(R.string.cancel_panorama);
        }
        builder.setCancelable(true);
        this.f3230a.f25927K = builder.create();
        this.f3230a.f25927K.show();
    }
}
