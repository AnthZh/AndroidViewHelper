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
package com.anthzh.tool.viewhelper;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.anthzh.tool.viewhelper.helper.AbsListViewHelper;
import com.anthzh.tool.viewhelper.helper.AbsSeekBarHelper;
import com.anthzh.tool.viewhelper.helper.AbsSpinnerHelper;
import com.anthzh.tool.viewhelper.helper.AdapterViewHelper;
import com.anthzh.tool.viewhelper.helper.ButtonHelper;
import com.anthzh.tool.viewhelper.helper.CheckBoxHelper;
import com.anthzh.tool.viewhelper.helper.CheckedTextViewHelper;
import com.anthzh.tool.viewhelper.helper.CompoundButtonHelper;
import com.anthzh.tool.viewhelper.helper.EditTextHelper;
import com.anthzh.tool.viewhelper.helper.ExpandableListViewHelper;
import com.anthzh.tool.viewhelper.helper.FrameLayoutHelper;
import com.anthzh.tool.viewhelper.helper.GridViewHelper;
import com.anthzh.tool.viewhelper.helper.HorizontalScrollViewHelper;
import com.anthzh.tool.viewhelper.helper.LinearLayoutHelper;
import com.anthzh.tool.viewhelper.helper.ListViewHelper;
import com.anthzh.tool.viewhelper.helper.ProgressBarHelper;
import com.anthzh.tool.viewhelper.helper.RadioButtonHelper;
import com.anthzh.tool.viewhelper.helper.RadioGroupHelper;
import com.anthzh.tool.viewhelper.helper.RatingBarHelper;
import com.anthzh.tool.viewhelper.helper.RelativeLayoutHelper;
import com.anthzh.tool.viewhelper.helper.ScrollViewHelper;
import com.anthzh.tool.viewhelper.helper.SeekBarHelper;
import com.anthzh.tool.viewhelper.helper.SpinnerHelper;
import com.anthzh.tool.viewhelper.helper.SwitchHelper;
import com.anthzh.tool.viewhelper.helper.TableLayoutHelper;
import com.anthzh.tool.viewhelper.helper.TextViewHelper;
import com.anthzh.tool.viewhelper.helper.ToggleButtonHelper;
import com.anthzh.tool.viewhelper.helper.ViewGroupHelper;
import com.anthzh.tool.viewhelper.helper.ViewHelper;


public class AndroidViewHelper {

    private AndroidViewHelper() {
        throw new RuntimeException("can not be instance!");
    }

    @SuppressWarnings("unchecked")
    private static <T extends View> T findView(@NonNull View view, @IdRes int viewId) {
        T tView = (T) view.findViewById(viewId);
        String idName = view.getResources().getResourceName(viewId);
        if (tView == null) {
            throw new RuntimeException("can not find " + idName + "in the view!");
        }
        return tView;
    }

    @SuppressWarnings("unchecked")
    private static <T extends View> T findView(@NonNull Activity activity, @IdRes int viewId) {
        T tView = (T) activity.findViewById(viewId);
        String idName = activity.getResources().getResourceName(viewId);
        if (tView == null) {
            throw new RuntimeException("can not find " + idName + "in the view!");
        }
        return tView;
    }

    public static ViewHelper view(@NonNull Activity activity, @IdRes int viewId) {
        return new ViewHelper(findView(activity, viewId));
    }

    public static ViewHelper view(@NonNull View view, @IdRes int viewId) {
        return new ViewHelper(findView(view, viewId));
    }

    public static TextViewHelper textView(@NonNull Activity activity, @IdRes int viewId) {
        return new TextViewHelper((TextView) findView(activity, viewId));
    }

    public static TextViewHelper textView(@NonNull View view, @IdRes int viewId) {
        return new TextViewHelper((TextView) findView(view, viewId));
    }

    public static EditTextHelper editText(@NonNull Activity activity, @IdRes int
            viewId) {
        return new EditTextHelper((EditText) findView(activity, viewId));
    }

    public static EditTextHelper editText(@NonNull View view, @IdRes int
            viewId) {
        return new EditTextHelper((EditText) findView(view, viewId));
    }

    public static ButtonHelper button(@NonNull Activity activity, @IdRes int viewId) {
        return new ButtonHelper((Button) findView(activity, viewId));
    }

    public static ButtonHelper button(@NonNull View view, @IdRes int viewId) {
        return new ButtonHelper((Button) findView(view, viewId));
    }

    public static CompoundButtonHelper compoundButton(@NonNull Activity activity, @IdRes int viewId) {
        return new CompoundButtonHelper((CompoundButton) findView(activity, viewId));
    }

