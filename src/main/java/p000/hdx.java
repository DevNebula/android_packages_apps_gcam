package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: hdx */
final class hdx implements kov {
    /* renamed from: a */
    private final /* synthetic */ hdt f19967a;

    hdx(hdt hdt) {
        this.f19967a = hdt;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = hdt.f6434b;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Failed added Lens toybox entry: ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            List list = this.f19967a.f6435a;
            list.add(list.size() - 1, hhx.LENS);
            this.f19967a.notifyDataSetChanged();
        }
    }
}
