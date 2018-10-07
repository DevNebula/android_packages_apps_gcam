package p000;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jm */
public final class C0315jm {
    /* renamed from: a */
    private static WeakHashMap f8285a = null;
    /* renamed from: b */
    private static Field f8286b;
    /* renamed from: c */
    private static boolean f8287c = false;

    static {
        AtomicInteger atomicInteger = new AtomicInteger(1);
    }

    /* renamed from: a */
    public static C0328kd m4606a(View view) {
        if (f8285a == null) {
            f8285a = new WeakHashMap();
        }
        C0328kd c0328kd = (C0328kd) f8285a.get(view);
        if (c0328kd != null) {
            return c0328kd;
        }
        c0328kd = new C0328kd(view);
        f8285a.put(view, c0328kd);
        return c0328kd;
    }

    /* renamed from: a */
    public static C0333kj m4607a(View view, C0333kj c0333kj) {
        Object obj = (WindowInsets) C0333kj.m5034a(c0333kj);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(obj);
        if (dispatchApplyWindowInsets != obj) {
            obj = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0333kj.m5035a(obj);
    }

    /* renamed from: a */
    public static boolean m4621a() {
        return false;
    }

    /* renamed from: b */
    public static boolean m4625b() {
        return false;
    }

    /* renamed from: b */
    public static ColorStateList m4622b(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: c */
    public static Mode m4626c(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: d */
    public static Rect m4628d(View view) {
        return view.getClipBounds();
    }

    /* renamed from: e */
    public static Display m4630e(View view) {
        return view.getDisplay();
    }

    /* renamed from: f */
    public static float m4631f(View view) {
        return view.getElevation();
    }

    /* renamed from: g */
    public static boolean m4632g(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: h */
    public static int m4633h(View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: i */
    public static int m4634i(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: j */
    public static int m4635j(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: k */
    public static int m4636k(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: l */
    public static int m4637l(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: m */
    public static int m4638m(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: n */
    public static int m4639n(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: o */
    public static ViewParent m4640o(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: p */
    public static String m4641p(View view) {
        return view.getTransitionName();
    }

    /* renamed from: q */
    public static int m4642q(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: r */
    public static float m4643r(View view) {
        return view.getZ();
    }

    /* renamed from: s */
    public static boolean m4644s(View view) {
        if (f8287c) {
            return false;
        }
        if (f8286b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f8286b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable th) {
                f8287c = true;
                return false;
            }
        }
        try {
            if (f8286b.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            f8287c = true;
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m4645t(View view) {
        return view.hasOnClickListeners();
    }

    /* renamed from: u */
    public static boolean m4646u(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: v */
    public static boolean m4647v(View view) {
        return view.hasTransientState();
    }

    /* renamed from: w */
    public static boolean m4648w(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: x */
    public static boolean m4649x(View view) {
        return view.isLaidOut();
    }

    /* renamed from: y */
    public static boolean m4650y(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: z */
    public static boolean m4651z(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: a */
    public static void m4609a(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* renamed from: b */
    public static void m4624b(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: b */
    public static C0333kj m4623b(View view, C0333kj c0333kj) {
        Object obj = (WindowInsets) C0333kj.m5034a(c0333kj);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
        if (onApplyWindowInsets != obj) {
            obj = new WindowInsets(onApplyWindowInsets);
        }
        return C0333kj.m5035a(obj);
    }

    /* renamed from: A */
    public static void m4601A(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: a */
    public static void m4615a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m4616a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: B */
    public static void m4602B(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: a */
    public static void m4618a(View view, C0306jd c0306jd) {
        AccessibilityDelegate accessibilityDelegate;
        if (c0306jd == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = c0306jd.f8083b;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: a */
    public static void m4614a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static void m4611a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m4612a(View view, Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: a */
    public static void m4613a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: a */
    public static void m4608a(View view, float f) {
        view.setElevation(f);
    }

    @Deprecated
    /* renamed from: C */
    public static void m4603C(View view) {
        view.setFitsSystemWindows(true);
    }

    /* renamed from: a */
    public static void m4620a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* renamed from: c */
    public static void m4627c(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: D */
    public static void m4604D(View view) {
        view.setImportantForAutofill(8);
    }

    /* renamed from: a */
    public static void m4619a(View view, C0313jk c0313jk) {
        if (c0313jk == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new C0316jn(c0313jk));
        }
    }

    /* renamed from: a */
    public static void m4610a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: d */
    public static void m4629d(View view, int i) {
        view.setScrollIndicators(i, 3);
    }

    /* renamed from: a */
    public static void m4617a(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: E */
    public static void m4605E(View view) {
        view.stopNestedScroll();
    }
}
