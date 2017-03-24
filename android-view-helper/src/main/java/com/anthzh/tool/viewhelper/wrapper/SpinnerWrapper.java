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

import android.widget.Spinner;

@SuppressWarnings("unchecked")
public class SpinnerWrapper<W extends SpinnerWrapper<W>> extends AbsSpinnerWrapper<W> {
    protected Spinner mView;

    public SpinnerWrapper(Spinner view) {
        super(view);
        mView = view;
    }

    /**
    * @see Spinner#setPromptId(int)
    */
     public W setPromptId(int promptId) {
         mView.setPromptId(promptId);
         return (W) this;
     }

    /**
    * @see Spinner#setGravity(int)
    */
     public W setGravity(int gravity) {
         mView.setGravity(gravity);
         return (W) this;
     }

    /**
    * @see Spinner#setPrompt(CharSequence)
    */
     public W setPrompt(CharSequence prompt) {
         mView.setPrompt(prompt);
         return (W) this;
     }

}