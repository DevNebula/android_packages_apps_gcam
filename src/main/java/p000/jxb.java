package p000;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jxb */
final class jxb implements kbn {
    jxb() {
    }

    /* renamed from: a */
    private static Map m13526a() {
        Map hashMap = new HashMap();
        for (Field field : jxa.class.getFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && jxi.class.isAssignableFrom(field.getType())) {
                try {
                    jxi jxi = (jxi) field.get(null);
                    hashMap.put(jxi.f8434a, jxi);
                } catch (Throwable e) {
                    Log.e("Metadata", "Failed to get key constant from field", e);
                }
            }
        }
        return hashMap;
    }
}
