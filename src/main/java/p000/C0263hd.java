package p000;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.p001v4.app.NotificationCompat.MessagingStyle.Message;
import android.util.Log;

/* compiled from: PG */
/* renamed from: hd */
public final class C0263hd {
    /* renamed from: f */
    public static final Mode f6369f = Mode.SRC_IN;
    /* renamed from: a */
    public final int f6370a;
    /* renamed from: b */
    public Object f6371b;
    /* renamed from: c */
    public int f6372c;
    /* renamed from: d */
    public int f6373d;
    /* renamed from: e */
    public ColorStateList f6374e = null;
    /* renamed from: g */
    public Mode f6375g = f6369f;

    private C0263hd(int i) {
        this.f6370a = i;
    }

    /* renamed from: a */
    public static C0263hd m3131a(Bundle bundle) {
        int i = bundle.getInt(Message.KEY_DATA_MIME_TYPE);
        C0263hd c0263hd = new C0263hd(i);
        c0263hd.f6372c = bundle.getInt("int1");
        c0263hd.f6373d = bundle.getInt("int2");
        if (bundle.containsKey("tint_list")) {
            c0263hd.f6374e = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            c0263hd.f6375g = Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                c0263hd.f6371b = bundle.getParcelable("obj");
                break;
            case 2:
            case 4:
                c0263hd.f6371b = bundle.getString("obj");
                break;
            case 3:
                c0263hd.f6371b = bundle.getByteArray("obj");
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown type ");
                stringBuilder.append(i);
                Log.w("IconCompat", stringBuilder.toString());
                return null;
        }
        return c0263hd;
    }

    public final String toString() {
        if (this.f6370a == -1) {
            return String.valueOf(this.f6371b);
        }
        String str;
        StringBuilder stringBuilder = new StringBuilder("Icon(typ=");
        switch (this.f6370a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        stringBuilder.append(str);
        switch (this.f6370a) {
            case 1:
            case 5:
                stringBuilder.append(" size=");
                stringBuilder.append(((Bitmap) this.f6371b).getWidth());
                stringBuilder.append("x");
                stringBuilder.append(((Bitmap) this.f6371b).getHeight());
                break;
            case 2:
                stringBuilder.append(" pkg=");
                int i = this.f6370a;
                if (i == -1) {
                    str = ((Icon) this.f6371b).getResPackage();
                } else if (i != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("called getResPackage() on ");
                    stringBuilder.append(this);
                    throw new IllegalStateException(stringBuilder.toString());
                } else {
                    str = (String) this.f6371b;
                }
                stringBuilder.append(str);
                stringBuilder.append(" id=");
                Object[] objArr = new Object[1];
                i = this.f6370a;
                if (i == -1) {
                    i = ((Icon) this.f6371b).getResId();
                } else if (i != 2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("called getResId() on ");
                    stringBuilder.append(this);
                    throw new IllegalStateException(stringBuilder.toString());
                } else {
                    i = this.f6372c;
                }
                objArr[0] = Integer.valueOf(i);
                stringBuilder.append(String.format("0x%08x", objArr));
                break;
            case 3:
                stringBuilder.append(" len=");
                stringBuilder.append(this.f6372c);
                if (this.f6373d != 0) {
                    stringBuilder.append(" off=");
                    stringBuilder.append(this.f6373d);
                    break;
                }
                break;
            case 4:
                stringBuilder.append(" uri=");
                stringBuilder.append(this.f6371b);
                break;
        }
        if (this.f6374e != null) {
            stringBuilder.append(" tint=");
            stringBuilder.append(this.f6374e);
        }
        if (this.f6375g != f6369f) {
            stringBuilder.append(" mode=");
            stringBuilder.append(this.f6375g);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
