package p000;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* renamed from: jd */
public class C0306jd {
    /* renamed from: a */
    public static final AccessibilityDelegate f8082a = new AccessibilityDelegate();
    /* renamed from: b */
    public final AccessibilityDelegate f8083b = new C0307je(this);

    /* renamed from: b */
    public boolean mo9328b(View view, AccessibilityEvent accessibilityEvent) {
        return f8082a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo9324a(View view, AccessibilityEvent accessibilityEvent) {
        f8082a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo9325a(View view, C0334kk c0334kk) {
        f8082a.onInitializeAccessibilityNodeInfo(view, c0334kk.f8693a);
    }

    /* renamed from: a */
    public boolean mo9327a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f8082a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo9326a(View view, int i, Bundle bundle) {
        return f8082a.performAccessibilityAction(view, i, bundle);
    }

    /* renamed from: a */
    public static void m4470a(View view, int i) {
        f8082a.sendAccessibilityEvent(view, i);
    }
}
