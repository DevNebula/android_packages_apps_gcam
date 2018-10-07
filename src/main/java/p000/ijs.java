package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* renamed from: ijs */
public final class ijs implements kov {
    /* renamed from: a */
    private final /* synthetic */ ijv f21012a;

    public ijs(ijv ijv) {
        this.f21012a = ijv;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        ijv ijv = this.f21012a;
        bli.m892b(dmf.f23992c, "Failed to open camera: ", th);
        ijv.f7407a.f1623a.mo2154a(new dav());
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        List list = (List) jri.m13404b((List) obj);
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        ijv ijv = this.f21012a;
        bfe bfe = (bfe) obj2;
        iwl iwl = (iwl) obj3;
        Handler handler = new Handler(Looper.getMainLooper());
        dmf dmf = ijv.f7407a;
        dmf.f23998i = null;
        dmf.f23999j = bfe;
        handler.post(new dml(ijv, bfe, iwl));
    }
}
