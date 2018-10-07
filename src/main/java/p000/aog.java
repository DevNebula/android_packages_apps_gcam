package p000;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: aog */
final class aog implements Callback {
    /* renamed from: a */
    private final /* synthetic */ aod f839a;

    aog(aod aod) {
        this.f839a = aod;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.f839a.mo1630a((aoe) message.obj);
            return true;
        }
        if (message.what == 2) {
            this.f839a.f828c.mo11611a((aoe) message.obj);
        }
        return false;
    }
}
