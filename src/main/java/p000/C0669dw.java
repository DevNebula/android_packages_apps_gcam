package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: dw */
public final class C0669dw extends C0200dv {
    /* renamed from: b */
    public static final Mode f16878b = Mode.SRC_IN;
    /* renamed from: c */
    private C0205ec f16879c;
    /* renamed from: d */
    private PorterDuffColorFilter f16880d;
    /* renamed from: e */
    private ColorFilter f16881e;
    /* renamed from: f */
    private boolean f16882f;
    /* renamed from: g */
    private boolean f16883g;
    /* renamed from: h */
    private final float[] f16884h;
    /* renamed from: i */
    private final Matrix f16885i;
    /* renamed from: j */
    private final Rect f16886j;

    public C0669dw() {
        this.f16883g = true;
        this.f16884h = new float[9];
        this.f16885i = new Matrix();
        this.f16886j = new Rect();
        this.f16879c = new C0205ec();
    }

    C0669dw(C0205ec c0205ec) {
        this.f16883g = true;
        this.f16884h = new float[9];
        this.f16885i = new Matrix();
        this.f16886j = new Rect();
        this.f16879c = c0205ec;
        this.f16880d = m9645a(c0205ec.f3729c, c0205ec.f3730d);
    }

    /* renamed from: a */
    static int m9644a(int i, float f) {
        return (16777215 & i) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public final boolean canApplyTheme() {
        if (this.f3523a != null) {
            this.f3523a.canApplyTheme();
        }
        return false;
    }

    /* JADX WARNING: Missing block: B:61:0x0163, code:
            if (r1 == false) goto L_0x00b4;
     */
    public final void draw(android.graphics.Canvas r12) {
        /*
        r11 = this;
        r10 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        r9 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 1;
        r5 = 0;
        r0 = r11.f3523a;
        if (r0 == 0) goto L_0x0011;
    L_0x000b:
        r0 = r11.f3523a;
        r0.draw(r12);
    L_0x0010:
        return;
    L_0x0011:
        r0 = r11.f16886j;
        r11.copyBounds(r0);
        r0 = r11.f16886j;
        r0 = r0.width();
        if (r0 <= 0) goto L_0x0010;
    L_0x001e:
        r0 = r11.f16886j;
        r0 = r0.height();
        if (r0 <= 0) goto L_0x0010;
    L_0x0026:
        r0 = r11.f16881e;
        if (r0 != 0) goto L_0x002c;
    L_0x002a:
        r0 = r11.f16880d;
    L_0x002c:
        r1 = r11.f16885i;
        r12.getMatrix(r1);
        r1 = r11.f16885i;
        r3 = r11.f16884h;
        r1.getValues(r3);
        r1 = r11.f16884h;
        r1 = r1[r5];
        r3 = java.lang.Math.abs(r1);
        r1 = r11.f16884h;
        r6 = 4;
        r1 = r1[r6];
        r1 = java.lang.Math.abs(r1);
        r6 = r11.f16884h;
        r6 = r6[r4];
        r6 = java.lang.Math.abs(r6);
        r7 = r11.f16884h;
        r8 = 3;
        r7 = r7[r8];
        r7 = java.lang.Math.abs(r7);
        r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r6 != 0) goto L_0x0177;
    L_0x005e:
        r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r6 == 0) goto L_0x0064;
    L_0x0062:
        r1 = r2;
        r3 = r2;
    L_0x0064:
        r6 = r11.f16886j;
        r6 = r6.width();
        r7 = r11.f16886j;
        r7 = r7.height();
        r6 = (float) r6;
        r3 = r3 * r6;
        r3 = (int) r3;
        r3 = java.lang.Math.min(r10, r3);
        r6 = (float) r7;
        r1 = r1 * r6;
        r1 = (int) r1;
        r6 = java.lang.Math.min(r10, r1);
        if (r3 <= 0) goto L_0x0010;
    L_0x0080:
        if (r6 <= 0) goto L_0x0010;
    L_0x0082:
        r7 = r12.save();
        r1 = r11.f16886j;
        r8 = r1.left;
        r8 = (float) r8;
        r1 = r1.top;
        r1 = (float) r1;
        r12.translate(r8, r1);
        r1 = r11.isAutoMirrored();
        if (r1 != 0) goto L_0x016b;
    L_0x0097:
        r1 = r5;
    L_0x0098:
        if (r1 == 0) goto L_0x00a9;
    L_0x009a:
        r1 = r11.f16886j;
        r1 = r1.width();
        r1 = (float) r1;
        r12.translate(r1, r9);
        r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r12.scale(r1, r2);
    L_0x00a9:
        r1 = r11.f16886j;
        r1.offsetTo(r5, r5);
        r2 = r11.f16879c;
        r1 = r2.f3732f;
        if (r1 != 0) goto L_0x0154;
    L_0x00b4:
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
        r1 = android.graphics.Bitmap.createBitmap(r3, r6, r1);
        r2.f3732f = r1;
        r2.f3737k = r4;
    L_0x00be:
        r1 = r11.f16883g;
        if (r1 != 0) goto L_0x0106;
    L_0x00c2:
        r1 = r11.f16879c;
        r1.mo6204a(r3, r6);
    L_0x00c7:
        r1 = r11.f16879c;
        r2 = r11.f16886j;
        r3 = r1.f3728b;
        r3 = r3.getRootAlpha();
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r3 < r5) goto L_0x00d7;
    L_0x00d5:
        if (r0 == 0) goto L_0x0104;
    L_0x00d7:
        r3 = r1.f3738l;
        if (r3 != 0) goto L_0x00e7;
    L_0x00db:
        r3 = new android.graphics.Paint;
        r3.<init>();
        r1.f3738l = r3;
        r3 = r1.f3738l;
        r3.setFilterBitmap(r4);
    L_0x00e7:
        r3 = r1.f3738l;
        r4 = r1.f3728b;
        r4 = r4.getRootAlpha();
        r3.setAlpha(r4);
        r3 = r1.f3738l;
        r3.setColorFilter(r0);
        r0 = r1.f3738l;
    L_0x00f9:
        r1 = r1.f3732f;
        r3 = 0;
        r12.drawBitmap(r1, r3, r2, r0);
        r12.restoreToCount(r7);
        goto L_0x0010;
    L_0x0104:
        r0 = 0;
        goto L_0x00f9;
    L_0x0106:
        r1 = r11.f16879c;
        r2 = r1.f3737k;
        if (r2 != 0) goto L_0x0152;
    L_0x010c:
        r2 = r1.f3733g;
        r8 = r1.f3729c;
        if (r2 != r8) goto L_0x0150;
    L_0x0112:
        r2 = r1.f3734h;
        r8 = r1.f3730d;
        if (r2 != r8) goto L_0x014e;
    L_0x0118:
        r2 = r1.f3736j;
        r8 = r1.f3731e;
        if (r2 != r8) goto L_0x014c;
    L_0x011e:
        r2 = r1.f3735i;
        r1 = r1.f3728b;
        r1 = r1.getRootAlpha();
        if (r2 != r1) goto L_0x014a;
    L_0x0128:
        r1 = r4;
    L_0x0129:
        if (r1 != 0) goto L_0x00c7;
    L_0x012b:
        r1 = r11.f16879c;
        r1.mo6204a(r3, r6);
        r1 = r11.f16879c;
        r2 = r1.f3729c;
        r1.f3733g = r2;
        r2 = r1.f3730d;
        r1.f3734h = r2;
        r2 = r1.f3728b;
        r2 = r2.getRootAlpha();
        r1.f3735i = r2;
        r2 = r1.f3731e;
        r1.f3736j = r2;
        r1.f3737k = r5;
        goto L_0x00c7;
    L_0x014a:
        r1 = r5;
        goto L_0x0129;
    L_0x014c:
        r1 = r5;
        goto L_0x0129;
    L_0x014e:
        r1 = r5;
        goto L_0x0129;
    L_0x0150:
        r1 = r5;
        goto L_0x0129;
    L_0x0152:
        r1 = r5;
        goto L_0x0129;
    L_0x0154:
        r1 = r1.getWidth();
        if (r3 != r1) goto L_0x0169;
    L_0x015a:
        r1 = r2.f3732f;
        r1 = r1.getHeight();
        if (r6 != r1) goto L_0x0167;
    L_0x0162:
        r1 = r4;
    L_0x0163:
        if (r1 != 0) goto L_0x00be;
    L_0x0165:
        goto L_0x00b4;
    L_0x0167:
        r1 = r5;
        goto L_0x0163;
    L_0x0169:
        r1 = r5;
        goto L_0x0163;
    L_0x016b:
        r1 = r11.getLayoutDirection();
        if (r1 != r4) goto L_0x0174;
    L_0x0171:
        r1 = r4;
        goto L_0x0098;
    L_0x0174:
        r1 = r5;
        goto L_0x0098;
    L_0x0177:
        r1 = r2;
        r3 = r2;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.draw(android.graphics.Canvas):void");
    }

    public final int getAlpha() {
        if (this.f3523a != null) {
            return this.f3523a.getAlpha();
        }
        return this.f16879c.f3728b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.f3523a != null) {
            return this.f3523a.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f16879c.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (this.f3523a != null) {
            return new C0206ed(this.f3523a.getConstantState());
        }
        this.f16879c.f3727a = getChangingConfigurations();
        return this.f16879c;
    }

    public final int getIntrinsicHeight() {
        if (this.f3523a != null) {
            return this.f3523a.getIntrinsicHeight();
        }
        return (int) this.f16879c.f3728b.f3692f;
    }

    public final int getIntrinsicWidth() {
        if (this.f3523a != null) {
            return this.f3523a.getIntrinsicWidth();
        }
        return (int) this.f16879c.f3728b.f3691e;
    }

    public final int getOpacity() {
        return this.f3523a != null ? this.f3523a.getOpacity() : -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f3523a != null) {
            this.f3523a.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.f3523a != null) {
            this.f3523a.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0205ec c0205ec = this.f16879c;
        c0205ec.f3728b = new C0204eb();
        TypedArray a = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3409a);
        C0205ec c0205ec2 = this.f16879c;
        C0204eb c0204eb = c0205ec2.f3728b;
        int b = C0723na.m14394b(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        switch (b) {
            case 3:
                mode = Mode.SRC_OVER;
                break;
            case 5:
                mode = Mode.SRC_IN;
                break;
            case 9:
                mode = Mode.SRC_ATOP;
                break;
            case 14:
                mode = Mode.MULTIPLY;
                break;
            case 15:
                mode = Mode.SCREEN;
                break;
            case 16:
                mode = Mode.ADD;
                break;
        }
        c0205ec2.f3730d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            c0205ec2.f3729c = colorStateList;
        }
        boolean z = c0205ec2.f3731e;
        if (C0723na.m14393a(xmlPullParser, "autoMirrored")) {
            z = a.getBoolean(5, z);
        }
        c0205ec2.f3731e = z;
        c0204eb.f3693g = C0723na.m14388a(a, xmlPullParser, "viewportWidth", 7, c0204eb.f3693g);
        c0204eb.f3694h = C0723na.m14388a(a, xmlPullParser, "viewportHeight", 8, c0204eb.f3694h);
        StringBuilder stringBuilder;
        if (c0204eb.f3693g <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else if (c0204eb.f3694h <= 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(a.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        } else {
            c0204eb.f3691e = a.getDimension(3, c0204eb.f3691e);
            c0204eb.f3692f = a.getDimension(2, c0204eb.f3692f);
            if (c0204eb.f3691e <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else if (c0204eb.f3692f <= 0.0f) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a.getPositionDescription());
                stringBuilder.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            } else {
                c0204eb.setAlpha(C0723na.m14388a(a, xmlPullParser, "alpha", 4, c0204eb.getAlpha()));
                String string = a.getString(0);
                if (string != null) {
                    c0204eb.f3695i = string;
                    c0204eb.f3696j.put(string, c0204eb);
                }
                a.recycle();
                c0205ec.f3727a = getChangingConfigurations();
                c0205ec.f3737k = true;
                c0205ec2 = this.f16879c;
                c0204eb = c0205ec2.f3728b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c0204eb.f3690d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                Object obj = 1;
                while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    Object obj2;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0201dz c0201dz = (C0201dz) arrayDeque.peek();
                        TypedArray a2;
                        String string2;
                        if ("path".equals(name)) {
                            C0671dy c0671dy = new C0671dy();
                            a2 = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3411c);
                            c0671dy.f16958a = null;
                            if (C0723na.m14393a(xmlPullParser, "pathData")) {
                                String string3 = a2.getString(0);
                                if (string3 != null) {
                                    c0671dy.f3639o = string3;
                                }
                                string3 = a2.getString(2);
                                if (string3 != null) {
                                    c0671dy.f3638n = C0437qr.m5798a(string3);
                                }
                                c0671dy.f16961d = C0723na.m14390a(a2, xmlPullParser, "fillColor", 1, c0671dy.f16961d);
                                c0671dy.f16964g = C0723na.m14388a(a2, xmlPullParser, "fillAlpha", 12, c0671dy.f16964g);
                                int b2 = C0723na.m14394b(a2, xmlPullParser, "strokeLineCap", 8, -1);
                                Cap cap = c0671dy.f16968k;
                                switch (b2) {
                                    case 0:
                                        cap = Cap.BUTT;
                                        break;
                                    case 1:
                                        cap = Cap.ROUND;
                                        break;
                                    case 2:
                                        cap = Cap.SQUARE;
                                        break;
                                }
                                c0671dy.f16968k = cap;
                                b2 = C0723na.m14394b(a2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Join join = c0671dy.f16969l;
                                switch (b2) {
                                    case 0:
                                        join = Join.MITER;
                                        break;
                                    case 1:
                                        join = Join.ROUND;
                                        break;
                                    case 2:
                                        join = Join.BEVEL;
                                        break;
                                }
                                c0671dy.f16969l = join;
                                c0671dy.f16970m = C0723na.m14388a(a2, xmlPullParser, "strokeMiterLimit", 10, c0671dy.f16970m);
                                c0671dy.f16959b = C0723na.m14390a(a2, xmlPullParser, "strokeColor", 3, c0671dy.f16959b);
                                c0671dy.f16962e = C0723na.m14388a(a2, xmlPullParser, "strokeAlpha", 11, c0671dy.f16962e);
                                c0671dy.f16960c = C0723na.m14388a(a2, xmlPullParser, "strokeWidth", 4, c0671dy.f16960c);
                                c0671dy.f16966i = C0723na.m14388a(a2, xmlPullParser, "trimPathEnd", 6, c0671dy.f16966i);
                                c0671dy.f16967j = C0723na.m14388a(a2, xmlPullParser, "trimPathOffset", 7, c0671dy.f16967j);
                                c0671dy.f16965h = C0723na.m14388a(a2, xmlPullParser, "trimPathStart", 5, c0671dy.f16965h);
                                c0671dy.f16963f = C0723na.m14394b(a2, xmlPullParser, "fillType", 13, c0671dy.f16963f);
                            }
                            a2.recycle();
                            c0201dz.f3574b.add(c0671dy);
                            if (c0671dy.getPathName() != null) {
                                c0204eb.f3696j.put(c0671dy.getPathName(), c0671dy);
                            }
                            c0205ec2.f3727a |= c0671dy.f3640p;
                            obj2 = null;
                        } else if ("clip-path".equals(name)) {
                            C0670dx c0670dx = new C0670dx();
                            if (C0723na.m14393a(xmlPullParser, "pathData")) {
                                a2 = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3412d);
                                string2 = a2.getString(0);
                                if (string2 != null) {
                                    c0670dx.f3639o = string2;
                                }
                                string2 = a2.getString(1);
                                if (string2 != null) {
                                    c0670dx.f3638n = C0437qr.m5798a(string2);
                                }
                                a2.recycle();
                            }
                            c0201dz.f3574b.add(c0670dx);
                            if (c0670dx.getPathName() != null) {
                                c0204eb.f3696j.put(c0670dx.getPathName(), c0670dx);
                            }
                            c0205ec2.f3727a |= c0670dx.f3640p;
                            obj2 = obj;
                        } else if ("group".equals(name)) {
                            C0201dz c0201dz2 = new C0201dz();
                            a2 = C0723na.m14391a(resources, theme, attributeSet, C0196dr.f3410b);
                            c0201dz2.f3584l = null;
                            c0201dz2.f3575c = C0723na.m14388a(a2, xmlPullParser, "rotation", 5, c0201dz2.f3575c);
                            c0201dz2.f3576d = a2.getFloat(1, c0201dz2.f3576d);
                            c0201dz2.f3577e = a2.getFloat(2, c0201dz2.f3577e);
                            c0201dz2.f3578f = C0723na.m14388a(a2, xmlPullParser, "scaleX", 3, c0201dz2.f3578f);
                            c0201dz2.f3579g = C0723na.m14388a(a2, xmlPullParser, "scaleY", 4, c0201dz2.f3579g);
                            c0201dz2.f3580h = C0723na.m14388a(a2, xmlPullParser, "translateX", 6, c0201dz2.f3580h);
                            c0201dz2.f3581i = C0723na.m14388a(a2, xmlPullParser, "translateY", 7, c0201dz2.f3581i);
                            string2 = a2.getString(0);
                            if (string2 != null) {
                                c0201dz2.f3585m = string2;
                            }
                            c0201dz2.mo6106a();
                            a2.recycle();
                            c0201dz.f3574b.add(c0201dz2);
                            arrayDeque.push(c0201dz2);
                            if (c0201dz2.getGroupName() != null) {
                                c0204eb.f3696j.put(c0201dz2.getGroupName(), c0201dz2);
                            }
                            c0205ec2.f3727a |= c0201dz2.f3583k;
                            obj2 = obj;
                        } else {
                            obj2 = obj;
                        }
                    } else if (eventType != 3) {
                        obj2 = obj;
                    } else if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        obj2 = obj;
                    } else {
                        obj2 = obj;
                    }
                    obj = obj2;
                    eventType = xmlPullParser.next();
                }
                if (obj != null) {
                    throw new XmlPullParserException("no path defined");
                }
                this.f16880d = m9645a(c0205ec.f3729c, c0205ec.f3730d);
            }
        }
    }

    public final void invalidateSelf() {
        if (this.f3523a != null) {
            this.f3523a.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        if (this.f3523a != null) {
            return this.f3523a.isAutoMirrored();
        }
        return this.f16879c.f3731e;
    }

    public final boolean isStateful() {
        boolean z = true;
        if (this.f3523a != null) {
            return this.f3523a.isStateful();
        }
        if (!super.isStateful()) {
            C0205ec c0205ec = this.f16879c;
            if (c0205ec != null) {
                ColorStateList colorStateList = c0205ec.f3729c;
                if (colorStateList == null) {
                    z = false;
                } else if (!colorStateList.isStateful()) {
                    return false;
                }
            }
            z = false;
        }
        return z;
    }

    public final Drawable mutate() {
        if (this.f3523a != null) {
            this.f3523a.mutate();
        } else if (!this.f16882f && super.mutate() == this) {
            this.f16879c = new C0205ec(this.f16879c);
            this.f16882f = true;
        }
        return this;
    }

    protected final void onBoundsChange(Rect rect) {
        if (this.f3523a != null) {
            this.f3523a.setBounds(rect);
        }
    }

    protected final boolean onStateChange(int[] iArr) {
        if (this.f3523a != null) {
            return this.f3523a.setState(iArr);
        }
        C0205ec c0205ec = this.f16879c;
        ColorStateList colorStateList = c0205ec.f3729c;
        if (colorStateList != null) {
            Mode mode = c0205ec.f3730d;
            if (mode != null) {
                this.f16880d = m9645a(colorStateList, mode);
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.f3523a != null) {
            this.f3523a.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f3523a != null) {
            this.f3523a.setAlpha(i);
        } else if (this.f16879c.f3728b.getRootAlpha() != i) {
            this.f16879c.f3728b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f3523a != null) {
            this.f3523a.setAutoMirrored(z);
        } else {
            this.f16879c.f3731e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3523a != null) {
            this.f3523a.setColorFilter(colorFilter);
            return;
        }
        this.f16881e = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i) {
        if (this.f3523a != null) {
            this.f3523a.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f3523a != null) {
            this.f3523a.setTintList(colorStateList);
            return;
        }
        C0205ec c0205ec = this.f16879c;
        if (c0205ec.f3729c != colorStateList) {
            c0205ec.f3729c = colorStateList;
            this.f16880d = m9645a(colorStateList, c0205ec.f3730d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.f3523a != null) {
            this.f3523a.setTintMode(mode);
            return;
        }
        C0205ec c0205ec = this.f16879c;
        if (c0205ec.f3730d != mode) {
            c0205ec.f3730d = mode;
            this.f16880d = m9645a(c0205ec.f3729c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f3523a != null) {
            return this.f3523a.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.f3523a != null) {
            this.f3523a.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a */
    private final PorterDuffColorFilter m9645a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
