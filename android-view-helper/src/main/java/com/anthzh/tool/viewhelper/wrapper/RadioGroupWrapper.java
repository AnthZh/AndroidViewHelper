/*
* Copyright (C) 2017 anthzh89@gmail.com
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
package com.anthzh.tool.viewhelper.wrapper;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

@SuppressWarnings("unchecked")
public class RadioGroupWrapper<W extends RadioGroupWrapper<W>> extends LinearLayoutWrapper<W> {
    protected RadioGroup mView;

    public RadioGroupWrapper(RadioGroup view) {
        super(view);
        mView = view;
    }

    /**
    * @see RadioGroup#check(int)
    */
     public W check(int id) {
         mView.check(id);
         return (W) this;
     }

    /**
    * @see RadioGroup#setOnCheckedChangeListener(OnCheckedChangeListener)
    */
     public W setOnCheckedChangeListener(OnCheckedChangeListener listener) {
         mView.setOnCheckedChangeListener(listener);
         return (W) this;
     }

    /**
    * @see RadioGroup#clearCheck()
    */
     public W clearCheck() {
         mView.clearCheck();
         return (W) this;
     }

}