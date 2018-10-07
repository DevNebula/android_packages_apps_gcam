package android.support.p002v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p001v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import p000.C0362lw;
import p000.C0365lz;
import p000.C0382ni;
import p000.C0720mv;

/* compiled from: PG */
/* renamed from: android.support.v7.app.AlertController */
public final class AlertController {
    /* renamed from: a */
    public final Context f613a;
    /* renamed from: b */
    public final C0720mv f614b;
    /* renamed from: c */
    public final Window f615c;
    /* renamed from: d */
    public CharSequence f616d;
    /* renamed from: e */
    public ListView f617e;
    /* renamed from: f */
    public Button f618f;
    /* renamed from: g */
    public Button f619g;
    /* renamed from: h */
    public Button f620h;
    /* renamed from: i */
    public NestedScrollView f621i;
    /* renamed from: j */
    public Drawable f622j;
    /* renamed from: k */
    public ImageView f623k;
    /* renamed from: l */
    public TextView f624l;
    /* renamed from: m */
    public TextView f625m;
    /* renamed from: n */
    public View f626n;
    /* renamed from: o */
    public ListAdapter f627o;
    /* renamed from: p */
    public int f628p = -1;
    /* renamed from: q */
    public int f629q;
    /* renamed from: r */
    public int f630r;
    /* renamed from: s */
    public int f631s;
    /* renamed from: t */
    public boolean f632t;
    /* renamed from: u */
    public Handler f633u;
    /* renamed from: v */
    public final OnClickListener f634v = new C0362lw(this);

    /* compiled from: PG */
    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public class RecycleListView extends ListView {
        /* renamed from: a */
        public final int f611a;
        /* renamed from: b */
        public final int f612b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9331bK);
            this.f612b = obtainStyledAttributes.getDimensionPixelOffset(C0382ni.f9332bL, -1);
            this.f611a = obtainStyledAttributes.getDimensionPixelOffset(C0382ni.f9333bM, -1);
        }
    }

    public AlertController(Context context, C0720mv c0720mv, Window window) {
        this.f613a = context;
        this.f614b = c0720mv;
        this.f615c = window;
        this.f633u = new C0365lz(c0720mv);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0382ni.f9244D, R.attr.alertDialogStyle, 0);
        this.f629q = obtainStyledAttributes.getResourceId(C0382ni.f9245E, 0);
        obtainStyledAttributes.getResourceId(C0382ni.f9247G, 0);
        this.f630r = obtainStyledAttributes.getResourceId(C0382ni.f9249I, 0);
        obtainStyledAttributes.getResourceId(C0382ni.f9250J, 0);
        obtainStyledAttributes.getResourceId(C0382ni.f9252L, 0);
        this.f631s = obtainStyledAttributes.getResourceId(C0382ni.f9248H, 0);
        this.f632t = obtainStyledAttributes.getBoolean(C0382ni.f9251K, true);
        obtainStyledAttributes.getDimensionPixelSize(C0382ni.f9246F, 0);
        obtainStyledAttributes.recycle();
        c0720mv.mo14231a().mo10679b(1);
    }

    /* renamed from: a */
    public static void m433a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public static ViewGroup m432a(View view, View view2) {
        View inflate;
        if (view == null) {
            if (view2 instanceof ViewStub) {
                inflate = ((ViewStub) view2).inflate();
            } else {
                inflate = view2;
            }
            return (ViewGroup) inflate;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            inflate = ((ViewStub) view).inflate();
        } else {
            inflate = view;
        }
        return (ViewGroup) inflate;
    }

    /* renamed from: a */
    public final void mo1087a(CharSequence charSequence) {
        this.f616d = charSequence;
        TextView textView = this.f624l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
