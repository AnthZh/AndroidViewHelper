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

import android.widget.RelativeLayout;

@SuppressWarnings("unchecked")
public class RelativeLayoutWrapper<W extends RelativeLayoutWrapper<W>> extends ViewGroupWrapper<W> {
    protected RelativeLayout mView;

    public RelativeLayoutWrapper(RelativeLayout view) {
        super(view);
        mView = view;
    }

    /**
    * @see RelativeLayout#setHorizontalGravity(int)
    */
     public W setHorizontalGravity(int horizontalGravity) {
         mView.setHorizontalGravity(horizontalGravity);
         return (W) this;
     }

    /**
    * @see RelativeLayout#setVerticalGravity(int)
    */
     public W setVerticalGravity(int verticalGravity) {
         mView.setVerticalGravity(verticalGravity);
         return (W) this;
     }

    /**
    * @see RelativeLayout#setGravity(int)
    */
     public W setGravity(int gravity) {
         mView.setGravity(gravity);
         return (W) this;
     }

    /**
    * @see RelativeLayout#setIgnoreGravity(int)
    */
     public W setIgnoreGravity(int viewId) {
         mView.setIgnoreGravity(viewId);
         return (W) this;
     }

}