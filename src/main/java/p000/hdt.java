package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hdt */
public final class hdt extends BaseAdapter {
    /* renamed from: b */
    public static final String f6434b = bli.m887a("TbxMnuAdap");
    /* renamed from: a */
    public final List f6435a = new ArrayList();
    /* renamed from: c */
    private final Context f6436c;
    /* renamed from: d */
    private final ilp f6437d;
    /* renamed from: e */
    private final ilp f6438e;
    /* renamed from: f */
    private final ilp f6439f;
    /* renamed from: g */
    private final boolean f6440g;

    public hdt(Context context, fbn fbn, boolean z, ilp ilp, ilp ilp2, ilp ilp3, ikd ikd, aws aws, gyl gyl, boolean z2) {
        this.f6436c = context;
        this.f6437d = ilp;
        this.f6438e = ilp2;
        this.f6439f = ilp3;
        this.f6440g = z2;
        if (fbn.mo9095d()) {
            this.f6435a.add(hhx.SLOW_MOTION);
        }
        this.f6435a.add(hhx.PANORAMA);
        this.f6435a.add(hhx.PHOTO_SPHERE);
        if (z) {
            this.f6435a.add(hhx.PORTRAIT);
        } else {
            this.f6435a.add(hhx.LENS_BLUR);
        }
        this.f6435a.add(hhx.SETTINGS);
        if (hak.m3034a(context)) {
            List list = this.f6435a;
            list.add(list.size() - 1, hhx.ORNAMENT);
            notifyDataSetChanged();
        }
        kow.m13878a(gyl.mo7547a(), new hdx(this), ikd);
        aws.mo1824a().mo8557a(this.f6437d.mo13672a(new hdu(this), ikd));
        aws.mo1824a().mo8557a(this.f6438e.mo13672a(new hdv(this), ikd));
        aws.mo1824a().mo8557a(this.f6439f.mo13672a(new hdw(this), ikd));
    }

    public final int getCount() {
        return this.f6435a.size();
    }

    public final Object getItem(int i) {
        return this.f6435a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f6436c).inflate(R.layout.toybox_menu_item, viewGroup, false);
        }
        hhx hhx = (hhx) getItem(i);
        Resources resources = this.f6436c.getResources();
        TextView textView = (TextView) jqk.m13354c((TextView) view.findViewById(R.id.menu_item_title));
        textView.setText(resources.getString(hhx.f6580o));
        textView.setContentDescription(resources.getString(hhx.f6581p));
        ((ImageView) jqk.m13354c((ImageView) view.findViewById(R.id.menu_item_icon))).setImageDrawable(hhx.mo7878a(resources));
        if (!this.f6440g) {
            ImageView imageView;
            if (hhx.equals(hhx.PORTRAIT)) {
                imageView = (ImageView) view.findViewById(R.id.menu_item_dot);
                if (imageView != null) {
                    if (((Boolean) this.f6437d.mo13673b()).booleanValue()) {
                        ((ViewGroup) imageView.getParent()).removeView(imageView);
                    } else {
                        imageView.setVisibility(0);
                    }
                }
            }
            if (hhx.equals(hhx.ORNAMENT)) {
                imageView = (ImageView) view.findViewById(R.id.menu_item_dot);
                if (imageView != null) {
                    if (((Boolean) this.f6438e.mo13673b()).booleanValue()) {
                        ((ViewGroup) imageView.getParent()).removeView(imageView);
                    } else {
                        imageView.setVisibility(0);
                    }
                }
            }
            if (hhx.equals(hhx.LENS)) {
                ImageView imageView2 = (ImageView) view.findViewById(R.id.menu_item_dot);
                if (imageView2 != null) {
                    if (((Boolean) this.f6439f.mo13673b()).booleanValue()) {
                        ((ViewGroup) imageView2.getParent()).removeView(imageView2);
                    } else {
                        imageView2.setVisibility(0);
                    }
                }
            }
        }
        return view;
    }
}
