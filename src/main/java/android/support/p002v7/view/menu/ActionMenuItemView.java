package android.support.p002v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import p000.C0382ni;
import p000.C0398oc;
import p000.C0407or;
import p000.C0413ph;
import p000.C0426qf;
import p000.C0455rn;
import p000.C0480sp;
import p000.C0729ob;
import p000.C0736ot;
import p000.kvl;

/* compiled from: PG */
/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends C0455rn implements OnClickListener, C0413ph, C0426qf {
    /* renamed from: a */
    public C0736ot f10512a;
    /* renamed from: b */
    public C0407or f10513b;
    /* renamed from: c */
    public C0398oc f10514c;
    /* renamed from: d */
    private CharSequence f10515d;
    /* renamed from: e */
    private Drawable f10516e;
    /* renamed from: f */
    private C0480sp f10517f;
    /* renamed from: g */
    private boolean f10518g;
    /* renamed from: h */
    private int f10519h;
    /* renamed from: i */
    private int f10520i;
    /* renamed from: j */
    private int f10521j;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f10518g = m6833f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0382ni.f9428v, i, 0);
        this.f10519h = obtainStyledAttributes.getDimensionPixelSize(C0382ni.f9429w, 0);
        obtainStyledAttributes.recycle();
        this.f10521j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f10520i = -1;
        setSaveEnabled(false);
    }

    /* renamed from: a */
    public final C0736ot mo10857a() {
        return this.f10512a;
    }

    /* renamed from: c */
    public final boolean mo12083c() {
        return TextUtils.isEmpty(getText()) ^ 1;
    }

    /* renamed from: a */
    public final void mo10858a(C0736ot c0736ot) {
        int i;
        this.f10512a = c0736ot;
        Drawable icon = c0736ot.getIcon();
        this.f10516e = icon;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            i = this.f10521j;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicHeight = (int) ((((float) i) / ((float) intrinsicHeight)) * ((float) intrinsicWidth));
            } else {
                i = intrinsicHeight;
                intrinsicHeight = intrinsicWidth;
            }
            icon.setBounds(0, 0, intrinsicHeight, i);
        }
        setCompoundDrawables(icon, null, null, null);
        m6834g();
        this.f10515d = c0736ot.mo14346a((C0413ph) this);
        m6834g();
        setId(c0736ot.getItemId());
        if (c0736ot.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(c0736ot.isEnabled());
        if (c0736ot.hasSubMenu() && this.f10517f == null) {
            this.f10517f = new C0729ob(this);
        }
    }

    /* renamed from: d */
    public final boolean mo10890d() {
        return mo12083c();
    }

    /* renamed from: e */
    public final boolean mo10891e() {
        return mo12083c() && this.f10512a.getIcon() == null;
    }

    public void onClick(View view) {
        C0407or c0407or = this.f10513b;
        if (c0407or != null) {
            c0407or.mo10836a(this.f10512a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10518g = m6833f();
        m6834g();
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        boolean c = mo12083c();
        if (c) {
            i3 = this.f10520i;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        i3 = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == kvl.UNSET_ENUM_VALUE) {
            i3 = Math.min(i3, this.f10519h);
        } else {
            i3 = this.f10519h;
        }
        if (mode != 1073741824 && this.f10519h > 0 && measuredWidth < i3) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!c && this.f10516e != null) {
            super.setPadding((getMeasuredWidth() - this.f10516e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10512a.hasSubMenu()) {
            C0480sp c0480sp = this.f10517f;
            if (c0480sp != null && c0480sp.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final boolean mo10859b() {
        return true;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f10520i = i;
        super.setPadding(i, i2, i3, i4);
    }

    /* renamed from: f */
    private final boolean m6833f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || ((i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2);
    }

    /* renamed from: g */
    private final void m6834g() {
        CharSequence charSequence;
        int i = 0;
        CharSequence charSequence2 = null;
        int isEmpty = TextUtils.isEmpty(this.f10515d) ^ 1;
        if (this.f10516e == null) {
            i = 1;
        } else if ((this.f10512a.f22210e & 4) == 4 && this.f10518g) {
            i = 1;
        }
        int i2 = isEmpty & i;
        if (i2 != 0) {
            charSequence = this.f10515d;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        charSequence = this.f10512a.getContentDescription();
        if (TextUtils.isEmpty(charSequence)) {
            if (i2 == 0) {
                charSequence = this.f10512a.getTitle();
            } else {
                charSequence = null;
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(charSequence);
        }
        charSequence = this.f10512a.getTooltipText();
        if (TextUtils.isEmpty(charSequence)) {
            if (i2 == 0) {
                charSequence2 = this.f10512a.getTitle();
            }
            setTooltipText(charSequence2);
            return;
        }
        setTooltipText(charSequence);
    }
}
