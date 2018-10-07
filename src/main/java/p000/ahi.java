package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ahi */
public final class ahi implements ahg {
    /* renamed from: a */
    private static final Config[] f10302a;
    /* renamed from: b */
    private static final Config[] f10303b;
    /* renamed from: c */
    private static final Config[] f10304c = new Config[]{Config.RGB_565};
    /* renamed from: d */
    private static final Config[] f10305d = new Config[]{Config.ARGB_4444};
    /* renamed from: e */
    private static final Config[] f10306e = new Config[]{Config.ALPHA_8};
    /* renamed from: f */
    private final ahl f10307f = new ahl();
    /* renamed from: g */
    private final agz f10308g = new agz();
    /* renamed from: h */
    private final Map f10309h = new HashMap();

    static {
        Config[] configArr = (Config[]) Arrays.copyOf(new Config[]{Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Config.RGBA_F16;
        f10302a = configArr;
        f10303b = configArr;
    }

    /* renamed from: a */
    private final void m6520a(Integer num, Bitmap bitmap) {
        NavigableMap a = m6519a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String b = mo296b(bitmap);
            String valueOf2 = String.valueOf(this);
            int length = String.valueOf(valueOf).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 56) + String.valueOf(b).length()) + String.valueOf(valueOf2).length());
            stringBuilder.append("Tried to decrement empty size, size: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", removed: ");
            stringBuilder.append(b);
            stringBuilder.append(", this: ");
            stringBuilder.append(valueOf2);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* renamed from: a */
    public final android.graphics.Bitmap mo294a(int r10, int r11, android.graphics.Bitmap.Config r12) {
        /*
        r9 = this;
        r3 = 0;
        r4 = p000.arq.m671a(r10, r11, r12);
        r0 = r9.f10307f;
        r2 = r0.mo11648a(r4, r12);
        r0 = android.graphics.Bitmap.Config.RGBA_F16;
        r0 = r0.equals(r12);
        if (r0 == 0) goto L_0x0081;
    L_0x0013:
        r0 = f10303b;
        r1 = r0;
    L_0x0016:
        r5 = r1.length;
    L_0x0017:
        if (r3 >= r5) goto L_0x007f;
    L_0x0019:
        r6 = r1[r3];
        r0 = r9.m6519a(r6);
        r7 = java.lang.Integer.valueOf(r4);
        r0 = r0.ceilingKey(r7);
        r0 = (java.lang.Integer) r0;
        if (r0 == 0) goto L_0x007b;
    L_0x002b:
        r7 = r0.intValue();
        r8 = r4 << 3;
        if (r7 > r8) goto L_0x007b;
    L_0x0033:
        r1 = r0.intValue();
        if (r1 != r4) goto L_0x003d;
    L_0x0039:
        if (r6 != 0) goto L_0x0073;
    L_0x003b:
        if (r12 == 0) goto L_0x0071;
    L_0x003d:
        r1 = r9.f10307f;
        r1.mo278a(r2);
        r1 = r9.f10307f;
        r0 = r0.intValue();
        r0 = r1.mo11648a(r0, r6);
        r1 = r0;
    L_0x004d:
        r0 = r9.f10308g;
        r0 = r0.mo287a(r1);
        r0 = (android.graphics.Bitmap) r0;
        if (r0 == 0) goto L_0x006b;
    L_0x0057:
        r1 = r1.f10310a;
        r1 = java.lang.Integer.valueOf(r1);
        r9.m6520a(r1, r0);
        r1 = r0.getConfig();
        if (r1 != 0) goto L_0x006c;
    L_0x0066:
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
    L_0x0068:
        r0.reconfigure(r10, r11, r1);
    L_0x006b:
        return r0;
    L_0x006c:
        r1 = r0.getConfig();
        goto L_0x0068;
    L_0x0071:
        r1 = r2;
        goto L_0x004d;
    L_0x0073:
        r1 = r6.equals(r12);
        if (r1 == 0) goto L_0x003d;
    L_0x0079:
        r1 = r2;
        goto L_0x004d;
    L_0x007b:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0017;
    L_0x007f:
        r1 = r2;
        goto L_0x004d;
    L_0x0081:
        r0 = p000.ahj.f458a;
        r1 = r12.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x00a1;
            case 2: goto L_0x009c;
            case 3: goto L_0x0097;
            case 4: goto L_0x0093;
            default: goto L_0x008c;
        };
    L_0x008c:
        r0 = 1;
        r0 = new android.graphics.Bitmap.Config[r0];
        r0[r3] = r12;
        r1 = r0;
        goto L_0x0016;
    L_0x0093:
        r0 = f10306e;
        r1 = r0;
        goto L_0x0016;
    L_0x0097:
        r0 = f10305d;
        r1 = r0;
        goto L_0x0016;
    L_0x009c:
        r0 = f10304c;
        r1 = r0;
        goto L_0x0016;
    L_0x00a1:
        r0 = f10302a;
        r1 = r0;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: ahi.a(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    /* renamed from: a */
    static String m6518a(int i, Config config) {
        String valueOf = String.valueOf(config);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final int mo292a(Bitmap bitmap) {
        return arq.m672a(bitmap);
    }

    /* renamed from: a */
    private final NavigableMap m6519a(Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f10309h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        navigableMap = new TreeMap();
        this.f10309h.put(config, navigableMap);
        return navigableMap;
    }

    /* renamed from: b */
    public final String mo295b(int i, int i2, Config config) {
        return ahi.m6518a(arq.m671a(i, i2, config), config);
    }

    /* renamed from: b */
    public final String mo296b(Bitmap bitmap) {
        return ahi.m6518a(arq.m672a(bitmap), bitmap.getConfig());
    }

    /* renamed from: c */
    public final void mo297c(Bitmap bitmap) {
        int intValue;
        ahk a = this.f10307f.mo11648a(arq.m672a(bitmap), bitmap.getConfig());
        this.f10308g.mo288a(a, bitmap);
        NavigableMap a2 = m6519a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f10310a));
        Integer valueOf = Integer.valueOf(a.f10310a);
        if (num != null) {
            intValue = num.intValue() + 1;
        } else {
            intValue = 1;
        }
        a2.put(valueOf, Integer.valueOf(intValue));
    }

    /* renamed from: a */
    public final Bitmap mo293a() {
        Bitmap bitmap = (Bitmap) this.f10308g.mo286a();
        if (bitmap != null) {
            m6520a(Integer.valueOf(arq.m672a(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.f10308g);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.f10309h.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.f10309h.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }
}
