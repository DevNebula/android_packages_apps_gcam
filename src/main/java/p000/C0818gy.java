package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.AbstractMethod;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: gy */
public class C0818gy extends C0684gx {
    /* renamed from: a */
    public final Class f24450a;
    /* renamed from: b */
    public final Method f24451b;
    /* renamed from: c */
    private final Constructor f24452c;
    /* renamed from: d */
    private final Method f24453d;
    /* renamed from: e */
    private final Method f24454e;
    /* renamed from: f */
    private final Method f24455f;
    /* renamed from: g */
    private final Method f24456g;

    public C0818gy() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method a;
        Throwable e;
        AbstractMethod a2 = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method2 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method3 = cls.getMethod("freeze", new Class[0]);
            method4 = cls.getMethod("abortCreation", new Class[0]);
            a2 = mo14935a(cls);
        } catch (ClassNotFoundException e2) {
            e = e2;
        } catch (NoSuchMethodException e3) {
            e = e3;
        }
        this.f24450a = cls;
        this.f24452c = constructor;
        this.f24453d = method;
        this.f24454e = method2;
        this.f24455f = method3;
        this.f24456g = method4;
        this.f24451b = a2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to collect necessary methods for class ");
        stringBuilder.append(e.getClass().getName());
        Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), e);
        method4 = a2;
        method3 = a2;
        method2 = a2;
        method = a2;
        AbstractMethod constructor2 = a2;
        Object cls2 = a2;
        this.f24450a = cls2;
        this.f24452c = constructor2;
        this.f24453d = method;
        this.f24454e = method2;
        this.f24455f = method3;
        this.f24456g = method4;
        this.f24451b = a2;
    }

    /* renamed from: c */
    private final void m16160c(Object obj) {
        Throwable e;
        try {
            this.f24456g.invoke(obj, new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private final boolean m16157a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        Throwable e;
        try {
            return ((Boolean) this.f24453d.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
        } catch (InvocationTargetException e3) {
            e = e3;
        }
        throw new RuntimeException(e);
    }

    /* renamed from: a */
    private final boolean m16158a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        Throwable e;
        try {
            return ((Boolean) this.f24454e.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
        } catch (InvocationTargetException e3) {
            e = e3;
        }
        throw new RuntimeException(e);
    }

    /* renamed from: a */
    protected Typeface mo14934a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(this.f24450a, 1), 0, obj);
            Method method = this.f24451b;
            r2 = new Object[3];
            Integer valueOf = Integer.valueOf(-1);
            r2[1] = valueOf;
            r2[2] = valueOf;
            return (Typeface) method.invoke(null, r2);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo7593a(Context context, C0723na c0723na, Resources resources, int i) {
        if (!m16156a()) {
            return super.mo7593a(context, c0723na, resources, i);
        }
        Object b = m16159b();
        C0437qr[] c0437qrArr = c0723na.f22094a;
        int length = c0437qrArr.length;
        int i2 = 0;
        while (i2 < length) {
            C0437qr c0437qr = c0437qrArr[i2];
            if (m16157a(context, b, c0437qr.f9585a, c0437qr.f9589e, c0437qr.f9586b, c0437qr.f9587c, FontVariationAxis.fromFontVariationSettings(c0437qr.f9588d))) {
                i2++;
            } else {
                m16160c(b);
                return null;
            }
        }
        if (m16161d(b)) {
            return mo14934a(b);
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:38:0x0094, code:
            if (r1 != null) goto L_0x0096;
     */
    /* JADX WARNING: Missing block: B:40:?, code:
            r1.close();
     */
    /* renamed from: a */
    public final android.graphics.Typeface mo7594a(android.content.Context r11, p000.C0273hq[] r12, int r13) {
        /*
        r10 = this;
        r0 = 0;
        r6 = 0;
        r8 = r12.length;
        if (r8 > 0) goto L_0x0007;
    L_0x0005:
        r0 = r6;
    L_0x0006:
        return r0;
    L_0x0007:
        r1 = r10.m16156a();
        if (r1 != 0) goto L_0x0049;
    L_0x000d:
        r0 = p000.C0261ha.m3015a(r12, r13);
        r1 = r11.getContentResolver();
        r2 = r0.f6806a;	 Catch:{ IOException -> 0x003f }
        r3 = "r";
        r4 = 0;
        r1 = r1.openFileDescriptor(r2, r3, r4);	 Catch:{ IOException -> 0x003f }
        if (r1 == 0) goto L_0x0042;
    L_0x0020:
        r2 = new android.graphics.Typeface$Builder;	 Catch:{ all -> 0x0091 }
        r3 = r1.getFileDescriptor();	 Catch:{ all -> 0x0091 }
        r2.<init>(r3);	 Catch:{ all -> 0x0091 }
        r3 = r0.f6808c;	 Catch:{ all -> 0x0091 }
        r2 = r2.setWeight(r3);	 Catch:{ all -> 0x0091 }
        r0 = r0.f6809d;	 Catch:{ all -> 0x0091 }
        r0 = r2.setItalic(r0);	 Catch:{ all -> 0x0091 }
        r0 = r0.build();	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x0006;
    L_0x003b:
        r1.close();	 Catch:{ IOException -> 0x003f }
        goto L_0x0006;
    L_0x003f:
        r0 = move-exception;
        r0 = r6;
        goto L_0x0006;
    L_0x0042:
        if (r1 == 0) goto L_0x0047;
    L_0x0044:
        r1.close();	 Catch:{ IOException -> 0x003f }
    L_0x0047:
        r0 = r6;
        goto L_0x0006;
    L_0x0049:
        r9 = p000.C0269hk.m3273a(r11, r12, r6);
        r1 = r10.m16159b();
        r7 = r0;
    L_0x0052:
        if (r7 >= r8) goto L_0x0078;
    L_0x0054:
        r5 = r12[r7];
        r2 = r5.f6806a;
        r2 = r9.get(r2);
        r2 = (java.nio.ByteBuffer) r2;
        if (r2 != 0) goto L_0x0064;
    L_0x0060:
        r2 = r7 + 1;
        r7 = r2;
        goto L_0x0052;
    L_0x0064:
        r3 = r5.f6807b;
        r4 = r5.f6808c;
        r5 = r5.f6809d;
        r0 = r10;
        r0 = r0.m16158a(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x0073;
    L_0x0071:
        r0 = 1;
        goto L_0x0060;
    L_0x0073:
        r10.m16160c(r1);
        r0 = r6;
        goto L_0x0006;
    L_0x0078:
        if (r0 != 0) goto L_0x007f;
    L_0x007a:
        r10.m16160c(r1);
        r0 = r6;
        goto L_0x0006;
    L_0x007f:
        r0 = r10.m16161d(r1);
        if (r0 != 0) goto L_0x0087;
    L_0x0085:
        r0 = r6;
        goto L_0x0006;
    L_0x0087:
        r0 = r10.mo14934a(r1);
        r0 = android.graphics.Typeface.create(r0, r13);
        goto L_0x0006;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x0093:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0099;
    L_0x0096:
        r1.close();	 Catch:{ all -> 0x009a }
    L_0x0099:
        throw r2;	 Catch:{ IOException -> 0x003f }
    L_0x009a:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);	 Catch:{ IOException -> 0x003f }
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: gy.a(android.content.Context, hq[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public final Typeface mo7592a(Context context, Resources resources, int i, String str, int i2) {
        if (!m16156a()) {
            return super.mo7592a(context, resources, i, str, i2);
        }
        Object b = m16159b();
        if (!m16157a(context, b, str, 0, -1, -1, null)) {
            m16160c(b);
            return null;
        } else if (m16161d(b)) {
            return mo14934a(b);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private final boolean m16161d(Object obj) {
        Throwable e;
        try {
            return ((Boolean) this.f24455f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
        } catch (InvocationTargetException e3) {
            e = e3;
        }
        throw new RuntimeException(e);
    }

    /* renamed from: a */
    private final boolean m16156a() {
        if (this.f24453d == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f24453d != null;
    }

    /* renamed from: b */
    private final Object m16159b() {
        Throwable e;
        try {
            return this.f24452c.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
        } catch (InstantiationException e3) {
            e = e3;
        } catch (InvocationTargetException e4) {
            e = e4;
        }
        throw new RuntimeException(e);
    }

    /* renamed from: a */
    protected Method mo14935a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
