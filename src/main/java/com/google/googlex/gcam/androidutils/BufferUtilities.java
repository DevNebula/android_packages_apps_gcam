package com.google.googlex.gcam.androidutils;

import com.google.googlex.gcam.androidutils.vecmath.Vector2f;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;
import com.google.googlex.gcam.androidutils.vecmath.Vector3f;
import com.google.googlex.gcam.androidutils.vecmath.Vector3i;
import com.google.googlex.gcam.androidutils.vecmath.Vector4f;
import com.google.googlex.gcam.androidutils.vecmath.Vector4i;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;

/* compiled from: PG */
public class BufferUtilities {
    public static void copy(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.position() == 0 && byteBuffer2.position() == 0 && byteBuffer.limit() == byteBuffer.capacity() && byteBuffer2.limit() == byteBuffer2.capacity() && byteBuffer.capacity() == byteBuffer2.capacity()) {
            byteBuffer2.duplicate().put(byteBuffer.duplicate());
            return;
        }
        throw new IllegalArgumentException("Cannot copy buffers that do not have default position and capacity.");
    }

    public static void fill(ByteBuffer byteBuffer, byte b) {
        for (int i = 0; i < byteBuffer.capacity(); i++) {
            byteBuffer.put(i, b);
        }
    }

    public static void put(FloatBuffer floatBuffer, Vector2f vector2f) {
        floatBuffer.put(vector2f.f2690x);
        floatBuffer.put(vector2f.f2691y);
    }

    public static void put(FloatBuffer floatBuffer, Vector3f vector3f) {
        floatBuffer.put(vector3f.f2694x);
        floatBuffer.put(vector3f.f2695y);
        floatBuffer.put(vector3f.f2696z);
    }

    public static void put(FloatBuffer floatBuffer, Vector4f vector4f) {
        floatBuffer.put(vector4f.f2705x);
        floatBuffer.put(vector4f.f2706y);
        floatBuffer.put(vector4f.f2707z);
        floatBuffer.put(vector4f.f2704w);
    }

    public static void put(IntBuffer intBuffer, Vector2i vector2i) {
        intBuffer.put(vector2i.f2692x);
        intBuffer.put(vector2i.f2693y);
    }

    public static void put(IntBuffer intBuffer, Vector3i vector3i) {
        intBuffer.put(vector3i.f2697x);
        intBuffer.put(vector3i.f2698y);
        intBuffer.put(vector3i.f2699z);
    }

    public static void put(IntBuffer intBuffer, Vector4i vector4i) {
        intBuffer.put(vector4i.f2709x);
        intBuffer.put(vector4i.f2710y);
        intBuffer.put(vector4i.f2711z);
        intBuffer.put(vector4i.f2708w);
    }

    public static void putVertices2D(FloatBuffer floatBuffer, List list) {
        for (Vector2f put : list) {
            put(floatBuffer, put);
        }
    }

    public static void putVertices2D(FloatBuffer floatBuffer, List list, float f) {
        for (Vector2f vector2f : list) {
            floatBuffer.put(vector2f.f2690x);
            floatBuffer.put(vector2f.f2691y);
            floatBuffer.put(f);
        }
    }

    public static void putVertices2D(FloatBuffer floatBuffer, List list, float f, float f2) {
        for (Vector2f vector2f : list) {
            floatBuffer.put(vector2f.f2690x);
            floatBuffer.put(vector2f.f2691y);
            floatBuffer.put(f);
            floatBuffer.put(f2);
        }
    }

    public static void putVertices3D(FloatBuffer floatBuffer, List list) {
        for (Vector3f put : list) {
            put(floatBuffer, put);
        }
    }

    public static void putVertices3D(FloatBuffer floatBuffer, List list, float f) {
        for (Vector3f vector3f : list) {
            floatBuffer.put(vector3f.f2694x);
            floatBuffer.put(vector3f.f2695y);
            floatBuffer.put(vector3f.f2696z);
            floatBuffer.put(f);
        }
    }

    public static void putVertices4D(FloatBuffer floatBuffer, List list) {
        for (Vector4f put : list) {
            put(floatBuffer, put);
        }
    }

    public static FloatBuffer toFloatBuffer2D(List list) {
        int size = list.size();
        FloatBuffer allocate = FloatBuffer.allocate(size + size);
        putVertices2D(allocate, list);
        return allocate;
    }

    public static FloatBuffer toFloatBuffer2D(List list, float f) {
        FloatBuffer allocate = FloatBuffer.allocate(list.size() * 3);
        putVertices2D(allocate, list, f);
        return allocate;
    }

    public static FloatBuffer toFloatBuffer2D(List list, float f, float f2) {
        FloatBuffer allocate = FloatBuffer.allocate(list.size() << 2);
        putVertices2D(allocate, list, f, f2);
        return allocate;
    }

    public static FloatBuffer toFloatBuffer3D(List list) {
        FloatBuffer allocate = FloatBuffer.allocate(list.size() * 3);
        putVertices3D(allocate, list);
        return allocate;
    }

    public static FloatBuffer toFloatBuffer3D(List list, float f) {
        FloatBuffer allocate = FloatBuffer.allocate(list.size() << 2);
        putVertices3D(allocate, list, f);
        return allocate;
    }

    public static FloatBuffer toFloatBuffer4D(List list) {
        FloatBuffer allocate = FloatBuffer.allocate(list.size() << 2);
        putVertices4D(allocate, list);
        return allocate;
    }
}