    public static CompoundButtonHelper compoundButton(@NonNull View view, @IdRes int viewId) {
        return new CompoundButtonHelper((CompoundButton) findView(view, viewId));
    }

    public static ToggleButtonHelper toggleButton(@NonNull Activity activity, @IdRes int viewId) {
        return new ToggleButtonHelper((ToggleButton) findView(activity, viewId));
    }

    public static ToggleButtonHelper toggleButton(@NonNull View view, @IdRes int viewId) {
        return new ToggleButtonHelper((ToggleButton) findView(view, viewId));
    }

    public static CheckBoxHelper checkBox(@NonNull Activity activity, @IdRes int viewId) {
        return new CheckBoxHelper((CheckBox) findView(activity, viewId));
    }

    public static CheckBoxHelper checkBox(@NonNull View view, @IdRes int viewId) {
        return new CheckBoxHelper((CheckBox) findView(view, viewId));
    }

    public static RadioButtonHelper radioButton(@NonNull Activity activity, @IdRes int viewId) {
        return new RadioButtonHelper((RadioButton) findView(activity, viewId));
    }

    public static RadioButtonHelper radioButton(@NonNull View view, @IdRes int viewId) {
        return new RadioButtonHelper((RadioButton) findView(view, viewId));
    }

    public static CheckedTextViewHelper checkedTextView(@NonNull Activity activity, @IdRes int viewId) {
        return new CheckedTextViewHelper((CheckedTextView) findView(activity, viewId));
    }

    public static CheckedTextViewHelper checkedTextView(@NonNull View view, @IdRes int viewId) {
        return new CheckedTextViewHelper((CheckedTextView) findView(view, viewId));
    }

    public static AbsSpinnerHelper absSpinner(@NonNull Activity activity, @IdRes int viewId) {
        return new AbsSpinnerHelper((AbsSpinner) findView(activity, viewId));
    }

    public static AbsSpinnerHelper absSpinner(@NonNull View view, @IdRes int viewId) {
        return new AbsSpinnerHelper((AbsSpinner) findView(view, viewId));
    }

    public static SpinnerHelper spinner(@NonNull Activity activity, @IdRes int viewId) {
        return new SpinnerHelper((Spinner) findView(activity, viewId));
    }

    public static SpinnerHelper spinner(@NonNull View view, @IdRes int viewId) {
        return new SpinnerHelper((Spinner) findView(view, viewId));
    }

    public static ProgressBarHelper progressBar(@NonNull Activity activity, @IdRes int viewId) {
        return new ProgressBarHelper((ProgressBar) findView(activity, viewId));
    }

    public static ProgressBarHelper progressBar(@NonNull View view, @IdRes int viewId) {
        return new ProgressBarHelper((ProgressBar) findView(view, viewId));
    }

    public static AbsSeekBarHelper absSeekBar(@NonNull Activity activity, @IdRes int viewId) {
        return new AbsSeekBarHelper((AbsSeekBar) findView(activity, viewId));
    }

    public static AbsSeekBarHelper absSeekBar(@NonNull View view, @IdRes int viewId) {
        return new AbsSeekBarHelper((AbsSeekBar) findView(view, viewId));
    }

    public static SeekBarHelper seekBar(@NonNull Activity activity, @IdRes int viewId) {
        return new SeekBarHelper((SeekBar) findView(activity, viewId));
    }

    public static SeekBarHelper seekBar(@NonNull View view, @IdRes int viewId) {
        return new SeekBarHelper((SeekBar) findView(view, viewId));
    }

    public static RatingBarHelper ratingBar(@NonNull Activity activity, @IdRes int viewId) {
        return new RatingBarHelper((RatingBar) findView(activity, viewId));
    }

    public static RatingBarHelper ratingBar(@NonNull View view, @IdRes int viewId) {
        return new RatingBarHelper((RatingBar) findView(view, viewId));
    }

    public static SwitchHelper switchView(@NonNull Activity activity, @IdRes int viewId) {
        return new SwitchHelper((Switch) findView(activity, viewId));
    }

    public static SwitchHelper switchView(@NonNull View view, @IdRes int viewId) {
        return new SwitchHelper((Switch) findView(view, viewId));
    }

    public static AdapterViewHelper adapterView(@NonNull Activity activity, @IdRes int viewId) {
        return new AdapterViewHelper((AdapterView) findView(activity, viewId));
    }

