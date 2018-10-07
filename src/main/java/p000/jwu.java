package p000;

import android.util.Pair;
import java.io.Writer;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: jwu */
public final class jwu implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jwt f21788a;

    public jwu(jwt jwt) {
        this.f21788a = jwt;
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        for (Pair pair : this.f21788a.f21786a.keySet()) {
            writer.write(String.format(Locale.US, "%d,%d,%f%n", new Object[]{pair.first, pair.second, this.f21788a.f21786a.get(pair)}));
        }
    }
}
