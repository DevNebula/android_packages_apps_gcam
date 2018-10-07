package p000;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.net.Uri;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ebq */
public final class ebq implements emm, eol {
    /* renamed from: a */
    public static final String f17201a = bli.m887a("Photos1UpLauncher");
    /* renamed from: b */
    public final kwa f17202b;
    /* renamed from: c */
    public boolean f17203c = false;
    /* renamed from: d */
    public Activity f17204d;
    /* renamed from: e */
    private final Context f17205e;
    /* renamed from: f */
    private final boolean f17206f;
    /* renamed from: g */
    private final edb f17207g;
    /* renamed from: h */
    private final bmb f17208h;
    /* renamed from: i */
    private final bkv f17209i;
    /* renamed from: j */
    private final awr f17210j;
    /* renamed from: k */
    private final gmv f17211k;
    /* renamed from: l */
    private final irh f17212l;
    /* renamed from: m */
    private final irs f17213m;
    /* renamed from: n */
    private final hco f17214n;
    /* renamed from: o */
    private final hjy f17215o;

    static {
        bsb bsb = new bsb("camera.closeonphotos");
    }

    public ebq(Context context, boolean z, kwa kwa, edb edb, bmb bmb, bkv bkv, awr awr, gmv gmv, irs irs, irh irh, bsn bsn, Activity activity, hco hco, enr enr, ikd ikd, hjy hjy) {
        this.f17205e = context;
        this.f17206f = z;
        this.f17202b = kwa;
        this.f17207g = edb;
        this.f17208h = bmb;
        this.f17209i = bkv;
        this.f17210j = awr;
        this.f17211k = gmv;
        this.f17212l = irh;
        this.f17213m = irs;
        this.f17214n = hco;
        this.f17204d = activity;
        this.f17215o = hjy;
        eio.m1804a(ikd, enr, this);
    }

