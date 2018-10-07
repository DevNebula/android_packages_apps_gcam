package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.api.Status;
import com.google.common.logging.nano.eventprotos$CameraEvent;

/* compiled from: PG */
/* renamed from: epd */
public final class epd implements epc {
    /* renamed from: a */
    private final hth f17600a;

    public epd(Context context) {
        this.f17600a = new hth(context, "ANDROID_CAMERA");
        blp.f1294a.mo8854a("GcaClearcutLog");
    }

    /* renamed from: a */
    public final void mo6439a(eventprotos$CameraEvent eventprotos_cameraevent) {
        icw icw = new icw(this.f17600a, kvl.toByteArray(eventprotos_cameraevent));
        if (icw.f20915h) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        icw.f20915h = true;
        LogEventParcelable logEventParcelable = new LogEventParcelable(new PlayLoggerContext(icw.f20916i.f7009d, icw.f20916i.f7010e, icw.f20908a, icw.f20909b, icw.f20910c, icw.f20911d, false, icw.f20912e), icw.f20914g, null, null, null, null, null, icw.f20913f);
        PlayLoggerContext playLoggerContext = logEventParcelable.f23329a;
        if (icw.f20916i.f7017l.mo8118a(playLoggerContext.f23340b, playLoggerContext.f23339a)) {
            icw.f20916i.f7014i.mo8120a(logEventParcelable);
            return;
        }
        Object obj = Status.f23355a;
        htl.m3489b(obj, (Object) "Result must not be null");
        new hzw(Looper.getMainLooper()).mo8364a((hux) obj);
    }
}
