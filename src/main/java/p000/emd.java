package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.location.Location;
import android.media.ExifInterface;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: emd */
public final class emd {
    /* renamed from: a */
    private static final String f4193a = bli.m887a("MetadataUtils");
    /* renamed from: b */
    private static NumberFormat f4194b = NumberFormat.getInstance(Locale.US);

    /* renamed from: a */
    private static String m1916a(double d) {
        String str = null;
        String[] split = Location.convert(Math.abs(d), 2).split(":");
        if (split.length != 3) {
            return str;
        }
        String str2;
        String str3;
        try {
            float floatValue = f4194b.parse(split[2]).floatValue();
            str2 = split[0];
            str3 = split[1];
            str = String.valueOf((int) (floatValue * 1000.0f));
            int length = String.valueOf(str2).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 11) + String.valueOf(str3).length()) + String.valueOf(str).length());
            stringBuilder.append(str2);
            stringBuilder.append("/1,");
            stringBuilder.append(str3);
            stringBuilder.append("/1,");
            stringBuilder.append(str);
            stringBuilder.append("/1000");
            return stringBuilder.toString();
        } catch (ParseException e) {
            str2 = f4193a;
            str3 = String.valueOf(split[2]);
            String str4 = "Could not parse float: ";
            if (str3.length() == 0) {
                str3 = new String(str4);
            } else {
                str3 = str4.concat(str3);
            }
            bli.m898e(str2, str3);
            return str;
        }
    }

    /* renamed from: a */
    public static float m1915a(Map map) {
        if (map == null) {
            return 0.0f;
        }
        String str = (String) map.get("full_pano_width");
        try {
            return (((float) Integer.parseInt((String) map.get("cropped_area_width"))) / ((float) Integer.parseInt(str))) * 360.0f;
        } catch (NumberFormatException e) {
            return 0.0f;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A:{SYNTHETIC, Splitter: B:13:0x0037} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A:{SYNTHETIC, Splitter: B:24:0x0049} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052 A:{SYNTHETIC, Splitter: B:30:0x0052} */
    /* renamed from: a */
    public static java.util.Map m1919a(java.lang.String r7) {
        /*
        r6 = 2;
        r1 = 0;
        r2 = new java.io.BufferedReader;	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0045, all -> 0x005e }
        r0 = new java.io.InputStreamReader;	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0045, all -> 0x005e }
        r3 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0045, all -> 0x005e }
        r3.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0045, all -> 0x005e }
        r0.<init>(r3);	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0045, all -> 0x005e }
        r2.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x0045, all -> 0x005e }
        r0 = new java.util.HashMap;	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
    L_0x0016:
        r3 = r2.readLine();	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        if (r3 == 0) goto L_0x003c;
    L_0x001c:
        r4 = ",";
        r5 = 2;
        r3 = r3.split(r4, r5);	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        r4 = r3.length;	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        if (r4 != r6) goto L_0x0016;
    L_0x0026:
        r4 = 0;
        r4 = r3[r4];	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        r5 = 1;
        r3 = r3[r5];	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        r3 = r3.trim();	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        r0.put(r4, r3);	 Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x005c, all -> 0x004e }
        goto L_0x0016;
    L_0x0034:
        r0 = move-exception;
    L_0x0035:
        if (r2 == 0) goto L_0x003a;
    L_0x0037:
        r2.close();	 Catch:{ IOException -> 0x0056 }
    L_0x003a:
        r0 = r1;
    L_0x003b:
        return r0;
    L_0x003c:
        r2.close();	 Catch:{ IOException -> 0x0040 }
        goto L_0x003b;
    L_0x0040:
        r1 = move-exception;
        goto L_0x003b;
    L_0x0042:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0035;
    L_0x0045:
        r0 = move-exception;
        r2 = r1;
    L_0x0047:
        if (r2 == 0) goto L_0x004c;
    L_0x0049:
        r2.close();	 Catch:{ IOException -> 0x0058 }
    L_0x004c:
        r0 = r1;
        goto L_0x003b;
    L_0x004e:
        r0 = move-exception;
        r1 = r2;
    L_0x0050:
        if (r1 == 0) goto L_0x0055;
    L_0x0052:
        r1.close();	 Catch:{ IOException -> 0x005a }
    L_0x0055:
        throw r0;
    L_0x0056:
        r0 = move-exception;
        goto L_0x003a;
    L_0x0058:
        r0 = move-exception;
        goto L_0x004c;
    L_0x005a:
        r1 = move-exception;
        goto L_0x0055;
    L_0x005c:
        r0 = move-exception;
        goto L_0x0047;
    L_0x005e:
        r0 = move-exception;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: emd.a(java.lang.String):java.util.Map");
    }

    /* renamed from: a */
    private static Date m1918a(Entry entry) {
        try {
            return new Date(Long.parseLong((String) entry.getValue()));
        } catch (Throwable e) {
            Throwable th = e;
            String str = f4193a;
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 30) + String.valueOf(str3).length());
            stringBuilder.append("Parse date failed for ");
            stringBuilder.append(str2);
            stringBuilder.append(" ,value:");
            stringBuilder.append(str3);
            bli.m889a(str, stringBuilder.toString(), th);
            return null;
        }
    }

    /* renamed from: b */
    private static Double m1922b(Entry entry) {
        try {
            return Double.valueOf(f4194b.parse((String) entry.getValue()).doubleValue());
        } catch (Throwable e) {
            Throwable th = e;
            String str = f4193a;
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 32) + String.valueOf(str3).length());
            stringBuilder.append("Parse double failed for ");
            stringBuilder.append(str2);
            stringBuilder.append(" ,value:");
            stringBuilder.append(str3);
            bli.m899e(str, stringBuilder.toString(), th);
            return null;
        }
    }

    /* renamed from: c */
    private static Integer m1923c(Entry entry) {
        try {
            return Integer.valueOf((String) entry.getValue());
        } catch (Throwable e) {
            Throwable th = e;
            String str = f4193a;
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 33) + String.valueOf(str3).length());
            stringBuilder.append("Parse integer failed for ");
            stringBuilder.append(str2);
            stringBuilder.append(" ,value:");
            stringBuilder.append(str3);
            bli.m899e(str, stringBuilder.toString(), th);
            return null;
        }
    }

    /* renamed from: a */
    private static String m1917a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x016a A:{SYNTHETIC, Splitter: B:39:0x016a} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0149 A:{Catch:{ all -> 0x0165 }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0150 A:{SYNTHETIC, Splitter: B:24:0x0150} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x015a A:{SYNTHETIC, Splitter: B:30:0x015a} */
    /* renamed from: a */
    public static boolean m1921a(java.lang.String r9, java.util.List r10) {
        /*
        r4 = 0;
        r1 = 1;
        r2 = 0;
        if (r10 == 0) goto L_0x0139;
    L_0x0005:
        r0 = r10.size();
        if (r0 == 0) goto L_0x0139;
    L_0x000b:
        r3 = new java.io.FileWriter;	 Catch:{ IOException -> 0x013b, all -> 0x0155 }
        r3.<init>(r9);	 Catch:{ IOException -> 0x013b, all -> 0x0155 }
        r4 = "%s,%d\n";
        r0 = 2;
        r5 = new java.lang.Object[r0];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = "first_photo_time";
        r6 = 0;
        r5[r6] = r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = 0;
        r0 = r10.get(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = (p000.emf) r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = r0.f4195a;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = java.lang.Long.valueOf(r6);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = 1;
        r5[r6] = r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = "%s,%d\n";
        r0 = 2;
        r5 = new java.lang.Object[r0];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = "last_photo_time";
        r6 = 0;
        r5[r6] = r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = r10.size();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = r0 + -1;
        r0 = r10.get(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = (p000.emf) r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = r0.f4195a;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = java.lang.Long.valueOf(r6);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = 1;
        r5[r6] = r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = "%s,%d\n";
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r5 = "source_photos_count";
        r6 = 0;
        r4[r6] = r5;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r5 = r10.size();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = 1;
        r4[r6] = r5;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = p000.emd.m1917a(r0, r4);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = "%s,%d\n";
        r0 = 2;
        r5 = new java.lang.Object[r0];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = "pose_heading";
        r6 = 0;
        r5[r6] = r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = 0;
        r0 = r10.get(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = (p000.emf) r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = r0.f4197c;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = 1;
        r5[r6] = r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = r10.size();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = r0 + -1;
        r4 = r0;
    L_0x009b:
        if (r4 < 0) goto L_0x012f;
    L_0x009d:
        r0 = r10.get(r4);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = (p000.emf) r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = r0.f4196b;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        if (r0 == 0) goto L_0x0134;
    L_0x00a7:
        r4 = "%s,%f\n";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = "location_altitude";
        r7 = 0;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = r0.getAltitude();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = java.lang.Double.valueOf(r6);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r7 = 1;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r4);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = "%s,%f\n";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = "location_latitude";
        r7 = 0;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = r0.getLatitude();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = java.lang.Double.valueOf(r6);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r7 = 1;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r4);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = "%s,%f\n";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = "location_longitude";
        r7 = 0;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = r0.getLongitude();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = java.lang.Double.valueOf(r6);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r7 = 1;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r4);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = "%s,%s\n";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = "location_provider";
        r7 = 0;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = r0.getProvider();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r7 = 1;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r4);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r4 = "%s,%d\n";
        r5 = 2;
        r5 = new java.lang.Object[r5];	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = "location_time";
        r7 = 0;
        r5[r7] = r6;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = r0.getTime();	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = java.lang.Long.valueOf(r6);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r6 = 1;
        r5[r6] = r0;	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r0 = p000.emd.m1917a(r4, r5);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
        r3.write(r0);	 Catch:{ IOException -> 0x015e, all -> 0x0161 }
    L_0x012f:
        r3.close();	 Catch:{ IOException -> 0x016e }
    L_0x0132:
        r0 = r1;
    L_0x0133:
        return r0;
    L_0x0134:
        r0 = r4 + -1;
        r4 = r0;
        goto L_0x009b;
    L_0x0139:
        r0 = r2;
        goto L_0x0133;
    L_0x013b:
        r0 = move-exception;
        r1 = r4;
    L_0x013d:
        r0 = "Could not write metadata file: ";
        r3 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x0165 }
        r4 = r3.length();	 Catch:{ all -> 0x0165 }
        if (r4 != 0) goto L_0x016a;
    L_0x0149:
        r3 = new java.lang.String;	 Catch:{ all -> 0x0165 }
        r3.<init>(r0);	 Catch:{ all -> 0x0165 }
    L_0x014e:
        if (r1 == 0) goto L_0x0153;
    L_0x0150:
        r1.close();	 Catch:{ IOException -> 0x0170 }
    L_0x0153:
        r0 = r2;
        goto L_0x0133;
    L_0x0155:
        r0 = move-exception;
        r1 = r0;
        r0 = r4;
    L_0x0158:
        if (r0 == 0) goto L_0x015d;
    L_0x015a:
        r0.close();	 Catch:{ IOException -> 0x0172 }
    L_0x015d:
        throw r1;
    L_0x015e:
        r0 = move-exception;
        r1 = r3;
        goto L_0x013d;
    L_0x0161:
        r0 = move-exception;
        r1 = r0;
        r0 = r3;
        goto L_0x0158;
    L_0x0165:
        r0 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x0158;
    L_0x016a:
        r0.concat(r3);	 Catch:{ all -> 0x0165 }
        goto L_0x014e;
    L_0x016e:
        r0 = move-exception;
        goto L_0x0132;
    L_0x0170:
        r0 = move-exception;
        goto L_0x0153;
    L_0x0172:
        r0 = move-exception;
        goto L_0x015d;
        */
        throw new UnsupportedOperationException("Method not decompiled: emd.a(java.lang.String, java.util.List):boolean");
    }

    /* renamed from: a */
    public static void m1920a(String str, Map map, String str2, boolean z, boolean z2, kbg kbg, boolean z3) {
        if (str != null && new File(str).exists()) {
            String absolutePath;
            Options options;
            String str3;
            File[] listFiles = new File(str2).listFiles(new eme());
            if (listFiles.length > 0) {
                absolutePath = listFiles[0].getAbsolutePath();
            } else {
                absolutePath = null;
            }
            try {
                ExifInterface exifInterface = new ExifInterface(str);
                if (absolutePath != null) {
                    exifInterface.setAttribute("Make", new ExifInterface(absolutePath).getAttribute("Make"));
                } else {
                    exifInterface.setAttribute("Make", Build.MANUFACTURER);
                }
                options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                exifInterface.setAttribute("ImageWidth", String.valueOf(options.outWidth));
                exifInterface.setAttribute("ImageLength", String.valueOf(options.outHeight));
                absolutePath = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US).format(new Date(System.currentTimeMillis()));
                exifInterface.setAttribute("DateTime", absolutePath);
                exifInterface.setAttribute("DateTimeOriginal", absolutePath);
                exifInterface.setAttribute("DateTimeDigitized", absolutePath);
                exifInterface.setAttribute("Model", Build.MODEL);
                if (map != null) {
                    Double d = null;
                    Double d2 = null;
                    Double d3 = null;
                    Date date = null;
                    for (Entry entry : map.entrySet()) {
                        Double d4;
                        Date date2;
                        Double d5;
                        if (((String) entry.getKey()).equals("location_altitude")) {
                            d4 = d3;
                            d3 = emd.m1922b(entry);
                            date2 = date;
                            d5 = d2;
                        } else if (((String) entry.getKey()).equals("location_latitude")) {
                            d4 = d3;
                            d3 = d;
                            Double b = emd.m1922b(entry);
                            date2 = date;
                            d5 = b;
                        } else if (((String) entry.getKey()).equals("location_longitude")) {
                            d4 = emd.m1922b(entry);
                            d3 = d;
                            date2 = date;
                            d5 = d2;
                        } else if (((String) entry.getKey()).equals("location_provider")) {
                            exifInterface.setAttribute("GPSProcessingMethod", (String) entry.getValue());
                            date2 = date;
                            d4 = d3;
                            d5 = d2;
                            d3 = d;
                        } else if (((String) entry.getKey()).equals("location_time")) {
                            date2 = emd.m1918a(entry);
                            d4 = d3;
                            d5 = d2;
                            d3 = d;
                        } else {
                            date2 = date;
                            d4 = d3;
                            d5 = d2;
                            d3 = d;
                        }
                        d2 = d5;
                        d = d3;
                        date = date2;
                        d3 = d4;
                    }
                    if (d != null) {
                        str3 = "GPSAltitudeRef";
                        if (d.doubleValue() >= 0.0d) {
                            absolutePath = "0";
                        } else {
                            absolutePath = "1";
                        }
                        exifInterface.setAttribute(str3, absolutePath);
                    }
                    if (!(d2 == null || d3 == null)) {
                        String a = emd.m1916a(d2.doubleValue());
                        if (d2.doubleValue() < 0.0d) {
                            str3 = "S";
                        } else {
                            str3 = "N";
                        }
                        String a2 = emd.m1916a(d3.doubleValue());
                        if (d3.doubleValue() < 0.0d) {
                            absolutePath = "W";
                        } else {
                            absolutePath = "E";
                        }
                        if (!(a == null || a2 == null)) {
                            exifInterface.setAttribute("GPSLatitude", a);
                            exifInterface.setAttribute("GPSLatitudeRef", str3);
                            exifInterface.setAttribute("GPSLongitude", a2);
                            exifInterface.setAttribute("GPSLongitudeRef", absolutePath);
                        }
                    }
                    if (date != null) {
                        TimeZone timeZone = TimeZone.getTimeZone("UTC");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd", Locale.US);
                        simpleDateFormat.setTimeZone(timeZone);
                        exifInterface.setAttribute("GPSDateStamp", simpleDateFormat.format(date));
                        simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.US);
                        simpleDateFormat.setTimeZone(timeZone);
                        exifInterface.setAttribute("GPSTimeStamp", simpleDateFormat.format(date));
                    }
                }
                exifInterface.saveAttributes();
            } catch (IOException e) {
                absolutePath = String.valueOf(str);
                str3 = "Write exif failed :";
                if (absolutePath.length() == 0) {
                    absolutePath = new String(str3);
                } else {
                    str3.concat(absolutePath);
                }
            }
            if (z2 || kbg.mo9709b()) {
                C0556wd a3 = ern.m2083a();
                if (z2) {
                    try {
                        a3.mo11447a("http://ns.google.com/photos/1.0/panorama/", "UsePanoramaViewer", z);
                        a3.mo11447a("http://ns.google.com/photos/1.0/panorama/", "IsPhotosphere", z3);
                        a3.mo11442a("http://ns.google.com/photos/1.0/panorama/", "ProjectionType", (Object) "equirectangular");
                        if (map != null) {
                            Integer num = null;
                            Integer num2 = null;
                            Integer num3 = null;
                            Integer num4 = null;
                            Integer num5 = null;
                            Integer num6 = null;
                            Date date3 = null;
                            Date date4 = null;
                            Integer num7 = null;
                            Integer num8 = null;
                            Integer num9 = null;
                            for (Entry entry2 : map.entrySet()) {
                                Integer num10;
                                Date date5;
                                Integer num11;
                                Date date6;
                                Integer num12;
                                Integer num13;
                                Integer num14;
                                if (((String) entry2.getKey()).equals("full_pano_width")) {
                                    num10 = num8;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = num4;
                                    num14 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = emd.m1923c(entry2);
                                    num13 = num9;
                                    num9 = num14;
                                } else if (((String) entry2.getKey()).equals("full_pano_height")) {
                                    num10 = num8;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = emd.m1923c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("cropped_area_width")) {
                                    num10 = num8;
                                    num = num3;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = num4;
                                    num14 = num5;
                                    num5 = emd.m1923c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num14;
                                } else if (((String) entry2.getKey()).equals("cropped_area_height")) {
                                    num10 = num8;
                                    num2 = num4;
                                    date5 = date4;
                                    num11 = num6;
                                    num6 = emd.m1923c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("cropped_area_top")) {
                                    num10 = num8;
                                    num5 = num;
                                    date5 = date4;
                                    num = num3;
                                    num11 = num6;
                                    num6 = num2;
                                    num2 = num4;
                                    Date date7 = date3;
                                    num12 = emd.m1923c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date7;
                                } else if (((String) entry2.getKey()).equals("cropped_area_left")) {
                                    num10 = num8;
                                    num6 = num2;
                                    date5 = date4;
                                    num2 = num4;
                                    num11 = emd.m1923c(entry2);
                                    num13 = num9;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("first_photo_time")) {
                                    num10 = num8;
                                    num12 = num5;
                                    date5 = date4;
                                    num5 = num;
                                    num11 = num6;
                                    num = num3;
                                    num6 = num2;
                                    num2 = num4;
                                    num14 = num7;
                                    date6 = emd.m1918a(entry2);
                                    num13 = num9;
                                    num9 = num14;
                                } else if (((String) entry2.getKey()).equals("last_photo_time")) {
                                    num10 = num8;
                                    num11 = num6;
                                    date5 = emd.m1918a(entry2);
                                    num6 = num2;
                                    num13 = num9;
                                    num2 = num4;
                                    num9 = num7;
                                    date6 = date3;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("source_photos_count")) {
                                    num10 = num8;
                                    date6 = date3;
                                    date5 = date4;
                                    num12 = num5;
                                    num11 = num6;
                                    num5 = num;
                                    num6 = num2;
                                    num = num3;
                                    num2 = num4;
                                    num14 = num9;
                                    num9 = emd.m1923c(entry2);
                                    num13 = num14;
                                } else if (((String) entry2.getKey()).equals("pose_heading")) {
                                    num10 = emd.m1923c(entry2);
                                    date5 = date4;
                                    num13 = num9;
                                    num11 = num6;
                                    num9 = num7;
                                    num6 = num2;
                                    date6 = date3;
                                    num2 = num4;
                                    num12 = num5;
                                    num5 = num;
                                    num = num3;
                                } else if (((String) entry2.getKey()).equals("yaw_correction_deg")) {
                                    num13 = emd.m1923c(entry2);
                                    num10 = num8;
                                    num9 = num7;
                                    date5 = date4;
                                    date6 = date3;
                                    num11 = num6;
                                    num12 = num5;
                                    num6 = num2;
                                    num5 = num;
                                    num2 = num4;
                                    num = num3;
                                } else {
                                    num13 = num9;
                                    num10 = num8;
                                    num9 = num7;
                                    date5 = date4;
                                    date6 = date3;
                                    num11 = num6;
                                    num12 = num5;
                                    num6 = num2;
                                    num5 = num;
                                    num2 = num4;
                                    num = num3;
                                }
                                num4 = num2;
                                num3 = num;
                                num2 = num6;
                                num = num5;
                                num6 = num11;
                                num5 = num12;
                                date3 = date6;
                                date4 = date5;
                                num8 = num10;
                                num7 = num9;
                                num9 = num13;
                            }
                            if (!(num == null || num2 == null)) {
                                a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaImageHeightPixels", num2.intValue());
                                a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaImageWidthPixels", num.intValue());
                            }
                            if (!(num3 == null || num4 == null)) {
                                a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "FullPanoHeightPixels", num4.intValue());
                                a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "FullPanoWidthPixels", num3.intValue());
                            }
                            if (!(num5 == null || num6 == null)) {
                                a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaTopPixels", num5.intValue());
                                a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "CroppedAreaLeftPixels", num6.intValue());
                            }
                            if (date3 != null) {
                                a3.mo11442a("http://ns.google.com/photos/1.0/panorama/", "FirstPhotoDate", new C0774wq(date3, TimeZone.getTimeZone("GMT")));
                            }
                            if (date4 != null) {
                                a3.mo11445a("http://ns.google.com/photos/1.0/panorama/", "LastPhotoDate", new C0774wq(date4, TimeZone.getTimeZone("GMT")));
                            }
                            if (num7 != null) {
                                a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "SourcePhotosCount", num7.intValue());
                            }
                            if (!(num8 == null || num9 == null)) {
                                a3.mo11440a("http://ns.google.com/photos/1.0/panorama/", "PoseHeadingDegrees", (double) (((num9.intValue() + num8.intValue()) + 720) % 360));
                            }
                        }
                        options = new Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str, options);
                        int i = options.outWidth;
                        int i2 = options.outHeight;
                        a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectLeft", 0);
                        a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectTop", 0);
                        a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectWidth", i);
                        a3.mo11441a("http://ns.google.com/photos/1.0/panorama/", "LargestValidInteriorRectHeight", i2);
                    } catch (C0554wb e2) {
                        absolutePath = String.valueOf(e2.getLocalizedMessage());
                        str3 = "Set xmp property failed:";
                        if (absolutePath.length() == 0) {
                            absolutePath = new String(str3);
                            return;
                        } else {
                            str3.concat(absolutePath);
                            return;
                        }
                    }
                }
                if (kbg.mo9709b()) {
                    ern.m2092a(a3, (String) kbg.mo9706a());
                }
                if (!ern.m2091a(str, a3)) {
                    absolutePath = "Write XMP meta to file failed:";
                    str3 = String.valueOf(str);
                    if (str3.length() == 0) {
                        str3 = new String(absolutePath);
                    } else {
                        absolutePath.concat(str3);
                    }
                }
            }
        }
    }
}
