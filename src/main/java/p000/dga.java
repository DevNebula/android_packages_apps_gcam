package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* renamed from: dga */
final class dga extends Handler {
    /* renamed from: a */
    private final /* synthetic */ des f3247a;

    public dga(des des, Looper looper) {
        this.f3247a = des;
        super(looper);
    }

    public final void handleMessage(Message message) {
        eki eki;
        switch (message.what) {
            case 1:
                eki = this.f3247a.f25985t;
                if (eki != null) {
                    eki.onSurfaceCreated(null, null);
                    return;
                }
                return;
            case 2:
                String str = des.f25916c;
                int i = message.arg1;
                int i2 = message.arg2;
                StringBuilder stringBuilder = new StringBuilder(44);
                stringBuilder.append("MSG_RESIZE_RENDERER: ");
                stringBuilder.append(i);
                stringBuilder.append("x");
                stringBuilder.append(i2);
                bli.m896d(str, stringBuilder.toString());
                des des = this.f3247a;
                eki eki2 = des.f25985t;
                if (eki2 != null && des.f25987v != null) {
                    eki2.onSurfaceChanged(null, message.arg1, message.arg2);
                    this.f3247a.f25985t.mo6278a();
                    this.f3247a.f25987v.mo6269c();
                    return;
                }
                return;
            case 3:
                bli.m896d(des.f25916c, "MSG_UPDATE_ORIENTATION");
                eki = this.f3247a.f25985t;
                if (eki != null) {
                    eki.mo6278a();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
