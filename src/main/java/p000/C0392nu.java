package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MenuInflater;

/* compiled from: PG */
/* renamed from: nu */
public final class C0392nu extends MenuInflater {
    /* renamed from: a */
    public static final Class[] f9451a;
    /* renamed from: e */
    private static final Class[] f9452e;
    /* renamed from: b */
    public final Object[] f9453b;
    /* renamed from: c */
    public Context f9454c;
    /* renamed from: d */
    public Object f9455d;
    /* renamed from: f */
    private final Object[] f9456f = this.f9453b;

    static {
        Class[] clsArr = new Class[]{Context.class};
        f9451a = clsArr;
        f9452e = clsArr;
    }

    public C0392nu(Context context) {
        super(context);
        this.f9454c = context;
        this.f9453b = new Object[]{context};
    }

    /* renamed from: a */
    static Object m5707a(Object obj) {
        Object obj2 = obj;
        while (!(obj2 instanceof Activity) && (obj2 instanceof ContextWrapper)) {
            obj2 = ((ContextWrapper) obj2).getBaseContext();
        }
        return obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    public final void inflate(int r6, android.view.Menu r7) {
        /*
        r5 = this;
        r1 = 0;
        r0 = r7 instanceof p000.C0265hf;
        if (r0 == 0) goto L_0x001c;
    L_0x0005:
        r0 = r5.f9454c;	 Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b, all -> 0x0041 }
        r0 = r0.getResources();	 Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b, all -> 0x0041 }
        r1 = r0.getLayout(r6);	 Catch:{ XmlPullParserException -> 0x004d, IOException -> 0x004b, all -> 0x0041 }
        r0 = android.util.Xml.asAttributeSet(r1);	 Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x0033, all -> 0x0046 }
        r5.m5708a(r1, r0, r7);	 Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x0033, all -> 0x0046 }
        if (r1 == 0) goto L_0x001b;
    L_0x0018:
        r1.close();
    L_0x001b:
        return;
    L_0x001c:
        super.inflate(r6, r7);
        goto L_0x001b;
    L_0x0020:
        r0 = move-exception;
    L_0x0021:
        r2 = new android.view.InflateException;	 Catch:{ all -> 0x0029 }
        r3 = "Error inflating menu XML";
        r2.<init>(r3, r0);	 Catch:{ all -> 0x0029 }
        throw r2;	 Catch:{ all -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x002d:
        if (r0 == 0) goto L_0x0032;
    L_0x002f:
        r0.close();
    L_0x0032:
        throw r1;
    L_0x0033:
        r0 = move-exception;
    L_0x0034:
        r2 = new android.view.InflateException;	 Catch:{ all -> 0x003c }
        r3 = "Error inflating menu XML";
        r2.<init>(r3, r0);	 Catch:{ all -> 0x003c }
        throw r2;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x002d;
    L_0x0041:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x002d;
    L_0x0046:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x002d;
    L_0x004b:
        r0 = move-exception;
        goto L_0x0034;
    L_0x004d:
        r0 = move-exception;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.inflate(int, android.view.Menu):void");
    }

    /* renamed from: a */
    private final void m5708a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
        r10 = this;
        r4 = new nw;
        r4.<init>(r10, r13);
        r0 = r11.getEventType();
    L_0x0009:
        r1 = 2;
        if (r0 != r1) goto L_0x0249;
    L_0x000c:
        r0 = r11.getName();
        r1 = "menu";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0252;
    L_0x0018:
        r0 = r11.next();
    L_0x001c:
        r3 = 0;
        r2 = 0;
        r1 = 0;
    L_0x001f:
        if (r1 != 0) goto L_0x0271;
    L_0x0021:
        switch(r0) {
            case 1: goto L_0x0269;
            case 2: goto L_0x0031;
            case 3: goto L_0x01e1;
            default: goto L_0x0024;
        };
    L_0x0024:
        r0 = r1;
        r1 = r2;
        r2 = r3;
    L_0x0027:
        r3 = r11.next();
        r9 = r0;
        r0 = r3;
        r3 = r2;
        r2 = r1;
        r1 = r9;
        goto L_0x001f;
    L_0x0031:
        if (r3 != 0) goto L_0x01dc;
    L_0x0033:
        r0 = r11.getName();
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 != 0) goto L_0x0197;
    L_0x003f:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 != 0) goto L_0x005c;
    L_0x0047:
        r5 = "menu";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x0057;
    L_0x004f:
        r0 = r4.mo10781a();
        r10.m5708a(r11, r12, r0);
        goto L_0x0024;
    L_0x0057:
        r2 = 1;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x005c:
        r0 = r4.f9465F;
        r0 = r0.f9454c;
        r5 = p000.C0382ni.f9351be;
        r5 = r0.obtainStyledAttributes(r12, r5);
        r0 = p000.C0382ni.f9361bo;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f9474i = r0;
        r0 = p000.C0382ni.f9362bp;
        r6 = r4.f9468c;
        r0 = r5.getInt(r0, r6);
        r6 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r0 = r0 & r6;
        r6 = p000.C0382ni.f9365bs;
        r7 = r4.f9469d;
        r6 = r5.getInt(r6, r7);
        r6 = (char) r6;
        r0 = r0 | r6;
        r4.f9475j = r0;
        r0 = p000.C0382ni.f9366bt;
        r0 = r5.getText(r0);
        r4.f9476k = r0;
        r0 = p000.C0382ni.f9367bu;
        r0 = r5.getText(r0);
        r4.f9477l = r0;
        r0 = p000.C0382ni.f9360bn;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f9478m = r0;
        r0 = p000.C0382ni.f9356bj;
        r0 = r5.getString(r0);
        r0 = p000.C0394nw.m5709a(r0);
        r4.f9479n = r0;
        r0 = p000.C0382ni.f9355bi;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f9480o = r0;
        r0 = p000.C0382ni.f9363bq;
        r0 = r5.getString(r0);
        r0 = p000.C0394nw.m5709a(r0);
        r4.f9481p = r0;
        r0 = p000.C0382ni.f9372bz;
        r6 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r0 = r5.getInt(r0, r6);
        r4.f9482q = r0;
        r0 = p000.C0382ni.f9357bk;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x0191;
    L_0x00d3:
        r0 = p000.C0382ni.f9357bk;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        r4.f9483r = r0;
    L_0x00dc:
        r0 = p000.C0382ni.f9358bl;
        r6 = 0;
        r0 = r5.getBoolean(r0, r6);
        r4.f9484s = r0;
        r0 = p000.C0382ni.f9368bv;
        r6 = r4.f9471f;
        r0 = r5.getBoolean(r0, r6);
        r4.f9485t = r0;
        r0 = p000.C0382ni.f9359bm;
        r6 = r4.f9472g;
        r0 = r5.getBoolean(r0, r6);
        r4.f9486u = r0;
        r0 = p000.C0382ni.f9321bA;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r4.f9487v = r0;
        r0 = p000.C0382ni.f9364br;
        r0 = r5.getString(r0);
        r4.f9491z = r0;
        r0 = p000.C0382ni.f9352bf;
        r6 = 0;
        r0 = r5.getResourceId(r0, r6);
        r4.f9488w = r0;
        r0 = p000.C0382ni.f9354bh;
        r0 = r5.getString(r0);
        r4.f9489x = r0;
        r0 = p000.C0382ni.f9353bg;
        r0 = r5.getString(r0);
        r4.f9490y = r0;
        r0 = r4.f9490y;
        if (r0 == 0) goto L_0x0184;
    L_0x0127:
        r6 = r4.f9488w;
        if (r6 != 0) goto L_0x0184;
    L_0x012b:
        r6 = r4.f9489x;
        if (r6 != 0) goto L_0x0184;
    L_0x012f:
        r6 = f9452e;
        r7 = r4.f9465F;
        r7 = r7.f9456f;
        r0 = r4.mo10782a(r0, r6, r7);
        r0 = (p000.C0308jf) r0;
        r4.f9460A = r0;
    L_0x013d:
        r0 = p000.C0382ni.f9369bw;
        r0 = r5.getText(r0);
        r4.f9461B = r0;
        r0 = p000.C0382ni.f9322bB;
        r0 = r5.getText(r0);
        r4.f9462C = r0;
        r0 = p000.C0382ni.f9371by;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x0180;
    L_0x0155:
        r0 = p000.C0382ni.f9371by;
        r6 = -1;
        r0 = r5.getInt(r0, r6);
        r6 = r4.f9464E;
        r0 = p000.C0474sg.m5866a(r0, r6);
        r4.f9464E = r0;
    L_0x0164:
        r0 = p000.C0382ni.f9370bx;
        r0 = r5.hasValue(r0);
        if (r0 == 0) goto L_0x017c;
    L_0x016c:
        r0 = p000.C0382ni.f9370bx;
        r0 = r5.getColorStateList(r0);
        r4.f9463D = r0;
    L_0x0174:
        r5.recycle();
        r0 = 0;
        r4.f9473h = r0;
        goto L_0x0024;
    L_0x017c:
        r0 = 0;
        r4.f9463D = r0;
        goto L_0x0174;
    L_0x0180:
        r0 = 0;
        r4.f9464E = r0;
        goto L_0x0164;
    L_0x0184:
        if (r0 == 0) goto L_0x018d;
    L_0x0186:
        r0 = "SupportMenuInflater";
        r6 = "Ignoring attribute 'actionProviderClass'. Action view already specified.";
        android.util.Log.w(r0, r6);
    L_0x018d:
        r0 = 0;
        r4.f9460A = r0;
        goto L_0x013d;
    L_0x0191:
        r0 = r4.f9470e;
        r4.f9483r = r0;
        goto L_0x00dc;
    L_0x0197:
        r0 = r4.f9465F;
        r0 = r0.f9454c;
        r5 = p000.C0382ni.f9291aX;
        r0 = r0.obtainStyledAttributes(r12, r5);
        r5 = p000.C0382ni.f9347ba;
        r6 = 0;
        r5 = r0.getResourceId(r5, r6);
        r4.f9467b = r5;
        r5 = p000.C0382ni.f9348bb;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f9468c = r5;
        r5 = p000.C0382ni.f9349bc;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f9469d = r5;
        r5 = p000.C0382ni.f9292aY;
        r6 = 0;
        r5 = r0.getInt(r5, r6);
        r4.f9470e = r5;
        r5 = p000.C0382ni.f9350bd;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f9471f = r5;
        r5 = p000.C0382ni.f9293aZ;
        r6 = 1;
        r5 = r0.getBoolean(r5, r6);
        r4.f9472g = r5;
        r0.recycle();
        goto L_0x0024;
    L_0x01dc:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x01e1:
        r0 = r11.getName();
        if (r3 == 0) goto L_0x01ed;
    L_0x01e7:
        r5 = r0.equals(r2);
        if (r5 != 0) goto L_0x0242;
    L_0x01ed:
        r5 = "group";
        r5 = r0.equals(r5);
        if (r5 == 0) goto L_0x01fa;
    L_0x01f5:
        r4.mo10784b();
        goto L_0x0024;
    L_0x01fa:
        r5 = "item";
        r5 = r0.equals(r5);
        if (r5 != 0) goto L_0x0214;
    L_0x0202:
        r5 = "menu";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x020f;
    L_0x020a:
        r0 = 1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x020f:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0214:
        r0 = r4.f9473h;
        if (r0 != 0) goto L_0x023d;
    L_0x0218:
        r0 = r4.f9460A;
        if (r0 == 0) goto L_0x0227;
    L_0x021c:
        r0 = r0.mo9368a();
        if (r0 == 0) goto L_0x0227;
    L_0x0222:
        r4.mo10781a();
        goto L_0x0024;
    L_0x0227:
        r0 = 1;
        r4.f9473h = r0;
        r0 = r4.f9466a;
        r5 = r4.f9467b;
        r6 = r4.f9474i;
        r7 = r4.f9475j;
        r8 = r4.f9476k;
        r0 = r0.add(r5, r6, r7, r8);
        r4.mo10783a(r0);
        goto L_0x0024;
    L_0x023d:
        r0 = r1;
        r1 = r2;
        r2 = r3;
        goto L_0x0027;
    L_0x0242:
        r2 = 0;
        r0 = 0;
        r9 = r1;
        r1 = r0;
        r0 = r9;
        goto L_0x0027;
    L_0x0249:
        r0 = r11.next();
        r1 = 1;
        if (r0 == r1) goto L_0x001c;
    L_0x0250:
        goto L_0x0009;
    L_0x0252:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Expecting menu, got ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0269:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x0271:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }
}
