package p000;

import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: dni */
final class dni implements kov {
    /* renamed from: a */
    public final /* synthetic */ dmy f14214a;
    /* renamed from: b */
    private final /* synthetic */ Handler f14215b;

    dni(dmy dmy, Handler handler) {
        this.f14214a = dmy;
        this.f14215b = handler;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f14214a.f1623a.mo2154a(new dlu());
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        this.f14215b.post(new dnj(this, (List) obj));
    }
}
