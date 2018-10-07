package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Looper;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: arq */
public final class arq {
    /* renamed from: a */
    private static final char[] f952a = "0123456789abcdef".toCharArray();
    /* renamed from: b */
    private static final char[] f953b = new char[64];

    /* renamed from: a */
    public static void m678a() {
        if (!arq.m680b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static boolean m679a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            if (obj instanceof ajv) {
                return ((ajv) obj).mo338a();
            }
            return obj.equals(obj2);
        }
    }

    /* renamed from: b */
    public static boolean m683b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    /* renamed from: a */
    public static Queue m677a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static int m671a(int i, int i2, Config config) {
        int i3;
        int i4 = i * i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (arr.f954a[config.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case 2:
            case 3:
                i3 = 2;
                break;
            case 4:
                i3 = 8;
                break;
            default:
                i3 = 4;
                break;
        }
        return i3 * i4;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m672a(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            String valueOf = String.valueOf(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            String valueOf2 = String.valueOf(bitmap.getConfig());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 66) + String.valueOf(valueOf2).length());
            stringBuilder.append("Cannot obtain size for recycled Bitmap: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("[");
            stringBuilder.append(width);
            stringBuilder.append("x");
            stringBuilder.append(height);
            stringBuilder.append("] ");
            stringBuilder.append(valueOf2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException e) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    /* renamed from: a */
    public static List m676a(Collection collection) {
        List arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m669a(float f) {
        return Float.floatToIntBits(f) + 527;
    }

    /* renamed from: a */
    public static int m670a(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: a */
    public static int m673a(Object obj, int i) {
        int hashCode;
        if (obj != null) {
            hashCode = obj.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + (i * 31);
    }

    /* renamed from: a */
    public static int m674a(boolean z, int i) {
        return (i * 31) + z;
    }

    /* renamed from: b */
    public static boolean m680b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    private static boolean m681b(int i) {
        return i > 0 || i == kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: b */
    public static boolean m682b(int i, int i2) {
        return arq.m681b(i) && arq.m681b(i2);
    }

    /* renamed from: a */
    public static String m675a(byte[] bArr) {
        String str;
        synchronized (f953b) {
            char[] cArr = f953b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & Illuminant.kOther;
                int i3 = i + i;
                cArr[i3] = f952a[i2 >>> 4];
                cArr[i3 + 1] = f952a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }
}
