package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmz */
public final class cmz extends C0314jl {
    /* renamed from: a */
    public final /* synthetic */ cmp f12734a;

    public cmz(cmp cmp) {
        this.f12734a = cmp;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) this.f12734a.f2356l.get((Uri) obj));
        this.f12734a.f2356l.remove(obj);
    }

    public final int getCount() {
        return this.f12734a.f2346b.size();
    }

    public final int getItemPosition(Object obj) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f12734a.f2346b.size()) {
                return -2;
            }
            if (((cot) this.f12734a.f2346b.get(i2)).f13151c.f13139e.f4384h.equals(obj)) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        acj a;
        ImageView kvr = new kvr(this.f12734a.f2353i);
        kvr.setLayoutParams(new LayoutParams(-1, -1));
        kvr.setScaleType(ScaleType.FIT_CENTER);
        kvr.setContentDescription(kvr.getResources().getString(R.string.burst_editor_frame_description, new Object[]{Integer.valueOf(i + 1)}));
        kvr.setOnClickListener(new cna(this));
        eru eru = ((cot) this.f12734a.f2346b.get(i)).f13151c.f13139e;
        acj a2 = acc.m100b(this.f12734a.f2353i).mo11609a(Drawable.class).mo125a(eru.f4384h).mo124a(new aqg().mo1701a(new ColorDrawable(-16777216)).mo1695a(new are(eru.f4380d, eru.f4382f.getTime(), 0)));
        cmy cmy = this.f12734a.f2345a;
        Uri uri = eru.f4384h;
        for (int i2 = 0; i2 < cmy.f2372a.f12715m.mo2373b(); i2++) {
            cmf a3 = cmy.f2372a.f12715m.mo2371a(i2);
            if (!a3.mo2374a() && kbf.m16778b(a3.f2321a.f13151c.f13139e.f4384h, uri)) {
                cng b = cmy.f2372a.f12712j.mo2403b(i2);
                if (b != null) {
                    a = b.f23221t.clone();
                    break;
                }
            }
        }
        a = null;
        if (a != null) {
            a2.f238c = a;
        }
        a2.mo128a(kvr);
        viewGroup.addView(kvr);
        this.f12734a.f2356l.put(eru.f4384h, kvr);
        return eru.f4384h;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return this.f12734a.f2356l.get((Uri) obj) == view;
    }
}
