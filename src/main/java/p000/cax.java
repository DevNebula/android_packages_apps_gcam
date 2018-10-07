package p000;

/* compiled from: PG */
/* renamed from: cax */
final class cax implements kov {
    /* renamed from: a */
    private final /* synthetic */ long f12093a;
    /* renamed from: b */
    private final /* synthetic */ cau f12094b;

    cax(cau cau, long j) {
        this.f12094b = cau;
        this.f12093a = j;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = car.f22871a;
        long j = this.f12093a;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("Gouda effect failed for shot ");
        stringBuilder.append(j);
        bli.m899e(str, stringBuilder.toString(), th);
        cau cau = this.f12094b;
        cau.f25529k = true;
        cau.mo15476a(this.f12093a);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Boolean bool = (Boolean) obj;
        String str;
        long j;
        StringBuilder stringBuilder;
        if (bool == null || !bool.booleanValue()) {
            str = car.f22871a;
            j = this.f12093a;
            stringBuilder = new StringBuilder(54);
            stringBuilder.append("Gouda effect not applied for shot ");
            stringBuilder.append(j);
            bli.m888a(str, stringBuilder.toString());
            return;
        }
        str = car.f22871a;
        j = this.f12093a;
        stringBuilder = new StringBuilder(63);
        stringBuilder.append("Gouda effect applied successfully for shot ");
        stringBuilder.append(j);
        bli.m888a(str, stringBuilder.toString());
    }
}
