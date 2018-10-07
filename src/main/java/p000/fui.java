package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fui */
final class fui implements kov {
    /* renamed from: a */
    private final /* synthetic */ fub f18791a;
    /* renamed from: b */
    private final /* synthetic */ fuh f18792b;

    fui(fuh fuh, fub fub) {
        this.f18792b = fuh;
        this.f18791a = fub;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        iqz iqz = this.f18792b.f18790a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Unable to log capture metadata: ");
        stringBuilder.append(valueOf);
        iqz.mo8834c(stringBuilder.toString());
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Iterable iterable = (List) obj;
        jri.m13404b((Object) iterable);
        Object obj2 = (String) khb.m4921a(iterable, 0);
        Object obj3 = (String) khb.m4921a(iterable, 1);
        iqz iqz = this.f18792b.f18790a;
        String valueOf = String.valueOf(jqk.m13351b("Capture Metadata").mo9703a("Input", obj2).mo9703a("Reprocessing", obj3).mo9703a("NPF", this.f18791a.f4948f).toString());
        String str = "Capture Metadata: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        iqz.mo8837e(valueOf);
    }
}
