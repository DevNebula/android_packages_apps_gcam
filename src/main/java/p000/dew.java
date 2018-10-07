package p000;

import android.hardware.display.DisplayManager.DisplayListener;
import android.os.Handler;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* compiled from: PG */
/* renamed from: dew */
final class dew implements DisplayListener {
    /* renamed from: a */
    private final /* synthetic */ des f3225a;

    dew(des des) {
        this.f3225a = des;
    }

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayChanged(int i) {
        iqm b;
        switch (this.f3225a.f25982q.mo2249a().getDefaultDisplay().getRotation()) {
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
        String str = des.f25916c;
        int i2 = this.f3225a.f25918B;
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("onDisplayChange (old:new): ");
        stringBuilder.append(i2);
        stringBuilder.append(":");
        stringBuilder.append(a);
        bli.m896d(str, stringBuilder.toString());
        des des = this.f3225a;
        if (((a - des.f25918B) + 360) % 360 == MediaDecoder.ROTATE_180) {
            Handler handler = des.f25925I;
            if (handler != null) {
                handler.sendEmptyMessage(3);
            }
        }
        this.f3225a.f25918B = a;
    }

    public final void onDisplayRemoved(int i) {
    }
}
