package p000;

import android.os.SystemClock;
import android.view.SurfaceHolder.Callback2;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.apps.camera.p005ui.views.MainActivityLayout;
import com.google.android.apps.camera.stats.Instrumentation;

/* compiled from: PG */
/* renamed from: hei */
final class hei implements OnLayoutChangeListener, iqo {
    /* renamed from: j */
    private static int f19973j = 0;
    /* renamed from: a */
    public final hmy f19974a;
    /* renamed from: b */
    public final iqz f19975b;
    /* renamed from: c */
    public final hmz f19976c;
    /* renamed from: d */
    public final gci f19977d;
    /* renamed from: e */
    public final Runnable f19978e;
    /* renamed from: f */
    public final heo f19979f;
    /* renamed from: g */
    public final gsg f19980g;
    /* renamed from: h */
    public final kpw f19981h = kpw.m18486d();
    /* renamed from: i */
    public hmx f19982i;
    /* renamed from: k */
    private final FrameLayout f19983k;
    /* renamed from: l */
    private final MainActivityLayout f19984l;
    /* renamed from: m */
    private final Callback2 f19985m;

    hei(ira ira, hmy hmy, FrameLayout frameLayout, MainActivityLayout mainActivityLayout, gci gci, Instrumentation instrumentation, heo heo, Runnable runnable) {
        boolean z;
        this.f19983k = frameLayout;
        this.f19984l = mainActivityLayout;
        this.f19974a = hmy;
        this.f19976c = hmy.mo7970a(frameLayout.getContext());
        hmz hmz = this.f19976c;
        iqp iqp = heo.f6471a;
        hmz.mo7971a(iqp.f7695a, iqp.f7696b);
        this.f19977d = gci;
        this.f19979f = heo;
        this.f19980g = (gsg) instrumentation.viewfinder().create();
        this.f19978e = runnable;
        int i = f19973j;
        f19973j = i + 1;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("ViewfinderSV");
        stringBuilder.append(i);
        this.f19975b = ira.mo8854a(stringBuilder.toString());
        this.f19985m = new hej(this);
        this.f19976c.getHolder().addCallback(this.f19985m);
        mainActivityLayout.addOnLayoutChangeListener(this);
        this.f19983k.addView(this.f19976c, new LayoutParams(-1, -1));
        gsg gsg = this.f19980g;
        if (gsg.f19556a == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Accidental session reuse.");
        iya iya = gsg.f2599m;
        gsg.f19556a = SystemClock.elapsedRealtimeNanos();
        this.f19983k.setVisibility(0);
        this.f19976c.setVisibility(0);
    }

    public final void close() {
        ikd.m12501a();
        hmx hmx = this.f19982i;
        if (hmx != null) {
            hmx.close();
            this.f19982i = null;
        }
        if (!this.f19981h.isDone()) {
            this.f19975b.mo8832b("Previous request exists, setting exception and nulling request.");
            this.f19981h.mo15642a(new isr("Config canceled"));
        }
        this.f19976c.getHolder().removeCallback(this.f19985m);
        this.f19983k.removeView(this.f19976c);
        this.f19984l.removeOnLayoutChangeListener(this);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        hmx hmx = this.f19982i;
        if (hmx != null) {
            hmx.mo13547a(this.f19977d.mo7041f());
        }
    }
}
