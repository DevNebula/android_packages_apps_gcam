package p000;

import android.content.Context;
import android.preference.Preference;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dzn */
final class dzn extends Preference {
    /* renamed from: a */
    private final /* synthetic */ int f3607a;
    /* renamed from: b */
    private final /* synthetic */ int f3608b;

    dzn(Context context, int i, int i2) {
        this.f3607a = i;
        this.f3608b = i2;
        super(context);
    }

    protected final void onBindView(View view) {
        super.onBindView(view);
        if (this.f3607a == this.f3608b) {
            view.setBackgroundResource(R.drawable.rounded_rect_grey_bottom_inset);
        } else {
            view.setBackgroundResource(R.drawable.rounded_rect_grey_middle_inset);
        }
    }
}
