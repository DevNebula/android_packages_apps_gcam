package p000;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
/* compiled from: PG */
/* renamed from: irb */
public final class irb implements ird {
    /* renamed from: a */
    private final String f21214a;

    public irb() {
        this("");
    }

    public irb(String str) {
        this.f21214a = str;
    }

    /* renamed from: a */
    public final void mo8855a() {
    }

    /* renamed from: a */
    public final void mo8856a(String str) {
        Trace.beginSection(String.format(null, "%s_%s", new Object[]{this.f21214a, str}));
    }

    /* renamed from: b */
    public final void mo8857b() {
        Trace.endSection();
    }

    /* renamed from: b */
    public final void mo8858b(String str) {
        Trace.endSection();
        mo8856a(str);
    }
}
