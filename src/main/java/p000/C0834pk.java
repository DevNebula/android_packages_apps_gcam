package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: pk */
final class C0834pk extends C0741pb implements OnKeyListener, OnItemClickListener, OnDismissListener, C0410pe {
    /* renamed from: e */
    private static final int f25412e = R.layout.abc_popup_menu_item_layout;
    /* renamed from: a */
    public final C0841tp f25413a;
    /* renamed from: b */
    public final OnGlobalLayoutListener f25414b = new C0415pl(this);
    /* renamed from: c */
    public View f25415c;
    /* renamed from: d */
    public ViewTreeObserver f25416d;
    /* renamed from: f */
    private final Context f25417f;
    /* renamed from: h */
    private final C0734op f25418h;
    /* renamed from: i */
    private final C0405oo f25419i;
    /* renamed from: j */
    private final boolean f25420j;
    /* renamed from: k */
    private final int f25421k;
    /* renamed from: l */
    private final int f25422l;
    /* renamed from: m */
    private final int f25423m;
    /* renamed from: n */
    private final OnAttachStateChangeListener f25424n = new C0416pm(this);
    /* renamed from: o */
    private OnDismissListener f25425o;
    /* renamed from: p */
    private View f25426p;
    /* renamed from: q */
    private C0411pf f25427q;
    /* renamed from: r */
    private boolean f25428r;
    /* renamed from: s */
    private boolean f25429s;
    /* renamed from: t */
    private int f25430t;
    /* renamed from: u */
    private int f25431u = 0;
    /* renamed from: v */
    private boolean f25432v;

    public C0834pk(Context context, C0734op c0734op, View view, int i, int i2, boolean z) {
        this.f25417f = context;
        this.f25418h = c0734op;
        this.f25420j = z;
        this.f25419i = new C0405oo(c0734op, LayoutInflater.from(context), this.f25420j, f25412e);
        this.f25422l = i;
        this.f25423m = i2;
        Resources resources = context.getResources();
        this.f25421k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f25426p = view;
        this.f25413a = new C0841tp(this.f25417f, this.f25422l, this.f25423m);
        c0734op.mo14297a((C0410pe) this, context);
    }

    /* renamed from: a */
    public final void mo14401a(C0734op c0734op) {
    }

    /* renamed from: c */
    public final void mo10860c() {
        if (mo10862e()) {
            this.f25413a.mo10860c();
        }
    }

    /* renamed from: a */
    public final boolean mo10850a() {
        return false;
    }

    /* renamed from: d */
    public final ListView mo10861d() {
        return this.f25413a.f22313e;
    }

    /* renamed from: e */
    public final boolean mo10862e() {
        return !this.f25428r && this.f25413a.f22326r.isShowing();
    }

    /* renamed from: a */
    public final void mo10847a(C0734op c0734op, boolean z) {
        if (c0734op == this.f25418h) {
            mo10860c();
            C0411pf c0411pf = this.f25427q;
            if (c0411pf != null) {
                c0411pf.mo10854a(c0734op, z);
            }
        }
    }

    public final void onDismiss() {
        this.f25428r = true;
        this.f25418h.close();
        ViewTreeObserver viewTreeObserver = this.f25416d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f25416d = this.f25415c.getViewTreeObserver();
            }
            this.f25416d.removeGlobalOnLayoutListener(this.f25414b);
            this.f25416d = null;
        }
        this.f25415c.removeOnAttachStateChangeListener(this.f25424n);
        OnDismissListener onDismissListener = this.f25425o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo10860c();
        return true;
    }

    /* renamed from: a */
    public final boolean mo10852a(C0835pn c0835pn) {
        if (c0835pn.hasVisibleItems()) {
            boolean z;
            C0408pc c0408pc = new C0408pc(this.f25417f, c0835pn, this.f25415c, this.f25420j, this.f25422l, this.f25423m);
            c0408pc.mo10839a(this.f25427q);
            c0408pc.mo10840a(C0741pb.m14555b((C0734op) c0835pn));
            c0408pc.f9522c = this.f25425o;
            this.f25425o = null;
            this.f25418h.mo14298a(false);
            C0760tg c0760tg = this.f25413a;
            int i = c0760tg.f22315g;
            int g = c0760tg.mo14433g();
            if ((Gravity.getAbsoluteGravity(this.f25431u, C0315jm.m4635j(this.f25426p)) & 7) == 5) {
                i += this.f25426p.getWidth();
            }
            if (c0408pc.mo10842c()) {
                z = true;
            } else if (c0408pc.f9520a != null) {
                c0408pc.mo10838a(i, g, true, true);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0411pf c0411pf = this.f25427q;
                if (c0411pf != null) {
                    c0411pf.mo10855a(c0835pn);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo14399a(View view) {
        this.f25426p = view;
    }

    /* renamed from: a */
    public final void mo10848a(C0411pf c0411pf) {
        this.f25427q = c0411pf;
    }

    /* renamed from: b */
    public final void mo14403b(boolean z) {
        this.f25419i.f9515b = z;
    }

    /* renamed from: a */
    public final void mo14398a(int i) {
        this.f25431u = i;
    }

    /* renamed from: b */
    public final void mo14402b(int i) {
        this.f25413a.f22315g = i;
    }

    /* renamed from: a */
    public final void mo14400a(OnDismissListener onDismissListener) {
        this.f25425o = onDismissListener;
    }

    /* renamed from: c */
    public final void mo14406c(boolean z) {
        this.f25432v = z;
    }

    /* renamed from: c */
    public final void mo14405c(int i) {
        this.f25413a.mo14432b(i);
    }

    /* renamed from: f */
    public final void mo10863f() {
        boolean z;
        if (mo10862e()) {
            z = true;
        } else if (this.f25428r) {
            z = false;
        } else {
            View view = this.f25426p;
            if (view != null) {
                this.f25415c = view;
                this.f25413a.mo14430a((OnDismissListener) this);
                C0760tg c0760tg = this.f25413a;
                c0760tg.f22321m = this;
                c0760tg.mo14436j();
                view = this.f25415c;
                ViewTreeObserver viewTreeObserver = this.f25416d;
                this.f25416d = view.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    this.f25416d.addOnGlobalLayoutListener(this.f25414b);
                }
                view.addOnAttachStateChangeListener(this.f25424n);
                C0760tg c0760tg2 = this.f25413a;
                c0760tg2.f22320l = view;
                c0760tg2.f22318j = this.f25431u;
                if (!this.f25429s) {
                    this.f25430t = C0741pb.m14553a(this.f25419i, null, this.f25417f, this.f25421k);
                    this.f25429s = true;
                }
                this.f25413a.mo14427a(this.f25430t);
                this.f25413a.mo14435i();
                c0760tg = this.f25413a;
                c0760tg.f22324p = this.f22237g;
                c0760tg.m17118a();
                ViewGroup viewGroup = this.f25413a.f22313e;
                viewGroup.setOnKeyListener(this);
                if (this.f25432v && this.f25418h.f22181f != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f25417f).inflate(R.layout.abc_popup_menu_header_item_layout, viewGroup, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f25418h.f22181f);
                    }
                    frameLayout.setEnabled(false);
                    viewGroup.addHeaderView(frameLayout, null, false);
                }
                this.f25413a.mo14429a(this.f25419i);
                this.f25413a.m17118a();
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public final void mo10849a(boolean z) {
        this.f25429s = false;
        C0405oo c0405oo = this.f25419i;
        if (c0405oo != null) {
            c0405oo.notifyDataSetChanged();
        }
    }
}
