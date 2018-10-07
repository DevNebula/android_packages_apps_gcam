package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.p002v7.widget.ActionBarContainer;
import android.support.p002v7.widget.ActionBarContextView;
import android.support.p002v7.widget.ActionBarOverlayLayout;
import android.support.p002v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ne */
public final class C0724ne extends C0359lt implements C0423pw {
    /* renamed from: o */
    private static final Interpolator f22095o = new AccelerateInterpolator();
    /* renamed from: p */
    private static final Interpolator f22096p = new DecelerateInterpolator();
    /* renamed from: A */
    private final C0331kg f22097A = new C0827ng(this);
    /* renamed from: B */
    private final C0332ki f22098B = new C0332ki(this);
    /* renamed from: a */
    public Context f22099a;
    /* renamed from: b */
    public ActionBarOverlayLayout f22100b;
    /* renamed from: c */
    public ActionBarContainer f22101c;
    /* renamed from: d */
    public C0462ru f22102d;
    /* renamed from: e */
    public ActionBarContextView f22103e;
    /* renamed from: f */
    public View f22104f;
    /* renamed from: g */
    public C0725nh f22105g;
    /* renamed from: h */
    public C0387nn f22106h;
    /* renamed from: i */
    public C0388no f22107i;
    /* renamed from: j */
    public boolean f22108j = true;
    /* renamed from: k */
    public boolean f22109k;
    /* renamed from: l */
    public boolean f22110l;
    /* renamed from: m */
    public C0395nx f22111m;
    /* renamed from: n */
    public boolean f22112n;
    /* renamed from: q */
    private Context f22113q;
    /* renamed from: r */
    private boolean f22114r;
    /* renamed from: s */
    private boolean f22115s;
    /* renamed from: t */
    private ArrayList f22116t = new ArrayList();
    /* renamed from: u */
    private boolean f22117u;
    /* renamed from: v */
    private int f22118v = 0;
    /* renamed from: w */
    private boolean f22119w;
    /* renamed from: x */
    private boolean f22120x = true;
    /* renamed from: y */
    private boolean f22121y;
    /* renamed from: z */
    private final C0331kg f22122z = new C0826nf(this);

    public C0724ne(Activity activity, boolean z) {
        ArrayList arrayList = new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m14399a(decorView);
        if (!z) {
            this.f22104f = decorView.findViewById(16908290);
        }
    }

    public C0724ne(Dialog dialog) {
        ArrayList arrayList = new ArrayList();
        m14399a(dialog.getWindow().getDecorView());
    }

    /* renamed from: e */
    public final void mo14245e(boolean z) {
        if (z) {
            if (!this.f22119w) {
                this.f22119w = true;
                if (this.f22100b != null) {
                    ActionBarOverlayLayout.m6860h();
                }
                m14402h(false);
            }
        } else if (this.f22119w) {
            this.f22119w = false;
            if (this.f22100b != null) {
                ActionBarOverlayLayout.m6860h();
            }
            m14402h(false);
        }
        if (C0315jm.m4649x(this.f22101c)) {
            C0328kd a;
            C0328kd a2;
            long duration;
            if (z) {
                a = this.f22102d.mo11062a(4, 100);
                a2 = this.f22103e.mo10867a(0, 200);
            } else {
                a2 = this.f22102d.mo11062a(0, 200);
                a = this.f22103e.mo10867a(8, 100);
            }
            C0395nx c0395nx = new C0395nx();
            c0395nx.f9492a.add(a);
            View view = (View) a.f8577a.get();
            if (view != null) {
                duration = view.animate().getDuration();
            } else {
                duration = 0;
            }
            view = (View) a2.f8577a.get();
            if (view != null) {
                view.animate().setStartDelay(duration);
            }
            c0395nx.f9492a.add(a2);
            c0395nx.mo10790c();
        } else if (z) {
            this.f22102d.mo11067b(4);
            this.f22103e.setVisibility(0);
        } else {
            this.f22102d.mo11067b(0);
            this.f22103e.setVisibility(8);
        }
    }

