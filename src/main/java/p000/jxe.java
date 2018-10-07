package p000;

import android.graphics.PointF;
import com.google.android.vision.face.Face;
import com.google.android.vision.face.Landmark;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jxe */
final class jxe extends jxi {
    public jxe(String str) {
        super(str, (byte) 0);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9593a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                return arrayList;
            }
            PointF a = jcc.m4453a(dataInputStream);
            float readFloat = dataInputStream.readFloat();
            float readFloat2 = dataInputStream.readFloat();
            int readInt2 = dataInputStream.readInt();
            PointF[] pointFArr = new PointF[readInt2];
            for (i = 0; i < readInt2; i++) {
                pointFArr[i] = jcc.m4453a(dataInputStream);
            }
            float readFloat3 = dataInputStream.readFloat();
            float readFloat4 = dataInputStream.readFloat();
            float readFloat5 = dataInputStream.readFloat();
            int readInt3 = dataInputStream.readInt();
            Landmark[] landmarkArr = new Landmark[readInt3];
            for (i = 0; i < readInt3; i++) {
                landmarkArr[i] = new Landmark(jcc.m4453a(dataInputStream), dataInputStream.readInt());
            }
            arrayList.add(new Face(a, readFloat, readFloat2, pointFArr, readFloat3, readFloat4, readFloat5, landmarkArr, dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readFloat(), dataInputStream.readFloat(), dataInputStream.readFloat()));
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public final void mo9594a(Object obj, DataOutputStream dataOutputStream) {
        if (obj instanceof List) {
            List<Face> list = (List) obj;
            if (list.size() <= 0 || (list.get(0) instanceof Face)) {
                dataOutputStream.writeInt(list.size());
                for (Face face : list) {
                    jcc.m4461a(face.getPosition(), dataOutputStream);
                    dataOutputStream.writeFloat(face.getWidth());
                    dataOutputStream.writeFloat(face.getHeight());
                    List<PointF> visualizationPolygon = face.getVisualizationPolygon();
                    dataOutputStream.writeInt(visualizationPolygon.size());
                    for (PointF a : visualizationPolygon) {
                        jcc.m4461a(a, dataOutputStream);
                    }
                    dataOutputStream.writeFloat(face.getYawDegrees());
                    dataOutputStream.writeFloat(face.getRollDegrees());
                    dataOutputStream.writeFloat(face.getConfidence());
                    List<Landmark> landmarks = face.getLandmarks();
                    dataOutputStream.writeInt(landmarks.size());
                    for (Landmark landmark : landmarks) {
                        jcc.m4461a(landmark.getPosition(), dataOutputStream);
                        dataOutputStream.writeInt(landmark.getCategory());
                    }
                    dataOutputStream.writeInt(face.getTrackId());
                    dataOutputStream.writeInt(face.getFrameNumber());
                    dataOutputStream.writeFloat(face.getIsLeftEyeOpenScore());
                    dataOutputStream.writeFloat(face.getIsRightEyeOpenScore());
                    dataOutputStream.writeFloat(face.getIsSmilingScore());
                }
                return;
            }
            throw new IOException("Incorrect type for serialization");
        }
        throw new IOException("Incorrect type for serialization");
    }
}
