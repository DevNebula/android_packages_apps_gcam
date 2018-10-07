package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* compiled from: PG */
/* renamed from: gvr */
public final class gvr {
    /* renamed from: a */
    private final AccessibilityManager f6081a;

    public gvr(AccessibilityManager accessibilityManager) {
        this.f6081a = accessibilityManager;
    }

    /* renamed from: a */
    public final boolean mo7468a() {
        if (!this.f6081a.isTouchExplorationEnabled()) {
            Object obj;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f6081a.getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList != null) {
                for (AccessibilityServiceInfo id : enabledAccessibilityServiceList) {
                    String id2 = id.getId();
                    if (id2 != null && !id2.startsWith("com.google.android.apps.userpanel") && id2.startsWith("com.google")) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
            } else {
                obj = null;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
}
