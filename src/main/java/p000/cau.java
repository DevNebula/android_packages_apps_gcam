package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.image.ImageUtils;
import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: cau */
public final class cau implements bzr {
    /* renamed from: a */
    public final hjn f25519a;
    /* renamed from: b */
    public final kln f25520b;
    /* renamed from: c */
    public GoudaRequest f25521c;
    /* renamed from: d */
    public ExifMetadata f25522d;
    /* renamed from: e */
    public kbg f25523e;
    /* renamed from: f */
    public int f25524f;
    /* renamed from: g */
    public iwp f25525g;
    /* renamed from: h */
    public long f25526h;
    /* renamed from: i */
    public long f25527i;
    /* renamed from: j */
    public boolean f25528j;
    /* renamed from: k */
    public boolean f25529k;
    /* renamed from: l */
    public int f25530l;
    /* renamed from: m */
    public boolean f25531m;
    /* renamed from: n */
    public final /* synthetic */ car f25532n;
    /* renamed from: o */
    private final fwb f25533o;
    /* renamed from: p */
    private final gkr f25534p;
    /* renamed from: q */
    private final kbg f25535q;
    /* renamed from: r */
    private final UUID f25536r;
    /* renamed from: s */
    private final gdv f25537s;
    /* renamed from: t */
    private InterleavedReadViewU8 f25538t;
    /* renamed from: u */
    private InterleavedReadViewU16 f25539u;
    /* renamed from: v */
    private kpk f25540v;
    /* renamed from: w */
    private ikb f25541w;
    /* renamed from: x */
    private int f25542x;
    /* renamed from: y */
    private boolean f25543y;

    private cau(car car, gkr gkr, fwb fwb, kbg kbg, UUID uuid) {
        this.f25532n = car;
        this.f25519a = new hjn();
        this.f25528j = false;
        this.f25529k = false;
        this.f25542x = 1;
        this.f25530l = 0;
        this.f25531m = false;
        this.f25543y = false;
        this.f25533o = fwb;
        this.f25534p = gkr;
        this.f25535q = kbg;
        this.f25536r = uuid;
        this.f25520b = new kln();
        this.f25537s = new gdv(this, fwb, gkr);
    }

    /* synthetic */ cau(car car, gkr gkr, fwb fwb, kbg kbg, UUID uuid, byte b) {
        this(car, gkr, fwb, kbg, uuid);
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
    }

    /* renamed from: a */
    public final void mo14576a(InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest, ExifMetadata exifMetadata, kbg kbg, int i, iwp iwp, long j, kpk kpk, int i2, boolean z, boolean z2, ikb ikb) {
        this.f25538t = interleavedReadViewU8;
        this.f25521c = goudaRequest;
        this.f25522d = exifMetadata;
        this.f25523e = kbg;
        this.f25524f = i;
        this.f25525g = iwp;
        this.f25526h = j;
        this.f25540v = kpk;
        this.f25530l = i2;
        this.f25531m = z;
        this.f25543y = z2;
        this.f25541w = ikb;
        cap cap = this.f25532n.f22878h;
        GoudaRequest goudaRequest2 = this.f25521c;
        long l = this.f25534p.mo13383l();
        kbg kbg2 = (kbg) cap.f1843a.mo10566a();
        if (cap.f1844b.mo2107a(gdp.f5331c) && kbg2.mo9709b()) {
            File file = new File((File) kbg2.mo9706a(), "portrait");
            if (!(file.exists() || file.mkdirs())) {
                bli.m891b("PortraitRequestDecorator", "Could not create portrait mode debug data folder.");
            }
            goudaRequest2.setPortrait_raw_path(file.getAbsolutePath());
            goudaRequest2.setShot_prefix(bxe.m1061a(l));
        }
    }

