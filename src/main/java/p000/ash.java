package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: ash */
final class ash {
    /* renamed from: a */
    public final fhg f961a;
    /* renamed from: b */
    public final kpk f962b;
    /* renamed from: c */
    public final asg f963c;
    /* renamed from: d */
    public final kpw f964d = kpw.m18486d();
    /* renamed from: e */
    public final fdl f965e;
    /* renamed from: f */
    private final ffe f966f = new asj(this);

    static {
        bli.m887a("AeAfActiveScanner");
    }

    ash(fhg fhg, kpk kpk, asg asg, fdl fdl) {
        this.f961a = fhg;
        this.f962b = kpk;
        this.f963c = asg;
        this.f965e = fdl;
    }

    /* renamed from: a */
    public final kpk mo1778a() {
        return iel.m3775a(this.f964d, this.f965e.mo6759a(), new asi());
    }

    /* renamed from: a */
    public final kpk mo1779a(fff fff) {
        knk knk;
        fdl fdl = this.f965e;
        synchronized (fdl.f4713a) {
            knk = fdl.f4716d;
            fdl.f4716d = kpw.m18486d();
            fdl.f4714b = false;
        }
        if (knk != null) {
            knk.mo15642a(new InterruptedException());
        }
        return fff.mo6772a(this.f966f);
    }

    public final String toString() {
        return "AeAfActiveScanner";
    }
}
