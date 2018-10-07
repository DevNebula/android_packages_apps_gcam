package p000;

import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

/* renamed from: dal */
public final /* synthetic */ class dal implements koi {
    /* renamed from: a */
    private final dak f13661a;
    /* renamed from: b */
    private final int f13662b;
    /* renamed from: c */
    private final boolean f13663c;

    public dal(dak dak, int i, boolean z) {
        this.f13661a = dak;
        this.f13662b = i;
        this.f13663c = z;
    }

    /* renamed from: a */
    public final kpk mo10182a() {
        Object a;
        dak dak = this.f13661a;
        int i = this.f13662b;
        boolean z = this.f13663c;
        ebd ebd = dak.f3110a;
        if (ebd.f17145H != null) {
            iqm b;
            boolean z2;
            switch (ebd.f17150M.getDefaultDisplay().getRotation()) {
                case 0:
                    b = iqm.m4097b(0);
                    break;
                case 1:
                    b = iqm.m4097b(90);
                    break;
                case 2:
                    b = iqm.m4097b(MediaDecoder.ROTATE_180);
                    break;
                case 3:
                    b = iqm.m4097b(MediaDecoder.ROTATE_90_LEFT);
                    break;
                default:
                    b = iqm.CLOCKWISE_0;
                    break;
            }
            if (b.mo8806a() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            a = ebd.f17145H.mo7768a(i, z, z2);
        } else {
            a = null;
        }
        return kow.m13873a(a);
    }
}
