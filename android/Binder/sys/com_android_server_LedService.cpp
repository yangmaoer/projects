#define LOG_TAG "LedService_JNI"

#include "jni.h"
#include "JNIHelp.h"
#include "android_runtime/AndroidRuntime.h"

#include <utils/misc.h>
#include <utils/Log.h>

#include <stdio.h>

#include <stdlib.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <sys/ioctl.h>

#define Loge(...) ALOGE( __VA_ARGS__)

namespace android
{
    static jint fd;

    jint ledOpen(JNIEnv *env, jobject cls)
    {
        fd = open("/dev/myled_dev", O_RDWR);
        Loge("jni ledOpen : %d", fd);
        if (fd >= 0)
            return 0;
        else
            return -1;
    }
    void ledClose(JNIEnv *env, jobject cls)
    {
        Loge("jni ledClose ...");
        close(fd);
    }
    jint ledCtrl(JNIEnv *env, jobject cls, jint which, jint status)
    {
        int ret = ioctl(fd, status, which);
        Loge("jni ledCtrl : %d, %d, %d", which, status, ret);
        return ret;
    }
    static const JNINativeMethod methods[] = {
        {"native_ledOpen", "()I", (void *)ledOpen},
        {"native_ledClose", "()V", (void *)ledClose},
        {"native_ledCtrl", "(II)I", (void *)ledCtrl},
    };
    int register_android_server_LedService(JNIEnv *env)
    {
        return jniRegisterNativeMethods(env, "com/android/server/LedService",
                methods, NELEM(methods));
    }
}
