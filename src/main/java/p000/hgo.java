package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import com.google.android.apps.camera.p005ui.views.MainActivityLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hgo */
public final class hgo implements hhj {
    /* renamed from: a */
    public final Context f20077a;
    /* renamed from: b */
    public final ikd f20078b;
    /* renamed from: c */
    public final kbg f20079c;
    /* renamed from: d */
    public final goy f20080d;
    /* renamed from: e */
    public final boolean f20081e;
    /* renamed from: f */
    public final ilp f20082f;
    /* renamed from: g */
    public final gal f20083g;
    /* renamed from: h */
    public final AtomicBoolean f20084h = new AtomicBoolean(false);
    /* renamed from: i */
    public final AtomicReference f20085i = new AtomicReference();
    /* renamed from: j */
    public final AtomicReference f20086j = new AtomicReference();
    /* renamed from: k */
    public gbd f20087k;
    /* renamed from: l */
    private final kwk f20088l;
    /* renamed from: m */
    private final iji f20089m;
    /* renamed from: n */
    private final Resources f20090n;
    /* renamed from: o */
    private final hco f20091o;
    /* renamed from: p */
    private final ilp f20092p;
    /* renamed from: q */
    private final ilp f20093q;
    /* renamed from: r */
    private final AtomicReference f20094r = new AtomicReference();
    /* renamed from: s */
    private final AtomicReference f20095s = new AtomicReference();
    /* renamed from: t */
    private final hny f20096t;

    public hgo(Context context, kwk kwk, aws aws, ikd ikd, Resources resources, ilp ilp, ilp ilp2, ilp ilp3, kbg kbg, hco hco, gal gal, goy goy, boolean z, hny hny) {
        this.f20077a = context;
        this.f20088l = kwk;
        this.f20089m = aws.mo1824a();
        this.f20078b = ikd;
        this.f20090n = resources;
        this.f20079c = kbg;
        this.f20092p = ilp;
        this.f20093q = ilp3;
        this.f20082f = ilp2;
        this.f20091o = hco;
        this.f20080d = goy;
        this.f20081e = z;
        this.f20083g = gal;
        this.f20096t = hny;
    }

    /* renamed from: b */
    final void mo13537b() {
        boolean z = this.f20080d.mo7306a("ext_mic_tutorial_dismiss") <= 0 ? !((Boolean) this.f20093q.mo13673b()).booleanValue() ? this.f20081e : true : true;
        if (!z) {
            View view = (View) this.f20086j.get();
            if (view != null) {
                String string = this.f20090n.getString(R.string.mic_off_tooltip);
                WeakReference weakReference = new WeakReference((OptionsBarView) ((hes) this.f20088l.mo10566a()).f6486j.mo7919a((int) R.id.optionsbar2));
                WeakReference weakReference2 = new WeakReference(view);
                hcx a = this.f20091o.mo7723a(string).mo7729a(view);
                a.f19917j = 2;
                mo13536a(a.mo13519c().mo13516a(true).mo13517b().mo13513a().mo13515a(new hgs(weakReference2, weakReference)).mo13514a(new hgt(this), this.f20078b).mo13518b(new hgu(this), this.f20078b).mo13520d());
            }
        }
    }

    /* renamed from: c */
    final void mo13539c() {
        if (!mo13540d() && this.f20079c.mo9709b()) {
            View view = (View) this.f20085i.get();
            if (view != null) {
                String string;
                if (gon.m2713a(((Integer) this.f20092p.mo13673b()).intValue()) == gon.MICRO_OFF) {
                    string = this.f20090n.getString(R.string.micro_off_tooltip);
                } else {
                    string = this.f20090n.getString(R.string.micro_on_tooltip);
                }
                WeakReference weakReference = new WeakReference((OptionsBarView) ((hes) this.f20088l.mo10566a()).f6486j.mo7919a((int) R.id.optionsbar2));
                WeakReference weakReference2 = new WeakReference(view);
                hcx a = this.f20091o.mo7723a(string).mo7729a(view);
                a.f19917j = 2;
                mo13538b(a.mo13519c().mo13516a(false).mo13517b().mo13515a(new hgq(weakReference2, weakReference)).mo13514a(new hgr(this), this.f20078b).mo13520d());
            }
        }
    }

    /* renamed from: d */
    public final boolean mo13540d() {
        gon a = gon.m2713a(((Integer) this.f20092p.mo13673b()).intValue());
        if (this.f20080d.mo7306a("micro_tutorial_dismiss") <= 0 && a.equals(gon.MICRO_AUTO)) {
            ((eth) this.f20079c.mo9706a()).mo13185d();
            if (!this.f20081e) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static eti m12041a(gon gon) {
        switch (gon.ordinal()) {
            case 0:
                return eti.MICROVIDEO_MODE_OFF;
            case 1:
                return eti.MICROVIDEO_MODE_AUTO;
            case 2:
                return eti.MICROVIDEO_MODE_ON;
            default:
                String valueOf = String.valueOf(gon);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Unknown microvideo option: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    final void mo13536a(iqo iqo) {
        hgo.m12042a(iqo, this.f20095s);
    }

    /* renamed from: b */
    final void mo13538b(iqo iqo) {
        hgo.m12042a(iqo, this.f20094r);
    }

    /* renamed from: a */
    private static void m12042a(iqo iqo, AtomicReference atomicReference) {
        iqo iqo2 = (iqo) atomicReference.getAndSet(iqo);
        if (iqo2 != null) {
            iqo2.close();
        }
    }

    /* renamed from: a */
    public final void mo7877a() {
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ((hes) this.f20088l.mo10566a()).f6486j.mo7919a((int) R.id.activity_root_view);
        Object obj = (OptionsBarView) ((hes) this.f20088l.mo10566a()).f6486j.mo7919a((int) R.id.optionsbar2);
        obj.setVisibility(0);
        mainActivityLayout.f12892b = ken.m13708a(obj);
        mainActivityLayout.mo12647a();
        mainActivityLayout.f12895e = new hfs(this);
        this.f20087k = new gbd(obj, this.f20096t);
        FrameLayout frameLayout = (FrameLayout) ((hes) this.f20088l.mo10566a()).f6486j.mo7919a((int) R.id.menu_button_holder);
        OptionsBarView optionsBarView = this.f20083g.f5222b;
        optionsBarView.f23293g = frameLayout;
        optionsBarView.f23290d.f5072e.setIronView(frameLayout);
        gal gal = this.f20083g;
        gbj gbj = new gbj(this);
        OptionsBarView optionsBarView2 = gal.f5222b;
        if (!optionsBarView2.f23288b.contains(gbj)) {
            optionsBarView2.f23288b.add(gbj);
        }
        if (this.f20079c.mo9709b()) {
            this.f20089m.mo8557a(this.f20092p.mo13672a(new hgp(this), this.f20078b));
            ((eth) this.f20079c.mo9706a()).mo13182a(new hgx(this), new hgy(this));
            ((eth) this.f20079c.mo9706a()).mo13181a(hgo.m12041a(gon.m2713a(((Integer) this.f20092p.mo13673b()).intValue())));
            this.f20083g.mo7001a(fzo.MICROVIDEO, new hgz(this));
            obj.mo14605a(fzo.MICROVIDEO, new hha(this));
            obj.mo14604a(fzo.MICROVIDEO, new hhb(this));
            this.f20083g.mo7001a(fzo.MICROPHONE, new hhc(this));
            obj.mo14605a(fzo.MICROPHONE, new hhd(this));
            obj.mo14604a(fzo.MICROPHONE, new hhe(this));
        }
    }
}
