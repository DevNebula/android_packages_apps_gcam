package p000;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: cpy */
public abstract class cpy implements err {
    /* renamed from: a */
    private static final String f13135a = bli.m887a("FilmstripItemBase");
    /* renamed from: b */
    public static final DateFormat f13136b = DateFormat.getDateTimeInstance();
    /* renamed from: c */
    public final Context f13137c;
    /* renamed from: d */
    public final cqb f13138d;
    /* renamed from: e */
    public final eru f13139e;
    /* renamed from: f */
    public eri f13140f = eri.f4342a;
    /* renamed from: g */
    public final ers f13141g;
    /* renamed from: h */
    public iqp f13142h;
    /* renamed from: i */
    public kpw f13143i;

    public cpy(Context context, cqb cqb, eru eru, ers ers) {
        this.f13137c = (Context) jri.m13404b((Object) context);
        this.f13138d = (cqb) jri.m13404b((Object) cqb);
        this.f13139e = (eru) jri.m13404b((Object) eru);
        this.f13141g = (ers) jri.m13404b((Object) ers);
        this.f13142h = cqb.f2757b;
        this.f13143i = kpw.m18486d();
    }

    /* renamed from: a */
    public boolean mo6532a() {
        File file = new File(this.f13139e.f4383g);
        boolean delete = file.delete();
        file = file.getParentFile();
        if (file.exists() && file.isDirectory() && file.list().length == 0) {
            String b = gtu.m2875a().mo7426b();
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f13135a;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(b).length() + 36) + String.valueOf(absolutePath).length());
            stringBuilder.append("CameraPathStr: ");
            stringBuilder.append(b);
            stringBuilder.append("  fileParentPathStr: ");
            stringBuilder.append(absolutePath);
            bli.m888a(str, stringBuilder.toString());
            if (absolutePath.equals(b) && !file.delete()) {
                b = f13135a;
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder2.append("Failed to delete: ");
                stringBuilder2.append(valueOf);
                bli.m888a(b, stringBuilder2.toString());
            }
        }
        return delete;
    }

    /* renamed from: a */
    protected static adl m8717a(eru eru) {
        long time;
        String str = eru.f4380d;
        if (str == null) {
            str = "";
        }
        Date date = eru.f4382f;
        if (date != null) {
            time = date.getTime() / 1000;
        } else {
            time = 0;
        }
        return new are(str, time, eru.f4387k);
    }

    /* renamed from: f */
    public final ers mo6540f() {
        return this.f13141g;
    }

    /* renamed from: a */
    public static long m8716a(err err) {
        if (err == null || err.mo6541g() == null) {
            return -1;
        }
        return err.mo6541g().f4381e.getTime();
    }

    /* renamed from: g */
    public final eru mo6541g() {
        return this.f13139e;
    }

    /* renamed from: h */
    public iqp mo6542h() {
        return this.f13139e.mo6556g();
    }

    /* renamed from: i */
    public final kpk mo6543i() {
        return this.f13143i;
    }

    /* renamed from: j */
    public kbg mo6544j() {
        f13136b.setTimeZone(TimeZone.getDefault());
        cqd cqd = new cqd();
        cqd.mo5667a(1, this.f13139e.f4379c);
        cqd.mo5667a(5, Integer.valueOf(mo6542h().f7695a));
        cqd.mo5667a(6, Integer.valueOf(mo6542h().f7696b));
        cqd.mo5667a(200, this.f13139e.f4383g);
        cqd.mo5667a(3, f13136b.format(this.f13139e.f4382f));
        long j = this.f13139e.f4386j;
        if (j > 0) {
            cqd.mo5667a(10, Long.valueOf(j));
        }
        erx erx = this.f13139e.f4388l;
        if (!erx.equals(erx.f4403a)) {
            cqd.mo5667a(4, erx.mo6564a());
        }
        return kbg.m4804c(cqd);
    }

    /* renamed from: k */
    public final eri mo6545k() {
        return this.f13140f;
    }

    /* renamed from: l */
    public final int mo6546l() {
        return this.f13139e.f4387k;
    }

    /* renamed from: a */
    public boolean mo6533a(cfh cfh, cre cre) {
        return false;
    }

    /* renamed from: a */
    public void mo6529a(View view) {
        this.f13143i = kpw.m18486d();
    }

    /* renamed from: a */
    public static void m8718a(Uri uri, ImageView imageView, gsp gsp) {
        kbg c = gsp.mo7412c(uri);
        if (c.mo9709b()) {
            Drawable f = ((anq) c.mo9706a()).mo262b();
            if (f instanceof Animatable) {
                ((Animatable) f).start();
            }
            imageView.setImageDrawable(f);
            return;
        }
        imageView.setImageResource(cqb.f2754a);
    }

    /* renamed from: a */
    public final void mo6531a(eri eri) {
        this.f13140f = eri;
    }

    /* renamed from: b */
    public final void mo6534b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            bli.m898e(f13135a, "Suggested size was set to a zero area value!");
        } else {
            this.f13142h = new iqp(i, i2);
        }
    }

    /* renamed from: m */
    public final void mo6547m() {
    }
}
