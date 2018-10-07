package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: idp */
final class idp extends Handler {
    /* renamed from: a */
    private final /* synthetic */ idn f7307a;

    idp(idn idn, Looper looper) {
        this.f7307a = idn;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                idn.m12414b(this.f7307a);
                return;
            case 2:
                idn.m12412a(this.f7307a);
                return;
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i);
                Log.w("GoogleApiClientImpl", stringBuilder.toString());
                return;
        }
    }
}
