package p000;

import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ux */
public class C0530ux {
    /* renamed from: p */
    private static final List f9876p = Collections.EMPTY_LIST;
    /* renamed from: a */
    public final View f9877a;
    /* renamed from: b */
    public WeakReference f9878b;
    /* renamed from: c */
    public int f9879c = -1;
    /* renamed from: d */
    public int f9880d = -1;
    /* renamed from: e */
    public long f9881e = -1;
    /* renamed from: f */
    public int f9882f = -1;
    /* renamed from: g */
    public int f9883g = -1;
    /* renamed from: h */
    public C0530ux f9884h = null;
    /* renamed from: i */
    public C0530ux f9885i = null;
    /* renamed from: j */
    public int f9886j;
    /* renamed from: k */
    public C0524up f9887k = null;
    /* renamed from: l */
    public boolean f9888l = false;
    /* renamed from: m */
    public int f9889m = 0;
    /* renamed from: n */
    public int f9890n = -1;
    /* renamed from: o */
    public RecyclerView f9891o;
    /* renamed from: q */
    private List f9892q = null;
    /* renamed from: r */
    private List f9893r = null;
    /* renamed from: s */
    private int f9894s = 0;

    public C0530ux(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f9877a = view;
    }

    /* renamed from: a */
    public final void mo11314a(Object obj) {
        if (obj == null) {
            mo11311a(1024);
        } else if ((this.f9886j & 1024) == 0) {
            if (this.f9892q == null) {
                this.f9892q = new ArrayList();
                this.f9893r = Collections.unmodifiableList(this.f9892q);
            }
            this.f9892q.add(obj);
        }
    }

    /* renamed from: a */
    public final void mo11311a(int i) {
        this.f9886j |= i;
    }

    /* renamed from: a */
    public final void mo11310a() {
        this.f9880d = -1;
        this.f9883g = -1;
    }

    /* renamed from: b */
    final void mo11317b() {
        List list = this.f9892q;
        if (list != null) {
            list.clear();
        }
        this.f9886j &= -1025;
    }

    /* renamed from: c */
    final void mo11319c() {
        this.f9886j &= -33;
    }

    /* renamed from: d */
    public final void mo11320d() {
        this.f9886j &= -257;
    }

    /* renamed from: e */
    public final int mo11321e() {
        RecyclerView recyclerView = this.f9891o;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.mo1130c(this);
    }

    /* renamed from: f */
    public final int mo11322f() {
        int i = this.f9883g;
        return i == -1 ? this.f9879c : i;
    }

    /* renamed from: g */
    public final List mo11323g() {
        if ((this.f9886j & 1024) != 0) {
            return f9876p;
        }
        List list = this.f9892q;
        if (list == null || list.size() == 0) {
            return f9876p;
        }
        return this.f9893r;
    }

    /* renamed from: b */
    public final boolean mo11318b(int i) {
        return (this.f9886j & i) != 0;
    }

    /* renamed from: h */
    public final boolean mo11324h() {
        return (this.f9886j & 4) != 0;
    }

    /* renamed from: i */
    public final boolean mo11325i() {
        return (this.f9886j & 16) == 0 && !C0315jm.m4647v(this.f9877a);
    }

    /* renamed from: j */
    public final boolean mo11326j() {
        return (this.f9886j & 8) != 0;
    }

    /* renamed from: k */
    final boolean mo11327k() {
        return this.f9887k != null;
    }

    /* renamed from: l */
    public final boolean mo11328l() {
        return (this.f9886j & 256) != 0;
    }

    /* renamed from: m */
    public final boolean mo11329m() {
        return (this.f9886j & 2) != 0;
    }

    /* renamed from: n */
    final boolean mo11330n() {
        return (this.f9886j & 2) != 0;
    }

    /* renamed from: a */
    public final void mo11313a(int i, boolean z) {
        if (this.f9880d == -1) {
            this.f9880d = this.f9879c;
        }
        if (this.f9883g == -1) {
            this.f9883g = this.f9879c;
        }
        if (z) {
            this.f9883g += i;
        }
        this.f9879c += i;
        if (this.f9877a.getLayoutParams() != null) {
            ((C0519uk) this.f9877a.getLayoutParams()).f9834e = true;
        }
    }

    /* renamed from: o */
    final void mo11331o() {
        this.f9886j = 0;
        this.f9879c = -1;
        this.f9880d = -1;
        this.f9881e = -1;
        this.f9883g = -1;
        this.f9894s = 0;
        this.f9884h = null;
        this.f9885i = null;
        mo11317b();
        this.f9889m = 0;
        this.f9890n = -1;
        RecyclerView.m452b(this);
    }

    /* renamed from: a */
    public final void mo11312a(int i, int i2) {
        this.f9886j = (this.f9886j & (i2 ^ -1)) | (i & i2);
    }

    /* renamed from: a */
    public final void mo11316a(boolean z) {
        int i;
        if (z) {
            i = this.f9894s - 1;
        } else {
            i = this.f9894s + 1;
        }
        this.f9894s = i;
        i = this.f9894s;
        if (i < 0) {
            this.f9894s = 0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
            stringBuilder.append(this);
            Log.e("View", stringBuilder.toString());
        } else if (!z && i == 1) {
            this.f9886j |= 16;
        } else if (z && i == 0) {
            this.f9886j &= -17;
        }
    }

    /* renamed from: a */
    final void mo11315a(C0524up c0524up, boolean z) {
        this.f9887k = c0524up;
        this.f9888l = z;
    }

    /* renamed from: p */
    public final boolean mo11332p() {
        return (this.f9886j & 128) != 0;
    }

    public String toString() {
        Object obj;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ViewHolder{");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(" position=");
        stringBuilder.append(this.f9879c);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f9881e);
        stringBuilder.append(", oldPos=");
        stringBuilder.append(this.f9880d);
        stringBuilder.append(", pLpos:");
        stringBuilder.append(this.f9883g);
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        if (mo11327k()) {
            String str;
            stringBuilder2.append(" scrap ");
            if (this.f9888l) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            stringBuilder2.append(str);
        }
        if (mo11324h()) {
            stringBuilder2.append(" invalid");
        }
        if ((this.f9886j & 1) == 0) {
            stringBuilder2.append(" unbound");
        }
        if (mo11330n()) {
            stringBuilder2.append(" update");
        }
        if (mo11326j()) {
            stringBuilder2.append(" removed");
        }
        if (mo11332p()) {
            stringBuilder2.append(" ignored");
        }
        if (mo11328l()) {
            stringBuilder2.append(" tmpDetached");
        }
        if (!mo11325i()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(" not recyclable(");
            stringBuilder.append(this.f9894s);
            stringBuilder.append(")");
            stringBuilder2.append(stringBuilder.toString());
        }
        int obj2;
        if ((this.f9886j & 512) != 0) {
            obj2 = 1;
        } else if (mo11324h()) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            stringBuilder2.append(" undefined adapter position");
        }
        if (this.f9877a.getParent() == null) {
            stringBuilder2.append(" no parent");
        }
        stringBuilder2.append("}");
        return stringBuilder2.toString();
    }

    /* renamed from: q */
    final void mo11333q() {
        this.f9887k.mo11297b(this);
    }

    /* renamed from: r */
    final boolean mo11334r() {
        return (this.f9886j & 32) != 0;
    }
}
