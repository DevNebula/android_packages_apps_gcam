package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.google.android.apps.refocus.processing.DepthmapTask;

/* compiled from: PG */
/* renamed from: kk */
public final class C0334kk {
    /* renamed from: a */
    public final AccessibilityNodeInfo f8693a;

    private C0334kk(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f8693a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public final void mo10079a(int i) {
        this.f8693a.addAction(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C0334kk c0334kk = (C0334kk) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8693a;
        if (accessibilityNodeInfo == null) {
            if (c0334kk.f8693a != null) {
                return false;
            }
            return true;
        } else if (accessibilityNodeInfo.equals(c0334kk.f8693a)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo10080a(Rect rect) {
        this.f8693a.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public final void mo10086b(Rect rect) {
        this.f8693a.getBoundsInScreen(rect);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8693a;
        return accessibilityNodeInfo != null ? accessibilityNodeInfo.hashCode() : 0;
    }

    /* renamed from: a */
    public final boolean mo10085a(C0335kl c0335kl) {
        return this.f8693a.removeAction((AccessibilityAction) c0335kl.f8696c);
    }

    /* renamed from: a */
    public final void mo10084a(boolean z) {
        this.f8693a.setCheckable(z);
    }

    /* renamed from: a */
    public final void mo10082a(CharSequence charSequence) {
        this.f8693a.setClassName(charSequence);
    }

    /* renamed from: a */
    public final void mo10083a(Object obj) {
        CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8693a;
        if (obj != null) {
            collectionItemInfo = (CollectionItemInfo) ((C0337kn) obj).f8727a;
        } else {
            collectionItemInfo = null;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: b */
    public final void mo10087b(boolean z) {
        this.f8693a.setFocusable(z);
    }

    /* renamed from: c */
    public final void mo10088c(boolean z) {
        this.f8693a.setFocused(z);
    }

    /* renamed from: a */
    public final void mo10081a(View view) {
        this.f8693a.setParent(view);
    }

    /* renamed from: d */
    public final void mo10089d(boolean z) {
        this.f8693a.setScrollable(z);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        mo10080a(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        mo10086b(rect);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.f8693a.getPackageName());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.f8693a.getClassName());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.f8693a.getText());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.f8693a.getContentDescription());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(this.f8693a.getViewIdResourceName());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.f8693a.isCheckable());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.f8693a.isChecked());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.f8693a.isFocusable());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.f8693a.isFocused());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.f8693a.isSelected());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.f8693a.isClickable());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.f8693a.isLongClickable());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.f8693a.isEnabled());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.f8693a.isPassword());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; scrollable: ");
        stringBuilder3.append(this.f8693a.isScrollable());
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; [");
        int actions = this.f8693a.getActions();
        while (actions != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            int i = (numberOfTrailingZeros ^ -1) & actions;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case 32:
                    str = "ACTION_LONG_CLICK";
                    break;
                case 64:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case DepthmapTask.MAX_REFERENCE_SIZE_HR_PX /*2048*/:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            stringBuilder.append(str);
            if (i != 0) {
                stringBuilder.append(", ");
                actions = i;
            } else {
                actions = i;
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static C0334kk m5042a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0334kk(accessibilityNodeInfo);
    }
}
