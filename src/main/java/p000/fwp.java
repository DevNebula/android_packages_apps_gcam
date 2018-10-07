package p000;

/* compiled from: PG */
/* renamed from: fwp */
public final class fwp implements ffe {
    /* renamed from: a */
    private final fwm f18840a;
    /* renamed from: b */
    private final fwa f18841b;
    /* renamed from: c */
    private final /* synthetic */ fvy f18842c;

    public fwp(fvy fvy, fwm fwm, fwa fwa) {
        this.f18842c = fvy;
        this.f18840a = fwm;
        this.f18841b = fwa;
    }

    /* renamed from: a */
    public final void mo6771a() {
        try {
            this.f18842c.f4969b.mo6937a(this.f18840a, this.f18841b);
            this.f18840a.close();
        } catch (Throwable e) {
            fvy fvy = this.f18842c;
            iqz iqz = fvy.f4970c;
            String str = "PictureTaker command failed: ";
            String valueOf = String.valueOf(fvy.f4969b.toString());
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            iqz.mo8833b(valueOf, e);
            throw e;
        } catch (Throwable th) {
            this.f18840a.close();
            this.f18841b.f4984d.close();
            this.f18841b.f4983c.mo6926a();
            this.f18841b.f4981a.f4680g.close();
        }
    }

    public final String toString() {
        return "PictureTakerCommand";
    }
}
