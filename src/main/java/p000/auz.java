package p000;

/* compiled from: PG */
/* renamed from: auz */
final class auz implements iju {
    /* renamed from: a */
    public final /* synthetic */ aux f10842a;

    auz(aux aux) {
        this.f10842a = aux;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo8564a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        String str = aux.f10833a;
        String valueOf = String.valueOf(bool2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
        stringBuilder.append("PassiveFocusScan: isInFocused=");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        this.f10842a.f10837e = null;
        if (bool.booleanValue()) {
            bli.m896d(aux.f10833a, "PassiveFocusConvergeAnimation: start");
            aux aux = this.f10842a;
            aux.f10836d = aux.f10834b.mo12320c();
            jri.m13404b(this.f10842a.f10836d);
            this.f10842a.f10836d.mo7896a(new ava(this));
        }
        return null;
    }
}
