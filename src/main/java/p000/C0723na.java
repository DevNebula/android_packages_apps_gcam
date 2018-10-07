package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: na */
public final class C0723na implements C0406oq {
    /* renamed from: a */
    public final C0437qr[] f22094a;

    public C0723na(C0437qr[] c0437qrArr) {
        this.f22094a = c0437qrArr;
    }

    /* renamed from: a */
    public static int m14390a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0723na.m14393a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static float m14388a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !C0723na.m14393a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static int m14394b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0723na.m14393a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static int m14389a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (C0723na.m14393a(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    /* renamed from: b */
    public static String m14395b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (C0723na.m14393a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m14393a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static TypedArray m14391a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public final boolean mo10834a(C0734op c0734op, MenuItem menuItem) {
        return false;
    }

    /* renamed from: m */
    public final void mo10835m() {
    }

    /* renamed from: a */
    public static TypedValue m14392a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (C0723na.m14393a(xmlPullParser, str)) {
            return typedArray.peekValue(0);
        }
        return null;
    }
}
