package p000;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* renamed from: hfj */
final class hfj extends Handler {
    /* renamed from: a */
    private final /* synthetic */ hfh f6513a;

    hfj(hfh hfh) {
        this.f6513a = hfh;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            hfh hfh = this.f6513a;
            hfh.mo13531a(false, hfh.f20004a - 1);
        }
    }
}
