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
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

@SuppressWarnings("unchecked")
public class ExpandableListViewWrapper<W extends ExpandableListViewWrapper<W>> extends ListViewWrapper<W> {
    protected ExpandableListView mView;

    public ExpandableListViewWrapper(ExpandableListView view) {
        super(view);
        mView = view;
    }

    /**
    * @see ExpandableListView#setGroupIndicator(Drawable)
    */
     public W setGroupIndicator(Drawable groupIndicator) {
         mView.setGroupIndicator(groupIndicator);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setChildIndicator(Drawable)
    */
     public W setChildIndicator(Drawable childIndicator) {
         mView.setChildIndicator(childIndicator);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setIndicatorBounds(int, int)
    */
     public W setIndicatorBounds(int left, int right) {
         mView.setIndicatorBounds(left, right);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setChildIndicatorBounds(int, int)
    */
     public W setChildIndicatorBounds(int left, int right) {
         mView.setChildIndicatorBounds(left, right);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setOnGroupCollapseListener(OnGroupCollapseListener)
    */
     public W setOnGroupCollapseListener(OnGroupCollapseListener onGroupCollapseListener) {
         mView.setOnGroupCollapseListener(onGroupCollapseListener);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setOnGroupExpandListener(OnGroupExpandListener)
    */
     public W setOnGroupExpandListener(OnGroupExpandListener onGroupExpandListener) {
         mView.setOnGroupExpandListener(onGroupExpandListener);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setOnChildClickListener(OnChildClickListener)
    */
     public W setOnChildClickListener(OnChildClickListener onChildClickListener) {
         mView.setOnChildClickListener(onChildClickListener);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setOnGroupClickListener(OnGroupClickListener)
    */
     public W setOnGroupClickListener(OnGroupClickListener onGroupClickListener) {
         mView.setOnGroupClickListener(onGroupClickListener);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setAdapter(ExpandableListAdapter)
    */
     public W setAdapter(ExpandableListAdapter adapter) {
         mView.setAdapter(adapter);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setChildDivider(Drawable)
    */
     public W setChildDivider(Drawable childDivider) {
         mView.setChildDivider(childDivider);
         return (W) this;
     }

    /**
    * @see ExpandableListView#setSelectedGroup(int)
    */
     public W setSelectedGroup(int groupPosition) {
         mView.setSelectedGroup(groupPosition);
         return (W) this;
     }

}