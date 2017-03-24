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
package com.anthzh.tool.viewhelper.helper;

import android.widget.GridView;

import com.anthzh.tool.viewhelper.wrapper.GridViewWrapper;

public class GridViewHelper extends GridViewWrapper<GridViewHelper> {

    public GridViewHelper(GridView view) {
        super(view);
    }

    public GridView getView(){
    return mView;
    }
}
