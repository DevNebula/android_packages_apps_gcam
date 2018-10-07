package p000;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: awc */
final class awc implements aub {
    /* renamed from: a */
    private final /* synthetic */ kpw f10921a;
    /* renamed from: b */
    private final /* synthetic */ ilp f10922b;
    /* renamed from: c */
    private final /* synthetic */ avy f10923c;

    awc(avy avy, kpw kpw, ilp ilp) {
        this.f10923c = avy;
        this.f10921a = kpw;
        this.f10922b = ilp;
    }

    /* renamed from: a */
    public final void mo1798a() {
        Object e;
        bli.m888a(avy.f10906a, "ae/af lock initiated.");
        ((gva) this.f10923c.f10907b.mo9706a()).mo13472e();
        avy avy = this.f10923c;
        try {
            avy.f10910e.f4691a.mo8826a(Boolean.valueOf(true));
            fio fio = new fio((fim) ((ffw) isr.m4201a(avy.f10909d)).mo13673b());
            fio.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            avy.mo12325a(fio.mo6807a());
            return;
        } catch (isr e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        String str = avy.f10906a;
        String valueOf = String.valueOf(e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
        stringBuilder.append("Error when locking ae/af. ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
    }

    /* renamed from: b */
    public final ilp mo1799b() {
        return this.f10922b;
    }

    /* renamed from: c */
    public final kpk mo1800c() {
        return this.f10921a;
    }

    /* renamed from: d */
    public final kpk mo1801d() {
        return kow.m13873a(null);
    }

    /* renamed from: e */
    public final void mo1802e() {
        bli.m888a(avy.f10906a, "ae/af unlock initiated");
        this.f10923c.mo12323a();
    }
}
