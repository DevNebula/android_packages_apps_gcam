package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: rc */
public final class C0447rc extends RatingBar {
    /* renamed from: a */
    private final C0445ra f9608a;

    public C0447rc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private C0447rc(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        this.f9608a = new C0445ra(this);
        this.f9608a.mo10968a(attributeSet, (int) R.attr.ratingBarStyle);
    }

    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f9608a.f9604a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