    /* renamed from: a */
    final err mo13143a(hfz hfz) {
        for (int i = 0; i < hfz.mo7832c(); i++) {
            err a = hfz.mo7816a(i);
            if (a == null) {
                String str = f17201a;
                StringBuilder stringBuilder = new StringBuilder(39);
                stringBuilder.append("filmstrip item not found at ");
                stringBuilder.append(i);
                bli.m891b(str, stringBuilder.toString());
            } else {
                Uri uri = a.mo6541g().f4384h;
                String str2 = f17201a;
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 55);
                stringBuilder2.append("getting filmstrip item at index ");
                stringBuilder2.append(i);
                stringBuilder2.append(" with uri = ");
                stringBuilder2.append(valueOf);
                bli.m896d(str2, stringBuilder2.toString());
                if ((this.f17211k.f19354a.contains(uri) ^ 1) != 0) {
                    return a;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b7  */
    /* renamed from: a */
    final void mo13145a(p000.csp r13, p000.hfz r14, p000.err r15) {
        /*
        r12 = this;
        r3 = r12.f17206f;
        r4 = r14.mo7835d();
        r0 = f17201a;
        r1 = new java.lang.StringBuilder;
        r2 = 45;
        r1.<init>(r2);
        r2 = "number of items in secure session ";
        r1.append(r2);
        r1.append(r4);
        r1 = r1.toString();
        p000.bli.m888a(r0, r1);
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = 0;
        r1 = r0;
    L_0x0025:
        if (r1 >= r4) goto L_0x006d;
    L_0x0027:
        r0 = r14.mo7816a(r1);
        if (r0 != 0) goto L_0x0031;
    L_0x002d:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0025;
    L_0x0031:
        r2 = r0.mo6541g();
        r6 = r2.mo6553a();
        r2 = r6.isEmpty();
        if (r2 != 0) goto L_0x005f;
    L_0x003f:
        r7 = r6.size();
        r0 = 0;
    L_0x0044:
        if (r0 >= r7) goto L_0x002d;
    L_0x0046:
        r2 = r0 + 1;
        r0 = r6.get(r0);
        r0 = (java.lang.Long) r0;
        r8 = r0.longValue();
        r10 = -1;
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 == 0) goto L_0x005d;
    L_0x0058:
        r5.add(r0);
        r0 = r2;
        goto L_0x0044;
    L_0x005d:
        r0 = r2;
        goto L_0x0044;
    L_0x005f:
        r0 = r0.mo6541g();
        r6 = r0.f4378b;
        r0 = java.lang.Long.valueOf(r6);
        r5.add(r0);
        goto L_0x002d;
    L_0x006d:
        r0 = p000.khx.m5003a(r5);
        r1 = f17201a;
        r2 = r5.size();
        r4 = java.util.Arrays.toString(r0);
        r5 = java.lang.String.valueOf(r4);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r5 = r5 + 45;
        r6.<init>(r5);
        r5 = "Returning ";
        r6.append(r5);
        r6.append(r2);
        r2 = " items from mediastore. ";
        r6.append(r2);
        r6.append(r4);
        r2 = r6.toString();
        p000.bli.m888a(r1, r2);
        r4 = new android.content.Intent;
        r1 = "com.android.camera.action.REVIEW";
        r4.<init>(r1);
        r1 = "com.google.android.apps.photos";
        r4.setPackage(r1);
        r1 = 1;
        r4.addFlags(r1);
        if (r3 == 0) goto L_0x00c1;
    L_0x00b3:
        r1 = "com.google.android.apps.photos.api.secure_mode";
        r2 = 1;
        r4.putExtra(r1, r2);
        r1 = r0.length;
        if (r1 == 0) goto L_0x00c1;
    L_0x00bc:
        r1 = "com.google.android.apps.photos.api.secure_mode_ids";
        r4.putExtra(r1, r0);
    L_0x00c1:
        r0 = r12.f17213m;
        r2 = r0.mo8877a();
        r0 = 1;
        r1 = "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX";
        r5 = 10;
        p000.jri.m13397a(r0, r1, r5);
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x025e;
    L_0x00d5:
        r0 = "0";
        r2 = r0;
    L_0x00d8:
        r0 = "external_session_id";
        r4.putExtra(r0, r2);
        r0 = r15.mo6545k();
        if (r0 != 0) goto L_0x0214;
    L_0x00e3:
        r1 = p000.glw.UNKNOWN;
    L_0x00e5:
        r0 = r15.mo6541g();
        r0 = r0.f4384h;
        r3 = r0.getScheme();
        r5 = "camera_session";
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x020e;
    L_0x00f7:
        r3 = r12.f17211k;
        r3 = r3.f19355b;
        r0 = r3.get(r0);
        r0 = (p000.eqi) r0;
        if (r0 == 0) goto L_0x0107;
    L_0x0103:
        r1 = r0.mo6499d();
    L_0x0107:
        if (r0 == 0) goto L_0x0204;
    L_0x0109:
        r0 = r0.mo6498c();
    L_0x010d:
        r3 = p000.ixx.JPEG;
        r3 = r3.f7911i;
        r4.setDataAndType(r0, r3);
        r3 = f17201a;
        r5 = java.lang.String.valueOf(r0);
        r6 = java.lang.String.valueOf(r5);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r6 = r6 + 27;
        r7.<init>(r6);
        r6 = "Intent.setDataAndType: uri=";
        r7.append(r6);
        r7.append(r5);
        r5 = r7.toString();
        p000.bli.m888a(r3, r5);
        r3 = new android.net.Uri$Builder;
        r3.<init>();
        r5 = "content";
        r3 = r3.scheme(r5);
        r5 = r12.f17209i;
        r5 = r5.f1282b;
        r3 = r3.authority(r5);
        r5 = "processing";
        r3 = r3.appendPath(r5);
        r0 = r0.getLastPathSegment();
        r0 = r3.appendPath(r0);
        r0 = r0.build();
        r3 = "processing_uri_intent_extra";
        r4.putExtra(r3, r0);
        r3 = f17201a;
        r0 = java.lang.String.valueOf(r0);
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r5 = r5 + 56;
        r6.<init>(r5);
        r5 = "Intent.putExtra: name=processing_uri_intent_extra value=";
        r6.append(r5);
        r6.append(r0);
        r0 = r6.toString();
        p000.bli.m888a(r3, r0);
        r0 = r1;
    L_0x0187:
        r1 = f17201a;
        r3 = java.lang.String.valueOf(r4);
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r5 = r5 + 7;
        r6.<init>(r5);
        r5 = "intent ";
        r6.append(r5);
        r6.append(r3);
        r3 = r6.toString();
        p000.bli.m894c(r1, r3);
        r1 = r12.f17205e;
        r1 = r1.getPackageManager();
        r1 = r4.resolveActivity(r1);
        if (r1 == 0) goto L_0x01f6;
    L_0x01b7:
        r1 = r12.f17207g;
        r1.mo13457y();
        r1 = r12.f17213m;
        r3 = r15.mo6541g();
        r3 = r3.f4385i;
        r1.mo8901a(r2, r3, r0);
        r0 = r12.f17215o;
        r1 = "3.9";
        r0 = r0.mo7918a(r1);
        if (r0 == 0) goto L_0x01ea;
    L_0x01d1:
        r0 = r12.f17210j;
        r1 = 2131034154; // 0x7f05002a float:1.7678818E38 double:1.0528707656E-314;
        r2 = 2131034154; // 0x7f05002a float:1.7678818E38 double:1.0528707656E-314;
        r0.mo1822a(r4, r1, r2);
    L_0x01dc:
        r0 = f17201a;
        r1 = "Disconnecting the camera device because we are launching filmstrip.";
        p000.bli.m898e(r0, r1);
        r0 = r12.f17212l;
        r1 = 0;
        r0.mo8869a(r1);
    L_0x01e9:
        return;
    L_0x01ea:
        r0 = r12.f17210j;
        r1 = 2131034153; // 0x7f050029 float:1.7678816E38 double:1.052870765E-314;
        r2 = 2131034152; // 0x7f050028 float:1.7678813E38 double:1.0528707646E-314;
        r0.mo1822a(r4, r1, r2);
        goto L_0x01dc;
    L_0x01f6:
        r0 = f17201a;
        r1 = "no component found to handle google photos review intent.";
        p000.bli.m894c(r0, r1);
        r0 = 0;
        r12.f17203c = r0;
        r13.mo5752l();
        goto L_0x01e9;
    L_0x0204:
        r0 = r15.mo6541g();
        r0 = r0.mo6555e_();
        goto L_0x010d;
    L_0x020e:
        r4.setData(r0);
        r0 = r1;
        goto L_0x0187;
    L_0x0214:
        r0 = r0.f4343b;
        r1 = r0.f4357n;
        if (r1 == 0) goto L_0x021e;
    L_0x021a:
        r1 = p000.glw.PORTRAIT;
        goto L_0x00e5;
    L_0x021e:
        r1 = r0.f4353j;
        if (r1 == 0) goto L_0x0226;
    L_0x0222:
        r1 = p000.glw.BURST;
        goto L_0x00e5;
    L_0x0226:
        r1 = r0.f4356m;
        if (r1 != 0) goto L_0x0222;
    L_0x022a:
        r1 = r0.f4355l;
        if (r1 != 0) goto L_0x0222;
    L_0x022e:
        r1 = r0.f4352i;
        if (r1 == 0) goto L_0x0236;
    L_0x0232:
        r1 = p000.glw.LENS_BLUR;
        goto L_0x00e5;
    L_0x0236:
        r1 = r0.f4349f;
        if (r1 == 0) goto L_0x023e;
    L_0x023a:
        r1 = p000.glw.PANORAMA;
        goto L_0x00e5;
    L_0x023e:
        r1 = r0.f4350g;
        if (r1 == 0) goto L_0x0246;
    L_0x0242:
        r1 = p000.glw.PHOTOSPHERE;
        goto L_0x00e5;
    L_0x0246:
        r1 = r0.f4346c;
        if (r1 <= 0) goto L_0x00e3;
    L_0x024a:
        r1 = r0.f4348e;
        if (r1 <= 0) goto L_0x00e3;
    L_0x024e:
        r1 = r0.f4347d;
        if (r1 <= 0) goto L_0x00e3;
    L_0x0252:
        r0 = r0.f4345b;
        r0 = r0.length();
        if (r0 <= 0) goto L_0x00e3;
    L_0x025a:
        r1 = p000.glw.VIDEO;
        goto L_0x00e5;
    L_0x025e:
        r0 = 0;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x026d;
    L_0x0264:
        r0 = 10;
        r0 = java.lang.Long.toString(r2, r0);
        r2 = r0;
        goto L_0x00d8;
    L_0x026d:
        r0 = 64;
        r5 = new char[r0];
        r0 = 1;
        r0 = r2 >>> r0;
        r6 = 5;
        r0 = r0 / r6;
        r6 = 63;
        r8 = 10;
        r8 = r8 * r0;
        r2 = r2 - r8;
        r2 = (int) r2;
        r3 = 10;
        r2 = java.lang.Character.forDigit(r2, r3);
        r5[r6] = r2;
        r2 = 63;
    L_0x0288:
        r6 = 0;
        r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x02a1;
    L_0x028e:
        r2 = r2 + -1;
        r6 = 10;
        r6 = r0 % r6;
        r3 = (int) r6;
        r6 = 10;
        r3 = java.lang.Character.forDigit(r3, r6);
        r5[r2] = r3;
        r6 = 10;
        r0 = r0 / r6;
        goto L_0x0288;
    L_0x02a1:
        r0 = new java.lang.String;
        r1 = 64 - r2;
        r0.<init>(r5, r2, r1);
        r2 = r0;
        goto L_0x00d8;
        */
        throw new UnsupportedOperationException("Method not decompiled: ebq.a(csp, hfz, err):void");
    }

    /* renamed from: J */
    public final boolean mo6333J() {
        bli.m888a(f17201a, "onBackPressed");
        return this.f17203c ? ((csp) ((FragmentManager) jri.m13404b(this.f17204d.getFragmentManager())).findFragmentById(R.id.filmstrip_fragment)).mo5742c().mo5727b() : false;
    }

    /* renamed from: a */
    public final void mo13144a(csp csp) {
        ikd.m12501a();
        ArrayList c = khb.m4955c(this.f17214n.f6354b);
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((hcn) c.get(i)).close();
            i = i2;
        }
        if (!this.f17208h.mo2020b()) {
            csp.mo5752l();
        } else if (this.f17203c) {
            bli.m894c(f17201a, "Already animating");
        } else {
            this.f17203c = true;
            csp.mo5740a(new ebs(this, csp));
        }
    }
}
