package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Pair;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.imageutils.GrayValuesExtractor;
import com.google.android.libraries.smartburst.filterfw.imageutils.ImageCropper;
import com.google.android.libraries.smartburst.filterpacks.face.FaceSharpnessCalculator;
import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import com.google.android.libraries.smartburst.filterpacks.face.PittPattFaceDetector;
import com.google.android.libraries.smartburst.filterpacks.image.ImageHistogramEqualization;
import com.google.android.libraries.smartburst.utils.FloatArray;
import com.google.android.vision.face.Face;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jrq */
public final class jrq implements jry {
    /* renamed from: a */
    private static final PittPattFaceDetector f21678a = new PittPattFaceDetector(true, true, true, 20, 0);
    /* renamed from: b */
    private static final GrayValuesExtractor f21679b = new GrayValuesExtractor(false);
    /* renamed from: c */
    private static final FaceSharpnessCalculator f21680c = new FaceSharpnessCalculator(false);
    /* renamed from: d */
    private final Context f21681d;

    public jrq(Context context) {
        jri.m13404b((Object) context);
        this.f21681d = context;
    }

    /* renamed from: a */
    private static float m13417a(List list, jrx jrx) {
        jri.m13404b((Object) list);
        jri.m13404b((Object) jrx);
        float f = 0.0f;
        for (Face a : list) {
            f = jrx.mo9217a(a).floatValue() + f;
        }
        if (list.isEmpty()) {
            return 0.0f;
        }
        return f / ((float) list.size());
    }

    /* renamed from: b */
    private static Pair m13418b(List list, jrx jrx) {
        jri.m13404b((Object) list);
        jri.m13395a(list.isEmpty() ^ 1);
        jri.m13404b((Object) jrx);
        Iterator it = list.iterator();
        float f = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        while (true) {
            float f3 = f;
            f = f2;
            if (!it.hasNext()) {
                return Pair.create(Float.valueOf(f), Float.valueOf(f3));
            }
            float floatValue = jrx.mo9217a((Face) it.next()).floatValue();
            f2 = Math.min(f, floatValue);
            f = Math.max(f3, floatValue);
        }
    }

