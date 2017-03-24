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

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.MultiChoiceModeListener;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView.RecyclerListener;
import android.widget.ListAdapter;

import java.util.List;

@SuppressWarnings("unchecked")
public class AbsListViewWrapper<W extends AbsListViewWrapper<W>> extends AdapterViewWrapper<W> {
    protected AbsListView mView;

    public AbsListViewWrapper(AbsListView view) {
        super(view);
        mView = view;
    }

    /**
    * @see AbsListView#setOnScrollListener(OnScrollListener)
    */
     public W setOnScrollListener(OnScrollListener l) {
         mView.setOnScrollListener(l);
         return (W) this;
     }

    /**
    * @see AbsListView#smoothScrollToPositionFromTop(int, int)
    */
     public W smoothScrollToPositionFromTop(int position, int offset) {
         mView.smoothScrollToPositionFromTop(position, offset);
         return (W) this;
     }

    /**
    * @see AbsListView#smoothScrollToPositionFromTop(int, int, int)
    */
     public W smoothScrollToPositionFromTop(int position, int offset, int duration) {
         mView.smoothScrollToPositionFromTop(position, offset, duration);
         return (W) this;
     }

    /**
    * @see AbsListView#setSmoothScrollbarEnabled(boolean)
    */
     public W setSmoothScrollbarEnabled(boolean enabled) {
         mView.setSmoothScrollbarEnabled(enabled);
         return (W) this;
     }

    /**
    * @see AbsListView#setScrollIndicators(View, View)
    */
     public W setScrollIndicators(View up, View down) {
         mView.setScrollIndicators(up, down);
         return (W) this;
     }

    /**
    * @see AbsListView#setRecyclerListener(RecyclerListener)
    */
     public W setRecyclerListener(RecyclerListener listener) {
         mView.setRecyclerListener(listener);
         return (W) this;
     }

    /**
    * @see AbsListView#setCacheColorHint(int)
    */
     public W setCacheColorHint(int color) {
         mView.setCacheColorHint(color);
         return (W) this;
     }

    /**
    * @see AbsListView#setFastScrollAlwaysVisible(boolean)
    */
     public W setFastScrollAlwaysVisible(boolean alwaysShow) {
         mView.setFastScrollAlwaysVisible(alwaysShow);
         return (W) this;
     }

    /**
    * @see AbsListView#setFastScrollEnabled(boolean)
    */
     public W setFastScrollEnabled(boolean enabled) {
         mView.setFastScrollEnabled(enabled);
         return (W) this;
     }

    /**
    * @see AbsListView#setTranscriptMode(int)
    */
     public W setTranscriptMode(int mode) {
         mView.setTranscriptMode(mode);
         return (W) this;
     }

    /**
    * @see AbsListView#beforeTextChanged(CharSequence, int, int, int)
    */
     public W beforeTextChanged(CharSequence s, int start, int count, int after) {
         mView.beforeTextChanged(s, start, count, after);
         return (W) this;
     }

    /**
    * @see AbsListView#setDrawSelectorOnTop(boolean)
    */
     public W setDrawSelectorOnTop(boolean onTop) {
         mView.setDrawSelectorOnTop(onTop);
         return (W) this;
     }

    /**
    * @see AbsListView#setMultiChoiceModeListener(MultiChoiceModeListener)
    */
     public W setMultiChoiceModeListener(MultiChoiceModeListener listener) {
         mView.setMultiChoiceModeListener(listener);
         return (W) this;
     }

    /**
    * @see AbsListView#setScrollingCacheEnabled(boolean)
    */
     public W setScrollingCacheEnabled(boolean enabled) {
         mView.setScrollingCacheEnabled(enabled);
         return (W) this;
     }

    /**
    * @see AbsListView#setRemoteViewsAdapter(Intent)
    */
     public W setRemoteViewsAdapter(Intent intent) {
         mView.setRemoteViewsAdapter(intent);
         return (W) this;
     }

    /**
    * @see AbsListView#setStackFromBottom(boolean)
    */
     public W setStackFromBottom(boolean stackFromBottom) {
         mView.setStackFromBottom(stackFromBottom);
         return (W) this;
     }

    /**
    * @see AbsListView#smoothScrollToPosition(int, int)
    */
     public W smoothScrollToPosition(int position, int boundPosition) {
         mView.smoothScrollToPosition(position, boundPosition);
         return (W) this;
     }

    /**
    * @see AbsListView#smoothScrollToPosition(int)
    */
     public W smoothScrollToPosition(int position) {
         mView.smoothScrollToPosition(position);
         return (W) this;
     }

    /**
    * @see AbsListView#deferNotifyDataSetChanged()
    */
     public W deferNotifyDataSetChanged() {
         mView.deferNotifyDataSetChanged();
         return (W) this;
     }

    /**
    * @see AbsListView#setTextFilterEnabled(boolean)
    */
     public W setTextFilterEnabled(boolean textFilterEnabled) {
         mView.setTextFilterEnabled(textFilterEnabled);
         return (W) this;
     }

    /**
    * @see AbsListView#setFriction(float)
    */
     public W setFriction(float friction) {
         mView.setFriction(friction);
         return (W) this;
     }

    /**
    * @see AbsListView#invalidateViews()
    */
     public W invalidateViews() {
         mView.invalidateViews();
         return (W) this;
     }

    /**
    * @see AbsListView#smoothScrollBy(int, int)
    */
     public W smoothScrollBy(int distance, int duration) {
         mView.smoothScrollBy(distance, duration);
         return (W) this;
     }

    /**
    * @see AbsListView#reclaimViews(List)
    */
     public W reclaimViews(List views) {
         mView.reclaimViews(views);
         return (W) this;
     }

    /**
    * @see AbsListView#clearTextFilter()
    */
     public W clearTextFilter() {
         mView.clearTextFilter();
         return (W) this;
     }

    /**
    * @see AbsListView#afterTextChanged(Editable)
    */
     public W afterTextChanged(Editable s) {
         mView.afterTextChanged(s);
         return (W) this;
     }

    /**
    * @see AbsListView#setSelector(Drawable)
    */
     public W setSelector(Drawable sel) {
         mView.setSelector(sel);
         return (W) this;
     }

    /**
    * @see AbsListView#setSelector(int)
    */
     public W setSelector(int resID) {
         mView.setSelector(resID);
         return (W) this;
     }

    /**
    * @see AbsListView#setVelocityScale(float)
    */
     public W setVelocityScale(float scale) {
         mView.setVelocityScale(scale);
         return (W) this;
     }

    /**
    * @see AbsListView#setAdapter(ListAdapter)
    */
     public W setAdapter(ListAdapter adapter) {
         mView.setAdapter(adapter);
         return (W) this;
     }

    /**
    * @see AbsListView#setItemChecked(int, boolean)
    */
     public W setItemChecked(int position, boolean value) {
         mView.setItemChecked(position, value);
         return (W) this;
     }

    /**
    * @see AbsListView#clearChoices()
    */
     public W clearChoices() {
         mView.clearChoices();
         return (W) this;
     }

    /**
    * @see AbsListView#setChoiceMode(int)
    */
     public W setChoiceMode(int choiceMode) {
         mView.setChoiceMode(choiceMode);
         return (W) this;
     }

    /**
    * @see AbsListView#setFilterText(String)
    */
     public W setFilterText(String filterText) {
         mView.setFilterText(filterText);
         return (W) this;
     }

}