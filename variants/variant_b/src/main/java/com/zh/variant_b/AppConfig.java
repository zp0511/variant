package com.zh.variant_b;


import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * Description：
 * App全局配置类
 * 包含:当前variant私有的https请求参数
 * 三方的依赖的id和key
 */
@StringDef({AppConfig.SPEECH})
@Retention(RetentionPolicy.SOURCE)
public @interface AppConfig {
    String SPEECH = "123456";
}
