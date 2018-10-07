package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: gip */
public final class gip implements emi, enz, eoc, eoj, eok, eol {
    /* renamed from: a */
    public final awi f19204a;
    /* renamed from: b */
    public final iqz f19205b;
    /* renamed from: c */
    public boolean f19206c = false;
    /* renamed from: d */
    private final Context f19207d;
    /* renamed from: e */
    private boolean f19208e;
    /* renamed from: f */
    private final BroadcastReceiver f19209f = new giq(this);
    /* renamed from: g */
    private final BroadcastReceiver f19210g = new gir(this);

    public gip(Context context, awi awi, ira ira) {
        this.f19207d = context;
        this.f19204a = awi;
        this.f19205b = ira.mo8854a("ActivityCloseSec");
        this.f19208e = false;
    }

    /* renamed from: b */
    final void mo13358b() {
        if (this.f19208e) {
            this.f19205b.mo8832b("Detaching secure activity shutdown receivers.");
            this.f19207d.unregisterReceiver(this.f19209f);
            this.f19207d.unregisterReceiver(this.f19210g);
            this.f19208e = false;
        }
    }

    /* renamed from: a */
    public final void mo6329a() {
        mo13358b();
    }

    /* renamed from: K */
    public final void mo6362K() {
        if (!this.f19208e) {
            this.f19205b.mo8836d("Attaching secure activity shutdown receivers.");
            this.f19207d.registerReceiver(this.f19209f, new IntentFilter("android.intent.action.SCREEN_OFF"));
            this.f19207d.registerReceiver(this.f19210g, new IntentFilter("android.intent.action.USER_PRESENT"));
            this.f19208e = true;
        }
    }

    /* renamed from: f */
    public final void mo6365f() {
        mo13358b();
    }

    /* renamed from: i */
    public final void mo6372i() {
        this.f19206c = true;
    }

    /* renamed from: j */
    public final void mo6373j() {
        this.f19206c = false;
    }
}
