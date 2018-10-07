package p000;

/* renamed from: ibm */
public class ibm extends ibr {
    /* renamed from: o */
    public ibo f20855o;

    /* renamed from: a */
    protected int mo8342a() {
        if (this.f20855o != null) {
            int i = 0;
            while (true) {
                ibo ibo = this.f20855o;
                if (i >= ibo.f7272b) {
                    break;
                }
                ibo.f7271a[i].mo8337a();
                i++;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public ibm clone() {
        ibm ibm = (ibm) super.clone();
        ibq.m3707a(this, ibm);
        return ibm;
    }

    /* renamed from: d */
    public /* synthetic */ ibr mo8345d() {
        return (ibm) clone();
    }

    /* renamed from: a */
    public void mo8343a(ibl ibl) {
        if (this.f20855o != null) {
            int i = 0;
            while (true) {
                ibo ibo = this.f20855o;
                if (i < ibo.f7272b) {
                    ibo.f7271a[i].mo8338b();
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
