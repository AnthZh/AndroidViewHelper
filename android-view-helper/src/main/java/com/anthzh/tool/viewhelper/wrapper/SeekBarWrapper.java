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

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

@SuppressWarnings("unchecked")
public class SeekBarWrapper<W extends SeekBarWrapper<W>> extends AbsSeekBarWrapper<W> {
    protected SeekBar mView;

    public SeekBarWrapper(SeekBar view) {
        super(view);
        mView = view;
    }

    /**
    * @see SeekBar#setOnSeekBarChangeListener(OnSeekBarChangeListener)
    */
     public W setOnSeekBarChangeListener(OnSeekBarChangeListener l) {
         mView.setOnSeekBarChangeListener(l);
         return (W) this;
     }

}