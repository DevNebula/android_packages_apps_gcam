package p000;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: fhl */
public final class fhl implements kaw {
    /* renamed from: a */
    private final /* synthetic */ ikb f18284a;
    /* renamed from: b */
    private final /* synthetic */ fiq f18285b;

    public fhl(ikb ikb, fiq fiq) {
        this.f18284a = ikb;
        this.f18285b = fiq;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        iwg iwg = (iwg) obj;
        ikb ikb = this.f18284a;
        HandlerThread handlerThread = new HandlerThread("GcaMetadataHandler", -2);
        handlerThread.start();
        ikb.mo8557a(new ijz(handlerThread));
        Handler handler = new Handler(handlerThread.getLooper());
        fiq fiq = this.f18285b;
        return new fie(fiq.f4807a, fiq.f4808b, fiq.mo6817a(iwg, handler));
    }
}
