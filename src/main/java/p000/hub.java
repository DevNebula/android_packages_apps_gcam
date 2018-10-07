package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
/* renamed from: hub */
final class hub extends Handler {
    /* renamed from: a */
    private final Context f7031a;
    /* renamed from: b */
    private final /* synthetic */ hua f7032b;

    public hub(hua hua, Context context) {
        this.f7032b = hua;
        super(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f7031a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int a;
        switch (message.what) {
            case 1:
                a = huc.m3510a(this.f7031a);
                if (huc.m3517b(a)) {
                    hua hua = this.f7032b;
                    Context context = this.f7031a;
                    hua.mo13570a(context, a, huc.m3511a(context, a, 0, "n"));
                    return;
                }
                return;
            default:
                a = message.what;
                StringBuilder stringBuilder = new StringBuilder(50);
                stringBuilder.append("Don't know how to handle this message: ");
                stringBuilder.append(a);
                Log.w("GoogleApiAvailability", stringBuilder.toString());
                return;
        }
    }
}
