package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: dm */
public final class C0192dm extends MarginLayoutParams {
    /* renamed from: a */
    public C0189dj f3337a;
    /* renamed from: b */
    public boolean f3338b = false;
    /* renamed from: c */
    public int f3339c = 0;
    /* renamed from: d */
    public int f3340d = 0;
    /* renamed from: e */
    public int f3341e = -1;
    /* renamed from: f */
    public int f3342f = -1;
    /* renamed from: g */
    public int f3343g = 0;
    /* renamed from: h */
    public int f3344h = 0;
    /* renamed from: i */
    public int f3345i;
    /* renamed from: j */
    public int f3346j;
    /* renamed from: k */
    public View f3347k;
    /* renamed from: l */
    public View f3348l;
    /* renamed from: m */
    public boolean f3349m;
    /* renamed from: n */
    public boolean f3350n;
    /* renamed from: o */
    public final Rect f3351o = new Rect();
    /* renamed from: p */
    private boolean f3352p;
    /* renamed from: q */
    private boolean f3353q;

    public C0192dm() {
        super(-2, -2);
    }

    public C0192dm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0046ar.f923b);
        this.f3339c = obtainStyledAttributes.getInteger(C0046ar.f924c, 0);
        this.f3342f = obtainStyledAttributes.getResourceId(C0046ar.f925d, -1);
        this.f3340d = obtainStyledAttributes.getInteger(C0046ar.f926e, 0);
        this.f3341e = obtainStyledAttributes.getInteger(C0046ar.f930i, -1);
        this.f3343g = obtainStyledAttributes.getInt(C0046ar.f929h, 0);
        this.f3344h = obtainStyledAttributes.getInt(C0046ar.f928g, 0);
        this.f3338b = obtainStyledAttributes.hasValue(C0046ar.f927f);
        if (this.f3338b) {
            this.f3337a = CoordinatorLayout.m6777a(context, attributeSet, obtainStyledAttributes.getString(C0046ar.f927f));
        }
        obtainStyledAttributes.recycle();
        C0189dj c0189dj = this.f3337a;
        if (c0189dj != null) {
            c0189dj.mo5978a(this);
        }
    }

    public C0192dm(C0192dm c0192dm) {
        super(c0192dm);
    }

    public C0192dm(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0192dm(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    /* renamed from: a */
    public final boolean mo6019a(int i) {
        switch (i) {
            case 0:
                return this.f3352p;
            case 1:
                return this.f3353q;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final void mo6018a(C0189dj c0189dj) {
        if (this.f3337a != c0189dj) {
            this.f3337a = c0189dj;
            this.f3338b = true;
            if (c0189dj != null) {
                c0189dj.mo5978a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo6017a(int i, boolean z) {
        switch (i) {
            case 0:
                this.f3352p = z;
                return;
            case 1:
                this.f3353q = z;
                return;
            default:
                return;
        }
    }
}
