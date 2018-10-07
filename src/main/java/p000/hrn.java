package p000;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: hrn */
final class hrn implements OnLayoutChangeListener {
    /* renamed from: a */
    private final /* synthetic */ ImageView f6876a;
    /* renamed from: b */
    private final /* synthetic */ hrm f6877b;

    hrn(hrm hrm, ImageView imageView) {
        this.f6877b = hrm;
        this.f6876a = imageView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f6877b.mo13560a(this.f6876a, -10.0f);
    }
}
