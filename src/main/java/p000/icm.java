package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

/* renamed from: icm */
public final class icm extends Handler {
    public icm() {
        this(Looper.getMainLooper());
    }

    public icm(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public final void mo8366a(huy huy, hux hux) {
        sendMessage(obtainMessage(1, new Pair(huy, hux)));
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                huy huy = (huy) pair.first;
                hux hux = (hux) pair.second;
                try {
                    huy.mo8155a(hux);
                    return;
                } catch (RuntimeException e) {
                    ick.m12297b(hux);
                    throw e;
                }
            case 2:
                ((ick) message.obj).mo13624c(Status.f23357c);
                return;
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(45);
                stringBuilder.append("Don't know how to handle message: ");
                stringBuilder.append(i);
                Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
                return;
        }
    }
}
