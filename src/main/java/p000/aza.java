package p000;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aza */
public final class aza implements ayx {
    /* renamed from: d */
    private static Integer f11065d;
    /* renamed from: a */
    public final View f11066a;
    /* renamed from: b */
    public final List f11067b;
    /* renamed from: c */
    public aqu f11068c;

    public aza(View view) {
        this.f11067b = new ArrayList();
        this.f11066a = view;
    }

    /* renamed from: a */
    public final void mo12340a() {
        ViewTreeObserver viewTreeObserver = this.f11066a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f11068c);
        }
        this.f11068c = null;
        this.f11067b.clear();
    }

    /* renamed from: a */
    private final int m7260a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        i4 = i - i3;
        if (i4 > 0) {
            return i4;
        }
        if (this.f11066a.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("ViewTarget", 4)) {
            Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = this.f11066a.getContext();
        if (f11065d == null) {
            Display defaultDisplay = ((WindowManager) aqe.m610a((WindowManager) context.getSystemService("window"), "Argument must not be null")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f11065d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f11065d.intValue();
    }

    /* renamed from: b */
    public final int mo12341b() {
        int i;
        int paddingBottom = this.f11066a.getPaddingBottom() + this.f11066a.getPaddingTop();
        LayoutParams layoutParams = this.f11066a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return m7260a(this.f11066a.getHeight(), i, paddingBottom);
    }

    /* renamed from: c */
    public final int mo12342c() {
        int i;
        int paddingRight = this.f11066a.getPaddingRight() + this.f11066a.getPaddingLeft();
        LayoutParams layoutParams = this.f11066a.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return m7260a(this.f11066a.getWidth(), i, paddingRight);
    }

    /* renamed from: a */
    private static boolean m7261a(int i) {
        return i > 0 || i == kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: a */
    public static boolean m7262a(int i, int i2) {
        return aza.m7261a(i) && aza.m7261a(i2);
    }

    /* renamed from: a */
    public final ayv mo1861a(axp axp) {
        return new axy();
    }
}