    public final void close() {
        kpk a;
        bli.m888a(car.f22871a, "Starting postprocessing");
        long andIncrement = this.f25532n.f22879i.getAndIncrement();
        this.f25539u = this.f25532n.mo14577a(this.f25540v);
        if (this.f25543y && this.f25532n.f22880j.mo9709b()) {
            InterleavedReadViewU8 interleavedImageU8 = new InterleavedImageU8(this.f25538t.width(), this.f25538t.height(), this.f25538t.num_channels());
            ImageUtils.copyContents(this.f25538t, interleavedImageU8);
            ((gii) this.f25532n.f22880j.mo9706a()).mo7139a();
            m17238a(andIncrement, interleavedImageU8, this.f25521c);
        } else {
            m17238a(andIncrement, this.f25538t, this.f25521c);
        }
        if (this.f25535q.mo9709b()) {
            GoudaRequest goudaRequest = this.f25521c;
            if (goudaRequest != null) {
                int size;
                if (goudaRequest.getFaces() != null) {
                    size = (int) this.f25521c.getFaces().size();
                } else {
                    size = 0;
                }
                this.f25520b.f25269c = size;
                String str = car.f22871a;
                StringBuilder stringBuilder = new StringBuilder(77);
                stringBuilder.append("Sending image ");
                stringBuilder.append(andIncrement);
                stringBuilder.append(" for postprocessing with ");
                stringBuilder.append(size);
                stringBuilder.append(" faces.");
                bli.m888a(str, stringBuilder.toString());
                a = ((gds) this.f25535q.mo9706a()).mo7051a(andIncrement, this.f25538t, this.f25539u, this.f25521c, this.f25531m, this.f25543y, this.f25523e.mo9709b(), this.f25522d, this.f25537s);
                kow.m13878a(a, new cax(this, andIncrement), kpq.f8776a);
            }
        }
        String str2 = "Gouda controller not available or null GoudaRequest, no effect applied.";
        bli.m891b(car.f22871a, str2);
        a = kow.m13874a(new isr(str2));
        kow.m13878a(a, new cax(this, andIncrement), kpq.f8776a);
    }

    /* renamed from: a */
    public final void mo15476a(long j) {
        if (this.f25529k && this.f25519a.f6643a.get() == 0) {
            this.f25533o.mo13288a(1.0f);
            this.f25541w.close();
            String str;
            StringBuilder stringBuilder;
            if (this.f25528j) {
                str = car.f22871a;
                stringBuilder = new StringBuilder(51);
                stringBuilder.append("Finishing the session for shot ");
                stringBuilder.append(j);
                bli.m888a(str, stringBuilder.toString());
                this.f25534p.mo7077h().mo7374a(this.f25520b);
                this.f25534p.mo13378f();
                return;
            }
            str = car.f22871a;
            stringBuilder = new StringBuilder(71);
            stringBuilder.append("Error processing the image, cancelling the session ");
            stringBuilder.append(j);
            bli.m891b(str, stringBuilder.toString());
            this.f25534p.mo13360a();
        }
    }

    /* renamed from: a */
    private final void m17239a(long j, InterleavedReadViewU8 interleavedReadViewU8, gdy gdy, int i, cat cat, String str, hjo hjo) {
        boolean z;
        if (cat == cat.ORIGINAL) {
            z = true;
        } else {
            z = false;
        }
        kpk d = kpw.m18486d();
        kow.m13878a(this.f25532n.f22873c.mo13265a(new cba(this, interleavedReadViewU8, i)), new cbb(this, i, z, str, gdy, d), this.f25532n.f22876f);
        kow.m13878a(d, new caz(this, cat, hjo, j), kpq.f8776a);
    }

    /* renamed from: a */
    private final void m17242a(foz foz, int i, boolean z, String str, ExifInterface exifInterface, gdy gdy) {
        ExifInterface exifInterface2;
        gkr gkr = this.f25534p;
        String n = gkr.mo13385n();
        long l = this.f25534p.mo13383l();
        long j = foz.f4881a;
        UUID uuid = this.f25536r;
        iqm a = iqm.m4095a(foz.f4883c);
        iqp iqp = foz.f4885e;
        int i2 = iqp.f7695a;
        int i3 = iqp.f7696b;
        byte[] bArr = foz.f4882b;
        if (exifInterface != null) {
            exifInterface2 = exifInterface;
        } else {
            exifInterface2 = foz.f4884d;
        }
        gkr.mo13367a(new bnm(n, i, l, j, uuid, a, i2, i3, bArr, exifInterface2, gdy, bve.PORTRAIT, z, str));
        this.f25532n.f22877g.mo9168a((float) i, foz.f4881a);
    }

    /* renamed from: a */
    private final void m17238a(long j, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest) {
        hjo a = this.f25519a.mo7912a();
        car car = this.f25532n;
        kow.m13878a(car.f22874d.mo13265a(new gdw(car.f22875e, interleavedReadViewU8, goudaRequest)), new cay(this, j, a, interleavedReadViewU8), kpq.f8776a);
    }
}
