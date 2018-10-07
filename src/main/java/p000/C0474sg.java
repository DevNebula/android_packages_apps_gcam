package p000;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.ScaleDrawable;

/* compiled from: PG */
/* renamed from: sg */
public final class C0474sg {
    static {
        Rect rect = new Rect();
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    /* renamed from: a */
    public static boolean m5868a(Drawable drawable) {
        Drawable drawable2 = drawable;
        while (!(drawable2 instanceof DrawableContainer)) {
            if (!(drawable2 instanceof C0264he)) {
                if (!(drawable2 instanceof C0384nk)) {
                    if (!(drawable2 instanceof ScaleDrawable)) {
                        break;
                    }
                    drawable2 = ((ScaleDrawable) drawable2).getDrawable();
                } else {
                    drawable2 = ((C0384nk) drawable2).f9433d;
                }
            } else {
                drawable2 = ((C0264he) drawable2).mo7759a();
            }
        }
        ConstantState constantState = drawable2.getConstantState();
        if (constantState instanceof DrawableContainerState) {
            for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                if (!C0474sg.m5868a(a)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    static void m5867a() {
    }

    /* renamed from: a */
    public static Mode m5866a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
