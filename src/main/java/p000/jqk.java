package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import com.google.android.libraries.smartburst.utils.MathUtils;
import com.google.common.p006io.ByteStreams;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jqk */
public class jqk implements jnp {
    /* renamed from: a */
    private static Boolean f21654a;
    /* renamed from: b */
    private static Exception f21655b;
    /* renamed from: c */
    private static volatile Thread f21656c;

    jqk() {
    }

    /* renamed from: a */
    public static OutputStream m13329a(File file) {
        return new BufferedOutputStream(new FileOutputStream(file), 8192);
    }

    /* renamed from: a */
    public static void m13345a(jms jms, Context context, jmr jmr, String[] strArr, Executor executor, jqo jqo) {
        if (jmr.mo9517a()) {
            jmx.m13233b(jms);
            jnq.m13252a(jms, jqo, executor);
            jms.f8294c = false;
            jms.mo9522b(juk.class, "segment_classifier").mo9524a(new jqe());
            jms.mo9522b(jtf.class, "default").mo9524a(new jqi());
            jms.mo9522b(jry.class, "parallel_metadata_extractor").mo9524a(new jqj());
            jms.mo9522b(jry.class, "serial_metadata_extractor").mo9524a(new jns(context));
            jms.mo9522b(jum.class, "summary_collage_frameset_selector").mo9524a(new jnt());
            jms.mo9522b(jir[].class, "default").mo9524a(new jnu(strArr));
            jms.mo9522b(juk.class, "action_burst_segmenter").mo9524a(new jnv());
            jms.mo9522b(jiq.class, "action_collage_artifact_renderer").mo9524a(new jnw());
            jms.mo9522b(jir.class, "Collage_Action").mo9524a(new jnx());
            jms.mo9522b(juk.class, "Collage_Action").mo9524a(new jny());
            jms.mo9522b(jiq.class, "camera_pan_artifact_renderer").mo9524a(new jnz());
            jms.mo9522b(jir.class, "Collage_CameraPan").mo9524a(new joa());
            jms.mo9522b(juk.class, "Collage_CameraPan").mo9524a(new job());
            jms.mo9522b(jiq.class, "summary_collage_artifact_renderer").mo9524a(new jod());
            jms.mo9522b(jir.class, "Collage_Summary").mo9524a(new joe());
            jms.mo9522b(juk.class, "Collage_Summary").mo9524a(new jof());
            jms.mo9522b(jtv.class, "post_proc_quality_metric").mo9524a(new jog());
            jms.mo9522b(jtv.class, "facemaximumeyeopen").mo9524a(new joh());
            jms.mo9522b(jtv.class, "faceaverageeyeopen").mo9524a(new joi());
            jms.mo9522b(jwp.class, "chroma_histogram_feature_row_metric").mo9524a(new joj());
            jms.mo9522b(jwq.class, "chroma_histogram_frame_distance_metric").mo9524a(new jok());
            jms.mo9522b(jiq.class, "action_gif_artifact_renderer").mo9524a(new jol());
            jms.mo9522b(jir.class, "GIF_Action").mo9524a(new jom());
            jms.mo9522b(juk.class, "GIF_Action").mo9524a(new joo());
            jms.mo9522b(juk.class, "continuous_action").mo9524a(new jop());
            jms.mo9522b(jir.class, "GIF_Summary").mo9524a(new joq());
            jms.mo9522b(juk.class, "GIF_Summary").mo9524a(new jor());
            jms.mo9522b(jiq.class, "summary_gif_artifact_renderer").mo9524a(new jos());
            jms.mo9522b(ByteBuffer.class, "dither_samples").mo9524a(new jot(context));
            jms.mo9522b(ByteBuffer.class, "skin_samples").mo9524a(new jou(context));
            jms.mo9522b(ByteBuffer.class, "landmark_extrapolator_models").mo9524a(new jov(context));
            jms.mo9522b(jjf.class, "default").mo9524a(new jow());
            jms.mo9522b(MotionStabilizer.class, "default").mo9524a(new jox());
            jms.mo9522b(jiq.class, "photobooth_artifact_renderer").mo9524a(new joz());
            jms.mo9522b(jiv[].class, "cropping_layouts").mo9524a(new jpa());
            jms.mo9522b(jiv[].class, "noncropping_layouts").mo9524a(new jpb());
            jms.mo9522b(jiv[].class, "combined_layouts").mo9524a(new jpc());
            jms.mo9522b(jir.class, "Collage_PhotoBooth").mo9524a(new jpd());
            jms.mo9522b(jiq.class, "all_smiles_artifact_render").mo9524a(new jpe());
            jms.mo9522b(jir.class, "AllSmiles").mo9524a(new jpf());
            jms.mo9522b(juk.class, "Collage_PhotoBooth").mo9524a(new jpg());
            jms.mo9522b(juk.class, "AllSmiles").mo9524a(new jph());
            jms.mo9522b(juk.class, "face_detector").mo9524a(new jpi());
            jms.mo9522b(jir.class, "Video_VFR").mo9524a(new jpk());
            jms.mo9522b(juk.class, "Video_VFR").mo9524a(new jpl());
            jms.mo9522b(jiq.class, "VFR_video_artifact_render").mo9524a(new jpm(context));
            jms.mo9522b(jum.class, "panning_collage_frameset_selector").mo9524a(new jpn());
            jms.mo9522b(juk.class, "jump_cut").mo9524a(new jpo());
            jms.mo9522b(juk.class, "action_merger").mo9524a(new jpp());
            jms.mo9522b(jtv.class, "best_frame_quality_metric").mo9524a(new jpq());
            jms.mo9522b(juk.class, "image_sharpness_filter").mo9524a(new jpr());
            jms.mo9522b(juk.class, "face_quality_filter").mo9524a(new jps());
            jms.mo9522b(jso.class, "default").mo9524a(new jpt());
            jms.mo9522b(jst.class, "default").mo9524a(new jpv());
            jms.mo9522b(juk.class, "segmenter").mo9524a(new jpw());
            jms.mo9522b(jtv.class, "panning_content_value").mo9524a(new jpx());
            jms.mo9522b(jtv.class, "summary_content_value").mo9524a(new jpy());
            jms.mo9522b(jtv.class, "time_gap_score").mo9524a(new jqk());
            jms.mo9522b(jtv.class, "color_diversity").mo9524a(new jpz());
            jms.mo9522b(jtv.class, "video_presentation_time").mo9524a(new jqa());
            jms.f8294c = true;
            return;
        }
        jnq.m13252a(jms, jqo, executor);
        jms.f8294c = false;
        jms.mo9522b(jtf.class, "default").mo9524a(new jnr());
        jms.mo9522b(jry.class, "parallel_metadata_extractor").mo9524a(new joc());
        jms.mo9522b(jry.class, "serial_metadata_extractor").mo9524a(new jon());
        jms.mo9522b(jir[].class, "default").mo9524a(new joy());
        jms.mo9522b(jso.class, "default").mo9524a(new jpj());
        jms.mo9522b(jtv.class, "post_proc_quality_metric").mo9524a(new jpu());
        jms.f8294c = true;
    }

