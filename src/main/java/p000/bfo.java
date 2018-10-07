package p000;

/* compiled from: PG */
/* renamed from: bfo */
final class bfo implements kov {
    /* renamed from: a */
    private final /* synthetic */ ken f11249a;
    /* renamed from: b */
    private final /* synthetic */ bfl f11250b;

    bfo(bfl bfl, ken ken) {
        this.f11250b = bfl;
        this.f11249a = ken;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = bfl.f22635a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 11);
        stringBuilder.append("onFailure: ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        synchronized (this.f11250b.f22641g) {
            ken ken = this.f11249a;
            int size = ken.size();
            int i = 0;
            while (i < size) {
                Object obj = ken.get(i);
                i++;
                ((iqo) obj).close();
            }
            if (!this.f11250b.f22640f.isDone()) {
                this.f11250b.f22640f.mo15641a(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: b_ */
    public final /* bridge */ /* synthetic */ void mo10186b_(Object obj) {
    }
}
