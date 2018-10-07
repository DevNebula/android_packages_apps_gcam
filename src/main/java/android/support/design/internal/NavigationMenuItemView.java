package android.support.design.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import p000.C0306jd;
import p000.C0315jm;
import p000.C0413ph;
import p000.C0487sz;
import p000.C0650cl;
import p000.C0651cm;
import p000.C0736ot;

/* compiled from: PG */
public class NavigationMenuItemView extends C0650cl implements C0413ph {
    /* renamed from: b */
    private static final int[] f22490b = new int[]{16842912};
    /* renamed from: a */
    public boolean f22491a;
    /* renamed from: c */
    private final int f22492c;
    /* renamed from: h */
    private final CheckedTextView f22493h;
    /* renamed from: i */
    private FrameLayout f22494i;
    /* renamed from: j */
    private C0736ot f22495j;
    /* renamed from: k */
    private final C0306jd f22496k;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22496k = new C0651cm(this);
        mo11122c(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.f22492c = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        this.f22493h = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f22493h.setDuplicateParentStateEnabled(true);
        C0315jm.m4618a(this.f22493h, this.f22496k);
    }

    /* renamed from: a */
    public final C0736ot mo10857a() {
        return this.f22495j;
    }

    /* renamed from: a */
    public final void mo10858a(C0736ot c0736ot) {
        int i;
        Drawable stateListDrawable;
        this.f22495j = c0736ot;
        if (c0736ot.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f22490b, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C0315jm.m4614a((View) this, stateListDrawable);
        }
        boolean isCheckable = c0736ot.isCheckable();
        refreshDrawableState();
        if (this.f22491a != isCheckable) {
            this.f22491a = isCheckable;
            C0306jd.m4470a(this.f22493h, (int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        }
        isCheckable = c0736ot.isChecked();
        refreshDrawableState();
        this.f22493h.setChecked(isCheckable);
        setEnabled(c0736ot.isEnabled());
        this.f22493h.setText(c0736ot.getTitle());
        stateListDrawable = c0736ot.getIcon();
        if (stateListDrawable != null) {
            int i2 = this.f22492c;
            stateListDrawable.setBounds(0, 0, i2, i2);
        }
        this.f22493h.setCompoundDrawablesRelative(stateListDrawable, null, null, null);
        View actionView = c0736ot.getActionView();
        if (actionView != null) {
            if (this.f22494i == null) {
                this.f22494i = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f22494i.removeAllViews();
            this.f22494i.addView(actionView);
        }
        setContentDescription(c0736ot.getContentDescription());
        setTooltipText(c0736ot.getTooltipText());
        if (this.f22495j.getTitle() != null) {
            isCheckable = false;
        } else if (this.f22495j.getIcon() != null) {
            isCheckable = false;
        } else if (this.f22495j.getActionView() != null) {
            isCheckable = true;
        } else {
            isCheckable = false;
        }
        FrameLayout frameLayout;
        C0487sz c0487sz;
        if (isCheckable) {
            this.f22493h.setVisibility(8);
            frameLayout = this.f22494i;
            if (frameLayout != null) {
                c0487sz = (C0487sz) frameLayout.getLayoutParams();
                c0487sz.width = -1;
                this.f22494i.setLayoutParams(c0487sz);
                return;
            }
            return;
        }
        this.f22493h.setVisibility(0);
        frameLayout = this.f22494i;
        if (frameLayout != null) {
            c0487sz = (C0487sz) frameLayout.getLayoutParams();
            c0487sz.width = -2;
            this.f22494i.setLayoutParams(c0487sz);
        }
    }

    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0736ot c0736ot = this.f22495j;
        if (c0736ot != null && c0736ot.isCheckable() && this.f22495j.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f22490b);
        }
        return onCreateDrawableState;
    }

    /* renamed from: b */
    public final boolean mo10859b() {
        return false;
    }
}