    public static AdapterViewHelper adapterView(@NonNull View view, @IdRes int viewId) {
        return new AdapterViewHelper((AdapterView) findView(view, viewId));
    }

    public static AbsListViewHelper absListView(@NonNull Activity activity, @IdRes int viewId) {
        return new AbsListViewHelper((AbsListView) findView(activity, viewId));
    }

    public static AbsListViewHelper absListView(@NonNull View view, @IdRes int viewId) {
        return new AbsListViewHelper((AbsListView) findView(view, viewId));
    }

    public static ListViewHelper listView(@NonNull Activity activity, @IdRes int viewId) {
        return new ListViewHelper((ListView) findView(activity, viewId));
    }

    public static ListViewHelper listView(@NonNull View view, @IdRes int viewId) {
        return new ListViewHelper((ListView) findView(view, viewId));
    }

    public static GridViewHelper gridView(@NonNull Activity activity, @IdRes int viewId) {
        return new GridViewHelper((GridView) findView(activity, viewId));
    }

    public static GridViewHelper gridView(@NonNull View view, @IdRes int viewId) {
        return new GridViewHelper((GridView) findView(view, viewId));
    }

    public static ExpandableListViewHelper expandableListView(@NonNull Activity activity, @IdRes int viewId) {
        return new ExpandableListViewHelper((ExpandableListView) findView(activity, viewId));
    }

    public static ExpandableListViewHelper expandableListView(@NonNull View view, @IdRes int viewId) {
        return new ExpandableListViewHelper((ExpandableListView) findView(view, viewId));
    }

    public static ScrollViewHelper scrollView(@NonNull Activity activity, @IdRes int viewId) {
        return new ScrollViewHelper((ScrollView) findView(activity, viewId));
    }

    public static ScrollViewHelper scrollView(@NonNull View view, @IdRes int viewId) {
        return new ScrollViewHelper((ScrollView) findView(view, viewId));
    }

    public static HorizontalScrollViewHelper horizontalScrollView(@NonNull Activity activity, @IdRes int viewId) {
        return new HorizontalScrollViewHelper((HorizontalScrollView) findView(activity, viewId));
    }

    public static HorizontalScrollViewHelper horizontalScrollView(@NonNull View view, @IdRes int viewId) {
        return new HorizontalScrollViewHelper((HorizontalScrollView) findView(view, viewId));
    }

    public static ViewGroupHelper viewGroup(@NonNull Activity activity, @IdRes int viewId) {
        return new ViewGroupHelper((ViewGroup) findView(activity, viewId));
    }

    public static ViewGroupHelper viewGroup(@NonNull View view, @IdRes int viewId) {
        return new ViewGroupHelper((ViewGroup) findView(view, viewId));
    }

    public static FrameLayoutHelper frameLayout(@NonNull Activity activity, @IdRes int viewId) {
        return new FrameLayoutHelper((FrameLayout) findView(activity, viewId));
    }

    public static FrameLayoutHelper frameLayout(@NonNull View view, @IdRes int viewId) {
        return new FrameLayoutHelper((FrameLayout) findView(view, viewId));
    }

    public static LinearLayoutHelper linearLayout(@NonNull Activity activity, @IdRes int viewId) {
        return new LinearLayoutHelper((LinearLayout) findView(activity, viewId));
    }

    public static LinearLayoutHelper linearLayout(@NonNull View view, @IdRes int viewId) {
        return new LinearLayoutHelper((LinearLayout) findView(view, viewId));
    }

    public static RelativeLayoutHelper relativeLayout(@NonNull Activity activity, @IdRes int viewId) {
        return new RelativeLayoutHelper((RelativeLayout) findView(activity, viewId));
    }

    public static RelativeLayoutHelper relativeLayout(@NonNull View view, @IdRes int viewId) {
        return new RelativeLayoutHelper((RelativeLayout) findView(view, viewId));
    }

    public static TableLayoutHelper tableLayout(@NonNull Activity activity, @IdRes int viewId) {
        return new TableLayoutHelper((TableLayout) findView(activity, viewId));
    }

    public static TableLayoutHelper tableLayout(@NonNull View view, @IdRes int viewId) {
        return new TableLayoutHelper((TableLayout) findView(view, viewId));
    }

    public static RadioGroupHelper radioGroup(@NonNull Activity activity, @IdRes int viewId) {
        return new RadioGroupHelper((RadioGroup) findView(activity, viewId));
    }

    public static RadioGroupHelper radioGroup(@NonNull View view, @IdRes int viewId) {
        return new RadioGroupHelper((RadioGroup) findView(view, viewId));
    }


}