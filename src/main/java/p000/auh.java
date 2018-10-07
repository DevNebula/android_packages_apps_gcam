package p000;

/* compiled from: PG */
/* renamed from: auh */
final class auh implements iqt {
    /* renamed from: a */
    private final /* synthetic */ aug f10793a;

    auh(aug aug) {
        this.f10793a = aug;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            aug aug = this.f10793a;
            if (aug.f10787d) {
                hke hke = aug.f10788e;
                aug.f10786c = System.currentTimeMillis();
                String str = aug.f10784a;
                String valueOf = String.valueOf(Long.toString(this.f10793a.f10786c));
                String str2 = "evScrollingState update";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m888a(str, valueOf);
            }
        }
        this.f10793a.f10787d = bool.booleanValue();
    }
}
