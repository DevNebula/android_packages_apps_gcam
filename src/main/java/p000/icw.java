package p000;

import java.util.TimeZone;

/* renamed from: icw */
public final class icw implements ifu {
    /* renamed from: a */
    public int f20908a;
    /* renamed from: b */
    public String f20909b;
    /* renamed from: c */
    public String f20910c;
    /* renamed from: d */
    public String f20911d;
    /* renamed from: e */
    public int f20912e;
    /* renamed from: f */
    public boolean f20913f;
    /* renamed from: g */
    public final ibw f20914g;
    /* renamed from: h */
    public boolean f20915h;
    /* renamed from: i */
    public final /* synthetic */ hth f20916i;

    public icw(hth hth, byte[] bArr) {
        this(hth, bArr, (byte) 0);
    }

    private icw(hth hth, byte[] bArr, byte b) {
        this.f20916i = hth;
        this.f20908a = this.f20916i.f7012g;
        this.f20909b = this.f20916i.f7011f;
        this.f20910c = null;
        this.f20911d = null;
        this.f20912e = 0;
        this.f20913f = true;
        this.f20914g = new ibw();
        this.f20915h = false;
        this.f20910c = null;
        this.f20911d = null;
        this.f20914g.f24573a = hth.f7015j.mo8239a();
        this.f20914g.f24574b = hth.f7015j.mo8240b();
        ibw ibw = this.f20914g;
        hth.f7016k;
        ibw.f24576d = (long) (TimeZone.getDefault().getOffset(this.f20914g.f24573a) / 1000);
        if (bArr != null) {
            this.f20914g.f24575c = bArr;
        }
    }

    /* renamed from: a */
    public final void mo8427a(ifv ifv) {
        throw new NoSuchMethodError();
    }
}
