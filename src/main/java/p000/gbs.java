package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gbs */
public final class gbs extends TextView {
    /* renamed from: a */
    private final Typeface f5268a = Typeface.defaultFromStyle(0);
    /* renamed from: b */
    private final Typeface f5269b = Typeface.create("sans-serif-medium", 0);
    /* renamed from: c */
    private boolean f5270c;
    /* renamed from: d */
    private hil f5271d;
    /* renamed from: e */
    private int f5272e;

    public gbs(Context context, int i, int i2) {
        super(context, null, 0, R.style.detailed_expanded_option);
        CharSequence string = context.getResources().getString(i2);
        if (string != null) {
            setText(string);
        }
        if (i != 0) {
            Drawable drawable = getResources().getDrawable(i, null);
            this.f5272e = drawable.getIntrinsicHeight();
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            setCompoundDrawablesRelative(null, drawable, null, null);
        }
    }

    public final boolean isSelected() {
        return this.f5270c;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5271d = new hil(this);
        this.f5271d.mo7883a();
    }

    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5271d.mo7884b();
    }

    protected final void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        if (getLineHeight() > 0 && size > 0) {
            setMaxLines((size - this.f5272e) / getLineHeight());
        }
        super.onMeasure(i, i2);
        size = ((MeasureSpec.getSize(i2) - ((getLineCount() * getLineHeight()) + this.f5272e)) / 2) - 5;
        setPadding(0, size, 0, size);
    }

    public final void setSelected(boolean z) {
        this.f5270c = z;
        if (z) {
            setAlpha(1.0f);
            setTypeface(this.f5269b);
            return;
        }
        setAlpha(0.5f);
        setTypeface(this.f5268a);
    }
}
