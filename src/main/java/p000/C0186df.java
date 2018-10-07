package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: df */
public class C0186df {
    /* renamed from: a */
    public final WeakReference f3227a;
    /* renamed from: b */
    public int f3228b;
    /* renamed from: c */
    public boolean f3229c;

    /* renamed from: a */
    public static void m1645a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: a */
    public static int m1624a(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public static Animator m1630a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, float f) {
        return C0186df.m1631a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* renamed from: a */
    public static Animator m1631a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        int next;
        int depth = xmlPullParser.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    Object obj;
                    if (name.equals("objectAnimator")) {
                        animator = C0186df.m1634a(context, resources, theme, attributeSet, f, xmlPullParser);
                        obj = null;
                    } else if (name.equals("animator")) {
                        animator = C0186df.m1639a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                        obj = null;
                    } else if (name.equals("set")) {
                        Animator animatorSet2 = new AnimatorSet();
                        TypedArray a = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3414f);
                        C0186df.m1631a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, C0723na.m14394b(a, xmlPullParser, "ordering", 0, 0), f);
                        a.recycle();
                        obj = null;
                        animator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a2 = C0186df.m1654a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (a2 == null) {
                            obj = 1;
                        } else if (animator == null) {
                            obj = 1;
                        } else if (animator instanceof ValueAnimator) {
                            ((ValueAnimator) animator).setValues(a2);
                            obj = 1;
                        } else {
                            obj = 1;
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown animator name: ");
                        stringBuilder.append(xmlPullParser.getName());
                        throw new RuntimeException(stringBuilder.toString());
                    }
                    if (animatorSet != null && obj == null) {
                        ArrayList arrayList2;
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                        } else {
                            arrayList2 = arrayList;
                        }
                        arrayList2.add(animator);
                        arrayList = arrayList2;
                    }
                }
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size = arrayList.size();
            next = 0;
            int i2 = 0;
            while (next < size) {
                int i3 = i2 + 1;
                int i4 = next + 1;
                animatorArr[i2] = (Animator) arrayList.get(next);
                next = i4;
                i2 = i3;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animator;
    }

    /* renamed from: a */
    public static Interpolator m1642a(Context context, XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return interpolator;
            }
            if (next == 2) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                String name = xmlPullParser.getName();
                if (name.equals("linearInterpolator")) {
                    interpolator = new LinearInterpolator();
                } else if (name.equals("accelerateInterpolator")) {
                    interpolator = new AccelerateInterpolator(context, asAttributeSet);
                } else if (name.equals("decelerateInterpolator")) {
                    interpolator = new DecelerateInterpolator(context, asAttributeSet);
                } else if (name.equals("accelerateDecelerateInterpolator")) {
                    interpolator = new AccelerateDecelerateInterpolator();
                } else if (name.equals("cycleInterpolator")) {
                    interpolator = new CycleInterpolator(context, asAttributeSet);
                } else if (name.equals("anticipateInterpolator")) {
                    interpolator = new AnticipateInterpolator(context, asAttributeSet);
                } else if (name.equals("overshootInterpolator")) {
                    interpolator = new OvershootInterpolator(context, asAttributeSet);
                } else if (name.equals("anticipateOvershootInterpolator")) {
                    interpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                } else if (name.equals("bounceInterpolator")) {
                    interpolator = new BounceInterpolator();
                } else if (name.equals("pathInterpolator")) {
                    interpolator = new C0199du(context, asAttributeSet, xmlPullParser);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown interpolator name: ");
                    stringBuilder.append(xmlPullParser.getName());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
        return interpolator;
    }

    /* renamed from: a */
    public static Keyframe m1632a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: a */
    public static void m1651a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    public static ColorStateList m1640a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0383nj.m5681a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m1655b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = C0383nj.m5682b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: a */
    public static C0230fn m1643a(ViewGroup viewGroup) {
        return new C0230fn(viewGroup);
    }

    /* renamed from: a */
    public static PropertyValuesHolder m1637a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            i = (peekValue == null || !C0186df.m1653a(i4)) ? peekValue2 != null ? !C0186df.m1653a(i5) ? 0 : 3 : 0 : 3;
        }
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C0438qt[] a = C0437qr.m5798a(string);
            C0438qt[] a2 = C0437qr.m5798a(string2);
            if (a == null && a2 == null) {
                return null;
            }
            if (a != null) {
                TypeEvaluator c0197ds = new C0197ds();
                if (a2 == null) {
                    return PropertyValuesHolder.ofObject(str, c0197ds, new Object[]{a});
                } else if (C0437qr.m5796a(a, a2)) {
                    return PropertyValuesHolder.ofObject(str, c0197ds, new Object[]{a, a2});
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(" Can't morph from ");
                    stringBuilder.append(string);
                    stringBuilder.append(" to ");
                    stringBuilder.append(string2);
                    throw new InflateException(stringBuilder.toString());
                }
            } else if (a2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new C0197ds(), new Object[]{a2});
            }
        }
        TypeEvaluator typeEvaluator;
        PropertyValuesHolder ofFloat;
        if (i != 3) {
            typeEvaluator = null;
        } else {
            Object typeEvaluator2 = C0198dt.f3507a;
        }
        if (i == 0) {
            float dimension;
            if (peekValue != null) {
                float dimension2;
                if (i4 == 5) {
                    dimension2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i2, 0.0f);
                }
                if (peekValue2 != null) {
                    if (i5 == 5) {
                        dimension = typedArray.getDimension(i3, 0.0f);
                    } else {
                        dimension = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2, dimension});
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2});
                }
            } else {
                if (i5 == 5) {
                    dimension = typedArray.getDimension(i3, 0.0f);
                } else {
                    dimension = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
            }
        } else if (peekValue != null) {
            int dimension3;
            if (i4 == 5) {
                dimension3 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (C0186df.m1653a(i4)) {
                dimension3 = typedArray.getColor(i2, 0);
            } else {
                dimension3 = typedArray.getInt(i2, 0);
            }
            if (peekValue2 != null) {
                if (i5 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (C0186df.m1653a(i5)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{dimension3, i4});
            } else {
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{dimension3});
            }
        } else if (peekValue2 != null) {
            if (i5 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (C0186df.m1653a(i5)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            ofFloat = PropertyValuesHolder.ofInt(str, new int[]{i4});
        } else {
            ofFloat = null;
        }
        if (ofFloat == null || typeEvaluator2 == null) {
            return ofFloat;
        }
        ofFloat.setEvaluator(typeEvaluator2);
        return ofFloat;
    }

    /* renamed from: a */
    public static int m1626a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(5);
        int i3;
        if (peekValue != null) {
            i3 = peekValue.type;
        } else {
            i3 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(6);
        int i4;
        if (peekValue2 != null) {
            i4 = peekValue2.type;
        } else {
            i4 = 0;
        }
        if (peekValue != null && C0186df.m1653a(i3)) {
            return 3;
        }
        if (peekValue2 == null || !C0186df.m1653a(i4)) {
            return 0;
        }
        return 3;
    }

    /* renamed from: a */
    public static int m1625a(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int i = 0;
        TypedArray a = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3416h);
        TypedValue a2 = C0723na.m14392a(a, xmlPullParser, "value");
        if (a2 != null && C0186df.m1653a(a2.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    public static boolean m1653a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    static boolean m1652a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Animator m1627a(Context context, int i) {
        return AnimatorInflater.loadAnimator(context, i);
    }

    /* renamed from: a */
    public static Animator m1628a(Context context, Resources resources, Theme theme, int i) {
        return C0186df.m1629a(context, resources, theme, i, 1.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* renamed from: a */
    public static android.animation.Animator m1629a(android.content.Context r6, android.content.res.Resources r7, android.content.res.Resources.Theme r8, int r9, float r10) {
        /*
        r0 = 0;
        r0 = r7.getAnimation(r9);	 Catch:{ XmlPullParserException -> 0x0011, IOException -> 0x003d, all -> 0x006e }
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = p000.C0186df.m1630a(r6, r7, r8, r0, r1);	 Catch:{ XmlPullParserException -> 0x0064, IOException -> 0x0069, all -> 0x0070 }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        r0.close();
    L_0x0010:
        return r1;
    L_0x0011:
        r1 = move-exception;
        r5 = r0;
        r0 = r1;
        r1 = r5;
    L_0x0015:
        r2 = new android.content.res.Resources$NotFoundException;	 Catch:{ all -> 0x0033 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0033 }
        r3.<init>();	 Catch:{ all -> 0x0033 }
        r4 = "Can't load animation resource ID #0x";
        r3.append(r4);	 Catch:{ all -> 0x0033 }
        r4 = java.lang.Integer.toHexString(r9);	 Catch:{ all -> 0x0033 }
        r3.append(r4);	 Catch:{ all -> 0x0033 }
        r3 = r3.toString();	 Catch:{ all -> 0x0033 }
        r2.<init>(r3);	 Catch:{ all -> 0x0033 }
        r2.initCause(r0);	 Catch:{ all -> 0x0033 }
        throw r2;	 Catch:{ all -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x0037:
        if (r0 == 0) goto L_0x003c;
    L_0x0039:
        r0.close();
    L_0x003c:
        throw r1;
    L_0x003d:
        r1 = move-exception;
        r5 = r0;
        r0 = r1;
        r1 = r5;
    L_0x0041:
        r2 = new android.content.res.Resources$NotFoundException;	 Catch:{ all -> 0x005f }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005f }
        r3.<init>();	 Catch:{ all -> 0x005f }
        r4 = "Can't load animation resource ID #0x";
        r3.append(r4);	 Catch:{ all -> 0x005f }
        r4 = java.lang.Integer.toHexString(r9);	 Catch:{ all -> 0x005f }
        r3.append(r4);	 Catch:{ all -> 0x005f }
        r3 = r3.toString();	 Catch:{ all -> 0x005f }
        r2.<init>(r3);	 Catch:{ all -> 0x005f }
        r2.initCause(r0);	 Catch:{ all -> 0x005f }
        throw r2;	 Catch:{ all -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0037;
    L_0x0064:
        r1 = move-exception;
        r5 = r0;
        r0 = r1;
        r1 = r5;
        goto L_0x0015;
    L_0x0069:
        r1 = move-exception;
        r5 = r0;
        r0 = r1;
        r1 = r5;
        goto L_0x0041;
    L_0x006e:
        r1 = move-exception;
        goto L_0x0037;
    L_0x0070:
        r1 = move-exception;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: df.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    public static ValueAnimator m1639a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3413e);
        TypedArray a2 = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3417i);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        C0186df.m1648a(valueAnimator, a, a2, f, xmlPullParser);
        int a3 = C0723na.m14389a(a, xmlPullParser, "interpolator", 0);
        if (a3 > 0) {
            valueAnimator.setInterpolator(C0186df.m1656b(context, a3));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: b */
    public static Interpolator m1656b(Context context, int i) {
        return AnimationUtils.loadInterpolator(context, i);
    }

    /* renamed from: a */
    public static Keyframe m1633a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        int i2;
        Keyframe ofFloat;
        TypedArray a = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3416h);
        float a2 = C0723na.m14388a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue a3 = C0723na.m14392a(a, xmlPullParser, "value");
        if (a3 == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i == 4) {
            if (i2 == 0) {
                i = 0;
            } else if (C0186df.m1653a(a3.type)) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (i2 != 0) {
            switch (i) {
                case 0:
                    ofFloat = Keyframe.ofFloat(a2, C0723na.m14388a(a, xmlPullParser, "value", 0, 0.0f));
                    break;
                case 1:
                case 3:
                    ofFloat = Keyframe.ofInt(a2, C0723na.m14394b(a, xmlPullParser, "value", 0, 0));
                    break;
                default:
                    ofFloat = null;
                    break;
            }
        } else if (i == 0) {
            ofFloat = Keyframe.ofFloat(a2);
        } else {
            ofFloat = Keyframe.ofInt(a2);
        }
        int a4 = C0723na.m14389a(a, xmlPullParser, "interpolator", 1);
        if (a4 > 0) {
            ofFloat.setInterpolator(C0186df.m1656b(context, a4));
        }
        a.recycle();
        return ofFloat;
    }

    /* renamed from: a */
    public static ObjectAnimator m1634a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ValueAnimator objectAnimator = new ObjectAnimator();
        C0186df.m1639a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: a */
    public static android.animation.PropertyValuesHolder m1636a(android.content.Context r10, android.content.res.Resources r11, android.content.res.Resources.Theme r12, org.xmlpull.v1.XmlPullParser r13, java.lang.String r14, int r15) {
        /*
        r6 = 0;
        r4 = r15;
    L_0x0002:
        r0 = r13.next();
        r1 = 3;
        if (r0 == r1) goto L_0x0046;
    L_0x0009:
        r1 = 1;
        if (r0 == r1) goto L_0x0046;
    L_0x000c:
        r0 = r13.getName();
        r1 = "keyframe";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0044;
    L_0x0018:
        r0 = 4;
        if (r4 != r0) goto L_0x0023;
    L_0x001b:
        r0 = android.util.Xml.asAttributeSet(r13);
        r4 = p000.C0186df.m1625a(r11, r12, r0, r13);
    L_0x0023:
        r3 = android.util.Xml.asAttributeSet(r13);
        r0 = r10;
        r1 = r11;
        r2 = r12;
        r5 = r13;
        r1 = p000.C0186df.m1633a(r0, r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0042;
    L_0x0031:
        if (r6 != 0) goto L_0x0040;
    L_0x0033:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0038:
        r0.add(r1);
    L_0x003b:
        r13.next();
    L_0x003e:
        r6 = r0;
        goto L_0x0002;
    L_0x0040:
        r0 = r6;
        goto L_0x0038;
    L_0x0042:
        r0 = r6;
        goto L_0x003b;
    L_0x0044:
        r0 = r6;
        goto L_0x003e;
    L_0x0046:
        if (r6 == 0) goto L_0x0105;
    L_0x0048:
        r2 = r6.size();
        if (r2 <= 0) goto L_0x0103;
    L_0x004e:
        r0 = 0;
        r0 = r6.get(r0);
        r0 = (android.animation.Keyframe) r0;
        r1 = r2 + -1;
        r1 = r6.get(r1);
        r1 = (android.animation.Keyframe) r1;
        r3 = r1.getFraction();
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r5 >= 0) goto L_0x0100;
    L_0x0067:
        r5 = 0;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 >= 0) goto L_0x00ef;
    L_0x006c:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.setFraction(r3);
        r1 = r2;
    L_0x0072:
        r2 = r0.getFraction();
        r3 = 0;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 == 0) goto L_0x0084;
    L_0x007b:
        r3 = 0;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x00e3;
    L_0x0080:
        r2 = 0;
        r0.setFraction(r2);
    L_0x0084:
        r5 = new android.animation.Keyframe[r1];
        r6.toArray(r5);
        r0 = 0;
    L_0x008a:
        if (r0 >= r1) goto L_0x00d5;
    L_0x008c:
        r2 = r5[r0];
        r3 = r2.getFraction();
        r6 = 0;
        r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r3 >= 0) goto L_0x009d;
    L_0x0097:
        if (r0 != 0) goto L_0x00a0;
    L_0x0099:
        r3 = 0;
        r2.setFraction(r3);
    L_0x009d:
        r0 = r0 + 1;
        goto L_0x008a;
    L_0x00a0:
        r6 = r1 + -1;
        if (r0 != r6) goto L_0x00aa;
    L_0x00a4:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2.setFraction(r3);
        goto L_0x009d;
    L_0x00aa:
        r2 = r0 + 1;
        r3 = r0;
    L_0x00ad:
        if (r2 >= r6) goto L_0x00c0;
    L_0x00af:
        r7 = r5[r2];
        r7 = r7.getFraction();
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x00c0;
    L_0x00ba:
        r3 = r2 + 1;
        r9 = r3;
        r3 = r2;
        r2 = r9;
        goto L_0x00ad;
    L_0x00c0:
        r2 = r3 + 1;
        r2 = r5[r2];
        r2 = r2.getFraction();
        r6 = r0 + -1;
        r6 = r5[r6];
        r6 = r6.getFraction();
        r2 = r2 - r6;
        p000.C0186df.m1651a(r5, r2, r0, r3);
        goto L_0x009d;
    L_0x00d5:
        r0 = android.animation.PropertyValuesHolder.ofKeyframe(r14, r5);
        r1 = 3;
        if (r4 == r1) goto L_0x00dd;
    L_0x00dc:
        return r0;
    L_0x00dd:
        r1 = p000.C0198dt.f3507a;
        r0.setEvaluator(r1);
        goto L_0x00dc;
    L_0x00e3:
        r2 = 0;
        r3 = 0;
        r0 = p000.C0186df.m1632a(r0, r3);
        r6.add(r2, r0);
        r1 = r1 + 1;
        goto L_0x0084;
    L_0x00ef:
        r3 = r6.size();
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = p000.C0186df.m1632a(r1, r5);
        r6.add(r3, r1);
        r1 = r2 + 1;
        goto L_0x0072;
    L_0x0100:
        r1 = r2;
        goto L_0x0072;
    L_0x0103:
        r0 = 0;
        goto L_0x00dc;
    L_0x0105:
        r0 = 0;
        goto L_0x00dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: df.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* renamed from: a */
    public static android.animation.PropertyValuesHolder[] m1654a(android.content.Context r8, android.content.res.Resources r9, android.content.res.Resources.Theme r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12) {
        /*
        r6 = 0;
    L_0x0001:
        r0 = r11.getEventType();
        r1 = 3;
        if (r0 == r1) goto L_0x005e;
    L_0x0008:
        r1 = 1;
        if (r0 == r1) goto L_0x005e;
    L_0x000b:
        r1 = 2;
        if (r0 == r1) goto L_0x0012;
    L_0x000e:
        r11.next();
        goto L_0x0001;
    L_0x0012:
        r0 = r11.getName();
        r1 = "propertyValuesHolder";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0054;
    L_0x001e:
        r0 = p000.C0196dr.f3415g;
        r7 = p000.C0723na.m14391a(r9, r10, r12, r0);
        r0 = "propertyName";
        r1 = 3;
        r4 = p000.C0723na.m14395b(r7, r11, r0, r1);
        r0 = "valueType";
        r1 = 2;
        r2 = 4;
        r5 = p000.C0723na.m14394b(r7, r11, r0, r1, r2);
        r0 = r8;
        r1 = r9;
        r2 = r10;
        r3 = r11;
        r0 = p000.C0186df.m1636a(r0, r1, r2, r3, r4, r5);
        if (r0 != 0) goto L_0x005c;
    L_0x003d:
        r0 = 0;
        r1 = 1;
        r0 = p000.C0186df.m1637a(r7, r5, r0, r1, r4);
        r1 = r0;
    L_0x0044:
        if (r1 == 0) goto L_0x005a;
    L_0x0046:
        if (r6 != 0) goto L_0x0058;
    L_0x0048:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x004d:
        r0.add(r1);
    L_0x0050:
        r7.recycle();
        r6 = r0;
    L_0x0054:
        r11.next();
        goto L_0x0001;
    L_0x0058:
        r0 = r6;
        goto L_0x004d;
    L_0x005a:
        r0 = r6;
        goto L_0x0050;
    L_0x005c:
        r1 = r0;
        goto L_0x0044;
    L_0x005e:
        if (r6 == 0) goto L_0x0078;
    L_0x0060:
        r3 = r6.size();
        r1 = new android.animation.PropertyValuesHolder[r3];
        r0 = 0;
        r2 = r0;
    L_0x0068:
        if (r2 >= r3) goto L_0x0076;
    L_0x006a:
        r0 = r6.get(r2);
        r0 = (android.animation.PropertyValuesHolder) r0;
        r1[r2] = r0;
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0068;
    L_0x0076:
        r0 = r1;
    L_0x0077:
        return r0;
    L_0x0078:
        r0 = 0;
        goto L_0x0077;
        */
        throw new UnsupportedOperationException("Method not decompiled: df.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    /* renamed from: a */
    public static PropertyValuesHolder m1638a(Property property, Path path) {
        return PropertyValuesHolder.ofObject(property, null, path);
    }

    /* renamed from: a */
    public static ObjectAnimator m1635a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, null, path);
    }

    public void onCleared() {
    }

    /* renamed from: b */
    public static void m1657b() {
        throw new NoSuchMethodError();
    }

    /* renamed from: c */
    public static void m1659c() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static void m1648a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long b = (long) C0723na.m14394b(typedArray, xmlPullParser, "duration", 1, VideoProviderSource.TIMESTAMP_FILTER_SIZE);
        long b2 = (long) C0723na.m14394b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int b3 = C0723na.m14394b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C0723na.m14393a(xmlPullParser, "valueFrom") && C0723na.m14393a(xmlPullParser, "valueTo")) {
            if (b3 == 4) {
                b3 = C0186df.m1626a(typedArray, 5, 6);
            }
            if (C0186df.m1637a(typedArray, b3, 5, 6, "") != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{C0186df.m1637a(typedArray, b3, 5, 6, "")});
            }
        }
        valueAnimator.setDuration(b);
        valueAnimator.setStartDelay(b2);
        valueAnimator.setRepeatCount(C0723na.m14394b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C0723na.m14394b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            C0186df.m1647a(valueAnimator, typedArray2, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    public static Mode m1641a(int i, Mode mode) {
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

    /* renamed from: a */
    public static void m1644a(Animator animator) {
        animator.pause();
    }

    /* renamed from: a */
    public static void m1646a(AnimatorSet animatorSet, List list) {
        Animator animator;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        animator = ValueAnimator.ofInt(new int[]{0, 0});
        animator.setDuration(j);
        list.add(0, animator);
        animatorSet.playTogether(list);
    }

    /* renamed from: b */
    public static void m1658b(Animator animator) {
        animator.resume();
    }

    /* renamed from: a */
    public static void m1647a(ValueAnimator valueAnimator, TypedArray typedArray, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String b = C0723na.m14395b(typedArray, xmlPullParser, "pathData", 1);
        if (b != null) {
            String b2 = C0723na.m14395b(typedArray, xmlPullParser, "propertyXName", 2);
            String b3 = C0723na.m14395b(typedArray, xmlPullParser, "propertyYName", 3);
            if (b2 == null && b3 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(stringBuilder.toString());
            }
            C0186df.m1649a(C0437qr.m5800b(b), objectAnimator, 0.5f * f, b2, b3);
            return;
        }
        objectAnimator.setPropertyName(C0723na.m14395b(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    public static void m1649a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofFloat2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        f2 = 0.0f;
        while (i2 < min) {
            int i3;
            pathMeasure2.getPosTan(f2, fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            float f4 = f2 + f3;
            int i4 = i + 1;
            if (i4 >= arrayList.size()) {
                f2 = f4;
                i3 = i;
            } else if (f4 > ((Float) arrayList.get(i4)).floatValue()) {
                f2 = f4 - ((Float) arrayList.get(i4)).floatValue();
                pathMeasure2.nextContour();
                i3 = i4;
            } else {
                f2 = f4;
                i3 = i;
            }
            i2++;
            i = i3;
        }
        if (str != null) {
            ofFloat = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            ofFloat = null;
        }
        if (str2 != null) {
            ofFloat2 = PropertyValuesHolder.ofFloat(str2, fArr2);
        } else {
            ofFloat2 = null;
        }
        if (ofFloat == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat2});
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat, ofFloat2});
        }
    }

    /* renamed from: a */
    public static void m1650a(ViewGroup viewGroup, boolean z) {
        if (!C0216eu.f4462b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                C0216eu.f4461a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            C0216eu.f4462b = true;
        }
        if (C0216eu.f4461a != null) {
            try {
                C0216eu.f4461a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (Throwable e22) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e22);
            }
        }
    }
}
