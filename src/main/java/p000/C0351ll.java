package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Process;
import android.support.p001v4.app.AppOpsManagerCompat;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* renamed from: ll */
public final class C0351ll {
    /* renamed from: a */
    public final C0248gk f9147a;
    /* renamed from: b */
    public final Object[] f9148b;

    public C0351ll(C0248gk c0248gk, Object... objArr) {
        this.f9147a = c0248gk;
        this.f9148b = objArr;
    }

    /* renamed from: a */
    public static int m5566a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
        if (permissionToOp == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        if (AppOpsManagerCompat.noteProxyOpNoThrow(context, permissionToOp, packageName) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: a */
    public static Typeface m5567a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0722mz c0722mz) {
        StringBuilder stringBuilder;
        if (typedValue.string == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Resource \"");
            stringBuilder.append(resources.getResourceName(i));
            stringBuilder.append("\" (");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(") is not a Font: ");
            stringBuilder.append(typedValue);
            throw new NotFoundException(stringBuilder.toString());
        }
        String charSequence = typedValue.string.toString();
        if (charSequence.startsWith("res/")) {
            Typeface typeface = (Typeface) C0260gw.f6083b.mo8653a(C0260gw.m2903a(resources, i, i2));
            if (typeface != null) {
                c0722mz.mo14244a(typeface, null);
                return typeface;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    int next;
                    XmlPullParser xml = resources.getXml(i);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    C0254gq c0254gq;
                    xml.require(2, null, "font-family");
                    if (xml.getName().equals("font-family")) {
                        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), C0045aq.f880a);
                        String string = obtainAttributes.getString(0);
                        String string2 = obtainAttributes.getString(1);
                        String string3 = obtainAttributes.getString(2);
                        int resourceId = obtainAttributes.getResourceId(3, 0);
                        int integer = obtainAttributes.getInteger(4, 1);
                        int integer2 = obtainAttributes.getInteger(5, 500);
                        obtainAttributes.recycle();
                        if (string == null || string2 == null || string3 == null) {
                            List arrayList = new ArrayList();
                            while (xml.next() != 3) {
                                if (xml.getEventType() == 2) {
                                    if (xml.getName().equals("font")) {
                                        boolean z;
                                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xml), C0045aq.f881b);
                                        if (obtainAttributes2.hasValue(7)) {
                                            next = C0045aq.f890k;
                                        } else {
                                            next = C0045aq.f885f;
                                        }
                                        int i3 = obtainAttributes2.getInt(next, 400);
                                        if (obtainAttributes2.hasValue(5)) {
                                            next = C0045aq.f888i;
                                        } else {
                                            next = C0045aq.f883d;
                                        }
                                        if (obtainAttributes2.getInt(next, 0) == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (obtainAttributes2.hasValue(9)) {
                                            resourceId = C0045aq.f891l;
                                        } else {
                                            resourceId = C0045aq.f886g;
                                        }
                                        if (obtainAttributes2.hasValue(8)) {
                                            next = C0045aq.f889j;
                                        } else {
                                            next = C0045aq.f884e;
                                        }
                                        string3 = obtainAttributes2.getString(next);
                                        integer = obtainAttributes2.getInt(resourceId, 0);
                                        if (obtainAttributes2.hasValue(6)) {
                                            next = C0045aq.f887h;
                                        } else {
                                            next = C0045aq.f882c;
                                        }
                                        integer2 = obtainAttributes2.getResourceId(next, 0);
                                        String string4 = obtainAttributes2.getString(next);
                                        obtainAttributes2.recycle();
                                        while (xml.next() != 3) {
                                            C0351ll.m5570a(xml);
                                        }
                                        arrayList.add(new C0437qr(string4, i3, z, string3, integer, integer2));
                                    } else {
                                        C0351ll.m5570a(xml);
                                    }
                                }
                            }
                            if (arrayList.isEmpty()) {
                                c0254gq = null;
                            } else {
                                c0254gq = new C0723na((C0437qr[]) arrayList.toArray(new C0437qr[arrayList.size()]));
                            }
                        } else {
                            while (xml.next() != 3) {
                                C0351ll.m5570a(xml);
                            }
                            c0254gq = new C0255gr(new C0268hj(string, string2, string3, C0351ll.m5568a(resources, resourceId)), integer, integer2);
                        }
                    } else {
                        C0351ll.m5570a(xml);
                        c0254gq = null;
                    }
                    if (c0254gq != null) {
                        return C0260gw.m2902a(context, c0254gq, resources, i, i2, c0722mz, null, true);
                    }
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    c0722mz.mo14242a(-3, null);
                    return null;
                }
                typeface = C0260gw.m2901a(context, resources, i, charSequence, i2);
                if (typeface != null) {
                    c0722mz.mo14244a(typeface, null);
                    return typeface;
                }
                c0722mz.mo14242a(-3, null);
                return typeface;
            } catch (Throwable e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to parse xml resource ");
                stringBuilder.append(charSequence);
                Log.e("ResourcesCompat", stringBuilder.toString(), e);
                c0722mz.mo14242a(-3, null);
                return null;
            } catch (Throwable e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to read xml resource ");
                stringBuilder.append(charSequence);
                Log.e("ResourcesCompat", stringBuilder.toString(), e2);
                c0722mz.mo14242a(-3, null);
                return null;
            }
        }
        c0722mz.mo14242a(-3, null);
        return null;
    }

    /* renamed from: a */
    public static List m5568a(Resources resources, int i) {
        List list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                List arrayList = new ArrayList();
                if (obtainTypedArray.getResourceId(0, 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(C0351ll.m5569a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(C0351ll.m5569a(resources.getStringArray(i)));
                }
                list = arrayList;
            }
            obtainTypedArray.recycle();
        }
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    private static void m5570a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private static List m5569a(String[] strArr) {
        List arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
