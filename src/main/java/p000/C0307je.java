package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: PG */
/* renamed from: je */
final class C0307je extends AccessibilityDelegate {
    /* renamed from: a */
    private final C0306jd f8103a;

    C0307je(C0306jd c0306jd) {
        this.f8103a = c0306jd;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f8103a.mo9328b(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0338ko c0338ko;
        AccessibilityNodeProvider accessibilityNodeProvider = C0306jd.f8082a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            c0338ko = new C0338ko(accessibilityNodeProvider);
        } else {
            c0338ko = null;
        }
        if (c0338ko == null) {
            return null;
        }
        return (AccessibilityNodeProvider) c0338ko.f8751a;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f8103a.mo9324a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f8103a.mo9325a(view, C0334kk.m5042a(accessibilityNodeInfo));
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C0306jd.f8082a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f8103a.mo9327a(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f8103a.mo9326a(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        C0306jd.m4470a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C0306jd.f8082a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