    /* renamed from: a */
    public final jxa mo9540a(long j, Bitmap bitmap) {
        jri.m13404b((Object) bitmap);
        FrameManager.attachToThread();
        try {
            jri.m13404b((Object) bitmap);
            Object a = jqk.m13328a(bitmap);
            int width = a.getWidth();
            int height = a.getHeight();
            jri.m13404b(a);
            int[] outputFrameDimensions = f21679b.getOutputFrameDimensions(a.getDimensions());
            FrameBuffer2D asFrameBuffer2D = Frame.create(FrameType.buffer2D(100), outputFrameDimensions).asFrameBuffer2D();
            f21679b.toGrayValues((FrameImage2D) a, asFrameBuffer2D);
            ByteBuffer lockBytes = asFrameBuffer2D.lockBytes(1);
            FrameBuffer2D asFrameBuffer2D2 = Frame.create(FrameType.buffer2D(100), outputFrameDimensions).asFrameBuffer2D();
            ByteBuffer lockBytes2 = asFrameBuffer2D2.lockBytes(2);
            ImageHistogramEqualization.applyImageHistogramEqualization(lockBytes, a.getWidth(), a.getHeight(), lockBytes2);
            asFrameBuffer2D.unlock();
            asFrameBuffer2D.release();
            Object<Face> detectFaces = f21678a.detectFaces(this.f21681d, lockBytes2, a.getWidth(), a.getHeight());
            asFrameBuffer2D2.unlock();
            asFrameBuffer2D2.release();
            jxa jxa = new jxa();
            if (detectFaces.isEmpty()) {
                jxa.mo9590a(jxa.f8412c, new ArrayList());
            } else {
                float f;
                Face face;
                jri.m13404b(a);
                jri.m13404b((Object) detectFaces);
                FloatArray floatArray = new FloatArray();
                Iterator it = detectFaces.iterator();
                float f2 = 0.0f;
                while (true) {
                    f = f2;
                    if (!it.hasNext()) {
                        break;
                    }
                    f2 = f21680c.computeFaceSharpness(a, (Face) it.next());
                    floatArray.add(f2);
                    f2 += f;
                }
                if (detectFaces.isEmpty()) {
                    f2 = 0.0f;
                } else {
                    f2 = f / ((float) detectFaces.size());
                }
                Pair create = Pair.create(floatArray, Float.valueOf(f2));
                float a2 = jrq.m13417a((List) detectFaces, new jrr());
                float a3 = jrq.m13417a((List) detectFaces, new jrt());
                float a4 = jrq.m13417a((List) detectFaces, new jrv());
                jri.m13404b((Object) detectFaces);
                jri.m13395a(detectFaces.isEmpty() ^ 1);
                Iterator it2 = detectFaces.iterator();
                f2 = Float.MAX_VALUE;
                while (true) {
                    f = f2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    face = (Face) it2.next();
                    f2 = Math.min(f, Math.max(face.getIsLeftEyeOpenScore(), face.getIsRightEyeOpenScore()));
                }
                Pair b = jrq.m13418b(detectFaces, new jrs());
                Pair b2 = jrq.m13418b(detectFaces, new jru());
                Pair b3 = jrq.m13418b(detectFaces, new jrw());
                jri.m13404b((Object) detectFaces);
                jri.m13395a(detectFaces.isEmpty() ^ 1);
                RectF rectF = new RectF();
                for (Face face2 : detectFaces) {
                    rectF.union(FaceUtils.getFaceRect(face2, width, height));
                }
                jri.m13404b(a);
                jri.m13404b((Object) detectFaces);
                width = a.getWidth();
                height = a.getHeight();
                FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
                ArrayList arrayList = new ArrayList(detectFaces.size());
                for (Face face22 : detectFaces) {
                    int[] iArr = new int[]{width, height};
                    int[] computeCropDimensions = ImageCropper.computeCropDimensions(iArr, FaceUtils.getFaceQuad(face22, width, height));
                    FrameImage2D asFrameImage2D = Frame.create(image2D, computeCropDimensions).asFrameImage2D();
                    FaceUtils.cropFace(a, face22, asFrameImage2D);
                    asFrameBuffer2D2 = Frame.create(FrameType.buffer2D(100), f21679b.getOutputFrameDimensions(computeCropDimensions)).asFrameImage2D();
                    f21679b.toGrayValues(asFrameImage2D, asFrameBuffer2D2);
                    asFrameImage2D.release();
                    ByteBuffer lockBytes3 = asFrameBuffer2D2.lockBytes(1);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(lockBytes3.capacity());
                    lockBytes3.rewind();
                    allocateDirect.put(lockBytes3);
                    lockBytes3.rewind();
                    allocateDirect.flip();
                    asFrameBuffer2D2.unlock();
                    asFrameBuffer2D2.release();
                    arrayList.add(allocateDirect);
                }
                jxa.mo9590a(jxa.f8412c, detectFaces).mo9590a(jxa.f8413d, (FloatArray) create.first).mo9590a(jxa.f8414e, (Float) create.second).mo9590a(jxa.f8415f, Float.valueOf(a2)).mo9590a(jxa.f8416g, Float.valueOf(f)).mo9590a(jxa.f8417h, (Float) b.first).mo9590a(jxa.f8418i, (Float) b.second).mo9590a(jxa.f8419j, Float.valueOf(a3)).mo9590a(jxa.f8420k, (Float) b2.first).mo9590a(jxa.f8421l, (Float) b2.second).mo9590a(jxa.f8422m, Float.valueOf(a4)).mo9590a(jxa.f8423n, (Float) b3.first).mo9590a(jxa.f8424o, (Float) b3.second).mo9590a(jxa.f8425p, rectF).mo9590a(jxa.f8431v, arrayList);
            }
            a.release();
            return jxa;
        } finally {
            FrameManager.detachFromThread();
        }
    }

    public final String toString() {
        return "FaceMetadataExtractor";
    }
}
