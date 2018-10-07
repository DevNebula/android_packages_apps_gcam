package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ctx */
public class ctx extends gqj {
    /* renamed from: a */
    public static final String f23682a = bli.m887a("FSTransStatechart");
    /* renamed from: b */
    private csp f23683b;
    /* renamed from: c */
    private Context f23684c;

    public ctx() {
        super(null);
    }

    /* renamed from: a */
    public void mo7343a() {
        bli.m894c(f23682a, "onFilmstripShown");
        acc.m100b(this.f23684c).mo1646c();
    }

    /* renamed from: b */
    public void mo7344b() {
        bli.m894c(f23682a, "onFilmstripHidden");
        acc.m100b(this.f23684c).mo1647d();
        acc.m100b(this.f23684c).mo11613e();
        this.f23683b.mo5744e().mo5759b();
    }

    /* renamed from: a */
    public void mo14828a(csp csp, Context context) {
        this.f23683b = csp;
        this.f23684c = context;
    }
}
