package com.mapscloud.jni;

/**
 * @author TomCan
 * @description:
 * @date:2023/2/7 13:56
 */
public class NativePort {

    public static native String getNativeMethod();

    public static native String getNativeMethod(int name);

    public static native int getNativeMethod(String name);

}
