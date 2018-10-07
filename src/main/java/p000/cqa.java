package p000;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;

/* compiled from: PG */
/* renamed from: cqa */
public final class cqa extends cpp {
    /* renamed from: c */
    private cqo f23669c;

    public cqa(Context context, hfz hfz, cqo cqo, cqf cqf) {
        super(context, hfz);
        jri.m13404b((Object) cqo);
        this.f23669c = cqo;
    }

    /* renamed from: a */
    public final void mo7818a() {
        this.f13110b.mo7818a();
        mo7820a(this.f23669c);
    }

    /* renamed from: a */
    public final View mo7815a(View view, cre cre, cpx cpx) {
        err e = cre.mo5692e();
        err err = this.f23669c;
        if (e == err) {
            return err.mo6527a(kbg.m4803b(view), this.f13110b, false, cpx);
        }
        return this.f13110b.mo7815a(view, cre, cpx);
    }

    /* renamed from: b */
    public final void mo7830b(cre cre) {
        if (cre == cre.f2792c || cre.mo5692e() == this.f23669c) {
            throw new UnsupportedOperationException("cannot remove fixed last item node");
        }
        this.f13110b.mo7830b(cre);
    }

    /* renamed from: f */
    public final AsyncTask mo7840f(int i) {
        if (i != this.f13110b.mo7835d() - 1) {
            return this.f13110b.mo7840f(i);
        }
        cqf.m1454a(this.f13109a, this.f23669c);
        return null;
    }

    /* renamed from: a */
    public final void mo7821a(cre cre, err err) {
        if (cre == cre.f2792c || cre.mo5692e() == this.f23669c) {
            throw new UnsupportedOperationException("cannot update fixed last item");
        }
        this.f13110b.mo7821a(cre, err);
    }
}
