package android.support.design.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.DepthmapTask;
import p000.C0315jm;
import p000.C0440qv;
import p000.C0648ch;

/* compiled from: PG */
public class CheckableImageButton extends C0440qv implements Checkable {
    /* renamed from: a */
    private static final int[] f10460a = new int[]{16842912};
    /* renamed from: b */
    private boolean f10461b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0315jm.m4618a((View) this, new C0648ch(this));
    }

    public boolean isChecked() {
        return this.f10461b;
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f10461b) {
            return mergeDrawableStates(super.onCreateDrawableState(f10460a.length + i), f10460a);
        }
        return super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f10461b != z) {
            this.f10461b = z;
            refreshDrawableState();
            sendAccessibilityEvent(DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        }
    }

    public void toggle() {
        setChecked(this.f10461b ^ 1);
    }
}
