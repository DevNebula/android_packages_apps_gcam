package p000;

import android.hardware.display.DisplayManager.DisplayListener;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: ebh */
final class ebh implements DisplayListener {
    /* renamed from: a */
    private final /* synthetic */ ebd f3708a;

    ebh(ebd ebd) {
        this.f3708a = ebd;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        iqm b;
        switch (this.f3708a.f17150M.getDefaultDisplay().getRotation()) {
            case 0:
                b = iqm.m4097b(0);
                break;
            case 1:
                b = iqm.m4097b(90);
                break;
            case 2:
                b = iqm.m4097b(MediaDecoder.ROTATE_180);
                break;
            case 3:
                b = iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
                break;
            default:
                b = iqm.CLOCKWISE_0;
                break;
        }
        int a = b.mo8806a();
        ebd ebd = this.f3708a;
        if (((a - ebd.f17184p) + 360) % 360 == MediaDecoder.ROTATE_180) {
            haq haq = ebd.f17191w;
            if (haq != null) {
                haq.mo7613l_();
                this.f3708a.f17141D.mo7609f();
            }
        }
        this.f3708a.f17184p = a;
    }

    public final void onDisplayRemoved(int i) {
    }
}
