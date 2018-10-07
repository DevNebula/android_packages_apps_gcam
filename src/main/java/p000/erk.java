package p000;

import android.media.MediaMetadataRetriever;

/* compiled from: PG */
/* renamed from: erk */
public final class erk {
    /* renamed from: a */
    private static final String f4359a = bli.m887a("VidRotDataLoader");

    /* renamed from: a */
    public static boolean m2079a(erj erj, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(25);
            if (extractMetadata2 == null || extractMetadata3 == null || extractMetadata == null || extractMetadata4 == null) {
                extractMetadata = f4359a;
                extractMetadata2 = "Metadata does not exist for the video at ";
                extractMetadata4 = String.valueOf(str);
                if (extractMetadata4.length() == 0) {
                    extractMetadata4 = new String(extractMetadata2);
                } else {
                    extractMetadata4 = extractMetadata2.concat(extractMetadata4);
                }
                bli.m898e(extractMetadata, extractMetadata4);
                return false;
            }
            erj.f4345b = extractMetadata;
            erj.f4346c = Integer.parseInt(extractMetadata2);
            erj.f4347d = Integer.parseInt(extractMetadata3);
            erj.f4348e = (int) Double.parseDouble(extractMetadata4);
            return true;
        } catch (Throwable e) {
            bli.m892b(f4359a, "VideoRotationMetadataLoader.loadRotationMetadata() failed!", e);
        }
    }
}
