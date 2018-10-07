package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: od */
public abstract class C0730od implements C0410pe {
    /* renamed from: a */
    public Context f22156a;
    /* renamed from: b */
    public Context f22157b;
    /* renamed from: c */
    public C0734op f22158c;
    /* renamed from: d */
    public C0411pf f22159d;
    /* renamed from: e */
    public C0412pg f22160e;
    /* renamed from: f */
    private LayoutInflater f22161f;
    /* renamed from: g */
    private int f22162g = R.layout.abc_action_menu_layout;
    /* renamed from: h */
    private int f22163h = R.layout.abc_action_menu_item_layout;

    public C0730od(Context context) {
        this.f22156a = context;
        this.f22161f = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public abstract void mo14285a(C0736ot c0736ot, C0413ph c0413ph);

    /* renamed from: a */
    public final boolean mo10851a(C0736ot c0736ot) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo10853b(C0736ot c0736ot) {
        return false;
    }

    /* renamed from: a */
    public boolean mo14286a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo10850a() {
        return false;
    }

    /* renamed from: a */
    public View mo14283a(C0736ot c0736ot, View view, ViewGroup viewGroup) {
        C0413ph c0413ph;
        if (view instanceof C0413ph) {
            c0413ph = (C0413ph) view;
        } else {
            c0413ph = (C0413ph) this.f22161f.inflate(this.f22163h, viewGroup, false);
        }
        mo14285a(c0736ot, c0413ph);
        return (View) c0413ph;
    }

    /* renamed from: a */
    public C0412pg mo14284a(ViewGroup viewGroup) {
        if (this.f22160e == null) {
            this.f22160e = (C0412pg) this.f22161f.inflate(this.f22162g, viewGroup, false);
            this.f22160e.mo10856a(this.f22158c);
            mo10849a(true);
        }
        return this.f22160e;
    }

    /* renamed from: a */
    public void mo10846a(Context context, C0734op c0734op) {
        this.f22157b = context;
        LayoutInflater.from(this.f22157b);
        this.f22158c = c0734op;
    }

    /* renamed from: a */
    public void mo10847a(C0734op c0734op, boolean z) {
        C0411pf c0411pf = this.f22159d;
        if (c0411pf != null) {
            c0411pf.mo10854a(c0734op, z);
        }
    }

    /* renamed from: a */
    public boolean mo10852a(C0835pn c0835pn) {
        C0411pf c0411pf = this.f22159d;
        return c0411pf != null ? c0411pf.mo10855a(c0835pn) : false;
    }

    /* renamed from: a */
    public final void mo10848a(C0411pf c0411pf) {
        this.f22159d = c0411pf;
    }

    /* renamed from: c */
    public boolean mo14287c(C0736ot c0736ot) {
        return true;
    }

    /* renamed from: a */
    public void mo10849a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f22160e;
        if (viewGroup != null) {
            int i;
            C0734op c0734op = this.f22158c;
            if (c0734op != null) {
                c0734op.mo14292a();
                ArrayList e = this.f22158c.mo14321e();
                int size = e.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    C0736ot c0736ot = (C0736ot) e.get(i2);
                    if (mo14287c(c0736ot)) {
                        C0736ot a;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof C0413ph) {
                            a = ((C0413ph) childAt).mo10857a();
                        } else {
                            a = null;
                        }
                        View a2 = mo14283a(c0736ot, childAt, viewGroup);
                        if (c0736ot != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f22160e).addView(a2, i);
                        }
                        i3 = i + 1;
                    } else {
                        i3 = i;
                    }
                    i2++;
                    i = i3;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo14286a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }
}
