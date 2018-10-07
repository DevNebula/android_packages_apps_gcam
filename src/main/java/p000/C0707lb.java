package p000;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* renamed from: lb */
final class C0707lb extends C0306jd {
    /* renamed from: c */
    private final Rect f22027c = new Rect();
    /* renamed from: d */
    private final /* synthetic */ C0345kz f22028d;

    C0707lb(C0345kz c0345kz) {
        this.f22028d = c0345kz;
    }

    /* renamed from: b */
    public final boolean mo9328b(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.mo9328b(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        View b = this.f22028d.mo10579b();
        if (b != null) {
            Gravity.getAbsoluteGravity(this.f22028d.mo10581c(b), C0315jm.m4635j(this.f22028d));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo9324a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo9324a(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0345kz.class.getName());
    }

    /* renamed from: a */
    public final void mo9325a(View view, C0334kk c0334kk) {
        if (C0345kz.f9112b) {
            super.mo9325a(view, c0334kk);
        } else {
            C0334kk a = C0334kk.m5042a(AccessibilityNodeInfo.obtain(c0334kk.f8693a));
            super.mo9325a(view, a);
            c0334kk.f8693a.setSource(view);
            ViewParent o = C0315jm.m4640o(view);
            if (o instanceof View) {
                c0334kk.mo10081a((View) o);
            }
            Rect rect = this.f22027c;
            a.mo10080a(rect);
            c0334kk.f8693a.setBoundsInParent(rect);
            a.mo10086b(rect);
            c0334kk.f8693a.setBoundsInScreen(rect);
            c0334kk.f8693a.setVisibleToUser(a.f8693a.isVisibleToUser());
            c0334kk.f8693a.setPackageName(a.f8693a.getPackageName());
            c0334kk.mo10082a(a.f8693a.getClassName());
            c0334kk.f8693a.setContentDescription(a.f8693a.getContentDescription());
            c0334kk.f8693a.setEnabled(a.f8693a.isEnabled());
            c0334kk.f8693a.setClickable(a.f8693a.isClickable());
            c0334kk.mo10087b(a.f8693a.isFocusable());
            c0334kk.mo10088c(a.f8693a.isFocused());
            c0334kk.f8693a.setAccessibilityFocused(a.f8693a.isAccessibilityFocused());
            c0334kk.f8693a.setSelected(a.f8693a.isSelected());
            c0334kk.f8693a.setLongClickable(a.f8693a.isLongClickable());
            c0334kk.mo10079a(a.f8693a.getActions());
            a.f8693a.recycle();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C0345kz.m5548e(childAt)) {
                    c0334kk.f8693a.addChild(childAt);
                }
            }
        }
        c0334kk.mo10082a(C0345kz.class.getName());
        c0334kk.mo10087b(false);
        c0334kk.mo10088c(false);
        c0334kk.mo10085a(C0335kl.f8694a);
        c0334kk.mo10085a(C0335kl.f8695b);
    }

    /* renamed from: a */
    public final boolean mo9327a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return (C0345kz.f9112b || C0345kz.m5548e(view)) ? super.mo9327a(viewGroup, view, accessibilityEvent) : false;
    }
}
