package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: qm */
public class C0432qm extends Button {
    /* renamed from: a */
    private final C0431ql f9564a;
    /* renamed from: b */
    private final C0454rm f9565b;

    public C0432qm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public C0432qm(Context context, AttributeSet attributeSet, int i) {
        super(C0538vh.m6106a(context), attributeSet, i);
        this.f9564a = new C0431ql(this);
        this.f9564a.mo10909a(attributeSet, i);
        this.f9565b = new C0454rm(this);
        this.f9565b.mo11016a(attributeSet, i);
        this.f9565b.mo11014a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0431ql c0431ql = this.f9564a;
        if (c0431ql != null) {
            c0431ql.mo10907a();
        }
        C0454rm c0454rm = this.f9565b;
        if (c0454rm != null) {
            c0454rm.mo11014a();
        }
    }

    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() != 1 ? 0 : 1;
    }

    /* renamed from: a */
    public ColorStateList mo10911a() {
        C0431ql c0431ql = this.f9564a;
        if (c0431ql == null) {
            return null;
        }
        C0539vi c0539vi = c0431ql.f9558a;
        if (c0539vi != null) {
            return c0539vi.f9922a;
        }
        return null;
    }

    /* renamed from: b */
    public Mode mo10914b() {
        C0431ql c0431ql = this.f9564a;
        if (c0431ql == null) {
            return null;
        }
        C0539vi c0539vi = c0431ql.f9558a;
        if (c0539vi != null) {
            return c0539vi.f9923b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0431ql c0431ql = this.f9564a;
        if (c0431ql != null) {
            c0431ql.mo10910b();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0431ql c0431ql = this.f9564a;
        if (c0431ql != null) {
            c0431ql.mo10908a(i);
        }
    }

    /* renamed from: a */
    public void mo10912a(ColorStateList colorStateList) {
        C0431ql c0431ql = this.f9564a;
        if (c0431ql != null) {
            if (c0431ql.f9558a == null) {
                c0431ql.f9558a = new C0539vi();
            }
            C0539vi c0539vi = c0431ql.f9558a;
            c0539vi.f9922a = colorStateList;
            c0539vi.f9925d = true;
            c0431ql.mo10907a();
        }
    }

    /* renamed from: a */
    public void mo10913a(Mode mode) {
        C0431ql c0431ql = this.f9564a;
        if (c0431ql != null) {
            if (c0431ql.f9558a == null) {
                c0431ql.f9558a = new C0539vi();
            }
            C0539vi c0539vi = c0431ql.f9558a;
            c0539vi.f9923b = mode;
            c0539vi.f9924c = true;
            c0431ql.mo10907a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0454rm c0454rm = this.f9565b;
        if (c0454rm != null) {
            c0454rm.mo11015a(context, i);
        }
    }
}
