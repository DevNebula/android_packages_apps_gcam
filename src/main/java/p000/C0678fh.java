package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: fh */
public final class C0678fh extends C0219ex {
    /* renamed from: p */
    public ArrayList f18266p;
    /* renamed from: q */
    public boolean f18267q;
    /* renamed from: r */
    public int f18268r;
    /* renamed from: s */
    public boolean f18269s;
    /* renamed from: t */
    private int f18270t;

    public C0678fh() {
        this.f18266p = new ArrayList();
        this.f18267q = true;
        this.f18269s = false;
        this.f18270t = 0;
    }

    public C0678fh(byte b) {
        this();
        this.f18267q = false;
        mo13242a(new C0812eo(2)).mo13242a(new C0672ee()).mo13242a(new C0812eo(1));
    }

    /* renamed from: a */
    public final C0678fh mo13242a(C0219ex c0219ex) {
        this.f18266p.add(c0219ex);
        c0219ex.f4539h = this;
        if (this.f4533b >= 0) {
            c0219ex.mo6627a(this.f4533b);
        }
        if ((this.f18270t & 1) != 0) {
            c0219ex.mo6628a(this.f4534c);
        }
        if ((this.f18270t & 2) != 0) {
            c0219ex.mo6635a(this.f4544m);
        }
        if ((this.f18270t & 4) != 0) {
            c0219ex.mo6636a(this.f4546o);
        }
        if ((this.f18270t & 8) != 0) {
            c0219ex.mo6637a(this.f4545n);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo6638a(C0228fl c0228fl) {
        if (mo6647b(c0228fl.f4837b)) {
            ArrayList arrayList = this.f18266p;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                C0219ex c0219ex = (C0219ex) arrayList.get(i);
                if (c0219ex.mo6647b(c0228fl.f4837b)) {
                    c0219ex.mo6638a(c0228fl);
                    c0228fl.f4838c.add(c0219ex);
                    i = i2;
                } else {
                    i = i2;
                }
            }
        }
    }

    /* renamed from: c */
    final void mo6650c(C0228fl c0228fl) {
        super.mo6650c(c0228fl);
        int size = this.f18266p.size();
        for (int i = 0; i < size; i++) {
            ((C0219ex) this.f18266p.get(i)).mo6650c(c0228fl);
        }
    }

    /* renamed from: b */
    public final void mo6646b(C0228fl c0228fl) {
        if (mo6647b(c0228fl.f4837b)) {
            ArrayList arrayList = this.f18266p;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                C0219ex c0219ex = (C0219ex) arrayList.get(i);
                if (c0219ex.mo6647b(c0228fl.f4837b)) {
                    c0219ex.mo6646b(c0228fl);
                    c0228fl.f4838c.add(c0219ex);
                    i = i2;
                } else {
                    i = i2;
                }
            }
        }
    }

    /* renamed from: b */
    public final C0219ex clone() {
        C0678fh c0678fh = (C0678fh) super.clone();
        c0678fh.f18266p = new ArrayList();
        int size = this.f18266p.size();
        for (int i = 0; i < size; i++) {
            c0678fh.mo13242a(((C0219ex) this.f18266p.get(i)).clone());
        }
        return c0678fh;
    }

    /* renamed from: a */
    protected final void mo6633a(ViewGroup viewGroup, C0229fm c0229fm, C0229fm c0229fm2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f4532a;
        int size = this.f18266p.size();
        int i = 0;
        while (i < size) {
            C0219ex c0219ex = (C0219ex) this.f18266p.get(i);
            if (j > 0 && (this.f18267q || i == 0)) {
                long j2 = c0219ex.f4532a;
                if (j2 > 0) {
                    c0219ex.mo6643b(j2 + j);
                } else {
                    c0219ex.mo6643b(j);
                }
            }
            c0219ex.mo6633a(viewGroup, c0229fm, c0229fm2, arrayList, arrayList2);
            i++;
        }
    }

    /* renamed from: a */
    public final C0219ex mo13241a(int i) {
        if (i < 0 || i >= this.f18266p.size()) {
            return null;
        }
        return (C0219ex) this.f18266p.get(i);
    }

    /* renamed from: c */
    public final void mo6649c(View view) {
        super.mo6649c(view);
        int size = this.f18266p.size();
        for (int i = 0; i < size; i++) {
            ((C0219ex) this.f18266p.get(i)).mo6649c(view);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ C0219ex mo6652d(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f18266p.size()) {
                return (C0678fh) super.mo6652d(view);
            }
            ((C0219ex) this.f18266p.get(i2)).mo6652d(view);
            i = i2 + 1;
        }
    }

    /* renamed from: e */
    public final void mo6654e(View view) {
        super.mo6654e(view);
        int size = this.f18266p.size();
        for (int i = 0; i < size; i++) {
            ((C0219ex) this.f18266p.get(i)).mo6654e(view);
        }
    }

    /* renamed from: e */
    protected final void mo6653e() {
        if (this.f18266p.isEmpty()) {
            mo6655f();
            mo6648c();
            return;
        }
        int i;
        C0224fc c0816fj = new C0816fj(this);
        ArrayList arrayList = this.f18266p;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            i = i2 + 1;
            ((C0219ex) arrayList.get(i2)).mo6630a(c0816fj);
            i2 = i;
        }
        this.f18268r = this.f18266p.size();
        if (this.f18267q) {
            ArrayList arrayList2 = this.f18266p;
            int size2 = arrayList2.size();
            i2 = 0;
            while (i2 < size2) {
                i = i2 + 1;
                ((C0219ex) arrayList2.get(i2)).mo6653e();
                i2 = i;
            }
            return;
        }
        i2 = 1;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f18266p.size()) {
                break;
            }
            ((C0219ex) this.f18266p.get(i3 - 1)).mo6630a(new C0815fi((C0219ex) this.f18266p.get(i3)));
            i2 = i3 + 1;
        }
        C0219ex c0219ex = (C0219ex) this.f18266p.get(0);
        if (c0219ex != null) {
            c0219ex.mo6653e();
        }
    }

    /* renamed from: a */
    public final void mo6637a(C0223fb c0223fb) {
        super.mo6637a(c0223fb);
        this.f18270t |= 8;
        int size = this.f18266p.size();
        for (int i = 0; i < size; i++) {
            ((C0219ex) this.f18266p.get(i)).mo6637a(c0223fb);
        }
    }

    /* renamed from: a */
    public final void mo6636a(C0216eu c0216eu) {
        super.mo6636a(c0216eu);
        this.f18270t |= 4;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f18266p.size()) {
                ((C0219ex) this.f18266p.get(i2)).mo6636a(c0216eu);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo6635a(C0635ax c0635ax) {
        super.mo6635a(c0635ax);
        this.f18270t |= 2;
        int size = this.f18266p.size();
        for (int i = 0; i < size; i++) {
            ((C0219ex) this.f18266p.get(i)).mo6635a(c0635ax);
        }
    }

    /* renamed from: a */
    final String mo6632a(String str) {
        String a = super.mo6632a(str);
        int i = 0;
        while (i < this.f18266p.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            C0219ex c0219ex = (C0219ex) this.f18266p.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(c0219ex.mo6632a(stringBuilder2.toString()));
            i++;
            a = stringBuilder.toString();
        }
        return a;
    }
}
