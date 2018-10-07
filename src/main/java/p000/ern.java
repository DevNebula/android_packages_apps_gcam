package p000;

import android.annotation.TargetApi;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.common.p006io.ByteStreams;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: ern */
public final class ern {
    /* renamed from: a */
    private static final String f4361a = bli.m887a(XmpUtil.TAG);

    static {
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/panorama/", "GPano");
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }

    /* renamed from: a */
    public static boolean m2092a(C0556wd c0556wd, String str) {
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/camera/", "GCamera");
            c0556wd.mo11446a("http://ns.google.com/photos/1.0/camera/", "SpecialTypeID", new C0782xj(512), str, new C0782xj());
            return true;
        } catch (C0554wb e) {
            String str2 = f4361a;
            String valueOf = String.valueOf(e.getMessage());
            String str3 = "exception while appending special type id ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m891b(str2, valueOf);
            return false;
        }
    }

    /* renamed from: a */
    public static C0556wd m2083a() {
        return C0557we.m6180a();
    }

    /* renamed from: a */
    public static C0556wd m2085a(String str) {
        C0556wd b = ern.m2094b(str);
        if (b != null) {
            return b;
        }
        return C0557we.m6180a();
    }

    /* renamed from: a */
    public static String m2080a(C0556wd c0556wd) {
        try {
            C0581xm c = c0556wd.mo11450c("http://ns.google.com/photos/1.0/camera/", "SpecialTypeID");
            if (c == null) {
                return null;
            }
            return (String) c.mo11544a();
        } catch (Throwable e) {
            bli.m889a(f4361a, "Fail to read special type id from xmp metadata", e);
            return null;
        }
    }

    /* renamed from: a */
    public static C0556wd m2084a(InputStream inputStream) {
        List a = ern.m2081a(new erp(inputStream), true);
        if (a != null) {
            return ern.m2086a(a);
        }
        bli.m898e(f4361a, "Fail to extract xmp sections from the stream");
        return null;
    }

    /* JADX WARNING: Missing block: B:27:?, code:
            p000.ern.m2088a(r0, r2);
     */
    /* renamed from: b */
    public static p000.C0556wd m2094b(java.lang.String r6) {
        /*
        r1 = 0;
        r0 = r6.toLowerCase();
        r2 = ".jpg";
        r0 = r0.endsWith(r2);
        if (r0 != 0) goto L_0x0022;
    L_0x000d:
        r0 = r6.toLowerCase();
        r2 = ".jpeg";
        r0 = r0.endsWith(r2);
        if (r0 != 0) goto L_0x0022;
    L_0x0019:
        r0 = f4361a;
        r2 = "XMP parse: only jpeg file is supported";
        p000.bli.m888a(r0, r2);
        r0 = r1;
    L_0x0021:
        return r0;
    L_0x0022:
        r2 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        r2.<init>(r6);	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        r0 = p000.ern.m2084a(r2);	 Catch:{ all -> 0x0064 }
        r3 = 0;
        p000.ern.m2088a(r3, r2);	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        goto L_0x0021;
    L_0x0030:
        r0 = move-exception;
        r2 = r0;
        r3 = f4361a;
        r0 = java.lang.String.valueOf(r6);
        r4 = "Could not find file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x006b;
    L_0x0040:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x0045:
        p000.bli.m892b(r3, r0, r2);
        r0 = r1;
        goto L_0x0021;
    L_0x004a:
        r0 = move-exception;
        r2 = r0;
        r3 = f4361a;
        r0 = java.lang.String.valueOf(r6);
        r4 = "Could not read file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x0070;
    L_0x005a:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x005f:
        p000.bli.m892b(r3, r0, r2);
        r0 = r1;
        goto L_0x0021;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0066 }
    L_0x0066:
        r3 = move-exception;
        p000.ern.m2088a(r0, r2);	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
        throw r3;	 Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x004a }
    L_0x006b:
        r0 = r4.concat(r0);
        goto L_0x0045;
    L_0x0070:
        r0 = r4.concat(r0);
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: ern.b(java.lang.String):wd");
    }

    /* renamed from: a */
    private static C0556wd m2086a(List list) {
        for (eyo eyo : list) {
            if (ern.m2089a(eyo)) {
                int i;
                for (i = eyo.f18025c - 1; i > 0; i--) {
                    int i2 = eyo.f18024b + i;
                    byte[] bArr = eyo.f18023a;
                    if (bArr[i2] == (byte) 62 && bArr[i2 - 1] != (byte) 63) {
                        i++;
                        break;
                    }
                }
                i = eyo.f18025c;
                byte[] bArr2 = new byte[(i - 29)];
                System.arraycopy(eyo.f18023a, eyo.f18024b + 29, bArr2, 0, bArr2.length);
                try {
                    return C0557we.m6182a(bArr2);
                } catch (Throwable e) {
                    bli.m889a(f4361a, "XMP parse error", e);
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m2089a(eyo eyo) {
        if (eyo.f18025c < 29) {
            return false;
        }
        try {
            Object obj = new byte[29];
            System.arraycopy(eyo.f18023a, eyo.f18024b, obj, 0, 29);
            if (new String(obj, "UTF-8").equals(XmpUtil.XMP_HEADER)) {
                return true;
            }
            return false;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    /* renamed from: a */
    private static List m2082a(List list, C0556wd c0556wd) {
        if (list == null || list.size() <= 1) {
            return null;
        }
        List list2 = (List) jri.m13404b((Object) list);
        try {
            C0783xk c0783xk = new C0783xk();
            c0783xk.mo14464f();
            c0783xk.mo14463e();
            Object a = C0557we.m6183a(c0556wd, c0783xk);
            int length = a.length;
            if (length > XmpUtil.MAX_XMP_BUFFER_SIZE) {
                return null;
            }
            int i;
            Object obj = new byte[(length + 29)];
            System.arraycopy(XmpUtil.XMP_HEADER.getBytes(), 0, obj, 0, 29);
            System.arraycopy(a, 0, obj, 29, length);
            eyo eyo = new eyo(obj, XmpUtil.M_APP1, 0, obj.length);
            int i2 = 0;
            while (i2 < list2.size()) {
                if (((eyo) list2.get(i2)).f18026d == XmpUtil.M_APP1 && ern.m2089a((eyo) list2.get(i2))) {
                    list2.set(i2, eyo);
                    return list2;
                }
                i2++;
            }
            List arrayList = new ArrayList();
            if (((eyo) list2.get(0)).f18026d == XmpUtil.M_APP1) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(list2.subList(0, i));
            arrayList.add(eyo);
            arrayList.addAll(list2.subList(i, list2.size()));
            return arrayList;
        } catch (Throwable e) {
            bli.m889a(f4361a, "Serialize xmp failed", e);
            return null;
        }
    }

    /* renamed from: a */
    private static List m2081a(erq erq, boolean z) {
        try {
            if (erq.mo6523a() == Illuminant.kOther && erq.mo6523a() == XmpUtil.M_SOI) {
                List arrayList = new ArrayList();
                while (true) {
                    int a = erq.mo6523a();
                    if (a == -1) {
                        try {
                            erq.close();
                        } catch (IOException e) {
                        }
                        return arrayList;
                    } else if (a == Illuminant.kOther) {
                        do {
                            a = erq.mo6523a();
                        } while (a == Illuminant.kOther);
                        if (a == -1) {
                            try {
                                erq.close();
                                return null;
                            } catch (IOException e2) {
                                return null;
                            }
                        } else if (a == XmpUtil.M_SOS) {
                            if (!z) {
                                arrayList.add(erq.mo6524a(a));
                            }
                            try {
                                erq.close();
                            } catch (IOException e3) {
                            }
                            return arrayList;
                        } else {
                            int a2 = erq.mo6523a();
                            int a3 = erq.mo6523a();
                            if (a2 == -1 || a3 == -1) {
                                try {
                                    erq.close();
                                    return null;
                                } catch (IOException e4) {
                                    return null;
                                }
                            }
                            a2 = (a2 << 8) | a3;
                            if (!z || a == XmpUtil.M_APP1) {
                                arrayList.add(erq.mo6525a(a2 - 2, a));
                            } else {
                                erq.mo6526b(a2 - 2);
                            }
                        }
                    } else {
                        try {
                            erq.close();
                            return null;
                        } catch (IOException e5) {
                            return null;
                        }
                    }
                }
            }
            try {
                erq.close();
                return null;
            } catch (IOException e6) {
                return null;
            }
        } catch (Throwable e7) {
            bli.m889a(f4361a, "Could not parse file.", e7);
            try {
                erq.close();
                return null;
            } catch (IOException e8) {
                return null;
            }
        } catch (Throwable th) {
            try {
                erq.close();
            } catch (IOException e9) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static void m2087a(OutputStream outputStream, List list) {
        outputStream.write(Illuminant.kOther);
        outputStream.write(XmpUtil.M_SOI);
        for (eyo eyo : list) {
            outputStream.write(Illuminant.kOther);
            outputStream.write(eyo.f18026d);
            if (eyo.f18026d != XmpUtil.M_SOS) {
                int i = eyo.f18025c + 2;
                outputStream.write(i >> 8);
                outputStream.write(i & Illuminant.kOther);
            }
            outputStream.write(eyo.f18023a, eyo.f18024b, eyo.f18025c);
        }
    }

    /* renamed from: a */
    public static boolean m2090a(InputStream inputStream, OutputStream outputStream, C0556wd c0556wd) {
        try {
            return ern.m2093a(ByteStreams.toByteArray(inputStream), outputStream, c0556wd);
        } catch (Throwable e) {
            String str = f4361a;
            String valueOf = String.valueOf(inputStream);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
            stringBuilder.append("Could not read JPEG stream: ");
            stringBuilder.append(valueOf);
            bli.m892b(str, stringBuilder.toString(), e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c5 A:{SYNTHETIC, Splitter: B:64:0x00c5} */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009a A:{Catch:{ all -> 0x00c1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a4 A:{SYNTHETIC, Splitter: B:49:0x00a4} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af A:{SYNTHETIC, Splitter: B:55:0x00af} */
    /* JADX WARNING: Missing block: B:39:?, code:
            p000.ern.m2088a(r0, r3);
     */
    /* renamed from: a */
    public static boolean m2091a(java.lang.String r7, p000.C0556wd r8) {
        /*
        r2 = 0;
        r1 = 0;
        r0 = r7.toLowerCase();
        r3 = ".jpg";
        r0 = r0.endsWith(r3);
        if (r0 != 0) goto L_0x0023;
    L_0x000e:
        r0 = r7.toLowerCase();
        r3 = ".jpeg";
        r0 = r0.endsWith(r3);
        if (r0 != 0) goto L_0x0023;
    L_0x001a:
        r0 = f4361a;
        r2 = "XMP parse: only jpeg file is supported";
        p000.bli.m888a(r0, r2);
        r0 = r1;
    L_0x0022:
        return r0;
    L_0x0023:
        r3 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r3.<init>(r7);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r0 = new erp;	 Catch:{ all -> 0x0083 }
        r0.<init>(r3);	 Catch:{ all -> 0x0083 }
        r4 = 0;
        r0 = p000.ern.m2081a(r0, r4);	 Catch:{ all -> 0x0083 }
        r4 = p000.ern.m2082a(r0, r8);	 Catch:{ all -> 0x0083 }
        if (r4 == 0) goto L_0x0049;
    L_0x0038:
        r0 = 0;
        p000.ern.m2088a(r0, r3);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x008a, all -> 0x00aa }
        r0.<init>(r7);	 Catch:{ IOException -> 0x008a, all -> 0x00aa }
        p000.ern.m2087a(r0, r4);	 Catch:{ IOException -> 0x00b3, all -> 0x00ca }
        r0.close();	 Catch:{ IOException -> 0x00cc }
    L_0x0047:
        r0 = 1;
        goto L_0x0022;
    L_0x0049:
        r0 = 0;
        p000.ern.m2088a(r0, r3);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        r0 = r1;
        goto L_0x0022;
    L_0x004f:
        r0 = move-exception;
        r2 = r0;
        r3 = f4361a;
        r0 = java.lang.String.valueOf(r7);
        r4 = "Could not find file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x00b7;
    L_0x005f:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x0064:
        p000.bli.m892b(r3, r0, r2);
        r0 = r1;
        goto L_0x0022;
    L_0x0069:
        r0 = move-exception;
        r2 = r0;
        r3 = f4361a;
        r0 = java.lang.String.valueOf(r7);
        r4 = "Could not read file: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x00bc;
    L_0x0079:
        r0 = new java.lang.String;
        r0.<init>(r4);
    L_0x007e:
        p000.bli.m892b(r3, r0, r2);
        r0 = r1;
        goto L_0x0022;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0085 }
    L_0x0085:
        r2 = move-exception;
        p000.ern.m2088a(r0, r3);	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x004f, IOException -> 0x0069 }
    L_0x008a:
        r0 = move-exception;
        r3 = r0;
    L_0x008c:
        r4 = f4361a;	 Catch:{ all -> 0x00c1 }
        r5 = "Write file failed:";
        r0 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x00c1 }
        r6 = r0.length();	 Catch:{ all -> 0x00c1 }
        if (r6 != 0) goto L_0x00c5;
    L_0x009a:
        r0 = new java.lang.String;	 Catch:{ all -> 0x00c1 }
        r0.<init>(r5);	 Catch:{ all -> 0x00c1 }
    L_0x009f:
        p000.bli.m889a(r4, r0, r3);	 Catch:{ all -> 0x00c1 }
        if (r2 == 0) goto L_0x00a7;
    L_0x00a4:
        r2.close();	 Catch:{ IOException -> 0x00cf }
    L_0x00a7:
        r0 = r1;
        goto L_0x0022;
    L_0x00aa:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x00ad:
        if (r0 == 0) goto L_0x00b2;
    L_0x00af:
        r0.close();	 Catch:{ IOException -> 0x00d1 }
    L_0x00b2:
        throw r1;
    L_0x00b3:
        r2 = move-exception;
        r3 = r2;
        r2 = r0;
        goto L_0x008c;
    L_0x00b7:
        r0 = r4.concat(r0);
        goto L_0x0064;
    L_0x00bc:
        r0 = r4.concat(r0);
        goto L_0x007e;
    L_0x00c1:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x00ad;
    L_0x00c5:
        r0 = r5.concat(r0);	 Catch:{ all -> 0x00c1 }
        goto L_0x009f;
    L_0x00ca:
        r1 = move-exception;
        goto L_0x00ad;
    L_0x00cc:
        r0 = move-exception;
        goto L_0x0047;
    L_0x00cf:
        r0 = move-exception;
        goto L_0x00a7;
    L_0x00d1:
        r0 = move-exception;
        goto L_0x00b2;
        */
        throw new UnsupportedOperationException("Method not decompiled: ern.a(java.lang.String, wd):boolean");
    }

    /* renamed from: a */
    private static boolean m2093a(byte[] bArr, OutputStream outputStream, C0556wd c0556wd) {
        List a = ern.m2082a(ern.m2081a(new ero(bArr), false), c0556wd);
        if (a == null) {
            return false;
        }
        try {
            ern.m2087a(outputStream, a);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                }
            }
            return true;
        } catch (Throwable e2) {
            bli.m889a(f4361a, "Write to stream failed", e2);
            if (outputStream == null) {
                return false;
            }
            try {
                outputStream.close();
                return false;
            } catch (IOException e3) {
                return false;
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                }
            }
        }
    }
}
