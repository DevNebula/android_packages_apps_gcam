package p000;

import android.os.Bundle;
import android.support.p001v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* compiled from: PG */
/* renamed from: lk */
public final class C0712lk extends C0306jd {
    /* renamed from: a */
    public final void mo9324a(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.mo9324a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.mo12033a() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.mo12033a());
    }

    /* renamed from: a */
    public final void mo9325a(View view, C0334kk c0334kk) {
        super.mo9325a(view, c0334kk);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        c0334kk.mo10082a(ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            int a = nestedScrollView.mo12033a();
            if (a > 0) {
                c0334kk.mo10089d(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c0334kk.mo10079a(8192);
                }
                if (nestedScrollView.getScrollY() < a) {
                    c0334kk.mo10079a(4096);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo9326a(View view, int i, Bundle bundle) {
        if (super.mo9326a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height;
        int paddingBottom;
        switch (i) {
            case 4096:
                height = nestedScrollView.getHeight();
                paddingBottom = nestedScrollView.getPaddingBottom();
                height = Math.min(((height - paddingBottom) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.mo12033a());
                if (height == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo12034a(height);
                return true;
            case 8192:
                height = nestedScrollView.getHeight();
                paddingBottom = nestedScrollView.getPaddingBottom();
                height = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (height == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo12034a(height);
                return true;
            default:
                return false;
        }
    }
}
