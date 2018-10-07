package p000;

import android.content.Context;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.support.p002v7.app.AlertController;
import android.support.p002v7.app.AlertController.RecycleListView;
import android.support.p002v7.view.menu.ExpandedMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: om */
public final class C0733om implements OnItemClickListener, C0410pe {
    /* renamed from: a */
    public LayoutInflater f22168a;
    /* renamed from: b */
    public C0734op f22169b;
    /* renamed from: c */
    public ExpandedMenuView f22170c;
    /* renamed from: d */
    public int f22171d;
    /* renamed from: e */
    public C0411pf f22172e;
    /* renamed from: f */
    public C0404on f22173f;
    /* renamed from: g */
    private Context f22174g;

    private C0733om(int i) {
        this.f22171d = R.layout.abc_list_menu_item_layout;
    }

    public C0733om(Context context) {
        this((int) R.layout.abc_list_menu_item_layout);
        this.f22174g = context;
        this.f22168a = LayoutInflater.from(this.f22174g);
    }

    /* renamed from: a */
    public final boolean mo10851a(C0736ot c0736ot) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo10853b(C0736ot c0736ot) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo10850a() {
        return false;
    }

    /* renamed from: b */
    public final ListAdapter mo14290b() {
        if (this.f22173f == null) {
            this.f22173f = new C0404on(this);
        }
        return this.f22173f;
    }

    /* renamed from: a */
    public final void mo10846a(Context context, C0734op c0734op) {
        if (this.f22174g != null) {
            this.f22174g = context;
            if (this.f22168a == null) {
                this.f22168a = LayoutInflater.from(this.f22174g);
            }
        }
        this.f22169b = c0734op;
        C0404on c0404on = this.f22173f;
        if (c0404on != null) {
            c0404on.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo10847a(C0734op c0734op, boolean z) {
        C0411pf c0411pf = this.f22172e;
        if (c0411pf != null) {
            c0411pf.mo10854a(c0734op, z);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f22169b.mo14299a(this.f22173f.getItem(i), (C0410pe) this, 0);
    }

    /* renamed from: a */
    public final boolean mo10852a(C0835pn c0835pn) {
        if (!c0835pn.hasVisibleItems()) {
            return false;
        }
        C0735os c0735os = new C0735os(c0835pn);
        C0734op c0734op = c0735os.f22200a;
        C0368mc c0368mc = new C0368mc(c0734op.f22176a);
        c0735os.f22202c = new C0733om(c0368mc.f9191a.f9178a);
        C0410pe c0410pe = c0735os.f22202c;
        c0410pe.f22172e = c0735os;
        c0735os.f22200a.mo14296a(c0410pe);
        ListAdapter b = c0735os.f22202c.mo14290b();
        C0363lx c0363lx = c0368mc.f9191a;
        c0363lx.f9185h = b;
        c0363lx.f9186i = c0735os;
        View view = c0734op.f22183h;
        if (view == null) {
            c0363lx.f9180c = c0734op.f22182g;
            c0363lx.f9181d = c0734op.f22181f;
        } else {
            c0363lx.f9182e = view;
        }
        c0363lx.f9184g = c0735os;
        C0822mb c0822mb = new C0822mb(c0363lx.f9178a, c0368mc.f9192b);
        c0363lx = c0368mc.f9191a;
        AlertController alertController = c0822mb.f25373a;
        View view2 = c0363lx.f9182e;
        if (view2 == null) {
            CharSequence charSequence = c0363lx.f9181d;
            if (charSequence != null) {
                alertController.mo1087a(charSequence);
            }
            Drawable drawable = c0363lx.f9180c;
            if (drawable != null) {
                alertController.f622j = drawable;
                ImageView imageView = alertController.f623k;
                if (imageView != null) {
                    if (drawable != null) {
                        imageView.setVisibility(0);
                        alertController.f623k.setImageDrawable(drawable);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }
        } else {
            alertController.f626n = view2;
        }
        if (c0363lx.f9185h != null) {
            RecycleListView recycleListView = (RecycleListView) c0363lx.f9179b.inflate(alertController.f630r, null);
            int i = alertController.f631s;
            ListAdapter listAdapter = c0363lx.f9185h;
            if (listAdapter == null) {
                listAdapter = new C0367ma(c0363lx.f9178a, i);
            }
            alertController.f627o = listAdapter;
            alertController.f628p = c0363lx.f9187j;
            if (c0363lx.f9186i != null) {
                recycleListView.setOnItemClickListener(new C0364ly(c0363lx, alertController));
            }
            alertController.f617e = recycleListView;
        }
        c0822mb.setCancelable(c0368mc.f9191a.f9183f);
        if (c0368mc.f9191a.f9183f) {
            c0822mb.setCanceledOnTouchOutside(true);
        }
        c0822mb.setOnCancelListener(null);
        c0822mb.setOnDismissListener(null);
        OnKeyListener onKeyListener = c0368mc.f9191a.f9184g;
        if (onKeyListener != null) {
            c0822mb.setOnKeyListener(onKeyListener);
        }
        c0735os.f22201b = c0822mb;
        c0735os.f22201b.setOnDismissListener(c0735os);
        LayoutParams attributes = c0735os.f22201b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        c0735os.f22201b.show();
        C0411pf c0411pf = this.f22172e;
        if (c0411pf != null) {
            c0411pf.mo10855a(c0835pn);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo10848a(C0411pf c0411pf) {
        this.f22172e = c0411pf;
    }

    /* renamed from: a */
    public final void mo10849a(boolean z) {
        C0404on c0404on = this.f22173f;
        if (c0404on != null) {
            c0404on.notifyDataSetChanged();
        }
    }
}
