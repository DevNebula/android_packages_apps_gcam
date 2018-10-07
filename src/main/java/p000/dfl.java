package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dfl */
final class dfl implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ int f3238a = R.string.photosphere_no_back_camera;
    /* renamed from: b */
    private final /* synthetic */ des f3239b;

    dfl(des des) {
        this.f3239b = des;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cfh a = this.f3239b.f25981p;
        int i2 = this.f3238a;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("Fatal error in Panorama module: ");
        stringBuilder.append(i2);
        a.mo12474a(stringBuilder.toString());
    }
}
