package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ebp */
public final class ebp extends BaseAdapter {
    /* renamed from: a */
    private final Context f3717a;
    /* renamed from: b */
    private final cqd f3718b;
    /* renamed from: c */
    private final ArrayList f3719c;
    /* renamed from: d */
    private final Locale f3720d = Locale.getDefault();
    /* renamed from: e */
    private final DecimalFormat f3721e = new DecimalFormat(".####");
    /* renamed from: f */
    private int f3722f = -1;
    /* renamed from: g */
    private int f3723g = -1;

    public ebp(Context context, cqd cqd) {
        String string;
        int i;
        this.f3717a = context;
        this.f3718b = cqd;
        this.f3719c = new ArrayList(cqd.f2763a.size());
        Iterator it = cqd.iterator();
        Object obj = 1;
        String str = null;
        while (it.hasNext()) {
            String str2;
            Object obj2;
            Object obj3;
            Object format;
            Entry entry = (Entry) it.next();
            Object obj4;
            String str3;
            switch (((Integer) entry.getKey()).intValue()) {
                case 5:
                    this.f3722f = this.f3719c.size();
                    if (!entry.getValue().toString().equalsIgnoreCase("0")) {
                        obj4 = obj;
                        str2 = str;
                        str = m1794a(entry.getValue());
                        obj2 = obj4;
                        break;
                    }
                    obj2 = null;
                    str3 = str;
                    str = context.getString(R.string.unknown);
                    str2 = str3;
                    break;
                case 6:
                    this.f3723g = this.f3719c.size();
                    if (!entry.getValue().toString().equalsIgnoreCase("0")) {
                        obj4 = obj;
                        str2 = str;
                        str = m1794a(entry.getValue());
                        obj2 = obj4;
                        break;
                    }
                    obj2 = null;
                    str3 = str;
                    str = context.getString(R.string.unknown);
                    str2 = str3;
                    break;
                case 10:
                    obj4 = obj;
                    str2 = str;
                    str = Formatter.formatFileSize(context, ((Long) entry.getValue()).longValue());
                    obj2 = obj4;
                    break;
                case 102:
                    if ((((cqe) entry.getValue()).f2766b & cqe.f2765a) == 0) {
                        obj4 = obj;
                        str2 = str;
                        str = context.getString(R.string.flash_off);
                        obj2 = obj4;
                        break;
                    }
                    obj4 = obj;
                    str2 = str;
                    str = context.getString(R.string.flash_on);
                    obj2 = obj4;
                    break;
                case 103:
                    obj4 = obj;
                    str2 = str;
                    str = this.f3721e.format(Double.parseDouble(entry.getValue().toString()));
                    obj2 = obj4;
                    break;
                case 104:
                    if ("1".equals(entry.getValue())) {
                        string = context.getString(R.string.manual);
                    } else {
                        string = context.getString(R.string.auto);
                    }
                    obj4 = obj;
                    str2 = str;
                    str = string;
                    obj2 = obj4;
                    break;
                case 107:
                    double parseDouble = Double.parseDouble((String) entry.getValue());
                    if (parseDouble >= 1.0d) {
                        i = (int) parseDouble;
                        parseDouble -= (double) i;
                        string = String.valueOf(String.valueOf(i)).concat("''");
                        if (parseDouble > 1.0E-4d) {
                            String valueOf = String.valueOf(string);
                            string = String.valueOf(String.format(this.f3720d, " %d/%d", new Object[]{Integer.valueOf(1), Integer.valueOf((int) ((1.0d / parseDouble) + 0.5d))}));
                            if (string.length() == 0) {
                                string = new String(valueOf);
                            } else {
                                string = valueOf.concat(string);
                            }
                        }
                        obj4 = obj;
                        str2 = str;
                        str = string;
                        obj2 = obj4;
                        break;
                    }
                    obj4 = obj;
                    str2 = str;
                    str = String.format(this.f3720d, "%d/%d", new Object[]{Integer.valueOf(1), Integer.valueOf((int) ((1.0d / parseDouble) + 0.5d))});
                    obj2 = obj4;
                    break;
                case 108:
                    obj4 = obj;
                    str2 = str;
                    str = m1793a(Integer.parseInt((String) entry.getValue()));
                    obj2 = obj4;
                    break;
                case 200:
                    string = String.valueOf(entry.getValue().toString());
                    str = "\n";
                    if (string.length() == 0) {
                        string = new String(str);
                    } else {
                        string = str.concat(string);
                    }
                    obj4 = obj;
                    str2 = entry.getValue().toString();
                    str = string;
                    obj2 = obj4;
                    break;
                default:
                    obj2 = entry.getValue();
                    if (obj2 != null) {
                        obj4 = obj;
                        str2 = str;
                        obj3 = obj2.toString();
                        obj2 = obj4;
                        break;
                    }
                    throw new AssertionError(String.format("%s's value is Null", new Object[]{dta.m9506a(context, ((Integer) entry.getKey()).intValue())}));
            }
            if (cqd.f2764b.indexOfKey(((Integer) entry.getKey()).intValue()) >= 0) {
                format = String.format("%s: %s %s", new Object[]{dta.m9506a(context, ((Integer) entry.getKey()).intValue()), obj3, context.getString(cqd.f2764b.get(((Integer) entry.getKey()).intValue()))});
            } else {
                format = String.format("%s: %s", new Object[]{dta.m9506a(context, ((Integer) entry.getKey()).intValue()), obj3});
            }
            this.f3719c.add(format);
            str = str2;
            obj = obj2;
        }
        if (obj == null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            if (decodeFile != null) {
                i = decodeFile.getWidth();
                int height = decodeFile.getHeight();
                if (i != 0 && height != 0) {
                    string = String.format(this.f3720d, "%s: %d", new Object[]{dta.m9506a(this.f3717a, 5), Integer.valueOf(i)});
                    String format2 = String.format(this.f3720d, "%s: %d", new Object[]{dta.m9506a(this.f3717a, 6), Integer.valueOf(height)});
                    this.f3719c.set(this.f3722f, String.valueOf(string));
                    this.f3719c.set(this.f3723g, String.valueOf(format2));
                    notifyDataSetChanged();
                }
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        return this.f3719c.size();
    }

    public final Object getItem(int i) {
        return this.f3718b.f2763a.get(Integer.valueOf(i));
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = (TextView) LayoutInflater.from(this.f3717a).inflate(R.layout.details, viewGroup, false);
        } else {
            TextView textView = (TextView) view;
        }
        view.setText((CharSequence) this.f3719c.get(i));
        return view;
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    /* renamed from: a */
    private final String m1794a(Object obj) {
        if (obj instanceof Integer) {
            return m1793a(((Integer) obj).intValue());
        }
        String obj2 = obj.toString();
        try {
            return m1793a(Integer.parseInt(obj2));
        } catch (NumberFormatException e) {
            return obj2;
        }
    }

    /* renamed from: a */
    private final String m1793a(int i) {
        return String.format(this.f3720d, "%d", new Object[]{Integer.valueOf(i)});
    }
}
