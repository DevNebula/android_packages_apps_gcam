package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.wearable.Asset;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* renamed from: htl */
public class htl {
    /* renamed from: a */
    public static Boolean f7018a;
    /* renamed from: b */
    private static Boolean f7019b;
    /* renamed from: c */
    private static Boolean f7020c;

    private htl(String[] strArr) {
        htl.m3488b((Object) strArr);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
    }

    public htl(String[] strArr, byte b) {
        this(strArr);
    }

    /* renamed from: a */
    public static boolean m3483a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj == null) {
                z = false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static String m3458a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unknown status code: ");
                stringBuilder.append(i);
                return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static hvi m3455a(Object obj) {
        return new hvi(obj);
    }

    /* renamed from: a */
    public static String[] m3484a(Parcel parcel, int i) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(d + dataPosition);
        return createStringArray;
    }

    /* renamed from: b */
    public static Object m3488b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static boolean m3482a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (iad.f7237a.mo8300a(context).mo8298a(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m3487b(Parcel parcel, int i) {
        parcel.writeInt(-65536 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: c */
    public static void m3496c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: a */
    public static Bundle m3453a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    /* renamed from: a */
    public static void m3462a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    /* renamed from: d */
    public static int m3498d(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? i >>> 16 : parcel.readInt();
    }

    /* renamed from: a */
    public static void m3463a(Parcel parcel, int i, byte b) {
        htl.m3491b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m3464a(Parcel parcel, int i, int i2) {
        int d = htl.m3498d(parcel, i);
        if (d != i2) {
            String valueOf = String.valueOf(Integer.toHexString(d));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(d);
            stringBuilder.append(" (0x");
            stringBuilder.append(valueOf);
            stringBuilder.append(")");
            throw new aci(stringBuilder.toString(), parcel);
        }
    }

    /* renamed from: a */
    public static void m3465a(Parcel parcel, int i, long j) {
        htl.m3491b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static Parcelable m3454a(Parcel parcel, int i, Creator creator) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(d + dataPosition);
        return parcelable;
    }

    /* renamed from: a */
    public static void m3471a(Parcel parcel, int i, boolean z) {
        htl.m3491b(parcel, i, 4);
        parcel.writeInt(z);
    }

    /* renamed from: a */
    private static void m3476a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    private static void m3477a(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj == null) {
            return;
        }
        int modifiers;
        int length;
        String name;
        if (obj instanceof ibr) {
            String name2;
            int length2 = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(htl.m3490b(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append("  ");
            }
            Class cls = obj.getClass();
            for (Field field : cls.getFields()) {
                modifiers = field.getModifiers();
                name2 = field.getName();
                if (!("cachedSize".equals(name2) || (modifiers & 1) != 1 || (modifiers & 8) == 8 || name2.startsWith("_") || name2.endsWith("_"))) {
                    Class type = field.getType();
                    Object obj2 = field.get(obj);
                    if (!type.isArray()) {
                        htl.m3477a(name2, obj2, stringBuffer, stringBuffer2);
                    } else if (type.getComponentType() == Byte.TYPE) {
                        htl.m3477a(name2, obj2, stringBuffer, stringBuffer2);
                    } else {
                        length = obj2 != null ? Array.getLength(obj2) : 0;
                        for (modifiers = 0; modifiers < length; modifiers++) {
                            htl.m3477a(name2, Array.get(obj2, modifiers), stringBuffer, stringBuffer2);
                        }
                    }
                }
            }
            for (Method name3 : cls.getMethods()) {
                name = name3.getName();
                if (name.startsWith("set")) {
                    String substring = name.substring(3);
                    try {
                        name2 = "has";
                        name = String.valueOf(substring);
                        if (((Boolean) cls.getMethod(name.length() == 0 ? new String(name2) : name2.concat(name), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                            try {
                                name2 = "get";
                                name = String.valueOf(substring);
                                htl.m3477a(substring, cls.getMethod(name.length() == 0 ? new String(name2) : name2.concat(name), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            } catch (NoSuchMethodException e) {
                            }
                        }
                    } catch (NoSuchMethodException e2) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length2);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        name = htl.m3490b(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(name);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!str2.startsWith("http") && str2.length() > 200) {
                str2 = String.valueOf(str2.substring(0, 200)).concat("[...]");
            }
            modifiers = str2.length();
            StringBuilder stringBuilder = new StringBuilder(modifiers);
            for (length = 0; length < modifiers; length++) {
                char charAt = str2.charAt(length);
                if (charAt >= ' ' && charAt <= '~' && charAt != '\"' && charAt != '\'') {
                    stringBuilder.append(charAt);
                } else {
                    stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                }
            }
            name = stringBuilder.toString();
            stringBuffer2.append("\"");
            stringBuffer2.append(name);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (bArr == null) {
                stringBuffer2.append("\"\"");
            } else {
                stringBuffer2.append('\"');
                for (byte b : bArr) {
                    modifiers = b & Illuminant.kOther;
                    char c = (char) modifiers;
                    if (modifiers == 92 || modifiers == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append(c);
                    } else if (modifiers >= 32 && modifiers < ScriptIntrinsicBLAS.RsBlas_csyrk) {
                        stringBuffer2.append(c);
                    } else {
                        stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(modifiers)}));
                    }
                }
                stringBuffer2.append('\"');
            }
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append("\n");
    }

    /* renamed from: a */
    public static ibh m3456a(List list, Object obj) {
        int i = 0;
        ibh ibh = new ibh();
        if (obj != null) {
            ibh.f24548b = new ibi();
            int i2;
            String str;
            if (obj instanceof String) {
                ibh.f24547a = 2;
                ibh.f24548b.f24550b = (String) obj;
            } else if (obj instanceof Integer) {
                ibh.f24547a = 6;
                ibh.f24548b.f24554f = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                ibh.f24547a = 5;
                ibh.f24548b.f24553e = ((Long) obj).longValue();
            } else if (obj instanceof Double) {
                ibh.f24547a = 3;
                ibh.f24548b.f24551c = ((Double) obj).doubleValue();
            } else if (obj instanceof Float) {
                ibh.f24547a = 4;
                ibh.f24548b.f24552d = ((Float) obj).floatValue();
            } else if (obj instanceof Boolean) {
                ibh.f24547a = 8;
                ibh.f24548b.f24556h = ((Boolean) obj).booleanValue();
            } else if (obj instanceof Byte) {
                ibh.f24547a = 7;
                ibh.f24548b.f24555g = ((Byte) obj).byteValue();
            } else if (obj instanceof byte[]) {
                ibh.f24547a = 1;
                ibh.f24548b.f24549a = (byte[]) obj;
            } else if (obj instanceof String[]) {
                ibh.f24547a = 11;
                ibh.f24548b.f24559k = (String[]) obj;
            } else if (obj instanceof long[]) {
                ibh.f24547a = 12;
                ibh.f24548b.f24560l = (long[]) obj;
            } else if (obj instanceof float[]) {
                ibh.f24547a = 15;
                ibh.f24548b.f24561m = (float[]) obj;
            } else if (obj instanceof Asset) {
                ibh.f24547a = 13;
                ibi ibi = ibh.f24548b;
                list.add((Asset) obj);
                ibi.f24562n = (long) (list.size() - 1);
            } else if (obj instanceof igj) {
                ibh.f24547a = 9;
                igj igj = (igj) obj;
                TreeSet treeSet = new TreeSet(igj.f7365a.keySet());
                ibg[] ibgArr = new ibg[treeSet.size()];
                Iterator it = treeSet.iterator();
                while (true) {
                    i2 = i;
                    if (!it.hasNext()) {
                        break;
                    }
                    str = (String) it.next();
                    ibgArr[i2] = new ibg();
                    ibg ibg = ibgArr[i2];
                    ibg.f24544a = str;
                    ibg.f24545b = htl.m3456a(list, igj.mo8437a(str));
                    i = i2 + 1;
                }
                ibh.f24548b.f24557i = ibgArr;
            } else if (obj instanceof ArrayList) {
                ibh.f24547a = 10;
                ArrayList arrayList = (ArrayList) obj;
                ibh[] ibhArr = new ibh[arrayList.size()];
                int size = arrayList.size();
                Object obj2 = null;
                int i3 = 0;
                int i4 = 14;
                while (i3 < size) {
                    Object obj3 = arrayList.get(i3);
                    ibh a = htl.m3456a(list, obj3);
                    int i5 = a.f24547a;
                    if (i5 == 14 || i5 == 2 || i5 == 6 || i5 == 9) {
                        if (i4 == 14 && i5 != 14) {
                            i2 = i5;
                        } else if (i5 == i4) {
                            obj3 = obj2;
                            i2 = i4;
                        } else {
                            String valueOf = String.valueOf(obj2.getClass());
                            str = String.valueOf(obj3.getClass());
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(str).length());
                            stringBuilder.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                            stringBuilder.append(valueOf);
                            stringBuilder.append(" and a ");
                            stringBuilder.append(str);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        ibhArr[i3] = a;
                        i3++;
                        i4 = i2;
                        obj2 = obj3;
                    } else {
                        str = String.valueOf(obj3.getClass());
                        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + ScriptIntrinsicBLAS.RsBlas_ctrsm);
                        stringBuilder2.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        stringBuilder2.append(str);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                }
                ibh.f24548b.f24558j = ibhArr;
            } else {
                str = String.valueOf(obj.getClass().getSimpleName());
                String str2 = "newFieldValueFromValue: unexpected value ";
                throw new RuntimeException(str.length() == 0 ? new String(str2) : str2.concat(str));
            }
            return ibh;
        }
        ibh.f24547a = 14;
        return ibh;
    }

    /* renamed from: a */
    public static void m3479a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    private static void m3480a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long a = htl.m3452a(bArr, i);
        long a2 = htl.m3452a(bArr, i + 8);
        long a3 = htl.m3452a(bArr, i + 16);
        long a4 = htl.m3452a(bArr, i + 24);
        a += j;
        long rotateRight = Long.rotateRight((j2 + a) + a4, 51);
        a2 = (a2 + a) + a3;
        a3 = Long.rotateRight(a2, 23);
        jArr[0] = a2 + a4;
        jArr[1] = a + (a3 + rotateRight);
    }

    /* renamed from: a */
    public static void m3466a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int b = htl.m3487b(parcel, i);
            parcel.writeBundle(bundle);
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3467a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int b = htl.m3487b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3468a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int b = htl.m3487b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3469a(Parcel parcel, int i, String str) {
        if (str != null) {
            int b = htl.m3487b(parcel, i);
            parcel.writeString(str);
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3472a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int b = htl.m3487b(parcel, i);
            parcel.writeByteArray(bArr);
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3473a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int b = htl.m3487b(parcel, i);
            parcel.writeIntArray(iArr);
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3474a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int b = htl.m3487b(parcel, i);
            parcel.writeInt(r3);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable != null) {
                    htl.m3476a(parcel, parcelable, i2);
                } else {
                    parcel.writeInt(0);
                }
            }
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3475a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int b = htl.m3487b(parcel, i);
            parcel.writeStringArray(strArr);
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    public static void m3478a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m3492b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m3499e(Parcel parcel, int i) {
        parcel.setDataPosition(htl.m3498d(parcel, i) + parcel.dataPosition());
    }

    /* renamed from: b */
    public static void m3491b(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt((i2 << 16) | i);
            return;
        }
        parcel.writeInt(-65536 | i);
        parcel.writeInt(i2);
    }

    /* renamed from: b */
    public static Object[] m3494b(Parcel parcel, int i, Creator creator) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(d + dataPosition);
        return createTypedArray;
    }

    /* renamed from: b */
    public static Object m3489b(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: a */
    public static Object m3457a(Callable callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            return null;
        }
    }

    /* renamed from: b */
    public static void m3493b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @TargetApi(24)
    /* renamed from: a */
    public static boolean m3481a(Context context) {
        if (f7020c == null) {
            f7020c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f7020c.booleanValue()) {
            if (f7019b == null) {
                f7019b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
            }
            if (f7019b.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m3500f(Parcel parcel, int i) {
        htl.m3464a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: c */
    public static void m3497c(Parcel parcel, int i, int i2) {
        htl.m3491b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: c */
    public static ArrayList m3495c(Parcel parcel, int i, Creator creator) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(d + dataPosition);
        return createTypedArrayList;
    }

    /* renamed from: a */
    public static void m3470a(Parcel parcel, int i, List list) {
        if (list != null) {
            int b = htl.m3487b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable != null) {
                    htl.m3476a(parcel, parcelable, 0);
                } else {
                    parcel.writeInt(0);
                }
            }
            htl.m3496c(parcel, b);
        }
    }

    /* renamed from: a */
    private static long m3452a(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    /* renamed from: a */
    public static int m3449a(Parcel parcel) {
        int readInt = parcel.readInt();
        int d = htl.m3498d(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            String str = "Expected object header. Got 0x";
            throw new aci(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), parcel);
        }
        readInt = dataPosition + d;
        if (readInt >= dataPosition && readInt <= parcel.dataSize()) {
            return readInt;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Size read is invalid start=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" end=");
        stringBuilder.append(readInt);
        throw new aci(stringBuilder.toString(), parcel);
    }

    /* renamed from: a */
    public static String m3460a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: b */
    public static int m3486b(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    private static long m3450a(long j, long j2) {
        long j3 = (j2 ^ j) * -4132994306676758123L;
        j3 = ((j3 ^ (j3 >>> 47)) ^ j) * -4132994306676758123L;
        return (j3 ^ (j3 >>> 47)) * -4132994306676758123L;
    }

    /* renamed from: g */
    public static byte m3501g(Parcel parcel, int i) {
        htl.m3464a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: h */
    public static int m3502h(Parcel parcel, int i) {
        htl.m3464a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: a */
    public static String m3459a(ibr ibr) {
        String valueOf;
        String str;
        if (ibr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            htl.m3477a(null, (Object) ibr, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            str = "Error printing proto: ";
            return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            str = "Error printing proto: ";
            return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        }
    }

    /* renamed from: b */
    public static int m3485b(int i) {
        return (char) i;
    }

    /* renamed from: i */
    public static long m3503i(Parcel parcel, int i) {
        htl.m3464a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: a */
    public static String m3461a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: b */
    private static String m3490b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static long m3451a(byte[] bArr) {
        long j;
        long a;
        int length = bArr.length;
        int i;
        int i2;
        long j2;
        long rotateRight;
        long rotateRight2;
        if (length <= 32) {
            int i3 = length & -8;
            i = length & 7;
            j = -1397348546323613475L ^ (((long) length) * -4132994306676758123L);
            i2 = 0;
            while (i2 < i3) {
                a = htl.m3452a(bArr, i2) * -4132994306676758123L;
                i2 += 8;
                j = -4132994306676758123L * (j ^ ((a ^ (a >>> 47)) * -4132994306676758123L));
            }
            if (i != 0) {
                j2 = 0;
                for (int i4 = 0; i4 < Math.min(i, 8); i4++) {
                    j2 |= (((long) bArr[i3 + i4]) & 255) << (i4 << 3);
                }
                j = (j ^ j2) * -4132994306676758123L;
            }
            j = (j ^ (j >>> 47)) * -4132994306676758123L;
            a = j ^ (j >>> 47);
        } else if (length <= 64) {
            j = htl.m3452a(bArr, 24);
            i2 = length - 16;
            a = htl.m3452a(bArr, 0) + ((((long) length) + htl.m3452a(bArr, i2)) * -6505348102511208375L);
            long rotateRight3 = Long.rotateRight(a + j, 52);
            long rotateRight4 = Long.rotateRight(a, 37);
            a += htl.m3452a(bArr, 8);
            long rotateRight5 = Long.rotateRight(a, 7);
            a += htl.m3452a(bArr, 16);
            rotateRight3 = (rotateRight3 + Long.rotateRight(a, 31)) + (rotateRight4 + rotateRight5);
            rotateRight4 = htl.m3452a(bArr, 16) + htl.m3452a(bArr, length - 32);
            rotateRight5 = htl.m3452a(bArr, length - 8);
            rotateRight = Long.rotateRight(rotateRight4 + rotateRight5, 52);
            rotateRight2 = Long.rotateRight(rotateRight4, 37);
            rotateRight4 += htl.m3452a(bArr, length - 24);
            j2 = htl.m3452a(bArr, i2) + rotateRight4;
            j = (((j + a) + ((Long.rotateRight(j2, 31) + rotateRight) + (rotateRight2 + Long.rotateRight(rotateRight4, 7)))) * -4288712594273399085L) + (((j2 + rotateRight5) + rotateRight3) * -6505348102511208375L);
            j = ((j ^ (j >>> 47)) * -6505348102511208375L) + rotateRight3;
            a = (j ^ (j >>> 47)) * -4288712594273399085L;
        } else {
            rotateRight2 = htl.m3452a(bArr, 0);
            a = htl.m3452a(bArr, length - 16) ^ -8261664234251669945L;
            long a2 = htl.m3452a(bArr, length - 56);
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            j2 = (long) length;
            htl.m3480a(bArr, length - 64, j2, a, jArr);
            htl.m3480a(bArr, length - 32, j2 * -8261664234251669945L, -6505348102511208375L, jArr2);
            j = jArr[1];
            j2 = (-6505348102511208375L ^ a2) + ((j ^ (j >>> 47)) * -8261664234251669945L);
            rotateRight = Long.rotateRight(a, 33) * -8261664234251669945L;
            int i5 = (length - 1) & -64;
            int i6 = 0;
            a = -8261664234251669945L * Long.rotateRight(j2 + rotateRight2, 39);
            while (true) {
                i = i5;
                rotateRight2 = (Long.rotateRight(((a + rotateRight) + jArr[0]) + htl.m3452a(bArr, i6 + 16), 37) * -8261664234251669945L) ^ jArr2[1];
                rotateRight = (-8261664234251669945L * Long.rotateRight((jArr[1] + rotateRight) + htl.m3452a(bArr, i6 + 48), 42)) ^ jArr[0];
                a2 = Long.rotateRight(j2 ^ jArr2[0], 33);
                htl.m3480a(bArr, i6, jArr[1] * -8261664234251669945L, jArr2[0] + rotateRight2, jArr);
                htl.m3480a(bArr, i6 + 32, a2 + jArr2[1], rotateRight, jArr2);
                i6 += 64;
                i5 = i - 64;
                if (i5 == 0) {
                    break;
                }
                j2 = rotateRight2;
                a = a2;
            }
            a = htl.m3450a((htl.m3450a(jArr[0], jArr2[0]) + (((rotateRight >>> 47) ^ rotateRight) * -8261664234251669945L)) + rotateRight2, htl.m3450a(jArr[1], jArr2[1]) + a2);
        }
        j = htl.m3450a((length >= 9 ? htl.m3452a(bArr, length - 8) : -6505348102511208375L) + a, length >= 8 ? htl.m3452a(bArr, 0) : -6505348102511208375L);
        return (j == 0 || j == 1) ? j - 2 : j;
    }

    /* renamed from: j */
    public static String m3504j(Parcel parcel, int i) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(d + dataPosition);
        return readString;
    }

    /* renamed from: k */
    public static IBinder m3505k(Parcel parcel, int i) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(d + dataPosition);
        return readStrongBinder;
    }

    /* renamed from: l */
    public static Bundle m3506l(Parcel parcel, int i) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(d + dataPosition);
        return readBundle;
    }

    /* renamed from: m */
    public static byte[] m3507m(Parcel parcel, int i) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(d + dataPosition);
        return createByteArray;
    }

    /* renamed from: n */
    public static int[] m3508n(Parcel parcel, int i) {
        int d = htl.m3498d(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (d == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(d + dataPosition);
        return createIntArray;
    }
}