    /* renamed from: a */
    static boolean m14400a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo10648b() {
        C0462ru c0462ru = this.f22102d;
        if (c0462ru != null) {
            boolean z;
            Toolbar toolbar = c0462ru.f9654a;
            C0770vn c0770vn = toolbar.f756s;
            if (c0770vn == null) {
                z = false;
            } else if (c0770vn.f22347a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                toolbar.mo1195a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo10643a(boolean z) {
        if (z != this.f22115s) {
            this.f22115s = z;
            int size = this.f22116t.size();
            for (int i = 0; i < size; i++) {
                ((C0361lv) this.f22116t.get(i)).mo10660a();
            }
        }
    }

    /* renamed from: f */
    public final void mo10885f(boolean z) {
        this.f22108j = z;
    }

    /* renamed from: c */
    public final int mo10649c() {
        return this.f22102d.f9655b;
    }

    /* renamed from: d */
    public final Context mo10651d() {
        if (this.f22113q == null) {
            TypedValue typedValue = new TypedValue();
            this.f22099a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f22113q = new ContextThemeWrapper(this.f22099a, i);
            } else {
                this.f22113q = this.f22099a;
            }
        }
        return this.f22113q;
    }

    /* renamed from: l */
    public final void mo10886l() {
        if (!this.f22110l) {
            this.f22110l = true;
            m14402h(true);
        }
    }

    /* renamed from: a */
    private final void m14399a(View view) {
        int i;
        C0462ru c0462ru;
        this.f22100b = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        View view2 = this.f22100b;
        if (view2 != null) {
            view2.f10560g = this;
            if (view2.getWindowToken() != null) {
                view2.f10560g.mo10884a(view2.f10554a);
                i = view2.f10559f;
                if (i != 0) {
                    view2.onWindowSystemUiVisibilityChanged(i);
                    C0315jm.m4602B(view2);
                }
            }
        }
        view2 = view.findViewById(R.id.action_bar);
        if (view2 instanceof C0462ru) {
            c0462ru = (C0462ru) view2;
        } else if (view2 instanceof Toolbar) {
            c0462ru = ((Toolbar) view2).mo1208g();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't make a decor toolbar out of ");
            stringBuilder.append(view2 != null ? view2.getClass().getSimpleName() : "null");
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f22102d = c0462ru;
        this.f22103e = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        this.f22101c = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        c0462ru = this.f22102d;
        if (c0462ru == null || this.f22103e == null || this.f22101c == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(getClass().getSimpleName());
            stringBuilder2.append(" can only be used ");
            stringBuilder2.append("with a compatible window decor layout");
            throw new IllegalStateException(stringBuilder2.toString());
        }
        this.f22099a = c0462ru.f9654a.getContext();
        if ((this.f22102d.f9655b & 4) != 0) {
            this.f22114r = true;
        }
        C0386nm a = C0386nm.m5683a(this.f22099a);
        i = a.f9442a.getApplicationInfo().targetSdkVersion;
        m14401g(a.mo10736b());
        TypedArray obtainStyledAttributes = this.f22099a.obtainStyledAttributes(null, C0382ni.f9267a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0382ni.f9419m, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.f22100b;
            if (actionBarOverlayLayout.f10556c) {
                this.f22112n = true;
                actionBarOverlayLayout.mo12108a(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        i = obtainStyledAttributes.getDimensionPixelSize(C0382ni.f9417k, 0);
        if (i != 0) {
            C0315jm.m4608a(this.f22101c, (float) i);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public final void mo10654f() {
        m14401g(C0386nm.m5683a(this.f22099a).mo10736b());
    }

    /* renamed from: m */
    public final void mo10887m() {
        C0395nx c0395nx = this.f22111m;
        if (c0395nx != null) {
            c0395nx.mo10788a();
            this.f22111m = null;
        }
    }

    /* renamed from: a */
    public final boolean mo10645a(int i, KeyEvent keyEvent) {
        C0725nh c0725nh = this.f22105g;
        if (c0725nh == null) {
            return false;
        }
        Menu menu = c0725nh.f22123a;
        if (menu == null) {
            return false;
        }
        int i2;
        boolean z;
        if (keyEvent == null) {
            i2 = -1;
        } else {
            i2 = keyEvent.getDeviceId();
        }
        if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
            z = true;
        } else {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public final void mo10884a(int i) {
        this.f22118v = i;
    }

    /* renamed from: b */
    public final void mo10647b(boolean z) {
        if (!this.f22114r) {
            mo10650c(z);
        }
    }

    /* renamed from: c */
    public final void mo10650c(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        m14398a(i, 4);
    }

    /* renamed from: a */
    private final void m14398a(int i, int i2) {
        C0462ru c0462ru = this.f22102d;
        int i3 = c0462ru.f9655b;
        if ((i2 & 4) != 0) {
            this.f22114r = true;
        }
        c0462ru.mo11064a((i3 & (i2 ^ -1)) | (i & i2));
    }

    /* renamed from: j */
    public final void mo10658j() {
        m14398a(2, 2);
    }

    /* renamed from: g */
    private final void m14401g(boolean z) {
        this.f22117u = z;
        if (this.f22117u) {
            this.f22101c.f635a = null;
            this.f22102d.f9656c = null;
        } else {
            this.f22102d.f9656c = null;
            this.f22101c.f635a = null;
        }
        Toolbar toolbar = this.f22102d.f9654a;
        toolbar.f757t = false;
        toolbar.requestLayout();
        this.f22100b.f10557d = false;
    }

    /* renamed from: k */
    public final void mo10659k() {
        this.f22102d.mo11065a(null);
    }

    /* renamed from: d */
    public final void mo10652d(boolean z) {
        this.f22121y = z;
        if (!z) {
            C0395nx c0395nx = this.f22111m;
            if (c0395nx != null) {
                c0395nx.mo10788a();
            }
        }
    }

    /* renamed from: a */
    public final void mo10642a(CharSequence charSequence) {
        this.f22102d.mo11066a(charSequence);
    }

    /* renamed from: b */
    public final void mo10646b(CharSequence charSequence) {
        this.f22102d.mo11068b(charSequence);
    }

    /* renamed from: n */
    public final void mo10888n() {
        if (this.f22110l) {
            this.f22110l = false;
            m14402h(true);
        }
    }

    /* renamed from: a */
    public final C0387nn mo10641a(C0388no c0388no) {
        C0725nh c0725nh = this.f22105g;
        if (c0725nh != null) {
            c0725nh.mo10741b();
        }
        this.f22100b.mo12108a(false);
        this.f22103e.mo12099b();
        C0387nn c0725nh2 = new C0725nh(this, this.f22103e.getContext(), c0388no);
        if (!c0725nh2.mo14246a()) {
            return null;
        }
        this.f22105g = c0725nh2;
        c0725nh2.mo10749h();
        this.f22103e.mo12097a(c0725nh2);
        mo14245e(true);
        this.f22103e.sendAccessibilityEvent(32);
        return c0725nh2;
    }

    /* renamed from: h */
    private final void m14402h(boolean z) {
        C0395nx c0395nx;
        float f;
        C0395nx c0395nx2;
        C0328kd b;
        View view;
        if (C0724ne.m14400a(false, this.f22110l, this.f22119w)) {
            if (!this.f22120x) {
                View view2;
                this.f22120x = true;
                c0395nx = this.f22111m;
                if (c0395nx != null) {
                    c0395nx.mo10788a();
                }
                this.f22101c.setVisibility(0);
                if (this.f22118v == 0 && (this.f22121y || z)) {
                    this.f22101c.setTranslationY(0.0f);
                    f = (float) (-this.f22101c.getHeight());
                    if (z) {
                        int[] iArr = new int[]{0, 0};
                        this.f22101c.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f22101c.setTranslationY(f);
                    c0395nx2 = new C0395nx();
                    b = C0315jm.m4606a(this.f22101c).mo9763b(0.0f);
                    b.mo9761a(this.f22098B);
                    c0395nx2.mo10786a(b);
                    if (this.f22108j) {
                        view = this.f22104f;
                        if (view != null) {
                            view.setTranslationY(f);
                            c0395nx2.mo10786a(C0315jm.m4606a(this.f22104f).mo9763b(0.0f));
                        }
                    }
                    c0395nx2.mo10785a(f22096p);
                    c0395nx2.mo10789b();
                    c0395nx2.mo10787a(this.f22097A);
                    this.f22111m = c0395nx2;
                    c0395nx2.mo10790c();
                } else {
                    this.f22101c.setAlpha(1.0f);
                    this.f22101c.setTranslationY(0.0f);
                    if (this.f22108j) {
                        view2 = this.f22104f;
                        if (view2 != null) {
                            view2.setTranslationY(0.0f);
                        }
                    }
                    this.f22097A.mo9957b();
                }
                view2 = this.f22100b;
                if (view2 != null) {
                    C0315jm.m4602B(view2);
                }
            }
        } else if (this.f22120x) {
            this.f22120x = false;
            c0395nx = this.f22111m;
            if (c0395nx != null) {
                c0395nx.mo10788a();
            }
            if (this.f22118v == 0 && (this.f22121y || z)) {
                this.f22101c.setAlpha(1.0f);
                this.f22101c.mo1088a(true);
                c0395nx2 = new C0395nx();
                f = (float) (-this.f22101c.getHeight());
                if (z) {
                    int[] iArr2 = new int[]{0, 0};
                    this.f22101c.getLocationInWindow(iArr2);
                    f -= (float) iArr2[1];
                }
                b = C0315jm.m4606a(this.f22101c).mo9763b(f);
                b.mo9761a(this.f22098B);
                c0395nx2.mo10786a(b);
                if (this.f22108j) {
                    view = this.f22104f;
                    if (view != null) {
                        c0395nx2.mo10786a(C0315jm.m4606a(view).mo9763b(f));
                    }
                }
                c0395nx2.mo10785a(f22095o);
                c0395nx2.mo10789b();
                c0395nx2.mo10787a(this.f22122z);
                this.f22111m = c0395nx2;
                c0395nx2.mo10790c();
                return;
            }
            this.f22122z.mo9957b();
        }
    }
}
