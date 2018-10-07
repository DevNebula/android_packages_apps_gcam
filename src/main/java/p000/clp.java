package p000;

import android.view.View;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: clp */
final class clp implements kov {
    /* renamed from: a */
    private final /* synthetic */ cli f12702a;

    clp(cli cli) {
        this.f12702a = cli;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        throw new RuntimeException(th);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        List list = (List) obj;
        for (Entry entry : this.f12702a.f2307i.entrySet()) {
            if (list.contains(entry.getKey())) {
                ((View) entry.getValue()).setVisibility(0);
            } else {
                ((View) entry.getValue()).setVisibility(8);
            }
        }
        this.f12702a.f2306h = list.isEmpty();
        cli cli = this.f12702a;
        if (cli.f2306h) {
            cli.mo2358b();
        }
    }
}
