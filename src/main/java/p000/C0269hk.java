package p000;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: hk */
public final class C0269hk {
    /* renamed from: a */
    public static final C0292io f6650a = new C0292io(16);
    /* renamed from: b */
    public static final Object f6651b = new Object();
    /* renamed from: c */
    public static final C0301iz f6652c = new C0301iz();
    /* renamed from: d */
    private static final C0275hs f6653d = new C0275hs("fonts");
    /* renamed from: e */
    private static final Comparator f6654e = new C0271ho();

    /* renamed from: a */
    private static C0273hq[] m3274a(Context context, C0268hj c0268hj, String str) {
        Throwable th;
        Cursor cursor;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str).build();
        Uri build2 = new Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            ArrayList arrayList2;
            Cursor query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c0268hj.f6626c}, null, null);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("result_code");
                        arrayList2 = new ArrayList();
                        int columnIndex2 = query.getColumnIndex("_id");
                        int columnIndex3 = query.getColumnIndex("file_id");
                        int columnIndex4 = query.getColumnIndex("font_ttc_index");
                        int columnIndex5 = query.getColumnIndex("font_weight");
                        int columnIndex6 = query.getColumnIndex("font_italic");
                        while (query.moveToNext()) {
                            int i;
                            int i2;
                            Uri withAppendedId;
                            int i3;
                            boolean z;
                            if (columnIndex != -1) {
                                i = query.getInt(columnIndex);
                            } else {
                                i = 0;
                            }
                            if (columnIndex4 != -1) {
                                i2 = query.getInt(columnIndex4);
                            } else {
                                i2 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                            }
                            if (columnIndex5 != -1) {
                                i3 = query.getInt(columnIndex5);
                            } else {
                                i3 = 400;
                            }
                            if (columnIndex6 == -1) {
                                z = false;
                            } else if (query.getInt(columnIndex6) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList2.add(new C0273hq(withAppendedId, i2, i3, z, i));
                        }
                    } else {
                        arrayList2 = arrayList;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                }
            } else {
                arrayList2 = arrayList;
            }
            if (query != null) {
                query.close();
            }
            return (C0273hq[]) arrayList2.toArray(new C0273hq[0]);
        } catch (Throwable th22) {
            th = th22;
            cursor = null;
        }
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* renamed from: a */
    static C0274hr m3272a(Context context, C0268hj c0268hj, int i) {
        int i2 = -3;
        try {
            PackageManager packageManager = context.getPackageManager();
            Resources resources = context.getResources();
            String str = c0268hj.f6624a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            StringBuilder stringBuilder;
            if (resolveContentProvider == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("No package found for authority: ");
                stringBuilder.append(str);
                throw new NameNotFoundException(stringBuilder.toString());
            } else if (resolveContentProvider.packageName.equals(c0268hj.f6625b)) {
                int i3;
                List a;
                ProviderInfo providerInfo;
                C0272hp c0272hp;
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                List arrayList = new ArrayList();
                for (Signature toByteArray : signatureArr) {
                    arrayList.add(toByteArray.toByteArray());
                }
                Collections.sort(arrayList, f6654e);
                List list = c0268hj.f6627d;
                if (list == null) {
                    a = C0351ll.m5568a(resources, 0);
                } else {
                    a = list;
                }
                for (int i4 = 0; i4 < a.size(); i4++) {
                    Object obj;
                    List arrayList2 = new ArrayList((Collection) a.get(i4));
                    Collections.sort(arrayList2, f6654e);
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                            if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                                obj = null;
                                break;
                            }
                        }
                        i3 = 1;
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        providerInfo = resolveContentProvider;
                        break;
                    }
                }
                providerInfo = null;
                if (providerInfo == null) {
                    c0272hp = new C0272hp(1, null);
                } else {
                    c0272hp = new C0272hp(0, C0269hk.m3274a(context, c0268hj, providerInfo.authority));
                }
                int i6 = c0272hp.f6786a;
                if (i6 == 0) {
                    Typeface a2 = C0260gw.f6082a.mo7594a(context, c0272hp.f6787b, i);
                    return new C0274hr(a2, a2 != null ? 0 : -3);
                }
                if (i6 == 1) {
                    i2 = -2;
                }
                return new C0274hr(null, i2);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Found content provider ");
                stringBuilder.append(str);
                stringBuilder.append(", but package was not ");
                stringBuilder.append(c0268hj.f6625b);
                throw new NameNotFoundException(stringBuilder.toString());
            }
        } catch (NameNotFoundException e) {
            return new C0274hr(null, -1);
        }
    }

    /* JADX WARNING: Missing block: B:36:0x008a, code:
            f6653d.mo8082a(new p000.C0277hu(r4, new android.os.Handler(), new p000.C0688hn(r3)));
     */
    /* JADX WARNING: Missing block: B:41:?, code:
            return r2;
     */
    /* JADX WARNING: Missing block: B:43:?, code:
            return r2;
     */
    /* renamed from: a */
    public static android.graphics.Typeface m3271a(android.content.Context r6, p000.C0268hj r7, p000.C0722mz r8, android.os.Handler r9, boolean r10, int r11, int r12) {
        /*
        r2 = 0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r7.f6628e;
        r0.append(r1);
        r1 = "-";
        r0.append(r1);
        r0.append(r12);
        r3 = r0.toString();
        r0 = f6650a;
        r0 = r0.mo8653a(r3);
        r0 = (android.graphics.Typeface) r0;
        if (r0 == 0) goto L_0x0028;
    L_0x0021:
        if (r8 == 0) goto L_0x0026;
    L_0x0023:
        r8.mo14243a(r0);
    L_0x0026:
        r2 = r0;
    L_0x0027:
        return r2;
    L_0x0028:
        if (r10 == 0) goto L_0x0043;
    L_0x002a:
        r0 = -1;
        if (r11 != r0) goto L_0x0043;
    L_0x002d:
        r0 = p000.C0269hk.m3272a(r6, r7, r12);
        if (r8 == 0) goto L_0x003c;
    L_0x0033:
        r1 = r0.f6831b;
        if (r1 != 0) goto L_0x003f;
    L_0x0037:
        r1 = r0.f6830a;
        r8.mo14244a(r1, r9);
    L_0x003c:
        r2 = r0.f6830a;
        goto L_0x0027;
    L_0x003f:
        r8.mo14242a(r1, r9);
        goto L_0x003c;
    L_0x0043:
        r4 = new hl;
        r4.<init>(r6, r7, r12, r3);
        if (r10 == 0) goto L_0x0055;
    L_0x004a:
        r0 = f6653d;	 Catch:{ InterruptedException -> 0x00a1 }
        r0 = r0.mo8081a(r4, r11);	 Catch:{ InterruptedException -> 0x00a1 }
        r0 = (p000.C0274hr) r0;	 Catch:{ InterruptedException -> 0x00a1 }
        r2 = r0.f6830a;	 Catch:{ InterruptedException -> 0x00a1 }
        goto L_0x0027;
    L_0x0055:
        if (r8 == 0) goto L_0x009f;
    L_0x0057:
        r0 = new hm;
        r0.<init>(r8, r9);
        r1 = r0;
    L_0x005d:
        r5 = f6651b;
        monitor-enter(r5);
        r0 = f6652c;	 Catch:{ all -> 0x0077 }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x0077 }
        if (r0 == 0) goto L_0x007a;
    L_0x0068:
        if (r1 == 0) goto L_0x0075;
    L_0x006a:
        r0 = f6652c;	 Catch:{ all -> 0x0077 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0077 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x0077 }
        r0.add(r1);	 Catch:{ all -> 0x0077 }
    L_0x0075:
        monitor-exit(r5);	 Catch:{ all -> 0x0077 }
        goto L_0x0027;
    L_0x0077:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0077 }
        throw r0;
    L_0x007a:
        if (r1 == 0) goto L_0x0089;
    L_0x007c:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0077 }
        r0.<init>();	 Catch:{ all -> 0x0077 }
        r0.add(r1);	 Catch:{ all -> 0x0077 }
        r1 = f6652c;	 Catch:{ all -> 0x0077 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0077 }
    L_0x0089:
        monitor-exit(r5);	 Catch:{ all -> 0x0077 }
        r0 = f6653d;
        r1 = new hn;
        r1.<init>(r3);
        r3 = new android.os.Handler;
        r3.<init>();
        r5 = new hu;
        r5.<init>(r4, r3, r1);
        r0.mo8082a(r5);
        goto L_0x0027;
    L_0x009f:
        r1 = r2;
        goto L_0x005d;
    L_0x00a1:
        r0 = move-exception;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.a(android.content.Context, hj, mz, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Map m3273a(Context context, C0273hq[] c0273hqArr, CancellationSignal cancellationSignal) {
        Map hashMap = new HashMap();
        for (C0273hq c0273hq : c0273hqArr) {
            if (c0273hq.f6810e == 0) {
                Uri uri = c0273hq.f6806a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C0261ha.m3019a(context, null, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
