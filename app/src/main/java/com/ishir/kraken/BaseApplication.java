/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ishir.kraken;

import android.app.Application;

import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initAuto();
    }


    /**
     * 屏幕适配
     */
    private void initAuto() {
        AutoSize.initCompatMultiProcess(this);
        AutoSizeConfig.getInstance().getUnitsManager()
                .setSupportDP(false).setSupportSubunits(Subunits.MM);
    }

}
