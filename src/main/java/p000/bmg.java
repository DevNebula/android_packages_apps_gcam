package p000;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

/* compiled from: PG */
/* renamed from: bmg */
public final class bmg extends CheckBoxPreference {
    /* renamed from: a */
    public boolean f1340a;

    public bmg(Context context, String str) {
        super(context);
        setKey(str);
        setTitle(str);
    }

    /* renamed from: a */
    private final CheckBox m912a(View view) {
        if (view instanceof CheckBox) {
            return (CheckBox) view;
        }
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            for (int i = 0; i < childCount; i++) {
                CheckBox a = m912a(((ViewGroup) view).getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    protected final void onBindView(View view) {
        super.onBindView(view);
        if (!isEnabled()) {
            CheckBox a = m912a(view);
            if (this.f1340a) {
                if (a != null) {
                    a.setChecked(true);
                }
            } else if (a != null) {
                a.setChecked(false);
            }
        }
    }
}