    /* renamed from: a */
    public static FrameImage2D m13327a(int i, int i2) {
        return Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 9), new int[]{i, i2}).asFrameImage2D();
    }

    /* renamed from: a */
    public static void m13344a() {
        if (f21656c == null) {
            f21656c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == f21656c) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    /* renamed from: a */
    public static jrg m13338a(Set set, jrg jrg) {
        boolean z;
        if (jrg.mo13836f() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        jrj jrj = new jrj();
        NavigableSet treeSet = new TreeSet(jrg.mo13835e());
        for (Long longValue : set) {
            long longValue2 = longValue.longValue();
            jrj.mo9537a(longValue2, jrg.mo13831c(MathUtils.closestValue(treeSet, longValue2)), jrg.f21668a, jrg.f21669b, jrg.f21670c.contains(Long.valueOf(longValue2)));
        }
        return jrj.mo9536a();
    }

    /* renamed from: a */
    public static Object m13330a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    /* renamed from: a */
    public static FrameImage2D m13328a(Bitmap bitmap) {
        FrameImage2D a = jqk.m13327a(bitmap.getWidth(), bitmap.getHeight());
        a.setBitmap(bitmap);
        return a;
    }

    /* renamed from: a */
    public static ByteBuffer m13336a(Context context, int i) {
        byte[] bArr = new byte[0];
        try {
            bArr = ByteStreams.toByteArray(new BufferedInputStream(context.getResources().openRawResource(i), 8192));
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    /* renamed from: a */
    public static ArrayList m13337a(String str, String str2) {
        Object arrayList = new ArrayList(r11);
        for (String str3 : str.split("\n")) {
            Object str4;
            int indexOf = str3.indexOf(32);
            String[] split = str3.substring(0, indexOf).split(":");
            int i = split.length != 2 ? 0 : indexOf > 0 ? 1 : 0;
            String valueOf = String.valueOf(str3);
            String str5 = "Invalid license meta-data line:\n";
            if (valueOf.length() == 0) {
                str4 = new String(str5);
            } else {
                str4 = str5.concat(valueOf);
            }
            if (i == 0) {
                throw new IllegalStateException(String.valueOf(str4));
            }
            arrayList.add(new kaj(str3.substring(indexOf + 1), Long.parseLong(split[0]), Integer.parseInt(split[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static String m13333a(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = LfuScheduler.MAX_PRIORITY;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (Throwable e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (Throwable e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A:{SYNTHETIC, Splitter: B:21:0x0030} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0030 A:{SYNTHETIC, Splitter: B:21:0x0030} */
    /* renamed from: a */
    public static java.lang.String m13335a(java.lang.String r6, java.lang.String r7, long r8, int r10) {
        /*
        r0 = 0;
        r1 = new java.util.jar.JarFile;	 Catch:{ IOException -> 0x001e, all -> 0x003f }
        r1.<init>(r7);	 Catch:{ IOException -> 0x001e, all -> 0x003f }
        r2 = r1.getJarEntry(r6);	 Catch:{ IOException -> 0x003d, all -> 0x0034 }
        if (r2 == 0) goto L_0x0018;
    L_0x000c:
        r0 = r1.getInputStream(r2);	 Catch:{ IOException -> 0x003d, all -> 0x0034 }
        r0 = p000.jqk.m13333a(r0, r8, r10);	 Catch:{ IOException -> 0x003d, all -> 0x0034 }
        r1.close();	 Catch:{ IOException -> 0x0039 }
    L_0x0017:
        return r0;
    L_0x0018:
        r1.close();	 Catch:{ IOException -> 0x001c }
        goto L_0x0017;
    L_0x001c:
        r1 = move-exception;
        goto L_0x0017;
    L_0x001e:
        r1 = move-exception;
        r4 = r0;
        r0 = r1;
        r1 = r4;
    L_0x0022:
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x002a }
        r3 = "Failed to read license text.";
        r2.<init>(r3, r0);	 Catch:{ all -> 0x002a }
        throw r2;	 Catch:{ all -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x002e:
        if (r0 == 0) goto L_0x0033;
    L_0x0030:
        r0.close();	 Catch:{ IOException -> 0x003b }
    L_0x0033:
        throw r1;
    L_0x0034:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x002e;
    L_0x0039:
        r1 = move-exception;
        goto L_0x0017;
    L_0x003b:
        r0 = move-exception;
        goto L_0x0033;
    L_0x003d:
        r0 = move-exception;
        goto L_0x0022;
    L_0x003f:
        r1 = move-exception;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: jqk.a(java.lang.String, java.lang.String, long, int):java.lang.String");
    }

    /* renamed from: a */
    public static String m13332a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return jqk.m13333a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder))), j, i);
    }

    /* renamed from: a */
    public static void m13346a(jms jms, jyt jyt) {
        jms.mo9520a(juk.class, new jye(jyt.mo9616a("segmentation.txt")));
        jms.mo9520a(jwp.class, new jyf(jyt));
        jms.mo9520a(jst.class, new jyg(jyt.mo9616a("frame_sequence_distances.txt")));
        jms.mo9520a(jiq.class, new jyh(jyt.mo9616a("artifact_renderer.txt")));
        jms.mo9520a(jxm.class, new jyi(jyt));
        jyt.mo9618a("post_process_config.txt", jms.mo9519a());
    }

    /* renamed from: c */
    private static boolean m13355c() {
        if (f21654a != null) {
            return f21654a.booleanValue();
        }
        if (f21655b != null) {
            throw f21655b;
        }
        try {
            f21654a = Boolean.valueOf(Build.PRODUCT.startsWith("sdk_google"));
            return f21654a.booleanValue();
        } catch (Exception e) {
            f21655b = e;
            throw e;
        }
    }

    /* renamed from: b */
    public static boolean m13352b() {
        try {
            return jqk.m13355c();
        } catch (Throwable e) {
            Log.w("IsEmulator", "Could not determine if emulator.  Assuming false.", e);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m13348a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* renamed from: a */
    public static p000.jrj m13339a(java.io.File r14, p000.jxy r15) {
        /*
        r4 = 0;
        r3 = new jrj;
        r3.<init>();
        r6 = r15.mo9614f(r14);
        if (r6 == 0) goto L_0x000f;
    L_0x000c:
        r7 = r6.length;
        if (r7 != 0) goto L_0x0011;
    L_0x000f:
        r0 = r3;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = p000.jzp.m4772a(r4, r4);
        r8 = new java.util.HashMap;
        r8.<init>();
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r5 = r4;
    L_0x001e:
        if (r5 >= r7) goto L_0x0042;
    L_0x0020:
        r9 = r6[r5];
        r2 = new jqz;	 Catch:{ jra -> 0x0078 }
        r2.<init>(r9);	 Catch:{ jra -> 0x0078 }
        r8.put(r9, r2);	 Catch:{ jra -> 0x0078 }
        r10 = r2.f24782a;	 Catch:{ jra -> 0x0078 }
        r11 = r2.f24783b;	 Catch:{ jra -> 0x0078 }
        r2 = r10 * r11;
        if (r2 >= r0) goto L_0x003e;
    L_0x0032:
        r0 = p000.jzp.m4772a(r10, r11);	 Catch:{ jra -> 0x00c2 }
        r1 = r2;
    L_0x0037:
        r2 = r5 + 1;
        r5 = r2;
        r13 = r0;
        r0 = r1;
        r1 = r13;
        goto L_0x001e;
    L_0x003e:
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x0037;
    L_0x0042:
        r5 = r6.length;
        r2 = r4;
    L_0x0044:
        if (r2 >= r5) goto L_0x0076;
    L_0x0046:
        r4 = r6[r2];
        r0 = r8.containsKey(r4);	 Catch:{ jya -> 0x0097 }
        if (r0 == 0) goto L_0x0072;
    L_0x004e:
        r10 = r15.mo9615g(r4);	 Catch:{ jya -> 0x0097 }
        r7 = new jrf;	 Catch:{ jya -> 0x0097 }
        r0 = r8.get(r4);	 Catch:{ jya -> 0x0097 }
        r0 = (p000.jqz) r0;	 Catch:{ jya -> 0x0097 }
        r9 = r1.f8515a;	 Catch:{ jya -> 0x0097 }
        r12 = r1.f8516b;	 Catch:{ jya -> 0x0097 }
        r7.<init>(r0, r9, r12);	 Catch:{ jya -> 0x0097 }
        r0 = new kab;	 Catch:{ jya -> 0x0097 }
        r7 = p000.jqk.m13349b(r7);	 Catch:{ jya -> 0x0097 }
        r0.<init>(r7);	 Catch:{ jya -> 0x0097 }
        r0 = p000.jqk.m13341a(r0);	 Catch:{ jya -> 0x0097 }
        r7 = 0;
        r3.mo9539a(r10, r0, r7);	 Catch:{ jya -> 0x0097 }
    L_0x0072:
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0044;
    L_0x0076:
        r0 = r3;
        goto L_0x0010;
    L_0x0078:
        r2 = move-exception;
        r2 = r0;
    L_0x007a:
        r0 = r9.getAbsolutePath();
        r0 = java.lang.String.valueOf(r0);
        r9 = "BitmapDecodingException for file : ";
        r10 = r0.length();
        if (r10 != 0) goto L_0x00bd;
    L_0x008a:
        r0 = new java.lang.String;
        r0.<init>(r9);
    L_0x008f:
        r9 = "Summaries";
        android.util.Log.w(r9, r0);
        r0 = r1;
        r1 = r2;
        goto L_0x0037;
    L_0x0097:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = java.lang.String.valueOf(r4);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 34;
        r4.<init>(r3);
        r3 = "Couldn't get timestamp from file: ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x00bd:
        r0 = r9.concat(r0);
        goto L_0x008f;
    L_0x00c2:
        r0 = move-exception;
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: jqk.a(java.io.File, jxy):jrj");
    }

    /* renamed from: a */
    public static kah m13341a(kai kai) {
        return new jzz(kai);
    }

    /* renamed from: a */
    public static kbn m13343a(kbn kbn) {
        if ((kbn instanceof kbp) || (kbn instanceof kbo)) {
            return kbn;
        }
        if (kbn instanceof Serializable) {
            return new kbo(kbn);
        }
        return new kbp(kbn);
    }

    /* renamed from: a */
    public static kbn m13342a(Object obj) {
        return new kbq(obj);
    }

    /* renamed from: b */
    public static boolean m13353b(File file) {
        boolean z;
        if (file.isDirectory()) {
            int i;
            jri.m13404b((Object) file);
            jri.m13395a(file.isDirectory());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int i2 = 0;
                i = 1;
                while (i2 < listFiles.length) {
                    int b = jqk.m13353b(listFiles[i2]) & i;
                    i2++;
                    i = b;
                }
            } else {
                i = 1;
            }
            z = i != 0;
        } else {
            z = true;
        }
        if (z && file.delete()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static kah m13340a(AutoCloseable autoCloseable) {
        return jqk.m13341a(new kab(jqk.m13349b(autoCloseable)));
    }

    /* renamed from: b */
    public static jzx m13349b(AutoCloseable autoCloseable) {
        return new kaa(autoCloseable);
    }

    /* renamed from: a */
    public static String m13334a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (jqk.m13348a(str.charAt(i))) {
                char[] toCharArray = str.toCharArray();
                while (i < length) {
                    char c = toCharArray[i];
                    if (jqk.m13348a(c)) {
                        toCharArray[i] = (char) (c ^ 32);
                    }
                    i++;
                }
                return String.valueOf(toCharArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static kbd m13350b(Object obj) {
        return new kbd(obj.getClass().getSimpleName());
    }

    /* renamed from: b */
    public static kbd m13351b(String str) {
        return new kbd(str);
    }

    /* renamed from: a */
    public static void m13347a(boolean z) {
        if (!z) {
            throw new kbs();
        }
    }

    /* renamed from: c */
    public static Object m13354c(Object obj) {
        return jqk.m13331a(obj, "expected a non-null reference", new Object[0]);
    }

    /* renamed from: a */
    public static Object m13331a(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new kbs(jri.m13393a(str, objArr));
    }
}
