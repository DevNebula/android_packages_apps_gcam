package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cws */
public final class cws implements ilp, iqo {
    /* renamed from: f */
    private static final String f23703f = bli.m887a("CptrBtnReadiness");
    /* renamed from: a */
    public final ilb f23704a;
    /* renamed from: b */
    public final Executor f23705b;
    /* renamed from: c */
    public iqo f23706c;
    /* renamed from: d */
    public iqo f23707d;
    /* renamed from: e */
    public boolean f23708e;
    /* renamed from: g */
    private ilp f23709g;
    /* renamed from: h */
    private ilp f23710h;

    public cws() {
        this(new ikd());
    }

    private cws(Executor executor) {
        this.f23708e = false;
        Object valueOf = Boolean.valueOf(false);
        this.f23704a = new ilb(valueOf);
        this.f23705b = executor;
        mo14834a(new ilb(valueOf));
        mo14835b(new ilb(valueOf));
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return this.f23704a.mo13672a(iqt, executor);
    }

    /* renamed from: a */
    final void mo14834a(ilp ilp) {
        this.f23709g = ilp;
        iqo iqo = this.f23706c;
        if (iqo != null) {
            iqo.close();
        }
        this.f23706c = this.f23709g.mo13672a(new cww(this), this.f23705b);
    }

    /* renamed from: b */
    final void mo14835b(ilp ilp) {
        this.f23710h = ilp;
        iqo iqo = this.f23707d;
        if (iqo != null) {
            iqo.close();
        }
        this.f23707d = ilp.mo13672a(new cwx(this), this.f23705b);
    }

    public final void close() {
        this.f23705b.execute(new cwv(this));
    }

    /* renamed from: a */
    public final Boolean mo13673b() {
        return (Boolean) this.f23704a.f24630c;
    }

    /* renamed from: c */
    public final void mo14837c(ilp ilp) {
        this.f23705b.execute(new cwt(this, ilp));
    }

    /* renamed from: c */
    final void mo14836c() {
        boolean booleanValue;
        boolean booleanValue2;
        boolean z = false;
        ilp ilp = this.f23709g;
        if (ilp != null) {
            booleanValue = ((Boolean) ilp.mo13673b()).booleanValue();
        } else {
            booleanValue = false;
        }
        ilp = this.f23710h;
        if (ilp != null) {
            booleanValue2 = ((Boolean) ilp.mo13673b()).booleanValue();
        } else {
            booleanValue2 = false;
        }
        String str = f23703f;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("Camera: ");
        stringBuilder.append(booleanValue);
        stringBuilder.append(", Secondary: ");
        stringBuilder.append(booleanValue2);
        bli.m888a(str, stringBuilder.toString());
        ilb ilb = this.f23704a;
        if (booleanValue && booleanValue2) {
            z = true;
        }
        ilb.mo8826a(Boolean.valueOf(z));
    }
}
