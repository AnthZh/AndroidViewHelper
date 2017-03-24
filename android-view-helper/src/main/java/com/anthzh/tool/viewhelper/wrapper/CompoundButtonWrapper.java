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

import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

@SuppressWarnings("unchecked")
public class CompoundButtonWrapper<W extends CompoundButtonWrapper<W>> extends ButtonWrapper<W> {
    protected CompoundButton mView;

    public CompoundButtonWrapper(CompoundButton view) {
        super(view);
        mView = view;
    }

    /**
    * @see CompoundButton#setChecked(boolean)
    */
     public W setChecked(boolean checked) {
         mView.setChecked(checked);
         return (W) this;
     }

    /**
    * @see CompoundButton#toggle()
    */
     public W toggle() {
         mView.toggle();
         return (W) this;
     }

    /**
    * @see CompoundButton#setButtonDrawable(Drawable)
    */
     public W setButtonDrawable(Drawable d) {
         mView.setButtonDrawable(d);
         return (W) this;
     }

    /**
    * @see CompoundButton#setButtonDrawable(int)
    */
     public W setButtonDrawable(int resid) {
         mView.setButtonDrawable(resid);
         return (W) this;
     }

    /**
    * @see CompoundButton#setOnCheckedChangeListener(OnCheckedChangeListener)
    */
     public W setOnCheckedChangeListener(OnCheckedChangeListener listener) {
         mView.setOnCheckedChangeListener(listener);
         return (W) this;
     }

}