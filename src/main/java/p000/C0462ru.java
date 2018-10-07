package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v7.widget.ActionMenuView;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: ru */
public final class C0462ru {
    /* renamed from: a */
    public Toolbar f9654a;
    /* renamed from: b */
    public int f9655b;
    /* renamed from: c */
    public View f9656c;
    /* renamed from: d */
    public CharSequence f9657d;
    /* renamed from: e */
    public Callback f9658e;
    /* renamed from: f */
    public boolean f9659f;
    /* renamed from: g */
    public C0836py f9660g;
    /* renamed from: h */
    private View f9661h;
    /* renamed from: i */
    private Drawable f9662i;
    /* renamed from: j */
    private Drawable f9663j;
    /* renamed from: k */
    private Drawable f9664k;
    /* renamed from: l */
    private boolean f9665l;
    /* renamed from: m */
    private CharSequence f9666m;
    /* renamed from: n */
    private CharSequence f9667n;
    /* renamed from: o */
    private int f9668o;
    /* renamed from: p */
    private Drawable f9669p;

    public C0462ru(Toolbar toolbar) {
        this(toolbar, (byte) 0);
    }

    private C0462ru(Toolbar toolbar, byte b) {
        boolean z;
        Toolbar toolbar2;
        Context context;
        TextView textView;
        this.f9668o = 0;
        this.f9654a = toolbar;
        this.f9657d = toolbar.f752o;
        this.f9666m = toolbar.f753p;
        if (this.f9657d != null) {
            z = true;
        } else {
            z = false;
        }
        this.f9665l = z;
        this.f9664k = toolbar.mo1207f();
        C0540vk a = C0540vk.m6109a(toolbar.getContext(), null, C0382ni.f9267a, R.attr.actionBarStyle, 0);
        this.f9669p = a.mo11390b(C0382ni.f9420n);
        CharSequence e = a.mo11396e(C0382ni.f9426t);
        if (!TextUtils.isEmpty(e)) {
            mo11066a(e);
        }
        e = a.mo11396e(C0382ni.f9424r);
        if (!TextUtils.isEmpty(e)) {
            this.f9666m = e;
            if ((this.f9655b & 8) != 0) {
                this.f9654a.mo1202b(e);
            }
        }
        Drawable b2 = a.mo11390b(C0382ni.f9422p);
        if (b2 != null) {
            mo11065a(b2);
        }
        b2 = a.mo11390b(C0382ni.f9421o);
        if (b2 != null) {
            this.f9662i = b2;
            m5857d();
        }
        if (this.f9664k == null) {
            b2 = this.f9669p;
            if (b2 != null) {
                this.f9664k = b2;
                m5855c();
            }
        }
        mo11064a(a.mo11393d(C0382ni.f9416j, 0));
        int g = a.mo11399g(C0382ni.f9415i, 0);
        if (g != 0) {
            View inflate = LayoutInflater.from(this.f9654a.getContext()).inflate(g, this.f9654a, false);
            View view = this.f9661h;
            if (!(view == null || (this.f9655b & 16) == 0)) {
                this.f9654a.removeView(view);
            }
            this.f9661h = inflate;
            if (!(inflate == null || (this.f9655b & 16) == 0)) {
                this.f9654a.addView(this.f9661h);
            }
            mo11064a(this.f9655b | 16);
        }
        g = a.mo11397f(C0382ni.f9418l, 0);
        if (g > 0) {
            LayoutParams layoutParams = this.f9654a.getLayoutParams();
            layoutParams.height = g;
            this.f9654a.setLayoutParams(layoutParams);
        }
        g = a.mo11389b(C0382ni.f9414h, -1);
        int b3 = a.mo11389b(C0382ni.f9413g, -1);
        if (g >= 0 || b3 >= 0) {
            Toolbar toolbar3 = this.f9654a;
            g = Math.max(g, 0);
            b3 = Math.max(b3, 0);
            toolbar3.mo1200b();
            toolbar3.f751n.mo11380a(g, b3);
        }
        g = a.mo11399g(C0382ni.f9427u, 0);
        if (g != 0) {
            toolbar2 = this.f9654a;
            context = toolbar2.getContext();
            toolbar2.f748k = g;
            textView = toolbar2.f739b;
            if (textView != null) {
                textView.setTextAppearance(context, g);
            }
        }
        g = a.mo11399g(C0382ni.f9425s, 0);
        if (g != 0) {
            toolbar2 = this.f9654a;
            context = toolbar2.getContext();
            toolbar2.f749l = g;
            textView = toolbar2.f740c;
            if (textView != null) {
                textView.setTextAppearance(context, g);
            }
        }
        int g2 = a.mo11399g(C0382ni.f9423q, 0);
        if (g2 != 0) {
            this.f9654a.mo1196a(g2);
        }
        a.f9927b.recycle();
        if (this.f9668o != R.string.abc_action_bar_up_description) {
            this.f9668o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f9654a.mo1206e())) {
                CharSequence charSequence;
                int i = this.f9668o;
                if (i == 0) {
                    charSequence = null;
                } else {
                    charSequence = this.f9654a.getContext().getString(i);
                }
                this.f9667n = charSequence;
                m5854b();
            }
        }
        this.f9667n = this.f9654a.mo1206e();
        Toolbar toolbar4 = this.f9654a;
        OnClickListener c0544vr = new C0544vr(this);
        toolbar4.mo1203c();
        toolbar4.f741d.setOnClickListener(c0544vr);
    }

    /* renamed from: a */
    public final void mo11063a() {
        ActionMenuView actionMenuView = this.f9654a.f738a;
        if (actionMenuView != null) {
            actionMenuView.mo12131a();
        }
    }

    /* renamed from: a */
    public final void mo11064a(int i) {
        int i2 = this.f9655b ^ i;
        this.f9655b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m5854b();
                }
                m5855c();
            }
            if ((i2 & 3) != 0) {
                m5857d();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f9654a.mo1204c(this.f9657d);
                    this.f9654a.mo1202b(this.f9666m);
                } else {
                    this.f9654a.mo1204c(null);
                    this.f9654a.mo1202b(null);
                }
            }
            if ((i2 & 16) != 0) {
                View view = this.f9661h;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f9654a.addView(view);
                } else {
                    this.f9654a.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11065a(Drawable drawable) {
        this.f9663j = drawable;
        m5857d();
    }

    /* renamed from: a */
    public final void mo11066a(CharSequence charSequence) {
        this.f9665l = true;
        m5856c(charSequence);
    }

    /* renamed from: c */
    private final void m5856c(CharSequence charSequence) {
        this.f9657d = charSequence;
        if ((this.f9655b & 8) != 0) {
            this.f9654a.mo1204c(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo11067b(int i) {
        this.f9654a.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo11068b(CharSequence charSequence) {
        if (!this.f9665l) {
            m5856c(charSequence);
        }
    }

    /* renamed from: a */
    public final C0328kd mo11062a(int i, long j) {
        float f;
        C0328kd a = C0315jm.m4606a(this.f9654a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return a.mo9758a(f).mo9759a(j).mo9760a(new C0842vs(this, i));
    }

    /* renamed from: b */
    private final void m5854b() {
        if ((this.f9655b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f9667n)) {
            CharSequence text;
            Toolbar toolbar = this.f9654a;
            int i = this.f9668o;
            if (i != 0) {
                text = toolbar.getContext().getText(i);
            } else {
                text = null;
            }
            toolbar.mo1199a(text);
            return;
        }
        this.f9654a.mo1199a(this.f9667n);
    }

    /* renamed from: c */
    private final void m5855c() {
        if ((this.f9655b & 4) != 0) {
            Toolbar toolbar = this.f9654a;
            Drawable drawable = this.f9664k;
            if (drawable == null) {
                drawable = this.f9669p;
            }
            toolbar.mo1201b(drawable);
            return;
        }
        this.f9654a.mo1201b(null);
    }

    /* renamed from: d */
    private final void m5857d() {
        Drawable drawable;
        int i = this.f9655b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f9663j;
            if (drawable == null) {
                drawable = this.f9662i;
            }
        } else {
            drawable = this.f9662i;
        }
        this.f9654a.mo1197a(drawable);
    }
}
